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

import org.dmtf.cim.CIM_PreconfiguredTunnelAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Preconfigured Tunnel Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PreconfiguredTunnelActionImpl#getDFHandling <em>DF Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PreconfiguredTunnelActionImpl extends CIM_PreconfiguredSAActionImpl implements CIM_PreconfiguredTunnelAction {
	/**
	 * The default value of the '{@link #getDFHandling() <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFHandling()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DF_HANDLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFHandling() <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFHandling()
	 * @generated
	 * @ordered
	 */
	protected Integer dfHandling = DF_HANDLING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PreconfiguredTunnelActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PreconfiguredTunnelAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDFHandling() {
		return dfHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFHandling(Integer newDFHandling) {
		Integer oldDFHandling = dfHandling;
		dfHandling = newDFHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION__DF_HANDLING, oldDFHandling, dfHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION__DF_HANDLING:
				return getDFHandling();
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
			case CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION__DF_HANDLING:
				setDFHandling((Integer)newValue);
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
			case CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION__DF_HANDLING:
				setDFHandling(DF_HANDLING_EDEFAULT);
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
			case CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION__DF_HANDLING:
				return DF_HANDLING_EDEFAULT == null ? dfHandling != null : !DF_HANDLING_EDEFAULT.equals(dfHandling);
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
		result.append(" (DFHandling: ");
		result.append(dfHandling);
		result.append(')');
		return result.toString();
	}

} //CIM_PreconfiguredTunnelActionImpl
