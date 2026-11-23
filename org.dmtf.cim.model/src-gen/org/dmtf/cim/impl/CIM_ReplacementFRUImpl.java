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

import org.dmtf.cim.CIM_ReplacementFRU;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replacement FRU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplacementFRUImpl#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplacementFRUImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplacementFRUImpl#getCustomerReplaceable <em>Customer Replaceable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplacementFRUImpl extends CIM_ManagedElementImpl implements CIM_ReplacementFRU {
	/**
	 * The default value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected String orderNumber = ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerReplaceable() <em>Customer Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerReplaceable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CUSTOMER_REPLACEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerReplaceable() <em>Customer Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerReplaceable()
	 * @generated
	 * @ordered
	 */
	protected Boolean customerReplaceable = CUSTOMER_REPLACEABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplacementFRUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplacementFRU();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumber(String newOrderNumber) {
		String oldOrderNumber = orderNumber;
		orderNumber = newOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLACEMENT_FRU__ORDER_NUMBER, oldOrderNumber, orderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLACEMENT_FRU__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCustomerReplaceable() {
		return customerReplaceable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerReplaceable(Boolean newCustomerReplaceable) {
		Boolean oldCustomerReplaceable = customerReplaceable;
		customerReplaceable = newCustomerReplaceable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLACEMENT_FRU__CUSTOMER_REPLACEABLE, oldCustomerReplaceable, customerReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLACEMENT_FRU__ORDER_NUMBER:
				return getOrderNumber();
			case CimPackage.CIM_REPLACEMENT_FRU__VENDOR:
				return getVendor();
			case CimPackage.CIM_REPLACEMENT_FRU__CUSTOMER_REPLACEABLE:
				return getCustomerReplaceable();
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
			case CimPackage.CIM_REPLACEMENT_FRU__ORDER_NUMBER:
				setOrderNumber((String)newValue);
				return;
			case CimPackage.CIM_REPLACEMENT_FRU__VENDOR:
				setVendor((String)newValue);
				return;
			case CimPackage.CIM_REPLACEMENT_FRU__CUSTOMER_REPLACEABLE:
				setCustomerReplaceable((Boolean)newValue);
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
			case CimPackage.CIM_REPLACEMENT_FRU__ORDER_NUMBER:
				setOrderNumber(ORDER_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_REPLACEMENT_FRU__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CimPackage.CIM_REPLACEMENT_FRU__CUSTOMER_REPLACEABLE:
				setCustomerReplaceable(CUSTOMER_REPLACEABLE_EDEFAULT);
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
			case CimPackage.CIM_REPLACEMENT_FRU__ORDER_NUMBER:
				return ORDER_NUMBER_EDEFAULT == null ? orderNumber != null : !ORDER_NUMBER_EDEFAULT.equals(orderNumber);
			case CimPackage.CIM_REPLACEMENT_FRU__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CimPackage.CIM_REPLACEMENT_FRU__CUSTOMER_REPLACEABLE:
				return CUSTOMER_REPLACEABLE_EDEFAULT == null ? customerReplaceable != null : !CUSTOMER_REPLACEABLE_EDEFAULT.equals(customerReplaceable);
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
		result.append(" (OrderNumber: ");
		result.append(orderNumber);
		result.append(", Vendor: ");
		result.append(vendor);
		result.append(", CustomerReplaceable: ");
		result.append(customerReplaceable);
		result.append(')');
		return result.toString();
	}

} //CIM_ReplacementFRUImpl
