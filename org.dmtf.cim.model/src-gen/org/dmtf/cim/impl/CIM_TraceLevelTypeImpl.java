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

import java.util.Collection;

import org.dmtf.cim.CIM_TraceLevelType;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Trace Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TraceLevelTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TraceLevelTypeImpl#getTraceValues <em>Trace Values</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TraceLevelTypeImpl#getValueDescriptions <em>Value Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TraceLevelTypeImpl extends CIM_ManagedElementImpl implements CIM_TraceLevelType {
	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected Integer baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceValues() <em>Trace Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> traceValues;

	/**
	 * The cached value of the '{@link #getValueDescriptions() <em>Value Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> valueDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TraceLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TraceLevelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseType(Integer newBaseType) {
		Integer oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRACE_LEVEL_TYPE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getTraceValues() {
		if (traceValues == null) {
			traceValues = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_TRACE_LEVEL_TYPE__TRACE_VALUES);
		}
		return traceValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValueDescriptions() {
		if (valueDescriptions == null) {
			valueDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TRACE_LEVEL_TYPE__VALUE_DESCRIPTIONS);
		}
		return valueDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TRACE_LEVEL_TYPE__BASE_TYPE:
				return getBaseType();
			case CimPackage.CIM_TRACE_LEVEL_TYPE__TRACE_VALUES:
				return getTraceValues();
			case CimPackage.CIM_TRACE_LEVEL_TYPE__VALUE_DESCRIPTIONS:
				return getValueDescriptions();
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
			case CimPackage.CIM_TRACE_LEVEL_TYPE__BASE_TYPE:
				setBaseType((Integer)newValue);
				return;
			case CimPackage.CIM_TRACE_LEVEL_TYPE__TRACE_VALUES:
				getTraceValues().clear();
				getTraceValues().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_TRACE_LEVEL_TYPE__VALUE_DESCRIPTIONS:
				getValueDescriptions().clear();
				getValueDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_TRACE_LEVEL_TYPE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_TRACE_LEVEL_TYPE__TRACE_VALUES:
				getTraceValues().clear();
				return;
			case CimPackage.CIM_TRACE_LEVEL_TYPE__VALUE_DESCRIPTIONS:
				getValueDescriptions().clear();
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
			case CimPackage.CIM_TRACE_LEVEL_TYPE__BASE_TYPE:
				return BASE_TYPE_EDEFAULT == null ? baseType != null : !BASE_TYPE_EDEFAULT.equals(baseType);
			case CimPackage.CIM_TRACE_LEVEL_TYPE__TRACE_VALUES:
				return traceValues != null && !traceValues.isEmpty();
			case CimPackage.CIM_TRACE_LEVEL_TYPE__VALUE_DESCRIPTIONS:
				return valueDescriptions != null && !valueDescriptions.isEmpty();
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
		result.append(" (BaseType: ");
		result.append(baseType);
		result.append(", TraceValues: ");
		result.append(traceValues);
		result.append(", ValueDescriptions: ");
		result.append(valueDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_TraceLevelTypeImpl
