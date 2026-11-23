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

import org.dmtf.cim.CIM_Confederation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Confederation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfederationImpl#getParentASNumber <em>Parent AS Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfederationImpl#getChildASNumber <em>Child AS Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConfederationImpl extends CIM_SystemComponentImpl implements CIM_Confederation {
	/**
	 * The default value of the '{@link #getParentASNumber() <em>Parent AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentASNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARENT_AS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentASNumber() <em>Parent AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentASNumber()
	 * @generated
	 * @ordered
	 */
	protected Long parentASNumber = PARENT_AS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildASNumber() <em>Child AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildASNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHILD_AS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildASNumber() <em>Child AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildASNumber()
	 * @generated
	 * @ordered
	 */
	protected Long childASNumber = CHILD_AS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConfederationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Confederation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getParentASNumber() {
		return parentASNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentASNumber(Long newParentASNumber) {
		Long oldParentASNumber = parentASNumber;
		parentASNumber = newParentASNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFEDERATION__PARENT_AS_NUMBER, oldParentASNumber, parentASNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getChildASNumber() {
		return childASNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildASNumber(Long newChildASNumber) {
		Long oldChildASNumber = childASNumber;
		childASNumber = newChildASNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFEDERATION__CHILD_AS_NUMBER, oldChildASNumber, childASNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONFEDERATION__PARENT_AS_NUMBER:
				return getParentASNumber();
			case CimPackage.CIM_CONFEDERATION__CHILD_AS_NUMBER:
				return getChildASNumber();
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
			case CimPackage.CIM_CONFEDERATION__PARENT_AS_NUMBER:
				setParentASNumber((Long)newValue);
				return;
			case CimPackage.CIM_CONFEDERATION__CHILD_AS_NUMBER:
				setChildASNumber((Long)newValue);
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
			case CimPackage.CIM_CONFEDERATION__PARENT_AS_NUMBER:
				setParentASNumber(PARENT_AS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_CONFEDERATION__CHILD_AS_NUMBER:
				setChildASNumber(CHILD_AS_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_CONFEDERATION__PARENT_AS_NUMBER:
				return PARENT_AS_NUMBER_EDEFAULT == null ? parentASNumber != null : !PARENT_AS_NUMBER_EDEFAULT.equals(parentASNumber);
			case CimPackage.CIM_CONFEDERATION__CHILD_AS_NUMBER:
				return CHILD_AS_NUMBER_EDEFAULT == null ? childASNumber != null : !CHILD_AS_NUMBER_EDEFAULT.equals(childASNumber);
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
		result.append(" (ParentASNumber: ");
		result.append(parentASNumber);
		result.append(", ChildASNumber: ");
		result.append(childASNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_ConfederationImpl
