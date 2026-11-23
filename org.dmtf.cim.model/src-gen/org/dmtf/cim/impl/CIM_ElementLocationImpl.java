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

import org.dmtf.cim.CIM_ElementLocation;
import org.dmtf.cim.CIM_Location;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Element Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementLocationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ElementLocationImpl#getPhysicalLocation <em>Physical Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ElementLocationImpl extends MinimalEObjectImpl.Container implements CIM_ElementLocation {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement element;

	/**
	 * The cached value of the '{@link #getPhysicalLocation() <em>Physical Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalLocation()
	 * @generated
	 * @ordered
	 */
	protected CIM_Location physicalLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ElementLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ElementLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (CIM_ManagedElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_LOCATION__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(CIM_ManagedElement newElement) {
		CIM_ManagedElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_LOCATION__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Location getPhysicalLocation() {
		if (physicalLocation != null && physicalLocation.eIsProxy()) {
			InternalEObject oldPhysicalLocation = (InternalEObject)physicalLocation;
			physicalLocation = (CIM_Location)eResolveProxy(oldPhysicalLocation);
			if (physicalLocation != oldPhysicalLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION, oldPhysicalLocation, physicalLocation));
			}
		}
		return physicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Location basicGetPhysicalLocation() {
		return physicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalLocation(CIM_Location newPhysicalLocation) {
		CIM_Location oldPhysicalLocation = physicalLocation;
		physicalLocation = newPhysicalLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION, oldPhysicalLocation, physicalLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ELEMENT_LOCATION__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION:
				if (resolve) return getPhysicalLocation();
				return basicGetPhysicalLocation();
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
			case CimPackage.CIM_ELEMENT_LOCATION__ELEMENT:
				setElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION:
				setPhysicalLocation((CIM_Location)newValue);
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
			case CimPackage.CIM_ELEMENT_LOCATION__ELEMENT:
				setElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION:
				setPhysicalLocation((CIM_Location)null);
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
			case CimPackage.CIM_ELEMENT_LOCATION__ELEMENT:
				return element != null;
			case CimPackage.CIM_ELEMENT_LOCATION__PHYSICAL_LOCATION:
				return physicalLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ElementLocationImpl
