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
 * A representation of the model object '<em><b>CIM FS Quota Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The QuotaConfigurationService performs all modifications and queries to the state of a running or stopped quota system, including the FSQuotaConfigEntries that determine the thresholds and entities being monitored.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaManagementService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to get quota entries that match a given principal, tree, quota type and resource type on a given CS. Any or none of these may be specified, meaning that any or none of them may be NULL. If none are specified, the routine is equivalent to EnumerateInstances(); this is not recommended if an entry contains multiple principals.
	 * @param IdentityId An FSDomainIdentity InstanceID.
	 * @param ElementId Reference to the file server containing the quota entries. This entry MUST NOT be NULL.
	 * @param Tree A tree name. This MUST be an absolute path.
	 * @param QuotaType The type of quota to find. A value of 0 (Unknown) here will return entries matching any type.
	 * @param QuotaEntries The quota entries in embedded instance form. If no quota entries matching the specified input arguments can be found, this parameter MUST be NULL.
	 * <!-- end-model-doc -->
	 * @model IdentityIdAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FSDomainIdentity.InstanceID\"]'" ElementIdAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" TreeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" QuotaTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"User\",\"Group\",\"Tree\",\"User-tree\",\"Group-tree\",\"Reserved\",\"Vendor Defined\"]'" QuotaEntriesUnique="false" QuotaEntriesMany="true"
	 *        QuotaEntriesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' EmbeddedInstance='CIM_FSQuotaConfigEntry'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"65536..\"]' Values='[\"Success\",\"None found\",\"Bad identity\",\"Bad element\",\"Bad tree\",\"Bad resource type\",\"Bad quota type\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long FindQuotaEntries(String IdentityId, CIM_ComputerSystem ElementId, String Tree, Integer QuotaType, EList<String> QuotaEntries);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to delete a quota entry with a given InstanceID. Return values are described in the valuemap array. In the case of a malformed entry, an error with more information may also be thrown. NOTE: Deleting a quota entry does not destroy the CIM Instance. Call DeleteInstance() to do this.
	 * @param EntryID The InstanceID of the quota entry to delete.
	 * <!-- end-model-doc -->
	 * @model EntryIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FSQuotaConfigEntry.InstanceID\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"65536..\"]' Values='[\"Success\",\"InstanceID not found\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long DeleteQuotaEntry(String EntryID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to modify a quota entry with a given InstanceID. It is illegal to modify the instance ID, tree, principal, resource type, quota type or managed element of a quota entry, and clients MUST NOT attempt this. All other fields may be modified. Depending on the system, doing so may take some time, and a job MAY be created for tracking progress.
	 * @param EntryId The InstanceID of the quota entry to modify.
	 * @param QuotaEntry The modified quota entry in embedded instance form.
	 * @param Job A job tracking progress of the method. If no job is created, this property MUST be NULL.
	 * <!-- end-model-doc -->
	 * @model EntryIdAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FSQuotaConfigEntry.InstanceID\"]'" QuotaEntryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FSQuotaConfigEntry'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"65536..\"]' Values='[\"Success\",\"InstanceID not found\",\"Malformed entry\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long ModifyQuotaEntry(String EntryId, String QuotaEntry, CIM_Job Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to add a quota entry. It is an error to specify an InstanceID in the proposed new entry. Return values are described in the valuemap array. In the case of a malformed entry, an error with more information may also be thrown. Some systems will reject duplicate entries; others may not. What happens in the case of duplicate keys is determined by the setting of the ConflictingEntriesUsage property of the FSQuotaCapabilities associated with the system instance this call is being made against.
	 * @param QuotaEntry The quota entry to add, in embedded instance form.
	 * @param Job A job tracking progress of the method. If no job is created, this property MUST be NULL.
	 * <!-- end-model-doc -->
	 * @model QuotaEntryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FSQuotaConfigEntry'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"65536..\"]' Values='[\"Success\",\"InstanceID specified\",\"Duplicate key\",\"Malformed entry\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long AddQuotaEntry(String QuotaEntry, CIM_Job Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param Element The ME to report on. This could be a ComputerSystem or StorageExtent (Filesystem). The instrumentation MUST start at the most specific type and work its way up the type hierarchy while attempting to identify the element in question. If reporting on a found element is not supported, the routine MUST return 5 (ME param not supported). If no element pertaining to a supported quota report configuration can be found, the routine MUST return 9 (ME not found).
	 * @param Tree The tree to report on. If this is NULL, the report will be over the entire Element. If the given path is not on the system, the routine MUST return 6 (Tree not found). If the instrumentation is unable to support the given path as an input to the quota reporting subsystem, the routine MUST return 2 (Tree param unsupported). Otherwise quota statistics are reported for objects in the given tree only.
	 * @param User The user to report on. If this is NULL, there is no restriction on users in the report. If a given user is not known to the system, the routine MUST return 7 (User not found). If the instrumentation is unable to support the given user as an input to the quota reporting subsystem, the routine MUST return 3 (User param unsupported). Otherwise quota statistics are reported for the given user only.
	 * @param Group The group to report on. If this is NULL, there is no restriction on users in the report. If a given group is not known to the system, the routine MUST return 8 (Group not found). If the instrumentation is unable to support the given group as an input to the quota reporting subsystem, the routine MUST return 4 (Group param unsupported). Otherwise quota statistics are reported for objects in the given group only.
	 * @param Cursor A cursor for use in chunking up the quota report. Initial calls to begin a report MUST pass NULL for the cursor. After that, each successive call for records from the same report MUST pass back the same cursor that was returned for the previous call. Note, however, that clients which wish to depend on other flow control mechanisms may simply pass (uint64)(-1) in the NQuotas parameter, and all records will be returned in one chunk.
	 * @param NRecords A number describing the number of quota records desired in one chunk, when passed in, and the number actually returned, when passed back out. A recommended chunk size is 100 to 1000. Clients which wish to depend on other flow control mechanisms instead of the chunking mechanism provided here should pass (uint64)(-1) for this parameter.
	 * @param Job It's possible that initiating a quota report may take some time, before any records at all are available for viewing. Instrumentation that supports jobs may return a job in this case, along with a return code of 0 (Success). If no job is created, the provider MUST return NULL for this parameter.
	 * @param ReportRecs The quota report records.
	 * <!-- end-model-doc -->
	 * @model ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" TreeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" UserAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FSDomainIdentity'" GroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FSDomainIdentity'" CursorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" NRecordsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" ReportRecsUnique="false" ReportRecsMany="true"
	 *        ReportRecsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' EmbeddedInstance='CIM_FSQuotaReportRecord'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"65536..\"]' Values='[\"Success\",\"Bad cursor\",\"Tree parameter unsupported\",\"User parameter unsupported\",\"Group parameter unsupported\",\"ManagedElement parameter unsupported\",\"Tree not found\",\"User not found\",\"Group not found\",\"ManagedElement not found\",\"No more data\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long GetQuotaReport(CIM_ManagedElement Element, String Tree, String User, String Group, String Cursor, Long NRecords, CIM_Job Job, EList<String> ReportRecs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Turn quota statistics gathering and reporting on or off. If turning quotas on and off for the given managed element type is unsupported, the system MUST return 1 (Operation unsupported for this ME type). Secondarily, if the system does not support turning quotas on or off for individual managed elements of the given type, the system MUST return 2 (Operation unsupported for individual MEs of this type).
	 * @param OnOff Whether to turn quotas on or off.
	 * @param Element The managed element on which to turn quotas on or off.
	 * @param Job It's possible that changing the state of the system may take some time. Instrumentation that supports jobs may return a job in this case, along with a return code of 0 (Success). If no job is created, the provider MUST return NULL for this parameter.
	 * <!-- end-model-doc -->
	 * @model OnOffAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"65536..\"]' Values='[\"Success\",\"Operation unsupported for this ME type\",\"Operation unsupported for individual MEs of this type\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long EnableQuotas(Boolean OnOff, CIM_ManagedElement Element, CIM_Job Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param Job It's possible that changing the state of the system may take some time. Instrumentation that supports jobs may return a job in this case, along with a return code of 0 (Success). If no job is created, the provider MUST return NULL for this parameter.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"65536..\"]' Values='[\"Success\",\"Error\",\"Unsupported\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Long InitializeQuotas(CIM_Job Job);

} // CIM_FSQuotaManagementService
