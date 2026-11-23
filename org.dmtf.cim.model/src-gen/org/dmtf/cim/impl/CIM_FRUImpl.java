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

import org.dmtf.cim.CIM_FRU;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FRU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getFRUNumber <em>FRU Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getRevisionLevel <em>Revision Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUImpl#getCustomerReplaceable <em>Customer Replaceable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FRUImpl extends CIM_ManagedElementImpl implements CIM_FRU {
	/**
	 * The default value of the '{@link #getFRUNumber() <em>FRU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FRU_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFRUNumber() <em>FRU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUNumber()
	 * @generated
	 * @ordered
	 */
	protected String fruNumber = FRU_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFYING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected String identifyingNumber = IDENTIFYING_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionLevel() <em>Revision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionLevel() <em>Revision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionLevel()
	 * @generated
	 * @ordered
	 */
	protected String revisionLevel = REVISION_LEVEL_EDEFAULT;

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
	protected CIM_FRUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FRU();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFRUNumber() {
		return fruNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRUNumber(String newFRUNumber) {
		String oldFRUNumber = fruNumber;
		fruNumber = newFRUNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__FRU_NUMBER, oldFRUNumber, fruNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifyingNumber() {
		return identifyingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifyingNumber(String newIdentifyingNumber) {
		String oldIdentifyingNumber = identifyingNumber;
		identifyingNumber = newIdentifyingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__IDENTIFYING_NUMBER, oldIdentifyingNumber, identifyingNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionLevel() {
		return revisionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionLevel(String newRevisionLevel) {
		String oldRevisionLevel = revisionLevel;
		revisionLevel = newRevisionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__REVISION_LEVEL, oldRevisionLevel, revisionLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU__CUSTOMER_REPLACEABLE, oldCustomerReplaceable, customerReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FRU__FRU_NUMBER:
				return getFRUNumber();
			case CimPackage.CIM_FRU__IDENTIFYING_NUMBER:
				return getIdentifyingNumber();
			case CimPackage.CIM_FRU__VENDOR:
				return getVendor();
			case CimPackage.CIM_FRU__NAME:
				return getName();
			case CimPackage.CIM_FRU__REVISION_LEVEL:
				return getRevisionLevel();
			case CimPackage.CIM_FRU__CUSTOMER_REPLACEABLE:
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
			case CimPackage.CIM_FRU__FRU_NUMBER:
				setFRUNumber((String)newValue);
				return;
			case CimPackage.CIM_FRU__IDENTIFYING_NUMBER:
				setIdentifyingNumber((String)newValue);
				return;
			case CimPackage.CIM_FRU__VENDOR:
				setVendor((String)newValue);
				return;
			case CimPackage.CIM_FRU__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_FRU__REVISION_LEVEL:
				setRevisionLevel((String)newValue);
				return;
			case CimPackage.CIM_FRU__CUSTOMER_REPLACEABLE:
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
			case CimPackage.CIM_FRU__FRU_NUMBER:
				setFRUNumber(FRU_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_FRU__IDENTIFYING_NUMBER:
				setIdentifyingNumber(IDENTIFYING_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_FRU__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CimPackage.CIM_FRU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FRU__REVISION_LEVEL:
				setRevisionLevel(REVISION_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_FRU__CUSTOMER_REPLACEABLE:
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
			case CimPackage.CIM_FRU__FRU_NUMBER:
				return FRU_NUMBER_EDEFAULT == null ? fruNumber != null : !FRU_NUMBER_EDEFAULT.equals(fruNumber);
			case CimPackage.CIM_FRU__IDENTIFYING_NUMBER:
				return IDENTIFYING_NUMBER_EDEFAULT == null ? identifyingNumber != null : !IDENTIFYING_NUMBER_EDEFAULT.equals(identifyingNumber);
			case CimPackage.CIM_FRU__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CimPackage.CIM_FRU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_FRU__REVISION_LEVEL:
				return REVISION_LEVEL_EDEFAULT == null ? revisionLevel != null : !REVISION_LEVEL_EDEFAULT.equals(revisionLevel);
			case CimPackage.CIM_FRU__CUSTOMER_REPLACEABLE:
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
		result.append(" (FRUNumber: ");
		result.append(fruNumber);
		result.append(", IdentifyingNumber: ");
		result.append(identifyingNumber);
		result.append(", Vendor: ");
		result.append(vendor);
		result.append(", Name: ");
		result.append(name);
		result.append(", RevisionLevel: ");
		result.append(revisionLevel);
		result.append(", CustomerReplaceable: ");
		result.append(customerReplaceable);
		result.append(')');
		return result.toString();
	}

} //CIM_FRUImpl
