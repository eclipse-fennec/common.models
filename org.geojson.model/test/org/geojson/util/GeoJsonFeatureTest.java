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
import org.geojson.Feature;
import org.geojson.GeoJsonFactory;
import org.junit.jupiter.api.Test;

/**
 * Tests that the {@code id} of a Feature is optional (RFC 7946, section 3.2), see issue #33.
 */
class GeoJsonFeatureTest {

	@Test
	void withoutId_isValid() {
		Feature feature = GeoJsonFactory.eINSTANCE.createFeature();

		assertThat(Diagnostician.INSTANCE.validate(feature).getSeverity()).isEqualTo(Diagnostic.OK);
	}
}
