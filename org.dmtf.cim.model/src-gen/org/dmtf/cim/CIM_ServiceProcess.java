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
 * A representation of the model object '<em><b>CIM Service Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceProcess is an association used to establish relationships between Services and Processes. It is used to indicate if a Service is running in a particular Process. It is also used to indicate, via the ExecutionType property, if the Service started and is wholly responsible for the Process, or if the Service is running in an existing Process, perhaps with other unrelated Services, which is owned or started by a different entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceProcess#getService <em>Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceProcess#getProcess <em>Process</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceProcess#getExecutionType <em>Execution Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceProcess()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.14.0' UMLPackagePath='CIM::System::Processing' keys='Service,Process'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Service whose Process is described by this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(CIM_Service)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceProcess_Service()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Service REF' Key='true'"
	 * @generated
	 */
	CIM_Service getService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceProcess#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CIM_Service value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Process which represents or hosts the executing Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(CIM_Process)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceProcess_Process()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Process REF' Key='true'"
	 * @generated
	 */
	CIM_Process getProcess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceProcess#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(CIM_Process value);

	/**
	 * Returns the value of the '<em><b>Execution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Type</em>' attribute.
	 * @see #setExecutionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceProcess_ExecutionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Executes in Existing Process\",\"Executes as Independent Process\"]'"
	 * @generated
	 */
	Integer getExecutionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceProcess#getExecutionType <em>Execution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Type</em>' attribute.
	 * @see #getExecutionType()
	 * @generated
	 */
	void setExecutionType(Integer value);

} // CIM_ServiceProcess
