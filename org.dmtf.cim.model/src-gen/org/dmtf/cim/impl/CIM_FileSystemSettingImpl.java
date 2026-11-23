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

import org.dmtf.cim.CIM_FileSystemSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getActualFileSystemType <em>Actual File System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getDataExtentsSharing <em>Data Extents Sharing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getCopyTarget <em>Copy Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getFilenameCaseAttributes <em>Filename Case Attributes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getObjectTypes <em>Object Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getNumberOfObjectsMin <em>Number Of Objects Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getNumberOfObjectsMax <em>Number Of Objects Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getNumberOfObjects <em>Number Of Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getObjectSize <em>Object Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getObjectSizeMin <em>Object Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getObjectSizeMax <em>Object Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getFilenameStreamFormats <em>Filename Stream Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getFilenameFormats <em>Filename Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getFilenameLengthMax <em>Filename Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getFilenameReservedCharacterSet <em>Filename Reserved Character Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getSupportedLockingSemantics <em>Supported Locking Semantics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getSupportedAuthorizationProtocols <em>Supported Authorization Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getSupportedAuthenticationProtocols <em>Supported Authentication Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getPersistenceTypes <em>Persistence Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingImpl#getOtherPersistenceTypes <em>Other Persistence Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemSettingImpl extends CIM_SettingDataImpl implements CIM_FileSystemSetting {
	/**
	 * The default value of the '{@link #getActualFileSystemType() <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getActualFileSystemType() <em>Actual File System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFileSystemType()
	 * @generated
	 * @ordered
	 */
	protected Integer actualFileSystemType = ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataExtentsSharing() <em>Data Extents Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExtentsSharing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_EXTENTS_SHARING_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getDataExtentsSharing() <em>Data Extents Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExtentsSharing()
	 * @generated
	 * @ordered
	 */
	protected Integer dataExtentsSharing = DATA_EXTENTS_SHARING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyTarget() <em>Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_TARGET_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getCopyTarget() <em>Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTarget()
	 * @generated
	 * @ordered
	 */
	protected Integer copyTarget = COPY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilenameCaseAttributes() <em>Filename Case Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameCaseAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILENAME_CASE_ATTRIBUTES_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getFilenameCaseAttributes() <em>Filename Case Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameCaseAttributes()
	 * @generated
	 * @ordered
	 */
	protected Integer filenameCaseAttributes = FILENAME_CASE_ATTRIBUTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectTypes() <em>Object Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> objectTypes;

	/**
	 * The cached value of the '{@link #getNumberOfObjectsMin() <em>Number Of Objects Min</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfObjectsMin()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> numberOfObjectsMin;

	/**
	 * The cached value of the '{@link #getNumberOfObjectsMax() <em>Number Of Objects Max</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfObjectsMax()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> numberOfObjectsMax;

	/**
	 * The cached value of the '{@link #getNumberOfObjects() <em>Number Of Objects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> numberOfObjects;

	/**
	 * The cached value of the '{@link #getObjectSize() <em>Object Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSize()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> objectSize;

	/**
	 * The cached value of the '{@link #getObjectSizeMin() <em>Object Size Min</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSizeMin()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> objectSizeMin;

	/**
	 * The cached value of the '{@link #getObjectSizeMax() <em>Object Size Max</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSizeMax()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> objectSizeMax;

	/**
	 * The cached value of the '{@link #getFilenameStreamFormats() <em>Filename Stream Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameStreamFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> filenameStreamFormats;

	/**
	 * The cached value of the '{@link #getFilenameFormats() <em>Filename Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> filenameFormats;

	/**
	 * The cached value of the '{@link #getFilenameLengthMax() <em>Filename Length Max</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameLengthMax()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> filenameLengthMax;

	/**
	 * The cached value of the '{@link #getFilenameReservedCharacterSet() <em>Filename Reserved Character Set</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameReservedCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<String> filenameReservedCharacterSet;

	/**
	 * The cached value of the '{@link #getSupportedLockingSemantics() <em>Supported Locking Semantics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLockingSemantics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedLockingSemantics;

	/**
	 * The cached value of the '{@link #getSupportedAuthorizationProtocols() <em>Supported Authorization Protocols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAuthorizationProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAuthorizationProtocols;

	/**
	 * The cached value of the '{@link #getSupportedAuthenticationProtocols() <em>Supported Authentication Protocols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAuthenticationProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAuthenticationProtocols;

	/**
	 * The cached value of the '{@link #getPersistenceTypes() <em>Persistence Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> persistenceTypes;

	/**
	 * The cached value of the '{@link #getOtherPersistenceTypes() <em>Other Persistence Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherPersistenceTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActualFileSystemType() {
		return actualFileSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualFileSystemType(Integer newActualFileSystemType) {
		Integer oldActualFileSystemType = actualFileSystemType;
		actualFileSystemType = newActualFileSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING__ACTUAL_FILE_SYSTEM_TYPE, oldActualFileSystemType, actualFileSystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataExtentsSharing() {
		return dataExtentsSharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataExtentsSharing(Integer newDataExtentsSharing) {
		Integer oldDataExtentsSharing = dataExtentsSharing;
		dataExtentsSharing = newDataExtentsSharing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING__DATA_EXTENTS_SHARING, oldDataExtentsSharing, dataExtentsSharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyTarget() {
		return copyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyTarget(Integer newCopyTarget) {
		Integer oldCopyTarget = copyTarget;
		copyTarget = newCopyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING__COPY_TARGET, oldCopyTarget, copyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFilenameCaseAttributes() {
		return filenameCaseAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilenameCaseAttributes(Integer newFilenameCaseAttributes) {
		Integer oldFilenameCaseAttributes = filenameCaseAttributes;
		filenameCaseAttributes = newFilenameCaseAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_CASE_ATTRIBUTES, oldFilenameCaseAttributes, filenameCaseAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getObjectTypes() {
		if (objectTypes == null) {
			objectTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_TYPES);
		}
		return objectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getNumberOfObjectsMin() {
		if (numberOfObjectsMin == null) {
			numberOfObjectsMin = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MIN);
		}
		return numberOfObjectsMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getNumberOfObjectsMax() {
		if (numberOfObjectsMax == null) {
			numberOfObjectsMax = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MAX);
		}
		return numberOfObjectsMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getNumberOfObjects() {
		if (numberOfObjects == null) {
			numberOfObjects = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS);
		}
		return numberOfObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getObjectSize() {
		if (objectSize == null) {
			objectSize = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE);
		}
		return objectSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getObjectSizeMin() {
		if (objectSizeMin == null) {
			objectSizeMin = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MIN);
		}
		return objectSizeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getObjectSizeMax() {
		if (objectSizeMax == null) {
			objectSizeMax = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MAX);
		}
		return objectSizeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFilenameStreamFormats() {
		if (filenameStreamFormats == null) {
			filenameStreamFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_STREAM_FORMATS);
		}
		return filenameStreamFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFilenameFormats() {
		if (filenameFormats == null) {
			filenameFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_FORMATS);
		}
		return filenameFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFilenameLengthMax() {
		if (filenameLengthMax == null) {
			filenameLengthMax = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_LENGTH_MAX);
		}
		return filenameLengthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFilenameReservedCharacterSet() {
		if (filenameReservedCharacterSet == null) {
			filenameReservedCharacterSet = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_RESERVED_CHARACTER_SET);
		}
		return filenameReservedCharacterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedLockingSemantics() {
		if (supportedLockingSemantics == null) {
			supportedLockingSemantics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_LOCKING_SEMANTICS);
		}
		return supportedLockingSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAuthorizationProtocols() {
		if (supportedAuthorizationProtocols == null) {
			supportedAuthorizationProtocols = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHORIZATION_PROTOCOLS);
		}
		return supportedAuthorizationProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAuthenticationProtocols() {
		if (supportedAuthenticationProtocols == null) {
			supportedAuthenticationProtocols = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHENTICATION_PROTOCOLS);
		}
		return supportedAuthenticationProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPersistenceTypes() {
		if (persistenceTypes == null) {
			persistenceTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__PERSISTENCE_TYPES);
		}
		return persistenceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherPersistenceTypes() {
		if (otherPersistenceTypes == null) {
			otherPersistenceTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FILE_SYSTEM_SETTING__OTHER_PERSISTENCE_TYPES);
		}
		return otherPersistenceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_SETTING__ACTUAL_FILE_SYSTEM_TYPE:
				return getActualFileSystemType();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__DATA_EXTENTS_SHARING:
				return getDataExtentsSharing();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__COPY_TARGET:
				return getCopyTarget();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_CASE_ATTRIBUTES:
				return getFilenameCaseAttributes();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_TYPES:
				return getObjectTypes();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MIN:
				return getNumberOfObjectsMin();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MAX:
				return getNumberOfObjectsMax();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS:
				return getNumberOfObjects();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE:
				return getObjectSize();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MIN:
				return getObjectSizeMin();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MAX:
				return getObjectSizeMax();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_STREAM_FORMATS:
				return getFilenameStreamFormats();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_FORMATS:
				return getFilenameFormats();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_LENGTH_MAX:
				return getFilenameLengthMax();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_RESERVED_CHARACTER_SET:
				return getFilenameReservedCharacterSet();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_LOCKING_SEMANTICS:
				return getSupportedLockingSemantics();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHORIZATION_PROTOCOLS:
				return getSupportedAuthorizationProtocols();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				return getSupportedAuthenticationProtocols();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__PERSISTENCE_TYPES:
				return getPersistenceTypes();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OTHER_PERSISTENCE_TYPES:
				return getOtherPersistenceTypes();
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING__ACTUAL_FILE_SYSTEM_TYPE:
				setActualFileSystemType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__DATA_EXTENTS_SHARING:
				setDataExtentsSharing((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__COPY_TARGET:
				setCopyTarget((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_CASE_ATTRIBUTES:
				setFilenameCaseAttributes((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_TYPES:
				getObjectTypes().clear();
				getObjectTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MIN:
				getNumberOfObjectsMin().clear();
				getNumberOfObjectsMin().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MAX:
				getNumberOfObjectsMax().clear();
				getNumberOfObjectsMax().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS:
				getNumberOfObjects().clear();
				getNumberOfObjects().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE:
				getObjectSize().clear();
				getObjectSize().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MIN:
				getObjectSizeMin().clear();
				getObjectSizeMin().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MAX:
				getObjectSizeMax().clear();
				getObjectSizeMax().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_STREAM_FORMATS:
				getFilenameStreamFormats().clear();
				getFilenameStreamFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_FORMATS:
				getFilenameFormats().clear();
				getFilenameFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_LENGTH_MAX:
				getFilenameLengthMax().clear();
				getFilenameLengthMax().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_RESERVED_CHARACTER_SET:
				getFilenameReservedCharacterSet().clear();
				getFilenameReservedCharacterSet().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_LOCKING_SEMANTICS:
				getSupportedLockingSemantics().clear();
				getSupportedLockingSemantics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHORIZATION_PROTOCOLS:
				getSupportedAuthorizationProtocols().clear();
				getSupportedAuthorizationProtocols().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				getSupportedAuthenticationProtocols().clear();
				getSupportedAuthenticationProtocols().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__PERSISTENCE_TYPES:
				getPersistenceTypes().clear();
				getPersistenceTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OTHER_PERSISTENCE_TYPES:
				getOtherPersistenceTypes().clear();
				getOtherPersistenceTypes().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING__ACTUAL_FILE_SYSTEM_TYPE:
				setActualFileSystemType(ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__DATA_EXTENTS_SHARING:
				setDataExtentsSharing(DATA_EXTENTS_SHARING_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__COPY_TARGET:
				setCopyTarget(COPY_TARGET_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_CASE_ATTRIBUTES:
				setFilenameCaseAttributes(FILENAME_CASE_ATTRIBUTES_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_TYPES:
				getObjectTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MIN:
				getNumberOfObjectsMin().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MAX:
				getNumberOfObjectsMax().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS:
				getNumberOfObjects().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE:
				getObjectSize().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MIN:
				getObjectSizeMin().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MAX:
				getObjectSizeMax().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_STREAM_FORMATS:
				getFilenameStreamFormats().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_FORMATS:
				getFilenameFormats().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_LENGTH_MAX:
				getFilenameLengthMax().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_RESERVED_CHARACTER_SET:
				getFilenameReservedCharacterSet().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_LOCKING_SEMANTICS:
				getSupportedLockingSemantics().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHORIZATION_PROTOCOLS:
				getSupportedAuthorizationProtocols().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				getSupportedAuthenticationProtocols().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__PERSISTENCE_TYPES:
				getPersistenceTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OTHER_PERSISTENCE_TYPES:
				getOtherPersistenceTypes().clear();
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING__ACTUAL_FILE_SYSTEM_TYPE:
				return ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT == null ? actualFileSystemType != null : !ACTUAL_FILE_SYSTEM_TYPE_EDEFAULT.equals(actualFileSystemType);
			case CimPackage.CIM_FILE_SYSTEM_SETTING__DATA_EXTENTS_SHARING:
				return DATA_EXTENTS_SHARING_EDEFAULT == null ? dataExtentsSharing != null : !DATA_EXTENTS_SHARING_EDEFAULT.equals(dataExtentsSharing);
			case CimPackage.CIM_FILE_SYSTEM_SETTING__COPY_TARGET:
				return COPY_TARGET_EDEFAULT == null ? copyTarget != null : !COPY_TARGET_EDEFAULT.equals(copyTarget);
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_CASE_ATTRIBUTES:
				return FILENAME_CASE_ATTRIBUTES_EDEFAULT == null ? filenameCaseAttributes != null : !FILENAME_CASE_ATTRIBUTES_EDEFAULT.equals(filenameCaseAttributes);
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_TYPES:
				return objectTypes != null && !objectTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MIN:
				return numberOfObjectsMin != null && !numberOfObjectsMin.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS_MAX:
				return numberOfObjectsMax != null && !numberOfObjectsMax.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__NUMBER_OF_OBJECTS:
				return numberOfObjects != null && !numberOfObjects.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE:
				return objectSize != null && !objectSize.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MIN:
				return objectSizeMin != null && !objectSizeMin.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OBJECT_SIZE_MAX:
				return objectSizeMax != null && !objectSizeMax.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_STREAM_FORMATS:
				return filenameStreamFormats != null && !filenameStreamFormats.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_FORMATS:
				return filenameFormats != null && !filenameFormats.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_LENGTH_MAX:
				return filenameLengthMax != null && !filenameLengthMax.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__FILENAME_RESERVED_CHARACTER_SET:
				return filenameReservedCharacterSet != null && !filenameReservedCharacterSet.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_LOCKING_SEMANTICS:
				return supportedLockingSemantics != null && !supportedLockingSemantics.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHORIZATION_PROTOCOLS:
				return supportedAuthorizationProtocols != null && !supportedAuthorizationProtocols.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				return supportedAuthenticationProtocols != null && !supportedAuthenticationProtocols.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__PERSISTENCE_TYPES:
				return persistenceTypes != null && !persistenceTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_SETTING__OTHER_PERSISTENCE_TYPES:
				return otherPersistenceTypes != null && !otherPersistenceTypes.isEmpty();
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
		result.append(" (ActualFileSystemType: ");
		result.append(actualFileSystemType);
		result.append(", DataExtentsSharing: ");
		result.append(dataExtentsSharing);
		result.append(", CopyTarget: ");
		result.append(copyTarget);
		result.append(", FilenameCaseAttributes: ");
		result.append(filenameCaseAttributes);
		result.append(", ObjectTypes: ");
		result.append(objectTypes);
		result.append(", NumberOfObjectsMin: ");
		result.append(numberOfObjectsMin);
		result.append(", NumberOfObjectsMax: ");
		result.append(numberOfObjectsMax);
		result.append(", NumberOfObjects: ");
		result.append(numberOfObjects);
		result.append(", ObjectSize: ");
		result.append(objectSize);
		result.append(", ObjectSizeMin: ");
		result.append(objectSizeMin);
		result.append(", ObjectSizeMax: ");
		result.append(objectSizeMax);
		result.append(", FilenameStreamFormats: ");
		result.append(filenameStreamFormats);
		result.append(", FilenameFormats: ");
		result.append(filenameFormats);
		result.append(", FilenameLengthMax: ");
		result.append(filenameLengthMax);
		result.append(", FilenameReservedCharacterSet: ");
		result.append(filenameReservedCharacterSet);
		result.append(", SupportedLockingSemantics: ");
		result.append(supportedLockingSemantics);
		result.append(", SupportedAuthorizationProtocols: ");
		result.append(supportedAuthorizationProtocols);
		result.append(", SupportedAuthenticationProtocols: ");
		result.append(supportedAuthenticationProtocols);
		result.append(", PersistenceTypes: ");
		result.append(persistenceTypes);
		result.append(", OtherPersistenceTypes: ");
		result.append(otherPersistenceTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemSettingImpl
