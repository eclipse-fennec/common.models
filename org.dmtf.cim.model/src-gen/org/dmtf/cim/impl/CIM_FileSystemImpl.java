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

import java.util.Collection;

import org.dmtf.cim.CIM_FileSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getFileSystemSize <em>File System Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getAvailableSpace <em>Available Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCasePreserved <em>Case Preserved</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getMaxFileNameLength <em>Max File Name Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getClusterSize <em>Cluster Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getFileSystemType <em>File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getNumberOfFiles <em>Number Of Files</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getIsFixedSize <em>Is Fixed Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemImpl#getResizeIncrement <em>Resize Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemImpl extends CIM_EnabledLogicalElementImpl implements CIM_FileSystem {
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
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long blockSize = BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSystemSize() <em>File System Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystemSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long FILE_SYSTEM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSystemSize() <em>File System Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystemSize()
	 * @generated
	 * @ordered
	 */
	protected Long fileSystemSize = FILE_SYSTEM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSpace() <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABLE_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableSpace() <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpace()
	 * @generated
	 * @ordered
	 */
	protected Long availableSpace = AVAILABLE_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean readOnly = READ_ONLY_EDEFAULT;

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
	 * The default value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CASE_SENSITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected Boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCasePreserved() <em>Case Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePreserved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CASE_PRESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCasePreserved() <em>Case Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePreserved()
	 * @generated
	 * @ordered
	 */
	protected Boolean casePreserved = CASE_PRESERVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeSet() <em>Code Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> codeSet;

	/**
	 * The default value of the '{@link #getMaxFileNameLength() <em>Max File Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFileNameLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_FILE_NAME_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxFileNameLength() <em>Max File Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFileNameLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxFileNameLength = MAX_FILE_NAME_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterSize() <em>Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLUSTER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterSize() <em>Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterSize()
	 * @generated
	 * @ordered
	 */
	protected Long clusterSize = CLUSTER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSystemType() <em>File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSystemType() <em>File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected String fileSystemType = FILE_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected Integer persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected String otherPersistenceType = OTHER_PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfFiles() <em>Number Of Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFiles()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfFiles() <em>Number Of Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFiles()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfFiles = NUMBER_OF_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFixedSize() <em>Is Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixedSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IS_FIXED_SIZE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getIsFixedSize() <em>Is Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixedSize()
	 * @generated
	 * @ordered
	 */
	protected Integer isFixedSize = IS_FIXED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResizeIncrement() <em>Resize Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESIZE_INCREMENT_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getResizeIncrement() <em>Resize Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeIncrement()
	 * @generated
	 * @ordered
	 */
	protected Long resizeIncrement = RESIZE_INCREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CS_NAME, oldCSName, csName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockSize(Long newBlockSize) {
		Long oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__BLOCK_SIZE, oldBlockSize, blockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFileSystemSize() {
		return fileSystemSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystemSize(Long newFileSystemSize) {
		Long oldFileSystemSize = fileSystemSize;
		fileSystemSize = newFileSystemSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_SIZE, oldFileSystemSize, fileSystemSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailableSpace() {
		return availableSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSpace(Long newAvailableSpace) {
		Long oldAvailableSpace = availableSpace;
		availableSpace = newAvailableSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__AVAILABLE_SPACE, oldAvailableSpace, availableSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Boolean newReadOnly) {
		Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__ENCRYPTION_METHOD, oldEncryptionMethod, encryptionMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__COMPRESSION_METHOD, oldCompressionMethod, compressionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseSensitive(Boolean newCaseSensitive) {
		Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCasePreserved() {
		return casePreserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCasePreserved(Boolean newCasePreserved) {
		Boolean oldCasePreserved = casePreserved;
		casePreserved = newCasePreserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CASE_PRESERVED, oldCasePreserved, casePreserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCodeSet() {
		if (codeSet == null) {
			codeSet = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM__CODE_SET);
		}
		return codeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxFileNameLength() {
		return maxFileNameLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFileNameLength(Long newMaxFileNameLength) {
		Long oldMaxFileNameLength = maxFileNameLength;
		maxFileNameLength = newMaxFileNameLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__MAX_FILE_NAME_LENGTH, oldMaxFileNameLength, maxFileNameLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClusterSize() {
		return clusterSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterSize(Long newClusterSize) {
		Long oldClusterSize = clusterSize;
		clusterSize = newClusterSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__CLUSTER_SIZE, oldClusterSize, clusterSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileSystemType() {
		return fileSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystemType(String newFileSystemType) {
		String oldFileSystemType = fileSystemType;
		fileSystemType = newFileSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_TYPE, oldFileSystemType, fileSystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistenceType(Integer newPersistenceType) {
		Integer oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPersistenceType() {
		return otherPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPersistenceType(String newOtherPersistenceType) {
		String oldOtherPersistenceType = otherPersistenceType;
		otherPersistenceType = newOtherPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__OTHER_PERSISTENCE_TYPE, oldOtherPersistenceType, otherPersistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfFiles() {
		return numberOfFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfFiles(Long newNumberOfFiles) {
		Long oldNumberOfFiles = numberOfFiles;
		numberOfFiles = newNumberOfFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__NUMBER_OF_FILES, oldNumberOfFiles, numberOfFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIsFixedSize() {
		return isFixedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFixedSize(Integer newIsFixedSize) {
		Integer oldIsFixedSize = isFixedSize;
		isFixedSize = newIsFixedSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__IS_FIXED_SIZE, oldIsFixedSize, isFixedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResizeIncrement() {
		return resizeIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResizeIncrement(Long newResizeIncrement) {
		Long oldResizeIncrement = resizeIncrement;
		resizeIncrement = newResizeIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM__RESIZE_INCREMENT, oldResizeIncrement, resizeIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_FILE_SYSTEM__CS_NAME:
				return getCSName();
			case CimPackage.CIM_FILE_SYSTEM__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_FILE_SYSTEM__ROOT:
				return getRoot();
			case CimPackage.CIM_FILE_SYSTEM__BLOCK_SIZE:
				return getBlockSize();
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_SIZE:
				return getFileSystemSize();
			case CimPackage.CIM_FILE_SYSTEM__AVAILABLE_SPACE:
				return getAvailableSpace();
			case CimPackage.CIM_FILE_SYSTEM__READ_ONLY:
				return getReadOnly();
			case CimPackage.CIM_FILE_SYSTEM__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case CimPackage.CIM_FILE_SYSTEM__COMPRESSION_METHOD:
				return getCompressionMethod();
			case CimPackage.CIM_FILE_SYSTEM__CASE_SENSITIVE:
				return getCaseSensitive();
			case CimPackage.CIM_FILE_SYSTEM__CASE_PRESERVED:
				return getCasePreserved();
			case CimPackage.CIM_FILE_SYSTEM__CODE_SET:
				return getCodeSet();
			case CimPackage.CIM_FILE_SYSTEM__MAX_FILE_NAME_LENGTH:
				return getMaxFileNameLength();
			case CimPackage.CIM_FILE_SYSTEM__CLUSTER_SIZE:
				return getClusterSize();
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_TYPE:
				return getFileSystemType();
			case CimPackage.CIM_FILE_SYSTEM__PERSISTENCE_TYPE:
				return getPersistenceType();
			case CimPackage.CIM_FILE_SYSTEM__OTHER_PERSISTENCE_TYPE:
				return getOtherPersistenceType();
			case CimPackage.CIM_FILE_SYSTEM__NUMBER_OF_FILES:
				return getNumberOfFiles();
			case CimPackage.CIM_FILE_SYSTEM__IS_FIXED_SIZE:
				return getIsFixedSize();
			case CimPackage.CIM_FILE_SYSTEM__RESIZE_INCREMENT:
				return getResizeIncrement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__ROOT:
				setRoot((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__BLOCK_SIZE:
				setBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_SIZE:
				setFileSystemSize((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__AVAILABLE_SPACE:
				setAvailableSpace((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__ENCRYPTION_METHOD:
				setEncryptionMethod((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__COMPRESSION_METHOD:
				setCompressionMethod((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CASE_PRESERVED:
				setCasePreserved((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CODE_SET:
				getCodeSet().clear();
				getCodeSet().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__MAX_FILE_NAME_LENGTH:
				setMaxFileNameLength((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CLUSTER_SIZE:
				setClusterSize((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_TYPE:
				setFileSystemType((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__PERSISTENCE_TYPE:
				setPersistenceType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__NUMBER_OF_FILES:
				setNumberOfFiles((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__IS_FIXED_SIZE:
				setIsFixedSize((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM__RESIZE_INCREMENT:
				setResizeIncrement((Long)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__BLOCK_SIZE:
				setBlockSize(BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_SIZE:
				setFileSystemSize(FILE_SYSTEM_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__AVAILABLE_SPACE:
				setAvailableSpace(AVAILABLE_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__ENCRYPTION_METHOD:
				setEncryptionMethod(ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__COMPRESSION_METHOD:
				setCompressionMethod(COMPRESSION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CASE_PRESERVED:
				setCasePreserved(CASE_PRESERVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CODE_SET:
				getCodeSet().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM__MAX_FILE_NAME_LENGTH:
				setMaxFileNameLength(MAX_FILE_NAME_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__CLUSTER_SIZE:
				setClusterSize(CLUSTER_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_TYPE:
				setFileSystemType(FILE_SYSTEM_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType(OTHER_PERSISTENCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__NUMBER_OF_FILES:
				setNumberOfFiles(NUMBER_OF_FILES_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__IS_FIXED_SIZE:
				setIsFixedSize(IS_FIXED_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM__RESIZE_INCREMENT:
				setResizeIncrement(RESIZE_INCREMENT_EDEFAULT);
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
			case CimPackage.CIM_FILE_SYSTEM__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_FILE_SYSTEM__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_FILE_SYSTEM__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_FILE_SYSTEM__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
			case CimPackage.CIM_FILE_SYSTEM__BLOCK_SIZE:
				return BLOCK_SIZE_EDEFAULT == null ? blockSize != null : !BLOCK_SIZE_EDEFAULT.equals(blockSize);
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_SIZE:
				return FILE_SYSTEM_SIZE_EDEFAULT == null ? fileSystemSize != null : !FILE_SYSTEM_SIZE_EDEFAULT.equals(fileSystemSize);
			case CimPackage.CIM_FILE_SYSTEM__AVAILABLE_SPACE:
				return AVAILABLE_SPACE_EDEFAULT == null ? availableSpace != null : !AVAILABLE_SPACE_EDEFAULT.equals(availableSpace);
			case CimPackage.CIM_FILE_SYSTEM__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case CimPackage.CIM_FILE_SYSTEM__ENCRYPTION_METHOD:
				return ENCRYPTION_METHOD_EDEFAULT == null ? encryptionMethod != null : !ENCRYPTION_METHOD_EDEFAULT.equals(encryptionMethod);
			case CimPackage.CIM_FILE_SYSTEM__COMPRESSION_METHOD:
				return COMPRESSION_METHOD_EDEFAULT == null ? compressionMethod != null : !COMPRESSION_METHOD_EDEFAULT.equals(compressionMethod);
			case CimPackage.CIM_FILE_SYSTEM__CASE_SENSITIVE:
				return CASE_SENSITIVE_EDEFAULT == null ? caseSensitive != null : !CASE_SENSITIVE_EDEFAULT.equals(caseSensitive);
			case CimPackage.CIM_FILE_SYSTEM__CASE_PRESERVED:
				return CASE_PRESERVED_EDEFAULT == null ? casePreserved != null : !CASE_PRESERVED_EDEFAULT.equals(casePreserved);
			case CimPackage.CIM_FILE_SYSTEM__CODE_SET:
				return codeSet != null && !codeSet.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM__MAX_FILE_NAME_LENGTH:
				return MAX_FILE_NAME_LENGTH_EDEFAULT == null ? maxFileNameLength != null : !MAX_FILE_NAME_LENGTH_EDEFAULT.equals(maxFileNameLength);
			case CimPackage.CIM_FILE_SYSTEM__CLUSTER_SIZE:
				return CLUSTER_SIZE_EDEFAULT == null ? clusterSize != null : !CLUSTER_SIZE_EDEFAULT.equals(clusterSize);
			case CimPackage.CIM_FILE_SYSTEM__FILE_SYSTEM_TYPE:
				return FILE_SYSTEM_TYPE_EDEFAULT == null ? fileSystemType != null : !FILE_SYSTEM_TYPE_EDEFAULT.equals(fileSystemType);
			case CimPackage.CIM_FILE_SYSTEM__PERSISTENCE_TYPE:
				return PERSISTENCE_TYPE_EDEFAULT == null ? persistenceType != null : !PERSISTENCE_TYPE_EDEFAULT.equals(persistenceType);
			case CimPackage.CIM_FILE_SYSTEM__OTHER_PERSISTENCE_TYPE:
				return OTHER_PERSISTENCE_TYPE_EDEFAULT == null ? otherPersistenceType != null : !OTHER_PERSISTENCE_TYPE_EDEFAULT.equals(otherPersistenceType);
			case CimPackage.CIM_FILE_SYSTEM__NUMBER_OF_FILES:
				return NUMBER_OF_FILES_EDEFAULT == null ? numberOfFiles != null : !NUMBER_OF_FILES_EDEFAULT.equals(numberOfFiles);
			case CimPackage.CIM_FILE_SYSTEM__IS_FIXED_SIZE:
				return IS_FIXED_SIZE_EDEFAULT == null ? isFixedSize != null : !IS_FIXED_SIZE_EDEFAULT.equals(isFixedSize);
			case CimPackage.CIM_FILE_SYSTEM__RESIZE_INCREMENT:
				return RESIZE_INCREMENT_EDEFAULT == null ? resizeIncrement != null : !RESIZE_INCREMENT_EDEFAULT.equals(resizeIncrement);
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
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", Root: ");
		result.append(root);
		result.append(", BlockSize: ");
		result.append(blockSize);
		result.append(", FileSystemSize: ");
		result.append(fileSystemSize);
		result.append(", AvailableSpace: ");
		result.append(availableSpace);
		result.append(", ReadOnly: ");
		result.append(readOnly);
		result.append(", EncryptionMethod: ");
		result.append(encryptionMethod);
		result.append(", CompressionMethod: ");
		result.append(compressionMethod);
		result.append(", CaseSensitive: ");
		result.append(caseSensitive);
		result.append(", CasePreserved: ");
		result.append(casePreserved);
		result.append(", CodeSet: ");
		result.append(codeSet);
		result.append(", MaxFileNameLength: ");
		result.append(maxFileNameLength);
		result.append(", ClusterSize: ");
		result.append(clusterSize);
		result.append(", FileSystemType: ");
		result.append(fileSystemType);
		result.append(", PersistenceType: ");
		result.append(persistenceType);
		result.append(", OtherPersistenceType: ");
		result.append(otherPersistenceType);
		result.append(", NumberOfFiles: ");
		result.append(numberOfFiles);
		result.append(", IsFixedSize: ");
		result.append(isFixedSize);
		result.append(", ResizeIncrement: ");
		result.append(resizeIncrement);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemImpl
