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

import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_IdentityContext;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Identity Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IdentityContextImpl#getElementInContext <em>Element In Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IdentityContextImpl#getElementProvidingContext <em>Element Providing Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IdentityContextImpl extends MinimalEObjectImpl.Container implements CIM_IdentityContext {
	/**
	 * The cached value of the '{@link #getElementInContext() <em>Element In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementInContext()
	 * @generated
	 * @ordered
	 */
	protected CIM_Identity elementInContext;

	/**
	 * The cached value of the '{@link #getElementProvidingContext() <em>Element Providing Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementProvidingContext()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement elementProvidingContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IdentityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IdentityContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Identity getElementInContext() {
		if (elementInContext != null && elementInContext.eIsProxy()) {
			InternalEObject oldElementInContext = (InternalEObject)elementInContext;
			elementInContext = (CIM_Identity)eResolveProxy(oldElementInContext);
			if (elementInContext != oldElementInContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT, oldElementInContext, elementInContext));
			}
		}
		return elementInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Identity basicGetElementInContext() {
		return elementInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementInContext(CIM_Identity newElementInContext) {
		CIM_Identity oldElementInContext = elementInContext;
		elementInContext = newElementInContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT, oldElementInContext, elementInContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getElementProvidingContext() {
		if (elementProvidingContext != null && elementProvidingContext.eIsProxy()) {
			InternalEObject oldElementProvidingContext = (InternalEObject)elementProvidingContext;
			elementProvidingContext = (CIM_ManagedElement)eResolveProxy(oldElementProvidingContext);
			if (elementProvidingContext != oldElementProvidingContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT, oldElementProvidingContext, elementProvidingContext));
			}
		}
		return elementProvidingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetElementProvidingContext() {
		return elementProvidingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementProvidingContext(CIM_ManagedElement newElementProvidingContext) {
		CIM_ManagedElement oldElementProvidingContext = elementProvidingContext;
		elementProvidingContext = newElementProvidingContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT, oldElementProvidingContext, elementProvidingContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT:
				if (resolve) return getElementInContext();
				return basicGetElementInContext();
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				if (resolve) return getElementProvidingContext();
				return basicGetElementProvidingContext();
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
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT:
				setElementInContext((CIM_Identity)newValue);
				return;
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				setElementProvidingContext((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT:
				setElementInContext((CIM_Identity)null);
				return;
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				setElementProvidingContext((CIM_ManagedElement)null);
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
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_IN_CONTEXT:
				return elementInContext != null;
			case CimPackage.CIM_IDENTITY_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				return elementProvidingContext != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_IdentityContextImpl
