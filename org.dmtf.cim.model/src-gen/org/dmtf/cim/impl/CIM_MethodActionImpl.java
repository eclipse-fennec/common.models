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

import org.dmtf.cim.CIM_MethodAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Method Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodActionImpl#getInstMethodCallName <em>Inst Method Call Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodActionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodActionImpl#getQueryLanguage <em>Query Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MethodActionImpl extends CIM_PolicyActionImpl implements CIM_MethodAction {
	/**
	 * The default value of the '{@link #getInstMethodCallName() <em>Inst Method Call Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstMethodCallName()
	 * @generated
	 * @ordered
	 */
	protected static final String INST_METHOD_CALL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstMethodCallName() <em>Inst Method Call Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstMethodCallName()
	 * @generated
	 * @ordered
	 */
	protected String instMethodCallName = INST_METHOD_CALL_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MethodActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MethodAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstMethodCallName() {
		return instMethodCallName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstMethodCallName(String newInstMethodCallName) {
		String oldInstMethodCallName = instMethodCallName;
		instMethodCallName = newInstMethodCallName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_ACTION__INST_METHOD_CALL_NAME, oldInstMethodCallName, instMethodCallName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_ACTION__QUERY, oldQuery, query));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_ACTION__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METHOD_ACTION__INST_METHOD_CALL_NAME:
				return getInstMethodCallName();
			case CimPackage.CIM_METHOD_ACTION__QUERY:
				return getQuery();
			case CimPackage.CIM_METHOD_ACTION__QUERY_LANGUAGE:
				return getQueryLanguage();
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
			case CimPackage.CIM_METHOD_ACTION__INST_METHOD_CALL_NAME:
				setInstMethodCallName((String)newValue);
				return;
			case CimPackage.CIM_METHOD_ACTION__QUERY:
				setQuery((String)newValue);
				return;
			case CimPackage.CIM_METHOD_ACTION__QUERY_LANGUAGE:
				setQueryLanguage((Integer)newValue);
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
			case CimPackage.CIM_METHOD_ACTION__INST_METHOD_CALL_NAME:
				setInstMethodCallName(INST_METHOD_CALL_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_METHOD_ACTION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case CimPackage.CIM_METHOD_ACTION__QUERY_LANGUAGE:
				setQueryLanguage(QUERY_LANGUAGE_EDEFAULT);
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
			case CimPackage.CIM_METHOD_ACTION__INST_METHOD_CALL_NAME:
				return INST_METHOD_CALL_NAME_EDEFAULT == null ? instMethodCallName != null : !INST_METHOD_CALL_NAME_EDEFAULT.equals(instMethodCallName);
			case CimPackage.CIM_METHOD_ACTION__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case CimPackage.CIM_METHOD_ACTION__QUERY_LANGUAGE:
				return QUERY_LANGUAGE_EDEFAULT == null ? queryLanguage != null : !QUERY_LANGUAGE_EDEFAULT.equals(queryLanguage);
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
		result.append(" (InstMethodCallName: ");
		result.append(instMethodCallName);
		result.append(", Query: ");
		result.append(query);
		result.append(", QueryLanguage: ");
		result.append(queryLanguage);
		result.append(')');
		return result.toString();
	}

} //CIM_MethodActionImpl
