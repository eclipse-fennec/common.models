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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.Point;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests that the computed {@code data} and {@code bbox} attributes do not break the generic EMF
 * equality, copy and XMI handling of geometries, see issue #27.
 */
class GeoJsonEqualityTest {

	private static final double[][] RING = { { 0.0, 0.0 }, { 1.0, 0.0 }, { 1.0, 1.0 }, { 0.0, 0.0 } };

	static Stream<Arguments> geometries() {
		GeoJsonPackage p = GeoJsonPackage.eINSTANCE;
		return Stream.of(
				Arguments.of(p.getPoint(), new double[] { 11.58, 50.92 }, new double[] { 11.58, 50.93 }),
				Arguments.of(p.getMultiPoint(), List.of(RING[0], RING[1]), List.of(RING[0], RING[2])),
				Arguments.of(p.getLineString(), List.of(RING[0], RING[1]), List.of(RING[0], RING[2])),
				Arguments.of(p.getPolygon(), new double[][][] { RING }, new double[][][] { { RING[0], RING[2], RING[1], RING[0] } }),
				Arguments.of(p.getMultiLineString(), new double[][][] { { RING[0], RING[1] } }, new double[][][] { { RING[0], RING[2] } }),
				Arguments.of(p.getMultiPolygon(), new double[][][][] { { RING } }, new double[][][][] { { { RING[0], RING[2], RING[1], RING[0] } } }));
	}

	private static EObject geometry(EClass eClass, Object data) {
		EObject geometry = GeoJsonFactory.eINSTANCE.create(eClass);
		geometry.eSet(eClass.getEStructuralFeature("data"), data);
		return geometry;
	}

	@ParameterizedTest
	@MethodSource("geometries")
	void copy_isEqual(EClass eClass, Object data, Object otherData) {
		EObject geometry = geometry(eClass, data);

		assertThat(EcoreUtil.equals(geometry, EcoreUtil.copy(geometry))).isTrue();
	}

	@ParameterizedTest
	@MethodSource("geometries")
	void differentCoordinates_areNotEqual(EClass eClass, Object data, Object otherData) {
		assertThat(EcoreUtil.equals(geometry(eClass, data), geometry(eClass, otherData))).isFalse();
	}

	@ParameterizedTest
	@MethodSource("geometries")
	void xmiRoundTrip_isEqual(EClass eClass, Object data, Object otherData) throws Exception {
		EObject geometry = geometry(eClass, data);
		Resource out = new XMIResourceImpl(URI.createURI("geometry.xmi"));
		out.getContents().add(EcoreUtil.copy(geometry));
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		out.save(bytes, null);

		Resource in = new XMIResourceImpl(URI.createURI("geometry.xmi"));
		in.load(new ByteArrayInputStream(bytes.toByteArray()), null);

		assertThat(EcoreUtil.equals(geometry, in.getContents().get(0))).isTrue();
	}

	@Test
	void copyWithBoundingBox_isEqual() {
		Point point = (Point) geometry(GeoJsonPackage.eINSTANCE.getPoint(), new double[] { 11.58, 50.92 });
		point.setBoundingBox(GeoJsonHelper.convertToBoundingBox(new double[] { 11.0, 50.0, 12.0, 51.0 }));

		assertThat(EcoreUtil.equals(point, EcoreUtil.copy(point))).isTrue();
	}
}
