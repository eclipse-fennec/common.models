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
 * A representation of the model object '<em><b>CIM File System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileSystemCapabilities specifies the combination of properties that a FileSystemService can support when creating or maintaining FileSystems. Each supported combination of properties is specified by a FileSystemSetting that is associated with the FileSystemCapabilities element via ElementSettingData. 
 * A FileSystemCapabilities element specifies the properties supported when using it. 
 * This class provides a CreateGoal method that can be used to create a FileSystemSetting element that can be used as a goal for creating or modifying a filesystem. This class also supports persistence and recoverability of a FileSystem and its contained elements as defined in CIM 2.8 for the use of DatabaseStorageArea.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getSupportedPersistenceTypes <em>Supported Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getSupportedOtherPersistenceTypes <em>Supported Other Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getActualFileSystemType <em>Actual File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getSupportedObjectTypes <em>Supported Object Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getSupportedOperations <em>Supported Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemCapabilities#getSupportedProperties <em>Supported Properties</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::System::FilesystemServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Persistence Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values representing the persistence capabilities of the FileSystem. A value of "Persistent" indicates that the FileSystem supports persistence, can be preserved through an orderly shutdown and could be protected. A value of "Temporary" indicates that the FileSystem supports non-persistence, may not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem could controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Persistence Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_SupportedPersistenceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FileSystemSetting.PersistenceTypes\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Persistent\",\"Temporary\",\"External\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemCapabilities.SupportedPersistenceTypes\",\"CIM_FileSystem.PersistenceType\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedPersistenceTypes();

	/**
	 * Returns the value of the '<em><b>Supported Other Persistence Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings describing the persistence capabilities where the corresponding entry in SupportedPersistenceTypes has a value of "Other". This value is ignored in all other cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Other Persistence Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_SupportedOtherPersistenceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_FileSystemSetting.OtherPersistenceTypes\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemCapabilities.SupportedPersistenceTypes\",\"CIM_FileSystem.OtherPersistenceType\"]'"
	 * @generated
	 */
	EList<String> getSupportedOtherPersistenceTypes();

	/**
	 * Returns the value of the '<em><b>Actual File System Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that indicates the file system implementation type supported by this Capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual File System Type</em>' attribute.
	 * @see #setActualFileSystemType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_ActualFileSystemType()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"UFS\",\"HFS\",\"FAT\",\"FAT16\",\"FAT32\",\"NTFS4\",\"NTFS5\",\"XFS\",\"AFS\",\"EXT2\",\"EXT3\",\"REISERFS\",\"WAFL\",\"SpinFS\",\"EMC_CMFS\",\"EMC_CVFS\",\"EMC_MGFS\",\"EMC_NMFS\",\"EMC_SVFS\",\"EMC_UXFS\",\"EMC_DHSM\",\"EMC_RAWFS\",\"EMC_IPFS\",\"EMC_SFS\",\"VXFS\",\"ReFS\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_FileSystemSetting.ActualFileSystemType\"]'"
	 * @generated
	 */
	Integer getActualFileSystemType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemCapabilities#getActualFileSystemType <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual File System Type</em>' attribute.
	 * @see #getActualFileSystemType()
	 * @generated
	 */
	void setActualFileSystemType(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Object Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that specifies the set of object types that are supported for specifying FileSystems using the CreateFileSystem extrinsic Method. This array is associated with a number of correspondingly indexed properties that specify the size and number of such objects. 
	 * "inodes" indicates that the number of required inodes is specified. "files" indicates that the number of required files is specified. "directories" indicates that the number of required directories is specified. "links" indicates that the number of required links is specified. "devices" indicates that the number of required devices is specified. "files/directories" indicates that the number of required files and directories is specified. "blocks" indicates that the size of required storage in client-specific storage units is specified. This represents the desired size of available space in the filesystem, exclusive of space reserved for meta-data and for other system functions. If "blocks" is specified, the corresponding ObjectSize properties must all be the same and must specify the intended size of the blocks in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Object Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_SupportedObjectTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"inodes\",\"files\",\"directories\",\"links\",\"devices\",\"files/directories\",\"blocks\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedObjectTypes();

	/**
	 * Returns the value of the '<em><b>Supported Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values representing the operations to files and directories on the file system. Set of supported operations depends on the file system type. The operation information is used as the action type in the access control management.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Operations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_SupportedOperations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Read\",\"Write\",\"Execute\",\"Create\",\"Rename\",\"Delete\",\"Change Attribute\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedOperations();

	/**
	 * Returns the value of the '<em><b>Supported Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of property names of the Setting that this Capabilities element supports. The Object-related parameters are specified individually by object type in the SupportedObjectTypes property.
	 * "DataExtentsSharing" indicates that the DataExtentsSharing property is supported.
	 * "CopyTarget" indicates that the CopyTarget property is supported.
	 * "FilenameCaseAttributes" indicates that the FilenameCaseAttributes property is supported.
	 * "FilenameStreamFormats" indicates that the FilenameStreamFormats property is supported.
	 * "FilenameFormats" indicates that the FilenameFormats, FilenameLengthMax, and FilenameReservedCharacterSet properties are supported.
	 * "LockingSemantics" indicates that the SupportedLockingSemantics property is supported.
	 * "AuthorizationProtocols" indicates that the SupportedAuthorizationProtocols property is supported.
	 * "AuthenticationProtocols" indicates that the SupportedAuthenticationProtocols property is supported.
	 * "Persistence" indicates that the PersistenceTypes and OtherPersistenceTypes properties are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Properties</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemCapabilities_SupportedProperties()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..\"]' Values='[\"DataExtentsSharing\",\"CopyTarget\",\"FilenameCaseAttributes\",\"FilenameStreamFormats\",\"FilenameFormats\",\"LockingSemantics\",\"AuthorizationProtocols\",\"AuthenticationProtocols\",\"Persistence\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create a supported FileSystemSetting from a FileSystemSetting provided by the caller. If the operation completes successfully and did not require a long-running ConcreteJob, it will return 0. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. A Reference to the ConcreteJob will be returned in the output parameter Job. 
	 * This method MAY return a CIM_Error representing that a single named property of a setting (or other) parameter (either reference or embedded object) has an invalid value or that an invalid combination of named properties of a setting (or other) parameter (either reference or embedded object) has been requested. 
	 * If the input TemplateGoal is NULL or the empty string, this method returns a default FileSystemSetting that is supported by this FileSystemCapabilities. 
	 * The output is returned as the SupportedGoal parameter. Both TemplateGoal and SupportedGoal are embedded objects and do not exist in the provider but are maintained by the client. 
	 * If the TemplateGoal specifies values that cannot be supported this method MUST return an appropriate error and should return a best match for a SupportedGoal.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TemplateGoal TemplateGoal is an element of class CIM_FileSystemSetting, or a derived class, encoded as a string-valued embedded object parameter, that is used as the template to be matched .
	 * @param SupportedGoal SupportedGoal is an element of class CIM_FileSystemSetting, or a derived class, encoded as a string-valued embedded object parameter, that is used to return the best supported match to the TemplateGoal.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TemplateGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FileSystemSetting'" SupportedGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='false' Out='true' EmbeddedInstance='CIM_FileSystemSetting'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"TemplateGoal is not well-formed\",\"TemplateGoal cannot be satisfied exactly\",\"StorageSetting cannot be used with ActualFileSystemType\",\"StorageSetting cannot be used with CopyTarget\",\"StorageSetting cannot be used with ObjectType\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer CreateGoal(CIM_ConcreteJob Job, String TemplateGoal, String SupportedGoal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This returns the restrictions on the ElementName in the related "OUT" parameters.
	 * @param SupportedFeatures
	 *   Enumeration indicating what methods can accept the element name for creation or modification of a storage element. 
	 *   CreateFileSystem is an example of an InvokeMethod. ModifyInstance and SetProperty are examples of intrinsic methods.
	 *   An empty array indicates ElementNaming for ElementType is not supported, in which case the other OUT parameters are null.
	 * @param ElementNameMask
	 *   This string expresses the restrictions on ElementName. The mask is expressed as a regular expression. See DMTF standard ABNF with the Management Profile Specification Usage Guide, appendix C for the regular expression syntax permitted. 
	 *   Since the ElementNameMask can describe the maximum length of the ElementName,any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length). The ElementName value satisfies the restriction, if and only if it matches the regular expression. 
	 *   If NULL, it indicates no restrictions on the ElementName.
	 * @param MaxElementNameLen Maximum supported ElementName length in characters.
	 * <!-- end-model-doc -->
	 * @model SupportedFeaturesUnique="false" SupportedFeaturesMany="true"
	 *        SupportedFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"ElementName can be supplied during creation\",\"ElementName can be modified with InvokeMethod\",\"ElementName can be modified with intrinsic method\",\"DMTF Reserved\",\"Vendor Specific\"]'" ElementNameMaskAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'" MaxElementNameLenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' MaxValue='256' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|MaxNameChars\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetElementNameCapabilities(EList<Long> SupportedFeatures, String ElementNameMask, Integer MaxElementNameLen);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the "expected" size of StorageExtent that would support a file system specified by the input FileSystemGoal parameter assuming that the other settings for the StorageExtent are specified by the ExtentSetting parameter. 
	 * If the input FileSystemGoal or the ExtentSetting are NULL, this method returns a value computed by using the default FileSystemSetting or some vendor-specific canned StorageSetting. 
	 * A value of 0 is returned if this method is not able to determine a reasonable size or does not restrict sizes based on setting information.
	 * @param FileSystemGoal FileSystemGoal is an element of class CIM_FileSystemSetting, or a derived class, encoded as a string-valued embedded object parameter, that is used to specify the settings for the FileSystem to be created.
	 * @param ExtentSetting ExtentSetting is an element of class CIM_StorageSetting, or a derived class, encoded as a string-valued embedded object parameter, that is used to specify the settings of the StorageExtent to be used for this FileSystem.
	 * @param ExpectedSize A number that indicates the size of the storage extent that this FileSystem is expected to need. A value of 0 indicates that there is no expected size.
	 * @param MinimumSizeAcceptable A number that indicates the size of the smallest storage extent that would support the specified FileSystem. A value of 0 indicates that there is no minimum size.
	 * @param MaximumSizeUsable A number that indicates the size of the largest storage extent that would be usable for the specified FileSystem. A value of 0 indicates that there is no maximum size.
	 * <!-- end-model-doc -->
	 * @model FileSystemGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FileSystemSetting'" ExtentSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_StorageSetting'" ExpectedSizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" MinimumSizeAcceptableAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" MaximumSizeUsableAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long GetRequiredStorageSize(String FileSystemGoal, String ExtentSetting, Long ExpectedSize, Long MinimumSizeAcceptable, Long MaximumSizeUsable);

} // CIM_FileSystemCapabilities
