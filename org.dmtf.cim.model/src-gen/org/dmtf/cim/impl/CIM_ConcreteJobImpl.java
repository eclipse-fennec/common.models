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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Concrete Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConcreteJobImpl#getJobState <em>Job State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConcreteJobImpl#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConcreteJobImpl#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConcreteJobImpl#getJobInParameters <em>Job In Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConcreteJobImpl#getJobOutParameters <em>Job Out Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConcreteJobImpl extends CIM_JobImpl implements CIM_ConcreteJob {
	/**
	 * The default value of the '{@link #getJobState() <em>Job State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer JOB_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobState() <em>Job State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobState()
	 * @generated
	 * @ordered
	 */
	protected Integer jobState = JOB_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_STATE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastStateChange = TIME_OF_LAST_STATE_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_EDEFAULT = "00000000000500.000000:000";

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
	 * The default value of the '{@link #getJobInParameters() <em>Job In Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_IN_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInParameters() <em>Job In Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInParameters()
	 * @generated
	 * @ordered
	 */
	protected String jobInParameters = JOB_IN_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobOutParameters() <em>Job Out Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobOutParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_OUT_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobOutParameters() <em>Job Out Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobOutParameters()
	 * @generated
	 * @ordered
	 */
	protected String jobOutParameters = JOB_OUT_PARAMETERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConcreteJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConcreteJob();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getJobState() {
		return jobState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobState(Integer newJobState) {
		Integer oldJobState = jobState;
		jobState = newJobState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONCRETE_JOB__JOB_STATE, oldJobState, jobState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastStateChange() {
		return timeOfLastStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastStateChange(String newTimeOfLastStateChange) {
		String oldTimeOfLastStateChange = timeOfLastStateChange;
		timeOfLastStateChange = newTimeOfLastStateChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONCRETE_JOB__TIME_OF_LAST_STATE_CHANGE, oldTimeOfLastStateChange, timeOfLastStateChange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONCRETE_JOB__TIME_BEFORE_REMOVAL, oldTimeBeforeRemoval, timeBeforeRemoval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInParameters() {
		return jobInParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInParameters(String newJobInParameters) {
		String oldJobInParameters = jobInParameters;
		jobInParameters = newJobInParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONCRETE_JOB__JOB_IN_PARAMETERS, oldJobInParameters, jobInParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobOutParameters() {
		return jobOutParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobOutParameters(String newJobOutParameters) {
		String oldJobOutParameters = jobOutParameters;
		jobOutParameters = newJobOutParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONCRETE_JOB__JOB_OUT_PARAMETERS, oldJobOutParameters, jobOutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RequestStateChange(Integer RequestedState, String TimeoutPeriod) {
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
	public Long GetError(String Error) {
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
	public Long GetErrors(EList<String> Errors) {
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
			case CimPackage.CIM_CONCRETE_JOB__JOB_STATE:
				return getJobState();
			case CimPackage.CIM_CONCRETE_JOB__TIME_OF_LAST_STATE_CHANGE:
				return getTimeOfLastStateChange();
			case CimPackage.CIM_CONCRETE_JOB__TIME_BEFORE_REMOVAL:
				return getTimeBeforeRemoval();
			case CimPackage.CIM_CONCRETE_JOB__JOB_IN_PARAMETERS:
				return getJobInParameters();
			case CimPackage.CIM_CONCRETE_JOB__JOB_OUT_PARAMETERS:
				return getJobOutParameters();
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
			case CimPackage.CIM_CONCRETE_JOB__JOB_STATE:
				setJobState((Integer)newValue);
				return;
			case CimPackage.CIM_CONCRETE_JOB__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange((String)newValue);
				return;
			case CimPackage.CIM_CONCRETE_JOB__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval((String)newValue);
				return;
			case CimPackage.CIM_CONCRETE_JOB__JOB_IN_PARAMETERS:
				setJobInParameters((String)newValue);
				return;
			case CimPackage.CIM_CONCRETE_JOB__JOB_OUT_PARAMETERS:
				setJobOutParameters((String)newValue);
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
			case CimPackage.CIM_CONCRETE_JOB__JOB_STATE:
				setJobState(JOB_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_CONCRETE_JOB__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange(TIME_OF_LAST_STATE_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_CONCRETE_JOB__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval(TIME_BEFORE_REMOVAL_EDEFAULT);
				return;
			case CimPackage.CIM_CONCRETE_JOB__JOB_IN_PARAMETERS:
				setJobInParameters(JOB_IN_PARAMETERS_EDEFAULT);
				return;
			case CimPackage.CIM_CONCRETE_JOB__JOB_OUT_PARAMETERS:
				setJobOutParameters(JOB_OUT_PARAMETERS_EDEFAULT);
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
			case CimPackage.CIM_CONCRETE_JOB__JOB_STATE:
				return JOB_STATE_EDEFAULT == null ? jobState != null : !JOB_STATE_EDEFAULT.equals(jobState);
			case CimPackage.CIM_CONCRETE_JOB__TIME_OF_LAST_STATE_CHANGE:
				return TIME_OF_LAST_STATE_CHANGE_EDEFAULT == null ? timeOfLastStateChange != null : !TIME_OF_LAST_STATE_CHANGE_EDEFAULT.equals(timeOfLastStateChange);
			case CimPackage.CIM_CONCRETE_JOB__TIME_BEFORE_REMOVAL:
				return TIME_BEFORE_REMOVAL_EDEFAULT == null ? timeBeforeRemoval != null : !TIME_BEFORE_REMOVAL_EDEFAULT.equals(timeBeforeRemoval);
			case CimPackage.CIM_CONCRETE_JOB__JOB_IN_PARAMETERS:
				return JOB_IN_PARAMETERS_EDEFAULT == null ? jobInParameters != null : !JOB_IN_PARAMETERS_EDEFAULT.equals(jobInParameters);
			case CimPackage.CIM_CONCRETE_JOB__JOB_OUT_PARAMETERS:
				return JOB_OUT_PARAMETERS_EDEFAULT == null ? jobOutParameters != null : !JOB_OUT_PARAMETERS_EDEFAULT.equals(jobOutParameters);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_CONCRETE_JOB___REQUEST_STATE_CHANGE__INTEGER_STRING:
				return RequestStateChange((Integer)arguments.get(0), (String)arguments.get(1));
			case CimPackage.CIM_CONCRETE_JOB___GET_ERROR__STRING:
				return GetError((String)arguments.get(0));
			case CimPackage.CIM_CONCRETE_JOB___GET_ERRORS__ELIST:
				return GetErrors((EList<String>)arguments.get(0));
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
		result.append(" (JobState: ");
		result.append(jobState);
		result.append(", TimeOfLastStateChange: ");
		result.append(timeOfLastStateChange);
		result.append(", TimeBeforeRemoval: ");
		result.append(timeBeforeRemoval);
		result.append(", JobInParameters: ");
		result.append(jobInParameters);
		result.append(", JobOutParameters: ");
		result.append(jobOutParameters);
		result.append(')');
		return result.toString();
	}

} //CIM_ConcreteJobImpl
