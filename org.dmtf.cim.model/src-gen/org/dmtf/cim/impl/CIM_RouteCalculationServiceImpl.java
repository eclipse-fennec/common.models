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

import org.dmtf.cim.CIM_RouteCalculationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Route Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RouteCalculationServiceImpl#getRouterID <em>Router ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RouteCalculationServiceImpl#getAlgorithmType <em>Algorithm Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_RouteCalculationServiceImpl extends CIM_NetworkServiceImpl implements CIM_RouteCalculationService {
	/**
	 * The default value of the '{@link #getRouterID() <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouterID() <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterID()
	 * @generated
	 * @ordered
	 */
	protected String routerID = ROUTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmType() <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALGORITHM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmType() <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmType()
	 * @generated
	 * @ordered
	 */
	protected Integer algorithmType = ALGORITHM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RouteCalculationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RouteCalculationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouterID() {
		return routerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouterID(String newRouterID) {
		String oldRouterID = routerID;
		routerID = newRouterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ROUTER_ID, oldRouterID, routerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlgorithmType() {
		return algorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmType(Integer newAlgorithmType) {
		Integer oldAlgorithmType = algorithmType;
		algorithmType = newAlgorithmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE, oldAlgorithmType, algorithmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				return getRouterID();
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				return getAlgorithmType();
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
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				setRouterID((String)newValue);
				return;
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				setAlgorithmType((Integer)newValue);
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
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				setRouterID(ROUTER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				setAlgorithmType(ALGORITHM_TYPE_EDEFAULT);
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
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				return ROUTER_ID_EDEFAULT == null ? routerID != null : !ROUTER_ID_EDEFAULT.equals(routerID);
			case CimPackage.CIM_ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				return ALGORITHM_TYPE_EDEFAULT == null ? algorithmType != null : !ALGORITHM_TYPE_EDEFAULT.equals(algorithmType);
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
		result.append(" (RouterID: ");
		result.append(routerID);
		result.append(", AlgorithmType: ");
		result.append(algorithmType);
		result.append(')');
		return result.toString();
	}

} //CIM_RouteCalculationServiceImpl
