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

import org.dmtf.cim.CIM_Collection;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_OwningCollectionElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Owning Collection Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OwningCollectionElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OwningCollectionElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OwningCollectionElementImpl extends MinimalEObjectImpl.Container implements CIM_OwningCollectionElement {
	/**
	 * The cached value of the '{@link #getOwningElement() <em>Owning Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement owningElement;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_Collection ownedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OwningCollectionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OwningCollectionElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getOwningElement() {
		if (owningElement != null && owningElement.eIsProxy()) {
			InternalEObject oldOwningElement = (InternalEObject)owningElement;
			owningElement = (CIM_ManagedElement)eResolveProxy(oldOwningElement);
			if (owningElement != oldOwningElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT, oldOwningElement, owningElement));
			}
		}
		return owningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetOwningElement() {
		return owningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningElement(CIM_ManagedElement newOwningElement) {
		CIM_ManagedElement oldOwningElement = owningElement;
		owningElement = newOwningElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT, oldOwningElement, owningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Collection getOwnedElement() {
		if (ownedElement != null && ownedElement.eIsProxy()) {
			InternalEObject oldOwnedElement = (InternalEObject)ownedElement;
			ownedElement = (CIM_Collection)eResolveProxy(oldOwnedElement);
			if (ownedElement != oldOwnedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT, oldOwnedElement, ownedElement));
			}
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Collection basicGetOwnedElement() {
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedElement(CIM_Collection newOwnedElement) {
		CIM_Collection oldOwnedElement = ownedElement;
		ownedElement = newOwnedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT, oldOwnedElement, ownedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT:
				if (resolve) return getOwningElement();
				return basicGetOwningElement();
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT:
				if (resolve) return getOwnedElement();
				return basicGetOwnedElement();
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
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT:
				setOwningElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT:
				setOwnedElement((CIM_Collection)newValue);
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
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT:
				setOwningElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT:
				setOwnedElement((CIM_Collection)null);
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
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNING_ELEMENT:
				return owningElement != null;
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT__OWNED_ELEMENT:
				return ownedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_OwningCollectionElementImpl
