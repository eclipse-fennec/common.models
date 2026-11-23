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
 * A representation of the model object '<em><b>CIM Resource Pool Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service provides for active management of Resource Pools. It allows jobs to be started for the creation and deletion of ResourcePools as well as addition and subtraction of host resources from ResourcePools
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePoolConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Resource' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ResourcePoolConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts a job to create a root ResourcePool. The ResourcePool will be scoped to the same System as this Service. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
	 * @param ElementName A end user relevant name for the pool being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created pool.
	 * @param HostResources Array of zero or more devices that are used to create the Pool or modify the source extents. All elements in the array must be of the same type.
	 * @param ResourceType The type of resources the created poolwill manage. If HostResources contains elements, this property must mach their type.
	 * @param Pool On success, a reference to the resulting ResourcePool is returned. When a Job is returned, this may be NULL, in which case, the client must use the Job to find the resulting ResourcePool once the Job completes.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" HostResourcesUnique="false" HostResourcesMany="true"
	 *        HostResourcesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF[]' In='true'" ResourceTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateResourcePool(String ElementName, EList<CIM_LogicalDevice> HostResources, String ResourceType, CIM_ResourcePool Pool, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create a sub-pool from a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the sub-pool. The Job's reference will be returned in the output parameter Job.
	 * @param ElementName A end user relevant name for the pool being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
	 * @param Settings String containing a representation of a CIM_SettingData instance that is used to specify the settings for the child Pool.
	 * @param ParentPool The Pool(s) from which to create the new Pool.
	 * @param Pool A reference to the resulting pool.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" SettingsUnique="false" SettingsMany="true"
	 *        SettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' EmbeddedInstance='CIM_ResourceAllocationSettingData' ModelCorrespondence='[\"CIM_ResourcePoolConfigurationService.CreateChildResourcePool.ParentPool\"]'" ParentPoolUnique="false" ParentPoolMany="true"
	 *        ParentPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF[]' In='true' ModelCorrespondence='[\"CIM_ResourcePoolConfigurationService.CreateChildResourcePool.Settings\"]'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"Insufficient Resources\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateChildResourcePool(String ElementName, EList<String> Settings, EList<CIM_ResourcePool> ParentPool, CIM_ResourcePool Pool, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to delete a ResourcePool. No allocations may be outstanding or the delete will fail with "In Use." If the resource pool is a root resource pool, any host resources are returned back to the underlying system. If 0 is returned, the function completed successfully, and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the ResourcePool. A reference to the Job is returned in the Job parameter.
	 * @param Pool Reference to the pool to delete.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteResourcePool(CIM_ResourcePool Pool, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts a job to add resources to a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
	 * @param HostResources Array of CIM_LogicalDevice instances to add to the Pool.
	 * @param Pool The pool to add the resources to.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model HostResourcesUnique="false" HostResourcesMany="true"
	 *        HostResourcesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF[]' In='true'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddResourcesToResourcePool(EList<CIM_LogicalDevice> HostResources, CIM_ResourcePool Pool, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts a job to remove resources from a ResourcePool. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job. The resulting pool will be a root pool with no parent pool.
	 * @param HostResources Array of CIM_LogicalDevice instances to remove from the Pool.
	 * @param Pool The pool to remove the resources from.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model HostResourcesUnique="false" HostResourcesMany="true"
	 *        HostResourcesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF[]' In='true'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveResourcesFromResourcePool(EList<CIM_LogicalDevice> HostResources, CIM_ResourcePool Pool, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to change a parent pool using the specified allocation settings If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to change the parent pool. The Job's reference will be returned in the output parameter Job.
	 * @param ChildPool Reference to the child pool.
	 * @param ParentPool Reference to the parent pool(s).
	 * @param Settings Optional string containing a representation of a CIM_SettingData instance that is used to specify the settings for the Parent Pool.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model ChildPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF' In='true'" ParentPoolUnique="false" ParentPoolMany="true"
	 *        ParentPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF[]' In='true'" SettingsUnique="false" SettingsMany="true"
	 *        SettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' EmbeddedInstance='CIM_ResourceAllocationSettingData' ModelCorrespondence='[\"CIM_ResourcePoolConfigurationService.ChangeParentResourcePool.Settings\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true' ModelCorrespondence='[\"CIM_ResourcePoolConfigurationService.ChangeParentResourcePool.ParentPool\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Incorrect ResourceType for the Pool\",\"Insufficient Resources\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ChangeParentResourcePool(CIM_ResourcePool ChildPool, EList<CIM_ResourcePool> ParentPool, EList<String> Settings, CIM_ConcreteJob Job);

} // CIM_ResourcePoolConfigurationService
