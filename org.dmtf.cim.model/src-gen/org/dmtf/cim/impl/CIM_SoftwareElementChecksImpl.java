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

import org.dmtf.cim.CIM_Check;
import org.dmtf.cim.CIM_SoftwareElement;
import org.dmtf.cim.CIM_SoftwareElementChecks;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Element Checks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementChecksImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementChecksImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareElementChecksImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareElementChecksImpl extends MinimalEObjectImpl.Container implements CIM_SoftwareElementChecks {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_SoftwareElement element;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected CIM_Check check;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected Integer phase = PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareElementChecksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareElementChecks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (CIM_SoftwareElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SoftwareElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(CIM_SoftwareElement newElement) {
		CIM_SoftwareElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Check getCheck() {
		if (check != null && check.eIsProxy()) {
			InternalEObject oldCheck = (InternalEObject)check;
			check = (CIM_Check)eResolveProxy(oldCheck);
			if (check != oldCheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK, oldCheck, check));
			}
		}
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Check basicGetCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheck(CIM_Check newCheck) {
		CIM_Check oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase(Integer newPhase) {
		Integer oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK:
				if (resolve) return getCheck();
				return basicGetCheck();
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__PHASE:
				return getPhase();
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT:
				setElement((CIM_SoftwareElement)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK:
				setCheck((CIM_Check)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__PHASE:
				setPhase((Integer)newValue);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT:
				setElement((CIM_SoftwareElement)null);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK:
				setCheck((CIM_Check)null);
				return;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__ELEMENT:
				return element != null;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__CHECK:
				return check != null;
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareElementChecksImpl
