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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Memory Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of the CIM_MemoryConfigurationService exist to facilitate provisioning of system memory. Traditionally the platform BIOS is able to map memory resources into the system address space without user intervention. Some memory devices may support or require configuration prior to being made available in the system address space. The CIM_MemoryConfigurationService is utilized with this later type of memory device. It supports allocation, a process by which primordial, unconfigured memory is made available to the system. It also supports deallocation, whereby visible extents are returned to their primordial state.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this method to provision primordial memory extents. Input parameters identify the desired configuration and the primordial pool from which to draw resources.
	 * @param Pool Reference to the resource pool.
	 * @param Goal One or more embedded instances of CIM_MemoryAllocationSettingData which describe the allocation request.
	 * @param MemoryExtents When results are successful, non-staged this parameter contains references to CIM_VisibleMemory instances representing the allocated memory extents.
	 * <!-- end-model-doc -->
	 * @model PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" GoalUnique="false" GoalMany="true"
	 *        GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_MemoryAllocationSettingData'" MemoryExtentsUnique="false" MemoryExtentsMany="true"
	 *        MemoryExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VisibleMemory REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"4097\",\"4098\",\"4099\",\"..\",\"4100..32767\",\"32768..65535\"]' Values='[\"Request Was Successfully Executed\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Request Was Successfully Staged for Future Execution\",\"Insufficient Resources\",\"Inconsistent Parameters\",\"Request did not Complete in its Entirety and Partial Results Could not be Undone\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AllocateFromPool(CIM_ResourcePool Pool, EList<String> Goal, EList<CIM_VisibleMemory> MemoryExtents);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this method to deallocate system visible memory extents thereby returning their capacity to the primordial pool from which it was drawn.
	 * @param MemoryExtent Reference to one or more visible memory extents to be deallocated.
	 * <!-- end-model-doc -->
	 * @model MemoryExtentUnique="false" MemoryExtentMany="true"
	 *        MemoryExtentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VisibleMemory REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Request Was Successfully Executed\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Request Was Successfully Staged for Future Execution\",\"Request did not Complete in its Entirety and Partial Results Could not be Undone\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReturnToPool(EList<CIM_VisibleMemory> MemoryExtent);

} // CIM_MemoryConfigurationService
