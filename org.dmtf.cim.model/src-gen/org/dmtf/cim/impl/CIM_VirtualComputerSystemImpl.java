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

import org.dmtf.cim.CIM_VirtualComputerSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual Computer System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualComputerSystemImpl#getVirtualSystem <em>Virtual System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualComputerSystemImpl extends CIM_ComputerSystemImpl implements CIM_VirtualComputerSystem {
	/**
	 * The default value of the '{@link #getVirtualSystem() <em>Virtual System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSystem() <em>Virtual System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystem()
	 * @generated
	 * @ordered
	 */
	protected String virtualSystem = VIRTUAL_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualComputerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualComputerSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualSystem() {
		return virtualSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualSystem(String newVirtualSystem) {
		String oldVirtualSystem = virtualSystem;
		virtualSystem = newVirtualSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM__VIRTUAL_SYSTEM, oldVirtualSystem, virtualSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM__VIRTUAL_SYSTEM:
				return getVirtualSystem();
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
			case CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM__VIRTUAL_SYSTEM:
				setVirtualSystem((String)newValue);
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
			case CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM__VIRTUAL_SYSTEM:
				setVirtualSystem(VIRTUAL_SYSTEM_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM__VIRTUAL_SYSTEM:
				return VIRTUAL_SYSTEM_EDEFAULT == null ? virtualSystem != null : !VIRTUAL_SYSTEM_EDEFAULT.equals(virtualSystem);
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
		result.append(" (VirtualSystem: ");
		result.append(virtualSystem);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualComputerSystemImpl
