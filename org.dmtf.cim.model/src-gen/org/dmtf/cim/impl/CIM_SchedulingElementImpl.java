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

import org.dmtf.cim.CIM_SchedulingElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchedulingElementImpl#getWorkConserving <em>Work Conserving</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SchedulingElementImpl extends CIM_ManagedElementImpl implements CIM_SchedulingElement {
	/**
	 * The default value of the '{@link #getWorkConserving() <em>Work Conserving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkConserving()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WORK_CONSERVING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkConserving() <em>Work Conserving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkConserving()
	 * @generated
	 * @ordered
	 */
	protected Boolean workConserving = WORK_CONSERVING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SchedulingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SchedulingElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWorkConserving() {
		return workConserving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkConserving(Boolean newWorkConserving) {
		Boolean oldWorkConserving = workConserving;
		workConserving = newWorkConserving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEDULING_ELEMENT__WORK_CONSERVING, oldWorkConserving, workConserving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCHEDULING_ELEMENT__WORK_CONSERVING:
				return getWorkConserving();
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
			case CimPackage.CIM_SCHEDULING_ELEMENT__WORK_CONSERVING:
				setWorkConserving((Boolean)newValue);
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
			case CimPackage.CIM_SCHEDULING_ELEMENT__WORK_CONSERVING:
				setWorkConserving(WORK_CONSERVING_EDEFAULT);
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
			case CimPackage.CIM_SCHEDULING_ELEMENT__WORK_CONSERVING:
				return WORK_CONSERVING_EDEFAULT == null ? workConserving != null : !WORK_CONSERVING_EDEFAULT.equals(workConserving);
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
		result.append(" (WorkConserving: ");
		result.append(workConserving);
		result.append(')');
		return result.toString();
	}

} //CIM_SchedulingElementImpl
