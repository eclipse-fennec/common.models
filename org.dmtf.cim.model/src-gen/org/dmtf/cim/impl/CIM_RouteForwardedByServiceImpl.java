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

import org.dmtf.cim.CIM_RouteForwardedByService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Route Forwarded By Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RouteForwardedByServiceImpl#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RouteForwardedByServiceImpl#getPathMetric <em>Path Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RouteForwardedByServiceImpl extends CIM_DependencyImpl implements CIM_RouteForwardedByService {
	/**
	 * The default value of the '{@link #getAdminDistance() <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADMIN_DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminDistance() <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminDistance()
	 * @generated
	 * @ordered
	 */
	protected Integer adminDistance = ADMIN_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathMetric() <em>Path Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathMetric() <em>Path Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathMetric()
	 * @generated
	 * @ordered
	 */
	protected Integer pathMetric = PATH_METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RouteForwardedByServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RouteForwardedByService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAdminDistance() {
		return adminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminDistance(Integer newAdminDistance) {
		Integer oldAdminDistance = adminDistance;
		adminDistance = newAdminDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__ADMIN_DISTANCE, oldAdminDistance, adminDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathMetric() {
		return pathMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathMetric(Integer newPathMetric) {
		Integer oldPathMetric = pathMetric;
		pathMetric = newPathMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__PATH_METRIC, oldPathMetric, pathMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__ADMIN_DISTANCE:
				return getAdminDistance();
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__PATH_METRIC:
				return getPathMetric();
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
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__ADMIN_DISTANCE:
				setAdminDistance((Integer)newValue);
				return;
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__PATH_METRIC:
				setPathMetric((Integer)newValue);
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
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__ADMIN_DISTANCE:
				setAdminDistance(ADMIN_DISTANCE_EDEFAULT);
				return;
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__PATH_METRIC:
				setPathMetric(PATH_METRIC_EDEFAULT);
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
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__ADMIN_DISTANCE:
				return ADMIN_DISTANCE_EDEFAULT == null ? adminDistance != null : !ADMIN_DISTANCE_EDEFAULT.equals(adminDistance);
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE__PATH_METRIC:
				return PATH_METRIC_EDEFAULT == null ? pathMetric != null : !PATH_METRIC_EDEFAULT.equals(pathMetric);
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
		result.append(" (AdminDistance: ");
		result.append(adminDistance);
		result.append(", PathMetric: ");
		result.append(pathMetric);
		result.append(')');
		return result.toString();
	}

} //CIM_RouteForwardedByServiceImpl
