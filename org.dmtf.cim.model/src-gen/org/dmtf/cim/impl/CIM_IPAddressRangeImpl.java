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

import org.dmtf.cim.CIM_IPAddressRange;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Address Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAddressRangeImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAddressRangeImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAddressRangeImpl#getTypeOfAddress <em>Type Of Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPAddressRangeImpl#getAllocationRegion <em>Allocation Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_IPAddressRangeImpl extends CIM_CollectionOfMSEsImpl implements CIM_IPAddressRange {
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
	 * The default value of the '{@link #getTypeOfAddress() <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfAddress() <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAddress()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfAddress = TYPE_OF_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocationRegion() <em>Allocation Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationRegion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALLOCATION_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationRegion() <em>Allocation Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationRegion()
	 * @generated
	 * @ordered
	 */
	protected Integer allocationRegion = ALLOCATION_REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPAddressRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPAddressRange();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ADDRESS_RANGE__START_ADDRESS, oldStartAddress, startAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ADDRESS_RANGE__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfAddress() {
		return typeOfAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfAddress(Integer newTypeOfAddress) {
		Integer oldTypeOfAddress = typeOfAddress;
		typeOfAddress = newTypeOfAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ADDRESS_RANGE__TYPE_OF_ADDRESS, oldTypeOfAddress, typeOfAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAllocationRegion() {
		return allocationRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationRegion(Integer newAllocationRegion) {
		Integer oldAllocationRegion = allocationRegion;
		allocationRegion = newAllocationRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_ADDRESS_RANGE__ALLOCATION_REGION, oldAllocationRegion, allocationRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_ADDRESS_RANGE__START_ADDRESS:
				return getStartAddress();
			case CimPackage.CIM_IP_ADDRESS_RANGE__END_ADDRESS:
				return getEndAddress();
			case CimPackage.CIM_IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				return getTypeOfAddress();
			case CimPackage.CIM_IP_ADDRESS_RANGE__ALLOCATION_REGION:
				return getAllocationRegion();
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
			case CimPackage.CIM_IP_ADDRESS_RANGE__START_ADDRESS:
				setStartAddress((String)newValue);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__END_ADDRESS:
				setEndAddress((String)newValue);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				setTypeOfAddress((Integer)newValue);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__ALLOCATION_REGION:
				setAllocationRegion((Integer)newValue);
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
			case CimPackage.CIM_IP_ADDRESS_RANGE__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				setTypeOfAddress(TYPE_OF_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_ADDRESS_RANGE__ALLOCATION_REGION:
				setAllocationRegion(ALLOCATION_REGION_EDEFAULT);
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
			case CimPackage.CIM_IP_ADDRESS_RANGE__START_ADDRESS:
				return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
			case CimPackage.CIM_IP_ADDRESS_RANGE__END_ADDRESS:
				return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
			case CimPackage.CIM_IP_ADDRESS_RANGE__TYPE_OF_ADDRESS:
				return TYPE_OF_ADDRESS_EDEFAULT == null ? typeOfAddress != null : !TYPE_OF_ADDRESS_EDEFAULT.equals(typeOfAddress);
			case CimPackage.CIM_IP_ADDRESS_RANGE__ALLOCATION_REGION:
				return ALLOCATION_REGION_EDEFAULT == null ? allocationRegion != null : !ALLOCATION_REGION_EDEFAULT.equals(allocationRegion);
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
		result.append(", TypeOfAddress: ");
		result.append(typeOfAddress);
		result.append(", AllocationRegion: ");
		result.append(allocationRegion);
		result.append(')');
		return result.toString();
	}

} //CIM_IPAddressRangeImpl
