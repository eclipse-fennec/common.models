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

import org.dmtf.cim.CIM_DiscreteSensor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Discrete Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiscreteSensorImpl#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiscreteSensorImpl#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiscreteSensorImpl#getAcceptableValues <em>Acceptable Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiscreteSensorImpl extends CIM_SensorImpl implements CIM_DiscreteSensor {
	/**
	 * The default value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_READING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected String currentReading = CURRENT_READING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossibleValues() <em>Possible Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> possibleValues;

	/**
	 * The cached value of the '{@link #getAcceptableValues() <em>Acceptable Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acceptableValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiscreteSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiscreteSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentReading() {
		return currentReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentReading(String newCurrentReading) {
		String oldCurrentReading = currentReading;
		currentReading = newCurrentReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISCRETE_SENSOR__CURRENT_READING, oldCurrentReading, currentReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPossibleValues() {
		if (possibleValues == null) {
			possibleValues = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISCRETE_SENSOR__POSSIBLE_VALUES);
		}
		return possibleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAcceptableValues() {
		if (acceptableValues == null) {
			acceptableValues = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISCRETE_SENSOR__ACCEPTABLE_VALUES);
		}
		return acceptableValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISCRETE_SENSOR__CURRENT_READING:
				return getCurrentReading();
			case CimPackage.CIM_DISCRETE_SENSOR__POSSIBLE_VALUES:
				return getPossibleValues();
			case CimPackage.CIM_DISCRETE_SENSOR__ACCEPTABLE_VALUES:
				return getAcceptableValues();
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
			case CimPackage.CIM_DISCRETE_SENSOR__CURRENT_READING:
				setCurrentReading((String)newValue);
				return;
			case CimPackage.CIM_DISCRETE_SENSOR__POSSIBLE_VALUES:
				getPossibleValues().clear();
				getPossibleValues().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DISCRETE_SENSOR__ACCEPTABLE_VALUES:
				getAcceptableValues().clear();
				getAcceptableValues().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_DISCRETE_SENSOR__CURRENT_READING:
				setCurrentReading(CURRENT_READING_EDEFAULT);
				return;
			case CimPackage.CIM_DISCRETE_SENSOR__POSSIBLE_VALUES:
				getPossibleValues().clear();
				return;
			case CimPackage.CIM_DISCRETE_SENSOR__ACCEPTABLE_VALUES:
				getAcceptableValues().clear();
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
			case CimPackage.CIM_DISCRETE_SENSOR__CURRENT_READING:
				return CURRENT_READING_EDEFAULT == null ? currentReading != null : !CURRENT_READING_EDEFAULT.equals(currentReading);
			case CimPackage.CIM_DISCRETE_SENSOR__POSSIBLE_VALUES:
				return possibleValues != null && !possibleValues.isEmpty();
			case CimPackage.CIM_DISCRETE_SENSOR__ACCEPTABLE_VALUES:
				return acceptableValues != null && !acceptableValues.isEmpty();
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
		result.append(" (CurrentReading: ");
		result.append(currentReading);
		result.append(", PossibleValues: ");
		result.append(possibleValues);
		result.append(", AcceptableValues: ");
		result.append(acceptableValues);
		result.append(')');
		return result.toString();
	}

} //CIM_DiscreteSensorImpl
