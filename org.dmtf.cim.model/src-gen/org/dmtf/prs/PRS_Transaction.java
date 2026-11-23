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
 * A representation of the model object '<em><b>PRS Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Transaction represents a single transaction of the Service Incident workflow. A PRS_Transaction instance is created by the PRS_SISService StartSISTransaction method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Transaction#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Transaction#getTransactionState <em>Transaction State</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Transaction#getCompletionStatus <em>Completion Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Transaction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Transaction extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific SIS transaction represented by this PRS_Transaction instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see #setTransactionType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Transaction_TransactionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]' Values='[\"Service_Request\",\"Entitlement\",\"Problem_Submittal\",\"Accept_Problem\",\"Problem_Resolution\",\"Request_Problem_Information\",\"Provide_Problem_Information\",\"Provide_Admin_Information\",\"Query_Incident\",\"Confirm_Close\",\"Reject_Resolution\",\"Request_Closure\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getTransactionType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Transaction#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(Integer value);

	/**
	 * Returns the value of the '<em><b>Transaction State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of this transaction. This value is manipulated by the PRS_SISService:StartSISTransaction and SetSISCompletionStatus method implementations. This property is not intended to be written by management applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction State</em>' attribute.
	 * @see #setTransactionState(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Transaction_TransactionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Open\",\"Working\",\"Closed\",\"Notification_Pending\"]'"
	 * @generated
	 */
	Integer getTransactionState();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Transaction#getTransactionState <em>Transaction State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction State</em>' attribute.
	 * @see #getTransactionState()
	 * @generated
	 */
	void setTransactionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Completion Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the transaction after it has reached the 'Closed' state. A CompletionStatus of zero (0) means the tranasaction completed successfully. A non-zero CompletionStatus indicates the transaction did not complete successfully. Non-zero values are implementation-specific. While the transaction is 'Open' or 'Working' the CompletionStatus property shall be zero (0). See the description for PRS_SISService for the definition of the contents of this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Status</em>' attribute.
	 * @see #setCompletionStatus(Long)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Transaction_CompletionStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getCompletionStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Transaction#getCompletionStatus <em>Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Status</em>' attribute.
	 * @see #getCompletionStatus()
	 * @generated
	 */
	void setCompletionStatus(Long value);

} // PRS_Transaction
