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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_ServiceIncident;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Service Incident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getRequesterID <em>Requester ID</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getRequesterSeverity <em>Requester Severity</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getProviderPriority <em>Provider Priority</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getWorkflowStatus <em>Workflow Status</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getEntitled <em>Entitled</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getAcknowledge <em>Acknowledge</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_ServiceIncidentImpl#getLastTransaction <em>Last Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_ServiceIncidentImpl extends PRS_ExchangeElementImpl implements PRS_ServiceIncident {
	/**
	 * The default value of the '{@link #getRequesterID() <em>Requester ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterID()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUESTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequesterID() <em>Requester ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterID()
	 * @generated
	 * @ordered
	 */
	protected String requesterID = REQUESTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderID()
	 * @generated
	 * @ordered
	 */
	protected String providerID = PROVIDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected Integer currentState = CURRENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequesterSeverity() <em>Requester Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTER_SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequesterSeverity() <em>Requester Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterSeverity()
	 * @generated
	 * @ordered
	 */
	protected Integer requesterSeverity = REQUESTER_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderPriority() <em>Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROVIDER_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderPriority() <em>Provider Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer providerPriority = PROVIDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected String responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkflowStatus() <em>Workflow Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKFLOW_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflowStatus() <em>Workflow Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowStatus()
	 * @generated
	 * @ordered
	 */
	protected String workflowStatus = WORKFLOW_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntitled() <em>Entitled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitled()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENTITLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitled() <em>Entitled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitled()
	 * @generated
	 * @ordered
	 */
	protected Integer entitled = ENTITLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcknowledge() <em>Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledge()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACKNOWLEDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcknowledge() <em>Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledge()
	 * @generated
	 * @ordered
	 */
	protected Integer acknowledge = ACKNOWLEDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionName()
	 * @generated
	 * @ordered
	 */
	protected String transactionName = TRANSACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTransaction() <em>Last Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_TRANSACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastTransaction() <em>Last Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTransaction()
	 * @generated
	 * @ordered
	 */
	protected Integer lastTransaction = LAST_TRANSACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_ServiceIncidentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_SERVICE_INCIDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequesterID() {
		return requesterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequesterID(String newRequesterID) {
		String oldRequesterID = requesterID;
		requesterID = newRequesterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_ID, oldRequesterID, requesterID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderID() {
		return providerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderID(String newProviderID) {
		String oldProviderID = providerID;
		providerID = newProviderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_ID, oldProviderID, providerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentState(Integer newCurrentState) {
		Integer oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequesterSeverity() {
		return requesterSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequesterSeverity(Integer newRequesterSeverity) {
		Integer oldRequesterSeverity = requesterSeverity;
		requesterSeverity = newRequesterSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY, oldRequesterSeverity, requesterSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProviderPriority() {
		return providerPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderPriority(Integer newProviderPriority) {
		Integer oldProviderPriority = providerPriority;
		providerPriority = newProviderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY, oldProviderPriority, providerPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTime(String newResponseTime) {
		String oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkflowStatus() {
		return workflowStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflowStatus(String newWorkflowStatus) {
		String oldWorkflowStatus = workflowStatus;
		workflowStatus = newWorkflowStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__WORKFLOW_STATUS, oldWorkflowStatus, workflowStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEntitled() {
		return entitled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitled(Integer newEntitled) {
		Integer oldEntitled = entitled;
		entitled = newEntitled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__ENTITLED, oldEntitled, entitled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAcknowledge() {
		return acknowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcknowledge(Integer newAcknowledge) {
		Integer oldAcknowledge = acknowledge;
		acknowledge = newAcknowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__ACKNOWLEDGE, oldAcknowledge, acknowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionName() {
		return transactionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionName(String newTransactionName) {
		String oldTransactionName = transactionName;
		transactionName = newTransactionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__TRANSACTION_NAME, oldTransactionName, transactionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastTransaction() {
		return lastTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTransaction(Integer newLastTransaction) {
		Integer oldLastTransaction = lastTransaction;
		lastTransaction = newLastTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_SERVICE_INCIDENT__LAST_TRANSACTION, oldLastTransaction, lastTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_ID:
				return getRequesterID();
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_ID:
				return getProviderID();
			case PrsPackage.PRS_SERVICE_INCIDENT__CURRENT_STATE:
				return getCurrentState();
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY:
				return getRequesterSeverity();
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY:
				return getProviderPriority();
			case PrsPackage.PRS_SERVICE_INCIDENT__RESPONSE_TIME:
				return getResponseTime();
			case PrsPackage.PRS_SERVICE_INCIDENT__WORKFLOW_STATUS:
				return getWorkflowStatus();
			case PrsPackage.PRS_SERVICE_INCIDENT__COMMENT:
				return getComment();
			case PrsPackage.PRS_SERVICE_INCIDENT__ENTITLED:
				return getEntitled();
			case PrsPackage.PRS_SERVICE_INCIDENT__ACKNOWLEDGE:
				return getAcknowledge();
			case PrsPackage.PRS_SERVICE_INCIDENT__TRANSACTION_NAME:
				return getTransactionName();
			case PrsPackage.PRS_SERVICE_INCIDENT__LAST_TRANSACTION:
				return getLastTransaction();
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
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_ID:
				setRequesterID((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_ID:
				setProviderID((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__CURRENT_STATE:
				setCurrentState((Integer)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY:
				setRequesterSeverity((Integer)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY:
				setProviderPriority((Integer)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__RESPONSE_TIME:
				setResponseTime((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__WORKFLOW_STATUS:
				setWorkflowStatus((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__COMMENT:
				setComment((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__ENTITLED:
				setEntitled((Integer)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__ACKNOWLEDGE:
				setAcknowledge((Integer)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__TRANSACTION_NAME:
				setTransactionName((String)newValue);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__LAST_TRANSACTION:
				setLastTransaction((Integer)newValue);
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
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_ID:
				setRequesterID(REQUESTER_ID_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_ID:
				setProviderID(PROVIDER_ID_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__CURRENT_STATE:
				setCurrentState(CURRENT_STATE_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY:
				setRequesterSeverity(REQUESTER_SEVERITY_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY:
				setProviderPriority(PROVIDER_PRIORITY_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__WORKFLOW_STATUS:
				setWorkflowStatus(WORKFLOW_STATUS_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__ENTITLED:
				setEntitled(ENTITLED_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__ACKNOWLEDGE:
				setAcknowledge(ACKNOWLEDGE_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__TRANSACTION_NAME:
				setTransactionName(TRANSACTION_NAME_EDEFAULT);
				return;
			case PrsPackage.PRS_SERVICE_INCIDENT__LAST_TRANSACTION:
				setLastTransaction(LAST_TRANSACTION_EDEFAULT);
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
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_ID:
				return REQUESTER_ID_EDEFAULT == null ? requesterID != null : !REQUESTER_ID_EDEFAULT.equals(requesterID);
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_ID:
				return PROVIDER_ID_EDEFAULT == null ? providerID != null : !PROVIDER_ID_EDEFAULT.equals(providerID);
			case PrsPackage.PRS_SERVICE_INCIDENT__CURRENT_STATE:
				return CURRENT_STATE_EDEFAULT == null ? currentState != null : !CURRENT_STATE_EDEFAULT.equals(currentState);
			case PrsPackage.PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY:
				return REQUESTER_SEVERITY_EDEFAULT == null ? requesterSeverity != null : !REQUESTER_SEVERITY_EDEFAULT.equals(requesterSeverity);
			case PrsPackage.PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY:
				return PROVIDER_PRIORITY_EDEFAULT == null ? providerPriority != null : !PROVIDER_PRIORITY_EDEFAULT.equals(providerPriority);
			case PrsPackage.PRS_SERVICE_INCIDENT__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case PrsPackage.PRS_SERVICE_INCIDENT__WORKFLOW_STATUS:
				return WORKFLOW_STATUS_EDEFAULT == null ? workflowStatus != null : !WORKFLOW_STATUS_EDEFAULT.equals(workflowStatus);
			case PrsPackage.PRS_SERVICE_INCIDENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PrsPackage.PRS_SERVICE_INCIDENT__ENTITLED:
				return ENTITLED_EDEFAULT == null ? entitled != null : !ENTITLED_EDEFAULT.equals(entitled);
			case PrsPackage.PRS_SERVICE_INCIDENT__ACKNOWLEDGE:
				return ACKNOWLEDGE_EDEFAULT == null ? acknowledge != null : !ACKNOWLEDGE_EDEFAULT.equals(acknowledge);
			case PrsPackage.PRS_SERVICE_INCIDENT__TRANSACTION_NAME:
				return TRANSACTION_NAME_EDEFAULT == null ? transactionName != null : !TRANSACTION_NAME_EDEFAULT.equals(transactionName);
			case PrsPackage.PRS_SERVICE_INCIDENT__LAST_TRANSACTION:
				return LAST_TRANSACTION_EDEFAULT == null ? lastTransaction != null : !LAST_TRANSACTION_EDEFAULT.equals(lastTransaction);
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
		result.append(" (RequesterID: ");
		result.append(requesterID);
		result.append(", ProviderID: ");
		result.append(providerID);
		result.append(", CurrentState: ");
		result.append(currentState);
		result.append(", RequesterSeverity: ");
		result.append(requesterSeverity);
		result.append(", ProviderPriority: ");
		result.append(providerPriority);
		result.append(", ResponseTime: ");
		result.append(responseTime);
		result.append(", WorkflowStatus: ");
		result.append(workflowStatus);
		result.append(", Comment: ");
		result.append(comment);
		result.append(", Entitled: ");
		result.append(entitled);
		result.append(", Acknowledge: ");
		result.append(acknowledge);
		result.append(", TransactionName: ");
		result.append(transactionName);
		result.append(", LastTransaction: ");
		result.append(lastTransaction);
		result.append(')');
		return result.toString();
	}

} //PRS_ServiceIncidentImpl
