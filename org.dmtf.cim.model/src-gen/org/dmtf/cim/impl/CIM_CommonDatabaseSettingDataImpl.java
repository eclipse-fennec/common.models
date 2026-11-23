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

import org.dmtf.cim.CIM_CommonDatabaseSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Common Database Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseSettingDataImpl#getRecoverabilityOption <em>Recoverability Option</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseSettingDataImpl#getOtherRecoverabilityOption <em>Other Recoverability Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CommonDatabaseSettingDataImpl extends CIM_SettingDataImpl implements CIM_CommonDatabaseSettingData {
	/**
	 * The default value of the '{@link #getRecoverabilityOption() <em>Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverabilityOption()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECOVERABILITY_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoverabilityOption() <em>Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverabilityOption()
	 * @generated
	 * @ordered
	 */
	protected Integer recoverabilityOption = RECOVERABILITY_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRecoverabilityOption() <em>Other Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoverabilityOption()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RECOVERABILITY_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRecoverabilityOption() <em>Other Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoverabilityOption()
	 * @generated
	 * @ordered
	 */
	protected String otherRecoverabilityOption = OTHER_RECOVERABILITY_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CommonDatabaseSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CommonDatabaseSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRecoverabilityOption() {
		return recoverabilityOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoverabilityOption(Integer newRecoverabilityOption) {
		Integer oldRecoverabilityOption = recoverabilityOption;
		recoverabilityOption = newRecoverabilityOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__RECOVERABILITY_OPTION, oldRecoverabilityOption, recoverabilityOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRecoverabilityOption() {
		return otherRecoverabilityOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRecoverabilityOption(String newOtherRecoverabilityOption) {
		String oldOtherRecoverabilityOption = otherRecoverabilityOption;
		otherRecoverabilityOption = newOtherRecoverabilityOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__OTHER_RECOVERABILITY_OPTION, oldOtherRecoverabilityOption, otherRecoverabilityOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__RECOVERABILITY_OPTION:
				return getRecoverabilityOption();
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__OTHER_RECOVERABILITY_OPTION:
				return getOtherRecoverabilityOption();
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
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__RECOVERABILITY_OPTION:
				setRecoverabilityOption((Integer)newValue);
				return;
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__OTHER_RECOVERABILITY_OPTION:
				setOtherRecoverabilityOption((String)newValue);
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
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__RECOVERABILITY_OPTION:
				setRecoverabilityOption(RECOVERABILITY_OPTION_EDEFAULT);
				return;
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__OTHER_RECOVERABILITY_OPTION:
				setOtherRecoverabilityOption(OTHER_RECOVERABILITY_OPTION_EDEFAULT);
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
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__RECOVERABILITY_OPTION:
				return RECOVERABILITY_OPTION_EDEFAULT == null ? recoverabilityOption != null : !RECOVERABILITY_OPTION_EDEFAULT.equals(recoverabilityOption);
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA__OTHER_RECOVERABILITY_OPTION:
				return OTHER_RECOVERABILITY_OPTION_EDEFAULT == null ? otherRecoverabilityOption != null : !OTHER_RECOVERABILITY_OPTION_EDEFAULT.equals(otherRecoverabilityOption);
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
		result.append(" (RecoverabilityOption: ");
		result.append(recoverabilityOption);
		result.append(", OtherRecoverabilityOption: ");
		result.append(otherRecoverabilityOption);
		result.append(')');
		return result.toString();
	}

} //CIM_CommonDatabaseSettingDataImpl
