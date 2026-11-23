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

import org.dmtf.prs.PRS_Feature;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_FeatureImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_FeatureImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_FeatureImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_FeatureImpl extends PRS_ExchangeElementImpl implements PRS_Feature {
	/**
	 * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected String prompt = PROMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidValues() <em>Valid Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidValues() <em>Valid Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidValues()
	 * @generated
	 * @ordered
	 */
	protected String validValues = VALID_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Integer dataType = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrompt(String newPrompt) {
		String oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_FEATURE__PROMPT, oldPrompt, prompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidValues() {
		return validValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidValues(String newValidValues) {
		String oldValidValues = validValues;
		validValues = newValidValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_FEATURE__VALID_VALUES, oldValidValues, validValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Integer newDataType) {
		Integer oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_FEATURE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_FEATURE__PROMPT:
				return getPrompt();
			case PrsPackage.PRS_FEATURE__VALID_VALUES:
				return getValidValues();
			case PrsPackage.PRS_FEATURE__DATA_TYPE:
				return getDataType();
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
			case PrsPackage.PRS_FEATURE__PROMPT:
				setPrompt((String)newValue);
				return;
			case PrsPackage.PRS_FEATURE__VALID_VALUES:
				setValidValues((String)newValue);
				return;
			case PrsPackage.PRS_FEATURE__DATA_TYPE:
				setDataType((Integer)newValue);
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
			case PrsPackage.PRS_FEATURE__PROMPT:
				setPrompt(PROMPT_EDEFAULT);
				return;
			case PrsPackage.PRS_FEATURE__VALID_VALUES:
				setValidValues(VALID_VALUES_EDEFAULT);
				return;
			case PrsPackage.PRS_FEATURE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
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
			case PrsPackage.PRS_FEATURE__PROMPT:
				return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
			case PrsPackage.PRS_FEATURE__VALID_VALUES:
				return VALID_VALUES_EDEFAULT == null ? validValues != null : !VALID_VALUES_EDEFAULT.equals(validValues);
			case PrsPackage.PRS_FEATURE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
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
		result.append(" (Prompt: ");
		result.append(prompt);
		result.append(", ValidValues: ");
		result.append(validValues);
		result.append(", DataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //PRS_FeatureImpl
