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

import org.dmtf.cim.CIM_ConnectivityCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Connectivity Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConnectivityCollectionImpl#getConnectivityStatus <em>Connectivity Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConnectivityCollectionImpl extends CIM_SystemSpecificCollectionImpl implements CIM_ConnectivityCollection {
	/**
	 * The default value of the '{@link #getConnectivityStatus() <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTIVITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityStatus() <em>Connectivity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer connectivityStatus = CONNECTIVITY_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConnectivityCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConnectivityCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectivityStatus() {
		return connectivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectivityStatus(Integer newConnectivityStatus) {
		Integer oldConnectivityStatus = connectivityStatus;
		connectivityStatus = newConnectivityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS, oldConnectivityStatus, connectivityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				return getConnectivityStatus();
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
			case CimPackage.CIM_CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				setConnectivityStatus((Integer)newValue);
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
			case CimPackage.CIM_CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				setConnectivityStatus(CONNECTIVITY_STATUS_EDEFAULT);
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
			case CimPackage.CIM_CONNECTIVITY_COLLECTION__CONNECTIVITY_STATUS:
				return CONNECTIVITY_STATUS_EDEFAULT == null ? connectivityStatus != null : !CONNECTIVITY_STATUS_EDEFAULT.equals(connectivityStatus);
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
		result.append(" (ConnectivityStatus: ");
		result.append(connectivityStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_ConnectivityCollectionImpl
