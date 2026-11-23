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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_MethodParameters;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Method Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MethodParametersImpl#getMethodParametersId <em>Method Parameters Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_MethodParametersImpl extends CIM_ManagedElementImpl implements CIM_MethodParameters {
	/**
	 * The default value of the '{@link #getMethodParametersId() <em>Method Parameters Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParametersId()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_PARAMETERS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodParametersId() <em>Method Parameters Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParametersId()
	 * @generated
	 * @ordered
	 */
	protected String methodParametersId = METHOD_PARAMETERS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MethodParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MethodParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodParametersId() {
		return methodParametersId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodParametersId(String newMethodParametersId) {
		String oldMethodParametersId = methodParametersId;
		methodParametersId = newMethodParametersId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METHOD_PARAMETERS__METHOD_PARAMETERS_ID, oldMethodParametersId, methodParametersId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ResetValues(CIM_ManagedElement SourceME) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METHOD_PARAMETERS__METHOD_PARAMETERS_ID:
				return getMethodParametersId();
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
			case CimPackage.CIM_METHOD_PARAMETERS__METHOD_PARAMETERS_ID:
				setMethodParametersId((String)newValue);
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
			case CimPackage.CIM_METHOD_PARAMETERS__METHOD_PARAMETERS_ID:
				setMethodParametersId(METHOD_PARAMETERS_ID_EDEFAULT);
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
			case CimPackage.CIM_METHOD_PARAMETERS__METHOD_PARAMETERS_ID:
				return METHOD_PARAMETERS_ID_EDEFAULT == null ? methodParametersId != null : !METHOD_PARAMETERS_ID_EDEFAULT.equals(methodParametersId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_METHOD_PARAMETERS___RESET_VALUES__CIM_MANAGEDELEMENT:
				return ResetValues((CIM_ManagedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (MethodParametersId: ");
		result.append(methodParametersId);
		result.append(')');
		return result.toString();
	}

} //CIM_MethodParametersImpl
