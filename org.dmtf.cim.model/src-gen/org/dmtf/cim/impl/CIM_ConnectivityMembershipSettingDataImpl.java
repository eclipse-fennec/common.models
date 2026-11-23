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

import org.dmtf.cim.CIM_ConnectivityMembershipSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Connectivity Membership Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConnectivityMembershipSettingDataImpl#getConnectivityMemberType <em>Connectivity Member Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConnectivityMembershipSettingDataImpl#getOtherConnectivityMemberType <em>Other Connectivity Member Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConnectivityMembershipSettingDataImpl#getConnectivityMemberID <em>Connectivity Member ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConnectivityMembershipSettingDataImpl extends CIM_SettingDataImpl implements CIM_ConnectivityMembershipSettingData {
	/**
	 * The default value of the '{@link #getConnectivityMemberType() <em>Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMemberType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTIVITY_MEMBER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityMemberType() <em>Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMemberType()
	 * @generated
	 * @ordered
	 */
	protected Integer connectivityMemberType = CONNECTIVITY_MEMBER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherConnectivityMemberType() <em>Other Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectivityMemberType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONNECTIVITY_MEMBER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherConnectivityMemberType() <em>Other Connectivity Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectivityMemberType()
	 * @generated
	 * @ordered
	 */
	protected String otherConnectivityMemberType = OTHER_CONNECTIVITY_MEMBER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectivityMemberID() <em>Connectivity Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMemberID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTIVITY_MEMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityMemberID() <em>Connectivity Member ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityMemberID()
	 * @generated
	 * @ordered
	 */
	protected String connectivityMemberID = CONNECTIVITY_MEMBER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConnectivityMembershipSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConnectivityMembershipSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectivityMemberType() {
		return connectivityMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectivityMemberType(Integer newConnectivityMemberType) {
		Integer oldConnectivityMemberType = connectivityMemberType;
		connectivityMemberType = newConnectivityMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_TYPE, oldConnectivityMemberType, connectivityMemberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherConnectivityMemberType() {
		return otherConnectivityMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherConnectivityMemberType(String newOtherConnectivityMemberType) {
		String oldOtherConnectivityMemberType = otherConnectivityMemberType;
		otherConnectivityMemberType = newOtherConnectivityMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBER_TYPE, oldOtherConnectivityMemberType, otherConnectivityMemberType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectivityMemberID() {
		return connectivityMemberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectivityMemberID(String newConnectivityMemberID) {
		String oldConnectivityMemberID = connectivityMemberID;
		connectivityMemberID = newConnectivityMemberID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_ID, oldConnectivityMemberID, connectivityMemberID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_TYPE:
				return getConnectivityMemberType();
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBER_TYPE:
				return getOtherConnectivityMemberType();
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_ID:
				return getConnectivityMemberID();
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
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_TYPE:
				setConnectivityMemberType((Integer)newValue);
				return;
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBER_TYPE:
				setOtherConnectivityMemberType((String)newValue);
				return;
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_ID:
				setConnectivityMemberID((String)newValue);
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
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_TYPE:
				setConnectivityMemberType(CONNECTIVITY_MEMBER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBER_TYPE:
				setOtherConnectivityMemberType(OTHER_CONNECTIVITY_MEMBER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_ID:
				setConnectivityMemberID(CONNECTIVITY_MEMBER_ID_EDEFAULT);
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
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_TYPE:
				return CONNECTIVITY_MEMBER_TYPE_EDEFAULT == null ? connectivityMemberType != null : !CONNECTIVITY_MEMBER_TYPE_EDEFAULT.equals(connectivityMemberType);
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBER_TYPE:
				return OTHER_CONNECTIVITY_MEMBER_TYPE_EDEFAULT == null ? otherConnectivityMemberType != null : !OTHER_CONNECTIVITY_MEMBER_TYPE_EDEFAULT.equals(otherConnectivityMemberType);
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA__CONNECTIVITY_MEMBER_ID:
				return CONNECTIVITY_MEMBER_ID_EDEFAULT == null ? connectivityMemberID != null : !CONNECTIVITY_MEMBER_ID_EDEFAULT.equals(connectivityMemberID);
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
		result.append(" (ConnectivityMemberType: ");
		result.append(connectivityMemberType);
		result.append(", OtherConnectivityMemberType: ");
		result.append(otherConnectivityMemberType);
		result.append(", ConnectivityMemberID: ");
		result.append(connectivityMemberID);
		result.append(')');
		return result.toString();
	}

} //CIM_ConnectivityMembershipSettingDataImpl
