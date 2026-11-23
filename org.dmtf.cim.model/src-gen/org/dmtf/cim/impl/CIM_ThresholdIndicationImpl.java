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

import org.dmtf.cim.CIM_ThresholdIndication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Threshold Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThresholdIndicationImpl#getThresholdIdentifier <em>Threshold Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThresholdIndicationImpl#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ThresholdIndicationImpl#getObservedValue <em>Observed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ThresholdIndicationImpl extends CIM_AlertIndicationImpl implements CIM_ThresholdIndication {
	/**
	 * The default value of the '{@link #getThresholdIdentifier() <em>Threshold Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdIdentifier() <em>Threshold Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String thresholdIdentifier = THRESHOLD_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdValue()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdValue()
	 * @generated
	 * @ordered
	 */
	protected String thresholdValue = THRESHOLD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservedValue() <em>Observed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservedValue() <em>Observed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedValue()
	 * @generated
	 * @ordered
	 */
	protected String observedValue = OBSERVED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ThresholdIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ThresholdIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThresholdIdentifier() {
		return thresholdIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdIdentifier(String newThresholdIdentifier) {
		String oldThresholdIdentifier = thresholdIdentifier;
		thresholdIdentifier = newThresholdIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_IDENTIFIER, oldThresholdIdentifier, thresholdIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThresholdValue() {
		return thresholdValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdValue(String newThresholdValue) {
		String oldThresholdValue = thresholdValue;
		thresholdValue = newThresholdValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_VALUE, oldThresholdValue, thresholdValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservedValue() {
		return observedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedValue(String newObservedValue) {
		String oldObservedValue = observedValue;
		observedValue = newObservedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_THRESHOLD_INDICATION__OBSERVED_VALUE, oldObservedValue, observedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_IDENTIFIER:
				return getThresholdIdentifier();
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_VALUE:
				return getThresholdValue();
			case CimPackage.CIM_THRESHOLD_INDICATION__OBSERVED_VALUE:
				return getObservedValue();
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
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_IDENTIFIER:
				setThresholdIdentifier((String)newValue);
				return;
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_VALUE:
				setThresholdValue((String)newValue);
				return;
			case CimPackage.CIM_THRESHOLD_INDICATION__OBSERVED_VALUE:
				setObservedValue((String)newValue);
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
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_IDENTIFIER:
				setThresholdIdentifier(THRESHOLD_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_VALUE:
				setThresholdValue(THRESHOLD_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_THRESHOLD_INDICATION__OBSERVED_VALUE:
				setObservedValue(OBSERVED_VALUE_EDEFAULT);
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
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_IDENTIFIER:
				return THRESHOLD_IDENTIFIER_EDEFAULT == null ? thresholdIdentifier != null : !THRESHOLD_IDENTIFIER_EDEFAULT.equals(thresholdIdentifier);
			case CimPackage.CIM_THRESHOLD_INDICATION__THRESHOLD_VALUE:
				return THRESHOLD_VALUE_EDEFAULT == null ? thresholdValue != null : !THRESHOLD_VALUE_EDEFAULT.equals(thresholdValue);
			case CimPackage.CIM_THRESHOLD_INDICATION__OBSERVED_VALUE:
				return OBSERVED_VALUE_EDEFAULT == null ? observedValue != null : !OBSERVED_VALUE_EDEFAULT.equals(observedValue);
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
		result.append(" (ThresholdIdentifier: ");
		result.append(thresholdIdentifier);
		result.append(", ThresholdValue: ");
		result.append(thresholdValue);
		result.append(", ObservedValue: ");
		result.append(observedValue);
		result.append(')');
		return result.toString();
	}

} //CIM_ThresholdIndicationImpl
