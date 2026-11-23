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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Element Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalElementLocation associates a PhysicalElement with a Location object for inventory or replacement purposes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElementLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Physical' override.Element='CIM_PhysicalElement REF' override.Element.Description='The PhysicalElement whose location is specified.' override.PhysicalLocation='CIM_Location REF' override.PhysicalLocation.Max='1' override.PhysicalLocation.Description='The location of the PhysicalElement.' keys='Element,PhysicalLocation'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalElementLocation extends CIM_ElementLocation {
} // CIM_PhysicalElementLocation
