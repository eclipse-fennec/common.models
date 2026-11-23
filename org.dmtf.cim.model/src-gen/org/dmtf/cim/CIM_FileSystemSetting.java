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
 * A representation of the model object '<em><b>CIM File System Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FileSystemSetting describes the attribute values set when creating a FileSystem by a FileSystemConfigurationService. These settings can be associated via the ElementSettingData association with the created FileSystem. If the setting is associated via SettingAssociatedToCapabilities to a FileSystemCapabilities, it is one of the canned settings supported by this capabilities instance. A setting can also be an embedded instance parameter to a method (for instance, when used as a Goal parameter). 
 * A NULL value for a property in a canned setting indicates support for a vendor-specific default. A NULL value for a property when the setting is used as a Goal parameter to a method indicates that the client does not care what value that property will have on creation and will accept any vendor-supplied default. When used with a FileSystem, a NULL value for a property must be interpreted as "Unknown". The ActualFileSystemType property cannot have a default value in any context. If this Setting is associated with a FileSystemCapabilities element via SettingAssociatedToCapabilities, the value of ActualFileSystemType in the Setting and the Capabilities MUST match. 
 * This class also supports persistence and recoverability of a FileSystem and its contained elements as defined in CIM 2.8 for the use of DatabaseStorageArea.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getActualFileSystemType <em>Actual File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getDataExtentsSharing <em>Data Extents Sharing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getCopyTarget <em>Copy Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameCaseAttributes <em>Filename Case Attributes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getObjectTypes <em>Object Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getNumberOfObjectsMin <em>Number Of Objects Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getNumberOfObjectsMax <em>Number Of Objects Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getNumberOfObjects <em>Number Of Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getObjectSize <em>Object Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getObjectSizeMin <em>Object Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getObjectSizeMax <em>Object Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameStreamFormats <em>Filename Stream Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameFormats <em>Filename Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameLengthMax <em>Filename Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameReservedCharacterSet <em>Filename Reserved Character Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getSupportedLockingSemantics <em>Supported Locking Semantics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getSupportedAuthorizationProtocols <em>Supported Authorization Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getSupportedAuthenticationProtocols <em>Supported Authentication Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getPersistenceTypes <em>Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSetting#getOtherPersistenceTypes <em>Other Persistence Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::System::FilesystemServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Actual File System Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that indicates the file system implementation type supported by this Setting. This property MUST exist and have a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual File System Type</em>' attribute.
	 * @see #setActualFileSystemType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_ActualFileSystemType()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"UFS\",\"HFS\",\"FAT\",\"FAT16\",\"FAT32\",\"NTFS4\",\"NTFS5\",\"XFS\",\"AFS\",\"EXT2\",\"EXT3\",\"REISERFS\",\"WAFL\",\"SpinFS\",\"EMC_CMFS\",\"EMC_CVFS\",\"EMC_MGFS\",\"EMC_NMFS\",\"EMC_SVFS\",\"EMC_UXFS\",\"EMC_DHSM\",\"EMC_RAWFS\",\"EMC_IPFS\",\"EMC_SFS\",\"VXFS\",\"ReFS\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_FileSystemCapabilities.ActualFileSystemType\"]'"
	 * @generated
	 */
	Integer getActualFileSystemType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSetting#getActualFileSystemType <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual File System Type</em>' attribute.
	 * @see #getActualFileSystemType()
	 * @generated
	 */
	void setActualFileSystemType(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Extents Sharing</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if the FileSystem supports or enforces sharing of data extents between objects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Extents Sharing</em>' attribute.
	 * @see #setDataExtentsSharing(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_DataExtentsSharing()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"No Sharing\",\"Sharing Possible/Optional\",\"Sharing Enforced\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getDataExtentsSharing();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSetting#getDataExtentsSharing <em>Data Extents Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Extents Sharing</em>' attribute.
	 * @see #getDataExtentsSharing()
	 * @generated
	 */
	void setDataExtentsSharing(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Target</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if this FileSystem can be a target for synchronization with or mirror of another FileSystem, or if it cannot be a target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Target</em>' attribute.
	 * @see #setCopyTarget(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_CopyTarget()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Can be a Primary only\",\"Can be a Mirror only\",\"Can be a Synchronization Target\",\"Can be a Backup Target\",\"Write Once\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getCopyTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSetting#getCopyTarget <em>Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Target</em>' attribute.
	 * @see #getCopyTarget()
	 * @generated
	 */
	void setCopyTarget(Integer value);

	/**
	 * Returns the value of the '<em><b>Filename Case Attributes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies how this FileSystem supports the case of characters in the Filename. Note that the host and the service may support multiple conflicting features, but each FileSystem must be configured with only one of the supported features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename Case Attributes</em>' attribute.
	 * @see #setFilenameCaseAttributes(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_FilenameCaseAttributes()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Case-sensitive\",\"Case-forced to upper case\",\"Case-forced to lower-case\",\"Case-indifferent but lost\",\"Case-indifferent but preserved\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getFilenameCaseAttributes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSetting#getFilenameCaseAttributes <em>Filename Case Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename Case Attributes</em>' attribute.
	 * @see #getFilenameCaseAttributes()
	 * @generated
	 */
	void setFilenameCaseAttributes(Integer value);

	/**
	 * Returns the value of the '<em><b>Object Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that specifies the set of object types that this FileSystem supports. This array is associated with a number of correspondingly indexed properties that specify the size and number of such objects. 
	 * When used as a goal, the client needs to specify only the subset of objects that they wish to specify; when used in a Setting associated with the FileSystem, this should contain all the types that the provider knows about; when used in a Setting associated with a Capabilities, this may only contain the types that the client can modify.
	 * "inodes" indicates that the number of required inodes is specified."files" indicates that the number of required files is specified."directories" indicates that the number of required directories is specified."links" indicates that the number of required links is specified."devices" indicates that the number of required devices is specified."files/directories" indicates that the number of required files and directories is specified."blocks" indicates that the size of required storage in client-specific storage units is specified. This represents the desired size of available space in the filesystem, exclusive of space reserved for meta-data and for other system functions. If "blocks" is specified, the corresponding ObjectSize properties must all be the same and must specify the intended size of the blocks in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_ObjectTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"inodes\",\"files\",\"directories\",\"links\",\"devices\",\"files/directories\",\"Blocks\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.NumberOfObjects\",\"CIM_FileSystemSetting.NumberOfObjectsMax\",\"CIM_FileSystemSetting.NumberOfObjectsMin\",\"CIM_FileSystemSetting.ObjectSize\",\"CIM_FileSystemSetting.ObjectSizeMax\",\"CIM_FileSystemSetting.ObjectSizeMin\"]'"
	 * @generated
	 */
	EList<Integer> getObjectTypes();

	/**
	 * Returns the value of the '<em><b>Number Of Objects Min</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the minimum number of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem MUST be able to contain. A value of 0 implies that there is no specific minimum associated with this setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Objects Min</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_NumberOfObjectsMin()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]'"
	 * @generated
	 */
	EList<Long> getNumberOfObjectsMin();

	/**
	 * Returns the value of the '<em><b>Number Of Objects Max</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the maximum number of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem MUST be able to contain. A value of 0 implies that there is no specific maximum associated with this setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Objects Max</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_NumberOfObjectsMax()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]'"
	 * @generated
	 */
	EList<Long> getNumberOfObjectsMax();

	/**
	 * Returns the value of the '<em><b>Number Of Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the number of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem will "normally" contain. A value of 0 implies that there is no specific number associated with this setting. When the Setting is associated with a FileSystemCapabilities element, this is the default; When the Setting is associated with a FileSystem element, this is the expected value; When the Setting is used as an embedded parameter to a method this is the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Objects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_NumberOfObjects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]'"
	 * @generated
	 */
	EList<Long> getNumberOfObjects();

	/**
	 * Returns the value of the '<em><b>Object Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the size of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem will "normally" contain. A value of 0 implies that there is no specific number associated with this setting. When the Setting is associated with a FileSystemCapabilities element, this is the default; When the Setting is associated with a FileSystem element, this is the expected value; When the Setting is used as an embedded parameter to a method this is the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Size</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_ObjectSize()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' Units='Bytes' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]' PUnit='byte'"
	 * @generated
	 */
	EList<Long> getObjectSize();

	/**
	 * Returns the value of the '<em><b>Object Size Min</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the minimum size of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem will "normally" contain. A value of 0 implies that there is no specific minimum associated with this setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Size Min</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_ObjectSizeMin()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' Units='Bytes' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]' PUnit='byte'"
	 * @generated
	 */
	EList<Long> getObjectSizeMin();

	/**
	 * Returns the value of the '<em><b>Object Size Max</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specifies the maximum size of objects (corresponding to the entry in the ObjectTypes array) that this FileSystem will "normally" contain. A value of 0 implies that there is no specific maximum associated with this setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Size Max</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_ObjectSizeMax()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' Units='Bytes' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.ObjectTypes\"]' PUnit='byte'"
	 * @generated
	 */
	EList<Long> getObjectSizeMax();

	/**
	 * Returns the value of the '<em><b>Filename Stream Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers representing the filename stream formats that the file system can support for access. The interpretation of these stream formats can be specific to vendors, or provided by some standard. But even within those constraints, the interpretation could be locale-specific or version-specific. For instance, Bytestream is locale-specific and is interpreted as ASCII for NFS v2 and v3 but UTF-8 in NFS v4. This additional information will normally be provided in the setting for the protocol used to access an element of this file system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename Stream Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_FilenameStreamFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"ASCII\",\"WideChar\",\"MBCS\",\"UTF-8\",\"UNICODE UCS-16\",\"UNICODE UCS-32\",\"CIFS Client-interpreted\",\"Bytestream\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getFilenameStreamFormats();

	/**
	 * Returns the value of the '<em><b>Filename Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that specify the filename formats supported on this FileSystem for naming files. Some common formats are: 
	 * a) DOS 8.3 
	 * b) VMS 'name.extension;version' where the extension specifies a file type 
	 * c) Unix name (file type is not specified in the name) 
	 * d) Windows 'name{.ext}*' where any of the exts can specify a file type 
	 * For each entry in this array there is an associated maximum length for the name and an associated reserved set of characters. 
	 * The interpretation of the maximum length of the name as well as the FilenameReservedCharacterSet string is vendor-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_FilenameFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"DOS8.3\",\"Unix\",\"VMS\",\"Windows LongNames\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.FilenameLengthMax\",\"CIM_FileSystemSetting.FilenameReservedCharacterSet\"]'"
	 * @generated
	 */
	EList<Integer> getFilenameFormats();

	/**
	 * Returns the value of the '<em><b>Filename Length Max</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that specify the maximum number of characters in a filename corresponding to an entry in the FilenameFormats property. 
	 * An entry of '0xFFFF' (the largest 16-bit integer) is interpreted as an indefinite length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename Length Max</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_FilenameLengthMax()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.FilenameFormats\"]'"
	 * @generated
	 */
	EList<Integer> getFilenameLengthMax();

	/**
	 * Returns the value of the '<em><b>Filename Reserved Character Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that specifies the characters that may not appear in the name of any file contained by this FileSystem corresponding to the entry in the FilenameFormats property. 
	 * Note: It is not clear exactly how this works with the FilenameStreamFormats property above, since the format implicitly specifies the set of allowed characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename Reserved Character Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_FilenameReservedCharacterSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.FilenameFormats\"]'"
	 * @generated
	 */
	EList<String> getFilenameReservedCharacterSet();

	/**
	 * Returns the value of the '<em><b>Supported Locking Semantics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that represent the locking semantics that the FileSystem can support for controlled access. A file system can support more than one locking model. Just because a file system supports more than one model does not imply that it supports them simultaneously for an element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Locking Semantics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_SupportedLockingSemantics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"NLM/NFSv3\",\"NFSv4 Share Reservations\",\"NFSv4 Byte-range locking\",\"NFSv4 Delegations\",\"CIFS Sharing locks\",\"CIFS Byte-range locks\",\"CIFS Exclusive/Batch oplocks\",\"CIFS Level II oplocks\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getSupportedLockingSemantics();

	/**
	 * Returns the value of the '<em><b>Supported Authorization Protocols</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that represent the authorization protocols that the FileSystem will support for access to objects by users, groups, accounts, etc. A FileSystem can support more than one authorization protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Authorization Protocols</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_SupportedAuthorizationProtocols()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Posix Permissions\",\"Posix ACLs\",\"NFSv4 ACLs\",\"NTFS4\",\"NTFS5\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getSupportedAuthorizationProtocols();

	/**
	 * Returns the value of the '<em><b>Supported Authentication Protocols</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that represent the authentication protocols that the FileSystem will support for access to objects by users, groups, accounts, etc.. 
	 * An entry of '0' is not allowed. 
	 * A FileSystem can support more than one authentication protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Authentication Protocols</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_SupportedAuthenticationProtocols()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"AUTH_NONE\",\"AUTH_SYS\",\"AUTH_DH\",\"AUTH_KRB4\",\"AUTH_KRB5\",\"RPCSEC_GSS LIPKEY\",\"RPCSEC_GSS SPKM-3\",\"RPCSEC_GSS Challenge-Response\",\"NTLM v1\",\"NTLM v2\",\"Plain Text\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getSupportedAuthenticationProtocols();

	/**
	 * Returns the value of the '<em><b>Persistence Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values representing the persistence attributes of the FileSystem. A value of "Persistent" indicates that the FileSystem supports persistence, can be preserved through an orderly shutdown and could be protected. A value of "Temporary" indicates that the FileSystem supports non-persistence, may not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem could controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the corresponding entry of the OtherPersistenceTypes property, and is expected to be rarely, if ever, used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_PersistenceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..\"]' Values='[\"Unknown\",\"Other\",\"Persistent\",\"Temporary\",\"External\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.OtherPersistenceTypes\",\"CIM_FileSystem.PersistenceType\"]'"
	 * @generated
	 */
	EList<Integer> getPersistenceTypes();

	/**
	 * Returns the value of the '<em><b>Other Persistence Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings describing the persistence attributes where the corresponding entry in the PersistenceTypes property has a value of "Other". This value is ignored in all other cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Persistence Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSetting_OtherPersistenceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FileSystemSetting.PersistenceTypes\",\"CIM_FileSystem.OtherPersistenceType\"]'"
	 * @generated
	 */
	EList<String> getOtherPersistenceTypes();

} // CIM_FileSystemSetting
