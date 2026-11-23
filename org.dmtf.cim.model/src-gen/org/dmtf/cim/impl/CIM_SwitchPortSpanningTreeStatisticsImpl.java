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

import org.dmtf.cim.CIM_SwitchPortSpanningTreeStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Spanning Tree Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeStatisticsImpl#getForwardTransitions <em>Forward Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortSpanningTreeStatisticsImpl extends CIM_SAPStatisticalInformationImpl implements CIM_SwitchPortSpanningTreeStatistics {
	/**
	 * The default value of the '{@link #getForwardTransitions() <em>Forward Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardTransitions()
	 * @generated
	 * @ordered
	 */
	protected static final Long FORWARD_TRANSITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardTransitions() <em>Forward Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardTransitions()
	 * @generated
	 * @ordered
	 */
	protected Long forwardTransitions = FORWARD_TRANSITIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortSpanningTreeStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortSpanningTreeStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getForwardTransitions() {
		return forwardTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForwardTransitions(Long newForwardTransitions) {
		Long oldForwardTransitions = forwardTransitions;
		forwardTransitions = newForwardTransitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS__FORWARD_TRANSITIONS, oldForwardTransitions, forwardTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS__FORWARD_TRANSITIONS:
				return getForwardTransitions();
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS__FORWARD_TRANSITIONS:
				setForwardTransitions((Long)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS__FORWARD_TRANSITIONS:
				setForwardTransitions(FORWARD_TRANSITIONS_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS__FORWARD_TRANSITIONS:
				return FORWARD_TRANSITIONS_EDEFAULT == null ? forwardTransitions != null : !FORWARD_TRANSITIONS_EDEFAULT.equals(forwardTransitions);
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
		result.append(" (ForwardTransitions: ");
		result.append(forwardTransitions);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortSpanningTreeStatisticsImpl
