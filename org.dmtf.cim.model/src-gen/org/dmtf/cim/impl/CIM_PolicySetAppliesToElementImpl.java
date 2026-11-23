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
import org.dmtf.cim.CIM_PolicySet;
import org.dmtf.cim.CIM_PolicySetAppliesToElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Set Applies To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicySetAppliesToElementImpl#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicySetAppliesToElementImpl#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PolicySetAppliesToElementImpl extends MinimalEObjectImpl.Container implements CIM_PolicySetAppliesToElement {
	/**
	 * The cached value of the '{@link #getPolicySet() <em>Policy Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicySet()
	 * @generated
	 * @ordered
	 */
	protected CIM_PolicySet policySet;

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
	protected CIM_PolicySetAppliesToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicySetAppliesToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicySet getPolicySet() {
		if (policySet != null && policySet.eIsProxy()) {
			InternalEObject oldPolicySet = (InternalEObject)policySet;
			policySet = (CIM_PolicySet)eResolveProxy(oldPolicySet);
			if (policySet != oldPolicySet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET, oldPolicySet, policySet));
			}
		}
		return policySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_PolicySet basicGetPolicySet() {
		return policySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicySet(CIM_PolicySet newPolicySet) {
		CIM_PolicySet oldPolicySet = policySet;
		policySet = newPolicySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET, oldPolicySet, policySet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT, oldManagedElement, managedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET:
				if (resolve) return getPolicySet();
				return basicGetPolicySet();
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET:
				setPolicySet((CIM_PolicySet)newValue);
				return;
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET:
				setPolicySet((CIM_PolicySet)null);
				return;
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__POLICY_SET:
				return policySet != null;
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT__MANAGED_ELEMENT:
				return managedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_PolicySetAppliesToElementImpl
