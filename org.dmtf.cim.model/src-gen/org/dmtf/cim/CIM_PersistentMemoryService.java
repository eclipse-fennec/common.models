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
 * A representation of the model object '<em><b>CIM Persistent Memory Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of the CIM_PersistentMemoryService exist to facilitate modification of a systems persistent memory configuration. Support exists for both allocating and deallocating persistent memory extents from a primordial persistent memory pool.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PersistentMemoryService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this method to provision primordial memory extents. Input parameters identify the desired configuration and the primordial pool from which to draw resources.
	 * @param Pool Reference to the persistent memory resource pool.
	 * @param Goal An embedded instance of CIM_PersistentMemoryNamespaceSettingData describe the allocation request.
	 * @param Namespace When the return result is successful, this parameter contains a reference to the CIM_PersistentMemoryNamespace instance created as a result of this call.
	 * <!-- end-model-doc -->
	 * @model PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_PersistentMemoryNamespaceSettingData'" NamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PersistentMemoryNamespace REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Request Was Successfully Executed\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Request Was Successfully Staged for Future Execution\",\"Insufficient Resources\",\"Inconsistent Parameters\",\"Request did not Complete in its Entirety and Partial Results Could not be Undone\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AllocateFromPool(CIM_ResourcePool Pool, String Goal, CIM_PersistentMemoryNamespace Namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this method to delete a persistent memory namespace, returning its capacity to the ResourcePool from which it was allocated.
	 * @param Namespace Reference to a persistent memory namespace to be deallocated.
	 * <!-- end-model-doc -->
	 * @model NamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PersistentMemoryNamespace REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Request Was Successfully Executed\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Request Was Successfully Staged for Future Execution\",\"Request did not Complete in its Entirety and Partial Results Could not be Undone\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReturnToPool(CIM_PersistentMemoryNamespace Namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this method to modify a persistent memory namespace.
	 * @param Namespace Reference to a persistent memory namespace to be deallocated.
	 * @param Goal An embedded instance of CIM_PersistentMemoryNamespaceSettingData which describe the modification request.
	 * <!-- end-model-doc -->
	 * @model NamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PersistentMemoryNamespace REF'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_PersistentMemoryNamespaceSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Request Was Successfully Executed\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Request Was Successfully Staged for Future Execution\",\"Insufficient Resources\",\"Inconsistent Parameters\",\"Request did not Complete in its Entirety and Partial Results Could not be Undone\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyNamespace(CIM_PersistentMemoryNamespace Namespace, String Goal);

} // CIM_PersistentMemoryService
