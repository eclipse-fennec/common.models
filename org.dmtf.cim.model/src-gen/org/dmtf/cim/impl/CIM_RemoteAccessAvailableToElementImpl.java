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

import org.dmtf.cim.CIM_RemoteAccessAvailableToElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Remote Access Available To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteAccessAvailableToElementImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteAccessAvailableToElementImpl#getOrderOfAccess <em>Order Of Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RemoteAccessAvailableToElementImpl extends CIM_DependencyImpl implements CIM_RemoteAccessAvailableToElement {
	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderOfAccess() <em>Order Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderOfAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_OF_ACCESS_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getOrderOfAccess() <em>Order Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderOfAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer orderOfAccess = ORDER_OF_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RemoteAccessAvailableToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RemoteAccessAvailableToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrderOfAccess() {
		return orderOfAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderOfAccess(Integer newOrderOfAccess) {
		Integer oldOrderOfAccess = orderOfAccess;
		orderOfAccess = newOrderOfAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__ORDER_OF_ACCESS, oldOrderOfAccess, orderOfAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__IS_DEFAULT:
				return getIsDefault();
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__ORDER_OF_ACCESS:
				return getOrderOfAccess();
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
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__ORDER_OF_ACCESS:
				setOrderOfAccess((Integer)newValue);
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
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__ORDER_OF_ACCESS:
				setOrderOfAccess(ORDER_OF_ACCESS_EDEFAULT);
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
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT__ORDER_OF_ACCESS:
				return ORDER_OF_ACCESS_EDEFAULT == null ? orderOfAccess != null : !ORDER_OF_ACCESS_EDEFAULT.equals(orderOfAccess);
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
		result.append(" (IsDefault: ");
		result.append(isDefault);
		result.append(", OrderOfAccess: ");
		result.append(orderOfAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_RemoteAccessAvailableToElementImpl
