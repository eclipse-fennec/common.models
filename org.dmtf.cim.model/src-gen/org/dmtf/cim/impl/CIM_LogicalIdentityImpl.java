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

import org.dmtf.cim.CIM_LogicalIdentity;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalIdentityImpl#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalIdentityImpl#getSameElement <em>Same Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_LogicalIdentityImpl extends MinimalEObjectImpl.Container implements CIM_LogicalIdentity {
	/**
	 * The cached value of the '{@link #getSystemElement() <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement systemElement;

	/**
	 * The cached value of the '{@link #getSameElement() <em>Same Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement sameElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getSystemElement() {
		if (systemElement != null && systemElement.eIsProxy()) {
			InternalEObject oldSystemElement = (InternalEObject)systemElement;
			systemElement = (CIM_ManagedElement)eResolveProxy(oldSystemElement);
			if (systemElement != oldSystemElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT, oldSystemElement, systemElement));
			}
		}
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetSystemElement() {
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemElement(CIM_ManagedElement newSystemElement) {
		CIM_ManagedElement oldSystemElement = systemElement;
		systemElement = newSystemElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT, oldSystemElement, systemElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getSameElement() {
		if (sameElement != null && sameElement.eIsProxy()) {
			InternalEObject oldSameElement = (InternalEObject)sameElement;
			sameElement = (CIM_ManagedElement)eResolveProxy(oldSameElement);
			if (sameElement != oldSameElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT, oldSameElement, sameElement));
			}
		}
		return sameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetSameElement() {
		return sameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSameElement(CIM_ManagedElement newSameElement) {
		CIM_ManagedElement oldSameElement = sameElement;
		sameElement = newSameElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT, oldSameElement, sameElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT:
				if (resolve) return getSystemElement();
				return basicGetSystemElement();
			case CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT:
				if (resolve) return getSameElement();
				return basicGetSameElement();
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
			case CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT:
				setSystemElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT:
				setSameElement((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT:
				setSystemElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT:
				setSameElement((CIM_ManagedElement)null);
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
			case CimPackage.CIM_LOGICAL_IDENTITY__SYSTEM_ELEMENT:
				return systemElement != null;
			case CimPackage.CIM_LOGICAL_IDENTITY__SAME_ELEMENT:
				return sameElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_LogicalIdentityImpl
