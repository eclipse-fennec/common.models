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
 * A representation of the model object '<em><b>Length Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of a length (or distance) quantity, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getLengthType()
 * @model extendedMetaData="name='LengthType' kind='simple'"
 * @generated
 */
@ProviderType
public interface LengthType extends MeasureType {
} // LengthType
