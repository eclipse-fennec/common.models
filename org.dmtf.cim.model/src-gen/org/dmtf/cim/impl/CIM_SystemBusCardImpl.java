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

import org.dmtf.cim.CIM_SystemBusCard;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System Bus Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemBusCardImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemBusCardImpl#getBusWidth <em>Bus Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SystemBusCardImpl extends CIM_CardImpl implements CIM_SystemBusCard {
	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected Integer busType = BUS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusWidth() <em>Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUS_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusWidth() <em>Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer busWidth = BUS_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemBusCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SystemBusCard();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusType(Integer newBusType) {
		Integer oldBusType = busType;
		busType = newBusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_BUS_CARD__BUS_TYPE, oldBusType, busType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBusWidth() {
		return busWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusWidth(Integer newBusWidth) {
		Integer oldBusWidth = busWidth;
		busWidth = newBusWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM_BUS_CARD__BUS_WIDTH, oldBusWidth, busWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_TYPE:
				return getBusType();
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_WIDTH:
				return getBusWidth();
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
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_TYPE:
				setBusType((Integer)newValue);
				return;
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_WIDTH:
				setBusWidth((Integer)newValue);
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
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_TYPE:
				setBusType(BUS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_WIDTH:
				setBusWidth(BUS_WIDTH_EDEFAULT);
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
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_TYPE:
				return BUS_TYPE_EDEFAULT == null ? busType != null : !BUS_TYPE_EDEFAULT.equals(busType);
			case CimPackage.CIM_SYSTEM_BUS_CARD__BUS_WIDTH:
				return BUS_WIDTH_EDEFAULT == null ? busWidth != null : !BUS_WIDTH_EDEFAULT.equals(busWidth);
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
		result.append(" (BusType: ");
		result.append(busType);
		result.append(", BusWidth: ");
		result.append(busWidth);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemBusCardImpl
