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

import org.dmtf.cim.CIM_SoftwareFeature;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareFeatureImpl#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareFeatureImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareFeatureImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareFeatureImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareFeatureImpl extends CIM_LogicalElementImpl implements CIM_SoftwareFeature {
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
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareFeature();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_FEATURE__IDENTIFYING_NUMBER, oldIdentifyingNumber, identifyingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_FEATURE__PRODUCT_NAME, oldProductName, productName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_FEATURE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_FEATURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_FEATURE__IDENTIFYING_NUMBER:
				return getIdentifyingNumber();
			case CimPackage.CIM_SOFTWARE_FEATURE__PRODUCT_NAME:
				return getProductName();
			case CimPackage.CIM_SOFTWARE_FEATURE__VENDOR:
				return getVendor();
			case CimPackage.CIM_SOFTWARE_FEATURE__VERSION:
				return getVersion();
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
			case CimPackage.CIM_SOFTWARE_FEATURE__IDENTIFYING_NUMBER:
				setIdentifyingNumber((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__VENDOR:
				setVendor((String)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__VERSION:
				setVersion((String)newValue);
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
			case CimPackage.CIM_SOFTWARE_FEATURE__IDENTIFYING_NUMBER:
				setIdentifyingNumber(IDENTIFYING_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_FEATURE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CimPackage.CIM_SOFTWARE_FEATURE__IDENTIFYING_NUMBER:
				return IDENTIFYING_NUMBER_EDEFAULT == null ? identifyingNumber != null : !IDENTIFYING_NUMBER_EDEFAULT.equals(identifyingNumber);
			case CimPackage.CIM_SOFTWARE_FEATURE__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case CimPackage.CIM_SOFTWARE_FEATURE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CimPackage.CIM_SOFTWARE_FEATURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (IdentifyingNumber: ");
		result.append(identifyingNumber);
		result.append(", ProductName: ");
		result.append(productName);
		result.append(", Vendor: ");
		result.append(vendor);
		result.append(", Version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareFeatureImpl
