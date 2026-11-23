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

import org.dmtf.cim.CIM_SourceRoutingService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Source Routing Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SourceRoutingServiceImpl#getBridgeLfMode <em>Bridge Lf Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SourceRoutingServiceImpl extends CIM_ForwardingServiceImpl implements CIM_SourceRoutingService {
	/**
	 * The default value of the '{@link #getBridgeLfMode() <em>Bridge Lf Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeLfMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_LF_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeLfMode() <em>Bridge Lf Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeLfMode()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeLfMode = BRIDGE_LF_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SourceRoutingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SourceRoutingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeLfMode() {
		return bridgeLfMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeLfMode(Integer newBridgeLfMode) {
		Integer oldBridgeLfMode = bridgeLfMode;
		bridgeLfMode = newBridgeLfMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOURCE_ROUTING_SERVICE__BRIDGE_LF_MODE, oldBridgeLfMode, bridgeLfMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOURCE_ROUTING_SERVICE__BRIDGE_LF_MODE:
				return getBridgeLfMode();
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
			case CimPackage.CIM_SOURCE_ROUTING_SERVICE__BRIDGE_LF_MODE:
				setBridgeLfMode((Integer)newValue);
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
			case CimPackage.CIM_SOURCE_ROUTING_SERVICE__BRIDGE_LF_MODE:
				setBridgeLfMode(BRIDGE_LF_MODE_EDEFAULT);
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
			case CimPackage.CIM_SOURCE_ROUTING_SERVICE__BRIDGE_LF_MODE:
				return BRIDGE_LF_MODE_EDEFAULT == null ? bridgeLfMode != null : !BRIDGE_LF_MODE_EDEFAULT.equals(bridgeLfMode);
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
		result.append(" (BridgeLfMode: ");
		result.append(bridgeLfMode);
		result.append(')');
		return result.toString();
	}

} //CIM_SourceRoutingServiceImpl
