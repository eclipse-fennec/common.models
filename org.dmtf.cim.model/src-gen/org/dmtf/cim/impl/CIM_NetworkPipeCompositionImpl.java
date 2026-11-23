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

import org.dmtf.cim.CIM_NetworkPipeComposition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Pipe Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPipeCompositionImpl#getAggregationSequence <em>Aggregation Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPipeCompositionImpl extends CIM_ComponentImpl implements CIM_NetworkPipeComposition {
	/**
	 * The default value of the '{@link #getAggregationSequence() <em>Aggregation Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGGREGATION_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationSequence() <em>Aggregation Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationSequence()
	 * @generated
	 * @ordered
	 */
	protected Integer aggregationSequence = AGGREGATION_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPipeCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPipeComposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAggregationSequence() {
		return aggregationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationSequence(Integer newAggregationSequence) {
		Integer oldAggregationSequence = aggregationSequence;
		aggregationSequence = newAggregationSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PIPE_COMPOSITION__AGGREGATION_SEQUENCE, oldAggregationSequence, aggregationSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PIPE_COMPOSITION__AGGREGATION_SEQUENCE:
				return getAggregationSequence();
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
			case CimPackage.CIM_NETWORK_PIPE_COMPOSITION__AGGREGATION_SEQUENCE:
				setAggregationSequence((Integer)newValue);
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
			case CimPackage.CIM_NETWORK_PIPE_COMPOSITION__AGGREGATION_SEQUENCE:
				setAggregationSequence(AGGREGATION_SEQUENCE_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_PIPE_COMPOSITION__AGGREGATION_SEQUENCE:
				return AGGREGATION_SEQUENCE_EDEFAULT == null ? aggregationSequence != null : !AGGREGATION_SEQUENCE_EDEFAULT.equals(aggregationSequence);
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
		result.append(" (AggregationSequence: ");
		result.append(aggregationSequence);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPipeCompositionImpl
