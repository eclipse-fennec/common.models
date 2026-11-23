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

import org.dmtf.cim.CIM_WSManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM WS Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WSManagementCapabilitiesImpl#getXPathFeatures <em>XPath Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WSManagementCapabilitiesImpl extends CIM_WBEMProtocolServiceCapabilitiesImpl implements CIM_WSManagementCapabilities {
	/**
	 * The default value of the '{@link #getXPathFeatures() <em>XPath Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPATH_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPathFeatures() <em>XPath Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathFeatures()
	 * @generated
	 * @ordered
	 */
	protected Integer xPathFeatures = XPATH_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WSManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WSManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getXPathFeatures() {
		return xPathFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXPathFeatures(Integer newXPathFeatures) {
		Integer oldXPathFeatures = xPathFeatures;
		xPathFeatures = newXPathFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES__XPATH_FEATURES, oldXPathFeatures, xPathFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES__XPATH_FEATURES:
				return getXPathFeatures();
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
			case CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES__XPATH_FEATURES:
				setXPathFeatures((Integer)newValue);
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
			case CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES__XPATH_FEATURES:
				setXPathFeatures(XPATH_FEATURES_EDEFAULT);
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
			case CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES__XPATH_FEATURES:
				return XPATH_FEATURES_EDEFAULT == null ? xPathFeatures != null : !XPATH_FEATURES_EDEFAULT.equals(xPathFeatures);
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
		result.append(" (XPathFeatures: ");
		result.append(xPathFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_WSManagementCapabilitiesImpl
