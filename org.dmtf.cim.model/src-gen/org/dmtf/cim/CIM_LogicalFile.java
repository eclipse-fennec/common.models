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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Logical File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalFile is a named collection of data or executable code, or represents a LogicalDevice or Directory. It is located within the context of a FileSystem, on a Storage Extent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getFSCreationClassName <em>FS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getFSName <em>FS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getFileSize <em>File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getReadable <em>Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getWriteable <em>Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getExecutable <em>Executable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalFile#getInUseCount <em>In Use Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::FileElements' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as part of the key of a LogicalFile instance within a FileSystem. A unique identifier (such as a full path name) is required as a Name value. Since Files are weak to their FileSystem (and not to a Directory which would provide a more granular naming algorithm), care must be taken to make LogicalFile\'s Name unique for a given Creation ClassName and FileSystem. A full path name is one way to do this.' override.Name.MaxLen='1024' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalFile extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_FileSystem.CSCreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
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
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_FileSystem.CSName'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>FS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping FileSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FS Creation Class Name</em>' attribute.
	 * @see #setFSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_FSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_FileSystem.CreationClassName'"
	 * @generated
	 */
	String getFSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getFSCreationClassName <em>FS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FS Creation Class Name</em>' attribute.
	 * @see #getFSCreationClassName()
	 * @generated
	 */
	void setFSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>FS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping FileSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FS Name</em>' attribute.
	 * @see #setFSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_FSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_FileSystem.Name'"
	 * @generated
	 */
	String getFSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getFSName <em>FS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FS Name</em>' attribute.
	 * @see #getFSName()
	 * @generated
	 */
	void setFSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the File in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_FileSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Gauge='true' PUnit='byte'"
	 * @generated
	 */
	Long getFileSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File's creation date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_CreationDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the File was last modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_LastModified()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastModified();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(String value);

	/**
	 * Returns the value of the '<em><b>Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the File was last accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Accessed</em>' attribute.
	 * @see #setLastAccessed(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_LastAccessed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastAccessed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getLastAccessed <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accessed</em>' attribute.
	 * @see #getLastAccessed()
	 * @generated
	 */
	void setLastAccessed(String value);

	/**
	 * Returns the value of the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the File can be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Readable</em>' attribute.
	 * @see #setReadable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_Readable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getReadable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getReadable <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readable</em>' attribute.
	 * @see #getReadable()
	 * @generated
	 */
	void setReadable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the File can be written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Writeable</em>' attribute.
	 * @see #setWriteable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_Writeable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getWriteable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getWriteable <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeable</em>' attribute.
	 * @see #getWriteable()
	 * @generated
	 */
	void setWriteable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the file is executable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_Executable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getExecutable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Compression Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string indicating the algorithm or tool used to compress the LogicalFile. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the LogicalFile is compressed or not, "Compressed" to represent that the File is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the LogicalFile is not compressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Method</em>' attribute.
	 * @see #setCompressionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_CompressionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCompressionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getCompressionMethod <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Method</em>' attribute.
	 * @see #getCompressionMethod()
	 * @generated
	 */
	void setCompressionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string indicating the algorithm or tool used to encrypt the LogicalFile. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the LogicalFile is encrypted or not, "Encrypted" to represent that the File is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the LogicalFile is not encrypted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Method</em>' attribute.
	 * @see #setEncryptionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_EncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getEncryptionMethod <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Method</em>' attribute.
	 * @see #getEncryptionMethod()
	 * @generated
	 */
	void setEncryptionMethod(String value);

	/**
	 * Returns the value of the '<em><b>In Use Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer indicating the number of 'file opens' that are currently active against the File.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Use Count</em>' attribute.
	 * @see #setInUseCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalFile_InUseCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getInUseCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalFile#getInUseCount <em>In Use Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Use Count</em>' attribute.
	 * @see #getInUseCount()
	 * @generated
	 */
	void setInUseCount(Long value);

} // CIM_LogicalFile
