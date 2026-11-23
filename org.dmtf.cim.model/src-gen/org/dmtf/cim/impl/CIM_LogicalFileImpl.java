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

import org.dmtf.cim.CIM_LogicalFile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getFSCreationClassName <em>FS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getFSName <em>FS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getReadable <em>Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getWriteable <em>Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalFileImpl#getInUseCount <em>In Use Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalFileImpl extends CIM_LogicalElementImpl implements CIM_LogicalFile {
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
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long FILE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected Long fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected String lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAccessed() <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessed()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ACCESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAccessed() <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessed()
	 * @generated
	 * @ordered
	 */
	protected String lastAccessed = LAST_ACCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadable() <em>Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadable()
	 * @generated
	 * @ordered
	 */
	protected Boolean readable = READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WRITEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteable()
	 * @generated
	 * @ordered
	 */
	protected Boolean writeable = WRITEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXECUTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected Boolean executable = EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionMethod() <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionMethod() <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionMethod()
	 * @generated
	 * @ordered
	 */
	protected String compressionMethod = COMPRESSION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected String encryptionMethod = ENCRYPTION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInUseCount() <em>In Use Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUseCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_USE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInUseCount() <em>In Use Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInUseCount()
	 * @generated
	 * @ordered
	 */
	protected Long inUseCount = IN_USE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalFile();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__CS_NAME, oldCSName, csName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__FS_CREATION_CLASS_NAME, oldFSCreationClassName, fsCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__FS_NAME, oldFSName, fsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSize(Long newFileSize) {
		Long oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(String newLastModified) {
		String oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastAccessed() {
		return lastAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessed(String newLastAccessed) {
		String oldLastAccessed = lastAccessed;
		lastAccessed = newLastAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__LAST_ACCESSED, oldLastAccessed, lastAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadable() {
		return readable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadable(Boolean newReadable) {
		Boolean oldReadable = readable;
		readable = newReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__READABLE, oldReadable, readable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWriteable() {
		return writeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteable(Boolean newWriteable) {
		Boolean oldWriteable = writeable;
		writeable = newWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__WRITEABLE, oldWriteable, writeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutable(Boolean newExecutable) {
		Boolean oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionMethod() {
		return compressionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionMethod(String newCompressionMethod) {
		String oldCompressionMethod = compressionMethod;
		compressionMethod = newCompressionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__COMPRESSION_METHOD, oldCompressionMethod, compressionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptionMethod() {
		return encryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionMethod(String newEncryptionMethod) {
		String oldEncryptionMethod = encryptionMethod;
		encryptionMethod = newEncryptionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__ENCRYPTION_METHOD, oldEncryptionMethod, encryptionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInUseCount() {
		return inUseCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInUseCount(Long newInUseCount) {
		Long oldInUseCount = inUseCount;
		inUseCount = newInUseCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_FILE__IN_USE_COUNT, oldInUseCount, inUseCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_FILE__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_LOGICAL_FILE__CS_NAME:
				return getCSName();
			case CimPackage.CIM_LOGICAL_FILE__FS_CREATION_CLASS_NAME:
				return getFSCreationClassName();
			case CimPackage.CIM_LOGICAL_FILE__FS_NAME:
				return getFSName();
			case CimPackage.CIM_LOGICAL_FILE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_LOGICAL_FILE__FILE_SIZE:
				return getFileSize();
			case CimPackage.CIM_LOGICAL_FILE__CREATION_DATE:
				return getCreationDate();
			case CimPackage.CIM_LOGICAL_FILE__LAST_MODIFIED:
				return getLastModified();
			case CimPackage.CIM_LOGICAL_FILE__LAST_ACCESSED:
				return getLastAccessed();
			case CimPackage.CIM_LOGICAL_FILE__READABLE:
				return getReadable();
			case CimPackage.CIM_LOGICAL_FILE__WRITEABLE:
				return getWriteable();
			case CimPackage.CIM_LOGICAL_FILE__EXECUTABLE:
				return getExecutable();
			case CimPackage.CIM_LOGICAL_FILE__COMPRESSION_METHOD:
				return getCompressionMethod();
			case CimPackage.CIM_LOGICAL_FILE__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case CimPackage.CIM_LOGICAL_FILE__IN_USE_COUNT:
				return getInUseCount();
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
			case CimPackage.CIM_LOGICAL_FILE__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FS_CREATION_CLASS_NAME:
				setFSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FS_NAME:
				setFSName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FILE_SIZE:
				setFileSize((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__LAST_MODIFIED:
				setLastModified((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__LAST_ACCESSED:
				setLastAccessed((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__READABLE:
				setReadable((Boolean)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__WRITEABLE:
				setWriteable((Boolean)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__EXECUTABLE:
				setExecutable((Boolean)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__COMPRESSION_METHOD:
				setCompressionMethod((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__ENCRYPTION_METHOD:
				setEncryptionMethod((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_FILE__IN_USE_COUNT:
				setInUseCount((Long)newValue);
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
			case CimPackage.CIM_LOGICAL_FILE__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FS_CREATION_CLASS_NAME:
				setFSCreationClassName(FS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FS_NAME:
				setFSName(FS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__LAST_ACCESSED:
				setLastAccessed(LAST_ACCESSED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__READABLE:
				setReadable(READABLE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__WRITEABLE:
				setWriteable(WRITEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__EXECUTABLE:
				setExecutable(EXECUTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__COMPRESSION_METHOD:
				setCompressionMethod(COMPRESSION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__ENCRYPTION_METHOD:
				setEncryptionMethod(ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_FILE__IN_USE_COUNT:
				setInUseCount(IN_USE_COUNT_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_FILE__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_LOGICAL_FILE__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_LOGICAL_FILE__FS_CREATION_CLASS_NAME:
				return FS_CREATION_CLASS_NAME_EDEFAULT == null ? fsCreationClassName != null : !FS_CREATION_CLASS_NAME_EDEFAULT.equals(fsCreationClassName);
			case CimPackage.CIM_LOGICAL_FILE__FS_NAME:
				return FS_NAME_EDEFAULT == null ? fsName != null : !FS_NAME_EDEFAULT.equals(fsName);
			case CimPackage.CIM_LOGICAL_FILE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_LOGICAL_FILE__FILE_SIZE:
				return FILE_SIZE_EDEFAULT == null ? fileSize != null : !FILE_SIZE_EDEFAULT.equals(fileSize);
			case CimPackage.CIM_LOGICAL_FILE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CimPackage.CIM_LOGICAL_FILE__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case CimPackage.CIM_LOGICAL_FILE__LAST_ACCESSED:
				return LAST_ACCESSED_EDEFAULT == null ? lastAccessed != null : !LAST_ACCESSED_EDEFAULT.equals(lastAccessed);
			case CimPackage.CIM_LOGICAL_FILE__READABLE:
				return READABLE_EDEFAULT == null ? readable != null : !READABLE_EDEFAULT.equals(readable);
			case CimPackage.CIM_LOGICAL_FILE__WRITEABLE:
				return WRITEABLE_EDEFAULT == null ? writeable != null : !WRITEABLE_EDEFAULT.equals(writeable);
			case CimPackage.CIM_LOGICAL_FILE__EXECUTABLE:
				return EXECUTABLE_EDEFAULT == null ? executable != null : !EXECUTABLE_EDEFAULT.equals(executable);
			case CimPackage.CIM_LOGICAL_FILE__COMPRESSION_METHOD:
				return COMPRESSION_METHOD_EDEFAULT == null ? compressionMethod != null : !COMPRESSION_METHOD_EDEFAULT.equals(compressionMethod);
			case CimPackage.CIM_LOGICAL_FILE__ENCRYPTION_METHOD:
				return ENCRYPTION_METHOD_EDEFAULT == null ? encryptionMethod != null : !ENCRYPTION_METHOD_EDEFAULT.equals(encryptionMethod);
			case CimPackage.CIM_LOGICAL_FILE__IN_USE_COUNT:
				return IN_USE_COUNT_EDEFAULT == null ? inUseCount != null : !IN_USE_COUNT_EDEFAULT.equals(inUseCount);
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
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", FileSize: ");
		result.append(fileSize);
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(", LastModified: ");
		result.append(lastModified);
		result.append(", LastAccessed: ");
		result.append(lastAccessed);
		result.append(", Readable: ");
		result.append(readable);
		result.append(", Writeable: ");
		result.append(writeable);
		result.append(", Executable: ");
		result.append(executable);
		result.append(", CompressionMethod: ");
		result.append(compressionMethod);
		result.append(", EncryptionMethod: ");
		result.append(encryptionMethod);
		result.append(", InUseCount: ");
		result.append(inUseCount);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalFileImpl
