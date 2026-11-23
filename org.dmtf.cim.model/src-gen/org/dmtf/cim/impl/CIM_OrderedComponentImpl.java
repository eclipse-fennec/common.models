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

import org.dmtf.cim.CIM_OrderedComponent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Ordered Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OrderedComponentImpl#getAssignedSequence <em>Assigned Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OrderedComponentImpl extends CIM_ComponentImpl implements CIM_OrderedComponent {
	/**
	 * The default value of the '{@link #getAssignedSequence() <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Long ASSIGNED_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedSequence() <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedSequence()
	 * @generated
	 * @ordered
	 */
	protected Long assignedSequence = ASSIGNED_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OrderedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OrderedComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAssignedSequence() {
		return assignedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedSequence(Long newAssignedSequence) {
		Long oldAssignedSequence = assignedSequence;
		assignedSequence = newAssignedSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ORDERED_COMPONENT__ASSIGNED_SEQUENCE, oldAssignedSequence, assignedSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ORDERED_COMPONENT__ASSIGNED_SEQUENCE:
				return getAssignedSequence();
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
			case CimPackage.CIM_ORDERED_COMPONENT__ASSIGNED_SEQUENCE:
				setAssignedSequence((Long)newValue);
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
			case CimPackage.CIM_ORDERED_COMPONENT__ASSIGNED_SEQUENCE:
				setAssignedSequence(ASSIGNED_SEQUENCE_EDEFAULT);
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
			case CimPackage.CIM_ORDERED_COMPONENT__ASSIGNED_SEQUENCE:
				return ASSIGNED_SEQUENCE_EDEFAULT == null ? assignedSequence != null : !ASSIGNED_SEQUENCE_EDEFAULT.equals(assignedSequence);
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
		result.append(" (AssignedSequence: ");
		result.append(assignedSequence);
		result.append(')');
		return result.toString();
	}

} //CIM_OrderedComponentImpl
