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

import org.dmtf.cim.CIM_BinarySensor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Binary Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BinarySensorImpl#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BinarySensorImpl#getExpectedReading <em>Expected Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BinarySensorImpl#getInterpretationOfTrue <em>Interpretation Of True</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BinarySensorImpl#getInterpretationOfFalse <em>Interpretation Of False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BinarySensorImpl extends CIM_SensorImpl implements CIM_BinarySensor {
	/**
	 * The default value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CURRENT_READING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentReading() <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected Boolean currentReading = CURRENT_READING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedReading() <em>Expected Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedReading()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPECTED_READING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedReading() <em>Expected Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedReading()
	 * @generated
	 * @ordered
	 */
	protected Boolean expectedReading = EXPECTED_READING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpretationOfTrue() <em>Interpretation Of True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOfTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_OF_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpretationOfTrue() <em>Interpretation Of True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOfTrue()
	 * @generated
	 * @ordered
	 */
	protected String interpretationOfTrue = INTERPRETATION_OF_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpretationOfFalse() <em>Interpretation Of False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOfFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_OF_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpretationOfFalse() <em>Interpretation Of False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOfFalse()
	 * @generated
	 * @ordered
	 */
	protected String interpretationOfFalse = INTERPRETATION_OF_FALSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BinarySensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BinarySensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCurrentReading() {
		return currentReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentReading(Boolean newCurrentReading) {
		Boolean oldCurrentReading = currentReading;
		currentReading = newCurrentReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BINARY_SENSOR__CURRENT_READING, oldCurrentReading, currentReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExpectedReading() {
		return expectedReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedReading(Boolean newExpectedReading) {
		Boolean oldExpectedReading = expectedReading;
		expectedReading = newExpectedReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BINARY_SENSOR__EXPECTED_READING, oldExpectedReading, expectedReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpretationOfTrue() {
		return interpretationOfTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpretationOfTrue(String newInterpretationOfTrue) {
		String oldInterpretationOfTrue = interpretationOfTrue;
		interpretationOfTrue = newInterpretationOfTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_TRUE, oldInterpretationOfTrue, interpretationOfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpretationOfFalse() {
		return interpretationOfFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpretationOfFalse(String newInterpretationOfFalse) {
		String oldInterpretationOfFalse = interpretationOfFalse;
		interpretationOfFalse = newInterpretationOfFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_FALSE, oldInterpretationOfFalse, interpretationOfFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BINARY_SENSOR__CURRENT_READING:
				return getCurrentReading();
			case CimPackage.CIM_BINARY_SENSOR__EXPECTED_READING:
				return getExpectedReading();
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_TRUE:
				return getInterpretationOfTrue();
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_FALSE:
				return getInterpretationOfFalse();
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
			case CimPackage.CIM_BINARY_SENSOR__CURRENT_READING:
				setCurrentReading((Boolean)newValue);
				return;
			case CimPackage.CIM_BINARY_SENSOR__EXPECTED_READING:
				setExpectedReading((Boolean)newValue);
				return;
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_TRUE:
				setInterpretationOfTrue((String)newValue);
				return;
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_FALSE:
				setInterpretationOfFalse((String)newValue);
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
			case CimPackage.CIM_BINARY_SENSOR__CURRENT_READING:
				setCurrentReading(CURRENT_READING_EDEFAULT);
				return;
			case CimPackage.CIM_BINARY_SENSOR__EXPECTED_READING:
				setExpectedReading(EXPECTED_READING_EDEFAULT);
				return;
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_TRUE:
				setInterpretationOfTrue(INTERPRETATION_OF_TRUE_EDEFAULT);
				return;
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_FALSE:
				setInterpretationOfFalse(INTERPRETATION_OF_FALSE_EDEFAULT);
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
			case CimPackage.CIM_BINARY_SENSOR__CURRENT_READING:
				return CURRENT_READING_EDEFAULT == null ? currentReading != null : !CURRENT_READING_EDEFAULT.equals(currentReading);
			case CimPackage.CIM_BINARY_SENSOR__EXPECTED_READING:
				return EXPECTED_READING_EDEFAULT == null ? expectedReading != null : !EXPECTED_READING_EDEFAULT.equals(expectedReading);
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_TRUE:
				return INTERPRETATION_OF_TRUE_EDEFAULT == null ? interpretationOfTrue != null : !INTERPRETATION_OF_TRUE_EDEFAULT.equals(interpretationOfTrue);
			case CimPackage.CIM_BINARY_SENSOR__INTERPRETATION_OF_FALSE:
				return INTERPRETATION_OF_FALSE_EDEFAULT == null ? interpretationOfFalse != null : !INTERPRETATION_OF_FALSE_EDEFAULT.equals(interpretationOfFalse);
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
		result.append(", ExpectedReading: ");
		result.append(expectedReading);
		result.append(", InterpretationOfTrue: ");
		result.append(interpretationOfTrue);
		result.append(", InterpretationOfFalse: ");
		result.append(interpretationOfFalse);
		result.append(')');
		return result.toString();
	}

} //CIM_BinarySensorImpl
