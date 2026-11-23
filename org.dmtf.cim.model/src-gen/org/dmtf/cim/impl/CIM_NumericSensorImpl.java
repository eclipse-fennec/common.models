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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_NumericSensor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Numeric Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getBaseUnits <em>Base Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getUnitModifier <em>Unit Modifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getRateUnits <em>Rate Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getNominalReading <em>Nominal Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getNormalMax <em>Normal Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getNormalMin <em>Normal Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getMaxReadable <em>Max Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getMinReadable <em>Min Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getHysteresis <em>Hysteresis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getLowerThresholdNonCritical <em>Lower Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getUpperThresholdNonCritical <em>Upper Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getLowerThresholdCritical <em>Lower Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getUpperThresholdCritical <em>Upper Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getLowerThresholdFatal <em>Lower Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getUpperThresholdFatal <em>Upper Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getSupportedThresholds <em>Supported Thresholds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getEnabledThresholds <em>Enabled Thresholds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NumericSensorImpl#getSettableThresholds <em>Settable Thresholds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NumericSensorImpl extends CIM_SensorImpl implements CIM_NumericSensor {
	/**
	 * The default value of the '{@link #getBaseUnits() <em>Base Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BASE_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUnits() <em>Base Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer baseUnits = BASE_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitModifier() <em>Unit Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitModifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNIT_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitModifier() <em>Unit Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitModifier()
	 * @generated
	 * @ordered
	 */
	protected Integer unitModifier = UNIT_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateUnits() <em>Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RATE_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateUnits() <em>Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer rateUnits = RATE_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_READING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected Integer currentReading = CURRENT_READING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalReading() <em>Nominal Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalReading()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NOMINAL_READING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalReading() <em>Nominal Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalReading()
	 * @generated
	 * @ordered
	 */
	protected Integer nominalReading = NOMINAL_READING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalMax() <em>Normal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NORMAL_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalMax() <em>Normal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMax()
	 * @generated
	 * @ordered
	 */
	protected Integer normalMax = NORMAL_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalMin() <em>Normal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NORMAL_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalMin() <em>Normal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMin()
	 * @generated
	 * @ordered
	 */
	protected Integer normalMin = NORMAL_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReadable() <em>Max Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReadable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_READABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxReadable() <em>Max Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReadable()
	 * @generated
	 * @ordered
	 */
	protected Integer maxReadable = MAX_READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinReadable() <em>Min Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReadable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_READABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinReadable() <em>Min Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReadable()
	 * @generated
	 * @ordered
	 */
	protected Integer minReadable = MIN_READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Long resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOLERANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected Integer tolerance = TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCURACY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected Integer accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLinear()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LINEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLinear()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLinear = IS_LINEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHysteresis() <em>Hysteresis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHysteresis()
	 * @generated
	 * @ordered
	 */
	protected static final Long HYSTERESIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHysteresis() <em>Hysteresis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHysteresis()
	 * @generated
	 * @ordered
	 */
	protected Long hysteresis = HYSTERESIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerThresholdNonCritical() <em>Lower Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_THRESHOLD_NON_CRITICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerThresholdNonCritical() <em>Lower Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerThresholdNonCritical = LOWER_THRESHOLD_NON_CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperThresholdNonCritical() <em>Upper Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_THRESHOLD_NON_CRITICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperThresholdNonCritical() <em>Upper Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected Integer upperThresholdNonCritical = UPPER_THRESHOLD_NON_CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerThresholdCritical() <em>Lower Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_THRESHOLD_CRITICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerThresholdCritical() <em>Lower Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerThresholdCritical = LOWER_THRESHOLD_CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperThresholdCritical() <em>Upper Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_THRESHOLD_CRITICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperThresholdCritical() <em>Upper Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected Integer upperThresholdCritical = UPPER_THRESHOLD_CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerThresholdFatal() <em>Lower Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_THRESHOLD_FATAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerThresholdFatal() <em>Lower Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerThresholdFatal = LOWER_THRESHOLD_FATAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperThresholdFatal() <em>Upper Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_THRESHOLD_FATAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperThresholdFatal() <em>Upper Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected Integer upperThresholdFatal = UPPER_THRESHOLD_FATAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedThresholds() <em>Supported Thresholds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedThresholds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedThresholds;

	/**
	 * The cached value of the '{@link #getEnabledThresholds() <em>Enabled Thresholds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledThresholds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledThresholds;

	/**
	 * The cached value of the '{@link #getSettableThresholds() <em>Settable Thresholds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettableThresholds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> settableThresholds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NumericSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NumericSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBaseUnits() {
		return baseUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUnits(Integer newBaseUnits) {
		Integer oldBaseUnits = baseUnits;
		baseUnits = newBaseUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__BASE_UNITS, oldBaseUnits, baseUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUnitModifier() {
		return unitModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitModifier(Integer newUnitModifier) {
		Integer oldUnitModifier = unitModifier;
		unitModifier = newUnitModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__UNIT_MODIFIER, oldUnitModifier, unitModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRateUnits() {
		return rateUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateUnits(Integer newRateUnits) {
		Integer oldRateUnits = rateUnits;
		rateUnits = newRateUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__RATE_UNITS, oldRateUnits, rateUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentReading() {
		return currentReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentReading(Integer newCurrentReading) {
		Integer oldCurrentReading = currentReading;
		currentReading = newCurrentReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__CURRENT_READING, oldCurrentReading, currentReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNominalReading() {
		return nominalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNominalReading(Integer newNominalReading) {
		Integer oldNominalReading = nominalReading;
		nominalReading = newNominalReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__NOMINAL_READING, oldNominalReading, nominalReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNormalMax() {
		return normalMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalMax(Integer newNormalMax) {
		Integer oldNormalMax = normalMax;
		normalMax = newNormalMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MAX, oldNormalMax, normalMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNormalMin() {
		return normalMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalMin(Integer newNormalMin) {
		Integer oldNormalMin = normalMin;
		normalMin = newNormalMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MIN, oldNormalMin, normalMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxReadable() {
		return maxReadable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReadable(Integer newMaxReadable) {
		Integer oldMaxReadable = maxReadable;
		maxReadable = newMaxReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__MAX_READABLE, oldMaxReadable, maxReadable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinReadable() {
		return minReadable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinReadable(Integer newMinReadable) {
		Integer oldMinReadable = minReadable;
		minReadable = newMinReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__MIN_READABLE, oldMinReadable, minReadable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(Long newResolution) {
		Long oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTolerance(Integer newTolerance) {
		Integer oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__TOLERANCE, oldTolerance, tolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccuracy(Integer newAccuracy) {
		Integer oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsLinear() {
		return isLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLinear(Boolean newIsLinear) {
		Boolean oldIsLinear = isLinear;
		isLinear = newIsLinear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__IS_LINEAR, oldIsLinear, isLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHysteresis() {
		return hysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHysteresis(Long newHysteresis) {
		Long oldHysteresis = hysteresis;
		hysteresis = newHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__HYSTERESIS, oldHysteresis, hysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerThresholdNonCritical() {
		return lowerThresholdNonCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerThresholdNonCritical(Integer newLowerThresholdNonCritical) {
		Integer oldLowerThresholdNonCritical = lowerThresholdNonCritical;
		lowerThresholdNonCritical = newLowerThresholdNonCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_NON_CRITICAL, oldLowerThresholdNonCritical, lowerThresholdNonCritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperThresholdNonCritical() {
		return upperThresholdNonCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperThresholdNonCritical(Integer newUpperThresholdNonCritical) {
		Integer oldUpperThresholdNonCritical = upperThresholdNonCritical;
		upperThresholdNonCritical = newUpperThresholdNonCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_NON_CRITICAL, oldUpperThresholdNonCritical, upperThresholdNonCritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerThresholdCritical() {
		return lowerThresholdCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerThresholdCritical(Integer newLowerThresholdCritical) {
		Integer oldLowerThresholdCritical = lowerThresholdCritical;
		lowerThresholdCritical = newLowerThresholdCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_CRITICAL, oldLowerThresholdCritical, lowerThresholdCritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperThresholdCritical() {
		return upperThresholdCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperThresholdCritical(Integer newUpperThresholdCritical) {
		Integer oldUpperThresholdCritical = upperThresholdCritical;
		upperThresholdCritical = newUpperThresholdCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_CRITICAL, oldUpperThresholdCritical, upperThresholdCritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowerThresholdFatal() {
		return lowerThresholdFatal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerThresholdFatal(Integer newLowerThresholdFatal) {
		Integer oldLowerThresholdFatal = lowerThresholdFatal;
		lowerThresholdFatal = newLowerThresholdFatal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_FATAL, oldLowerThresholdFatal, lowerThresholdFatal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpperThresholdFatal() {
		return upperThresholdFatal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperThresholdFatal(Integer newUpperThresholdFatal) {
		Integer oldUpperThresholdFatal = upperThresholdFatal;
		upperThresholdFatal = newUpperThresholdFatal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_FATAL, oldUpperThresholdFatal, upperThresholdFatal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedThresholds() {
		if (supportedThresholds == null) {
			supportedThresholds = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_NUMERIC_SENSOR__SUPPORTED_THRESHOLDS);
		}
		return supportedThresholds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledThresholds() {
		if (enabledThresholds == null) {
			enabledThresholds = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_NUMERIC_SENSOR__ENABLED_THRESHOLDS);
		}
		return enabledThresholds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSettableThresholds() {
		if (settableThresholds == null) {
			settableThresholds = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_NUMERIC_SENSOR__SETTABLE_THRESHOLDS);
		}
		return settableThresholds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RestoreDefaultThresholds() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetNonLinearFactors(Integer SensorReading, Integer Accuracy, Long Resolution, Integer Tolerance, Long Hysteresis) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NUMERIC_SENSOR__BASE_UNITS:
				return getBaseUnits();
			case CimPackage.CIM_NUMERIC_SENSOR__UNIT_MODIFIER:
				return getUnitModifier();
			case CimPackage.CIM_NUMERIC_SENSOR__RATE_UNITS:
				return getRateUnits();
			case CimPackage.CIM_NUMERIC_SENSOR__CURRENT_READING:
				return getCurrentReading();
			case CimPackage.CIM_NUMERIC_SENSOR__NOMINAL_READING:
				return getNominalReading();
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MAX:
				return getNormalMax();
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MIN:
				return getNormalMin();
			case CimPackage.CIM_NUMERIC_SENSOR__MAX_READABLE:
				return getMaxReadable();
			case CimPackage.CIM_NUMERIC_SENSOR__MIN_READABLE:
				return getMinReadable();
			case CimPackage.CIM_NUMERIC_SENSOR__RESOLUTION:
				return getResolution();
			case CimPackage.CIM_NUMERIC_SENSOR__TOLERANCE:
				return getTolerance();
			case CimPackage.CIM_NUMERIC_SENSOR__ACCURACY:
				return getAccuracy();
			case CimPackage.CIM_NUMERIC_SENSOR__IS_LINEAR:
				return getIsLinear();
			case CimPackage.CIM_NUMERIC_SENSOR__HYSTERESIS:
				return getHysteresis();
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_NON_CRITICAL:
				return getLowerThresholdNonCritical();
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_NON_CRITICAL:
				return getUpperThresholdNonCritical();
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_CRITICAL:
				return getLowerThresholdCritical();
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_CRITICAL:
				return getUpperThresholdCritical();
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_FATAL:
				return getLowerThresholdFatal();
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_FATAL:
				return getUpperThresholdFatal();
			case CimPackage.CIM_NUMERIC_SENSOR__SUPPORTED_THRESHOLDS:
				return getSupportedThresholds();
			case CimPackage.CIM_NUMERIC_SENSOR__ENABLED_THRESHOLDS:
				return getEnabledThresholds();
			case CimPackage.CIM_NUMERIC_SENSOR__SETTABLE_THRESHOLDS:
				return getSettableThresholds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_NUMERIC_SENSOR__BASE_UNITS:
				setBaseUnits((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UNIT_MODIFIER:
				setUnitModifier((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__RATE_UNITS:
				setRateUnits((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__CURRENT_READING:
				setCurrentReading((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NOMINAL_READING:
				setNominalReading((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MAX:
				setNormalMax((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MIN:
				setNormalMin((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__MAX_READABLE:
				setMaxReadable((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__MIN_READABLE:
				setMinReadable((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__RESOLUTION:
				setResolution((Long)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__TOLERANCE:
				setTolerance((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__ACCURACY:
				setAccuracy((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__IS_LINEAR:
				setIsLinear((Boolean)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__HYSTERESIS:
				setHysteresis((Long)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_NON_CRITICAL:
				setLowerThresholdNonCritical((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_NON_CRITICAL:
				setUpperThresholdNonCritical((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_CRITICAL:
				setLowerThresholdCritical((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_CRITICAL:
				setUpperThresholdCritical((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_FATAL:
				setLowerThresholdFatal((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_FATAL:
				setUpperThresholdFatal((Integer)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__SUPPORTED_THRESHOLDS:
				getSupportedThresholds().clear();
				getSupportedThresholds().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__ENABLED_THRESHOLDS:
				getEnabledThresholds().clear();
				getEnabledThresholds().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__SETTABLE_THRESHOLDS:
				getSettableThresholds().clear();
				getSettableThresholds().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_NUMERIC_SENSOR__BASE_UNITS:
				setBaseUnits(BASE_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UNIT_MODIFIER:
				setUnitModifier(UNIT_MODIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__RATE_UNITS:
				setRateUnits(RATE_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__CURRENT_READING:
				setCurrentReading(CURRENT_READING_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NOMINAL_READING:
				setNominalReading(NOMINAL_READING_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MAX:
				setNormalMax(NORMAL_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MIN:
				setNormalMin(NORMAL_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__MAX_READABLE:
				setMaxReadable(MAX_READABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__MIN_READABLE:
				setMinReadable(MIN_READABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__TOLERANCE:
				setTolerance(TOLERANCE_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__IS_LINEAR:
				setIsLinear(IS_LINEAR_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__HYSTERESIS:
				setHysteresis(HYSTERESIS_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_NON_CRITICAL:
				setLowerThresholdNonCritical(LOWER_THRESHOLD_NON_CRITICAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_NON_CRITICAL:
				setUpperThresholdNonCritical(UPPER_THRESHOLD_NON_CRITICAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_CRITICAL:
				setLowerThresholdCritical(LOWER_THRESHOLD_CRITICAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_CRITICAL:
				setUpperThresholdCritical(UPPER_THRESHOLD_CRITICAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_FATAL:
				setLowerThresholdFatal(LOWER_THRESHOLD_FATAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_FATAL:
				setUpperThresholdFatal(UPPER_THRESHOLD_FATAL_EDEFAULT);
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__SUPPORTED_THRESHOLDS:
				getSupportedThresholds().clear();
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__ENABLED_THRESHOLDS:
				getEnabledThresholds().clear();
				return;
			case CimPackage.CIM_NUMERIC_SENSOR__SETTABLE_THRESHOLDS:
				getSettableThresholds().clear();
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
			case CimPackage.CIM_NUMERIC_SENSOR__BASE_UNITS:
				return BASE_UNITS_EDEFAULT == null ? baseUnits != null : !BASE_UNITS_EDEFAULT.equals(baseUnits);
			case CimPackage.CIM_NUMERIC_SENSOR__UNIT_MODIFIER:
				return UNIT_MODIFIER_EDEFAULT == null ? unitModifier != null : !UNIT_MODIFIER_EDEFAULT.equals(unitModifier);
			case CimPackage.CIM_NUMERIC_SENSOR__RATE_UNITS:
				return RATE_UNITS_EDEFAULT == null ? rateUnits != null : !RATE_UNITS_EDEFAULT.equals(rateUnits);
			case CimPackage.CIM_NUMERIC_SENSOR__CURRENT_READING:
				return CURRENT_READING_EDEFAULT == null ? currentReading != null : !CURRENT_READING_EDEFAULT.equals(currentReading);
			case CimPackage.CIM_NUMERIC_SENSOR__NOMINAL_READING:
				return NOMINAL_READING_EDEFAULT == null ? nominalReading != null : !NOMINAL_READING_EDEFAULT.equals(nominalReading);
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MAX:
				return NORMAL_MAX_EDEFAULT == null ? normalMax != null : !NORMAL_MAX_EDEFAULT.equals(normalMax);
			case CimPackage.CIM_NUMERIC_SENSOR__NORMAL_MIN:
				return NORMAL_MIN_EDEFAULT == null ? normalMin != null : !NORMAL_MIN_EDEFAULT.equals(normalMin);
			case CimPackage.CIM_NUMERIC_SENSOR__MAX_READABLE:
				return MAX_READABLE_EDEFAULT == null ? maxReadable != null : !MAX_READABLE_EDEFAULT.equals(maxReadable);
			case CimPackage.CIM_NUMERIC_SENSOR__MIN_READABLE:
				return MIN_READABLE_EDEFAULT == null ? minReadable != null : !MIN_READABLE_EDEFAULT.equals(minReadable);
			case CimPackage.CIM_NUMERIC_SENSOR__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case CimPackage.CIM_NUMERIC_SENSOR__TOLERANCE:
				return TOLERANCE_EDEFAULT == null ? tolerance != null : !TOLERANCE_EDEFAULT.equals(tolerance);
			case CimPackage.CIM_NUMERIC_SENSOR__ACCURACY:
				return ACCURACY_EDEFAULT == null ? accuracy != null : !ACCURACY_EDEFAULT.equals(accuracy);
			case CimPackage.CIM_NUMERIC_SENSOR__IS_LINEAR:
				return IS_LINEAR_EDEFAULT == null ? isLinear != null : !IS_LINEAR_EDEFAULT.equals(isLinear);
			case CimPackage.CIM_NUMERIC_SENSOR__HYSTERESIS:
				return HYSTERESIS_EDEFAULT == null ? hysteresis != null : !HYSTERESIS_EDEFAULT.equals(hysteresis);
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_NON_CRITICAL:
				return LOWER_THRESHOLD_NON_CRITICAL_EDEFAULT == null ? lowerThresholdNonCritical != null : !LOWER_THRESHOLD_NON_CRITICAL_EDEFAULT.equals(lowerThresholdNonCritical);
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_NON_CRITICAL:
				return UPPER_THRESHOLD_NON_CRITICAL_EDEFAULT == null ? upperThresholdNonCritical != null : !UPPER_THRESHOLD_NON_CRITICAL_EDEFAULT.equals(upperThresholdNonCritical);
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_CRITICAL:
				return LOWER_THRESHOLD_CRITICAL_EDEFAULT == null ? lowerThresholdCritical != null : !LOWER_THRESHOLD_CRITICAL_EDEFAULT.equals(lowerThresholdCritical);
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_CRITICAL:
				return UPPER_THRESHOLD_CRITICAL_EDEFAULT == null ? upperThresholdCritical != null : !UPPER_THRESHOLD_CRITICAL_EDEFAULT.equals(upperThresholdCritical);
			case CimPackage.CIM_NUMERIC_SENSOR__LOWER_THRESHOLD_FATAL:
				return LOWER_THRESHOLD_FATAL_EDEFAULT == null ? lowerThresholdFatal != null : !LOWER_THRESHOLD_FATAL_EDEFAULT.equals(lowerThresholdFatal);
			case CimPackage.CIM_NUMERIC_SENSOR__UPPER_THRESHOLD_FATAL:
				return UPPER_THRESHOLD_FATAL_EDEFAULT == null ? upperThresholdFatal != null : !UPPER_THRESHOLD_FATAL_EDEFAULT.equals(upperThresholdFatal);
			case CimPackage.CIM_NUMERIC_SENSOR__SUPPORTED_THRESHOLDS:
				return supportedThresholds != null && !supportedThresholds.isEmpty();
			case CimPackage.CIM_NUMERIC_SENSOR__ENABLED_THRESHOLDS:
				return enabledThresholds != null && !enabledThresholds.isEmpty();
			case CimPackage.CIM_NUMERIC_SENSOR__SETTABLE_THRESHOLDS:
				return settableThresholds != null && !settableThresholds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_NUMERIC_SENSOR___RESTORE_DEFAULT_THRESHOLDS:
				return RestoreDefaultThresholds();
			case CimPackage.CIM_NUMERIC_SENSOR___GET_NON_LINEAR_FACTORS__INTEGER_INTEGER_LONG_INTEGER_LONG:
				return GetNonLinearFactors((Integer)arguments.get(0), (Integer)arguments.get(1), (Long)arguments.get(2), (Integer)arguments.get(3), (Long)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (BaseUnits: ");
		result.append(baseUnits);
		result.append(", UnitModifier: ");
		result.append(unitModifier);
		result.append(", RateUnits: ");
		result.append(rateUnits);
		result.append(", CurrentReading: ");
		result.append(currentReading);
		result.append(", NominalReading: ");
		result.append(nominalReading);
		result.append(", NormalMax: ");
		result.append(normalMax);
		result.append(", NormalMin: ");
		result.append(normalMin);
		result.append(", MaxReadable: ");
		result.append(maxReadable);
		result.append(", MinReadable: ");
		result.append(minReadable);
		result.append(", Resolution: ");
		result.append(resolution);
		result.append(", Tolerance: ");
		result.append(tolerance);
		result.append(", Accuracy: ");
		result.append(accuracy);
		result.append(", IsLinear: ");
		result.append(isLinear);
		result.append(", Hysteresis: ");
		result.append(hysteresis);
		result.append(", LowerThresholdNonCritical: ");
		result.append(lowerThresholdNonCritical);
		result.append(", UpperThresholdNonCritical: ");
		result.append(upperThresholdNonCritical);
		result.append(", LowerThresholdCritical: ");
		result.append(lowerThresholdCritical);
		result.append(", UpperThresholdCritical: ");
		result.append(upperThresholdCritical);
		result.append(", LowerThresholdFatal: ");
		result.append(lowerThresholdFatal);
		result.append(", UpperThresholdFatal: ");
		result.append(upperThresholdFatal);
		result.append(", SupportedThresholds: ");
		result.append(supportedThresholds);
		result.append(", EnabledThresholds: ");
		result.append(enabledThresholds);
		result.append(", SettableThresholds: ");
		result.append(settableThresholds);
		result.append(')');
		return result.toString();
	}

} //CIM_NumericSensorImpl
