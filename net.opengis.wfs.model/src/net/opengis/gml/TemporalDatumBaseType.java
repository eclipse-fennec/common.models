/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package net.opengis.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Datum Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Partially defines the origin of a temporal coordinate reference system. This type restricts the AbstractDatumType to remove the "anchorPoint" and "realizationEpoch" elements. 
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getTemporalDatumBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='TemporalDatumBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalDatumBaseType extends AbstractDatumType {
} // TemporalDatumBaseType
