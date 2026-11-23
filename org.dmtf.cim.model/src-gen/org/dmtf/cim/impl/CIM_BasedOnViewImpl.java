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

import org.dmtf.cim.CIM_BasedOnView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Based On View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BasedOnViewImpl#getBOEndingAddress <em>BO Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BasedOnViewImpl#getBOOrderIndex <em>BO Order Index</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BasedOnViewImpl#getBOStartingAddress <em>BO Starting Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BasedOnViewImpl extends CIM_AbstractBasedOnImpl implements CIM_BasedOnView {
	/**
	 * The default value of the '{@link #getBOEndingAddress() <em>BO Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long BO_ENDING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBOEndingAddress() <em>BO Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOEndingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long boEndingAddress = BO_ENDING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBOOrderIndex() <em>BO Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOOrderIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BO_ORDER_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBOOrderIndex() <em>BO Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOOrderIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer boOrderIndex = BO_ORDER_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBOStartingAddress() <em>BO Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long BO_STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBOStartingAddress() <em>BO Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long boStartingAddress = BO_STARTING_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BasedOnViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BasedOnView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBOEndingAddress() {
		return boEndingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBOEndingAddress(Long newBOEndingAddress) {
		Long oldBOEndingAddress = boEndingAddress;
		boEndingAddress = newBOEndingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASED_ON_VIEW__BO_ENDING_ADDRESS, oldBOEndingAddress, boEndingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBOOrderIndex() {
		return boOrderIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBOOrderIndex(Integer newBOOrderIndex) {
		Integer oldBOOrderIndex = boOrderIndex;
		boOrderIndex = newBOOrderIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASED_ON_VIEW__BO_ORDER_INDEX, oldBOOrderIndex, boOrderIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBOStartingAddress() {
		return boStartingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBOStartingAddress(Long newBOStartingAddress) {
		Long oldBOStartingAddress = boStartingAddress;
		boStartingAddress = newBOStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASED_ON_VIEW__BO_STARTING_ADDRESS, oldBOStartingAddress, boStartingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BASED_ON_VIEW__BO_ENDING_ADDRESS:
				return getBOEndingAddress();
			case CimPackage.CIM_BASED_ON_VIEW__BO_ORDER_INDEX:
				return getBOOrderIndex();
			case CimPackage.CIM_BASED_ON_VIEW__BO_STARTING_ADDRESS:
				return getBOStartingAddress();
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
			case CimPackage.CIM_BASED_ON_VIEW__BO_ENDING_ADDRESS:
				setBOEndingAddress((Long)newValue);
				return;
			case CimPackage.CIM_BASED_ON_VIEW__BO_ORDER_INDEX:
				setBOOrderIndex((Integer)newValue);
				return;
			case CimPackage.CIM_BASED_ON_VIEW__BO_STARTING_ADDRESS:
				setBOStartingAddress((Long)newValue);
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
			case CimPackage.CIM_BASED_ON_VIEW__BO_ENDING_ADDRESS:
				setBOEndingAddress(BO_ENDING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BASED_ON_VIEW__BO_ORDER_INDEX:
				setBOOrderIndex(BO_ORDER_INDEX_EDEFAULT);
				return;
			case CimPackage.CIM_BASED_ON_VIEW__BO_STARTING_ADDRESS:
				setBOStartingAddress(BO_STARTING_ADDRESS_EDEFAULT);
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
			case CimPackage.CIM_BASED_ON_VIEW__BO_ENDING_ADDRESS:
				return BO_ENDING_ADDRESS_EDEFAULT == null ? boEndingAddress != null : !BO_ENDING_ADDRESS_EDEFAULT.equals(boEndingAddress);
			case CimPackage.CIM_BASED_ON_VIEW__BO_ORDER_INDEX:
				return BO_ORDER_INDEX_EDEFAULT == null ? boOrderIndex != null : !BO_ORDER_INDEX_EDEFAULT.equals(boOrderIndex);
			case CimPackage.CIM_BASED_ON_VIEW__BO_STARTING_ADDRESS:
				return BO_STARTING_ADDRESS_EDEFAULT == null ? boStartingAddress != null : !BO_STARTING_ADDRESS_EDEFAULT.equals(boStartingAddress);
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
		result.append(" (BOEndingAddress: ");
		result.append(boEndingAddress);
		result.append(", BOOrderIndex: ");
		result.append(boOrderIndex);
		result.append(", BOStartingAddress: ");
		result.append(boStartingAddress);
		result.append(')');
		return result.toString();
	}

} //CIM_BasedOnViewImpl
