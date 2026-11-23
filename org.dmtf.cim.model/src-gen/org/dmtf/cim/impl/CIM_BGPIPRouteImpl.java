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

import org.dmtf.cim.CIM_BGPIPRoute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGPIP Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPIPRouteImpl#getIsBackDoorRoute <em>Is Back Door Route</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPIPRouteImpl#getUsesLoopbackPeering <em>Uses Loopback Peering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPIPRouteImpl extends CIM_IPRouteImpl implements CIM_BGPIPRoute {
	/**
	 * The default value of the '{@link #getIsBackDoorRoute() <em>Is Back Door Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBackDoorRoute()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BACK_DOOR_ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBackDoorRoute() <em>Is Back Door Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBackDoorRoute()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBackDoorRoute = IS_BACK_DOOR_ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsesLoopbackPeering() <em>Uses Loopback Peering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesLoopbackPeering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USES_LOOPBACK_PEERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsesLoopbackPeering() <em>Uses Loopback Peering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesLoopbackPeering()
	 * @generated
	 * @ordered
	 */
	protected Boolean usesLoopbackPeering = USES_LOOPBACK_PEERING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPIPRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPIPRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsBackDoorRoute() {
		return isBackDoorRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBackDoorRoute(Boolean newIsBackDoorRoute) {
		Boolean oldIsBackDoorRoute = isBackDoorRoute;
		isBackDoorRoute = newIsBackDoorRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGPIP_ROUTE__IS_BACK_DOOR_ROUTE, oldIsBackDoorRoute, isBackDoorRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUsesLoopbackPeering() {
		return usesLoopbackPeering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesLoopbackPeering(Boolean newUsesLoopbackPeering) {
		Boolean oldUsesLoopbackPeering = usesLoopbackPeering;
		usesLoopbackPeering = newUsesLoopbackPeering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGPIP_ROUTE__USES_LOOPBACK_PEERING, oldUsesLoopbackPeering, usesLoopbackPeering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGPIP_ROUTE__IS_BACK_DOOR_ROUTE:
				return getIsBackDoorRoute();
			case CimPackage.CIM_BGPIP_ROUTE__USES_LOOPBACK_PEERING:
				return getUsesLoopbackPeering();
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
			case CimPackage.CIM_BGPIP_ROUTE__IS_BACK_DOOR_ROUTE:
				setIsBackDoorRoute((Boolean)newValue);
				return;
			case CimPackage.CIM_BGPIP_ROUTE__USES_LOOPBACK_PEERING:
				setUsesLoopbackPeering((Boolean)newValue);
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
			case CimPackage.CIM_BGPIP_ROUTE__IS_BACK_DOOR_ROUTE:
				setIsBackDoorRoute(IS_BACK_DOOR_ROUTE_EDEFAULT);
				return;
			case CimPackage.CIM_BGPIP_ROUTE__USES_LOOPBACK_PEERING:
				setUsesLoopbackPeering(USES_LOOPBACK_PEERING_EDEFAULT);
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
			case CimPackage.CIM_BGPIP_ROUTE__IS_BACK_DOOR_ROUTE:
				return IS_BACK_DOOR_ROUTE_EDEFAULT == null ? isBackDoorRoute != null : !IS_BACK_DOOR_ROUTE_EDEFAULT.equals(isBackDoorRoute);
			case CimPackage.CIM_BGPIP_ROUTE__USES_LOOPBACK_PEERING:
				return USES_LOOPBACK_PEERING_EDEFAULT == null ? usesLoopbackPeering != null : !USES_LOOPBACK_PEERING_EDEFAULT.equals(usesLoopbackPeering);
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
		result.append(" (IsBackDoorRoute: ");
		result.append(isBackDoorRoute);
		result.append(", UsesLoopbackPeering: ");
		result.append(usesLoopbackPeering);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPIPRouteImpl
