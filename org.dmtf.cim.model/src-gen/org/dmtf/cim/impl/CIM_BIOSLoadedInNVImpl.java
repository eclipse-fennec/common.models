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

import org.dmtf.cim.CIM_BIOSLoadedInNV;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Loaded In NV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSLoadedInNVImpl#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSLoadedInNVImpl#getEndingAddress <em>Ending Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSLoadedInNVImpl extends CIM_DependencyImpl implements CIM_BIOSLoadedInNV {
	/**
	 * The default value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingAddress() <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long startingAddress = STARTING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENDING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingAddress() <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long endingAddress = ENDING_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSLoadedInNVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSLoadedInNV();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartingAddress() {
		return startingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartingAddress(Long newStartingAddress) {
		Long oldStartingAddress = startingAddress;
		startingAddress = newStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_LOADED_IN_NV__STARTING_ADDRESS, oldStartingAddress, startingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEndingAddress() {
		return endingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndingAddress(Long newEndingAddress) {
		Long oldEndingAddress = endingAddress;
		endingAddress = newEndingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_LOADED_IN_NV__ENDING_ADDRESS, oldEndingAddress, endingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_LOADED_IN_NV__STARTING_ADDRESS:
				return getStartingAddress();
			case CimPackage.CIM_BIOS_LOADED_IN_NV__ENDING_ADDRESS:
				return getEndingAddress();
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
			case CimPackage.CIM_BIOS_LOADED_IN_NV__STARTING_ADDRESS:
				setStartingAddress((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_LOADED_IN_NV__ENDING_ADDRESS:
				setEndingAddress((Long)newValue);
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
			case CimPackage.CIM_BIOS_LOADED_IN_NV__STARTING_ADDRESS:
				setStartingAddress(STARTING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_LOADED_IN_NV__ENDING_ADDRESS:
				setEndingAddress(ENDING_ADDRESS_EDEFAULT);
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
			case CimPackage.CIM_BIOS_LOADED_IN_NV__STARTING_ADDRESS:
				return STARTING_ADDRESS_EDEFAULT == null ? startingAddress != null : !STARTING_ADDRESS_EDEFAULT.equals(startingAddress);
			case CimPackage.CIM_BIOS_LOADED_IN_NV__ENDING_ADDRESS:
				return ENDING_ADDRESS_EDEFAULT == null ? endingAddress != null : !ENDING_ADDRESS_EDEFAULT.equals(endingAddress);
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
		result.append(" (StartingAddress: ");
		result.append(startingAddress);
		result.append(", EndingAddress: ");
		result.append(endingAddress);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSLoadedInNVImpl
