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

import org.dmtf.cim.CIM_AssignedIdentity;
import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Assigned Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssignedIdentityImpl#getIdentityInfo <em>Identity Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssignedIdentityImpl#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssignedIdentityImpl extends MinimalEObjectImpl.Container implements CIM_AssignedIdentity {
	/**
	 * The cached value of the '{@link #getIdentityInfo() <em>Identity Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityInfo()
	 * @generated
	 * @ordered
	 */
	protected CIM_Identity identityInfo;

	/**
	 * The cached value of the '{@link #getManagedElement() <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement managedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssignedIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssignedIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Identity getIdentityInfo() {
		if (identityInfo != null && identityInfo.eIsProxy()) {
			InternalEObject oldIdentityInfo = (InternalEObject)identityInfo;
			identityInfo = (CIM_Identity)eResolveProxy(oldIdentityInfo);
			if (identityInfo != oldIdentityInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO, oldIdentityInfo, identityInfo));
			}
		}
		return identityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Identity basicGetIdentityInfo() {
		return identityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentityInfo(CIM_Identity newIdentityInfo) {
		CIM_Identity oldIdentityInfo = identityInfo;
		identityInfo = newIdentityInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO, oldIdentityInfo, identityInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getManagedElement() {
		if (managedElement != null && managedElement.eIsProxy()) {
			InternalEObject oldManagedElement = (InternalEObject)managedElement;
			managedElement = (CIM_ManagedElement)eResolveProxy(oldManagedElement);
			if (managedElement != oldManagedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
			}
		}
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetManagedElement() {
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedElement(CIM_ManagedElement newManagedElement) {
		CIM_ManagedElement oldManagedElement = managedElement;
		managedElement = newManagedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO:
				if (resolve) return getIdentityInfo();
				return basicGetIdentityInfo();
			case CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT:
				if (resolve) return getManagedElement();
				return basicGetManagedElement();
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
			case CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO:
				setIdentityInfo((CIM_Identity)newValue);
				return;
			case CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO:
				setIdentityInfo((CIM_Identity)null);
				return;
			case CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)null);
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
			case CimPackage.CIM_ASSIGNED_IDENTITY__IDENTITY_INFO:
				return identityInfo != null;
			case CimPackage.CIM_ASSIGNED_IDENTITY__MANAGED_ELEMENT:
				return managedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AssignedIdentityImpl
