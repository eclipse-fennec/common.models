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
 * A representation of the model object '<em><b>CIM Computer System Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The use of this association has be deprecated in lieu of SystemDevice. Association indicating that memory is installed and required for the UnitaryComputerSystem to operate. Note that this relationship inherits from the SystemDevice association, and therefore, the Memory StorageExtent is weak to the aggregating UnitaryComputerSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_SystemDevice\"]' Aggregation='true' Composition='true' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' override.GroupComponent='CIM_UnitaryComputerSystem REF' override.GroupComponent.Deprecated='[\"CIM_SystemDevice.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The UnitaryComputerSystem.' override.PartComponent='CIM_Memory REF' override.PartComponent.Deprecated='[\"CIM_SystemDevice.PartComponent\"]' override.PartComponent.Description='The Memory StorageExtent which is part of the UnitaryComputerSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystemMemory extends CIM_SystemDevice {
} // CIM_ComputerSystemMemory
