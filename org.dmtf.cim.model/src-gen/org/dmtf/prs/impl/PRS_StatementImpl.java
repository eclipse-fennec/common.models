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

import org.dmtf.prs.PRS_Statement;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getStatementRole <em>Statement Role</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getStatementOperator <em>Statement Operator</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getFeatureValue <em>Feature Value</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_StatementImpl#getRelevance <em>Relevance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_StatementImpl extends PRS_ExpressionElementImpl implements PRS_Statement {
	/**
	 * The default value of the '{@link #getStatementRole() <em>Statement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATEMENT_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementRole() <em>Statement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementRole()
	 * @generated
	 * @ordered
	 */
	protected Integer statementRole = STATEMENT_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatementOperator() <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementOperator() <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOperator()
	 * @generated
	 * @ordered
	 */
	protected String statementOperator = STATEMENT_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureValue() <em>Feature Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureValue() <em>Feature Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureValue()
	 * @generated
	 * @ordered
	 */
	protected String featureValue = FEATURE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected String order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevance() <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELEVANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelevance() <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected Integer relevance = RELEVANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStatementRole() {
		return statementRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementRole(Integer newStatementRole) {
		Integer oldStatementRole = statementRole;
		statementRole = newStatementRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__STATEMENT_ROLE, oldStatementRole, statementRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatementOperator() {
		return statementOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementOperator(String newStatementOperator) {
		String oldStatementOperator = statementOperator;
		statementOperator = newStatementOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__STATEMENT_OPERATOR, oldStatementOperator, statementOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureValue() {
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureValue(String newFeatureValue) {
		String oldFeatureValue = featureValue;
		featureValue = newFeatureValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__FEATURE_VALUE, oldFeatureValue, featureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(String newOrder) {
		String oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelevance() {
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevance(Integer newRelevance) {
		Integer oldRelevance = relevance;
		relevance = newRelevance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_STATEMENT__RELEVANCE, oldRelevance, relevance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_STATEMENT__STATEMENT_ROLE:
				return getStatementRole();
			case PrsPackage.PRS_STATEMENT__TEXT:
				return getText();
			case PrsPackage.PRS_STATEMENT__STATEMENT_OPERATOR:
				return getStatementOperator();
			case PrsPackage.PRS_STATEMENT__FEATURE_VALUE:
				return getFeatureValue();
			case PrsPackage.PRS_STATEMENT__ORDER:
				return getOrder();
			case PrsPackage.PRS_STATEMENT__RELEVANCE:
				return getRelevance();
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
			case PrsPackage.PRS_STATEMENT__STATEMENT_ROLE:
				setStatementRole((Integer)newValue);
				return;
			case PrsPackage.PRS_STATEMENT__TEXT:
				setText((String)newValue);
				return;
			case PrsPackage.PRS_STATEMENT__STATEMENT_OPERATOR:
				setStatementOperator((String)newValue);
				return;
			case PrsPackage.PRS_STATEMENT__FEATURE_VALUE:
				setFeatureValue((String)newValue);
				return;
			case PrsPackage.PRS_STATEMENT__ORDER:
				setOrder((String)newValue);
				return;
			case PrsPackage.PRS_STATEMENT__RELEVANCE:
				setRelevance((Integer)newValue);
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
			case PrsPackage.PRS_STATEMENT__STATEMENT_ROLE:
				setStatementRole(STATEMENT_ROLE_EDEFAULT);
				return;
			case PrsPackage.PRS_STATEMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case PrsPackage.PRS_STATEMENT__STATEMENT_OPERATOR:
				setStatementOperator(STATEMENT_OPERATOR_EDEFAULT);
				return;
			case PrsPackage.PRS_STATEMENT__FEATURE_VALUE:
				setFeatureValue(FEATURE_VALUE_EDEFAULT);
				return;
			case PrsPackage.PRS_STATEMENT__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case PrsPackage.PRS_STATEMENT__RELEVANCE:
				setRelevance(RELEVANCE_EDEFAULT);
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
			case PrsPackage.PRS_STATEMENT__STATEMENT_ROLE:
				return STATEMENT_ROLE_EDEFAULT == null ? statementRole != null : !STATEMENT_ROLE_EDEFAULT.equals(statementRole);
			case PrsPackage.PRS_STATEMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case PrsPackage.PRS_STATEMENT__STATEMENT_OPERATOR:
				return STATEMENT_OPERATOR_EDEFAULT == null ? statementOperator != null : !STATEMENT_OPERATOR_EDEFAULT.equals(statementOperator);
			case PrsPackage.PRS_STATEMENT__FEATURE_VALUE:
				return FEATURE_VALUE_EDEFAULT == null ? featureValue != null : !FEATURE_VALUE_EDEFAULT.equals(featureValue);
			case PrsPackage.PRS_STATEMENT__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case PrsPackage.PRS_STATEMENT__RELEVANCE:
				return RELEVANCE_EDEFAULT == null ? relevance != null : !RELEVANCE_EDEFAULT.equals(relevance);
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
		result.append(" (StatementRole: ");
		result.append(statementRole);
		result.append(", Text: ");
		result.append(text);
		result.append(", StatementOperator: ");
		result.append(statementOperator);
		result.append(", FeatureValue: ");
		result.append(featureValue);
		result.append(", Order: ");
		result.append(order);
		result.append(", Relevance: ");
		result.append(relevance);
		result.append(')');
		return result.toString();
	}

} //PRS_StatementImpl
