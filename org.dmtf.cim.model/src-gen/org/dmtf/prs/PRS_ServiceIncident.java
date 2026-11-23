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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Service Incident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_ServiceIncident contains the fundamental information related to a specific incident: its identity, status, priority, etc. The actual incident data, including specific transactions and resolution information, is contained in the objects associated with PRS_ServiceIncident. These include specific Problem, Resolution and Activity related objects accrued through the Transaction workflow.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterID <em>Requester ID</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterSeverity <em>Requester Severity</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getProviderPriority <em>Provider Priority</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getWorkflowStatus <em>Workflow Status</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getComment <em>Comment</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getEntitled <em>Entitled</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getAcknowledge <em>Acknowledge</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ServiceIncident#getLastTransaction <em>Last Transaction</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_ServiceIncident extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Requester ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier for this incident assigned by the Requester.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester ID</em>' attribute.
	 * @see #setRequesterID(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_RequesterID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRequesterID();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterID <em>Requester ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester ID</em>' attribute.
	 * @see #getRequesterID()
	 * @generated
	 */
	void setRequesterID(String value);

	/**
	 * Returns the value of the '<em><b>Provider ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier for this incident assigned by the Provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider ID</em>' attribute.
	 * @see #setProviderID(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_ProviderID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getProviderID();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getProviderID <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider ID</em>' attribute.
	 * @see #getProviderID()
	 * @generated
	 */
	void setProviderID(String value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the incident within the Service Incident Exchange Standard transaction model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current State</em>' attribute.
	 * @see #setCurrentState(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_CurrentState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"254\",\"255\"]' Values='[\"Beginning_State\",\"Not_Entitled\",\"Entitled\",\"Problem_Submitted\",\"Open_Requester\",\"Open_Provider\",\"Closed_Pending_Confirmation\",\"Closed\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getCurrentState();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' attribute.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(Integer value);

	/**
	 * Returns the value of the '<em><b>Requester Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The severity of the incident as defined by the Requester. One is the most severe and five is the least severe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester Severity</em>' attribute.
	 * @see #setRequesterSeverity(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_RequesterSeverity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]'"
	 * @generated
	 */
	Integer getRequesterSeverity();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getRequesterSeverity <em>Requester Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester Severity</em>' attribute.
	 * @see #getRequesterSeverity()
	 * @generated
	 */
	void setRequesterSeverity(Integer value);

	/**
	 * Returns the value of the '<em><b>Provider Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the incident as defined by the Requester. One is the highest priority and five is the lowest priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Priority</em>' attribute.
	 * @see #setProviderPriority(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_ProviderPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]'"
	 * @generated
	 */
	Integer getProviderPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getProviderPriority <em>Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Priority</em>' attribute.
	 * @see #getProviderPriority()
	 * @generated
	 */
	void setProviderPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The explicit time the Requester expects a response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_ResponseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(String value);

	/**
	 * Returns the value of the '<em><b>Workflow Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the incident according to the workflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflow Status</em>' attribute.
	 * @see #setWorkflowStatus(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_WorkflowStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getWorkflowStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getWorkflowStatus <em>Workflow Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Status</em>' attribute.
	 * @see #getWorkflowStatus()
	 * @generated
	 */
	void setWorkflowStatus(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional general information about the incident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_Comment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Entitled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is the Requester entitled to service or not?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entitled</em>' attribute.
	 * @see #setEntitled(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_Entitled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"254\",\"255\"]' Values='[\"Yes\",\"No\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getEntitled();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getEntitled <em>Entitled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entitled</em>' attribute.
	 * @see #getEntitled()
	 * @generated
	 */
	void setEntitled(Integer value);

	/**
	 * Returns the value of the '<em><b>Acknowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Was the last transaction was accepted or rejected?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acknowledge</em>' attribute.
	 * @see #setAcknowledge(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_Acknowledge()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"254\",\"255\"]' Values='[\"Yes\",\"No\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getAcknowledge();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getAcknowledge <em>Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledge</em>' attribute.
	 * @see #getAcknowledge()
	 * @generated
	 */
	void setAcknowledge(Integer value);

	/**
	 * Returns the value of the '<em><b>Transaction Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of the TransactionName property is deprecated. New Service Incidents should use the LastTransaction property and set this property to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Name</em>' attribute.
	 * @see #setTransactionName(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_TransactionName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"PRS_ServiceIncident.LastTransaction\"]'"
	 * @generated
	 */
	String getTransactionName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getTransactionName <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Name</em>' attribute.
	 * @see #getTransactionName()
	 * @generated
	 */
	void setTransactionName(String value);

	/**
	 * Returns the value of the '<em><b>Last Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the last transaction which was acknowledged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Transaction</em>' attribute.
	 * @see #setLastTransaction(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceIncident_LastTransaction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]' Values='[\"Service_Request\",\"Entitlement\",\"Problem_Submittal\",\"Accept_Problem\",\"Problem_Resolution\",\"Request_Problem_Information\",\"Provide_Problem_Information\",\"Provide_Admin_Information\",\"Query_Incident\",\"Confirm_Close\",\"Reject_Resolution\",\"Request_Closure\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getLastTransaction();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ServiceIncident#getLastTransaction <em>Last Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Transaction</em>' attribute.
	 * @see #getLastTransaction()
	 * @generated
	 */
	void setLastTransaction(Integer value);

} // PRS_ServiceIncident
