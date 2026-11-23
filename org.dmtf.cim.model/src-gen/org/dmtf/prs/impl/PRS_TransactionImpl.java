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

import org.dmtf.prs.PRS_Transaction;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_TransactionImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_TransactionImpl#getTransactionState <em>Transaction State</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_TransactionImpl#getCompletionStatus <em>Completion Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_TransactionImpl extends PRS_ExchangeElementImpl implements PRS_Transaction {
	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSACTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected Integer transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionState() <em>Transaction State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSACTION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionState() <em>Transaction State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionState()
	 * @generated
	 * @ordered
	 */
	protected Integer transactionState = TRANSACTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionStatus() <em>Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long COMPLETION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionStatus() <em>Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionStatus()
	 * @generated
	 * @ordered
	 */
	protected Long completionStatus = COMPLETION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionType(Integer newTransactionType) {
		Integer oldTransactionType = transactionType;
		transactionType = newTransactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_TRANSACTION__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransactionState() {
		return transactionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionState(Integer newTransactionState) {
		Integer oldTransactionState = transactionState;
		transactionState = newTransactionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_TRANSACTION__TRANSACTION_STATE, oldTransactionState, transactionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCompletionStatus() {
		return completionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionStatus(Long newCompletionStatus) {
		Long oldCompletionStatus = completionStatus;
		completionStatus = newCompletionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_TRANSACTION__COMPLETION_STATUS, oldCompletionStatus, completionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_TYPE:
				return getTransactionType();
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_STATE:
				return getTransactionState();
			case PrsPackage.PRS_TRANSACTION__COMPLETION_STATUS:
				return getCompletionStatus();
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
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_TYPE:
				setTransactionType((Integer)newValue);
				return;
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_STATE:
				setTransactionState((Integer)newValue);
				return;
			case PrsPackage.PRS_TRANSACTION__COMPLETION_STATUS:
				setCompletionStatus((Long)newValue);
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
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_STATE:
				setTransactionState(TRANSACTION_STATE_EDEFAULT);
				return;
			case PrsPackage.PRS_TRANSACTION__COMPLETION_STATUS:
				setCompletionStatus(COMPLETION_STATUS_EDEFAULT);
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
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_TYPE:
				return TRANSACTION_TYPE_EDEFAULT == null ? transactionType != null : !TRANSACTION_TYPE_EDEFAULT.equals(transactionType);
			case PrsPackage.PRS_TRANSACTION__TRANSACTION_STATE:
				return TRANSACTION_STATE_EDEFAULT == null ? transactionState != null : !TRANSACTION_STATE_EDEFAULT.equals(transactionState);
			case PrsPackage.PRS_TRANSACTION__COMPLETION_STATUS:
				return COMPLETION_STATUS_EDEFAULT == null ? completionStatus != null : !COMPLETION_STATUS_EDEFAULT.equals(completionStatus);
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
		result.append(" (TransactionType: ");
		result.append(transactionType);
		result.append(", TransactionState: ");
		result.append(transactionState);
		result.append(", CompletionStatus: ");
		result.append(completionStatus);
		result.append(')');
		return result.toString();
	}

} //PRS_TransactionImpl
