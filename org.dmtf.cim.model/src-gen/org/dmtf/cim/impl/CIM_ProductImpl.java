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

import org.dmtf.cim.CIM_Product;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getSKUNumber <em>SKU Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductImpl#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProductImpl extends CIM_ManagedElementImpl implements CIM_Product {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSKUNumber() <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SKU_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKUNumber() <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUNumber()
	 * @generated
	 * @ordered
	 */
	protected String skuNumber = SKU_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String WARRANTY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected String warrantyStartDate = WARRANTY_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Long WARRANTY_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected Long warrantyDuration = WARRANTY_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Product();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__IDENTIFYING_NUMBER, oldIdentifyingNumber, identifyingNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSKUNumber() {
		return skuNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSKUNumber(String newSKUNumber) {
		String oldSKUNumber = skuNumber;
		skuNumber = newSKUNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__SKU_NUMBER, oldSKUNumber, skuNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWarrantyStartDate() {
		return warrantyStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarrantyStartDate(String newWarrantyStartDate) {
		String oldWarrantyStartDate = warrantyStartDate;
		warrantyStartDate = newWarrantyStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__WARRANTY_START_DATE, oldWarrantyStartDate, warrantyStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWarrantyDuration() {
		return warrantyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarrantyDuration(Long newWarrantyDuration) {
		Long oldWarrantyDuration = warrantyDuration;
		warrantyDuration = newWarrantyDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__WARRANTY_DURATION, oldWarrantyDuration, warrantyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRODUCT__NAME:
				return getName();
			case CimPackage.CIM_PRODUCT__IDENTIFYING_NUMBER:
				return getIdentifyingNumber();
			case CimPackage.CIM_PRODUCT__VENDOR:
				return getVendor();
			case CimPackage.CIM_PRODUCT__VERSION:
				return getVersion();
			case CimPackage.CIM_PRODUCT__SKU_NUMBER:
				return getSKUNumber();
			case CimPackage.CIM_PRODUCT__WARRANTY_START_DATE:
				return getWarrantyStartDate();
			case CimPackage.CIM_PRODUCT__WARRANTY_DURATION:
				return getWarrantyDuration();
			case CimPackage.CIM_PRODUCT__FAMILY:
				return getFamily();
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
			case CimPackage.CIM_PRODUCT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__IDENTIFYING_NUMBER:
				setIdentifyingNumber((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__VENDOR:
				setVendor((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__SKU_NUMBER:
				setSKUNumber((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__WARRANTY_START_DATE:
				setWarrantyStartDate((String)newValue);
				return;
			case CimPackage.CIM_PRODUCT__WARRANTY_DURATION:
				setWarrantyDuration((Long)newValue);
				return;
			case CimPackage.CIM_PRODUCT__FAMILY:
				setFamily((String)newValue);
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
			case CimPackage.CIM_PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__IDENTIFYING_NUMBER:
				setIdentifyingNumber(IDENTIFYING_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__SKU_NUMBER:
				setSKUNumber(SKU_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__WARRANTY_START_DATE:
				setWarrantyStartDate(WARRANTY_START_DATE_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__WARRANTY_DURATION:
				setWarrantyDuration(WARRANTY_DURATION_EDEFAULT);
				return;
			case CimPackage.CIM_PRODUCT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
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
			case CimPackage.CIM_PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_PRODUCT__IDENTIFYING_NUMBER:
				return IDENTIFYING_NUMBER_EDEFAULT == null ? identifyingNumber != null : !IDENTIFYING_NUMBER_EDEFAULT.equals(identifyingNumber);
			case CimPackage.CIM_PRODUCT__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CimPackage.CIM_PRODUCT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_PRODUCT__SKU_NUMBER:
				return SKU_NUMBER_EDEFAULT == null ? skuNumber != null : !SKU_NUMBER_EDEFAULT.equals(skuNumber);
			case CimPackage.CIM_PRODUCT__WARRANTY_START_DATE:
				return WARRANTY_START_DATE_EDEFAULT == null ? warrantyStartDate != null : !WARRANTY_START_DATE_EDEFAULT.equals(warrantyStartDate);
			case CimPackage.CIM_PRODUCT__WARRANTY_DURATION:
				return WARRANTY_DURATION_EDEFAULT == null ? warrantyDuration != null : !WARRANTY_DURATION_EDEFAULT.equals(warrantyDuration);
			case CimPackage.CIM_PRODUCT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", IdentifyingNumber: ");
		result.append(identifyingNumber);
		result.append(", Vendor: ");
		result.append(vendor);
		result.append(", Version: ");
		result.append(version);
		result.append(", SKUNumber: ");
		result.append(skuNumber);
		result.append(", WarrantyStartDate: ");
		result.append(warrantyStartDate);
		result.append(", WarrantyDuration: ");
		result.append(warrantyDuration);
		result.append(", Family: ");
		result.append(family);
		result.append(')');
		return result.toString();
	}

} //CIM_ProductImpl
