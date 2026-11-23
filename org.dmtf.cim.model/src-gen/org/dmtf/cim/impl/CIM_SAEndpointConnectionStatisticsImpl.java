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

import org.dmtf.cim.CIM_SAEndpointConnectionStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Endpoint Connection Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAEndpointConnectionStatisticsImpl#getByteCount <em>Byte Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAEndpointConnectionStatisticsImpl#getLastAccessed <em>Last Accessed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SAEndpointConnectionStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_SAEndpointConnectionStatistics {
	/**
	 * The default value of the '{@link #getByteCount() <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteCount() <em>Byte Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteCount()
	 * @generated
	 * @ordered
	 */
	protected Long byteCount = BYTE_COUNT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SAEndpointConnectionStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SAEndpointConnectionStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getByteCount() {
		return byteCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteCount(Long newByteCount) {
		Long oldByteCount = byteCount;
		byteCount = newByteCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__BYTE_COUNT, oldByteCount, byteCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__LAST_ACCESSED, oldLastAccessed, lastAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__BYTE_COUNT:
				return getByteCount();
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__LAST_ACCESSED:
				return getLastAccessed();
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
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__BYTE_COUNT:
				setByteCount((Long)newValue);
				return;
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__LAST_ACCESSED:
				setLastAccessed((String)newValue);
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
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__BYTE_COUNT:
				setByteCount(BYTE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__LAST_ACCESSED:
				setLastAccessed(LAST_ACCESSED_EDEFAULT);
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
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__BYTE_COUNT:
				return BYTE_COUNT_EDEFAULT == null ? byteCount != null : !BYTE_COUNT_EDEFAULT.equals(byteCount);
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS__LAST_ACCESSED:
				return LAST_ACCESSED_EDEFAULT == null ? lastAccessed != null : !LAST_ACCESSED_EDEFAULT.equals(lastAccessed);
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
		result.append(" (ByteCount: ");
		result.append(byteCount);
		result.append(", LastAccessed: ");
		result.append(lastAccessed);
		result.append(')');
		return result.toString();
	}

} //CIM_SAEndpointConnectionStatisticsImpl
