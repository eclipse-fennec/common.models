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

import org.dmtf.cim.CIM_WRRSchedulingElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM WRR Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WRRSchedulingElementImpl#getWeightingFactor <em>Weighting Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WRRSchedulingElementImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WRRSchedulingElementImpl extends CIM_SchedulingElementImpl implements CIM_WRRSchedulingElement {
	/**
	 * The default value of the '{@link #getWeightingFactor() <em>Weighting Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEIGHTING_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeightingFactor() <em>Weighting Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightingFactor()
	 * @generated
	 * @ordered
	 */
	protected Long weightingFactor = WEIGHTING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WRRSchedulingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WRRSchedulingElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWeightingFactor() {
		return weightingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightingFactor(Long newWeightingFactor) {
		Long oldWeightingFactor = weightingFactor;
		weightingFactor = newWeightingFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WRR_SCHEDULING_ELEMENT__WEIGHTING_FACTOR, oldWeightingFactor, weightingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WRR_SCHEDULING_ELEMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__WEIGHTING_FACTOR:
				return getWeightingFactor();
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__PRIORITY:
				return getPriority();
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
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__WEIGHTING_FACTOR:
				setWeightingFactor((Long)newValue);
				return;
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__PRIORITY:
				setPriority((Integer)newValue);
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
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__WEIGHTING_FACTOR:
				setWeightingFactor(WEIGHTING_FACTOR_EDEFAULT);
				return;
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__WEIGHTING_FACTOR:
				return WEIGHTING_FACTOR_EDEFAULT == null ? weightingFactor != null : !WEIGHTING_FACTOR_EDEFAULT.equals(weightingFactor);
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
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
		result.append(" (WeightingFactor: ");
		result.append(weightingFactor);
		result.append(", Priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //CIM_WRRSchedulingElementImpl
