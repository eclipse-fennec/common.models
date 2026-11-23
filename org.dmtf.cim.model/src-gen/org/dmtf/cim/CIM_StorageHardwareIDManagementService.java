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
 * A representation of the model object '<em><b>CIM Storage Hardware ID Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageHardwareIDManagementService provides methods for manipulating instances of StorageHardwareIDs and manipulating the trust of these IDs in the underlying storage system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageHardwareIDManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.43.0' UMLPackagePath='CIM::User::StorageHardwareID' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageHardwareIDManagementService extends CIM_IdentityManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates a CIM_StorageHardwareID, it creates the association CIM_ConcreteDependency between this service and the new CIM_StorageHardwareID.
	 * @param ElementName The ElementName of the new StorageHardwareID instance.
	 * @param StorageID StorageID is the value used by the SecurityService to represent Identity - in this case, a hardware worldwide unique name.
	 * @param IDType The type of the StorageID property. iSCSI IDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * @param OtherIDType The type of the storage ID, when IDType is "Other".
	 * @param Setting REF to the StorageClientSettingData containing the OSType appropriate for this initiator. If left NULL, the instrumentation assumes a standard OSType - i.e., that no OS-specific behavior for this initiator is defined.
	 * @param HardwareID REF to the new StorageHardwareID instance.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" StorageIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" IDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"7\"]' Values='[\"Other\",\"PortWWN\",\"NodeWWN\",\"Hostname\",\"iSCSI Name\",\"SAS Address\"]' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'" OtherIDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" SettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageClientSettingData REF' In='true'" HardwareIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageHardwareID REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0xFFF\",\"0x1000\",\"0x1001\",\"0x1003..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"ID already created\",\"Hardware implementation does not support specified IDType\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateStorageHardwareID(String ElementName, String StorageID, Integer IDType, String OtherIDType, CIM_StorageClientSettingData Setting, CIM_StorageHardwareID HardwareID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method deletes a named CIM_StorageHardwareID, and also tears down the associations that are no longer needed, including CIM_ConcreteDependency and CIM_AuthorizedSubject.
	 * @param HardwareID The storage hardware ID to be deleted.
	 * <!-- end-model-doc -->
	 * @model HardwareIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageHardwareID REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0xFFF\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Specified instance not found\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteStorageHardwareID(CIM_StorageHardwareID HardwareID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates a CIM_GatewayPathID and the association CIM_ConcreteDependency between this service and the new GatewayPathID.
	 * @param ElementName The ElementName of the new StorageHardwareID instance.
	 * @param StorageID StorageID is the value used by the SecurityService to represent Identity - in this case, a hardware worldwide unique name.
	 * @param IDType The type of the StorageID property. iSCSI IDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * @param OtherIDType The type of the storage ID, when IDType is "Other".
	 * @param GatewayID GatewayID is the value used by the SecurityService to represent identity of a Gateway element.
	 * @param GatewayIDType The type of the GatewayID property. iSCSI IDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * @param OtherGatewayIDType The type of the storage ID, when GatewayIDType is "Other".
	 * @param NewGatewayPathID REF to the new GatewayPathID instance.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" StorageIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" IDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"7\"]' Values='[\"Other\",\"PortWWN\",\"NodeWWN\",\"Hostname\",\"iSCSI Name\",\"SAS Address\"]' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'" OtherIDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" GatewayIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" GatewayIDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"PortWWN\",\"NodeWWN\",\"Hostname\",\"iSCSI Name\",\"SAS Address\"]'" OtherGatewayIDTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" NewGatewayPathIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_GatewayPathID REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0xFFF\",\"0x1000\",\"0x1001\",\"0x1003\",\"0x1004\",\"0x1005..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"ID already created\",\"Hardware implementation does not support specified IDType\",\"GatewayPathID already created\",\"Hardware implementation does not support specified GatewayIDType\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGatewayPathID(String ElementName, String StorageID, Integer IDType, String OtherIDType, String GatewayID, Integer GatewayIDType, String OtherGatewayIDType, CIM_GatewayPathID NewGatewayPathID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a group of StorageHardwareIDs as a new instance of SystemSpecificCollection. This is useful to define a set of authorized subjects that can access volumes in a disk array. This method allows the client to make a request of a specific Service instance to create the collection and provide the appropriate class name. When these capabilities are standardized in CIM/WBEM, this method can be deprecated and intrinsic methods used. In addition to creating the collection, this method causes the creation of the HostedCollection association (to this service's scoping system) and MemberOfCollection association to members of the IDs parameter.
	 * @param ElementName The ElementName to be assigned to the created collection.
	 * @param HardwareIDs Array of strings containing representations of references to StorageHardwareID instances that will become members of the new collection.
	 * @param Collection The new instance of SystemSpecificCollection that is created.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" HardwareIDsUnique="false" HardwareIDsMany="true"
	 *        HardwareIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'" CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemSpecificCollection REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0xFFF\",\"0x1000\",\"0x1001\",\"0x1002\",\"0x1003..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Invalid HardwareID instance\",\"Implementation does not support hardware ID collections\",\"Input hardware IDs cannot be used in same collection\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateHardwareIDCollection(String ElementName, EList<String> HardwareIDs, CIM_SystemSpecificCollection Collection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create MemberOfCollection instances between the specified Collection and the StorageHardwareIDs. This method allows the client to make a request of a specific Service instance to create the associations. When these capabilities are standardized in CIM/WBEM, this method can be deprecated and intrinsic methods used.
	 * @param HardwareIDs Array of strings containing representations of references to StorageHardwareID instances that will become members of the collection.
	 * @param Collection The Collection which groups the StorageHardwareIDs.
	 * <!-- end-model-doc -->
	 * @model HardwareIDsUnique="false" HardwareIDsMany="true"
	 *        HardwareIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'" CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemSpecificCollection REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..0xFFF\",\"0x1000\",\"0x1001\",\"0x1002\",\"0x1003..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Invalid LogicalDevice instance\",\"Implementation does not support device collections\",\"Input devices cannot be used in this collection\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddHardwareIDsToCollection(EList<String> HardwareIDs, CIM_SystemSpecificCollection Collection);

} // CIM_StorageHardwareIDManagementService
