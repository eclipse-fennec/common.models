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

import static org.assertj.core.api.Assertions.assertThat;

import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Ring;
import org.geojson.SimplePolygon;
import org.junit.jupiter.api.Test;

/**
 * Tests the conversion of {@link GeoJsonHelper}, see issues #24, #25 and #34.
 */
class GeoJsonHelperTest {

	private static Coordinates coordinates(double longitude, double latitude) {
		Coordinates c = GeoJsonFactory.eINSTANCE.createCoordinates();
		c.setLongitude(longitude);
		c.setLatitude(latitude);
		return c;
	}

	private static Coordinates coordinates(double longitude, double latitude, double elevation) {
		Coordinates c = coordinates(longitude, latitude);
		c.setElevation(elevation);
		return c;
	}

	@Test
	void convertCoordinates_withoutElevation_isTwoDimensional() {
		assertThat(GeoJsonHelper.convertCoordinates(coordinates(11.58, 50.92))).containsExactly(11.58, 50.92);
	}

	@Test
	void convertCoordinates_withElevation_isThreeDimensional() {
		assertThat(GeoJsonHelper.convertCoordinates(coordinates(11.58, 50.92, 155.0))).containsExactly(11.58, 50.92, 155.0);
	}

	@Test
	void convertCoordinates_withExplicitZeroElevation_keepsElevation() {
		assertThat(GeoJsonHelper.convertCoordinates(coordinates(11.58, 50.92, 0.0))).containsExactly(11.58, 50.92, 0.0);
	}

	@Test
	void convertCoordinates_withNaNElevation_isTwoDimensional() {
		assertThat(GeoJsonHelper.convertCoordinates(coordinates(11.58, 50.92, Double.NaN))).containsExactly(11.58, 50.92);
	}

	@Test
	void convertCoordinates_ignoreElevation_isTwoDimensional() {
		assertThat(GeoJsonHelper.convertCoordinates(coordinates(11.58, 50.92, 155.0), true)).containsExactly(11.58, 50.92);
	}

	@Test
	void convertCoordinates_afterUnset_isTwoDimensional() {
		Coordinates c = coordinates(11.58, 50.92, 155.0);
		c.unsetElevation();
		assertThat(GeoJsonHelper.convertCoordinates(c)).containsExactly(11.58, 50.92);
	}

	@Test
	void toCoordinates_twoDimensional_leavesElevationUnset() {
		Coordinates c = GeoJsonHelper.toCoordinates(new double[] { 11.58, 50.92 });
		assertThat(c.isSetElevation()).isFalse();
		assertThat(GeoJsonHelper.convertCoordinates(c)).containsExactly(11.58, 50.92);
	}

	@Test
	void toCoordinates_threeDimensional_setsElevation() {
		Coordinates c = GeoJsonHelper.toCoordinates(new double[] { 11.58, 50.92, 0.0 });
		assertThat(c.isSetElevation()).isTrue();
		assertThat(GeoJsonHelper.convertCoordinates(c)).containsExactly(11.58, 50.92, 0.0);
	}

	@Test
	void pointData_roundTripKeepsDimension() {
		Point point2d = GeoJsonFactory.eINSTANCE.createPoint();
		point2d.eSet(GeoJsonPackage.Literals.POINT__DATA, new double[] { 11.58, 50.92 });
		assertThat((double[]) point2d.eGet(GeoJsonPackage.Literals.POINT__DATA)).containsExactly(11.58, 50.92);

		Point point3d = GeoJsonFactory.eINSTANCE.createPoint();
		point3d.eSet(GeoJsonPackage.Literals.POINT__DATA, new double[] { 11.58, 50.92, 155.0 });
		assertThat((double[]) point3d.eGet(GeoJsonPackage.Literals.POINT__DATA)).containsExactly(11.58, 50.92, 155.0);
	}

	@Test
	void convertRing_withElevation_keepsElevation() {
		Ring ring = GeoJsonFactory.eINSTANCE.createRing();
		ring.getCoordinates().add(coordinates(0.0, 0.0, 10.0));
		ring.getCoordinates().add(coordinates(1.0, 0.0, 20.0));
		ring.getCoordinates().add(coordinates(1.0, 1.0, 30.0));

		double[][] result = GeoJsonHelper.convertRing(ring);

		assertThat(result).hasDimensions(4, 3);
		assertThat(result[0]).containsExactly(0.0, 0.0, 10.0);
		assertThat(result[2]).containsExactly(1.0, 1.0, 30.0);
		// the unclosed ring is closed with the first position, including its elevation
		assertThat(result[3]).containsExactly(0.0, 0.0, 10.0);
	}

	@Test
	void convertRing_withoutElevation_isTwoDimensional() {
		Ring ring = GeoJsonFactory.eINSTANCE.createRing();
		ring.getCoordinates().add(coordinates(0.0, 0.0));
		ring.getCoordinates().add(coordinates(1.0, 0.0));
		ring.getCoordinates().add(coordinates(1.0, 1.0));
		ring.getCoordinates().add(coordinates(0.0, 0.0));

		assertThat(GeoJsonHelper.convertRing(ring)).hasDimensions(4, 2);
	}

	@Test
	void polygonData_roundTripKeepsElevation() {
		double[][][] data = { { { 0.0, 0.0, 10.0 }, { 1.0, 0.0, 20.0 }, { 1.0, 1.0, 30.0 }, { 0.0, 0.0, 10.0 } } };
		SimplePolygon polygon = GeoJsonFactory.eINSTANCE.createSimplePolygon();
		GeoJsonHelper.setSimplePolygonData(polygon, data);

		assertThat(GeoJsonHelper.getSimplePolygonData(polygon)).isEqualTo(data);
	}

	@Test
	void emptyPolygon_isEmptyArray() {
		SimplePolygon polygon = GeoJsonFactory.eINSTANCE.createSimplePolygon();

		assertThat(GeoJsonHelper.getSimplePolygonData(polygon)).isEmpty();
	}

	@Test
	void emptyPolygon_roundTripStaysEmpty() {
		SimplePolygon polygon = GeoJsonFactory.eINSTANCE.createSimplePolygon();
		GeoJsonHelper.setSimplePolygonData(polygon, new double[0][][]);

		assertThat(polygon.getExteriorRing()).isNull();
		assertThat(GeoJsonHelper.getSimplePolygonData(polygon)).isEmpty();
	}

	@Test
	void multiPolygonWithEmptyPolygon_containsEmptyArray() {
		MultiPolygon multiPolygon = GeoJsonFactory.eINSTANCE.createMultiPolygon();
		multiPolygon.getPolygons().add(GeoJsonFactory.eINSTANCE.createSimplePolygon());

		double[][][][] data = GeoJsonHelper.getMultiPolygonData(multiPolygon);

		assertThat(data).hasDimensions(1, 0);
	}
}
