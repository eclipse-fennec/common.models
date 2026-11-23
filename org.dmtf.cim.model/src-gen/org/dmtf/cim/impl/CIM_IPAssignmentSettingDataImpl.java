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

import org.dmtf.cim.CIM_IPAssignmentSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAssignmentSettingDataImpl#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAssignmentSettingDataImpl#getProtocolIFType <em>Protocol IF Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPAssignmentSettingDataImpl extends CIM_SettingDataImpl implements CIM_IPAssignmentSettingData {
	/**
	 * The default value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_ORIGIN_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected Integer addressOrigin = ADDRESS_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_IF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolIFType = PROTOCOL_IF_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPAssignmentSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPAssignmentSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressOrigin() {
		return addressOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressOrigin(Integer newAddressOrigin) {
		Integer oldAddressOrigin = addressOrigin;
		addressOrigin = newAddressOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN, oldAddressOrigin, addressOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolIFType() {
		return protocolIFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolIFType(Integer newProtocolIFType) {
		Integer oldProtocolIFType = protocolIFType;
		protocolIFType = newProtocolIFType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__PROTOCOL_IF_TYPE, oldProtocolIFType, protocolIFType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				return getAddressOrigin();
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__PROTOCOL_IF_TYPE:
				return getProtocolIFType();
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
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				setAddressOrigin((Integer)newValue);
				return;
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__PROTOCOL_IF_TYPE:
				setProtocolIFType((Integer)newValue);
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
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				setAddressOrigin(ADDRESS_ORIGIN_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__PROTOCOL_IF_TYPE:
				setProtocolIFType(PROTOCOL_IF_TYPE_EDEFAULT);
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
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__ADDRESS_ORIGIN:
				return ADDRESS_ORIGIN_EDEFAULT == null ? addressOrigin != null : !ADDRESS_ORIGIN_EDEFAULT.equals(addressOrigin);
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA__PROTOCOL_IF_TYPE:
				return PROTOCOL_IF_TYPE_EDEFAULT == null ? protocolIFType != null : !PROTOCOL_IF_TYPE_EDEFAULT.equals(protocolIFType);
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
		result.append(" (AddressOrigin: ");
		result.append(addressOrigin);
		result.append(", ProtocolIFType: ");
		result.append(protocolIFType);
		result.append(')');
		return result.toString();
	}

} //CIM_IPAssignmentSettingDataImpl
