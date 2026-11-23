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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_MethodParameters;
import org.dmtf.cim.CIM_ParameterValueSources;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Parameter Value Sources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParameterValueSourcesImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParameterValueSourcesImpl#getValueSource <em>Value Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ParameterValueSourcesImpl extends MinimalEObjectImpl.Container implements CIM_ParameterValueSources {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected CIM_MethodParameters parameters;

	/**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement valueSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ParameterValueSourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ParameterValueSources();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MethodParameters getParameters() {
		if (parameters != null && parameters.eIsProxy()) {
			InternalEObject oldParameters = (InternalEObject)parameters;
			parameters = (CIM_MethodParameters)eResolveProxy(oldParameters);
			if (parameters != oldParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS, oldParameters, parameters));
			}
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_MethodParameters basicGetParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters(CIM_MethodParameters newParameters) {
		CIM_MethodParameters oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getValueSource() {
		if (valueSource != null && valueSource.eIsProxy()) {
			InternalEObject oldValueSource = (InternalEObject)valueSource;
			valueSource = (CIM_ManagedElement)eResolveProxy(oldValueSource);
			if (valueSource != oldValueSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE, oldValueSource, valueSource));
			}
		}
		return valueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetValueSource() {
		return valueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueSource(CIM_ManagedElement newValueSource) {
		CIM_ManagedElement oldValueSource = valueSource;
		valueSource = newValueSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE, oldValueSource, valueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS:
				if (resolve) return getParameters();
				return basicGetParameters();
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE:
				if (resolve) return getValueSource();
				return basicGetValueSource();
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
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS:
				setParameters((CIM_MethodParameters)newValue);
				return;
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE:
				setValueSource((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS:
				setParameters((CIM_MethodParameters)null);
				return;
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE:
				setValueSource((CIM_ManagedElement)null);
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
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__PARAMETERS:
				return parameters != null;
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES__VALUE_SOURCE:
				return valueSource != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ParameterValueSourcesImpl
