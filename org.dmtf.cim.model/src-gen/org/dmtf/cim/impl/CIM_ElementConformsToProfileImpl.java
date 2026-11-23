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

import org.dmtf.cim.CIM_ElementConformsToProfile;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_RegisteredProfile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Conforms To Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementConformsToProfileImpl#getConformantStandard <em>Conformant Standard</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementConformsToProfileImpl#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementConformsToProfileImpl extends MinimalEObjectImpl.Container implements CIM_ElementConformsToProfile {
	/**
	 * The cached value of the '{@link #getConformantStandard() <em>Conformant Standard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformantStandard()
	 * @generated
	 * @ordered
	 */
	protected CIM_RegisteredProfile conformantStandard;

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
	protected CIM_ElementConformsToProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementConformsToProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RegisteredProfile getConformantStandard() {
		if (conformantStandard != null && conformantStandard.eIsProxy()) {
			InternalEObject oldConformantStandard = (InternalEObject)conformantStandard;
			conformantStandard = (CIM_RegisteredProfile)eResolveProxy(oldConformantStandard);
			if (conformantStandard != oldConformantStandard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD, oldConformantStandard, conformantStandard));
			}
		}
		return conformantStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_RegisteredProfile basicGetConformantStandard() {
		return conformantStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformantStandard(CIM_RegisteredProfile newConformantStandard) {
		CIM_RegisteredProfile oldConformantStandard = conformantStandard;
		conformantStandard = newConformantStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD, oldConformantStandard, conformantStandard));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT, oldManagedElement, managedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD:
				if (resolve) return getConformantStandard();
				return basicGetConformantStandard();
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD:
				setConformantStandard((CIM_RegisteredProfile)newValue);
				return;
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD:
				setConformantStandard((CIM_RegisteredProfile)null);
				return;
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT:
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
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__CONFORMANT_STANDARD:
				return conformantStandard != null;
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE__MANAGED_ELEMENT:
				return managedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ElementConformsToProfileImpl
