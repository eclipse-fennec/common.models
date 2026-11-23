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
 * A representation of the model object '<em><b>CIM Local File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from FileSystem that represents the file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LocalFileSystem#getDirectoryServiceUsage <em>Directory Service Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalFileSystem#getLocalAccessDefinitionRequired <em>Local Access Definition Required</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalFileSystem#getMultipleDisksSupported <em>Multiple Disks Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalFileSystem#getPathNameSeparatorString <em>Path Name Separator String</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocalFileSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileElements' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LocalFileSystem extends CIM_FileSystem {
	/**
	 * Returns the value of the '<em><b>Directory Service Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumerated integer specifies if the filesystem supports security principal information and therefore requires support from a file server that uses one or more directory services. If the filesystem requires such support, there must be a concrete subclass of Dependency between the LocalFileSystem element and the specified file server ComputerSystem.
	 * The enumerated values are:
	 * "Not Used" indicates that the filesystem will not support security principal information and so will not require support from a directory service.
	 * "Optional" indicates that the filesystem may support security principal information. If it does, it will require support from a directory service and the Dependency association described above must exist.
	 * "Required" indicates that the filesystem supports security principal information and will require support from a directory service. The Dependency association described above must exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directory Service Usage</em>' attribute.
	 * @see #setDirectoryServiceUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalFileSystem_DirectoryServiceUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Not Used\",\"Optional\",\"Required\"]'"
	 * @generated
	 */
	Integer getDirectoryServiceUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalFileSystem#getDirectoryServiceUsage <em>Directory Service Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Service Usage</em>' attribute.
	 * @see #getDirectoryServiceUsage()
	 * @generated
	 */
	void setDirectoryServiceUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>Local Access Definition Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumerated integer specifies if the provider requires that a file system device be made locally accessible before it can be used as a file system. If local access is required to be set up, a vendor could provide a default mechanism, for instance, making "/dev/fs1" available as "/etc/mounts/fs1" automatically in an Unix-like OS, but it can be overridden by the system administrator.If local access is not required, the file system is automatically made available by some default name (for instance, the volume at "C" is also the filesystem "C:"on Windows systems, and cannot be overridden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Access Definition Required</em>' attribute.
	 * @see #setLocalAccessDefinitionRequired(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalFileSystem_LocalAccessDefinitionRequired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Required\",\"Required -- vendor default\",\"Not Required\"]'"
	 * @generated
	 */
	Integer getLocalAccessDefinitionRequired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalFileSystem#getLocalAccessDefinitionRequired <em>Local Access Definition Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Access Definition Required</em>' attribute.
	 * @see #getLocalAccessDefinitionRequired()
	 * @generated
	 */
	void setLocalAccessDefinitionRequired(Integer value);

	/**
	 * Returns the value of the '<em><b>Multiple Disks Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumerated integer specifies if the file system type is capable of being built on multiple LogicalDisks. If "Supported", the provider can make differential use of the capabilities of the underlying multiple logical disks, for instance, by putting file system meta data on one kind of LogicalDisk and placing file data on another.
	 * The CIM_LocalFileSystem can only reside on a single LogicalDisk,but that LogicalDisk could be built up from multiple underlying logical disk using an appropriate profile. This property specifies support for capabilities that make use of that sub-structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Disks Supported</em>' attribute.
	 * @see #setMultipleDisksSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalFileSystem_MultipleDisksSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Supported\",\"Not Supported\"]'"
	 * @generated
	 */
	Integer getMultipleDisksSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalFileSystem#getMultipleDisksSupported <em>Multiple Disks Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Disks Supported</em>' attribute.
	 * @see #getMultipleDisksSupported()
	 * @generated
	 */
	void setMultipleDisksSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Name Separator String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string is used by this FileSystem for constructing a path name from the sequence of directories that leads to some contained LogicalFile (file or directory). Currently the most commonly used are '\' for Windows and '/' in Unix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Name Separator String</em>' attribute.
	 * @see #setPathNameSeparatorString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalFileSystem_PathNameSeparatorString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPathNameSeparatorString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocalFileSystem#getPathNameSeparatorString <em>Path Name Separator String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name Separator String</em>' attribute.
	 * @see #getPathNameSeparatorString()
	 * @generated
	 */
	void setPathNameSeparatorString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GetFileProperties gets a set of file records from a filesystem. As there may be millions of records in this report, a chunking mechanism is.provided so that the client does not become overwhelmed by the quantity of data furnished by the server.
	 * @param DirectoryName The DirectoryName is an optional pathname for a directory a directory to restrict the data returned. If this parameter is NULL, then files are returned for all filesin the Filesystem.
	 * @param Handle The initial call to GetFileProperties shall pass in NULL as a Handle. Subsequent calls shall pass back the Handle exactly as received from the server, without modification, asan indication of where to continue the report from.
	 * @param NumberOfFiles The NumberOfFiles is the number of files returned in a block of FileRecs. If NULL the provider will supply a default number (and put that number in the parameter as output).
	 * @param FileRecs This array parameter provides the file records as embedded instances of CIM_LogicalFile.
	 * <!-- end-model-doc -->
	 * @model DirectoryNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" HandleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" NumberOfFilesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true'" FileRecsUnique="false" FileRecsMany="true"
	 *        FileRecsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_LogicalFile'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4097..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetFileProperties(String DirectoryName, String Handle, Long NumberOfFiles, EList<String> FileRecs);

} // CIM_LocalFileSystem
