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

import org.dmtf.cim.CIM_AFService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM AF Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AFServiceImpl#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AFServiceImpl#getDropperNumber <em>Dropper Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AFServiceImpl extends CIM_DiffServServiceImpl implements CIM_AFService {
	/**
	 * The default value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer classNumber = CLASS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropperNumber() <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DROPPER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDropperNumber() <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer dropperNumber = DROPPER_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AFServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AFService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassNumber() {
		return classNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassNumber(Integer newClassNumber) {
		Integer oldClassNumber = classNumber;
		classNumber = newClassNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AF_SERVICE__CLASS_NUMBER, oldClassNumber, classNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDropperNumber() {
		return dropperNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDropperNumber(Integer newDropperNumber) {
		Integer oldDropperNumber = dropperNumber;
		dropperNumber = newDropperNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AF_SERVICE__DROPPER_NUMBER, oldDropperNumber, dropperNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AF_SERVICE__CLASS_NUMBER:
				return getClassNumber();
			case CimPackage.CIM_AF_SERVICE__DROPPER_NUMBER:
				return getDropperNumber();
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
			case CimPackage.CIM_AF_SERVICE__CLASS_NUMBER:
				setClassNumber((Integer)newValue);
				return;
			case CimPackage.CIM_AF_SERVICE__DROPPER_NUMBER:
				setDropperNumber((Integer)newValue);
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
			case CimPackage.CIM_AF_SERVICE__CLASS_NUMBER:
				setClassNumber(CLASS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_AF_SERVICE__DROPPER_NUMBER:
				setDropperNumber(DROPPER_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_AF_SERVICE__CLASS_NUMBER:
				return CLASS_NUMBER_EDEFAULT == null ? classNumber != null : !CLASS_NUMBER_EDEFAULT.equals(classNumber);
			case CimPackage.CIM_AF_SERVICE__DROPPER_NUMBER:
				return DROPPER_NUMBER_EDEFAULT == null ? dropperNumber != null : !DROPPER_NUMBER_EDEFAULT.equals(dropperNumber);
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
		result.append(" (ClassNumber: ");
		result.append(classNumber);
		result.append(", DropperNumber: ");
		result.append(dropperNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_AFServiceImpl
