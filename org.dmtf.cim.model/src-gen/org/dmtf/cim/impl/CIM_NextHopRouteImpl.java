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

import org.dmtf.cim.CIM_NextHopRoute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Next Hop Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRouteImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRouteImpl#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRouteImpl#getRouteMetric <em>Route Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRouteImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRouteImpl#getTypeOfRoute <em>Type Of Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NextHopRouteImpl extends CIM_ManagedElementImpl implements CIM_NextHopRoute {
	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getRouteMetric() <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROUTE_METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteMetric() <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteMetric()
	 * @generated
	 * @ordered
	 */
	protected Integer routeMetric = ROUTE_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfRoute() <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRoute()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_ROUTE_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getTypeOfRoute() <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRoute()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfRoute = TYPE_OF_ROUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NextHopRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NextHopRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationAddress(String newDestinationAddress) {
		String oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTE__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTE__ADMIN_DISTANCE, oldAdminDistance, adminDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRouteMetric() {
		return routeMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteMetric(Integer newRouteMetric) {
		Integer oldRouteMetric = routeMetric;
		routeMetric = newRouteMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTE__ROUTE_METRIC, oldRouteMetric, routeMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStatic(Boolean newIsStatic) {
		Boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfRoute() {
		return typeOfRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfRoute(Integer newTypeOfRoute) {
		Integer oldTypeOfRoute = typeOfRoute;
		typeOfRoute = newTypeOfRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTE__TYPE_OF_ROUTE, oldTypeOfRoute, typeOfRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case CimPackage.CIM_NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				return getAdminDistance();
			case CimPackage.CIM_NEXT_HOP_ROUTE__ROUTE_METRIC:
				return getRouteMetric();
			case CimPackage.CIM_NEXT_HOP_ROUTE__IS_STATIC:
				return getIsStatic();
			case CimPackage.CIM_NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				return getTypeOfRoute();
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
			case CimPackage.CIM_NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				setDestinationAddress((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				setAdminDistance((Integer)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__ROUTE_METRIC:
				setRouteMetric((Integer)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				setTypeOfRoute((Integer)newValue);
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
			case CimPackage.CIM_NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				setAdminDistance(ADMIN_DISTANCE_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__ROUTE_METRIC:
				setRouteMetric(ROUTE_METRIC_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				setTypeOfRoute(TYPE_OF_ROUTE_EDEFAULT);
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
			case CimPackage.CIM_NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case CimPackage.CIM_NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				return ADMIN_DISTANCE_EDEFAULT == null ? adminDistance != null : !ADMIN_DISTANCE_EDEFAULT.equals(adminDistance);
			case CimPackage.CIM_NEXT_HOP_ROUTE__ROUTE_METRIC:
				return ROUTE_METRIC_EDEFAULT == null ? routeMetric != null : !ROUTE_METRIC_EDEFAULT.equals(routeMetric);
			case CimPackage.CIM_NEXT_HOP_ROUTE__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case CimPackage.CIM_NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				return TYPE_OF_ROUTE_EDEFAULT == null ? typeOfRoute != null : !TYPE_OF_ROUTE_EDEFAULT.equals(typeOfRoute);
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
		result.append(" (DestinationAddress: ");
		result.append(destinationAddress);
		result.append(", AdminDistance: ");
		result.append(adminDistance);
		result.append(", RouteMetric: ");
		result.append(routeMetric);
		result.append(", IsStatic: ");
		result.append(isStatic);
		result.append(", TypeOfRoute: ");
		result.append(typeOfRoute);
		result.append(')');
		return result.toString();
	}

} //CIM_NextHopRouteImpl
