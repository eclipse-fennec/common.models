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

import org.dmtf.cim.CIM_Credential;
import org.dmtf.cim.CIM_CredentialContext;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Credential Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CredentialContextImpl#getElementInContext <em>Element In Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CredentialContextImpl#getElementProvidingContext <em>Element Providing Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CredentialContextImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CredentialContextImpl extends MinimalEObjectImpl.Container implements CIM_CredentialContext {
	/**
	 * The cached value of the '{@link #getElementInContext() <em>Element In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementInContext()
	 * @generated
	 * @ordered
	 */
	protected CIM_Credential elementInContext;

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
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CredentialContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CredentialContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Credential getElementInContext() {
		if (elementInContext != null && elementInContext.eIsProxy()) {
			InternalEObject oldElementInContext = (InternalEObject)elementInContext;
			elementInContext = (CIM_Credential)eResolveProxy(oldElementInContext);
			if (elementInContext != oldElementInContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT, oldElementInContext, elementInContext));
			}
		}
		return elementInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Credential basicGetElementInContext() {
		return elementInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementInContext(CIM_Credential newElementInContext) {
		CIM_Credential oldElementInContext = elementInContext;
		elementInContext = newElementInContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT, oldElementInContext, elementInContext));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT, oldElementProvidingContext, elementProvidingContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT, oldElementProvidingContext, elementProvidingContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(Integer newUsage) {
		Integer oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CREDENTIAL_CONTEXT__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT:
				if (resolve) return getElementInContext();
				return basicGetElementInContext();
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				if (resolve) return getElementProvidingContext();
				return basicGetElementProvidingContext();
			case CimPackage.CIM_CREDENTIAL_CONTEXT__USAGE:
				return getUsage();
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
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT:
				setElementInContext((CIM_Credential)newValue);
				return;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				setElementProvidingContext((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__USAGE:
				setUsage((Integer)newValue);
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
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT:
				setElementInContext((CIM_Credential)null);
				return;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				setElementProvidingContext((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_IN_CONTEXT:
				return elementInContext != null;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__ELEMENT_PROVIDING_CONTEXT:
				return elementProvidingContext != null;
			case CimPackage.CIM_CREDENTIAL_CONTEXT__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (Usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //CIM_CredentialContextImpl
