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
 * A representation of the model object '<em><b>CIM Storage Protection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service defines the Protect method used to apply and modify the protection setting for a specified StorageVolume or LogicalDisk. The settings applied are used to protect a storage element from accidental or intentional overwriting. Accordingly, the settings set the read/write ability of the element, SCSI inquiry visibility, whether it can be copied over, and whether it can be exposed from the storage system. This service also allows the specification of a retention time, or length of time that these settings cannot be modified. The settings remain in effect after this time period expires until changed. The values of this setting are stored in the StorageProtectionSetting class associated to the StorageVolume pr LogicalDisk via ElementProtectionSettingData. The StorageProtectionSetting cannot be modified directly, but can only be modified via this service. While the element is being protected, the StorageProtectionSetting cannot be removed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::Storage' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageProtectionService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method creates or modifies the StorageProtectionSetting associated to the StorageVolume or LogicalDisk. This method is called to protect the StorageVolume or LogicalDisk against modification for a specific period of time. Values specified for this method will be set as properties of the StorageProtectionSetting instance that is associated to the specified StorageVolume or LogicalDisk. This method can be used to extend the retention period, but not decrease it.
	 * @param Job Reference to the job created, if any.
	 * @param Element StorageVolume or LogicalDisk to be configured.
	 * @param ElementType
	 *   Enumeration indicating the type of element being protected. 
	 *   1: StorageVolume 
	 *   2: LogicalDisk.
	 * @param Access
	 *   Read and write accessibility of the StorageVolume. 
	 *   1: Read/Write Enabled 
	 *   2: Read Only 
	 *   3: Write Once 
	 *   4: Read/Write Disabled.
	 * @param InquiryProtection
	 *   StorageVolume protection method for SCSI inquiry commands. 
	 *   1: No SCSI Inquiry Protection 
	 *   2: Inquiry Disabled 
	 *   3: Zero Capacity Returned.
	 * @param DenyAsCopyTarget Whether the storage element can be specified as a replica or not.
	 * @param LUNMappingConfigure Whether LUN assignment to the StorageVolume is allowed or not.
	 * @param ProtectExpirationType
	 *   Duration type of the storage element protection 
	 *   1: None 
	 *   2: Limited expiration 
	 *   3: Permanent.
	 * @param TimePeriod Amount of remaining time before a management application can change the access permission.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Out='true'" ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"StorageVolume\",\"LogicalDisk\"]'" AccessAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Read/Write Enabled\",\"Read Only\",\"Write Once\",\"Read/Write disabled\"]'" InquiryProtectionUnique="false" InquiryProtectionMany="true"
	 *        InquiryProtectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"No SCSI Inquiry Protection\",\"Inquiry Disabled\",\"Zero Capacity Returned\"]'" DenyAsCopyTargetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" LUNMappingConfigureAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ProtectExpirationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"None\",\"Limited expiration\",\"Permanent\"]'" TimePeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Invalid State Transition\",\"DMTF Reserved\",\"Method parameters checked - job started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long Protect(CIM_Job Job, CIM_StorageExtent Element, Integer ElementType, Integer Access, EList<Integer> InquiryProtection, Boolean DenyAsCopyTarget, Boolean LUNMappingConfigure, Integer ProtectExpirationType, String TimePeriod);

} // CIM_StorageProtectionService
