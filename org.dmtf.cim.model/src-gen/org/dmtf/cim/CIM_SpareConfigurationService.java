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
 * A representation of the model object '<em><b>CIM Spare Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service allows the active management of spares in a Storage Server. It allows jobs to be started for the adding and removing of spares, replacing a failed storage extent with a spare and rebuilding a storage extent in a StorageRedundancySet.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SpareConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SpareConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method assigns one or more primordial StorageExtents as spares. Once a spare is assigned, the storage system can use it to spare a failed StorageExtent associated to a StorageRedundancySet. Depending on the capabilities of the storage system, the spare may failover the failed extent or may remain a spare. 
	 * The spare extents may be designated to spare for a specific StorageRedundancySet (dedicated) or may be used to spare for any compatible StorageRedundancySet (global).
	 * @param Job Reference to the job (may be null if job completed).
	 * @param InPool The primordial StoragePool that contains the StorageExtents. This parameter does not need to be specified if there is only one primordial StoragePool.
	 * @param InExtents An array of references to StorageExtents that are to be assigned as spares.
	 * @param RedundancySet If specified, the spares will only spare for StorageExtents in this StorageRedundancySet (dedicated). If no reference is specified, the spares can spare for any compatible StorageRedundancySet (global).
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" InExtentsUnique="false" InExtentsMany="true"
	 *        InExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Required='true'" RedundancySetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageRedundancySet REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Multiple StoragePools\",\"Spares Are Not Compatible\",\"StorageExtent is in use\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AssignSpares(CIM_ConcreteJob Job, CIM_StoragePool InPool, EList<CIM_StorageExtent> InExtents, CIM_StorageRedundancySet RedundancySet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method unassigns spares and returns the StorageExtents to the primordial StoragePool.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param InPool The primordial StoragePool to which the unassigned StorageExtents are to be returned. This parameter does not need to be specified if there is only one primordial StoragePool.
	 * @param InExtents An array of references to StorageExtents that are spares.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" InExtentsUnique="false" InExtentsMany="true"
	 *        InExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Multiple Primordial StoragePools\",\"StorageExtent is in use\",\"Spares Are Not Compatible\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long UnassignSpares(CIM_ConcreteJob Job, CIM_StoragePool InPool, EList<CIM_StorageExtent> InExtents);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method causes the data in the StorageExtent to be rebuilt from the other members of the StorageRedundancySet.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Target The StorageExtent that will be rebuilt.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Target is Not a Member of a StorageRedundancySet\",\"Rebuild already in Progress\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RebuildStorageExtent(CIM_ConcreteJob Job, CIM_StorageExtent Target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method checks the parity data in the StorageRedundancySet to ensure that it is consistent with the real data. 
	 * If no StorageRedundancySet is specified, all StorageRedundancySets are checked.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Target The StorageExtent that will be rebuilt.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Consistency Check Already in Progress\",\"No Parity to Check\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CheckParityConsistency(CIM_ConcreteJob Job, CIM_StorageExtent Target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method repairs parity consistency problems found by the CheckParityConsistency method.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Target The StorageExtent that will be checked.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RepairParity(CIM_ConcreteJob Job, CIM_StorageExtent Target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method can be used to retrieve a list of available Extents that may be used in sparing the passed Redundancy set. The returned Extents are available at the time the method returns. There is no guarantee that the same Extents will be available later. This method MUST return the Extents that are not being used as supporting capacity for any other Pools, Volumes, or LogicalDisks. The extents returned from this method shall be compatible with all restrictions imposed by the AssignSpares() method. The implementor and consumer of this method must be aware of what is the allowable source pools and returned extents as specified by the AssignSpares() method.
	 * @param InPool The Storage pool that is the source of the extents that can be used for sparing. This may be a NULL value in which case the method shall not be restricted to return a set of extents from a particular storage pool.
	 * @param RedundancySet A list of redundancy sets which the returned list of extents must spare.
	 * @param AvailableExtents List of references to available StorageExtents.
	 * <!-- end-model-doc -->
	 * @model InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" RedundancySetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageRedundancySet REF'" AvailableExtentsUnique="false" AvailableExtentsMany="true"
	 *        AvailableExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetAvailableSpareExtents(CIM_StoragePool InPool, CIM_StorageRedundancySet RedundancySet, EList<CIM_StorageExtent> AvailableExtents);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method performs a check of the StorageElement in accordance to the specified CheckType . If the Job execution fails or the job completes with error, then use concreteJob.GetError() to get the Error that indicates what caused the failure. In this case, the storage elements affected by the error shall report the appropriate, non OK, OperationalStatus.
	 * @param CheckType
	 *   Default - Perform any data check the storage element is capable of 
	 *   Parity - Check that the parity distribution across the storage element is consistent 
	 *   Bad Block - Check for any bad blocks across the element where data may be stored. 
	 *   Replication - Check that replicated data on the element is consistent.
	 * @param CheckMode
	 *   RunOneTime - Perform the check one time. 
	 *   Continuous - Perform the check continuously. Operation Stops when job is terminated.
	 * @param TargetElement The target storage object of the operation.
	 * @param Job Reference to the job (may be null if the task completed).
	 * <!-- end-model-doc -->
	 * @model CheckTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Default\",\"Parity\",\"Bad Block\",\"Replication\",\"DMTF Reserved\",\"Vendor Specific\"]'" CheckModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Run One Time\",\"Continuous\",\"DMTF Reserved\",\"Vendor Specific\"]'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Storage Element Check Already in Progress\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CheckStorageElement(Integer CheckType, Integer CheckMode, CIM_LogicalElement TargetElement, CIM_ConcreteJob Job);

} // CIM_SpareConfigurationService
