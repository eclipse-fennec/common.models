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

import org.dmtf.cim.CIM_IPNetworkIdentity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Network Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPNetworkIdentityImpl#getIdentityType <em>Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPNetworkIdentityImpl#getIdentityValue <em>Identity Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPNetworkIdentityImpl extends CIM_IdentityImpl implements CIM_IPNetworkIdentity {
	/**
	 * The default value of the '{@link #getIdentityType() <em>Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IDENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentityType() <em>Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityType()
	 * @generated
	 * @ordered
	 */
	protected Integer identityType = IDENTITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentityValue() <em>Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityValue()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentityValue() <em>Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityValue()
	 * @generated
	 * @ordered
	 */
	protected String identityValue = IDENTITY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPNetworkIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPNetworkIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIdentityType() {
		return identityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentityType(Integer newIdentityType) {
		Integer oldIdentityType = identityType;
		identityType = newIdentityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_TYPE, oldIdentityType, identityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentityValue() {
		return identityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentityValue(String newIdentityValue) {
		String oldIdentityValue = identityValue;
		identityValue = newIdentityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_VALUE, oldIdentityValue, identityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_TYPE:
				return getIdentityType();
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_VALUE:
				return getIdentityValue();
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
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_TYPE:
				setIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_VALUE:
				setIdentityValue((String)newValue);
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
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_TYPE:
				setIdentityType(IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_VALUE:
				setIdentityValue(IDENTITY_VALUE_EDEFAULT);
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
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_TYPE:
				return IDENTITY_TYPE_EDEFAULT == null ? identityType != null : !IDENTITY_TYPE_EDEFAULT.equals(identityType);
			case CimPackage.CIM_IP_NETWORK_IDENTITY__IDENTITY_VALUE:
				return IDENTITY_VALUE_EDEFAULT == null ? identityValue != null : !IDENTITY_VALUE_EDEFAULT.equals(identityValue);
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
		result.append(" (IdentityType: ");
		result.append(identityType);
		result.append(", IdentityValue: ");
		result.append(identityValue);
		result.append(')');
		return result.toString();
	}

} //CIM_IPNetworkIdentityImpl
