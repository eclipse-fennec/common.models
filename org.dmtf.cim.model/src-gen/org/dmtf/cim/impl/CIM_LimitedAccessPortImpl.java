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

import org.dmtf.cim.CIM_LimitedAccessPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Limited Access Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getExtendTimeout <em>Extend Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getLastExtended <em>Last Extended</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getImportCount <em>Import Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getExportCount <em>Export Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LimitedAccessPortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LimitedAccessPortImpl extends CIM_MediaTransferDeviceImpl implements CIM_LimitedAccessPort {
	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXTENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected Boolean extended = EXTENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendTimeout() <em>Extend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXTEND_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendTimeout() <em>Extend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long extendTimeout = EXTEND_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastExtended() <em>Last Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExtended()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_EXTENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastExtended() <em>Last Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExtended()
	 * @generated
	 * @ordered
	 */
	protected String lastExtended = LAST_EXTENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportCount() <em>Import Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long IMPORT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportCount() <em>Import Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportCount()
	 * @generated
	 * @ordered
	 */
	protected Long importCount = IMPORT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportCount() <em>Export Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXPORT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportCount() <em>Export Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportCount()
	 * @generated
	 * @ordered
	 */
	protected Long exportCount = EXPORT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Integer direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LimitedAccessPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LimitedAccessPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(Boolean newLocked) {
		Boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtended(Boolean newExtended) {
		Boolean oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExtendTimeout() {
		return extendTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendTimeout(Long newExtendTimeout) {
		Long oldExtendTimeout = extendTimeout;
		extendTimeout = newExtendTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__EXTEND_TIMEOUT, oldExtendTimeout, extendTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastExtended() {
		return lastExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastExtended(String newLastExtended) {
		String oldLastExtended = lastExtended;
		lastExtended = newLastExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__LAST_EXTENDED, oldLastExtended, lastExtended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getImportCount() {
		return importCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportCount(Long newImportCount) {
		Long oldImportCount = importCount;
		importCount = newImportCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__IMPORT_COUNT, oldImportCount, importCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExportCount() {
		return exportCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportCount(Long newExportCount) {
		Long oldExportCount = exportCount;
		exportCount = newExportCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__EXPORT_COUNT, oldExportCount, exportCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Integer newDirection) {
		Integer oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIMITED_ACCESS_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LOCKED:
				return getLocked();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTENDED:
				return getExtended();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTEND_TIMEOUT:
				return getExtendTimeout();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LAST_EXTENDED:
				return getLastExtended();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__IMPORT_COUNT:
				return getImportCount();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXPORT_COUNT:
				return getExportCount();
			case CimPackage.CIM_LIMITED_ACCESS_PORT__DIRECTION:
				return getDirection();
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
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTEND_TIMEOUT:
				setExtendTimeout((Long)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LAST_EXTENDED:
				setLastExtended((String)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__IMPORT_COUNT:
				setImportCount((Long)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXPORT_COUNT:
				setExportCount((Long)newValue);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__DIRECTION:
				setDirection((Integer)newValue);
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
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTENDED:
				setExtended(EXTENDED_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTEND_TIMEOUT:
				setExtendTimeout(EXTEND_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LAST_EXTENDED:
				setLastExtended(LAST_EXTENDED_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__IMPORT_COUNT:
				setImportCount(IMPORT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXPORT_COUNT:
				setExportCount(EXPORT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_LIMITED_ACCESS_PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTENDED:
				return EXTENDED_EDEFAULT == null ? extended != null : !EXTENDED_EDEFAULT.equals(extended);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXTEND_TIMEOUT:
				return EXTEND_TIMEOUT_EDEFAULT == null ? extendTimeout != null : !EXTEND_TIMEOUT_EDEFAULT.equals(extendTimeout);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__LAST_EXTENDED:
				return LAST_EXTENDED_EDEFAULT == null ? lastExtended != null : !LAST_EXTENDED_EDEFAULT.equals(lastExtended);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__IMPORT_COUNT:
				return IMPORT_COUNT_EDEFAULT == null ? importCount != null : !IMPORT_COUNT_EDEFAULT.equals(importCount);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__EXPORT_COUNT:
				return EXPORT_COUNT_EDEFAULT == null ? exportCount != null : !EXPORT_COUNT_EDEFAULT.equals(exportCount);
			case CimPackage.CIM_LIMITED_ACCESS_PORT__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
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
		result.append(" (Locked: ");
		result.append(locked);
		result.append(", Extended: ");
		result.append(extended);
		result.append(", ExtendTimeout: ");
		result.append(extendTimeout);
		result.append(", LastExtended: ");
		result.append(lastExtended);
		result.append(", ImportCount: ");
		result.append(importCount);
		result.append(", ExportCount: ");
		result.append(exportCount);
		result.append(", Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //CIM_LimitedAccessPortImpl
