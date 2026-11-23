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

import org.dmtf.cim.CIM_CompatibleProduct;
import org.dmtf.cim.CIM_Product;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Compatible Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompatibleProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompatibleProductImpl#getCompatibleProduct <em>Compatible Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompatibleProductImpl#getCompatibilityDescription <em>Compatibility Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CompatibleProductImpl extends MinimalEObjectImpl.Container implements CIM_CompatibleProduct {
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
	 * The cached value of the '{@link #getCompatibleProduct() <em>Compatible Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleProduct()
	 * @generated
	 * @ordered
	 */
	protected CIM_Product compatibleProduct;

	/**
	 * The default value of the '{@link #getCompatibilityDescription() <em>Compatibility Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPATIBILITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompatibilityDescription() <em>Compatibility Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityDescription()
	 * @generated
	 * @ordered
	 */
	protected String compatibilityDescription = COMPATIBILITY_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CompatibleProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CompatibleProduct();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Product getCompatibleProduct() {
		if (compatibleProduct != null && compatibleProduct.eIsProxy()) {
			InternalEObject oldCompatibleProduct = (InternalEObject)compatibleProduct;
			compatibleProduct = (CIM_Product)eResolveProxy(oldCompatibleProduct);
			if (compatibleProduct != oldCompatibleProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT, oldCompatibleProduct, compatibleProduct));
			}
		}
		return compatibleProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Product basicGetCompatibleProduct() {
		return compatibleProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompatibleProduct(CIM_Product newCompatibleProduct) {
		CIM_Product oldCompatibleProduct = compatibleProduct;
		compatibleProduct = newCompatibleProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT, oldCompatibleProduct, compatibleProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompatibilityDescription() {
		return compatibilityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompatibilityDescription(String newCompatibilityDescription) {
		String oldCompatibilityDescription = compatibilityDescription;
		compatibilityDescription = newCompatibilityDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBILITY_DESCRIPTION, oldCompatibilityDescription, compatibilityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT:
				if (resolve) return getCompatibleProduct();
				return basicGetCompatibleProduct();
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBILITY_DESCRIPTION:
				return getCompatibilityDescription();
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
			case CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT:
				setProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT:
				setCompatibleProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBILITY_DESCRIPTION:
				setCompatibilityDescription((String)newValue);
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
			case CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT:
				setProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT:
				setCompatibleProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBILITY_DESCRIPTION:
				setCompatibilityDescription(COMPATIBILITY_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_COMPATIBLE_PRODUCT__PRODUCT:
				return product != null;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBLE_PRODUCT:
				return compatibleProduct != null;
			case CimPackage.CIM_COMPATIBLE_PRODUCT__COMPATIBILITY_DESCRIPTION:
				return COMPATIBILITY_DESCRIPTION_EDEFAULT == null ? compatibilityDescription != null : !COMPATIBILITY_DESCRIPTION_EDEFAULT.equals(compatibilityDescription);
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
		result.append(" (CompatibilityDescription: ");
		result.append(compatibilityDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_CompatibleProductImpl
