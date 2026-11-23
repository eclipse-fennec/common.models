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

import org.dmtf.cim.CIM_EGPRouteCalcDependency;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM EGP Route Calc Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EGPRouteCalcDependencyImpl#getIGPInjection <em>IGP Injection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EGPRouteCalcDependencyImpl extends CIM_ServiceServiceDependencyImpl implements CIM_EGPRouteCalcDependency {
	/**
	 * The default value of the '{@link #getIGPInjection() <em>IGP Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGPInjection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IGP_INJECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIGPInjection() <em>IGP Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGPInjection()
	 * @generated
	 * @ordered
	 */
	protected Integer igpInjection = IGP_INJECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EGPRouteCalcDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EGPRouteCalcDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIGPInjection() {
		return igpInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIGPInjection(Integer newIGPInjection) {
		Integer oldIGPInjection = igpInjection;
		igpInjection = newIGPInjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY__IGP_INJECTION, oldIGPInjection, igpInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY__IGP_INJECTION:
				return getIGPInjection();
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
			case CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY__IGP_INJECTION:
				setIGPInjection((Integer)newValue);
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
			case CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY__IGP_INJECTION:
				setIGPInjection(IGP_INJECTION_EDEFAULT);
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
			case CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY__IGP_INJECTION:
				return IGP_INJECTION_EDEFAULT == null ? igpInjection != null : !IGP_INJECTION_EDEFAULT.equals(igpInjection);
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
		result.append(" (IGPInjection: ");
		result.append(igpInjection);
		result.append(')');
		return result.toString();
	}

} //CIM_EGPRouteCalcDependencyImpl
