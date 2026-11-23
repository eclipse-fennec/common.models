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
 * A representation of the model object '<em><b>CIM File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A file or dataset store local to a System (such as a ComputerSystem or an ApplicationSystem) or remotely mounted from a file server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getRoot <em>Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getFileSystemSize <em>File System Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getAvailableSpace <em>Available Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCasePreserved <em>Case Preserved</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getMaxFileNameLength <em>Max File Name Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getClusterSize <em>Cluster Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getFileSystemType <em>File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getNumberOfFiles <em>Number Of Files</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getIsFixedSize <em>Is Fixed Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystem#getResizeIncrement <em>Resize Increment</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileElements' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as key of a FileSystem instance within a ComputerSystem.' override.Name.MaxLen='256' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystem extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path name or other information defining the root of the FileSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_Root()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrFSMountPoint\",\"MIF.DMTF|Host File System|001.2\"]'"
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_BlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>File System Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File System Size</em>' attribute.
	 * @see #setFileSystemSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_FileSystemSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Host File System|001.13\"]' PUnit='byte'"
	 * @generated
	 */
	Long getFileSystemSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getFileSystemSize <em>File System Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System Size</em>' attribute.
	 * @see #getFileSystemSize()
	 * @generated
	 */
	void setFileSystemSize(Long value);

	/**
	 * Returns the value of the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Space</em>' attribute.
	 * @see #setAvailableSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_AvailableSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Gauge='true' MappingStrings='[\"MIF.DMTF|Host File System|001.14\",\"MIF.DMTF|Partition|002.4\"]' PUnit='byte'"
	 * @generated
	 */
	Long getAvailableSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getAvailableSpace <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Space</em>' attribute.
	 * @see #getAvailableSpace()
	 * @generated
	 */
	void setAvailableSpace(Long value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the FileSystem is designated as read only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_ReadOnly()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrFSAccess\",\"MIF.DMTF|Host File System|001.5\"]'"
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Method</em>' attribute.
	 * @see #setEncryptionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_EncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Partition|002.8\"]'"
	 * @generated
	 */
	String getEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getEncryptionMethod <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Method</em>' attribute.
	 * @see #getEncryptionMethod()
	 * @generated
	 */
	void setEncryptionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Compression Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Method</em>' attribute.
	 * @see #setCompressionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CompressionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Partition|002.7\"]'"
	 * @generated
	 */
	String getCompressionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCompressionMethod <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Method</em>' attribute.
	 * @see #getCompressionMethod()
	 * @generated
	 */
	void setCompressionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that case sensitive file names are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CaseSensitive()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Case Preserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the case of file names are preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Preserved</em>' attribute.
	 * @see #setCasePreserved(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CasePreserved()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCasePreserved();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getCasePreserved <em>Case Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Preserved</em>' attribute.
	 * @see #getCasePreserved()
	 * @generated
	 */
	void setCasePreserved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Code Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_CodeSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"ASCII\",\"Unicode\",\"ISO2022\",\"ISO8859\",\"Extended UNIX Code\",\"UTF-8\",\"UCS-2\"]'"
	 * @generated
	 */
	EList<Integer> getCodeSet();

	/**
	 * Returns the value of the '<em><b>Max File Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max File Name Length</em>' attribute.
	 * @see #setMaxFileNameLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_MaxFileNameLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxFileNameLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getMaxFileNameLength <em>Max File Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max File Name Length</em>' attribute.
	 * @see #getMaxFileNameLength()
	 * @generated
	 */
	void setMaxFileNameLength(Long value);

	/**
	 * Returns the value of the '<em><b>Cluster Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cluster Size</em>' attribute.
	 * @see #setClusterSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_ClusterSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getClusterSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getClusterSize <em>Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Size</em>' attribute.
	 * @see #getClusterSize()
	 * @generated
	 */
	void setClusterSize(Long value);

	/**
	 * Returns the value of the '<em><b>File System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File System Type</em>' attribute.
	 * @see #setFileSystemType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_FileSystemType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Partition|002.6\",\"MIF.DMTF|Host File System|001.4\"]'"
	 * @generated
	 */
	String getFileSystemType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getFileSystemType <em>File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System Type</em>' attribute.
	 * @see #getFileSystemType()
	 * @generated
	 */
	void setFileSystemType(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_PersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Persistent\",\"Temporary\",\"External\"]' ModelCorrespondence='[\"CIM_FileSystem.OtherPersistenceType\"]'"
	 * @generated
	 */
	Integer getPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the persistence characteristics when PersistenceType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #setOtherPersistenceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_OtherPersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FileSystem.PersistenceType\"]'"
	 * @generated
	 */
	String getOtherPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getOtherPersistenceType <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #getOtherPersistenceType()
	 * @generated
	 */
	void setOtherPersistenceType(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of files contained in the FileSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Files</em>' attribute.
	 * @see #setNumberOfFiles(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_NumberOfFiles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getNumberOfFiles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getNumberOfFiles <em>Number Of Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Files</em>' attribute.
	 * @see #getNumberOfFiles()
	 * @generated
	 */
	void setNumberOfFiles(Long value);

	/**
	 * Returns the value of the '<em><b>Is Fixed Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the File size is fixed at creation time (value = 1) - the file size is fixed, (value = 2) - the file is not a fixed size. The default (value = 0) indicates that this information is not specified. If the File size is not fixed, the ResizeIncrement property should specify the growth increment, in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Fixed Size</em>' attribute.
	 * @see #setIsFixedSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_IsFixedSize()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Not Specified\",\"Fixed Size\",\"Not Fixed Size\"]' ModelCorrespondence='[\"CIM_FileSystem.ResizeIncrement\"]'"
	 * @generated
	 */
	Integer getIsFixedSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getIsFixedSize <em>Is Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Size</em>' attribute.
	 * @see #getIsFixedSize()
	 * @generated
	 */
	void setIsFixedSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Resize Increment</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The increment size of a resizable File in bytes. If the File is a fixed size, or the resize increment is not specified, the value of this property must be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resize Increment</em>' attribute.
	 * @see #setResizeIncrement(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystem_ResizeIncrement()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' ModelCorrespondence='[\"CIM_FileSystem.IsFixedSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getResizeIncrement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystem#getResizeIncrement <em>Resize Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Increment</em>' attribute.
	 * @see #getResizeIncrement()
	 * @generated
	 */
	void setResizeIncrement(Long value);

} // CIM_FileSystem
