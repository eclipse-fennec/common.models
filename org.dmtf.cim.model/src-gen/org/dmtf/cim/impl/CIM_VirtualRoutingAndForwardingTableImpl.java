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

import org.dmtf.cim.CIM_VirtualRoutingAndForwardingTable;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual Routing And Forwarding Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualRoutingAndForwardingTableImpl#getRouteDistinguisher <em>Route Distinguisher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualRoutingAndForwardingTableImpl extends CIM_SystemSpecificCollectionImpl implements CIM_VirtualRoutingAndForwardingTable {
	/**
	 * The default value of the '{@link #getRouteDistinguisher() <em>Route Distinguisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDistinguisher()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_DISTINGUISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDistinguisher() <em>Route Distinguisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDistinguisher()
	 * @generated
	 * @ordered
	 */
	protected String routeDistinguisher = ROUTE_DISTINGUISHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualRoutingAndForwardingTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualRoutingAndForwardingTable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteDistinguisher() {
		return routeDistinguisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDistinguisher(String newRouteDistinguisher) {
		String oldRouteDistinguisher = routeDistinguisher;
		routeDistinguisher = newRouteDistinguisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE__ROUTE_DISTINGUISHER, oldRouteDistinguisher, routeDistinguisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE__ROUTE_DISTINGUISHER:
				return getRouteDistinguisher();
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
			case CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE__ROUTE_DISTINGUISHER:
				setRouteDistinguisher((String)newValue);
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
			case CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE__ROUTE_DISTINGUISHER:
				setRouteDistinguisher(ROUTE_DISTINGUISHER_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE__ROUTE_DISTINGUISHER:
				return ROUTE_DISTINGUISHER_EDEFAULT == null ? routeDistinguisher != null : !ROUTE_DISTINGUISHER_EDEFAULT.equals(routeDistinguisher);
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
		result.append(" (RouteDistinguisher: ");
		result.append(routeDistinguisher);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualRoutingAndForwardingTableImpl
