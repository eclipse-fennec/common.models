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

import org.dmtf.cim.CIM_X509CredentialFilterEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM X509 Credential Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CredentialFilterEntryImpl#getMatchFieldName <em>Match Field Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_X509CredentialFilterEntryImpl#getMatchFieldValue <em>Match Field Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_X509CredentialFilterEntryImpl extends CIM_FilterEntryBaseImpl implements CIM_X509CredentialFilterEntry {
	/**
	 * The default value of the '{@link #getMatchFieldName() <em>Match Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final Long MATCH_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchFieldName() <em>Match Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFieldName()
	 * @generated
	 * @ordered
	 */
	protected Long matchFieldName = MATCH_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchFieldValue() <em>Match Field Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFieldValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_FIELD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchFieldValue() <em>Match Field Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchFieldValue()
	 * @generated
	 * @ordered
	 */
	protected String matchFieldValue = MATCH_FIELD_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_X509CredentialFilterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_X509CredentialFilterEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMatchFieldName() {
		return matchFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchFieldName(Long newMatchFieldName) {
		Long oldMatchFieldName = matchFieldName;
		matchFieldName = newMatchFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_NAME, oldMatchFieldName, matchFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchFieldValue() {
		return matchFieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchFieldValue(String newMatchFieldValue) {
		String oldMatchFieldValue = matchFieldValue;
		matchFieldValue = newMatchFieldValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_VALUE, oldMatchFieldValue, matchFieldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_NAME:
				return getMatchFieldName();
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_VALUE:
				return getMatchFieldValue();
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
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_NAME:
				setMatchFieldName((Long)newValue);
				return;
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_VALUE:
				setMatchFieldValue((String)newValue);
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
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_NAME:
				setMatchFieldName(MATCH_FIELD_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_VALUE:
				setMatchFieldValue(MATCH_FIELD_VALUE_EDEFAULT);
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
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_NAME:
				return MATCH_FIELD_NAME_EDEFAULT == null ? matchFieldName != null : !MATCH_FIELD_NAME_EDEFAULT.equals(matchFieldName);
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY__MATCH_FIELD_VALUE:
				return MATCH_FIELD_VALUE_EDEFAULT == null ? matchFieldValue != null : !MATCH_FIELD_VALUE_EDEFAULT.equals(matchFieldValue);
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
		result.append(" (MatchFieldName: ");
		result.append(matchFieldName);
		result.append(", MatchFieldValue: ");
		result.append(matchFieldValue);
		result.append(')');
		return result.toString();
	}

} //CIM_X509CredentialFilterEntryImpl
