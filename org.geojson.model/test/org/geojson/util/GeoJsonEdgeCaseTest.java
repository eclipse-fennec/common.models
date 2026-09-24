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
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.util.List;

import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests the edge cases of {@link GeoJsonHelper} from issue #36: empty and invalid positions,
 * replacing {@code data} and invalid bbox lengths.
 */
class GeoJsonEdgeCaseTest {

	private static final double[][] RING = { { 0.0, 0.0 }, { 1.0, 0.0 }, { 1.0, 1.0 }, { 0.0, 0.0 } };
	private static final double[][] HOLE = { { 0.2, 0.2 }, { 0.8, 0.2 }, { 0.8, 0.8 }, { 0.2, 0.2 } };

	// 1. positions

	@Test
	void emptyPoint_hasEmptyCoordinates() {
		Point point = GeoJsonFactory.eINSTANCE.createPoint();
		point.eSet(GeoJsonPackage.Literals.POINT__DATA, new double[0]);

		assertThat(point.getCoordinates()).isNull();
		assertThat((double[]) point.eGet(GeoJsonPackage.Literals.POINT__DATA)).isEmpty();
	}

	@Test
	void positionWithOneElement_isRejected() {
		assertThatIllegalArgumentException().isThrownBy(() -> GeoJsonHelper.toCoordinates(new double[] { 1.5 }))
				.withMessageContaining("at least two elements");
	}

	@Test
	void emptyPositionInLineString_isRejected() {
		LineString line = GeoJsonFactory.eINSTANCE.createLineString();

		assertThatIllegalArgumentException()
				.isThrownBy(() -> line.eSet(GeoJsonPackage.Literals.SIMPLE_LINE_STRING__DATA, List.of(new double[] { 1.5, 2.5 }, new double[0])))
				.withMessageContaining("empty position");
	}

	@Test
	void emptyPositionInMultiPoint_isRejected() {
		MultiPoint multiPoint = GeoJsonFactory.eINSTANCE.createMultiPoint();

		assertThatIllegalArgumentException()
				.isThrownBy(() -> multiPoint.eSet(GeoJsonPackage.Literals.MULTI_POINT__DATA, List.of(new double[0])))
				.withMessageContaining("empty position");
	}

	@Test
	void emptyPositionInMultiLineString_isRejected() {
		MultiLineString multiLineString = GeoJsonFactory.eINSTANCE.createMultiLineString();

		assertThatIllegalArgumentException()
				.isThrownBy(() -> multiLineString.eSet(GeoJsonPackage.Literals.MULTI_LINE_STRING__DATA, new double[][][] { { { 1.5, 2.5 }, {} } }))
				.withMessageContaining("empty position");
	}

	@Test
	void emptyPositionInRing_isRejected() {
		assertThatIllegalArgumentException().isThrownBy(() -> GeoJsonHelper.toRing(new double[][] { { 1.5, 2.5 }, {} }))
				.withMessageContaining("empty position");
	}

	// 2. setData replaces

	@Test
	void polygonSetDataTwice_replaces() {
		Polygon polygon = GeoJsonFactory.eINSTANCE.createPolygon();
		double[][][] data = { RING, HOLE };
		polygon.eSet(GeoJsonPackage.Literals.SIMPLE_POLYGON__DATA, data);
		polygon.eSet(GeoJsonPackage.Literals.SIMPLE_POLYGON__DATA, data);

		assertThat(polygon.getInteriorHoles()).hasSize(1);
		assertThat((double[][][]) polygon.eGet(GeoJsonPackage.Literals.SIMPLE_POLYGON__DATA)).isEqualTo(data);
	}

	@Test
	void multiPolygonSetDataTwice_replaces() {
		MultiPolygon multiPolygon = GeoJsonFactory.eINSTANCE.createMultiPolygon();
		double[][][][] data = { { RING } };
		multiPolygon.eSet(GeoJsonPackage.Literals.MULTI_POLYGON__DATA, data);
		multiPolygon.eSet(GeoJsonPackage.Literals.MULTI_POLYGON__DATA, data);

		assertThat(multiPolygon.getPolygons()).hasSize(1);
	}

	@Test
	void multiLineStringSetDataTwice_replaces() {
		MultiLineString multiLineString = GeoJsonFactory.eINSTANCE.createMultiLineString();
		double[][][] data = { { RING[0], RING[1] } };
		multiLineString.eSet(GeoJsonPackage.Literals.MULTI_LINE_STRING__DATA, data);
		multiLineString.eSet(GeoJsonPackage.Literals.MULTI_LINE_STRING__DATA, data);

		assertThat(multiLineString.getLinesStrings()).hasSize(1);
	}

	@Test
	void unsetData_clears() {
		Polygon polygon = GeoJsonFactory.eINSTANCE.createPolygon();
		polygon.eSet(GeoJsonPackage.Literals.SIMPLE_POLYGON__DATA, new double[][][] { RING, HOLE });
		polygon.eUnset(GeoJsonPackage.Literals.SIMPLE_POLYGON__DATA);
		assertThat(polygon.getExteriorRing()).isNull();
		assertThat(polygon.getInteriorHoles()).isEmpty();

		MultiPolygon multiPolygon = GeoJsonFactory.eINSTANCE.createMultiPolygon();
		multiPolygon.eSet(GeoJsonPackage.Literals.MULTI_POLYGON__DATA, new double[][][][] { { RING } });
		multiPolygon.eUnset(GeoJsonPackage.Literals.MULTI_POLYGON__DATA);
		assertThat(multiPolygon.getPolygons()).isEmpty();

		MultiLineString multiLineString = GeoJsonFactory.eINSTANCE.createMultiLineString();
		multiLineString.eSet(GeoJsonPackage.Literals.MULTI_LINE_STRING__DATA, new double[][][] { { RING[0], RING[1] } });
		multiLineString.eUnset(GeoJsonPackage.Literals.MULTI_LINE_STRING__DATA);
		assertThat(multiLineString.getLinesStrings()).isEmpty();
	}

	// 3. bbox lengths

	@ParameterizedTest
	@ValueSource(ints = { 0, 2, 3, 5, 8 })
	void bboxWithInvalidLength_isRejected(int length) {
		assertThatIllegalArgumentException().isThrownBy(() -> GeoJsonHelper.convertToBoundingBox(new double[length]))
				.withMessageContaining("RFC 7946 §5");
	}

	@ParameterizedTest
	@ValueSource(ints = { 4, 6 })
	void bboxWithValidLength_roundTrips(int length) {
		double[] bbox = new double[length];
		for (int i = 0; i < length; i++) {
			bbox[i] = i + 1.5;
		}

		assertThat(GeoJsonHelper.convertBoundingBox(GeoJsonHelper.convertToBoundingBox(bbox))).containsExactly(bbox);
	}
}
