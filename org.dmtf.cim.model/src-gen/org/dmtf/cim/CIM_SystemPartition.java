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
 * A representation of the model object '<em><b>CIM System Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Partition is an instance of a UnitaryComputerSystem (with its own OperatingSystem and Devices dedicated to the Partition) that is supported by underlying hardware and software. A Partition is not a virtualization of a Computer System, but the segmentation of the System's compute capabilities. Partitions can run independent copies of possibly different OperatingSystems and have dedicated Devices. The 'real', underlying System (perhaps a Cluster or another UnitaryComputerSystem) aggregates its Partitions. These semantics are described by the System Partition association. 
 * The use of this association has been deprecated in lieu of using HostedDependency.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedDependency\"]' Aggregation='true' Composition='true' Version='2.8.0' UMLPackagePath='CIM::System::SystemElements' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Deprecated='[\"CIM_HostedDependency.Antecedent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The \'underlying\' ComputerSystem that hosts a Partition.' override.PartComponent='CIM_UnitaryComputerSystem REF' override.PartComponent.Deprecated='[\"CIM_HostedDependency.Antecedent\"]' override.PartComponent.Description='The System Partition.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SystemPartition extends CIM_ComponentCS {
} // CIM_SystemPartition
