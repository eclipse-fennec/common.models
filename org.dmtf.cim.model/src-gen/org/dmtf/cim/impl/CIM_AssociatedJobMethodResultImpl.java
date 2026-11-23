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

import org.dmtf.cim.CIM_AssociatedJobMethodResult;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_MethodResult;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated Job Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedJobMethodResultImpl#getJob <em>Job</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedJobMethodResultImpl#getJobParameters <em>Job Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedJobMethodResultImpl extends MinimalEObjectImpl.Container implements CIM_AssociatedJobMethodResult {
	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected CIM_ConcreteJob job;

	/**
	 * The cached value of the '{@link #getJobParameters() <em>Job Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobParameters()
	 * @generated
	 * @ordered
	 */
	protected CIM_MethodResult jobParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssociatedJobMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedJobMethodResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteJob getJob() {
		if (job != null && job.eIsProxy()) {
			InternalEObject oldJob = (InternalEObject)job;
			job = (CIM_ConcreteJob)eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ConcreteJob basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(CIM_ConcreteJob newJob) {
		CIM_ConcreteJob oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB, oldJob, job));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MethodResult getJobParameters() {
		if (jobParameters != null && jobParameters.eIsProxy()) {
			InternalEObject oldJobParameters = (InternalEObject)jobParameters;
			jobParameters = (CIM_MethodResult)eResolveProxy(oldJobParameters);
			if (jobParameters != oldJobParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS, oldJobParameters, jobParameters));
			}
		}
		return jobParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_MethodResult basicGetJobParameters() {
		return jobParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobParameters(CIM_MethodResult newJobParameters) {
		CIM_MethodResult oldJobParameters = jobParameters;
		jobParameters = newJobParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS, oldJobParameters, jobParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB:
				if (resolve) return getJob();
				return basicGetJob();
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS:
				if (resolve) return getJobParameters();
				return basicGetJobParameters();
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
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB:
				setJob((CIM_ConcreteJob)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS:
				setJobParameters((CIM_MethodResult)newValue);
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
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB:
				setJob((CIM_ConcreteJob)null);
				return;
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS:
				setJobParameters((CIM_MethodResult)null);
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
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB:
				return job != null;
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT__JOB_PARAMETERS:
				return jobParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AssociatedJobMethodResultImpl
