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

import org.dmtf.cim.CIM_BaseMetricValue;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Base Metric Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getMetricDefinitionId <em>Metric Definition Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getMeasuredElementName <em>Measured Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getMetricValue <em>Metric Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getBreakdownDimension <em>Breakdown Dimension</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getBreakdownValue <em>Breakdown Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BaseMetricValueImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BaseMetricValueImpl extends CIM_ManagedElementImpl implements CIM_BaseMetricValue {
	/**
	 * The default value of the '{@link #getMetricDefinitionId() <em>Metric Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_DEFINITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricDefinitionId() <em>Metric Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected String metricDefinitionId = METRIC_DEFINITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasuredElementName() <em>Measured Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasuredElementName() <em>Measured Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredElementName()
	 * @generated
	 * @ordered
	 */
	protected String measuredElementName = MEASURED_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetricValue() <em>Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricValue()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricValue() <em>Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricValue()
	 * @generated
	 * @ordered
	 */
	protected String metricValue = METRIC_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreakdownDimension() <em>Breakdown Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakdownDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAKDOWN_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreakdownDimension() <em>Breakdown Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakdownDimension()
	 * @generated
	 * @ordered
	 */
	protected String breakdownDimension = BREAKDOWN_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreakdownValue() <em>Breakdown Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakdownValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAKDOWN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreakdownValue() <em>Breakdown Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakdownValue()
	 * @generated
	 * @ordered
	 */
	protected String breakdownValue = BREAKDOWN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BaseMetricValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BaseMetricValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetricDefinitionId() {
		return metricDefinitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricDefinitionId(String newMetricDefinitionId) {
		String oldMetricDefinitionId = metricDefinitionId;
		metricDefinitionId = newMetricDefinitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__METRIC_DEFINITION_ID, oldMetricDefinitionId, metricDefinitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeasuredElementName() {
		return measuredElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasuredElementName(String newMeasuredElementName) {
		String oldMeasuredElementName = measuredElementName;
		measuredElementName = newMeasuredElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__MEASURED_ELEMENT_NAME, oldMeasuredElementName, measuredElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetricValue() {
		return metricValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricValue(String newMetricValue) {
		String oldMetricValue = metricValue;
		metricValue = newMetricValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__METRIC_VALUE, oldMetricValue, metricValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBreakdownDimension() {
		return breakdownDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreakdownDimension(String newBreakdownDimension) {
		String oldBreakdownDimension = breakdownDimension;
		breakdownDimension = newBreakdownDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_DIMENSION, oldBreakdownDimension, breakdownDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBreakdownValue() {
		return breakdownValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreakdownValue(String newBreakdownValue) {
		String oldBreakdownValue = breakdownValue;
		breakdownValue = newBreakdownValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_VALUE, oldBreakdownValue, breakdownValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatile(Boolean newVolatile) {
		Boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BASE_METRIC_VALUE__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_DEFINITION_ID:
				return getMetricDefinitionId();
			case CimPackage.CIM_BASE_METRIC_VALUE__MEASURED_ELEMENT_NAME:
				return getMeasuredElementName();
			case CimPackage.CIM_BASE_METRIC_VALUE__TIME_STAMP:
				return getTimeStamp();
			case CimPackage.CIM_BASE_METRIC_VALUE__DURATION:
				return getDuration();
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_VALUE:
				return getMetricValue();
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_DIMENSION:
				return getBreakdownDimension();
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_VALUE:
				return getBreakdownValue();
			case CimPackage.CIM_BASE_METRIC_VALUE__VOLATILE:
				return getVolatile();
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
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_DEFINITION_ID:
				setMetricDefinitionId((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__MEASURED_ELEMENT_NAME:
				setMeasuredElementName((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__DURATION:
				setDuration((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_VALUE:
				setMetricValue((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_DIMENSION:
				setBreakdownDimension((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_VALUE:
				setBreakdownValue((String)newValue);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__VOLATILE:
				setVolatile((Boolean)newValue);
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
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_DEFINITION_ID:
				setMetricDefinitionId(METRIC_DEFINITION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__MEASURED_ELEMENT_NAME:
				setMeasuredElementName(MEASURED_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_VALUE:
				setMetricValue(METRIC_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_DIMENSION:
				setBreakdownDimension(BREAKDOWN_DIMENSION_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_VALUE:
				setBreakdownValue(BREAKDOWN_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_BASE_METRIC_VALUE__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
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
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_DEFINITION_ID:
				return METRIC_DEFINITION_ID_EDEFAULT == null ? metricDefinitionId != null : !METRIC_DEFINITION_ID_EDEFAULT.equals(metricDefinitionId);
			case CimPackage.CIM_BASE_METRIC_VALUE__MEASURED_ELEMENT_NAME:
				return MEASURED_ELEMENT_NAME_EDEFAULT == null ? measuredElementName != null : !MEASURED_ELEMENT_NAME_EDEFAULT.equals(measuredElementName);
			case CimPackage.CIM_BASE_METRIC_VALUE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CimPackage.CIM_BASE_METRIC_VALUE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case CimPackage.CIM_BASE_METRIC_VALUE__METRIC_VALUE:
				return METRIC_VALUE_EDEFAULT == null ? metricValue != null : !METRIC_VALUE_EDEFAULT.equals(metricValue);
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_DIMENSION:
				return BREAKDOWN_DIMENSION_EDEFAULT == null ? breakdownDimension != null : !BREAKDOWN_DIMENSION_EDEFAULT.equals(breakdownDimension);
			case CimPackage.CIM_BASE_METRIC_VALUE__BREAKDOWN_VALUE:
				return BREAKDOWN_VALUE_EDEFAULT == null ? breakdownValue != null : !BREAKDOWN_VALUE_EDEFAULT.equals(breakdownValue);
			case CimPackage.CIM_BASE_METRIC_VALUE__VOLATILE:
				return VOLATILE_EDEFAULT == null ? volatile_ != null : !VOLATILE_EDEFAULT.equals(volatile_);
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
		result.append(" (MetricDefinitionId: ");
		result.append(metricDefinitionId);
		result.append(", MeasuredElementName: ");
		result.append(measuredElementName);
		result.append(", TimeStamp: ");
		result.append(timeStamp);
		result.append(", Duration: ");
		result.append(duration);
		result.append(", MetricValue: ");
		result.append(metricValue);
		result.append(", BreakdownDimension: ");
		result.append(breakdownDimension);
		result.append(", BreakdownValue: ");
		result.append(breakdownValue);
		result.append(", Volatile: ");
		result.append(volatile_);
		result.append(')');
		return result.toString();
	}

} //CIM_BaseMetricValueImpl
