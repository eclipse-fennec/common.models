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
 * A representation of the model object '<em><b>CIM Unix File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The UnixFile class holds properties that are valid for various subclasses of LogicalFile, in a Unix environment. This is defined as a separate and unique class since it is applicable to Unix files, directories, etc. It is associated via a FileIdentity relationship to these subclasses of LogicalFile. Unless this approach of creating and associating a separate class is used, it is necessary to subclass each of the inheritance hierarchies under LogicalFile, duplicating the properties in this class. The referenced _PC* and _POSIX* constants are defined in unistd.h. Some properties indicate whether the UNIX implementation support a feature such as asynchronous I/O or priority I/O. If supported, sysconf returns the value as defined in the appropriate header file such as unistd.h. If a feature is not supported, then pathconf returns a -1. In this case, the corresponding property should be returned without any value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getFSCreationClassName <em>FS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getFSName <em>FS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getLFCreationClassName <em>LF Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getLFName <em>LF Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getSaveText <em>Save Text</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getLinkCount <em>Link Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getFileInodeNumber <em>File Inode Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getSetUid <em>Set Uid</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getSetGid <em>Set Gid</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getLastModifiedInode <em>Last Modified Inode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getLinkMax <em>Link Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getNameMax <em>Name Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPathMax <em>Path Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPosixChownRestricted <em>Posix Chown Restricted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPosixNoTrunc <em>Posix No Trunc</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPosixAsyncIo <em>Posix Async Io</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPosixPrioIo <em>Posix Prio Io</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixFile#getPosixSyncIo <em>Posix Sync Io</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,LFCreationClassName,LFName'"
 * @generated
 */
