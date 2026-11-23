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
 * A representation of the model object '<em><b>CIM Door Access To Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Doors provide access to PhysicalElements for hot swap, repair and similar activities. In turn, PhysicalElements 'Realize' LogicalDevices. Since it may not be possible to define all the PhysicalElements that exist, and optimizing the retrieval of Devices 'behind' the Door may be desirable, the DoorAccessTo Device association provides a shortcut mechanism for defining the LogicalDevices ('hardware') accessed through a Door.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DoorAccessToDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::UserDevices' override.Antecedent='CIM_Door REF' override.Antecedent.Description='The Door that provides access.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice that is accessed.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DoorAccessToDevice extends CIM_Dependency {
} // CIM_DoorAccessToDevice
