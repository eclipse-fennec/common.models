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

import org.dmtf.cim.CIM_InstalledProduct;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Installed Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getProductIdentifyingNumber <em>Product Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getProductVendor <em>Product Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getSystemID <em>System ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getCollectionID <em>Collection ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InstalledProductImpl extends CIM_CollectionImpl implements CIM_InstalledProduct {
	/**
	 * The default value of the '{@link #getProductIdentifyingNumber() <em>Product Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_IDENTIFYING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdentifyingNumber() <em>Product Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected String productIdentifyingNumber = PRODUCT_IDENTIFYING_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getProductVendor() <em>Product Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVendor() <em>Product Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVendor()
	 * @generated
	 * @ordered
	 */
	protected String productVendor = PRODUCT_VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected String systemID = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionID() <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionID()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionID() <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionID()
	 * @generated
	 * @ordered
	 */
	protected String collectionID = COLLECTION_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstalledProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstalledProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductIdentifyingNumber() {
		return productIdentifyingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdentifyingNumber(String newProductIdentifyingNumber) {
		String oldProductIdentifyingNumber = productIdentifyingNumber;
		productIdentifyingNumber = newProductIdentifyingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_IDENTIFYING_NUMBER, oldProductIdentifyingNumber, productIdentifyingNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductVendor() {
		return productVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductVendor(String newProductVendor) {
		String oldProductVendor = productVendor;
		productVendor = newProductVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VENDOR, oldProductVendor, productVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemID() {
		return systemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemID(String newSystemID) {
		String oldSystemID = systemID;
		systemID = newSystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__SYSTEM_ID, oldSystemID, systemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollectionID() {
		return collectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionID(String newCollectionID) {
		String oldCollectionID = collectionID;
		collectionID = newCollectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__COLLECTION_ID, oldCollectionID, collectionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_IDENTIFYING_NUMBER:
				return getProductIdentifyingNumber();
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_NAME:
				return getProductName();
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VENDOR:
				return getProductVendor();
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VERSION:
				return getProductVersion();
			case CimPackage.CIM_INSTALLED_PRODUCT__SYSTEM_ID:
				return getSystemID();
			case CimPackage.CIM_INSTALLED_PRODUCT__COLLECTION_ID:
				return getCollectionID();
			case CimPackage.CIM_INSTALLED_PRODUCT__NAME:
				return getName();
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
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_IDENTIFYING_NUMBER:
				setProductIdentifyingNumber((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VENDOR:
				setProductVendor((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__SYSTEM_ID:
				setSystemID((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__COLLECTION_ID:
				setCollectionID((String)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__NAME:
				setName((String)newValue);
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
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_IDENTIFYING_NUMBER:
				setProductIdentifyingNumber(PRODUCT_IDENTIFYING_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VENDOR:
				setProductVendor(PRODUCT_VENDOR_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__SYSTEM_ID:
				setSystemID(SYSTEM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__COLLECTION_ID:
				setCollectionID(COLLECTION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT__NAME:
				setName(NAME_EDEFAULT);
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
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_IDENTIFYING_NUMBER:
				return PRODUCT_IDENTIFYING_NUMBER_EDEFAULT == null ? productIdentifyingNumber != null : !PRODUCT_IDENTIFYING_NUMBER_EDEFAULT.equals(productIdentifyingNumber);
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VENDOR:
				return PRODUCT_VENDOR_EDEFAULT == null ? productVendor != null : !PRODUCT_VENDOR_EDEFAULT.equals(productVendor);
			case CimPackage.CIM_INSTALLED_PRODUCT__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null : !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
			case CimPackage.CIM_INSTALLED_PRODUCT__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemID != null : !SYSTEM_ID_EDEFAULT.equals(systemID);
			case CimPackage.CIM_INSTALLED_PRODUCT__COLLECTION_ID:
				return COLLECTION_ID_EDEFAULT == null ? collectionID != null : !COLLECTION_ID_EDEFAULT.equals(collectionID);
			case CimPackage.CIM_INSTALLED_PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (ProductIdentifyingNumber: ");
		result.append(productIdentifyingNumber);
		result.append(", ProductName: ");
		result.append(productName);
		result.append(", ProductVendor: ");
		result.append(productVendor);
		result.append(", ProductVersion: ");
		result.append(productVersion);
		result.append(", SystemID: ");
		result.append(systemID);
		result.append(", CollectionID: ");
		result.append(collectionID);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CIM_InstalledProductImpl
