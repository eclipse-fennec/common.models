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

import org.dmtf.cim.CIM_AggregationMetricDefinition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Aggregation Metric Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AggregationMetricDefinitionImpl#getSimpleFunction <em>Simple Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AggregationMetricDefinitionImpl extends CIM_BaseMetricDefinitionImpl implements CIM_AggregationMetricDefinition {
	/**
	 * The default value of the '{@link #getSimpleFunction() <em>Simple Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleFunction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIMPLE_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleFunction() <em>Simple Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleFunction()
	 * @generated
	 * @ordered
	 */
	protected Integer simpleFunction = SIMPLE_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AggregationMetricDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AggregationMetricDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSimpleFunction() {
		return simpleFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleFunction(Integer newSimpleFunction) {
		Integer oldSimpleFunction = simpleFunction;
		simpleFunction = newSimpleFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGGREGATION_METRIC_DEFINITION__SIMPLE_FUNCTION, oldSimpleFunction, simpleFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AGGREGATION_METRIC_DEFINITION__SIMPLE_FUNCTION:
				return getSimpleFunction();
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
			case CimPackage.CIM_AGGREGATION_METRIC_DEFINITION__SIMPLE_FUNCTION:
				setSimpleFunction((Integer)newValue);
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
			case CimPackage.CIM_AGGREGATION_METRIC_DEFINITION__SIMPLE_FUNCTION:
				setSimpleFunction(SIMPLE_FUNCTION_EDEFAULT);
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
			case CimPackage.CIM_AGGREGATION_METRIC_DEFINITION__SIMPLE_FUNCTION:
				return SIMPLE_FUNCTION_EDEFAULT == null ? simpleFunction != null : !SIMPLE_FUNCTION_EDEFAULT.equals(simpleFunction);
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
		result.append(" (SimpleFunction: ");
		result.append(simpleFunction);
		result.append(')');
		return result.toString();
	}

} //CIM_AggregationMetricDefinitionImpl
