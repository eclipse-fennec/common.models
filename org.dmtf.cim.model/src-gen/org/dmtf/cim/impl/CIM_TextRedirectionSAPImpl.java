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

import org.dmtf.cim.CIM_TextRedirectionSAP;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Text Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TextRedirectionSAPImpl#getSessionTerminateSequence <em>Session Terminate Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TextRedirectionSAPImpl#getTextFlowType <em>Text Flow Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TextRedirectionSAPImpl#getOtherTextFlowType <em>Other Text Flow Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TextRedirectionSAPImpl extends CIM_ServiceAccessPointImpl implements CIM_TextRedirectionSAP {
	/**
	 * The default value of the '{@link #getSessionTerminateSequence() <em>Session Terminate Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTerminateSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TERMINATE_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionTerminateSequence() <em>Session Terminate Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTerminateSequence()
	 * @generated
	 * @ordered
	 */
	protected String sessionTerminateSequence = SESSION_TERMINATE_SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFlowType() <em>Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFlowType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEXT_FLOW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFlowType() <em>Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFlowType()
	 * @generated
	 * @ordered
	 */
	protected Integer textFlowType = TEXT_FLOW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTextFlowType() <em>Other Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTextFlowType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TEXT_FLOW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTextFlowType() <em>Other Text Flow Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTextFlowType()
	 * @generated
	 * @ordered
	 */
	protected String otherTextFlowType = OTHER_TEXT_FLOW_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TextRedirectionSAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TextRedirectionSAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionTerminateSequence() {
		return sessionTerminateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionTerminateSequence(String newSessionTerminateSequence) {
		String oldSessionTerminateSequence = sessionTerminateSequence;
		sessionTerminateSequence = newSessionTerminateSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TEXT_REDIRECTION_SAP__SESSION_TERMINATE_SEQUENCE, oldSessionTerminateSequence, sessionTerminateSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextFlowType() {
		return textFlowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFlowType(Integer newTextFlowType) {
		Integer oldTextFlowType = textFlowType;
		textFlowType = newTextFlowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TEXT_REDIRECTION_SAP__TEXT_FLOW_TYPE, oldTextFlowType, textFlowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTextFlowType() {
		return otherTextFlowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTextFlowType(String newOtherTextFlowType) {
		String oldOtherTextFlowType = otherTextFlowType;
		otherTextFlowType = newOtherTextFlowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TEXT_REDIRECTION_SAP__OTHER_TEXT_FLOW_TYPE, oldOtherTextFlowType, otherTextFlowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__SESSION_TERMINATE_SEQUENCE:
				return getSessionTerminateSequence();
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__TEXT_FLOW_TYPE:
				return getTextFlowType();
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__OTHER_TEXT_FLOW_TYPE:
				return getOtherTextFlowType();
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
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__SESSION_TERMINATE_SEQUENCE:
				setSessionTerminateSequence((String)newValue);
				return;
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__TEXT_FLOW_TYPE:
				setTextFlowType((Integer)newValue);
				return;
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__OTHER_TEXT_FLOW_TYPE:
				setOtherTextFlowType((String)newValue);
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
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__SESSION_TERMINATE_SEQUENCE:
				setSessionTerminateSequence(SESSION_TERMINATE_SEQUENCE_EDEFAULT);
				return;
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__TEXT_FLOW_TYPE:
				setTextFlowType(TEXT_FLOW_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__OTHER_TEXT_FLOW_TYPE:
				setOtherTextFlowType(OTHER_TEXT_FLOW_TYPE_EDEFAULT);
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
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__SESSION_TERMINATE_SEQUENCE:
				return SESSION_TERMINATE_SEQUENCE_EDEFAULT == null ? sessionTerminateSequence != null : !SESSION_TERMINATE_SEQUENCE_EDEFAULT.equals(sessionTerminateSequence);
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__TEXT_FLOW_TYPE:
				return TEXT_FLOW_TYPE_EDEFAULT == null ? textFlowType != null : !TEXT_FLOW_TYPE_EDEFAULT.equals(textFlowType);
			case CimPackage.CIM_TEXT_REDIRECTION_SAP__OTHER_TEXT_FLOW_TYPE:
				return OTHER_TEXT_FLOW_TYPE_EDEFAULT == null ? otherTextFlowType != null : !OTHER_TEXT_FLOW_TYPE_EDEFAULT.equals(otherTextFlowType);
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
		result.append(" (SessionTerminateSequence: ");
		result.append(sessionTerminateSequence);
		result.append(", TextFlowType: ");
		result.append(textFlowType);
		result.append(", OtherTextFlowType: ");
		result.append(otherTextFlowType);
		result.append(')');
		return result.toString();
	}

} //CIM_TextRedirectionSAPImpl
