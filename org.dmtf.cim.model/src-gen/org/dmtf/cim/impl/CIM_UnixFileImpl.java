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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_UnixFile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getFSCreationClassName <em>FS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getFSName <em>FS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getLFCreationClassName <em>LF Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getLFName <em>LF Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getSaveText <em>Save Text</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getLinkCount <em>Link Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getFileInodeNumber <em>File Inode Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getSetUid <em>Set Uid</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getSetGid <em>Set Gid</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getLastModifiedInode <em>Last Modified Inode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getLinkMax <em>Link Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getNameMax <em>Name Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPathMax <em>Path Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPosixChownRestricted <em>Posix Chown Restricted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPosixNoTrunc <em>Posix No Trunc</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPosixAsyncIo <em>Posix Async Io</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPosixPrioIo <em>Posix Prio Io</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixFileImpl#getPosixSyncIo <em>Posix Sync Io</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixFileImpl extends CIM_LogicalElementImpl implements CIM_UnixFile {
	/**
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFSCreationClassName() <em>FS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFSCreationClassName() <em>FS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String fsCreationClassName = FS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFSName() <em>FS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSName()
	 * @generated
	 * @ordered
	 */
	protected static final String FS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFSName() <em>FS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSName()
	 * @generated
	 * @ordered
	 */
	protected String fsName = FS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLFCreationClassName() <em>LF Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLFCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LF_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLFCreationClassName() <em>LF Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLFCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String lfCreationClassName = LF_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLFName() <em>LF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLFName()
	 * @generated
	 * @ordered
	 */
	protected static final String LF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLFName() <em>LF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLFName()
	 * @generated
	 * @ordered
	 */
	protected String lfName = LF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected String groupID = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveText() <em>Save Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveText()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SAVE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveText() <em>Save Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveText()
	 * @generated
	 * @ordered
	 */
	protected Boolean saveText = SAVE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkCount() <em>Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkCount() <em>Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCount()
	 * @generated
	 * @ordered
	 */
	protected Long linkCount = LINK_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileInodeNumber() <em>File Inode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileInodeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_INODE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileInodeNumber() <em>File Inode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileInodeNumber()
	 * @generated
	 * @ordered
	 */
	protected String fileInodeNumber = FILE_INODE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetUid() <em>Set Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetUid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SET_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetUid() <em>Set Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetUid()
	 * @generated
	 * @ordered
	 */
	protected Boolean setUid = SET_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetGid() <em>Set Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetGid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SET_GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetGid() <em>Set Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetGid()
	 * @generated
	 * @ordered
	 */
	protected Boolean setGid = SET_GID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedInode() <em>Last Modified Inode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedInode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_INODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedInode() <em>Last Modified Inode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedInode()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedInode = LAST_MODIFIED_INODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkMax() <em>Link Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkMax() <em>Link Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMax()
	 * @generated
	 * @ordered
	 */
	protected Long linkMax = LINK_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameMax() <em>Name Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long NAME_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameMax() <em>Name Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameMax()
	 * @generated
	 * @ordered
	 */
	protected Long nameMax = NAME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathMax() <em>Path Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long PATH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathMax() <em>Path Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathMax()
	 * @generated
	 * @ordered
	 */
	protected Long pathMax = PATH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosixChownRestricted() <em>Posix Chown Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixChownRestricted()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSIX_CHOWN_RESTRICTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosixChownRestricted() <em>Posix Chown Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixChownRestricted()
	 * @generated
	 * @ordered
	 */
	protected Long posixChownRestricted = POSIX_CHOWN_RESTRICTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosixNoTrunc() <em>Posix No Trunc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixNoTrunc()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSIX_NO_TRUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosixNoTrunc() <em>Posix No Trunc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixNoTrunc()
	 * @generated
	 * @ordered
	 */
	protected Long posixNoTrunc = POSIX_NO_TRUNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosixAsyncIo() <em>Posix Async Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixAsyncIo()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSIX_ASYNC_IO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosixAsyncIo() <em>Posix Async Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixAsyncIo()
	 * @generated
	 * @ordered
	 */
	protected Long posixAsyncIo = POSIX_ASYNC_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosixPrioIo() <em>Posix Prio Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixPrioIo()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSIX_PRIO_IO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosixPrioIo() <em>Posix Prio Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixPrioIo()
	 * @generated
	 * @ordered
	 */
	protected Long posixPrioIo = POSIX_PRIO_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosixSyncIo() <em>Posix Sync Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixSyncIo()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSIX_SYNC_IO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosixSyncIo() <em>Posix Sync Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosixSyncIo()
	 * @generated
	 * @ordered
	 */
	protected Long posixSyncIo = POSIX_SYNC_IO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__CS_NAME, oldCSName, csName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFSCreationClassName() {
		return fsCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFSCreationClassName(String newFSCreationClassName) {
		String oldFSCreationClassName = fsCreationClassName;
		fsCreationClassName = newFSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__FS_CREATION_CLASS_NAME, oldFSCreationClassName, fsCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFSName() {
		return fsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFSName(String newFSName) {
		String oldFSName = fsName;
		fsName = newFSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__FS_NAME, oldFSName, fsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLFCreationClassName() {
		return lfCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLFCreationClassName(String newLFCreationClassName) {
		String oldLFCreationClassName = lfCreationClassName;
		lfCreationClassName = newLFCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__LF_CREATION_CLASS_NAME, oldLFCreationClassName, lfCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLFName() {
		return lfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLFName(String newLFName) {
		String oldLFName = lfName;
		lfName = newLFName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__LF_NAME, oldLFName, lfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupID() {
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupID(String newGroupID) {
		String oldGroupID = groupID;
		groupID = newGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__GROUP_ID, oldGroupID, groupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSaveText() {
		return saveText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveText(Boolean newSaveText) {
		Boolean oldSaveText = saveText;
		saveText = newSaveText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__SAVE_TEXT, oldSaveText, saveText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkCount() {
		return linkCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkCount(Long newLinkCount) {
		Long oldLinkCount = linkCount;
		linkCount = newLinkCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__LINK_COUNT, oldLinkCount, linkCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileInodeNumber() {
		return fileInodeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileInodeNumber(String newFileInodeNumber) {
		String oldFileInodeNumber = fileInodeNumber;
		fileInodeNumber = newFileInodeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__FILE_INODE_NUMBER, oldFileInodeNumber, fileInodeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSetUid() {
		return setUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetUid(Boolean newSetUid) {
		Boolean oldSetUid = setUid;
		setUid = newSetUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__SET_UID, oldSetUid, setUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSetGid() {
		return setGid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetGid(Boolean newSetGid) {
		Boolean oldSetGid = setGid;
		setGid = newSetGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__SET_GID, oldSetGid, setGid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedInode() {
		return lastModifiedInode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedInode(String newLastModifiedInode) {
		String oldLastModifiedInode = lastModifiedInode;
		lastModifiedInode = newLastModifiedInode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__LAST_MODIFIED_INODE, oldLastModifiedInode, lastModifiedInode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkMax() {
		return linkMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkMax(Long newLinkMax) {
		Long oldLinkMax = linkMax;
		linkMax = newLinkMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__LINK_MAX, oldLinkMax, linkMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNameMax() {
		return nameMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameMax(Long newNameMax) {
		Long oldNameMax = nameMax;
		nameMax = newNameMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__NAME_MAX, oldNameMax, nameMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPathMax() {
		return pathMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathMax(Long newPathMax) {
		Long oldPathMax = pathMax;
		pathMax = newPathMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__PATH_MAX, oldPathMax, pathMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPosixChownRestricted() {
		return posixChownRestricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosixChownRestricted(Long newPosixChownRestricted) {
		Long oldPosixChownRestricted = posixChownRestricted;
		posixChownRestricted = newPosixChownRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__POSIX_CHOWN_RESTRICTED, oldPosixChownRestricted, posixChownRestricted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPosixNoTrunc() {
		return posixNoTrunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosixNoTrunc(Long newPosixNoTrunc) {
		Long oldPosixNoTrunc = posixNoTrunc;
		posixNoTrunc = newPosixNoTrunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__POSIX_NO_TRUNC, oldPosixNoTrunc, posixNoTrunc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPosixAsyncIo() {
		return posixAsyncIo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosixAsyncIo(Long newPosixAsyncIo) {
		Long oldPosixAsyncIo = posixAsyncIo;
		posixAsyncIo = newPosixAsyncIo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__POSIX_ASYNC_IO, oldPosixAsyncIo, posixAsyncIo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPosixPrioIo() {
		return posixPrioIo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosixPrioIo(Long newPosixPrioIo) {
		Long oldPosixPrioIo = posixPrioIo;
		posixPrioIo = newPosixPrioIo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__POSIX_PRIO_IO, oldPosixPrioIo, posixPrioIo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPosixSyncIo() {
		return posixSyncIo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosixSyncIo(Long newPosixSyncIo) {
		Long oldPosixSyncIo = posixSyncIo;
		posixSyncIo = newPosixSyncIo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_FILE__POSIX_SYNC_IO, oldPosixSyncIo, posixSyncIo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_FILE__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_UNIX_FILE__CS_NAME:
				return getCSName();
			case CimPackage.CIM_UNIX_FILE__FS_CREATION_CLASS_NAME:
				return getFSCreationClassName();
			case CimPackage.CIM_UNIX_FILE__FS_NAME:
				return getFSName();
			case CimPackage.CIM_UNIX_FILE__LF_CREATION_CLASS_NAME:
				return getLFCreationClassName();
			case CimPackage.CIM_UNIX_FILE__LF_NAME:
				return getLFName();
			case CimPackage.CIM_UNIX_FILE__USER_ID:
				return getUserID();
			case CimPackage.CIM_UNIX_FILE__GROUP_ID:
				return getGroupID();
			case CimPackage.CIM_UNIX_FILE__SAVE_TEXT:
				return getSaveText();
			case CimPackage.CIM_UNIX_FILE__LINK_COUNT:
				return getLinkCount();
			case CimPackage.CIM_UNIX_FILE__FILE_INODE_NUMBER:
				return getFileInodeNumber();
			case CimPackage.CIM_UNIX_FILE__SET_UID:
				return getSetUid();
			case CimPackage.CIM_UNIX_FILE__SET_GID:
				return getSetGid();
			case CimPackage.CIM_UNIX_FILE__LAST_MODIFIED_INODE:
				return getLastModifiedInode();
			case CimPackage.CIM_UNIX_FILE__LINK_MAX:
				return getLinkMax();
			case CimPackage.CIM_UNIX_FILE__NAME_MAX:
				return getNameMax();
			case CimPackage.CIM_UNIX_FILE__PATH_MAX:
				return getPathMax();
			case CimPackage.CIM_UNIX_FILE__POSIX_CHOWN_RESTRICTED:
				return getPosixChownRestricted();
			case CimPackage.CIM_UNIX_FILE__POSIX_NO_TRUNC:
				return getPosixNoTrunc();
			case CimPackage.CIM_UNIX_FILE__POSIX_ASYNC_IO:
				return getPosixAsyncIo();
			case CimPackage.CIM_UNIX_FILE__POSIX_PRIO_IO:
				return getPosixPrioIo();
			case CimPackage.CIM_UNIX_FILE__POSIX_SYNC_IO:
				return getPosixSyncIo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_FILE__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__FS_CREATION_CLASS_NAME:
				setFSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__FS_NAME:
				setFSName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__LF_CREATION_CLASS_NAME:
				setLFCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__LF_NAME:
				setLFName((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__USER_ID:
				setUserID((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__SAVE_TEXT:
				setSaveText((Boolean)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__LINK_COUNT:
				setLinkCount((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__FILE_INODE_NUMBER:
				setFileInodeNumber((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__SET_UID:
				setSetUid((Boolean)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__SET_GID:
				setSetGid((Boolean)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__LAST_MODIFIED_INODE:
				setLastModifiedInode((String)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__LINK_MAX:
				setLinkMax((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__NAME_MAX:
				setNameMax((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__PATH_MAX:
				setPathMax((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_CHOWN_RESTRICTED:
				setPosixChownRestricted((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_NO_TRUNC:
				setPosixNoTrunc((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_ASYNC_IO:
				setPosixAsyncIo((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_PRIO_IO:
				setPosixPrioIo((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_SYNC_IO:
				setPosixSyncIo((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_FILE__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__FS_CREATION_CLASS_NAME:
				setFSCreationClassName(FS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__FS_NAME:
				setFSName(FS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__LF_CREATION_CLASS_NAME:
				setLFCreationClassName(LF_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__LF_NAME:
				setLFName(LF_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__SAVE_TEXT:
				setSaveText(SAVE_TEXT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__LINK_COUNT:
				setLinkCount(LINK_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__FILE_INODE_NUMBER:
				setFileInodeNumber(FILE_INODE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__SET_UID:
				setSetUid(SET_UID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__SET_GID:
				setSetGid(SET_GID_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__LAST_MODIFIED_INODE:
				setLastModifiedInode(LAST_MODIFIED_INODE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__LINK_MAX:
				setLinkMax(LINK_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__NAME_MAX:
				setNameMax(NAME_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__PATH_MAX:
				setPathMax(PATH_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_CHOWN_RESTRICTED:
				setPosixChownRestricted(POSIX_CHOWN_RESTRICTED_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_NO_TRUNC:
				setPosixNoTrunc(POSIX_NO_TRUNC_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_ASYNC_IO:
				setPosixAsyncIo(POSIX_ASYNC_IO_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_PRIO_IO:
				setPosixPrioIo(POSIX_PRIO_IO_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_FILE__POSIX_SYNC_IO:
				setPosixSyncIo(POSIX_SYNC_IO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_FILE__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_UNIX_FILE__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_UNIX_FILE__FS_CREATION_CLASS_NAME:
				return FS_CREATION_CLASS_NAME_EDEFAULT == null ? fsCreationClassName != null : !FS_CREATION_CLASS_NAME_EDEFAULT.equals(fsCreationClassName);
			case CimPackage.CIM_UNIX_FILE__FS_NAME:
				return FS_NAME_EDEFAULT == null ? fsName != null : !FS_NAME_EDEFAULT.equals(fsName);
			case CimPackage.CIM_UNIX_FILE__LF_CREATION_CLASS_NAME:
				return LF_CREATION_CLASS_NAME_EDEFAULT == null ? lfCreationClassName != null : !LF_CREATION_CLASS_NAME_EDEFAULT.equals(lfCreationClassName);
			case CimPackage.CIM_UNIX_FILE__LF_NAME:
				return LF_NAME_EDEFAULT == null ? lfName != null : !LF_NAME_EDEFAULT.equals(lfName);
			case CimPackage.CIM_UNIX_FILE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case CimPackage.CIM_UNIX_FILE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case CimPackage.CIM_UNIX_FILE__SAVE_TEXT:
				return SAVE_TEXT_EDEFAULT == null ? saveText != null : !SAVE_TEXT_EDEFAULT.equals(saveText);
			case CimPackage.CIM_UNIX_FILE__LINK_COUNT:
				return LINK_COUNT_EDEFAULT == null ? linkCount != null : !LINK_COUNT_EDEFAULT.equals(linkCount);
			case CimPackage.CIM_UNIX_FILE__FILE_INODE_NUMBER:
				return FILE_INODE_NUMBER_EDEFAULT == null ? fileInodeNumber != null : !FILE_INODE_NUMBER_EDEFAULT.equals(fileInodeNumber);
			case CimPackage.CIM_UNIX_FILE__SET_UID:
				return SET_UID_EDEFAULT == null ? setUid != null : !SET_UID_EDEFAULT.equals(setUid);
			case CimPackage.CIM_UNIX_FILE__SET_GID:
				return SET_GID_EDEFAULT == null ? setGid != null : !SET_GID_EDEFAULT.equals(setGid);
			case CimPackage.CIM_UNIX_FILE__LAST_MODIFIED_INODE:
				return LAST_MODIFIED_INODE_EDEFAULT == null ? lastModifiedInode != null : !LAST_MODIFIED_INODE_EDEFAULT.equals(lastModifiedInode);
			case CimPackage.CIM_UNIX_FILE__LINK_MAX:
				return LINK_MAX_EDEFAULT == null ? linkMax != null : !LINK_MAX_EDEFAULT.equals(linkMax);
			case CimPackage.CIM_UNIX_FILE__NAME_MAX:
				return NAME_MAX_EDEFAULT == null ? nameMax != null : !NAME_MAX_EDEFAULT.equals(nameMax);
			case CimPackage.CIM_UNIX_FILE__PATH_MAX:
				return PATH_MAX_EDEFAULT == null ? pathMax != null : !PATH_MAX_EDEFAULT.equals(pathMax);
			case CimPackage.CIM_UNIX_FILE__POSIX_CHOWN_RESTRICTED:
				return POSIX_CHOWN_RESTRICTED_EDEFAULT == null ? posixChownRestricted != null : !POSIX_CHOWN_RESTRICTED_EDEFAULT.equals(posixChownRestricted);
			case CimPackage.CIM_UNIX_FILE__POSIX_NO_TRUNC:
				return POSIX_NO_TRUNC_EDEFAULT == null ? posixNoTrunc != null : !POSIX_NO_TRUNC_EDEFAULT.equals(posixNoTrunc);
			case CimPackage.CIM_UNIX_FILE__POSIX_ASYNC_IO:
				return POSIX_ASYNC_IO_EDEFAULT == null ? posixAsyncIo != null : !POSIX_ASYNC_IO_EDEFAULT.equals(posixAsyncIo);
			case CimPackage.CIM_UNIX_FILE__POSIX_PRIO_IO:
				return POSIX_PRIO_IO_EDEFAULT == null ? posixPrioIo != null : !POSIX_PRIO_IO_EDEFAULT.equals(posixPrioIo);
			case CimPackage.CIM_UNIX_FILE__POSIX_SYNC_IO:
				return POSIX_SYNC_IO_EDEFAULT == null ? posixSyncIo != null : !POSIX_SYNC_IO_EDEFAULT.equals(posixSyncIo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", FSCreationClassName: ");
		result.append(fsCreationClassName);
		result.append(", FSName: ");
		result.append(fsName);
		result.append(", LFCreationClassName: ");
		result.append(lfCreationClassName);
		result.append(", LFName: ");
		result.append(lfName);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", GroupID: ");
		result.append(groupID);
		result.append(", SaveText: ");
		result.append(saveText);
		result.append(", LinkCount: ");
		result.append(linkCount);
		result.append(", FileInodeNumber: ");
		result.append(fileInodeNumber);
		result.append(", SetUid: ");
		result.append(setUid);
		result.append(", SetGid: ");
		result.append(setGid);
		result.append(", LastModifiedInode: ");
		result.append(lastModifiedInode);
		result.append(", LinkMax: ");
		result.append(linkMax);
		result.append(", NameMax: ");
		result.append(nameMax);
		result.append(", PathMax: ");
		result.append(pathMax);
		result.append(", PosixChownRestricted: ");
		result.append(posixChownRestricted);
		result.append(", PosixNoTrunc: ");
		result.append(posixNoTrunc);
		result.append(", PosixAsyncIo: ");
		result.append(posixAsyncIo);
		result.append(", PosixPrioIo: ");
		result.append(posixPrioIo);
		result.append(", PosixSyncIo: ");
		result.append(posixSyncIo);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixFileImpl
