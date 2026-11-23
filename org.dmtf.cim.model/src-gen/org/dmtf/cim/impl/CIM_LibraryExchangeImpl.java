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

import org.dmtf.cim.CIM_LibraryExchange;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Library Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LibraryExchangeImpl#getCurrentlyAccessingPort <em>Currently Accessing Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LibraryExchangeImpl extends CIM_DependencyImpl implements CIM_LibraryExchange {
	/**
	 * The default value of the '{@link #getCurrentlyAccessingPort() <em>Currently Accessing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyAccessingPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENTLY_ACCESSING_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentlyAccessingPort() <em>Currently Accessing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyAccessingPort()
	 * @generated
	 * @ordered
	 */
	protected Integer currentlyAccessingPort = CURRENTLY_ACCESSING_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LibraryExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LibraryExchange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentlyAccessingPort() {
		return currentlyAccessingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentlyAccessingPort(Integer newCurrentlyAccessingPort) {
		Integer oldCurrentlyAccessingPort = currentlyAccessingPort;
		currentlyAccessingPort = newCurrentlyAccessingPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LIBRARY_EXCHANGE__CURRENTLY_ACCESSING_PORT, oldCurrentlyAccessingPort, currentlyAccessingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LIBRARY_EXCHANGE__CURRENTLY_ACCESSING_PORT:
				return getCurrentlyAccessingPort();
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
			case CimPackage.CIM_LIBRARY_EXCHANGE__CURRENTLY_ACCESSING_PORT:
				setCurrentlyAccessingPort((Integer)newValue);
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
			case CimPackage.CIM_LIBRARY_EXCHANGE__CURRENTLY_ACCESSING_PORT:
				setCurrentlyAccessingPort(CURRENTLY_ACCESSING_PORT_EDEFAULT);
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
			case CimPackage.CIM_LIBRARY_EXCHANGE__CURRENTLY_ACCESSING_PORT:
				return CURRENTLY_ACCESSING_PORT_EDEFAULT == null ? currentlyAccessingPort != null : !CURRENTLY_ACCESSING_PORT_EDEFAULT.equals(currentlyAccessingPort);
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
		result.append(" (CurrentlyAccessingPort: ");
		result.append(currentlyAccessingPort);
		result.append(')');
		return result.toString();
	}

} //CIM_LibraryExchangeImpl
