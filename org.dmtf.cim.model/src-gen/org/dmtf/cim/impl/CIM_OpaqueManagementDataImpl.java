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

import org.dmtf.cim.CIM_OpaqueManagementData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Opaque Management Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataImpl#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataImpl#getWriteLimited <em>Write Limited</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataImpl#getDataSize <em>Data Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OpaqueManagementDataImpl extends CIM_StorageExtentImpl implements CIM_OpaqueManagementData {
	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxSize = MAX_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getWriteLimited() <em>Write Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLimited()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WRITE_LIMITED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteLimited() <em>Write Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLimited()
	 * @generated
	 * @ordered
	 */
	protected Integer writeLimited = WRITE_LIMITED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String dataFormat = DATA_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected Long dataSize = DATA_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OpaqueManagementDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OpaqueManagementData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(Long newMaxSize) {
		Long oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__MAX_SIZE, oldMaxSize, maxSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__LAST_ACCESSED, oldLastAccessed, lastAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWriteLimited() {
		return writeLimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteLimited(Integer newWriteLimited) {
		Integer oldWriteLimited = writeLimited;
		writeLimited = newWriteLimited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__WRITE_LIMITED, oldWriteLimited, writeLimited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormat(String newDataFormat) {
		String oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDataSize() {
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSize(Long newDataSize) {
		Long oldDataSize = dataSize;
		dataSize = newDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_SIZE, oldDataSize, dataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__MAX_SIZE:
				return getMaxSize();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__LAST_ACCESSED:
				return getLastAccessed();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__WRITE_LIMITED:
				return getWriteLimited();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_FORMAT:
				return getDataFormat();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_SIZE:
				return getDataSize();
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__MAX_SIZE:
				setMaxSize((Long)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__LAST_ACCESSED:
				setLastAccessed((String)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__WRITE_LIMITED:
				setWriteLimited((Integer)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_FORMAT:
				setDataFormat((String)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_SIZE:
				setDataSize((Long)newValue);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__LAST_ACCESSED:
				setLastAccessed(LAST_ACCESSED_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__WRITE_LIMITED:
				setWriteLimited(WRITE_LIMITED_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_SIZE:
				setDataSize(DATA_SIZE_EDEFAULT);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__MAX_SIZE:
				return MAX_SIZE_EDEFAULT == null ? maxSize != null : !MAX_SIZE_EDEFAULT.equals(maxSize);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__LAST_ACCESSED:
				return LAST_ACCESSED_EDEFAULT == null ? lastAccessed != null : !LAST_ACCESSED_EDEFAULT.equals(lastAccessed);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__WRITE_LIMITED:
				return WRITE_LIMITED_EDEFAULT == null ? writeLimited != null : !WRITE_LIMITED_EDEFAULT.equals(writeLimited);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA__DATA_SIZE:
				return DATA_SIZE_EDEFAULT == null ? dataSize != null : !DATA_SIZE_EDEFAULT.equals(dataSize);
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
		result.append(" (MaxSize: ");
		result.append(maxSize);
		result.append(", LastAccessed: ");
		result.append(lastAccessed);
		result.append(", WriteLimited: ");
		result.append(writeLimited);
		result.append(", DataFormat: ");
		result.append(dataFormat);
		result.append(", DataSize: ");
		result.append(dataSize);
		result.append(')');
		return result.toString();
	}

} //CIM_OpaqueManagementDataImpl
