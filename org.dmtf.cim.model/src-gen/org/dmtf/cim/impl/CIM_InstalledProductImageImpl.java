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
import org.dmtf.cim.CIM_InstalledProductImage;
import org.dmtf.cim.CIM_Product;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Installed Product Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImageImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstalledProductImageImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InstalledProductImageImpl extends MinimalEObjectImpl.Container implements CIM_InstalledProductImage {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected CIM_Product product;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected CIM_InstalledProduct collection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstalledProductImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstalledProductImage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (CIM_Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(CIM_Product newProduct) {
		CIM_Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledProduct getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (CIM_InstalledProduct)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_InstalledProduct basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(CIM_InstalledProduct newCollection) {
		CIM_InstalledProduct oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
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
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT:
				setProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION:
				setCollection((CIM_InstalledProduct)newValue);
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
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT:
				setProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION:
				setCollection((CIM_InstalledProduct)null);
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
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__PRODUCT:
				return product != null;
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE__COLLECTION:
				return collection != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_InstalledProductImageImpl
