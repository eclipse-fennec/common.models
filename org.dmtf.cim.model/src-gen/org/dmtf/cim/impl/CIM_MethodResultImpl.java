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

import org.dmtf.cim.CIM_MethodResult;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodResultImpl#getPreCallIndication <em>Pre Call Indication</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodResultImpl#getPostCallIndication <em>Post Call Indication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MethodResultImpl extends CIM_ManagedElementImpl implements CIM_MethodResult {
	/**
	 * The default value of the '{@link #getPreCallIndication() <em>Pre Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCallIndication()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CALL_INDICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCallIndication() <em>Pre Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCallIndication()
	 * @generated
	 * @ordered
	 */
	protected String preCallIndication = PRE_CALL_INDICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCallIndication() <em>Post Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCallIndication()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CALL_INDICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCallIndication() <em>Post Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCallIndication()
	 * @generated
	 * @ordered
	 */
	protected String postCallIndication = POST_CALL_INDICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MethodResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreCallIndication() {
		return preCallIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreCallIndication(String newPreCallIndication) {
		String oldPreCallIndication = preCallIndication;
		preCallIndication = newPreCallIndication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_RESULT__PRE_CALL_INDICATION, oldPreCallIndication, preCallIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostCallIndication() {
		return postCallIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCallIndication(String newPostCallIndication) {
		String oldPostCallIndication = postCallIndication;
		postCallIndication = newPostCallIndication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_RESULT__POST_CALL_INDICATION, oldPostCallIndication, postCallIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METHOD_RESULT__PRE_CALL_INDICATION:
				return getPreCallIndication();
			case CimPackage.CIM_METHOD_RESULT__POST_CALL_INDICATION:
				return getPostCallIndication();
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
			case CimPackage.CIM_METHOD_RESULT__PRE_CALL_INDICATION:
				setPreCallIndication((String)newValue);
				return;
			case CimPackage.CIM_METHOD_RESULT__POST_CALL_INDICATION:
				setPostCallIndication((String)newValue);
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
			case CimPackage.CIM_METHOD_RESULT__PRE_CALL_INDICATION:
				setPreCallIndication(PRE_CALL_INDICATION_EDEFAULT);
				return;
			case CimPackage.CIM_METHOD_RESULT__POST_CALL_INDICATION:
				setPostCallIndication(POST_CALL_INDICATION_EDEFAULT);
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
			case CimPackage.CIM_METHOD_RESULT__PRE_CALL_INDICATION:
				return PRE_CALL_INDICATION_EDEFAULT == null ? preCallIndication != null : !PRE_CALL_INDICATION_EDEFAULT.equals(preCallIndication);
			case CimPackage.CIM_METHOD_RESULT__POST_CALL_INDICATION:
				return POST_CALL_INDICATION_EDEFAULT == null ? postCallIndication != null : !POST_CALL_INDICATION_EDEFAULT.equals(postCallIndication);
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
		result.append(" (PreCallIndication: ");
		result.append(preCallIndication);
		result.append(", PostCallIndication: ");
		result.append(postCallIndication);
		result.append(')');
		return result.toString();
	}

} //CIM_MethodResultImpl
