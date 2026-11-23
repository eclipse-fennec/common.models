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

import org.dmtf.cim.CIM_DiagnosticServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedServiceModes <em>Supported Service Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getOtherSupportedServiceModesDescriptions <em>Other Supported Service Modes Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedLoopControl <em>Supported Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getOtherSupportedLoopControlDescriptions <em>Other Supported Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedLogOptions <em>Supported Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getOtherSupportedLogOptionsDescriptions <em>Other Supported Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedLogStorage <em>Supported Log Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getOtherSupportedLogStorageDescriptions <em>Other Supported Log Storage Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedExecutionControls <em>Supported Execution Controls</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getOtherSupportedExecutionControlsDescriptions <em>Other Supported Execution Controls Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceCapabilitiesImpl#getSupportedTestWarnings <em>Supported Test Warnings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_DiagnosticServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedServiceModes() <em>Supported Service Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedServiceModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedServiceModes;

	/**
	 * The cached value of the '{@link #getOtherSupportedServiceModesDescriptions() <em>Other Supported Service Modes Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedServiceModesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedServiceModesDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedLoopControl() <em>Supported Loop Control</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLoopControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedLoopControl;

	/**
	 * The cached value of the '{@link #getOtherSupportedLoopControlDescriptions() <em>Other Supported Loop Control Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedLoopControlDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedLoopControlDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedLogOptions() <em>Supported Log Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLogOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedLogOptions;

	/**
	 * The cached value of the '{@link #getOtherSupportedLogOptionsDescriptions() <em>Other Supported Log Options Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedLogOptionsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedLogOptionsDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedLogStorage() <em>Supported Log Storage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLogStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedLogStorage;

	/**
	 * The cached value of the '{@link #getOtherSupportedLogStorageDescriptions() <em>Other Supported Log Storage Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedLogStorageDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedLogStorageDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedExecutionControls() <em>Supported Execution Controls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExecutionControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExecutionControls;

	/**
	 * The cached value of the '{@link #getOtherSupportedExecutionControlsDescriptions() <em>Other Supported Execution Controls Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedExecutionControlsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedExecutionControlsDescriptions;

	/**
	 * The default value of the '{@link #getSupportedTestWarnings() <em>Supported Test Warnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTestWarnings()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUPPORTED_TEST_WARNINGS_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getSupportedTestWarnings() <em>Supported Test Warnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTestWarnings()
	 * @generated
	 * @ordered
	 */
	protected Integer supportedTestWarnings = SUPPORTED_TEST_WARNINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedServiceModes() {
		if (supportedServiceModes == null) {
			supportedServiceModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_SERVICE_MODES);
		}
		return supportedServiceModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedServiceModesDescriptions() {
		if (otherSupportedServiceModesDescriptions == null) {
			otherSupportedServiceModesDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_SERVICE_MODES_DESCRIPTIONS);
		}
		return otherSupportedServiceModesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedLoopControl() {
		if (supportedLoopControl == null) {
			supportedLoopControl = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOOP_CONTROL);
		}
		return supportedLoopControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedLoopControlDescriptions() {
		if (otherSupportedLoopControlDescriptions == null) {
			otherSupportedLoopControlDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOOP_CONTROL_DESCRIPTIONS);
		}
		return otherSupportedLoopControlDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedLogOptions() {
		if (supportedLogOptions == null) {
			supportedLogOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_OPTIONS);
		}
		return supportedLogOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedLogOptionsDescriptions() {
		if (otherSupportedLogOptionsDescriptions == null) {
			otherSupportedLogOptionsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_OPTIONS_DESCRIPTIONS);
		}
		return otherSupportedLogOptionsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedLogStorage() {
		if (supportedLogStorage == null) {
			supportedLogStorage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_STORAGE);
		}
		return supportedLogStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedLogStorageDescriptions() {
		if (otherSupportedLogStorageDescriptions == null) {
			otherSupportedLogStorageDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_STORAGE_DESCRIPTIONS);
		}
		return otherSupportedLogStorageDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExecutionControls() {
		if (supportedExecutionControls == null) {
			supportedExecutionControls = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_EXECUTION_CONTROLS);
		}
		return supportedExecutionControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedExecutionControlsDescriptions() {
		if (otherSupportedExecutionControlsDescriptions == null) {
			otherSupportedExecutionControlsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXECUTION_CONTROLS_DESCRIPTIONS);
		}
		return otherSupportedExecutionControlsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSupportedTestWarnings() {
		return supportedTestWarnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedTestWarnings(Integer newSupportedTestWarnings) {
		Integer oldSupportedTestWarnings = supportedTestWarnings;
		supportedTestWarnings = newSupportedTestWarnings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_TEST_WARNINGS, oldSupportedTestWarnings, supportedTestWarnings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_SERVICE_MODES:
				return getSupportedServiceModes();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_SERVICE_MODES_DESCRIPTIONS:
				return getOtherSupportedServiceModesDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOOP_CONTROL:
				return getSupportedLoopControl();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOOP_CONTROL_DESCRIPTIONS:
				return getOtherSupportedLoopControlDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_OPTIONS:
				return getSupportedLogOptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_OPTIONS_DESCRIPTIONS:
				return getOtherSupportedLogOptionsDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_STORAGE:
				return getSupportedLogStorage();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_STORAGE_DESCRIPTIONS:
				return getOtherSupportedLogStorageDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_EXECUTION_CONTROLS:
				return getSupportedExecutionControls();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXECUTION_CONTROLS_DESCRIPTIONS:
				return getOtherSupportedExecutionControlsDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_TEST_WARNINGS:
				return getSupportedTestWarnings();
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_SERVICE_MODES:
				getSupportedServiceModes().clear();
				getSupportedServiceModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_SERVICE_MODES_DESCRIPTIONS:
				getOtherSupportedServiceModesDescriptions().clear();
				getOtherSupportedServiceModesDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOOP_CONTROL:
				getSupportedLoopControl().clear();
				getSupportedLoopControl().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOOP_CONTROL_DESCRIPTIONS:
				getOtherSupportedLoopControlDescriptions().clear();
				getOtherSupportedLoopControlDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_OPTIONS:
				getSupportedLogOptions().clear();
				getSupportedLogOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_OPTIONS_DESCRIPTIONS:
				getOtherSupportedLogOptionsDescriptions().clear();
				getOtherSupportedLogOptionsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_STORAGE:
				getSupportedLogStorage().clear();
				getSupportedLogStorage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_STORAGE_DESCRIPTIONS:
				getOtherSupportedLogStorageDescriptions().clear();
				getOtherSupportedLogStorageDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_EXECUTION_CONTROLS:
				getSupportedExecutionControls().clear();
				getSupportedExecutionControls().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXECUTION_CONTROLS_DESCRIPTIONS:
				getOtherSupportedExecutionControlsDescriptions().clear();
				getOtherSupportedExecutionControlsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_TEST_WARNINGS:
				setSupportedTestWarnings((Integer)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_SERVICE_MODES:
				getSupportedServiceModes().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_SERVICE_MODES_DESCRIPTIONS:
				getOtherSupportedServiceModesDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOOP_CONTROL:
				getSupportedLoopControl().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOOP_CONTROL_DESCRIPTIONS:
				getOtherSupportedLoopControlDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_OPTIONS:
				getSupportedLogOptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_OPTIONS_DESCRIPTIONS:
				getOtherSupportedLogOptionsDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_STORAGE:
				getSupportedLogStorage().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_STORAGE_DESCRIPTIONS:
				getOtherSupportedLogStorageDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_EXECUTION_CONTROLS:
				getSupportedExecutionControls().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXECUTION_CONTROLS_DESCRIPTIONS:
				getOtherSupportedExecutionControlsDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_TEST_WARNINGS:
				setSupportedTestWarnings(SUPPORTED_TEST_WARNINGS_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_SERVICE_MODES:
				return supportedServiceModes != null && !supportedServiceModes.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_SERVICE_MODES_DESCRIPTIONS:
				return otherSupportedServiceModesDescriptions != null && !otherSupportedServiceModesDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOOP_CONTROL:
				return supportedLoopControl != null && !supportedLoopControl.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOOP_CONTROL_DESCRIPTIONS:
				return otherSupportedLoopControlDescriptions != null && !otherSupportedLoopControlDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_OPTIONS:
				return supportedLogOptions != null && !supportedLogOptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_OPTIONS_DESCRIPTIONS:
				return otherSupportedLogOptionsDescriptions != null && !otherSupportedLogOptionsDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_LOG_STORAGE:
				return supportedLogStorage != null && !supportedLogStorage.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_LOG_STORAGE_DESCRIPTIONS:
				return otherSupportedLogStorageDescriptions != null && !otherSupportedLogStorageDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_EXECUTION_CONTROLS:
				return supportedExecutionControls != null && !supportedExecutionControls.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXECUTION_CONTROLS_DESCRIPTIONS:
				return otherSupportedExecutionControlsDescriptions != null && !otherSupportedExecutionControlsDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_TEST_WARNINGS:
				return SUPPORTED_TEST_WARNINGS_EDEFAULT == null ? supportedTestWarnings != null : !SUPPORTED_TEST_WARNINGS_EDEFAULT.equals(supportedTestWarnings);
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
		result.append(" (SupportedServiceModes: ");
		result.append(supportedServiceModes);
		result.append(", OtherSupportedServiceModesDescriptions: ");
		result.append(otherSupportedServiceModesDescriptions);
		result.append(", SupportedLoopControl: ");
		result.append(supportedLoopControl);
		result.append(", OtherSupportedLoopControlDescriptions: ");
		result.append(otherSupportedLoopControlDescriptions);
		result.append(", SupportedLogOptions: ");
		result.append(supportedLogOptions);
		result.append(", OtherSupportedLogOptionsDescriptions: ");
		result.append(otherSupportedLogOptionsDescriptions);
		result.append(", SupportedLogStorage: ");
		result.append(supportedLogStorage);
		result.append(", OtherSupportedLogStorageDescriptions: ");
		result.append(otherSupportedLogStorageDescriptions);
		result.append(", SupportedExecutionControls: ");
		result.append(supportedExecutionControls);
		result.append(", OtherSupportedExecutionControlsDescriptions: ");
		result.append(otherSupportedExecutionControlsDescriptions);
		result.append(", SupportedTestWarnings: ");
		result.append(supportedTestWarnings);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticServiceCapabilitiesImpl
