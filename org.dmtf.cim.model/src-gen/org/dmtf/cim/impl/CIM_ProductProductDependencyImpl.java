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
import org.dmtf.cim.CIM_ProductProductDependency;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Product Product Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductProductDependencyImpl#getRequiredProduct <em>Required Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductProductDependencyImpl#getDependentProduct <em>Dependent Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProductProductDependencyImpl#getTypeOfDependency <em>Type Of Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProductProductDependencyImpl extends MinimalEObjectImpl.Container implements CIM_ProductProductDependency {
	/**
	 * The cached value of the '{@link #getRequiredProduct() <em>Required Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProduct()
	 * @generated
	 * @ordered
	 */
	protected CIM_Product requiredProduct;

	/**
	 * The cached value of the '{@link #getDependentProduct() <em>Dependent Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentProduct()
	 * @generated
	 * @ordered
	 */
	protected CIM_Product dependentProduct;

	/**
	 * The default value of the '{@link #getTypeOfDependency() <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDependency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfDependency() <em>Type Of Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfDependency()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfDependency = TYPE_OF_DEPENDENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProductProductDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProductProductDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Product getRequiredProduct() {
		if (requiredProduct != null && requiredProduct.eIsProxy()) {
			InternalEObject oldRequiredProduct = (InternalEObject)requiredProduct;
			requiredProduct = (CIM_Product)eResolveProxy(oldRequiredProduct);
			if (requiredProduct != oldRequiredProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT, oldRequiredProduct, requiredProduct));
			}
		}
		return requiredProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Product basicGetRequiredProduct() {
		return requiredProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredProduct(CIM_Product newRequiredProduct) {
		CIM_Product oldRequiredProduct = requiredProduct;
		requiredProduct = newRequiredProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT, oldRequiredProduct, requiredProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Product getDependentProduct() {
		if (dependentProduct != null && dependentProduct.eIsProxy()) {
			InternalEObject oldDependentProduct = (InternalEObject)dependentProduct;
			dependentProduct = (CIM_Product)eResolveProxy(oldDependentProduct);
			if (dependentProduct != oldDependentProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT, oldDependentProduct, dependentProduct));
			}
		}
		return dependentProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Product basicGetDependentProduct() {
		return dependentProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependentProduct(CIM_Product newDependentProduct) {
		CIM_Product oldDependentProduct = dependentProduct;
		dependentProduct = newDependentProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT, oldDependentProduct, dependentProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfDependency() {
		return typeOfDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfDependency(Integer newTypeOfDependency) {
		Integer oldTypeOfDependency = typeOfDependency;
		typeOfDependency = newTypeOfDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__TYPE_OF_DEPENDENCY, oldTypeOfDependency, typeOfDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT:
				if (resolve) return getRequiredProduct();
				return basicGetRequiredProduct();
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT:
				if (resolve) return getDependentProduct();
				return basicGetDependentProduct();
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__TYPE_OF_DEPENDENCY:
				return getTypeOfDependency();
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
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT:
				setRequiredProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT:
				setDependentProduct((CIM_Product)newValue);
				return;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__TYPE_OF_DEPENDENCY:
				setTypeOfDependency((Integer)newValue);
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
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT:
				setRequiredProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT:
				setDependentProduct((CIM_Product)null);
				return;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__TYPE_OF_DEPENDENCY:
				setTypeOfDependency(TYPE_OF_DEPENDENCY_EDEFAULT);
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
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__REQUIRED_PRODUCT:
				return requiredProduct != null;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__DEPENDENT_PRODUCT:
				return dependentProduct != null;
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY__TYPE_OF_DEPENDENCY:
				return TYPE_OF_DEPENDENCY_EDEFAULT == null ? typeOfDependency != null : !TYPE_OF_DEPENDENCY_EDEFAULT.equals(typeOfDependency);
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
		result.append(" (TypeOfDependency: ");
		result.append(typeOfDependency);
		result.append(')');
		return result.toString();
	}

} //CIM_ProductProductDependencyImpl
