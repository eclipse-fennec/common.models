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

import org.dmtf.cim.CIM_IKEAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IKE Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKEActionImpl#getExchangeMode <em>Exchange Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKEActionImpl#getUseIKEIdentityType <em>Use IKE Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKEActionImpl#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKEActionImpl#getAggressiveModeGroupID <em>Aggressive Mode Group ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IKEActionImpl extends CIM_SANegotiationActionImpl implements CIM_IKEAction {
	/**
	 * The default value of the '{@link #getExchangeMode() <em>Exchange Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXCHANGE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeMode() <em>Exchange Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMode()
	 * @generated
	 * @ordered
	 */
	protected Integer exchangeMode = EXCHANGE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseIKEIdentityType() <em>Use IKE Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIKEIdentityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USE_IKE_IDENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseIKEIdentityType() <em>Use IKE Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIKEIdentityType()
	 * @generated
	 * @ordered
	 */
	protected Integer useIKEIdentityType = USE_IKE_IDENTITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected String vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggressiveModeGroupID() <em>Aggressive Mode Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggressiveModeGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGGRESSIVE_MODE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggressiveModeGroupID() <em>Aggressive Mode Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggressiveModeGroupID()
	 * @generated
	 * @ordered
	 */
	protected Integer aggressiveModeGroupID = AGGRESSIVE_MODE_GROUP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IKEActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IKEAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExchangeMode() {
		return exchangeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchangeMode(Integer newExchangeMode) {
		Integer oldExchangeMode = exchangeMode;
		exchangeMode = newExchangeMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKE_ACTION__EXCHANGE_MODE, oldExchangeMode, exchangeMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUseIKEIdentityType() {
		return useIKEIdentityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseIKEIdentityType(Integer newUseIKEIdentityType) {
		Integer oldUseIKEIdentityType = useIKEIdentityType;
		useIKEIdentityType = newUseIKEIdentityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKE_ACTION__USE_IKE_IDENTITY_TYPE, oldUseIKEIdentityType, useIKEIdentityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(String newVendorID) {
		String oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKE_ACTION__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAggressiveModeGroupID() {
		return aggressiveModeGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggressiveModeGroupID(Integer newAggressiveModeGroupID) {
		Integer oldAggressiveModeGroupID = aggressiveModeGroupID;
		aggressiveModeGroupID = newAggressiveModeGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKE_ACTION__AGGRESSIVE_MODE_GROUP_ID, oldAggressiveModeGroupID, aggressiveModeGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IKE_ACTION__EXCHANGE_MODE:
				return getExchangeMode();
			case CimPackage.CIM_IKE_ACTION__USE_IKE_IDENTITY_TYPE:
				return getUseIKEIdentityType();
			case CimPackage.CIM_IKE_ACTION__VENDOR_ID:
				return getVendorID();
			case CimPackage.CIM_IKE_ACTION__AGGRESSIVE_MODE_GROUP_ID:
				return getAggressiveModeGroupID();
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
			case CimPackage.CIM_IKE_ACTION__EXCHANGE_MODE:
				setExchangeMode((Integer)newValue);
				return;
			case CimPackage.CIM_IKE_ACTION__USE_IKE_IDENTITY_TYPE:
				setUseIKEIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_IKE_ACTION__VENDOR_ID:
				setVendorID((String)newValue);
				return;
			case CimPackage.CIM_IKE_ACTION__AGGRESSIVE_MODE_GROUP_ID:
				setAggressiveModeGroupID((Integer)newValue);
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
			case CimPackage.CIM_IKE_ACTION__EXCHANGE_MODE:
				setExchangeMode(EXCHANGE_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_IKE_ACTION__USE_IKE_IDENTITY_TYPE:
				setUseIKEIdentityType(USE_IKE_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IKE_ACTION__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IKE_ACTION__AGGRESSIVE_MODE_GROUP_ID:
				setAggressiveModeGroupID(AGGRESSIVE_MODE_GROUP_ID_EDEFAULT);
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
			case CimPackage.CIM_IKE_ACTION__EXCHANGE_MODE:
				return EXCHANGE_MODE_EDEFAULT == null ? exchangeMode != null : !EXCHANGE_MODE_EDEFAULT.equals(exchangeMode);
			case CimPackage.CIM_IKE_ACTION__USE_IKE_IDENTITY_TYPE:
				return USE_IKE_IDENTITY_TYPE_EDEFAULT == null ? useIKEIdentityType != null : !USE_IKE_IDENTITY_TYPE_EDEFAULT.equals(useIKEIdentityType);
			case CimPackage.CIM_IKE_ACTION__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
			case CimPackage.CIM_IKE_ACTION__AGGRESSIVE_MODE_GROUP_ID:
				return AGGRESSIVE_MODE_GROUP_ID_EDEFAULT == null ? aggressiveModeGroupID != null : !AGGRESSIVE_MODE_GROUP_ID_EDEFAULT.equals(aggressiveModeGroupID);
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
		result.append(" (ExchangeMode: ");
		result.append(exchangeMode);
		result.append(", UseIKEIdentityType: ");
		result.append(useIKEIdentityType);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(", AggressiveModeGroupID: ");
		result.append(aggressiveModeGroupID);
		result.append(')');
		return result.toString();
	}

} //CIM_IKEActionImpl
