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
import org.dmtf.cim.CIM_FRUIncludesSoftwareFeature;
import org.dmtf.cim.CIM_SoftwareFeature;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FRU Includes Software Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUIncludesSoftwareFeatureImpl#getFRU <em>FRU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FRUIncludesSoftwareFeatureImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FRUIncludesSoftwareFeatureImpl extends MinimalEObjectImpl.Container implements CIM_FRUIncludesSoftwareFeature {
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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected CIM_SoftwareFeature component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FRUIncludesSoftwareFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FRUIncludesSoftwareFeature();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU, oldFRU, fru));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU, oldFRU, fru));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeature getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (CIM_SoftwareFeature)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SoftwareFeature basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(CIM_SoftwareFeature newComponent) {
		CIM_SoftwareFeature oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU:
				if (resolve) return getFRU();
				return basicGetFRU();
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU:
				setFRU((CIM_FRU)newValue);
				return;
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT:
				setComponent((CIM_SoftwareFeature)newValue);
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
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU:
				setFRU((CIM_FRU)null);
				return;
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT:
				setComponent((CIM_SoftwareFeature)null);
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
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__FRU:
				return fru != null;
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_FRUIncludesSoftwareFeatureImpl
