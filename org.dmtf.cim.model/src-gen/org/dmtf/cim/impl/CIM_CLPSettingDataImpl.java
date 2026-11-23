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

import org.dmtf.cim.CIM_CLPSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CLP Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getCurrentDefaultTarget <em>Current Default Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getKeepTime <em>Keep Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getWaitBehavior <em>Wait Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputVerbosity <em>Output Verbosity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputLanguage <em>Output Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputPosition <em>Output Position</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputOrder <em>Output Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getOutputCount <em>Output Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CLPSettingDataImpl#getDisplayOption <em>Display Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CLPSettingDataImpl extends CIM_SettingDataImpl implements CIM_CLPSettingData {
	/**
	 * The default value of the '{@link #getCurrentDefaultTarget() <em>Current Default Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDefaultTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_DEFAULT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDefaultTarget() <em>Current Default Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDefaultTarget()
	 * @generated
	 * @ordered
	 */
	protected String currentDefaultTarget = CURRENT_DEFAULT_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepTime() <em>Keep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEEP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeepTime() <em>Keep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTime()
	 * @generated
	 * @ordered
	 */
	protected Integer keepTime = KEEP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitBehavior() <em>Wait Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WAIT_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitBehavior() <em>Wait Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitBehavior()
	 * @generated
	 * @ordered
	 */
	protected Boolean waitBehavior = WAIT_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputVerbosity() <em>Output Verbosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVerbosity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_VERBOSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputVerbosity() <em>Output Verbosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVerbosity()
	 * @generated
	 * @ordered
	 */
	protected Integer outputVerbosity = OUTPUT_VERBOSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLanguage() <em>Output Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLanguage() <em>Output Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLanguage()
	 * @generated
	 * @ordered
	 */
	protected String outputLanguage = OUTPUT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputPosition() <em>Output Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPosition() <em>Output Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer outputPosition = OUTPUT_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputOrder() <em>Output Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputOrder() <em>Output Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer outputOrder = OUTPUT_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputCount() <em>Output Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUTPUT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputCount() <em>Output Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCount()
	 * @generated
	 * @ordered
	 */
	protected Long outputCount = OUTPUT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected String displayOption = DISPLAY_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CLPSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CLPSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentDefaultTarget() {
		return currentDefaultTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentDefaultTarget(String newCurrentDefaultTarget) {
		String oldCurrentDefaultTarget = currentDefaultTarget;
		currentDefaultTarget = newCurrentDefaultTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET, oldCurrentDefaultTarget, currentDefaultTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKeepTime() {
		return keepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepTime(Integer newKeepTime) {
		Integer oldKeepTime = keepTime;
		keepTime = newKeepTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__KEEP_TIME, oldKeepTime, keepTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWaitBehavior() {
		return waitBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitBehavior(Boolean newWaitBehavior) {
		Boolean oldWaitBehavior = waitBehavior;
		waitBehavior = newWaitBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__WAIT_BEHAVIOR, oldWaitBehavior, waitBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputFormat(Integer newOutputFormat) {
		Integer oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_FORMAT, oldOutputFormat, outputFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOutputVerbosity() {
		return outputVerbosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputVerbosity(Integer newOutputVerbosity) {
		Integer oldOutputVerbosity = outputVerbosity;
		outputVerbosity = newOutputVerbosity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_VERBOSITY, oldOutputVerbosity, outputVerbosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputLanguage() {
		return outputLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputLanguage(String newOutputLanguage) {
		String oldOutputLanguage = outputLanguage;
		outputLanguage = newOutputLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_LANGUAGE, oldOutputLanguage, outputLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOutputPosition() {
		return outputPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPosition(Integer newOutputPosition) {
		Integer oldOutputPosition = outputPosition;
		outputPosition = newOutputPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_POSITION, oldOutputPosition, outputPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOutputOrder() {
		return outputOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputOrder(Integer newOutputOrder) {
		Integer oldOutputOrder = outputOrder;
		outputOrder = newOutputOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_ORDER, oldOutputOrder, outputOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutputCount() {
		return outputCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputCount(Long newOutputCount) {
		Long oldOutputCount = outputCount;
		outputCount = newOutputCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_COUNT, oldOutputCount, outputCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayOption() {
		return displayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayOption(String newDisplayOption) {
		String oldDisplayOption = displayOption;
		displayOption = newDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLP_SETTING_DATA__DISPLAY_OPTION, oldDisplayOption, displayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				return getCurrentDefaultTarget();
			case CimPackage.CIM_CLP_SETTING_DATA__KEEP_TIME:
				return getKeepTime();
			case CimPackage.CIM_CLP_SETTING_DATA__WAIT_BEHAVIOR:
				return getWaitBehavior();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_FORMAT:
				return getOutputFormat();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				return getOutputVerbosity();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				return getOutputLanguage();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_POSITION:
				return getOutputPosition();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_ORDER:
				return getOutputOrder();
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_COUNT:
				return getOutputCount();
			case CimPackage.CIM_CLP_SETTING_DATA__DISPLAY_OPTION:
				return getDisplayOption();
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
			case CimPackage.CIM_CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				setCurrentDefaultTarget((String)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__KEEP_TIME:
				setKeepTime((Integer)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__WAIT_BEHAVIOR:
				setWaitBehavior((Boolean)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_FORMAT:
				setOutputFormat((Integer)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				setOutputVerbosity((Integer)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				setOutputLanguage((String)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_POSITION:
				setOutputPosition((Integer)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_ORDER:
				setOutputOrder((Integer)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_COUNT:
				setOutputCount((Long)newValue);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__DISPLAY_OPTION:
				setDisplayOption((String)newValue);
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
			case CimPackage.CIM_CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				setCurrentDefaultTarget(CURRENT_DEFAULT_TARGET_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__KEEP_TIME:
				setKeepTime(KEEP_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__WAIT_BEHAVIOR:
				setWaitBehavior(WAIT_BEHAVIOR_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_FORMAT:
				setOutputFormat(OUTPUT_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				setOutputVerbosity(OUTPUT_VERBOSITY_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				setOutputLanguage(OUTPUT_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_POSITION:
				setOutputPosition(OUTPUT_POSITION_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_ORDER:
				setOutputOrder(OUTPUT_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_COUNT:
				setOutputCount(OUTPUT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_CLP_SETTING_DATA__DISPLAY_OPTION:
				setDisplayOption(DISPLAY_OPTION_EDEFAULT);
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
			case CimPackage.CIM_CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				return CURRENT_DEFAULT_TARGET_EDEFAULT == null ? currentDefaultTarget != null : !CURRENT_DEFAULT_TARGET_EDEFAULT.equals(currentDefaultTarget);
			case CimPackage.CIM_CLP_SETTING_DATA__KEEP_TIME:
				return KEEP_TIME_EDEFAULT == null ? keepTime != null : !KEEP_TIME_EDEFAULT.equals(keepTime);
			case CimPackage.CIM_CLP_SETTING_DATA__WAIT_BEHAVIOR:
				return WAIT_BEHAVIOR_EDEFAULT == null ? waitBehavior != null : !WAIT_BEHAVIOR_EDEFAULT.equals(waitBehavior);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_FORMAT:
				return OUTPUT_FORMAT_EDEFAULT == null ? outputFormat != null : !OUTPUT_FORMAT_EDEFAULT.equals(outputFormat);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				return OUTPUT_VERBOSITY_EDEFAULT == null ? outputVerbosity != null : !OUTPUT_VERBOSITY_EDEFAULT.equals(outputVerbosity);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				return OUTPUT_LANGUAGE_EDEFAULT == null ? outputLanguage != null : !OUTPUT_LANGUAGE_EDEFAULT.equals(outputLanguage);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_POSITION:
				return OUTPUT_POSITION_EDEFAULT == null ? outputPosition != null : !OUTPUT_POSITION_EDEFAULT.equals(outputPosition);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_ORDER:
				return OUTPUT_ORDER_EDEFAULT == null ? outputOrder != null : !OUTPUT_ORDER_EDEFAULT.equals(outputOrder);
			case CimPackage.CIM_CLP_SETTING_DATA__OUTPUT_COUNT:
				return OUTPUT_COUNT_EDEFAULT == null ? outputCount != null : !OUTPUT_COUNT_EDEFAULT.equals(outputCount);
			case CimPackage.CIM_CLP_SETTING_DATA__DISPLAY_OPTION:
				return DISPLAY_OPTION_EDEFAULT == null ? displayOption != null : !DISPLAY_OPTION_EDEFAULT.equals(displayOption);
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
		result.append(" (CurrentDefaultTarget: ");
		result.append(currentDefaultTarget);
		result.append(", KeepTime: ");
		result.append(keepTime);
		result.append(", WaitBehavior: ");
		result.append(waitBehavior);
		result.append(", OutputFormat: ");
		result.append(outputFormat);
		result.append(", OutputVerbosity: ");
		result.append(outputVerbosity);
		result.append(", OutputLanguage: ");
		result.append(outputLanguage);
		result.append(", OutputPosition: ");
		result.append(outputPosition);
		result.append(", OutputOrder: ");
		result.append(outputOrder);
		result.append(", OutputCount: ");
		result.append(outputCount);
		result.append(", DisplayOption: ");
		result.append(displayOption);
		result.append(')');
		return result.toString();
	}

} //CIM_CLPSettingDataImpl
