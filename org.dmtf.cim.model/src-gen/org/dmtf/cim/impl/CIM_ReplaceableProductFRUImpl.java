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
import org.dmtf.cim.CIM_Product;
import org.dmtf.cim.CIM_ReplaceableProductFRU;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replaceable Product FRU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplaceableProductFRUImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplaceableProductFRUImpl#getFRU <em>FRU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplaceableProductFRUImpl extends MinimalEObjectImpl.Container implements CIM_ReplaceableProductFRU {
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
	 * The cached value of the '{@link #getFRU() <em>FRU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRU()
	 * @generated
	 * @ordered
	 */
	protected CIM_FRU fru;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplaceableProductFRUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplaceableProductFRU();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FRU getFRU() {
		if (fru != null && fru.eIsProxy()) {
			InternalEObject oldFRU = (InternalEObject)fru;
			fru = (CIM_FRU)eResolveProxy(oldFRU);
			if (fru != oldFRU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU, oldFRU, fru));
			}
		}
		return fru;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FRU basicGetFRU() {
		return fru;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRU(CIM_FRU newFRU) {
		CIM_FRU oldFRU = fru;
		fru = newFRU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU, oldFRU, fru));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU:
				if (resolve) return getFRU();
				return basicGetFRU();
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
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT:
				setProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU:
				setFRU((CIM_FRU)newValue);
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
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT:
				setProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU:
				setFRU((CIM_FRU)null);
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
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__PRODUCT:
				return product != null;
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU__FRU:
				return fru != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ReplaceableProductFRUImpl
