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

import org.dmtf.cim.CIM_JobSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Job Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getDeleteOnCompletion <em>Delete On Completion</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getOtherRecoveryAction <em>Other Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getApplicableMethod <em>Applicable Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getClientRetries <em>Client Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getDefaultInputNames <em>Default Input Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getDefaultInputValues <em>Default Input Values</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getInteractiveTimeout <em>Interactive Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getRunInSilentMode <em>Run In Silent Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getTerminateOnTimeout <em>Terminate On Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobSettingDataImpl#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_JobSettingDataImpl extends CIM_SettingDataImpl implements CIM_JobSettingData {
	/**
	 * The default value of the '{@link #getDeleteOnCompletion() <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteOnCompletion() <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnCompletion = DELETE_ON_COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECOVERY_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected Integer recoveryAction = RECOVERY_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRecoveryAction() <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RECOVERY_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRecoveryAction() <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected String otherRecoveryAction = OTHER_RECOVERY_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicableMethod() <em>Applicable Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABLE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicableMethod() <em>Applicable Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableMethod()
	 * @generated
	 * @ordered
	 */
	protected String applicableMethod = APPLICABLE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientRetries() <em>Client Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLIENT_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientRetries() <em>Client Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRetries()
	 * @generated
	 * @ordered
	 */
	protected Long clientRetries = CLIENT_RETRIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultInputNames() <em>Default Input Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultInputNames;

	/**
	 * The cached value of the '{@link #getDefaultInputValues() <em>Default Input Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultInputValues;

	/**
	 * The default value of the '{@link #getInteractiveTimeout() <em>Interactive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERACTIVE_TIMEOUT_EDEFAULT = "00000000001500.000000:000";

	/**
	 * The cached value of the '{@link #getInteractiveTimeout() <em>Interactive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveTimeout()
	 * @generated
	 * @ordered
	 */
	protected String interactiveTimeout = INTERACTIVE_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunInSilentMode() <em>Run In Silent Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInSilentMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUN_IN_SILENT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunInSilentMode() <em>Run In Silent Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunInSilentMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean runInSilentMode = RUN_IN_SILENT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminateOnTimeout() <em>Terminate On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminateOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TERMINATE_ON_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminateOnTimeout() <em>Terminate On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminateOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected Boolean terminateOnTimeout = TERMINATE_ON_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected String timeBeforeRemoval = TIME_BEFORE_REMOVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_JobSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_JobSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnCompletion() {
		return deleteOnCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnCompletion(Boolean newDeleteOnCompletion) {
		Boolean oldDeleteOnCompletion = deleteOnCompletion;
		deleteOnCompletion = newDeleteOnCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__DELETE_ON_COMPLETION, oldDeleteOnCompletion, deleteOnCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveryAction(Integer newRecoveryAction) {
		Integer oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__RECOVERY_ACTION, oldRecoveryAction, recoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRecoveryAction() {
		return otherRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRecoveryAction(String newOtherRecoveryAction) {
		String oldOtherRecoveryAction = otherRecoveryAction;
		otherRecoveryAction = newOtherRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__OTHER_RECOVERY_ACTION, oldOtherRecoveryAction, otherRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicableMethod() {
		return applicableMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicableMethod(String newApplicableMethod) {
		String oldApplicableMethod = applicableMethod;
		applicableMethod = newApplicableMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__APPLICABLE_METHOD, oldApplicableMethod, applicableMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClientRetries() {
		return clientRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientRetries(Long newClientRetries) {
		Long oldClientRetries = clientRetries;
		clientRetries = newClientRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__CLIENT_RETRIES, oldClientRetries, clientRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDefaultInputNames() {
		if (defaultInputNames == null) {
			defaultInputNames = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_NAMES);
		}
		return defaultInputNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDefaultInputValues() {
		if (defaultInputValues == null) {
			defaultInputValues = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_VALUES);
		}
		return defaultInputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInteractiveTimeout() {
		return interactiveTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteractiveTimeout(String newInteractiveTimeout) {
		String oldInteractiveTimeout = interactiveTimeout;
		interactiveTimeout = newInteractiveTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__INTERACTIVE_TIMEOUT, oldInteractiveTimeout, interactiveTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRunInSilentMode() {
		return runInSilentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunInSilentMode(Boolean newRunInSilentMode) {
		Boolean oldRunInSilentMode = runInSilentMode;
		runInSilentMode = newRunInSilentMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__RUN_IN_SILENT_MODE, oldRunInSilentMode, runInSilentMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTerminateOnTimeout() {
		return terminateOnTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminateOnTimeout(Boolean newTerminateOnTimeout) {
		Boolean oldTerminateOnTimeout = terminateOnTimeout;
		terminateOnTimeout = newTerminateOnTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__TERMINATE_ON_TIMEOUT, oldTerminateOnTimeout, terminateOnTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeBeforeRemoval() {
		return timeBeforeRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBeforeRemoval(String newTimeBeforeRemoval) {
		String oldTimeBeforeRemoval = timeBeforeRemoval;
		timeBeforeRemoval = newTimeBeforeRemoval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_SETTING_DATA__TIME_BEFORE_REMOVAL, oldTimeBeforeRemoval, timeBeforeRemoval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_JOB_SETTING_DATA__DELETE_ON_COMPLETION:
				return getDeleteOnCompletion();
			case CimPackage.CIM_JOB_SETTING_DATA__RECOVERY_ACTION:
				return getRecoveryAction();
			case CimPackage.CIM_JOB_SETTING_DATA__OTHER_RECOVERY_ACTION:
				return getOtherRecoveryAction();
			case CimPackage.CIM_JOB_SETTING_DATA__APPLICABLE_METHOD:
				return getApplicableMethod();
			case CimPackage.CIM_JOB_SETTING_DATA__CLIENT_RETRIES:
				return getClientRetries();
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_NAMES:
				return getDefaultInputNames();
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_VALUES:
				return getDefaultInputValues();
			case CimPackage.CIM_JOB_SETTING_DATA__INTERACTIVE_TIMEOUT:
				return getInteractiveTimeout();
			case CimPackage.CIM_JOB_SETTING_DATA__RUN_IN_SILENT_MODE:
				return getRunInSilentMode();
			case CimPackage.CIM_JOB_SETTING_DATA__TERMINATE_ON_TIMEOUT:
				return getTerminateOnTimeout();
			case CimPackage.CIM_JOB_SETTING_DATA__TIME_BEFORE_REMOVAL:
				return getTimeBeforeRemoval();
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
			case CimPackage.CIM_JOB_SETTING_DATA__DELETE_ON_COMPLETION:
				setDeleteOnCompletion((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__RECOVERY_ACTION:
				setRecoveryAction((Integer)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__OTHER_RECOVERY_ACTION:
				setOtherRecoveryAction((String)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__APPLICABLE_METHOD:
				setApplicableMethod((String)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__CLIENT_RETRIES:
				setClientRetries((Long)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_NAMES:
				getDefaultInputNames().clear();
				getDefaultInputNames().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_VALUES:
				getDefaultInputValues().clear();
				getDefaultInputValues().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__INTERACTIVE_TIMEOUT:
				setInteractiveTimeout((String)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__RUN_IN_SILENT_MODE:
				setRunInSilentMode((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__TERMINATE_ON_TIMEOUT:
				setTerminateOnTimeout((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval((String)newValue);
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
			case CimPackage.CIM_JOB_SETTING_DATA__DELETE_ON_COMPLETION:
				setDeleteOnCompletion(DELETE_ON_COMPLETION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__RECOVERY_ACTION:
				setRecoveryAction(RECOVERY_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__OTHER_RECOVERY_ACTION:
				setOtherRecoveryAction(OTHER_RECOVERY_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__APPLICABLE_METHOD:
				setApplicableMethod(APPLICABLE_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__CLIENT_RETRIES:
				setClientRetries(CLIENT_RETRIES_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_NAMES:
				getDefaultInputNames().clear();
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_VALUES:
				getDefaultInputValues().clear();
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__INTERACTIVE_TIMEOUT:
				setInteractiveTimeout(INTERACTIVE_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__RUN_IN_SILENT_MODE:
				setRunInSilentMode(RUN_IN_SILENT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__TERMINATE_ON_TIMEOUT:
				setTerminateOnTimeout(TERMINATE_ON_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_SETTING_DATA__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval(TIME_BEFORE_REMOVAL_EDEFAULT);
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
			case CimPackage.CIM_JOB_SETTING_DATA__DELETE_ON_COMPLETION:
				return DELETE_ON_COMPLETION_EDEFAULT == null ? deleteOnCompletion != null : !DELETE_ON_COMPLETION_EDEFAULT.equals(deleteOnCompletion);
			case CimPackage.CIM_JOB_SETTING_DATA__RECOVERY_ACTION:
				return RECOVERY_ACTION_EDEFAULT == null ? recoveryAction != null : !RECOVERY_ACTION_EDEFAULT.equals(recoveryAction);
			case CimPackage.CIM_JOB_SETTING_DATA__OTHER_RECOVERY_ACTION:
				return OTHER_RECOVERY_ACTION_EDEFAULT == null ? otherRecoveryAction != null : !OTHER_RECOVERY_ACTION_EDEFAULT.equals(otherRecoveryAction);
			case CimPackage.CIM_JOB_SETTING_DATA__APPLICABLE_METHOD:
				return APPLICABLE_METHOD_EDEFAULT == null ? applicableMethod != null : !APPLICABLE_METHOD_EDEFAULT.equals(applicableMethod);
			case CimPackage.CIM_JOB_SETTING_DATA__CLIENT_RETRIES:
				return CLIENT_RETRIES_EDEFAULT == null ? clientRetries != null : !CLIENT_RETRIES_EDEFAULT.equals(clientRetries);
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_NAMES:
				return defaultInputNames != null && !defaultInputNames.isEmpty();
			case CimPackage.CIM_JOB_SETTING_DATA__DEFAULT_INPUT_VALUES:
				return defaultInputValues != null && !defaultInputValues.isEmpty();
			case CimPackage.CIM_JOB_SETTING_DATA__INTERACTIVE_TIMEOUT:
				return INTERACTIVE_TIMEOUT_EDEFAULT == null ? interactiveTimeout != null : !INTERACTIVE_TIMEOUT_EDEFAULT.equals(interactiveTimeout);
			case CimPackage.CIM_JOB_SETTING_DATA__RUN_IN_SILENT_MODE:
				return RUN_IN_SILENT_MODE_EDEFAULT == null ? runInSilentMode != null : !RUN_IN_SILENT_MODE_EDEFAULT.equals(runInSilentMode);
			case CimPackage.CIM_JOB_SETTING_DATA__TERMINATE_ON_TIMEOUT:
				return TERMINATE_ON_TIMEOUT_EDEFAULT == null ? terminateOnTimeout != null : !TERMINATE_ON_TIMEOUT_EDEFAULT.equals(terminateOnTimeout);
			case CimPackage.CIM_JOB_SETTING_DATA__TIME_BEFORE_REMOVAL:
				return TIME_BEFORE_REMOVAL_EDEFAULT == null ? timeBeforeRemoval != null : !TIME_BEFORE_REMOVAL_EDEFAULT.equals(timeBeforeRemoval);
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
		result.append(" (DeleteOnCompletion: ");
		result.append(deleteOnCompletion);
		result.append(", RecoveryAction: ");
		result.append(recoveryAction);
		result.append(", OtherRecoveryAction: ");
		result.append(otherRecoveryAction);
		result.append(", ApplicableMethod: ");
		result.append(applicableMethod);
		result.append(", ClientRetries: ");
		result.append(clientRetries);
		result.append(", DefaultInputNames: ");
		result.append(defaultInputNames);
		result.append(", DefaultInputValues: ");
		result.append(defaultInputValues);
		result.append(", InteractiveTimeout: ");
		result.append(interactiveTimeout);
		result.append(", RunInSilentMode: ");
		result.append(runInSilentMode);
		result.append(", TerminateOnTimeout: ");
		result.append(terminateOnTimeout);
		result.append(", TimeBeforeRemoval: ");
		result.append(timeBeforeRemoval);
		result.append(')');
		return result.toString();
	}

} //CIM_JobSettingDataImpl
