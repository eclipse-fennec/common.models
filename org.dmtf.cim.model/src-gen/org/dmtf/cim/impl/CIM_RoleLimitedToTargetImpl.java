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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Role;
import org.dmtf.cim.CIM_RoleLimitedToTarget;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Role Limited To Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoleLimitedToTargetImpl#getDefiningRole <em>Defining Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RoleLimitedToTargetImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RoleLimitedToTargetImpl extends MinimalEObjectImpl.Container implements CIM_RoleLimitedToTarget {
	/**
	 * The cached value of the '{@link #getDefiningRole() <em>Defining Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningRole()
	 * @generated
	 * @ordered
	 */
	protected CIM_Role definingRole;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement targetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RoleLimitedToTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RoleLimitedToTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Role getDefiningRole() {
		if (definingRole != null && definingRole.eIsProxy()) {
			InternalEObject oldDefiningRole = (InternalEObject)definingRole;
			definingRole = (CIM_Role)eResolveProxy(oldDefiningRole);
			if (definingRole != oldDefiningRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE, oldDefiningRole, definingRole));
			}
		}
		return definingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Role basicGetDefiningRole() {
		return definingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefiningRole(CIM_Role newDefiningRole) {
		CIM_Role oldDefiningRole = definingRole;
		definingRole = newDefiningRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE, oldDefiningRole, definingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getTargetElement() {
		if (targetElement != null && targetElement.eIsProxy()) {
			InternalEObject oldTargetElement = (InternalEObject)targetElement;
			targetElement = (CIM_ManagedElement)eResolveProxy(oldTargetElement);
			if (targetElement != oldTargetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT, oldTargetElement, targetElement));
			}
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElement(CIM_ManagedElement newTargetElement) {
		CIM_ManagedElement oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE:
				if (resolve) return getDefiningRole();
				return basicGetDefiningRole();
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT:
				if (resolve) return getTargetElement();
				return basicGetTargetElement();
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
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE:
				setDefiningRole((CIM_Role)newValue);
				return;
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT:
				setTargetElement((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE:
				setDefiningRole((CIM_Role)null);
				return;
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT:
				setTargetElement((CIM_ManagedElement)null);
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
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__DEFINING_ROLE:
				return definingRole != null;
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET__TARGET_ELEMENT:
				return targetElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_RoleLimitedToTargetImpl
