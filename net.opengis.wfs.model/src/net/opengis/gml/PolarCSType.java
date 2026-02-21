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
 * A representation of the model object '<em><b>Polar CS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A two-dimensional coordinate system in which position is specified by the distance from the origin and the angle between the line from the origin to a point and a reference direction. A PolarCS shall have two usesAxis associations. 
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getPolarCSType()
 * @model extendedMetaData="name='PolarCSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolarCSType extends AbstractCoordinateSystemType {
} // PolarCSType
