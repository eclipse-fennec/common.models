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
 * A representation of the model object '<em><b>CIM Storage Relocation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Typically, a storage pool is established on a set of storage extents, and a volume is allocated to a storage pool with different performance characteristics (e.g. with different RPM drives, or different drive classes). Storage Relocation (SR) can relocate storage elements to a different storage pool, or relocate a storage element to a specified set of storage extents.The relocation source and target could be either local or remote. Two functions are defined in this class: RelocateStorageElementsToStoragePool and RelocateStorageElementToElements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageRelocationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageRelocationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to relocate a specified set of volumes to a target StoragePool. Both relocation source and target could be either local or remote. If 0 is returned, the function completes successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to kick off the relocation. The Job's reference will be returned in the output parameter Job.
	 * @param TheElements As an input, TheElements is an array of storage volumes for the source of relocation. As an output, it represents the storage volumes after relocation. Notice that: 1) The input may not be identical to the output. One example is relocation from local to remote. 2)It is output only when the relocation operation succeeds.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TargetSettingGoal The requirements for the relocation target pool. If set to a null value, the default configuration associated with the service will be used. This parameter should be a reference to a CIM_StorageSetting which represent the profile appropriate to the relocation target pool. If not NULL, this parameter will supply a new Goal for the target pool.
	 * @param TargetPool A reference to target storage pool instance used for relocation. As an input parameter, TargetPool specifies the storage pool to relocate source onto. As an output parameter, TargetPool represents the pool actually used as the relocation target. It is output only when the relocation succeeds.
	 * <!-- end-model-doc -->
	 * @model TheElementsUnique="false" TheElementsMany="true"
	 *        TheElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageVolume REF[]' Required='true' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF' Required='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"ElementType Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RelocateStorageVolumesToStoragePool(EList<CIM_StorageVolume> TheElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to relocate a specified set of storage pools to a target StoragePool. Both relocation source and target could be either local or remote. If 0 is returned, the function completes successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to kick off the relocation. The Job's reference will be returned in the output parameter Job.
	 * @param TheElements As an input, TheElements is an array of storage pools for the source of relocation. As an output, it represents the storage pools after relocation. Notice that: 1) The input may not be identical to the output. One example is relocation from local to remote. 2)It is output only when the relocation operation succeeds.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TargetSettingGoal The requirements for the relocation target pool. If set to a null value, the default configuration associated with the service will be used. This parameter should be a reference to a CIM_StorageSetting which represent the profile appropriate to the relocation target pool. If not NULL, this parameter will supply a new Goal for the target pool.
	 * @param TargetPool A reference to target storage pool instance used for relocation. As an input parameter, TargetPool specifies the storage pool to relocate source onto. As an output parameter, TargetPool represents the pool actually used as the relocation target. It is output only when the relocation succeeds.
	 * <!-- end-model-doc -->
	 * @model TheElementsUnique="false" TheElementsMany="true"
	 *        TheElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF[]' Required='true' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF' Required='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"ElementType Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RelocateStoragePoolsToStoragePool(EList<CIM_StoragePool> TheElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to relocate a StorageVolume to a specified group of storage extents. Both relocation source and target couldbe either local or remote. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to kick off the relocation. The Job's reference will be returned in the output parameter Job.
	 * @param InElements An array of StorageExtents that 'TheElement' is relocated to.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TargetSettingGoal The requirements for the relocation target element. If set to a null value, the default configuration associated with the service will be used. This parameter should be a reference to a CIM_StorageSetting which represents the profile appropriate to the relocation target elements. If not NULL, this parameter will supply a new Goal for the target elements.
	 * @param TheElement As an input, TheElement is a storageVolume as the source ofrelocation. As an output, it represents the storageVolume after relocation. Notice that: 1) The input may not be identical to the output. One example is relocation from local to remote. 2) It is output only when the relocation operation succeeds.
	 * <!-- end-model-doc -->
	 * @model InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageVolume REF' Required='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"ElementType Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RelocateStorageVolumeToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StorageVolume TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to relocate a StoragePool to a specified group of storage extents. Both relocation source and target couldbe either local or remote. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to kick off the relocation. The Job's reference will be returned in the output parameter Job.
	 * @param InElements An array of StorageExtents that 'TheElement' is relocated to.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TargetSettingGoal The requirements for the relocation target element. If set to a null value, the default configuration associated with the service will be used. This parameter should be a reference to a CIM_StorageSetting which represents the profile appropriate to the relocation target elements. If not NULL, this parameter will supply a new Goal for the target elements.
	 * @param TheElement As an input, TheElement is a storagePool as the source ofrelocation. As an output, it represents the storagePool after relocation. Notice that: 1) The input may not be identical to the output. One example is relocation from local to remote. 2) It is output only when the relocation operation succeeds.
	 * <!-- end-model-doc -->
	 * @model InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF' Required='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"ElementType Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RelocateStoragePoolToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to relocate a LogicalDisk to a specified group of storage extents. Both relocation source and target couldbe either local or remote. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to kick off the relocation. The Job's reference will be returned in the output parameter Job.
	 * @param InElements An array of StorageExtents that 'TheElement' is relocated to.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TargetSettingGoal The requirements for the relocation target element. If set to a null value, the default configuration associated with the service will be used. This parameter should be a reference to a CIM_StorageSetting which represents the profile appropriate to the relocation target elements. If not NULL, this parameter will supply a new Goal for the target elements.
	 * @param TheElement As an input, TheElement is a logicalDisk as the source ofrelocation. As an output, it represents the logicalDisk after relocation. Notice that: 1) The input may not be identical to the output. One example is relocation from local to remote. 2) It is output only when the relocation operation succeeds.
	 * <!-- end-model-doc -->
	 * @model InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDisk REF' Required='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"ElementType Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RelocateLogicalDiskToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_LogicalDisk TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method can be used to retrieve a list of available target Extents that may be used in the relocation of a StoragePool, StorageVolume, or LogicalDisk. This method MUST return Extents from InPool. The returned Extents are available at the time the method returns. There is no guarantee that the same Extents will be available later. This method MUST return the Extents that are not being used as supporting capacity for any other Pools, Volumes, or LogicalDisks that have been allocated from this Pool.
	 * @param TheElement TheElement is a storage element as the source of relocation.
	 * @param TargetSettingGoal The TargetSettingGoal for which supported extents should be retrieved as available. If a NULL is passed for the Goal, the method will return all available extents, regardless of the goal. There exists a possibility of error in relocating a Pool, Volume, or LogicalDisk to extents retrieved in this manner.
	 * @param InPool A reference to target storage pool instance used for relocation. InPool specifies the storage pool to relocate source onto.
	 * @param AvailableExtents List of references to available StorageExtents for relocation.
	 * <!-- end-model-doc -->
	 * @model TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF' Required='true'" AvailableExtentsUnique="false" AvailableExtentsMany="true"
	 *        AvailableExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetAvailableTargetRelocationExtents(CIM_LogicalElement TheElement, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool InPool, EList<CIM_StorageExtent> AvailableExtents);

} // CIM_StorageRelocationService
