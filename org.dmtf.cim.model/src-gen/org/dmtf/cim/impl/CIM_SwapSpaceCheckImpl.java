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

import org.dmtf.cim.CIM_SwapSpaceCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Swap Space Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwapSpaceCheckImpl#getSwapSpaceSize <em>Swap Space Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwapSpaceCheckImpl extends CIM_CheckImpl implements CIM_SwapSpaceCheck {
	/**
	 * The default value of the '{@link #getSwapSpaceSize() <em>Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapSpaceSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SWAP_SPACE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwapSpaceSize() <em>Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapSpaceSize()
	 * @generated
	 * @ordered
	 */
	protected Long swapSpaceSize = SWAP_SPACE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwapSpaceCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwapSpaceCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSwapSpaceSize() {
		return swapSpaceSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwapSpaceSize(Long newSwapSpaceSize) {
		Long oldSwapSpaceSize = swapSpaceSize;
		swapSpaceSize = newSwapSpaceSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWAP_SPACE_CHECK__SWAP_SPACE_SIZE, oldSwapSpaceSize, swapSpaceSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWAP_SPACE_CHECK__SWAP_SPACE_SIZE:
				return getSwapSpaceSize();
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
			case CimPackage.CIM_SWAP_SPACE_CHECK__SWAP_SPACE_SIZE:
				setSwapSpaceSize((Long)newValue);
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
			case CimPackage.CIM_SWAP_SPACE_CHECK__SWAP_SPACE_SIZE:
				setSwapSpaceSize(SWAP_SPACE_SIZE_EDEFAULT);
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
			case CimPackage.CIM_SWAP_SPACE_CHECK__SWAP_SPACE_SIZE:
				return SWAP_SPACE_SIZE_EDEFAULT == null ? swapSpaceSize != null : !SWAP_SPACE_SIZE_EDEFAULT.equals(swapSpaceSize);
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
		result.append(" (SwapSpaceSize: ");
		result.append(swapSpaceSize);
		result.append(')');
		return result.toString();
	}

} //CIM_SwapSpaceCheckImpl
