/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.geojson.util;

import java.util.Arrays;
import java.util.List;

import org.geojson.BoundingBox;
import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.Hole;
import org.geojson.MultiLineString;
import org.geojson.MultiPolygon;
import org.geojson.Ring;
import org.geojson.SimpleLineString;
import org.geojson.SimplePolygon;
import org.geojson.impl.CoordinatesImpl;
import org.geojson.impl.SimpleLineStringImpl;
import org.geojson.impl.SimplePolygonImpl;

/**
 * 
 * @author Juergen Albert
 * @since 29 Nov 2024
 */
public class GeoJsonHelper {

	public static double[][][][] getMultiPolygonData(MultiPolygon multiPoygon) {
		double[][][][] result = new double[multiPoygon.getPolygons().size()][][][];
		for (int i = 0; i < multiPoygon.getPolygons().size(); i++) {
			SimplePolygonImpl polygon = (SimplePolygonImpl) multiPoygon.getPolygons().get(i);
			result[i] =  polygon.getData();
		}
		return result;
	}
	
	public static void setMultiPolygonData(MultiPolygon multiPoygon, double[][][][] data) {
		multiPoygon.getPolygons().clear();
		if (data == null) {
			return;
		}
		for (int i = 0; i < data.length; i++) {
			double[][][] d = data[i];
			SimplePolygonImpl polygon = (SimplePolygonImpl) GeoJsonFactory.eINSTANCE.createSimplePolygon();
			polygon.setData(d);
			multiPoygon.getPolygons().add(polygon);
		}
	}
	
	public static double[][][] getSimplePolygonData(SimplePolygon polygon) {
		if (polygon.getExteriorRing() == null && polygon.getInteriorHoles().isEmpty()) {
			// an empty geometry has an empty coordinates array (RFC 7946, section 3.1)
			return new double[0][][];
		}
		double[][][] result = new double[1 + polygon.getInteriorHoles().size()][][];
		result[0] = GeoJsonHelper.convertRing(polygon.getExteriorRing());
		for (int i = 0; i < polygon.getInteriorHoles().size(); i++) {
			Hole hole = polygon.getInteriorHoles().get(i);
			result[i + 1] = GeoJsonHelper.convertRing(hole);
		}
		return result;
	}

	public static void setSimplePolygonData(SimplePolygon polygon, double[][][] data) {
		polygon.setExteriorRing(null);
		polygon.getInteriorHoles().clear();
		if (data == null) {
			return;
		}
		for (int i = 0; i < data.length; i++) {
			double[][] d = data[i];
			if (i == 0) {
				polygon.setExteriorRing(GeoJsonHelper.toRing(d));
			} else {
				polygon.getInteriorHoles().add(GeoJsonHelper.toHole(d));
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static double[][][] getMultiLineStringData(MultiLineString multiLineString) {
		double[][][] result = new double[multiLineString.getLinesStrings().size()][][];
		for (int i = 0; i < multiLineString.getLinesStrings().size(); i++) {
			SimpleLineString line = multiLineString.getLinesStrings().get(i);
			result[i] = ((List<SimplePolygon>) line.eGet(GeoJsonPackage.Literals.SIMPLE_LINE_STRING__DATA)).toArray(new double[line.getCoordinates().size()][]);
		}
		return result;
	}

	public static double[] convertBoundingBox(BoundingBox bbox) {
		if(bbox == null) {
			return null;
		}
		double[] southwest = convertCoordinates(bbox.getSouthwest());
		double[] norhteast = convertCoordinates(bbox.getNortheast());
		double[] result = Arrays.copyOf(southwest, southwest.length + norhteast.length);
		if(result.length < 4) {
			throw new IllegalArgumentException("Southwest and northeast must both be set for a bounding box");
		}
		if(result.length % 2 != 0) {
			throw new IllegalArgumentException("Either both or none of the corners of a bounding box must have an elevation");
		}
		System.arraycopy(norhteast, 0, result, southwest.length, norhteast.length);
		return result;
	}

	public static BoundingBox convertToBoundingBox(double[] bbox) {
		if (bbox == null) {
			return null;
		}
		if (bbox.length != 4 && bbox.length != 6) {
			throw new IllegalArgumentException("A bbox needs 4 (2D) or 6 (3D) values (RFC 7946 §5), but has " + bbox.length);
		}
		BoundingBox boundingBox = GeoJsonFactory.eINSTANCE.createBoundingBox();
		boolean ignoreElevation = bbox.length == 4;
		double[] southwest = Arrays.copyOfRange(bbox, 0, ignoreElevation ? 2 : 3);
		double[] norhteast = Arrays.copyOfRange(bbox, ignoreElevation ? 2 : 3, bbox.length);
		boundingBox.setSouthwest(toCoordinates(southwest));
		boundingBox.setNortheast(toCoordinates(norhteast));
		return boundingBox;
	}
	
	public static void setMultiLineStringData(MultiLineString multiLineString, double[][][] data) {
		multiLineString.getLinesStrings().clear();
		if (data == null) {
			return;
		}
		for (int i = 0; i < data.length; i++) {
			double[][] d = data[i];
			SimpleLineStringImpl line = (SimpleLineStringImpl) GeoJsonFactory.eINSTANCE.createSimpleLineString();
			for (double[] e : d) {
				line.getData().add(e);
			}
			multiLineString.getLinesStrings().add(line);
		}
	}

	public static double[] convertCoordinates(Coordinates coordinates) {
		return convertCoordinates(coordinates, false);
	}

	public static double[] convertCoordinates(Coordinates coordinates, boolean ignoreElevation) {
		if (coordinates == null) {
			return new double[0];
		}
		double[] array = ignoreElevation || !coordinates.isSetElevation() || Double.isNaN(coordinates.getElevation())
				? new double[] { coordinates.getLongitude(), coordinates.getLatitude() }
				: new double[] { coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getElevation() };
		return array;
	}

	public static Coordinates toCoordinates(double[] data) {
		if (data == null || data.length == 0) {
			// an empty Point has empty coordinates (RFC 7946, section 3.1)
			return null;
		}
		if (data.length == 1) {
			throw new IllegalArgumentException("A position needs at least two elements (RFC 7946 §3.1.1)");
		}
		Coordinates c = new CoordinatesImpl();
		c.setLongitude(data[0]);
		c.setLatitude(data[1]);
		if (data.length >= 3) {
			c.setElevation(data[2]);
		}
		return c;
	}

	/**
	 * Converts a position inside a multi-position geometry (LineString, MultiPoint, rings), where,
	 * unlike for a Point, an empty position is not allowed.
	 */
	public static Coordinates toPosition(double[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("An empty position is not allowed inside a geometry, a position needs at least two elements (RFC 7946 §3.1.1)");
		}
		return toCoordinates(data);
	}

	public static double[][] convertRing(Ring ring) {
		if (ring == null || ring.getCoordinates().isEmpty()) {
			return new double[0][0];
		}
		boolean ringClosed = checkRingClosed(ring);
		int size = ringClosed ? ring.getCoordinates().size() : ring.getCoordinates().size() + 1;
		double[][] result = new double[size][2];

		for (int i = 0; i < ring.getCoordinates().size(); i++) {
			Coordinates coordinates = ring.getCoordinates().get(i);
			result[i] = convertCoordinates(coordinates);
		}
		if (!ringClosed) {
			Coordinates coordinates = ring.getCoordinates().get(0);
			result[ring.getCoordinates().size()] = convertCoordinates(coordinates);
		}

		return result;
	}

	public static boolean checkRingClosed(Ring ring) {
		Coordinates start = ring.getCoordinates().get(0);
		Coordinates end = ring.getCoordinates().get(ring.getCoordinates().size() - 1);
		return start.getLatitude() == end.getLatitude() && start.getLongitude() == end.getLongitude();
	}

	public static Ring toRing(double[][] data) {
		if (data == null) {
			return null;
		}
		Ring ring = GeoJsonFactory.eINSTANCE.createRing();
		for (int i = 0; i < data.length; i++) {
			ring.getCoordinates().add(toPosition(data[i]));
		}
		return ring;
	}

	public static Hole toHole(double[][] data) {
		if (data == null) {
			return null;
		}
		Hole hole = GeoJsonFactory.eINSTANCE.createHole();
		for (int i = 0; i < data.length; i++) {
			hole.getCoordinates().add(toPosition(data[i]));
		}
		return hole;
	}
}
