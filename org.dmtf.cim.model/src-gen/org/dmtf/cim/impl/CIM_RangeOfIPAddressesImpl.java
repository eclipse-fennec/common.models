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

import org.dmtf.cim.CIM_RangeOfIPAddresses;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Range Of IP Addresses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RangeOfIPAddressesImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RangeOfIPAddressesImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RangeOfIPAddressesImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RangeOfIPAddressesImpl extends CIM_SystemSpecificCollectionImpl implements CIM_RangeOfIPAddresses {
	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected String startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected String endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RangeOfIPAddressesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RangeOfIPAddresses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartAddress(String newStartAddress) {
		String oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RANGE_OF_IP_ADDRESSES__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndAddress(String newEndAddress) {
		String oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RANGE_OF_IP_ADDRESSES__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				return getStartAddress();
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				return getEndAddress();
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				return getAddressType();
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
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				setStartAddress((String)newValue);
				return;
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				setEndAddress((String)newValue);
				return;
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
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
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__START_ADDRESS:
				return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__END_ADDRESS:
				return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
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
		result.append(" (StartAddress: ");
		result.append(startAddress);
		result.append(", EndAddress: ");
		result.append(endAddress);
		result.append(", AddressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //CIM_RangeOfIPAddressesImpl
