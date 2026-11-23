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

import org.dmtf.cim.CIM_QueryCondition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Query Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryConditionImpl#getQueryResultName <em>Query Result Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryConditionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryConditionImpl#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryConditionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueryConditionImpl extends CIM_PolicyConditionImpl implements CIM_QueryCondition {
	/**
	 * The default value of the '{@link #getQueryResultName() <em>Query Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryResultName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_RESULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryResultName() <em>Query Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryResultName()
	 * @generated
	 * @ordered
	 */
	protected String queryResultName = QUERY_RESULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUERY_LANGUAGE_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer queryLanguage = QUERY_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRIGGER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Boolean trigger = TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_QueryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueryCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueryResultName() {
		return queryResultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryResultName(String newQueryResultName) {
		String oldQueryResultName = queryResultName;
		queryResultName = newQueryResultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_CONDITION__QUERY_RESULT_NAME, oldQueryResultName, queryResultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_CONDITION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQueryLanguage() {
		return queryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLanguage(Integer newQueryLanguage) {
		Integer oldQueryLanguage = queryLanguage;
		queryLanguage = newQueryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_CONDITION__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(Boolean newTrigger) {
		Boolean oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_CONDITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUERY_CONDITION__QUERY_RESULT_NAME:
				return getQueryResultName();
			case CimPackage.CIM_QUERY_CONDITION__QUERY:
				return getQuery();
			case CimPackage.CIM_QUERY_CONDITION__QUERY_LANGUAGE:
				return getQueryLanguage();
			case CimPackage.CIM_QUERY_CONDITION__TRIGGER:
				return getTrigger();
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
			case CimPackage.CIM_QUERY_CONDITION__QUERY_RESULT_NAME:
				setQueryResultName((String)newValue);
				return;
			case CimPackage.CIM_QUERY_CONDITION__QUERY:
				setQuery((String)newValue);
				return;
			case CimPackage.CIM_QUERY_CONDITION__QUERY_LANGUAGE:
				setQueryLanguage((Integer)newValue);
				return;
			case CimPackage.CIM_QUERY_CONDITION__TRIGGER:
				setTrigger((Boolean)newValue);
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
			case CimPackage.CIM_QUERY_CONDITION__QUERY_RESULT_NAME:
				setQueryResultName(QUERY_RESULT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_CONDITION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_CONDITION__QUERY_LANGUAGE:
				setQueryLanguage(QUERY_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_CONDITION__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
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
			case CimPackage.CIM_QUERY_CONDITION__QUERY_RESULT_NAME:
				return QUERY_RESULT_NAME_EDEFAULT == null ? queryResultName != null : !QUERY_RESULT_NAME_EDEFAULT.equals(queryResultName);
			case CimPackage.CIM_QUERY_CONDITION__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case CimPackage.CIM_QUERY_CONDITION__QUERY_LANGUAGE:
				return QUERY_LANGUAGE_EDEFAULT == null ? queryLanguage != null : !QUERY_LANGUAGE_EDEFAULT.equals(queryLanguage);
			case CimPackage.CIM_QUERY_CONDITION__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
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
		result.append(" (QueryResultName: ");
		result.append(queryResultName);
		result.append(", Query: ");
		result.append(query);
		result.append(", QueryLanguage: ");
		result.append(queryLanguage);
		result.append(", Trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

} //CIM_QueryConditionImpl
