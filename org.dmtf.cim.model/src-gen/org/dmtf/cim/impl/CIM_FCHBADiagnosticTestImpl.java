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

import org.dmtf.cim.CIM_FCHBADiagnosticTest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FCHBA Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticTestImpl#getFCHBATestType <em>FCHBA Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCHBADiagnosticTestImpl#getOtherFCHBATestTypeDescription <em>Other FCHBA Test Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCHBADiagnosticTestImpl extends CIM_DiagnosticTestImpl implements CIM_FCHBADiagnosticTest {
	/**
	 * The default value of the '{@link #getFCHBATestType() <em>FCHBA Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCHBATestType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FCHBA_TEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCHBATestType() <em>FCHBA Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCHBATestType()
	 * @generated
	 * @ordered
	 */
	protected Integer fchbaTestType = FCHBA_TEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherFCHBATestTypeDescription() <em>Other FCHBA Test Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFCHBATestTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_FCHBA_TEST_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherFCHBATestTypeDescription() <em>Other FCHBA Test Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFCHBATestTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherFCHBATestTypeDescription = OTHER_FCHBA_TEST_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCHBADiagnosticTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCHBADiagnosticTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFCHBATestType() {
		return fchbaTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCHBATestType(Integer newFCHBATestType) {
		Integer oldFCHBATestType = fchbaTestType;
		fchbaTestType = newFCHBATestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__FCHBA_TEST_TYPE, oldFCHBATestType, fchbaTestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherFCHBATestTypeDescription() {
		return otherFCHBATestTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherFCHBATestTypeDescription(String newOtherFCHBATestTypeDescription) {
		String oldOtherFCHBATestTypeDescription = otherFCHBATestTypeDescription;
		otherFCHBATestTypeDescription = newOtherFCHBATestTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__OTHER_FCHBA_TEST_TYPE_DESCRIPTION, oldOtherFCHBATestTypeDescription, otherFCHBATestTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__FCHBA_TEST_TYPE:
				return getFCHBATestType();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__OTHER_FCHBA_TEST_TYPE_DESCRIPTION:
				return getOtherFCHBATestTypeDescription();
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__FCHBA_TEST_TYPE:
				setFCHBATestType((Integer)newValue);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__OTHER_FCHBA_TEST_TYPE_DESCRIPTION:
				setOtherFCHBATestTypeDescription((String)newValue);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__FCHBA_TEST_TYPE:
				setFCHBATestType(FCHBA_TEST_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__OTHER_FCHBA_TEST_TYPE_DESCRIPTION:
				setOtherFCHBATestTypeDescription(OTHER_FCHBA_TEST_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__FCHBA_TEST_TYPE:
				return FCHBA_TEST_TYPE_EDEFAULT == null ? fchbaTestType != null : !FCHBA_TEST_TYPE_EDEFAULT.equals(fchbaTestType);
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST__OTHER_FCHBA_TEST_TYPE_DESCRIPTION:
				return OTHER_FCHBA_TEST_TYPE_DESCRIPTION_EDEFAULT == null ? otherFCHBATestTypeDescription != null : !OTHER_FCHBA_TEST_TYPE_DESCRIPTION_EDEFAULT.equals(otherFCHBATestTypeDescription);
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
		result.append(" (FCHBATestType: ");
		result.append(fchbaTestType);
		result.append(", OtherFCHBATestTypeDescription: ");
		result.append(otherFCHBATestTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_FCHBADiagnosticTestImpl
