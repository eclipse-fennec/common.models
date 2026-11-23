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
 * A representation of the model object '<em><b>CIM Tier Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TierService class provides methods to allow a client to manage storage tiers.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TierService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TierService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a new storage tier based on supplied storage objects. For example, a storage tier based on all storage extents of a storage pool, i.e. ConcreteComponents, that utilize solid state technology. The more parameters specified, the narrower the criteria for selecting the storage objects.
	 * @param ElementName A end user relevant name for created storage tier. If null, then a system supplied default name may be used.
	 * @param Members List of elements to use to create a storage tier. If null, other specified parameters are considered, such as TierSettingData and Goal.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used. For example, create a storage tier based on performance of underlying technology of components considered.
	 * @param Goal The Quality of Service per the properties of supplied StorageSetting.
	 * @param TierDomain Input: The created StorageTier to be associated to given array of TierDomains. If null, system associates created storage tier to a TierDomain and returns a reference to the TierDomain the system used.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param StorageTier Reference to the created StorageTier.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" TierDomainUnique="false" TierDomainMany="true"
	 *        TierDomainAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF[]' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageTierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageTier REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateStorageTier(String ElementName, EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ManagedElement Goal, EList<CIM_AdminDomain> TierDomain, CIM_ConcreteJob Job, CIM_StorageTier StorageTier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a storage tier. The storage objects associated to the storage tier are unaffected.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param StorageTier Reference to StorageTier to delete.
	 * @param Force The implementation may not allow a storage tier to be deleted if the storage tier is associated with underlying storage elements. In such situations specify "True" to force the deletion of the storage tier.
	 * <!-- end-model-doc -->
	 * @model TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageTierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageTier REF'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteStorageTier(String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier, Boolean Force);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add members, i.e. components, to a storage tier to expand the capacity of storage tier.
	 * @param Members List of elements to add to storage tier.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used.
	 * @param Goal The Quality of Service per the properties of supplied StorageSetting.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param StorageTier Reference to StorageTier to add to.
	 * <!-- end-model-doc -->
	 * @model MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageTierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageTier REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddToStorageTier(EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ManagedElement Goal, CIM_ConcreteJob Job, CIM_StorageTier StorageTier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove members, i.e. components, from a storage tier to reduce the capacity of storage tier.
	 * @param Members List of elements to remove from storage tier.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param StorageTier Reference to the StorageTier to remove from.
	 * <!-- end-model-doc -->
	 * @model MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageTierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageTier REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveFromStorageTier(EList<CIM_LogicalElement> Members, String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a TierDomain and associate it to top-level ComputerSystem -- via SystemComponent association.
	 * @param ElementName If nameable, an end user relevant name for the TierDomain. If null or not nameable, then system assigns a name.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param TierDomain Reference to the created TierDomain.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TierDomainAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateTierDomain(String ElementName, String TierSettingData, CIM_ConcreteJob Job, CIM_AdminDomain TierDomain);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete an instance of TierDomain. If the Force parameter is true, the SystemComponents (i.e. StorageTier) of this domain that are not associated to another TierDomain will also be deleted.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Force If true, delete a non-empty TierDomain and its associated StorageTiers, as long as the associated StorageTiers are not associated to other TierDomains; otherwise, return an error.
	 * @param TierDomain Reference to TierDomain to delete.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" TierDomainAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteTierDomain(CIM_ConcreteJob Job, Boolean Force, CIM_AdminDomain TierDomain);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify a StorageTier association to a TierDomain. A StorageTier shall always be associated to at least one TierDomain. This call ensures a StorageTier's association to a TierDomain is maintained especially when a StorageTier 'moves' from one TierDomain to another TierDomain. By setting the parameter RemoveFromTierDomain to null and setting the parameter AddToTierDomain to a TierDomain, this call associates a StorageTier to additional TierDomains.
	 * @param RemoveFromTierDomain Remove StorageTier's association to this TierDomain.If null, the association will not be removed from an existing TierDomain.
	 * @param AddToTierDomain Associate StorageTier to this TierDomain. If null, the association will not be added to an existing TierDomain.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param StorageTier Reference to the StorageTier to manipulate.
	 * <!-- end-model-doc -->
	 * @model RemoveFromTierDomainAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF'" AddToTierDomainAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageTierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageTier REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyStorageTierDomainAssociation(CIM_AdminDomain RemoveFromTierDomain, CIM_AdminDomain AddToTierDomain, String TierSettingData, CIM_ConcreteJob Job, CIM_StorageTier StorageTier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns an array of storage objects that can form a storage tier. The selection criteria is based on the input parameters. The more input parameters, the narrower the search criteria. For example, it is possible to specify to return the candidate storage objects based on all storage extents of a storage pool, i.e. ConcreteComponents, that utilize solid state technology by supplying the appropriate InPools and TierSettingData.
	 * @param InElements List of elements to consider. For example, a list of storage pools.
	 * @param TierSettingData If provided, it overrides the default tier setting data that is used. For example, a storage tier based on performance of underlying technology of components considered.
	 * @param Goal The Quality of Service per the properties of supplied StorageSetting.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Candidates An array of storage objects that can form a storage tier.
	 * <!-- end-model-doc -->
	 * @model InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" TierSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_TierSettingData'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" CandidatesUnique="false" CandidatesMany="true"
	 *        CandidatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetStorageTierCandidateObjects(EList<CIM_LogicalElement> InElements, String TierSettingData, CIM_ManagedElement Goal, CIM_ConcreteJob Job, EList<CIM_LogicalElement> Candidates);

} // CIM_TierService
