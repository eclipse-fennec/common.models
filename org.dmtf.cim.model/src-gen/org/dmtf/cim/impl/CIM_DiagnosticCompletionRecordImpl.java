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

import org.dmtf.cim.CIM_DiagnosticCompletionRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Completion Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticCompletionRecordImpl#getCompletionState <em>Completion State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticCompletionRecordImpl#getOtherCompletionStateDescription <em>Other Completion State Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticCompletionRecordImpl extends CIM_DiagnosticServiceRecordImpl implements CIM_DiagnosticCompletionRecord {
	/**
	 * The default value of the '{@link #getCompletionState() <em>Completion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPLETION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionState() <em>Completion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionState()
	 * @generated
	 * @ordered
	 */
	protected Integer completionState = COMPLETION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCompletionStateDescription() <em>Other Completion State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompletionStateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COMPLETION_STATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCompletionStateDescription() <em>Other Completion State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompletionStateDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCompletionStateDescription = OTHER_COMPLETION_STATE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticCompletionRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticCompletionRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompletionState() {
		return completionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionState(Integer newCompletionState) {
		Integer oldCompletionState = completionState;
		completionState = newCompletionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__COMPLETION_STATE, oldCompletionState, completionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCompletionStateDescription() {
		return otherCompletionStateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCompletionStateDescription(String newOtherCompletionStateDescription) {
		String oldOtherCompletionStateDescription = otherCompletionStateDescription;
		otherCompletionStateDescription = newOtherCompletionStateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__OTHER_COMPLETION_STATE_DESCRIPTION, oldOtherCompletionStateDescription, otherCompletionStateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__COMPLETION_STATE:
				return getCompletionState();
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__OTHER_COMPLETION_STATE_DESCRIPTION:
				return getOtherCompletionStateDescription();
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
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__COMPLETION_STATE:
				setCompletionState((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__OTHER_COMPLETION_STATE_DESCRIPTION:
				setOtherCompletionStateDescription((String)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__COMPLETION_STATE:
				setCompletionState(COMPLETION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__OTHER_COMPLETION_STATE_DESCRIPTION:
				setOtherCompletionStateDescription(OTHER_COMPLETION_STATE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__COMPLETION_STATE:
				return COMPLETION_STATE_EDEFAULT == null ? completionState != null : !COMPLETION_STATE_EDEFAULT.equals(completionState);
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD__OTHER_COMPLETION_STATE_DESCRIPTION:
				return OTHER_COMPLETION_STATE_DESCRIPTION_EDEFAULT == null ? otherCompletionStateDescription != null : !OTHER_COMPLETION_STATE_DESCRIPTION_EDEFAULT.equals(otherCompletionStateDescription);
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
		result.append(" (CompletionState: ");
		result.append(completionState);
		result.append(", OtherCompletionStateDescription: ");
		result.append(otherCompletionStateDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticCompletionRecordImpl
