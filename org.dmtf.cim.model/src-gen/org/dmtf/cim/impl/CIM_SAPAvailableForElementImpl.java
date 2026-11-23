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
import org.dmtf.cim.CIM_SAPAvailableForElement;
import org.dmtf.cim.CIM_ServiceAccessPoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SAP Available For Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAPAvailableForElementImpl#getAvailableSAP <em>Available SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAPAvailableForElementImpl#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SAPAvailableForElementImpl extends MinimalEObjectImpl.Container implements CIM_SAPAvailableForElement {
	/**
	 * The cached value of the '{@link #getAvailableSAP() <em>Available SAP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSAP()
	 * @generated
	 * @ordered
	 */
	protected CIM_ServiceAccessPoint availableSAP;

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
	protected CIM_SAPAvailableForElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SAPAvailableForElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAccessPoint getAvailableSAP() {
		if (availableSAP != null && availableSAP.eIsProxy()) {
			InternalEObject oldAvailableSAP = (InternalEObject)availableSAP;
			availableSAP = (CIM_ServiceAccessPoint)eResolveProxy(oldAvailableSAP);
			if (availableSAP != oldAvailableSAP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP, oldAvailableSAP, availableSAP));
			}
		}
		return availableSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ServiceAccessPoint basicGetAvailableSAP() {
		return availableSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSAP(CIM_ServiceAccessPoint newAvailableSAP) {
		CIM_ServiceAccessPoint oldAvailableSAP = availableSAP;
		availableSAP = newAvailableSAP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP, oldAvailableSAP, availableSAP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT, oldManagedElement, managedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP:
				if (resolve) return getAvailableSAP();
				return basicGetAvailableSAP();
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP:
				setAvailableSAP((CIM_ServiceAccessPoint)newValue);
				return;
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP:
				setAvailableSAP((CIM_ServiceAccessPoint)null);
				return;
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT:
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
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__AVAILABLE_SAP:
				return availableSAP != null;
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT__MANAGED_ELEMENT:
				return managedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_SAPAvailableForElementImpl
