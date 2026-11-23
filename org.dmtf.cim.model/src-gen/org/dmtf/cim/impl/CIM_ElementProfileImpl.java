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

import org.dmtf.cim.CIM_ElementProfile;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Profile;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementProfileImpl#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementProfileImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementProfileImpl extends MinimalEObjectImpl.Container implements CIM_ElementProfile {
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
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected CIM_Profile profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ElementProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementProfile();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT, oldManagedElement, managedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Profile getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (CIM_Profile)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_PROFILE__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Profile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfile(CIM_Profile newProfile) {
		CIM_Profile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_PROFILE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT:
				if (resolve) return getManagedElement();
				return basicGetManagedElement();
			case CimPackage.CIM_ELEMENT_PROFILE__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
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
			case CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ELEMENT_PROFILE__PROFILE:
				setProfile((CIM_Profile)newValue);
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
			case CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ELEMENT_PROFILE__PROFILE:
				setProfile((CIM_Profile)null);
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
			case CimPackage.CIM_ELEMENT_PROFILE__MANAGED_ELEMENT:
				return managedElement != null;
			case CimPackage.CIM_ELEMENT_PROFILE__PROFILE:
				return profile != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ElementProfileImpl
