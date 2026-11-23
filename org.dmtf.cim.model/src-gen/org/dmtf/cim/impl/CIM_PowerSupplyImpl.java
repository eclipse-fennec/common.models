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

import java.util.Collection;

import org.dmtf.cim.CIM_PowerSupply;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getIsSwitchingSupply <em>Is Switching Supply</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1InputVoltageLow <em>Range1 Input Voltage Low</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1InputVoltageHigh <em>Range1 Input Voltage High</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1InputFrequencyLow <em>Range1 Input Frequency Low</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1InputFrequencyHigh <em>Range1 Input Frequency High</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2InputVoltageLow <em>Range2 Input Voltage Low</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2InputVoltageHigh <em>Range2 Input Voltage High</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2InputFrequencyLow <em>Range2 Input Frequency Low</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2InputFrequencyHigh <em>Range2 Input Frequency High</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getActiveInputVoltage <em>Active Input Voltage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getTypeOfRangeSwitching <em>Type Of Range Switching</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getTotalOutputPower <em>Total Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getInputPowerUnits <em>Input Power Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getIsACInput <em>Is AC Input</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getNominalPhaseWiring <em>Nominal Phase Wiring</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getNumberOfPhasesUtilized <em>Number Of Phases Utilized</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1MaxInputPower <em>Range1 Max Input Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange1MaxOutputPower <em>Range1 Max Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2MaxInputPower <em>Range2 Max Input Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSupplyImpl#getRange2MaxOutputPower <em>Range2 Max Output Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerSupplyImpl extends CIM_PowerSourceImpl implements CIM_PowerSupply {
	/**
	 * The default value of the '{@link #getIsSwitchingSupply() <em>Is Switching Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSwitchingSupply()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SWITCHING_SUPPLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSwitchingSupply() <em>Is Switching Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSwitchingSupply()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSwitchingSupply = IS_SWITCHING_SUPPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1InputVoltageLow() <em>Range1 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputVoltageLow()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_INPUT_VOLTAGE_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1InputVoltageLow() <em>Range1 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputVoltageLow()
	 * @generated
	 * @ordered
	 */
	protected Long range1InputVoltageLow = RANGE1_INPUT_VOLTAGE_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1InputVoltageHigh() <em>Range1 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputVoltageHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_INPUT_VOLTAGE_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1InputVoltageHigh() <em>Range1 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputVoltageHigh()
	 * @generated
	 * @ordered
	 */
	protected Long range1InputVoltageHigh = RANGE1_INPUT_VOLTAGE_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1InputFrequencyLow() <em>Range1 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputFrequencyLow()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_INPUT_FREQUENCY_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1InputFrequencyLow() <em>Range1 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputFrequencyLow()
	 * @generated
	 * @ordered
	 */
	protected Long range1InputFrequencyLow = RANGE1_INPUT_FREQUENCY_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1InputFrequencyHigh() <em>Range1 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputFrequencyHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_INPUT_FREQUENCY_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1InputFrequencyHigh() <em>Range1 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1InputFrequencyHigh()
	 * @generated
	 * @ordered
	 */
	protected Long range1InputFrequencyHigh = RANGE1_INPUT_FREQUENCY_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2InputVoltageLow() <em>Range2 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputVoltageLow()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_INPUT_VOLTAGE_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2InputVoltageLow() <em>Range2 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputVoltageLow()
	 * @generated
	 * @ordered
	 */
	protected Long range2InputVoltageLow = RANGE2_INPUT_VOLTAGE_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2InputVoltageHigh() <em>Range2 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputVoltageHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_INPUT_VOLTAGE_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2InputVoltageHigh() <em>Range2 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputVoltageHigh()
	 * @generated
	 * @ordered
	 */
	protected Long range2InputVoltageHigh = RANGE2_INPUT_VOLTAGE_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2InputFrequencyLow() <em>Range2 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputFrequencyLow()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_INPUT_FREQUENCY_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2InputFrequencyLow() <em>Range2 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputFrequencyLow()
	 * @generated
	 * @ordered
	 */
	protected Long range2InputFrequencyLow = RANGE2_INPUT_FREQUENCY_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2InputFrequencyHigh() <em>Range2 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputFrequencyHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_INPUT_FREQUENCY_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2InputFrequencyHigh() <em>Range2 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2InputFrequencyHigh()
	 * @generated
	 * @ordered
	 */
	protected Long range2InputFrequencyHigh = RANGE2_INPUT_FREQUENCY_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveInputVoltage() <em>Active Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVE_INPUT_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveInputVoltage() <em>Active Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected Integer activeInputVoltage = ACTIVE_INPUT_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfRangeSwitching() <em>Type Of Range Switching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRangeSwitching()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_RANGE_SWITCHING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfRangeSwitching() <em>Type Of Range Switching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRangeSwitching()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfRangeSwitching = TYPE_OF_RANGE_SWITCHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected Long totalOutputPower = TOTAL_OUTPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputPowerUnits() <em>Input Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_POWER_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputPowerUnits() <em>Input Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected String inputPowerUnits = INPUT_POWER_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsACInput() <em>Is AC Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsACInput()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_AC_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsACInput() <em>Is AC Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsACInput()
	 * @generated
	 * @ordered
	 */
	protected Boolean isACInput = IS_AC_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNominalPhaseWiring() <em>Nominal Phase Wiring</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalPhaseWiring()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> nominalPhaseWiring;

	/**
	 * The default value of the '{@link #getNumberOfPhasesUtilized() <em>Number Of Phases Utilized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPhasesUtilized()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_PHASES_UTILIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPhasesUtilized() <em>Number Of Phases Utilized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPhasesUtilized()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfPhasesUtilized = NUMBER_OF_PHASES_UTILIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1MaxInputPower() <em>Range1 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1MaxInputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_MAX_INPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1MaxInputPower() <em>Range1 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1MaxInputPower()
	 * @generated
	 * @ordered
	 */
	protected Long range1MaxInputPower = RANGE1_MAX_INPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange1MaxOutputPower() <em>Range1 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1MaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE1_MAX_OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange1MaxOutputPower() <em>Range1 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange1MaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected Long range1MaxOutputPower = RANGE1_MAX_OUTPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2MaxInputPower() <em>Range2 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2MaxInputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_MAX_INPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2MaxInputPower() <em>Range2 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2MaxInputPower()
	 * @generated
	 * @ordered
	 */
	protected Long range2MaxInputPower = RANGE2_MAX_INPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange2MaxOutputPower() <em>Range2 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2MaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long RANGE2_MAX_OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange2MaxOutputPower() <em>Range2 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange2MaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected Long range2MaxOutputPower = RANGE2_MAX_OUTPUT_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSwitchingSupply() {
		return isSwitchingSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSwitchingSupply(Boolean newIsSwitchingSupply) {
		Boolean oldIsSwitchingSupply = isSwitchingSupply;
		isSwitchingSupply = newIsSwitchingSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__IS_SWITCHING_SUPPLY, oldIsSwitchingSupply, isSwitchingSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1InputVoltageLow() {
		return range1InputVoltageLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1InputVoltageLow(Long newRange1InputVoltageLow) {
		Long oldRange1InputVoltageLow = range1InputVoltageLow;
		range1InputVoltageLow = newRange1InputVoltageLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_LOW, oldRange1InputVoltageLow, range1InputVoltageLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1InputVoltageHigh() {
		return range1InputVoltageHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1InputVoltageHigh(Long newRange1InputVoltageHigh) {
		Long oldRange1InputVoltageHigh = range1InputVoltageHigh;
		range1InputVoltageHigh = newRange1InputVoltageHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_HIGH, oldRange1InputVoltageHigh, range1InputVoltageHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1InputFrequencyLow() {
		return range1InputFrequencyLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1InputFrequencyLow(Long newRange1InputFrequencyLow) {
		Long oldRange1InputFrequencyLow = range1InputFrequencyLow;
		range1InputFrequencyLow = newRange1InputFrequencyLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_LOW, oldRange1InputFrequencyLow, range1InputFrequencyLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1InputFrequencyHigh() {
		return range1InputFrequencyHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1InputFrequencyHigh(Long newRange1InputFrequencyHigh) {
		Long oldRange1InputFrequencyHigh = range1InputFrequencyHigh;
		range1InputFrequencyHigh = newRange1InputFrequencyHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_HIGH, oldRange1InputFrequencyHigh, range1InputFrequencyHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2InputVoltageLow() {
		return range2InputVoltageLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2InputVoltageLow(Long newRange2InputVoltageLow) {
		Long oldRange2InputVoltageLow = range2InputVoltageLow;
		range2InputVoltageLow = newRange2InputVoltageLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_LOW, oldRange2InputVoltageLow, range2InputVoltageLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2InputVoltageHigh() {
		return range2InputVoltageHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2InputVoltageHigh(Long newRange2InputVoltageHigh) {
		Long oldRange2InputVoltageHigh = range2InputVoltageHigh;
		range2InputVoltageHigh = newRange2InputVoltageHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_HIGH, oldRange2InputVoltageHigh, range2InputVoltageHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2InputFrequencyLow() {
		return range2InputFrequencyLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2InputFrequencyLow(Long newRange2InputFrequencyLow) {
		Long oldRange2InputFrequencyLow = range2InputFrequencyLow;
		range2InputFrequencyLow = newRange2InputFrequencyLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_LOW, oldRange2InputFrequencyLow, range2InputFrequencyLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2InputFrequencyHigh() {
		return range2InputFrequencyHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2InputFrequencyHigh(Long newRange2InputFrequencyHigh) {
		Long oldRange2InputFrequencyHigh = range2InputFrequencyHigh;
		range2InputFrequencyHigh = newRange2InputFrequencyHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_HIGH, oldRange2InputFrequencyHigh, range2InputFrequencyHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActiveInputVoltage() {
		return activeInputVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveInputVoltage(Integer newActiveInputVoltage) {
		Integer oldActiveInputVoltage = activeInputVoltage;
		activeInputVoltage = newActiveInputVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__ACTIVE_INPUT_VOLTAGE, oldActiveInputVoltage, activeInputVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfRangeSwitching() {
		return typeOfRangeSwitching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfRangeSwitching(Integer newTypeOfRangeSwitching) {
		Integer oldTypeOfRangeSwitching = typeOfRangeSwitching;
		typeOfRangeSwitching = newTypeOfRangeSwitching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__TYPE_OF_RANGE_SWITCHING, oldTypeOfRangeSwitching, typeOfRangeSwitching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalOutputPower() {
		return totalOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalOutputPower(Long newTotalOutputPower) {
		Long oldTotalOutputPower = totalOutputPower;
		totalOutputPower = newTotalOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__TOTAL_OUTPUT_POWER, oldTotalOutputPower, totalOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputPowerUnits() {
		return inputPowerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputPowerUnits(String newInputPowerUnits) {
		String oldInputPowerUnits = inputPowerUnits;
		inputPowerUnits = newInputPowerUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__INPUT_POWER_UNITS, oldInputPowerUnits, inputPowerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsACInput() {
		return isACInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsACInput(Boolean newIsACInput) {
		Boolean oldIsACInput = isACInput;
		isACInput = newIsACInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__IS_AC_INPUT, oldIsACInput, isACInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getNominalPhaseWiring() {
		if (nominalPhaseWiring == null) {
			nominalPhaseWiring = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_POWER_SUPPLY__NOMINAL_PHASE_WIRING);
		}
		return nominalPhaseWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfPhasesUtilized() {
		return numberOfPhasesUtilized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPhasesUtilized(Long newNumberOfPhasesUtilized) {
		Long oldNumberOfPhasesUtilized = numberOfPhasesUtilized;
		numberOfPhasesUtilized = newNumberOfPhasesUtilized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__NUMBER_OF_PHASES_UTILIZED, oldNumberOfPhasesUtilized, numberOfPhasesUtilized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1MaxInputPower() {
		return range1MaxInputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1MaxInputPower(Long newRange1MaxInputPower) {
		Long oldRange1MaxInputPower = range1MaxInputPower;
		range1MaxInputPower = newRange1MaxInputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_INPUT_POWER, oldRange1MaxInputPower, range1MaxInputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange1MaxOutputPower() {
		return range1MaxOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange1MaxOutputPower(Long newRange1MaxOutputPower) {
		Long oldRange1MaxOutputPower = range1MaxOutputPower;
		range1MaxOutputPower = newRange1MaxOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_OUTPUT_POWER, oldRange1MaxOutputPower, range1MaxOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2MaxInputPower() {
		return range2MaxInputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2MaxInputPower(Long newRange2MaxInputPower) {
		Long oldRange2MaxInputPower = range2MaxInputPower;
		range2MaxInputPower = newRange2MaxInputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_INPUT_POWER, oldRange2MaxInputPower, range2MaxInputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRange2MaxOutputPower() {
		return range2MaxOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange2MaxOutputPower(Long newRange2MaxOutputPower) {
		Long oldRange2MaxOutputPower = range2MaxOutputPower;
		range2MaxOutputPower = newRange2MaxOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_OUTPUT_POWER, oldRange2MaxOutputPower, range2MaxOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWER_SUPPLY__IS_SWITCHING_SUPPLY:
				return getIsSwitchingSupply();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_LOW:
				return getRange1InputVoltageLow();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_HIGH:
				return getRange1InputVoltageHigh();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_LOW:
				return getRange1InputFrequencyLow();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_HIGH:
				return getRange1InputFrequencyHigh();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_LOW:
				return getRange2InputVoltageLow();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_HIGH:
				return getRange2InputVoltageHigh();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_LOW:
				return getRange2InputFrequencyLow();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_HIGH:
				return getRange2InputFrequencyHigh();
			case CimPackage.CIM_POWER_SUPPLY__ACTIVE_INPUT_VOLTAGE:
				return getActiveInputVoltage();
			case CimPackage.CIM_POWER_SUPPLY__TYPE_OF_RANGE_SWITCHING:
				return getTypeOfRangeSwitching();
			case CimPackage.CIM_POWER_SUPPLY__TOTAL_OUTPUT_POWER:
				return getTotalOutputPower();
			case CimPackage.CIM_POWER_SUPPLY__INPUT_POWER_UNITS:
				return getInputPowerUnits();
			case CimPackage.CIM_POWER_SUPPLY__IS_AC_INPUT:
				return getIsACInput();
			case CimPackage.CIM_POWER_SUPPLY__NOMINAL_PHASE_WIRING:
				return getNominalPhaseWiring();
			case CimPackage.CIM_POWER_SUPPLY__NUMBER_OF_PHASES_UTILIZED:
				return getNumberOfPhasesUtilized();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_INPUT_POWER:
				return getRange1MaxInputPower();
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_OUTPUT_POWER:
				return getRange1MaxOutputPower();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_INPUT_POWER:
				return getRange2MaxInputPower();
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_OUTPUT_POWER:
				return getRange2MaxOutputPower();
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
			case CimPackage.CIM_POWER_SUPPLY__IS_SWITCHING_SUPPLY:
				setIsSwitchingSupply((Boolean)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_LOW:
				setRange1InputVoltageLow((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_HIGH:
				setRange1InputVoltageHigh((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_LOW:
				setRange1InputFrequencyLow((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_HIGH:
				setRange1InputFrequencyHigh((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_LOW:
				setRange2InputVoltageLow((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_HIGH:
				setRange2InputVoltageHigh((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_LOW:
				setRange2InputFrequencyLow((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_HIGH:
				setRange2InputFrequencyHigh((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__ACTIVE_INPUT_VOLTAGE:
				setActiveInputVoltage((Integer)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__TYPE_OF_RANGE_SWITCHING:
				setTypeOfRangeSwitching((Integer)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__TOTAL_OUTPUT_POWER:
				setTotalOutputPower((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__INPUT_POWER_UNITS:
				setInputPowerUnits((String)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__IS_AC_INPUT:
				setIsACInput((Boolean)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__NOMINAL_PHASE_WIRING:
				getNominalPhaseWiring().clear();
				getNominalPhaseWiring().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__NUMBER_OF_PHASES_UTILIZED:
				setNumberOfPhasesUtilized((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_INPUT_POWER:
				setRange1MaxInputPower((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_OUTPUT_POWER:
				setRange1MaxOutputPower((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_INPUT_POWER:
				setRange2MaxInputPower((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_OUTPUT_POWER:
				setRange2MaxOutputPower((Long)newValue);
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
			case CimPackage.CIM_POWER_SUPPLY__IS_SWITCHING_SUPPLY:
				setIsSwitchingSupply(IS_SWITCHING_SUPPLY_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_LOW:
				setRange1InputVoltageLow(RANGE1_INPUT_VOLTAGE_LOW_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_HIGH:
				setRange1InputVoltageHigh(RANGE1_INPUT_VOLTAGE_HIGH_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_LOW:
				setRange1InputFrequencyLow(RANGE1_INPUT_FREQUENCY_LOW_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_HIGH:
				setRange1InputFrequencyHigh(RANGE1_INPUT_FREQUENCY_HIGH_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_LOW:
				setRange2InputVoltageLow(RANGE2_INPUT_VOLTAGE_LOW_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_HIGH:
				setRange2InputVoltageHigh(RANGE2_INPUT_VOLTAGE_HIGH_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_LOW:
				setRange2InputFrequencyLow(RANGE2_INPUT_FREQUENCY_LOW_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_HIGH:
				setRange2InputFrequencyHigh(RANGE2_INPUT_FREQUENCY_HIGH_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__ACTIVE_INPUT_VOLTAGE:
				setActiveInputVoltage(ACTIVE_INPUT_VOLTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__TYPE_OF_RANGE_SWITCHING:
				setTypeOfRangeSwitching(TYPE_OF_RANGE_SWITCHING_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__TOTAL_OUTPUT_POWER:
				setTotalOutputPower(TOTAL_OUTPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__INPUT_POWER_UNITS:
				setInputPowerUnits(INPUT_POWER_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__IS_AC_INPUT:
				setIsACInput(IS_AC_INPUT_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__NOMINAL_PHASE_WIRING:
				getNominalPhaseWiring().clear();
				return;
			case CimPackage.CIM_POWER_SUPPLY__NUMBER_OF_PHASES_UTILIZED:
				setNumberOfPhasesUtilized(NUMBER_OF_PHASES_UTILIZED_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_INPUT_POWER:
				setRange1MaxInputPower(RANGE1_MAX_INPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_OUTPUT_POWER:
				setRange1MaxOutputPower(RANGE1_MAX_OUTPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_INPUT_POWER:
				setRange2MaxInputPower(RANGE2_MAX_INPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_OUTPUT_POWER:
				setRange2MaxOutputPower(RANGE2_MAX_OUTPUT_POWER_EDEFAULT);
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
			case CimPackage.CIM_POWER_SUPPLY__IS_SWITCHING_SUPPLY:
				return IS_SWITCHING_SUPPLY_EDEFAULT == null ? isSwitchingSupply != null : !IS_SWITCHING_SUPPLY_EDEFAULT.equals(isSwitchingSupply);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_LOW:
				return RANGE1_INPUT_VOLTAGE_LOW_EDEFAULT == null ? range1InputVoltageLow != null : !RANGE1_INPUT_VOLTAGE_LOW_EDEFAULT.equals(range1InputVoltageLow);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_VOLTAGE_HIGH:
				return RANGE1_INPUT_VOLTAGE_HIGH_EDEFAULT == null ? range1InputVoltageHigh != null : !RANGE1_INPUT_VOLTAGE_HIGH_EDEFAULT.equals(range1InputVoltageHigh);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_LOW:
				return RANGE1_INPUT_FREQUENCY_LOW_EDEFAULT == null ? range1InputFrequencyLow != null : !RANGE1_INPUT_FREQUENCY_LOW_EDEFAULT.equals(range1InputFrequencyLow);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_INPUT_FREQUENCY_HIGH:
				return RANGE1_INPUT_FREQUENCY_HIGH_EDEFAULT == null ? range1InputFrequencyHigh != null : !RANGE1_INPUT_FREQUENCY_HIGH_EDEFAULT.equals(range1InputFrequencyHigh);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_LOW:
				return RANGE2_INPUT_VOLTAGE_LOW_EDEFAULT == null ? range2InputVoltageLow != null : !RANGE2_INPUT_VOLTAGE_LOW_EDEFAULT.equals(range2InputVoltageLow);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_VOLTAGE_HIGH:
				return RANGE2_INPUT_VOLTAGE_HIGH_EDEFAULT == null ? range2InputVoltageHigh != null : !RANGE2_INPUT_VOLTAGE_HIGH_EDEFAULT.equals(range2InputVoltageHigh);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_LOW:
				return RANGE2_INPUT_FREQUENCY_LOW_EDEFAULT == null ? range2InputFrequencyLow != null : !RANGE2_INPUT_FREQUENCY_LOW_EDEFAULT.equals(range2InputFrequencyLow);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_INPUT_FREQUENCY_HIGH:
				return RANGE2_INPUT_FREQUENCY_HIGH_EDEFAULT == null ? range2InputFrequencyHigh != null : !RANGE2_INPUT_FREQUENCY_HIGH_EDEFAULT.equals(range2InputFrequencyHigh);
			case CimPackage.CIM_POWER_SUPPLY__ACTIVE_INPUT_VOLTAGE:
				return ACTIVE_INPUT_VOLTAGE_EDEFAULT == null ? activeInputVoltage != null : !ACTIVE_INPUT_VOLTAGE_EDEFAULT.equals(activeInputVoltage);
			case CimPackage.CIM_POWER_SUPPLY__TYPE_OF_RANGE_SWITCHING:
				return TYPE_OF_RANGE_SWITCHING_EDEFAULT == null ? typeOfRangeSwitching != null : !TYPE_OF_RANGE_SWITCHING_EDEFAULT.equals(typeOfRangeSwitching);
			case CimPackage.CIM_POWER_SUPPLY__TOTAL_OUTPUT_POWER:
				return TOTAL_OUTPUT_POWER_EDEFAULT == null ? totalOutputPower != null : !TOTAL_OUTPUT_POWER_EDEFAULT.equals(totalOutputPower);
			case CimPackage.CIM_POWER_SUPPLY__INPUT_POWER_UNITS:
				return INPUT_POWER_UNITS_EDEFAULT == null ? inputPowerUnits != null : !INPUT_POWER_UNITS_EDEFAULT.equals(inputPowerUnits);
			case CimPackage.CIM_POWER_SUPPLY__IS_AC_INPUT:
				return IS_AC_INPUT_EDEFAULT == null ? isACInput != null : !IS_AC_INPUT_EDEFAULT.equals(isACInput);
			case CimPackage.CIM_POWER_SUPPLY__NOMINAL_PHASE_WIRING:
				return nominalPhaseWiring != null && !nominalPhaseWiring.isEmpty();
			case CimPackage.CIM_POWER_SUPPLY__NUMBER_OF_PHASES_UTILIZED:
				return NUMBER_OF_PHASES_UTILIZED_EDEFAULT == null ? numberOfPhasesUtilized != null : !NUMBER_OF_PHASES_UTILIZED_EDEFAULT.equals(numberOfPhasesUtilized);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_INPUT_POWER:
				return RANGE1_MAX_INPUT_POWER_EDEFAULT == null ? range1MaxInputPower != null : !RANGE1_MAX_INPUT_POWER_EDEFAULT.equals(range1MaxInputPower);
			case CimPackage.CIM_POWER_SUPPLY__RANGE1_MAX_OUTPUT_POWER:
				return RANGE1_MAX_OUTPUT_POWER_EDEFAULT == null ? range1MaxOutputPower != null : !RANGE1_MAX_OUTPUT_POWER_EDEFAULT.equals(range1MaxOutputPower);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_INPUT_POWER:
				return RANGE2_MAX_INPUT_POWER_EDEFAULT == null ? range2MaxInputPower != null : !RANGE2_MAX_INPUT_POWER_EDEFAULT.equals(range2MaxInputPower);
			case CimPackage.CIM_POWER_SUPPLY__RANGE2_MAX_OUTPUT_POWER:
				return RANGE2_MAX_OUTPUT_POWER_EDEFAULT == null ? range2MaxOutputPower != null : !RANGE2_MAX_OUTPUT_POWER_EDEFAULT.equals(range2MaxOutputPower);
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
		result.append(" (IsSwitchingSupply: ");
		result.append(isSwitchingSupply);
		result.append(", Range1InputVoltageLow: ");
		result.append(range1InputVoltageLow);
		result.append(", Range1InputVoltageHigh: ");
		result.append(range1InputVoltageHigh);
		result.append(", Range1InputFrequencyLow: ");
		result.append(range1InputFrequencyLow);
		result.append(", Range1InputFrequencyHigh: ");
		result.append(range1InputFrequencyHigh);
		result.append(", Range2InputVoltageLow: ");
		result.append(range2InputVoltageLow);
		result.append(", Range2InputVoltageHigh: ");
		result.append(range2InputVoltageHigh);
		result.append(", Range2InputFrequencyLow: ");
		result.append(range2InputFrequencyLow);
		result.append(", Range2InputFrequencyHigh: ");
		result.append(range2InputFrequencyHigh);
		result.append(", ActiveInputVoltage: ");
		result.append(activeInputVoltage);
		result.append(", TypeOfRangeSwitching: ");
		result.append(typeOfRangeSwitching);
		result.append(", TotalOutputPower: ");
		result.append(totalOutputPower);
		result.append(", InputPowerUnits: ");
		result.append(inputPowerUnits);
		result.append(", IsACInput: ");
		result.append(isACInput);
		result.append(", NominalPhaseWiring: ");
		result.append(nominalPhaseWiring);
		result.append(", NumberOfPhasesUtilized: ");
		result.append(numberOfPhasesUtilized);
		result.append(", Range1MaxInputPower: ");
		result.append(range1MaxInputPower);
		result.append(", Range1MaxOutputPower: ");
		result.append(range1MaxOutputPower);
		result.append(", Range2MaxInputPower: ");
		result.append(range2MaxInputPower);
		result.append(", Range2MaxOutputPower: ");
		result.append(range2MaxOutputPower);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerSupplyImpl
