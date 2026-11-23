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
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Associated Job Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AssociatedJobMethodResult represents an association between a ConcreteJob and the MethodResult expressing the parameters for the Job when the job was created by side-effect of the execution of an extrinsic method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedJobMethodResult#getJob <em>Job</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedJobMethodResult#getJobParameters <em>Job Parameters</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedJobMethodResult()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.31.0' UMLPackagePath='CIM::System::Processing' keys='Job,JobParameters'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedJobMethodResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated ConcreteJob.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(CIM_ConcreteJob)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedJobMethodResult_Job()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_ConcreteJob getJob();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedJobMethodResult#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(CIM_ConcreteJob value);

	/**
	 * Returns the value of the '<em><b>Job Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated MethodResult.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Parameters</em>' reference.
	 * @see #setJobParameters(CIM_MethodResult)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedJobMethodResult_JobParameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MethodResult REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_MethodResult getJobParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedJobMethodResult#getJobParameters <em>Job Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Parameters</em>' reference.
	 * @see #getJobParameters()
	 * @generated
	 */
	void setJobParameters(CIM_MethodResult value);

} // CIM_AssociatedJobMethodResult
