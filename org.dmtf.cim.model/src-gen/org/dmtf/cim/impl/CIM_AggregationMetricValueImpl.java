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

import org.dmtf.cim.CIM_AggregationMetricValue;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Aggregation Metric Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AggregationMetricValueImpl#getAggregationTimeStamp <em>Aggregation Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AggregationMetricValueImpl#getAggregationDuration <em>Aggregation Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AggregationMetricValueImpl extends CIM_BaseMetricValueImpl implements CIM_AggregationMetricValue {
	/**
	 * The default value of the '{@link #getAggregationTimeStamp() <em>Aggregation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationTimeStamp() <em>Aggregation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String aggregationTimeStamp = AGGREGATION_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationDuration() <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationDuration() <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDuration()
	 * @generated
	 * @ordered
	 */
	protected String aggregationDuration = AGGREGATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AggregationMetricValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AggregationMetricValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationTimeStamp() {
		return aggregationTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationTimeStamp(String newAggregationTimeStamp) {
		String oldAggregationTimeStamp = aggregationTimeStamp;
		aggregationTimeStamp = newAggregationTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_TIME_STAMP, oldAggregationTimeStamp, aggregationTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregationDuration() {
		return aggregationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationDuration(String newAggregationDuration) {
		String oldAggregationDuration = aggregationDuration;
		aggregationDuration = newAggregationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_DURATION, oldAggregationDuration, aggregationDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_TIME_STAMP:
				return getAggregationTimeStamp();
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_DURATION:
				return getAggregationDuration();
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
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_TIME_STAMP:
				setAggregationTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_DURATION:
				setAggregationDuration((String)newValue);
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
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_TIME_STAMP:
				setAggregationTimeStamp(AGGREGATION_TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_DURATION:
				setAggregationDuration(AGGREGATION_DURATION_EDEFAULT);
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
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_TIME_STAMP:
				return AGGREGATION_TIME_STAMP_EDEFAULT == null ? aggregationTimeStamp != null : !AGGREGATION_TIME_STAMP_EDEFAULT.equals(aggregationTimeStamp);
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE__AGGREGATION_DURATION:
				return AGGREGATION_DURATION_EDEFAULT == null ? aggregationDuration != null : !AGGREGATION_DURATION_EDEFAULT.equals(aggregationDuration);
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
		result.append(" (AggregationTimeStamp: ");
		result.append(aggregationTimeStamp);
		result.append(", AggregationDuration: ");
		result.append(aggregationDuration);
		result.append(')');
		return result.toString();
	}

} //CIM_AggregationMetricValueImpl
