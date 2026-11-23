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

import org.dmtf.cim.CIM_IndicatorLED;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indicator LED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getIndicatedConditions <em>Indicated Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getOtherIndicatedConditionDescription <em>Other Indicated Condition Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getOtherColorDescription <em>Other Color Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getDefaultActivationState <em>Default Activation State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getActivationState <em>Activation State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDImpl#getControlPattern <em>Control Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IndicatorLEDImpl extends CIM_LogicalDeviceImpl implements CIM_IndicatorLED {
	/**
	 * The cached value of the '{@link #getIndicatedConditions() <em>Indicated Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> indicatedConditions;

	/**
	 * The default value of the '{@link #getOtherIndicatedConditionDescription() <em>Other Indicated Condition Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIndicatedConditionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INDICATED_CONDITION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIndicatedConditionDescription() <em>Other Indicated Condition Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIndicatedConditionDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherIndicatedConditionDescription = OTHER_INDICATED_CONDITION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Integer color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherColorDescription() <em>Other Color Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COLOR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherColorDescription() <em>Other Color Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherColorDescription = OTHER_COLOR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlMode() <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlMode() <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlMode()
	 * @generated
	 * @ordered
	 */
	protected Integer controlMode = CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultActivationState() <em>Default Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActivationState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_ACTIVATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultActivationState() <em>Default Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActivationState()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultActivationState = DEFAULT_ACTIVATION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationState() <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationState() <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationState()
	 * @generated
	 * @ordered
	 */
	protected Integer activationState = ACTIVATION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPattern() <em>Control Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlPattern() <em>Control Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPattern()
	 * @generated
	 * @ordered
	 */
	protected String controlPattern = CONTROL_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicatorLEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IndicatorLED();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIndicatedConditions() {
		if (indicatedConditions == null) {
			indicatedConditions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_INDICATOR_LED__INDICATED_CONDITIONS);
		}
		return indicatedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherIndicatedConditionDescription() {
		return otherIndicatedConditionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIndicatedConditionDescription(String newOtherIndicatedConditionDescription) {
		String oldOtherIndicatedConditionDescription = otherIndicatedConditionDescription;
		otherIndicatedConditionDescription = newOtherIndicatedConditionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__OTHER_INDICATED_CONDITION_DESCRIPTION, oldOtherIndicatedConditionDescription, otherIndicatedConditionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Integer newColor) {
		Integer oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherColorDescription() {
		return otherColorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherColorDescription(String newOtherColorDescription) {
		String oldOtherColorDescription = otherColorDescription;
		otherColorDescription = newOtherColorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__OTHER_COLOR_DESCRIPTION, oldOtherColorDescription, otherColorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getControlMode() {
		return controlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlMode(Integer newControlMode) {
		Integer oldControlMode = controlMode;
		controlMode = newControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__CONTROL_MODE, oldControlMode, controlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultActivationState() {
		return defaultActivationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultActivationState(Integer newDefaultActivationState) {
		Integer oldDefaultActivationState = defaultActivationState;
		defaultActivationState = newDefaultActivationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__DEFAULT_ACTIVATION_STATE, oldDefaultActivationState, defaultActivationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActivationState() {
		return activationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationState(Integer newActivationState) {
		Integer oldActivationState = activationState;
		activationState = newActivationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__ACTIVATION_STATE, oldActivationState, activationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlPattern() {
		return controlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlPattern(String newControlPattern) {
		String oldControlPattern = controlPattern;
		controlPattern = newControlPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INDICATOR_LED__CONTROL_PATTERN, oldControlPattern, controlPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATOR_LED__INDICATED_CONDITIONS:
				return getIndicatedConditions();
			case CimPackage.CIM_INDICATOR_LED__OTHER_INDICATED_CONDITION_DESCRIPTION:
				return getOtherIndicatedConditionDescription();
			case CimPackage.CIM_INDICATOR_LED__COLOR:
				return getColor();
			case CimPackage.CIM_INDICATOR_LED__OTHER_COLOR_DESCRIPTION:
				return getOtherColorDescription();
			case CimPackage.CIM_INDICATOR_LED__CONTROL_MODE:
				return getControlMode();
			case CimPackage.CIM_INDICATOR_LED__DEFAULT_ACTIVATION_STATE:
				return getDefaultActivationState();
			case CimPackage.CIM_INDICATOR_LED__ACTIVATION_STATE:
				return getActivationState();
			case CimPackage.CIM_INDICATOR_LED__CONTROL_PATTERN:
				return getControlPattern();
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
			case CimPackage.CIM_INDICATOR_LED__INDICATED_CONDITIONS:
				getIndicatedConditions().clear();
				getIndicatedConditions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__OTHER_INDICATED_CONDITION_DESCRIPTION:
				setOtherIndicatedConditionDescription((String)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__COLOR:
				setColor((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__OTHER_COLOR_DESCRIPTION:
				setOtherColorDescription((String)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__CONTROL_MODE:
				setControlMode((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__DEFAULT_ACTIVATION_STATE:
				setDefaultActivationState((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__ACTIVATION_STATE:
				setActivationState((Integer)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED__CONTROL_PATTERN:
				setControlPattern((String)newValue);
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
			case CimPackage.CIM_INDICATOR_LED__INDICATED_CONDITIONS:
				getIndicatedConditions().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED__OTHER_INDICATED_CONDITION_DESCRIPTION:
				setOtherIndicatedConditionDescription(OTHER_INDICATED_CONDITION_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__OTHER_COLOR_DESCRIPTION:
				setOtherColorDescription(OTHER_COLOR_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__CONTROL_MODE:
				setControlMode(CONTROL_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__DEFAULT_ACTIVATION_STATE:
				setDefaultActivationState(DEFAULT_ACTIVATION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__ACTIVATION_STATE:
				setActivationState(ACTIVATION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_INDICATOR_LED__CONTROL_PATTERN:
				setControlPattern(CONTROL_PATTERN_EDEFAULT);
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
			case CimPackage.CIM_INDICATOR_LED__INDICATED_CONDITIONS:
				return indicatedConditions != null && !indicatedConditions.isEmpty();
			case CimPackage.CIM_INDICATOR_LED__OTHER_INDICATED_CONDITION_DESCRIPTION:
				return OTHER_INDICATED_CONDITION_DESCRIPTION_EDEFAULT == null ? otherIndicatedConditionDescription != null : !OTHER_INDICATED_CONDITION_DESCRIPTION_EDEFAULT.equals(otherIndicatedConditionDescription);
			case CimPackage.CIM_INDICATOR_LED__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case CimPackage.CIM_INDICATOR_LED__OTHER_COLOR_DESCRIPTION:
				return OTHER_COLOR_DESCRIPTION_EDEFAULT == null ? otherColorDescription != null : !OTHER_COLOR_DESCRIPTION_EDEFAULT.equals(otherColorDescription);
			case CimPackage.CIM_INDICATOR_LED__CONTROL_MODE:
				return CONTROL_MODE_EDEFAULT == null ? controlMode != null : !CONTROL_MODE_EDEFAULT.equals(controlMode);
			case CimPackage.CIM_INDICATOR_LED__DEFAULT_ACTIVATION_STATE:
				return DEFAULT_ACTIVATION_STATE_EDEFAULT == null ? defaultActivationState != null : !DEFAULT_ACTIVATION_STATE_EDEFAULT.equals(defaultActivationState);
			case CimPackage.CIM_INDICATOR_LED__ACTIVATION_STATE:
				return ACTIVATION_STATE_EDEFAULT == null ? activationState != null : !ACTIVATION_STATE_EDEFAULT.equals(activationState);
			case CimPackage.CIM_INDICATOR_LED__CONTROL_PATTERN:
				return CONTROL_PATTERN_EDEFAULT == null ? controlPattern != null : !CONTROL_PATTERN_EDEFAULT.equals(controlPattern);
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
		result.append(" (IndicatedConditions: ");
		result.append(indicatedConditions);
		result.append(", OtherIndicatedConditionDescription: ");
		result.append(otherIndicatedConditionDescription);
		result.append(", Color: ");
		result.append(color);
		result.append(", OtherColorDescription: ");
		result.append(otherColorDescription);
		result.append(", ControlMode: ");
		result.append(controlMode);
		result.append(", DefaultActivationState: ");
		result.append(defaultActivationState);
		result.append(", ActivationState: ");
		result.append(activationState);
		result.append(", ControlPattern: ");
		result.append(controlPattern);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicatorLEDImpl
