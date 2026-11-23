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

import org.dmtf.cim.CIM_ElementSecuritySensitivity;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_SecuritySensitivity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Security Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSecuritySensitivityImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementSecuritySensitivityImpl#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementSecuritySensitivityImpl extends MinimalEObjectImpl.Container implements CIM_ElementSecuritySensitivity {
	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected CIM_SecuritySensitivity securityLevel;

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
	protected CIM_ElementSecuritySensitivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementSecuritySensitivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SecuritySensitivity getSecurityLevel() {
		if (securityLevel != null && securityLevel.eIsProxy()) {
			InternalEObject oldSecurityLevel = (InternalEObject)securityLevel;
			securityLevel = (CIM_SecuritySensitivity)eResolveProxy(oldSecurityLevel);
			if (securityLevel != oldSecurityLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
			}
		}
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SecuritySensitivity basicGetSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityLevel(CIM_SecuritySensitivity newSecurityLevel) {
		CIM_SecuritySensitivity oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL:
				if (resolve) return getSecurityLevel();
				return basicGetSecurityLevel();
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL:
				setSecurityLevel((CIM_SecuritySensitivity)newValue);
				return;
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL:
				setSecurityLevel((CIM_SecuritySensitivity)null);
				return;
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__SECURITY_LEVEL:
				return securityLevel != null;
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY__MANAGED_ELEMENT:
				return managedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ElementSecuritySensitivityImpl
