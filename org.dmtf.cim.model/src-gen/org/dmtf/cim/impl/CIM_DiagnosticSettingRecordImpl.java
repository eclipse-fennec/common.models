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

import org.dmtf.cim.CIM_DiagnosticSettingRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Setting Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getLoopControlParameter <em>Loop Control Parameter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getLoopControl <em>Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getOtherLoopControlDescriptions <em>Other Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getResultPersistence <em>Result Persistence</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getLogOptions <em>Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getOtherLogOptionsDescriptions <em>Other Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSettingRecordImpl#getVerbosityLevel <em>Verbosity Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticSettingRecordImpl extends CIM_DiagnosticRecordImpl implements CIM_DiagnosticSettingRecord {
	/**
	 * The default value of the '{@link #getHaltOnError() <em>Halt On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltOnError()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HALT_ON_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHaltOnError() <em>Halt On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltOnError()
	 * @generated
	 * @ordered
	 */
	protected Boolean haltOnError = HALT_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuickMode() <em>Quick Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuickMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean QUICK_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuickMode() <em>Quick Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuickMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean quickMode = QUICK_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentOfTestCoverage() <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_OF_TEST_COVERAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentOfTestCoverage() <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 * @ordered
	 */
	protected Integer percentOfTestCoverage = PERCENT_OF_TEST_COVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopControlParameter() <em>Loop Control Parameter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopControlParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<String> loopControlParameter;

	/**
	 * The cached value of the '{@link #getLoopControl() <em>Loop Control</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> loopControl;

	/**
	 * The cached value of the '{@link #getOtherLoopControlDescriptions() <em>Other Loop Control Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLoopControlDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherLoopControlDescriptions;

	/**
	 * The default value of the '{@link #getResultPersistence() <em>Result Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPersistence()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESULT_PERSISTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultPersistence() <em>Result Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPersistence()
	 * @generated
	 * @ordered
	 */
	protected Long resultPersistence = RESULT_PERSISTENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogOptions() <em>Log Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> logOptions;

	/**
	 * The cached value of the '{@link #getOtherLogOptionsDescriptions() <em>Other Log Options Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogOptionsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherLogOptionsDescriptions;

	/**
	 * The cached value of the '{@link #getVerbosityLevel() <em>Verbosity Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbosityLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> verbosityLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticSettingRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticSettingRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHaltOnError() {
		return haltOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaltOnError(Boolean newHaltOnError) {
		Boolean oldHaltOnError = haltOnError;
		haltOnError = newHaltOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__HALT_ON_ERROR, oldHaltOnError, haltOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getQuickMode() {
		return quickMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuickMode(Boolean newQuickMode) {
		Boolean oldQuickMode = quickMode;
		quickMode = newQuickMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__QUICK_MODE, oldQuickMode, quickMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentOfTestCoverage() {
		return percentOfTestCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfTestCoverage(Integer newPercentOfTestCoverage) {
		Integer oldPercentOfTestCoverage = percentOfTestCoverage;
		percentOfTestCoverage = newPercentOfTestCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__PERCENT_OF_TEST_COVERAGE, oldPercentOfTestCoverage, percentOfTestCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLoopControlParameter() {
		if (loopControlParameter == null) {
			loopControlParameter = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL_PARAMETER);
		}
		return loopControlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLoopControl() {
		if (loopControl == null) {
			loopControl = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL);
		}
		return loopControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherLoopControlDescriptions() {
		if (otherLoopControlDescriptions == null) {
			otherLoopControlDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOOP_CONTROL_DESCRIPTIONS);
		}
		return otherLoopControlDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResultPersistence() {
		return resultPersistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultPersistence(Long newResultPersistence) {
		Long oldResultPersistence = resultPersistence;
		resultPersistence = newResultPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__RESULT_PERSISTENCE, oldResultPersistence, resultPersistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLogOptions() {
		if (logOptions == null) {
			logOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOG_OPTIONS);
		}
		return logOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherLogOptionsDescriptions() {
		if (otherLogOptionsDescriptions == null) {
			otherLogOptionsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOG_OPTIONS_DESCRIPTIONS);
		}
		return otherLogOptionsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVerbosityLevel() {
		if (verbosityLevel == null) {
			verbosityLevel = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__VERBOSITY_LEVEL);
		}
		return verbosityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__HALT_ON_ERROR:
				return getHaltOnError();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__QUICK_MODE:
				return getQuickMode();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__PERCENT_OF_TEST_COVERAGE:
				return getPercentOfTestCoverage();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL_PARAMETER:
				return getLoopControlParameter();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL:
				return getLoopControl();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOOP_CONTROL_DESCRIPTIONS:
				return getOtherLoopControlDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__RESULT_PERSISTENCE:
				return getResultPersistence();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOG_OPTIONS:
				return getLogOptions();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOG_OPTIONS_DESCRIPTIONS:
				return getOtherLogOptionsDescriptions();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__VERBOSITY_LEVEL:
				return getVerbosityLevel();
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
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__HALT_ON_ERROR:
				setHaltOnError((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__QUICK_MODE:
				setQuickMode((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__PERCENT_OF_TEST_COVERAGE:
				setPercentOfTestCoverage((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL_PARAMETER:
				getLoopControlParameter().clear();
				getLoopControlParameter().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL:
				getLoopControl().clear();
				getLoopControl().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOOP_CONTROL_DESCRIPTIONS:
				getOtherLoopControlDescriptions().clear();
				getOtherLoopControlDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__RESULT_PERSISTENCE:
				setResultPersistence((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOG_OPTIONS:
				getLogOptions().clear();
				getLogOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOG_OPTIONS_DESCRIPTIONS:
				getOtherLogOptionsDescriptions().clear();
				getOtherLogOptionsDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__VERBOSITY_LEVEL:
				getVerbosityLevel().clear();
				getVerbosityLevel().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__HALT_ON_ERROR:
				setHaltOnError(HALT_ON_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__QUICK_MODE:
				setQuickMode(QUICK_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__PERCENT_OF_TEST_COVERAGE:
				setPercentOfTestCoverage(PERCENT_OF_TEST_COVERAGE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL_PARAMETER:
				getLoopControlParameter().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL:
				getLoopControl().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOOP_CONTROL_DESCRIPTIONS:
				getOtherLoopControlDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__RESULT_PERSISTENCE:
				setResultPersistence(RESULT_PERSISTENCE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOG_OPTIONS:
				getLogOptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOG_OPTIONS_DESCRIPTIONS:
				getOtherLogOptionsDescriptions().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__VERBOSITY_LEVEL:
				getVerbosityLevel().clear();
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
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__HALT_ON_ERROR:
				return HALT_ON_ERROR_EDEFAULT == null ? haltOnError != null : !HALT_ON_ERROR_EDEFAULT.equals(haltOnError);
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__QUICK_MODE:
				return QUICK_MODE_EDEFAULT == null ? quickMode != null : !QUICK_MODE_EDEFAULT.equals(quickMode);
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__PERCENT_OF_TEST_COVERAGE:
				return PERCENT_OF_TEST_COVERAGE_EDEFAULT == null ? percentOfTestCoverage != null : !PERCENT_OF_TEST_COVERAGE_EDEFAULT.equals(percentOfTestCoverage);
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL_PARAMETER:
				return loopControlParameter != null && !loopControlParameter.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOOP_CONTROL:
				return loopControl != null && !loopControl.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOOP_CONTROL_DESCRIPTIONS:
				return otherLoopControlDescriptions != null && !otherLoopControlDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__RESULT_PERSISTENCE:
				return RESULT_PERSISTENCE_EDEFAULT == null ? resultPersistence != null : !RESULT_PERSISTENCE_EDEFAULT.equals(resultPersistence);
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__LOG_OPTIONS:
				return logOptions != null && !logOptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__OTHER_LOG_OPTIONS_DESCRIPTIONS:
				return otherLogOptionsDescriptions != null && !otherLogOptionsDescriptions.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD__VERBOSITY_LEVEL:
				return verbosityLevel != null && !verbosityLevel.isEmpty();
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
		result.append(" (HaltOnError: ");
		result.append(haltOnError);
		result.append(", QuickMode: ");
		result.append(quickMode);
		result.append(", PercentOfTestCoverage: ");
		result.append(percentOfTestCoverage);
		result.append(", LoopControlParameter: ");
		result.append(loopControlParameter);
		result.append(", LoopControl: ");
		result.append(loopControl);
		result.append(", OtherLoopControlDescriptions: ");
		result.append(otherLoopControlDescriptions);
		result.append(", ResultPersistence: ");
		result.append(resultPersistence);
		result.append(", LogOptions: ");
		result.append(logOptions);
		result.append(", OtherLogOptionsDescriptions: ");
		result.append(otherLogOptionsDescriptions);
		result.append(", VerbosityLevel: ");
		result.append(verbosityLevel);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticSettingRecordImpl
