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
 * A representation of the model object '<em><b>CIM Computer System Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: ComputerSystemProcessor is deprecated in lieu of its superclass, SystemDevice, because it adds no detail and changes none of the cardinalities in the definition of the superclass. Deprecated description: An association that indicates the processors of a UnitaryComputer System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemProcessor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_SystemDevice\"]' Aggregation='true' Composition='true' Version='2.10.0' UMLPackagePath='CIM::Device::Processor' override.GroupComponent='CIM_UnitaryComputerSystem REF' override.GroupComponent.Deprecated='[\"CIM_SystemDevice.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='Note: This method is deprecated. Deprecated description: The UnitaryComputerSystem.' override.PartComponent='CIM_Processor REF' override.PartComponent.Deprecated='[\"CIM_SystemDevice.PartComponent\"]' override.PartComponent.Description='Note: This method is deprecated. Deprecated description: The Processor that is part of the UnitaryComputerSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystemProcessor extends CIM_SystemDevice {
} // CIM_ComputerSystemProcessor
