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

import org.dmtf.cim.CIM_IndicatorLEDCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Indicator LED Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getSupportedIndicatedConditions <em>Supported Indicated Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getOtherSupportedIndicatedConditionDescriptions <em>Other Supported Indicated Condition Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getSupportedControlModes <em>Supported Control Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getSupportedColors <em>Supported Colors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getOtherSupportedColorDescriptions <em>Other Supported Color Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getSupportedControlPatterns <em>Supported Control Patterns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IndicatorLEDCapabilitiesImpl#getSupportedActivationStates <em>Supported Activation States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IndicatorLEDCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_IndicatorLEDCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedIndicatedConditions() <em>Supported Indicated Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIndicatedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedIndicatedConditions;

	/**
	 * The cached value of the '{@link #getOtherSupportedIndicatedConditionDescriptions() <em>Other Supported Indicated Condition Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedIndicatedConditionDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedIndicatedConditionDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedControlModes() <em>Supported Control Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedControlModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedControlModes;

	/**
	 * The cached value of the '{@link #getSupportedColors() <em>Supported Colors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedColors()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedColors;

	/**
	 * The cached value of the '{@link #getOtherSupportedColorDescriptions() <em>Other Supported Color Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedColorDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedColorDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedControlPatterns() <em>Supported Control Patterns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedControlPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedControlPatterns;

	/**
	 * The cached value of the '{@link #getSupportedActivationStates() <em>Supported Activation States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedActivationStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedActivationStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IndicatorLEDCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IndicatorLEDCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedIndicatedConditions() {
		if (supportedIndicatedConditions == null) {
			supportedIndicatedConditions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_INDICATED_CONDITIONS);
		}
		return supportedIndicatedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedIndicatedConditionDescriptions() {
		if (otherSupportedIndicatedConditionDescriptions == null) {
			otherSupportedIndicatedConditionDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_INDICATED_CONDITION_DESCRIPTIONS);
		}
		return otherSupportedIndicatedConditionDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedControlModes() {
		if (supportedControlModes == null) {
			supportedControlModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_MODES);
		}
		return supportedControlModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedColors() {
		if (supportedColors == null) {
			supportedColors = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_COLORS);
		}
		return supportedColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedColorDescriptions() {
		if (otherSupportedColorDescriptions == null) {
			otherSupportedColorDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_COLOR_DESCRIPTIONS);
		}
		return otherSupportedColorDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedControlPatterns() {
		if (supportedControlPatterns == null) {
			supportedControlPatterns = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_PATTERNS);
		}
		return supportedControlPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedActivationStates() {
		if (supportedActivationStates == null) {
			supportedActivationStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_ACTIVATION_STATES);
		}
		return supportedActivationStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_INDICATED_CONDITIONS:
				return getSupportedIndicatedConditions();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_INDICATED_CONDITION_DESCRIPTIONS:
				return getOtherSupportedIndicatedConditionDescriptions();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_MODES:
				return getSupportedControlModes();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_COLORS:
				return getSupportedColors();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_COLOR_DESCRIPTIONS:
				return getOtherSupportedColorDescriptions();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_PATTERNS:
				return getSupportedControlPatterns();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_ACTIVATION_STATES:
				return getSupportedActivationStates();
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
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_INDICATED_CONDITIONS:
				getSupportedIndicatedConditions().clear();
				getSupportedIndicatedConditions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_INDICATED_CONDITION_DESCRIPTIONS:
				getOtherSupportedIndicatedConditionDescriptions().clear();
				getOtherSupportedIndicatedConditionDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_MODES:
				getSupportedControlModes().clear();
				getSupportedControlModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_COLORS:
				getSupportedColors().clear();
				getSupportedColors().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_COLOR_DESCRIPTIONS:
				getOtherSupportedColorDescriptions().clear();
				getOtherSupportedColorDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_PATTERNS:
				getSupportedControlPatterns().clear();
				getSupportedControlPatterns().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_ACTIVATION_STATES:
				getSupportedActivationStates().clear();
				getSupportedActivationStates().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_INDICATED_CONDITIONS:
				getSupportedIndicatedConditions().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_INDICATED_CONDITION_DESCRIPTIONS:
				getOtherSupportedIndicatedConditionDescriptions().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_MODES:
				getSupportedControlModes().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_COLORS:
				getSupportedColors().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_COLOR_DESCRIPTIONS:
				getOtherSupportedColorDescriptions().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_PATTERNS:
				getSupportedControlPatterns().clear();
				return;
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_ACTIVATION_STATES:
				getSupportedActivationStates().clear();
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
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_INDICATED_CONDITIONS:
				return supportedIndicatedConditions != null && !supportedIndicatedConditions.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_INDICATED_CONDITION_DESCRIPTIONS:
				return otherSupportedIndicatedConditionDescriptions != null && !otherSupportedIndicatedConditionDescriptions.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_MODES:
				return supportedControlModes != null && !supportedControlModes.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_COLORS:
				return supportedColors != null && !supportedColors.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__OTHER_SUPPORTED_COLOR_DESCRIPTIONS:
				return otherSupportedColorDescriptions != null && !otherSupportedColorDescriptions.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_CONTROL_PATTERNS:
				return supportedControlPatterns != null && !supportedControlPatterns.isEmpty();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES__SUPPORTED_ACTIVATION_STATES:
				return supportedActivationStates != null && !supportedActivationStates.isEmpty();
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
		result.append(" (SupportedIndicatedConditions: ");
		result.append(supportedIndicatedConditions);
		result.append(", OtherSupportedIndicatedConditionDescriptions: ");
		result.append(otherSupportedIndicatedConditionDescriptions);
		result.append(", SupportedControlModes: ");
		result.append(supportedControlModes);
		result.append(", SupportedColors: ");
		result.append(supportedColors);
		result.append(", OtherSupportedColorDescriptions: ");
		result.append(otherSupportedColorDescriptions);
		result.append(", SupportedControlPatterns: ");
		result.append(supportedControlPatterns);
		result.append(", SupportedActivationStates: ");
		result.append(supportedActivationStates);
		result.append(')');
		return result.toString();
	}

} //CIM_IndicatorLEDCapabilitiesImpl
