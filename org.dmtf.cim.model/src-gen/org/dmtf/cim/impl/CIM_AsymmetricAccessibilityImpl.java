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

import org.dmtf.cim.CIM_AsymmetricAccessibility;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Asymmetric Accessibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AsymmetricAccessibilityImpl#getCurrentAccessState <em>Current Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AsymmetricAccessibilityImpl#getNormalAccessState <em>Normal Access State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AsymmetricAccessibilityImpl extends CIM_DependencyImpl implements CIM_AsymmetricAccessibility {
	/**
	 * The default value of the '{@link #getCurrentAccessState() <em>Current Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAccessState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_ACCESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentAccessState() <em>Current Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAccessState()
	 * @generated
	 * @ordered
	 */
	protected Integer currentAccessState = CURRENT_ACCESS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalAccessState() <em>Normal Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalAccessState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NORMAL_ACCESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalAccessState() <em>Normal Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalAccessState()
	 * @generated
	 * @ordered
	 */
	protected Integer normalAccessState = NORMAL_ACCESS_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AsymmetricAccessibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AsymmetricAccessibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentAccessState() {
		return currentAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentAccessState(Integer newCurrentAccessState) {
		Integer oldCurrentAccessState = currentAccessState;
		currentAccessState = newCurrentAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__CURRENT_ACCESS_STATE, oldCurrentAccessState, currentAccessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNormalAccessState() {
		return normalAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalAccessState(Integer newNormalAccessState) {
		Integer oldNormalAccessState = normalAccessState;
		normalAccessState = newNormalAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__NORMAL_ACCESS_STATE, oldNormalAccessState, normalAccessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__CURRENT_ACCESS_STATE:
				return getCurrentAccessState();
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__NORMAL_ACCESS_STATE:
				return getNormalAccessState();
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
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__CURRENT_ACCESS_STATE:
				setCurrentAccessState((Integer)newValue);
				return;
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__NORMAL_ACCESS_STATE:
				setNormalAccessState((Integer)newValue);
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
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__CURRENT_ACCESS_STATE:
				setCurrentAccessState(CURRENT_ACCESS_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__NORMAL_ACCESS_STATE:
				setNormalAccessState(NORMAL_ACCESS_STATE_EDEFAULT);
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
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__CURRENT_ACCESS_STATE:
				return CURRENT_ACCESS_STATE_EDEFAULT == null ? currentAccessState != null : !CURRENT_ACCESS_STATE_EDEFAULT.equals(currentAccessState);
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY__NORMAL_ACCESS_STATE:
				return NORMAL_ACCESS_STATE_EDEFAULT == null ? normalAccessState != null : !NORMAL_ACCESS_STATE_EDEFAULT.equals(normalAccessState);
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
		result.append(" (CurrentAccessState: ");
		result.append(currentAccessState);
		result.append(", NormalAccessState: ");
		result.append(normalAccessState);
		result.append(')');
		return result.toString();
	}

} //CIM_AsymmetricAccessibilityImpl
