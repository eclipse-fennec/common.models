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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AssessmentSelectControlById;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Select Control By Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSelectControlByIdImpl#getStatementId <em>Statement Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentSelectControlByIdImpl#getControlId <em>Control Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentSelectControlByIdImpl extends MinimalEObjectImpl.Container implements AssessmentSelectControlById {
	/**
	 * The cached value of the '{@link #getStatementId() <em>Statement Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> statementId;

	/**
	 * The default value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected String controlId = CONTROL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSelectControlByIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentSelectControlById();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStatementId() {
		if (statementId == null) {
			statementId = new EDataTypeEList<String>(String.class, this, OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID);
		}
		return statementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlId() {
		return controlId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlId(String newControlId) {
		String oldControlId = controlId;
		controlId = newControlId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID, oldControlId, controlId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID:
				return getStatementId();
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID:
				return getControlId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID:
				getStatementId().clear();
				getStatementId().addAll((Collection<? extends String>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID:
				setControlId((String)newValue);
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
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID:
				getStatementId().clear();
				return;
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID:
				setControlId(CONTROL_ID_EDEFAULT);
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
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID:
				return statementId != null && !statementId.isEmpty();
			case OSCALPackage.ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID:
				return CONTROL_ID_EDEFAULT == null ? controlId != null : !CONTROL_ID_EDEFAULT.equals(controlId);
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
		result.append(" (statementId: ");
		result.append(statementId);
		result.append(", controlId: ");
		result.append(controlId);
		result.append(')');
		return result.toString();
	}

} //AssessmentSelectControlByIdImpl
