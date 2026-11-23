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

import org.dmtf.cim.CIM_InstMethodCall;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Inst Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstMethodCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstMethodCallImpl#getMethodParameters <em>Method Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstMethodCallImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_InstMethodCallImpl#getPreCall <em>Pre Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InstMethodCallImpl extends CIM_InstIndicationImpl implements CIM_InstMethodCall {
	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodParameters() <em>Method Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodParameters() <em>Method Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParameters()
	 * @generated
	 * @ordered
	 */
	protected String methodParameters = METHOD_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected String returnValue = RETURN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreCall() <em>Pre Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCall()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRE_CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCall() <em>Pre Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCall()
	 * @generated
	 * @ordered
	 */
	protected Boolean preCall = PRE_CALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InstMethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InstMethodCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_METHOD_CALL__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodParameters() {
		return methodParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodParameters(String newMethodParameters) {
		String oldMethodParameters = methodParameters;
		methodParameters = newMethodParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_METHOD_CALL__METHOD_PARAMETERS, oldMethodParameters, methodParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnValue(String newReturnValue) {
		String oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_METHOD_CALL__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPreCall() {
		return preCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreCall(Boolean newPreCall) {
		Boolean oldPreCall = preCall;
		preCall = newPreCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INST_METHOD_CALL__PRE_CALL, oldPreCall, preCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_NAME:
				return getMethodName();
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_PARAMETERS:
				return getMethodParameters();
			case CimPackage.CIM_INST_METHOD_CALL__RETURN_VALUE:
				return getReturnValue();
			case CimPackage.CIM_INST_METHOD_CALL__PRE_CALL:
				return getPreCall();
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
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_PARAMETERS:
				setMethodParameters((String)newValue);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__RETURN_VALUE:
				setReturnValue((String)newValue);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__PRE_CALL:
				setPreCall((Boolean)newValue);
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
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_PARAMETERS:
				setMethodParameters(METHOD_PARAMETERS_EDEFAULT);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__RETURN_VALUE:
				setReturnValue(RETURN_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_INST_METHOD_CALL__PRE_CALL:
				setPreCall(PRE_CALL_EDEFAULT);
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
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case CimPackage.CIM_INST_METHOD_CALL__METHOD_PARAMETERS:
				return METHOD_PARAMETERS_EDEFAULT == null ? methodParameters != null : !METHOD_PARAMETERS_EDEFAULT.equals(methodParameters);
			case CimPackage.CIM_INST_METHOD_CALL__RETURN_VALUE:
				return RETURN_VALUE_EDEFAULT == null ? returnValue != null : !RETURN_VALUE_EDEFAULT.equals(returnValue);
			case CimPackage.CIM_INST_METHOD_CALL__PRE_CALL:
				return PRE_CALL_EDEFAULT == null ? preCall != null : !PRE_CALL_EDEFAULT.equals(preCall);
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
		result.append(" (MethodName: ");
		result.append(methodName);
		result.append(", MethodParameters: ");
		result.append(methodParameters);
		result.append(", ReturnValue: ");
		result.append(returnValue);
		result.append(", PreCall: ");
		result.append(preCall);
		result.append(')');
		return result.toString();
	}

} //CIM_InstMethodCallImpl
