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

import org.dmtf.cim.CIM_DiagnosticTestForMSE;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Test For MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestForMSEImpl#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticTestForMSEImpl#getIsExclusiveForMSE <em>Is Exclusive For MSE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticTestForMSEImpl extends CIM_ProvidesServiceToElementImpl implements CIM_DiagnosticTestForMSE {
	/**
	 * The default value of the '{@link #getEstimatedTimeOfPerforming() <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 * @ordered
	 */
	protected static final Long ESTIMATED_TIME_OF_PERFORMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedTimeOfPerforming() <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 * @ordered
	 */
	protected Long estimatedTimeOfPerforming = ESTIMATED_TIME_OF_PERFORMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsExclusiveForMSE() <em>Is Exclusive For MSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExclusiveForMSE()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EXCLUSIVE_FOR_MSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExclusiveForMSE() <em>Is Exclusive For MSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExclusiveForMSE()
	 * @generated
	 * @ordered
	 */
	protected Boolean isExclusiveForMSE = IS_EXCLUSIVE_FOR_MSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticTestForMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticTestForMSE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEstimatedTimeOfPerforming() {
		return estimatedTimeOfPerforming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedTimeOfPerforming(Long newEstimatedTimeOfPerforming) {
		Long oldEstimatedTimeOfPerforming = estimatedTimeOfPerforming;
		estimatedTimeOfPerforming = newEstimatedTimeOfPerforming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__ESTIMATED_TIME_OF_PERFORMING, oldEstimatedTimeOfPerforming, estimatedTimeOfPerforming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsExclusiveForMSE() {
		return isExclusiveForMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExclusiveForMSE(Boolean newIsExclusiveForMSE) {
		Boolean oldIsExclusiveForMSE = isExclusiveForMSE;
		isExclusiveForMSE = newIsExclusiveForMSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__IS_EXCLUSIVE_FOR_MSE, oldIsExclusiveForMSE, isExclusiveForMSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__ESTIMATED_TIME_OF_PERFORMING:
				return getEstimatedTimeOfPerforming();
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__IS_EXCLUSIVE_FOR_MSE:
				return getIsExclusiveForMSE();
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
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__ESTIMATED_TIME_OF_PERFORMING:
				setEstimatedTimeOfPerforming((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__IS_EXCLUSIVE_FOR_MSE:
				setIsExclusiveForMSE((Boolean)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__ESTIMATED_TIME_OF_PERFORMING:
				setEstimatedTimeOfPerforming(ESTIMATED_TIME_OF_PERFORMING_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__IS_EXCLUSIVE_FOR_MSE:
				setIsExclusiveForMSE(IS_EXCLUSIVE_FOR_MSE_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__ESTIMATED_TIME_OF_PERFORMING:
				return ESTIMATED_TIME_OF_PERFORMING_EDEFAULT == null ? estimatedTimeOfPerforming != null : !ESTIMATED_TIME_OF_PERFORMING_EDEFAULT.equals(estimatedTimeOfPerforming);
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE__IS_EXCLUSIVE_FOR_MSE:
				return IS_EXCLUSIVE_FOR_MSE_EDEFAULT == null ? isExclusiveForMSE != null : !IS_EXCLUSIVE_FOR_MSE_EDEFAULT.equals(isExclusiveForMSE);
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
		result.append(" (EstimatedTimeOfPerforming: ");
		result.append(estimatedTimeOfPerforming);
		result.append(", IsExclusiveForMSE: ");
		result.append(isExclusiveForMSE);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticTestForMSEImpl
