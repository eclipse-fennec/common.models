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

import org.dmtf.cim.CIM_RangesOfConfiguration;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Ranges Of Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RangesOfConfigurationImpl#getEnableAdvertise <em>Enable Advertise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RangesOfConfigurationImpl extends CIM_DependencyImpl implements CIM_RangesOfConfiguration {
	/**
	 * The default value of the '{@link #getEnableAdvertise() <em>Enable Advertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableAdvertise()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_ADVERTISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableAdvertise() <em>Enable Advertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableAdvertise()
	 * @generated
	 * @ordered
	 */
	protected Boolean enableAdvertise = ENABLE_ADVERTISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RangesOfConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RangesOfConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableAdvertise() {
		return enableAdvertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAdvertise(Boolean newEnableAdvertise) {
		Boolean oldEnableAdvertise = enableAdvertise;
		enableAdvertise = newEnableAdvertise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RANGES_OF_CONFIGURATION__ENABLE_ADVERTISE, oldEnableAdvertise, enableAdvertise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RANGES_OF_CONFIGURATION__ENABLE_ADVERTISE:
				return getEnableAdvertise();
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
			case CimPackage.CIM_RANGES_OF_CONFIGURATION__ENABLE_ADVERTISE:
				setEnableAdvertise((Boolean)newValue);
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
			case CimPackage.CIM_RANGES_OF_CONFIGURATION__ENABLE_ADVERTISE:
				setEnableAdvertise(ENABLE_ADVERTISE_EDEFAULT);
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
			case CimPackage.CIM_RANGES_OF_CONFIGURATION__ENABLE_ADVERTISE:
				return ENABLE_ADVERTISE_EDEFAULT == null ? enableAdvertise != null : !ENABLE_ADVERTISE_EDEFAULT.equals(enableAdvertise);
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
		result.append(" (EnableAdvertise: ");
		result.append(enableAdvertise);
		result.append(')');
		return result.toString();
	}

} //CIM_RangesOfConfigurationImpl
