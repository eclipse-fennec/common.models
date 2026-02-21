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
 * A representation of the model object '<em><b>Scale Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of a scale factor (or ratio) that has no physical unit. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a scale factor, such as percent, permil, or parts-per-million.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getScaleType()
 * @model extendedMetaData="name='ScaleType' kind='simple'"
 * @generated
 */
@ProviderType
public interface ScaleType extends MeasureType {
} // ScaleType