@ProviderType
public interface CIM_UnixFile extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalFile.CSCreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalFile.CSName'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getCSName <em>CS Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_FSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalFile.FSCreationClassName'"
	 * @generated
	 */
	String getFSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getFSCreationClassName <em>FS Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_FSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalFile.FSName'"
	 * @generated
	 */
	String getFSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getFSName <em>FS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FS Name</em>' attribute.
	 * @see #getFSName()
	 * @generated
	 */
	void setFSName(String value);

	/**
	 * Returns the value of the '<em><b>LF Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping LogicalFile's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LF Creation Class Name</em>' attribute.
	 * @see #setLFCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_LFCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_LogicalFile.CreationClassName'"
	 * @generated
	 */
	String getLFCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getLFCreationClassName <em>LF Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LF Creation Class Name</em>' attribute.
	 * @see #getLFCreationClassName()
	 * @generated
	 */
	void setLFCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>LF Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping LogicalFile's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LF Name</em>' attribute.
	 * @see #setLFName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_LFName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024' Propagated='CIM_LogicalFile.Name'"
	 * @generated
	 */
	String getLFName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getLFName <em>LF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LF Name</em>' attribute.
	 * @see #getLFName()
	 * @generated
	 */
	void setLFName(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Identifer that uniquely describes the owner of this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_UserID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that describes the group that owns this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_GroupID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Save Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Save Text</em>' attribute.
	 * @see #setSaveText(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_SaveText()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSaveText();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getSaveText <em>Save Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Text</em>' attribute.
	 * @see #getSaveText()
	 * @generated
	 */
	void setSaveText(Boolean value);

	/**
	 * Returns the value of the '<em><b>Link Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of the number of names for this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Count</em>' attribute.
	 * @see #setLinkCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_LinkCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLinkCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getLinkCount <em>Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Count</em>' attribute.
	 * @see #getLinkCount()
	 * @generated
	 */
	void setLinkCount(Long value);

	/**
	 * Returns the value of the '<em><b>File Inode Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File Inode number, as printed by "ls -i".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Inode Number</em>' attribute.
	 * @see #setFileInodeNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_FileInodeNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"UNIX.TOG|ls -i\"]'"
	 * @generated
	 */
	String getFileInodeNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getFileInodeNumber <em>File Inode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Inode Number</em>' attribute.
	 * @see #getFileInodeNumber()
	 * @generated
	 */
	void setFileInodeNumber(String value);

	/**
	 * Returns the value of the '<em><b>Set Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the associated file has setuid permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Uid</em>' attribute.
	 * @see #setSetUid(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_SetUid()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSetUid();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getSetUid <em>Set Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Uid</em>' attribute.
	 * @see #getSetUid()
	 * @generated
	 */
	void setSetUid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Set Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the associated file has setgid permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Gid</em>' attribute.
	 * @see #setSetGid(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_SetGid()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSetGid();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getSetGid <em>Set Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Gid</em>' attribute.
	 * @see #getSetGid()
	 * @generated
	 */
	void setSetGid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified Inode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified Inode</em>' attribute.
	 * @see #setLastModifiedInode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_LastModifiedInode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastModifiedInode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getLastModifiedInode <em>Last Modified Inode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Inode</em>' attribute.
	 * @see #getLastModifiedInode()
	 * @generated
	 */
	void setLastModifiedInode(String value);

	/**
	 * Returns the value of the '<em><b>Link Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of links to a single file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Max</em>' attribute.
	 * @see #setLinkMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_LinkMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MinValue='8' MappingStrings='[\"POSIX.TOG|pathconf|_PC_LINK_MAX\"]'"
	 * @generated
	 */
	Long getLinkMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getLinkMax <em>Link Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Max</em>' attribute.
	 * @see #getLinkMax()
	 * @generated
	 */
	void setLinkMax(Long value);

	/**
	 * Returns the value of the '<em><b>Name Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of bytes in a filename, not including terminating null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Max</em>' attribute.
	 * @see #setNameMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_NameMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MinValue='14' MappingStrings='[\"POSIX.TOG|pathconf|_POSIX_NAME_MAX\"]' PUnit='byte'"
	 * @generated
	 */
	Long getNameMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getNameMax <em>Name Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Max</em>' attribute.
	 * @see #getNameMax()
	 * @generated
	 */
	void setNameMax(Long value);

	/**
	 * Returns the value of the '<em><b>Path Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of bytes in a pathname, including the terminating null character.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Max</em>' attribute.
	 * @see #setPathMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PathMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MinValue='255' MappingStrings='[\"POSIX.TOG|pathconf|_POSIX_PATH_MAX\"]' PUnit='byte'"
	 * @generated
	 */
	Long getPathMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPathMax <em>Path Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Max</em>' attribute.
	 * @see #getPathMax()
	 * @generated
	 */
	void setPathMax(Long value);

	/**
	 * Returns the value of the '<em><b>Posix Chown Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posix Chown Restricted</em>' attribute.
	 * @see #setPosixChownRestricted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PosixChownRestricted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"POSIX.TOG|pathconf|_PC_CHOWN_RESTRICTED\"]'"
	 * @generated
	 */
	Long getPosixChownRestricted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPosixChownRestricted <em>Posix Chown Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posix Chown Restricted</em>' attribute.
	 * @see #getPosixChownRestricted()
	 * @generated
	 */
	void setPosixChownRestricted(Long value);

	/**
	 * Returns the value of the '<em><b>Posix No Trunc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether pathname components longer than NameMax generate an error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posix No Trunc</em>' attribute.
	 * @see #setPosixNoTrunc(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PosixNoTrunc()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"POSIX.TOG|pathconf|_PC_NO_TRUNC\"]' ModelCorrespondence='[\"CIM_UnixFile.NameMax\"]'"
	 * @generated
	 */
	Long getPosixNoTrunc();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPosixNoTrunc <em>Posix No Trunc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posix No Trunc</em>' attribute.
	 * @see #getPosixNoTrunc()
	 * @generated
	 */
	void setPosixNoTrunc(Long value);

	/**
	 * Returns the value of the '<em><b>Posix Async Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether asynchronous input or output operations may be performed for the associated file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posix Async Io</em>' attribute.
	 * @see #setPosixAsyncIo(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PosixAsyncIo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"POSIX.TOG|pathconf|_PC_ASYNC_IO\"]'"
	 * @generated
	 */
	Long getPosixAsyncIo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPosixAsyncIo <em>Posix Async Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posix Async Io</em>' attribute.
	 * @see #getPosixAsyncIo()
	 * @generated
	 */
	void setPosixAsyncIo(Long value);

	/**
	 * Returns the value of the '<em><b>Posix Prio Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether prioritized input or output operations may be performed for the associated file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posix Prio Io</em>' attribute.
	 * @see #setPosixPrioIo(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PosixPrioIo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"POSIX.TOG|pathconf|_PC_PRIO_IO\"]'"
	 * @generated
	 */
	Long getPosixPrioIo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPosixPrioIo <em>Posix Prio Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posix Prio Io</em>' attribute.
	 * @see #getPosixPrioIo()
	 * @generated
	 */
	void setPosixPrioIo(Long value);

	/**
	 * Returns the value of the '<em><b>Posix Sync Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether synchronised input or output operations may be performed for the associated file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posix Sync Io</em>' attribute.
	 * @see #setPosixSyncIo(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixFile_PosixSyncIo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"POSIX.TOG|pathconf|_PC_SYNC_IO\"]'"
	 * @generated
	 */
	Long getPosixSyncIo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixFile#getPosixSyncIo <em>Posix Sync Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posix Sync Io</em>' attribute.
	 * @see #getPosixSyncIo()
	 * @generated
	 */
	void setPosixSyncIo(Long value);

} // CIM_UnixFile
