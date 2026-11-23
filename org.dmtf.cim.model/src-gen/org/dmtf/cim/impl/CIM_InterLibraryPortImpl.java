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

import org.dmtf.cim.CIM_InterLibraryPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Inter Library Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InterLibraryPortImpl#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InterLibraryPortImpl#getImportCount <em>Import Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InterLibraryPortImpl#getExportCount <em>Export Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InterLibraryPortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InterLibraryPortImpl extends CIM_MediaTransferDeviceImpl implements CIM_InterLibraryPort {
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
	protected CIM_InterLibraryPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InterLibraryPort();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INTER_LIBRARY_PORT__LAST_ACCESSED, oldLastAccessed, lastAccessed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INTER_LIBRARY_PORT__IMPORT_COUNT, oldImportCount, importCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INTER_LIBRARY_PORT__EXPORT_COUNT, oldExportCount, exportCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INTER_LIBRARY_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INTER_LIBRARY_PORT__LAST_ACCESSED:
				return getLastAccessed();
			case CimPackage.CIM_INTER_LIBRARY_PORT__IMPORT_COUNT:
				return getImportCount();
			case CimPackage.CIM_INTER_LIBRARY_PORT__EXPORT_COUNT:
				return getExportCount();
			case CimPackage.CIM_INTER_LIBRARY_PORT__DIRECTION:
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
			case CimPackage.CIM_INTER_LIBRARY_PORT__LAST_ACCESSED:
				setLastAccessed((String)newValue);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__IMPORT_COUNT:
				setImportCount((Long)newValue);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__EXPORT_COUNT:
				setExportCount((Long)newValue);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__DIRECTION:
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
			case CimPackage.CIM_INTER_LIBRARY_PORT__LAST_ACCESSED:
				setLastAccessed(LAST_ACCESSED_EDEFAULT);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__IMPORT_COUNT:
				setImportCount(IMPORT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__EXPORT_COUNT:
				setExportCount(EXPORT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_INTER_LIBRARY_PORT__DIRECTION:
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
			case CimPackage.CIM_INTER_LIBRARY_PORT__LAST_ACCESSED:
				return LAST_ACCESSED_EDEFAULT == null ? lastAccessed != null : !LAST_ACCESSED_EDEFAULT.equals(lastAccessed);
			case CimPackage.CIM_INTER_LIBRARY_PORT__IMPORT_COUNT:
				return IMPORT_COUNT_EDEFAULT == null ? importCount != null : !IMPORT_COUNT_EDEFAULT.equals(importCount);
			case CimPackage.CIM_INTER_LIBRARY_PORT__EXPORT_COUNT:
				return EXPORT_COUNT_EDEFAULT == null ? exportCount != null : !EXPORT_COUNT_EDEFAULT.equals(exportCount);
			case CimPackage.CIM_INTER_LIBRARY_PORT__DIRECTION:
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
		result.append(" (LastAccessed: ");
		result.append(lastAccessed);
		result.append(", ImportCount: ");
		result.append(importCount);
		result.append(", ExportCount: ");
		result.append(exportCount);
		result.append(", Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //CIM_InterLibraryPortImpl
