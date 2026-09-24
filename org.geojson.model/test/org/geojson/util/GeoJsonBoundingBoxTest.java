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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.Point;
import org.junit.jupiter.api.Test;

/**
 * Tests that the bounding box of a GeoJSON object is optional (RFC 7946, section 5), see issue #32.
 */
class GeoJsonBoundingBoxTest {

	private static Point point() {
		Coordinates c = GeoJsonFactory.eINSTANCE.createCoordinates();
		c.setLongitude(1.5);
		c.setLatitude(2.5);
		Point point = GeoJsonFactory.eINSTANCE.createPoint();
		point.setCoordinates(c);
		return point;
	}

	@Test
	void withoutBoundingBox_isValid() {
		assertThat(Diagnostician.INSTANCE.validate(point()).getSeverity()).isEqualTo(Diagnostic.OK);
	}

	@Test
	void withoutBoundingBox_bboxIsNotSet() {
		Point point = point();

		assertThat(point.eIsSet(GeoJsonPackage.Literals.GEO_JSON_OBJECT__BBOX)).isFalse();
		assertThat(point.eGet(GeoJsonPackage.Literals.GEO_JSON_OBJECT__BBOX)).isNull();
	}

	@Test
	void unsetBbox_removesBoundingBox() {
		Point point = point();
		point.eSet(GeoJsonPackage.Literals.GEO_JSON_OBJECT__BBOX, new double[] { 1.0, 2.0, 3.0, 4.0 });
		assertThat(point.getBoundingBox()).isNotNull();

		point.eUnset(GeoJsonPackage.Literals.GEO_JSON_OBJECT__BBOX);

		assertThat(point.getBoundingBox()).isNull();
		assertThat(point.eIsSet(GeoJsonPackage.Literals.GEO_JSON_OBJECT__BBOX)).isFalse();
	}

	@Test
	void convertToBoundingBox_null_isNull() {
		assertThat(GeoJsonHelper.convertToBoundingBox(null)).isNull();
	}
}
