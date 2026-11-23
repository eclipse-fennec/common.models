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

import org.dmtf.cim.CIM_IPXConnectivityNetwork;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IPX Connectivity Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPXConnectivityNetworkImpl#getNetworkNumber <em>Network Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPXConnectivityNetworkImpl extends CIM_ConnectivityCollectionImpl implements CIM_IPXConnectivityNetwork {
	/**
	 * The default value of the '{@link #getNetworkNumber() <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkNumber() <em>Network Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkNumber()
	 * @generated
	 * @ordered
	 */
	protected String networkNumber = NETWORK_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPXConnectivityNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPXConnectivityNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkNumber() {
		return networkNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkNumber(String newNetworkNumber) {
		String oldNetworkNumber = networkNumber;
		networkNumber = newNetworkNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER, oldNetworkNumber, networkNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				return getNetworkNumber();
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
			case CimPackage.CIM_IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				setNetworkNumber((String)newValue);
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
			case CimPackage.CIM_IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				setNetworkNumber(NETWORK_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_IPX_CONNECTIVITY_NETWORK__NETWORK_NUMBER:
				return NETWORK_NUMBER_EDEFAULT == null ? networkNumber != null : !NETWORK_NUMBER_EDEFAULT.equals(networkNumber);
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
		result.append(" (NetworkNumber: ");
		result.append(networkNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_IPXConnectivityNetworkImpl
