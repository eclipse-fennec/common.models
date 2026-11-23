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

import org.dmtf.cim.CIM_PowerSource;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSourceImpl#getRatedMaxOutputPower <em>Rated Max Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSourceImpl#getOutputPowerUnits <em>Output Power Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerSourceImpl#getIsACOutput <em>Is AC Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerSourceImpl extends CIM_LogicalDeviceImpl implements CIM_PowerSource {
	/**
	 * The default value of the '{@link #getRatedMaxOutputPower() <em>Rated Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedMaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long RATED_MAX_OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatedMaxOutputPower() <em>Rated Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedMaxOutputPower()
	 * @generated
	 * @ordered
	 */
	protected Long ratedMaxOutputPower = RATED_MAX_OUTPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputPowerUnits() <em>Output Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_POWER_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPowerUnits() <em>Output Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected String outputPowerUnits = OUTPUT_POWER_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsACOutput() <em>Is AC Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsACOutput()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_AC_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsACOutput() <em>Is AC Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsACOutput()
	 * @generated
	 * @ordered
	 */
	protected Boolean isACOutput = IS_AC_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRatedMaxOutputPower() {
		return ratedMaxOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatedMaxOutputPower(Long newRatedMaxOutputPower) {
		Long oldRatedMaxOutputPower = ratedMaxOutputPower;
		ratedMaxOutputPower = newRatedMaxOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SOURCE__RATED_MAX_OUTPUT_POWER, oldRatedMaxOutputPower, ratedMaxOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputPowerUnits() {
		return outputPowerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPowerUnits(String newOutputPowerUnits) {
		String oldOutputPowerUnits = outputPowerUnits;
		outputPowerUnits = newOutputPowerUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SOURCE__OUTPUT_POWER_UNITS, oldOutputPowerUnits, outputPowerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsACOutput() {
		return isACOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsACOutput(Boolean newIsACOutput) {
		Boolean oldIsACOutput = isACOutput;
		isACOutput = newIsACOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_SOURCE__IS_AC_OUTPUT, oldIsACOutput, isACOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWER_SOURCE__RATED_MAX_OUTPUT_POWER:
				return getRatedMaxOutputPower();
			case CimPackage.CIM_POWER_SOURCE__OUTPUT_POWER_UNITS:
				return getOutputPowerUnits();
			case CimPackage.CIM_POWER_SOURCE__IS_AC_OUTPUT:
				return getIsACOutput();
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
			case CimPackage.CIM_POWER_SOURCE__RATED_MAX_OUTPUT_POWER:
				setRatedMaxOutputPower((Long)newValue);
				return;
			case CimPackage.CIM_POWER_SOURCE__OUTPUT_POWER_UNITS:
				setOutputPowerUnits((String)newValue);
				return;
			case CimPackage.CIM_POWER_SOURCE__IS_AC_OUTPUT:
				setIsACOutput((Boolean)newValue);
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
			case CimPackage.CIM_POWER_SOURCE__RATED_MAX_OUTPUT_POWER:
				setRatedMaxOutputPower(RATED_MAX_OUTPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SOURCE__OUTPUT_POWER_UNITS:
				setOutputPowerUnits(OUTPUT_POWER_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_SOURCE__IS_AC_OUTPUT:
				setIsACOutput(IS_AC_OUTPUT_EDEFAULT);
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
			case CimPackage.CIM_POWER_SOURCE__RATED_MAX_OUTPUT_POWER:
				return RATED_MAX_OUTPUT_POWER_EDEFAULT == null ? ratedMaxOutputPower != null : !RATED_MAX_OUTPUT_POWER_EDEFAULT.equals(ratedMaxOutputPower);
			case CimPackage.CIM_POWER_SOURCE__OUTPUT_POWER_UNITS:
				return OUTPUT_POWER_UNITS_EDEFAULT == null ? outputPowerUnits != null : !OUTPUT_POWER_UNITS_EDEFAULT.equals(outputPowerUnits);
			case CimPackage.CIM_POWER_SOURCE__IS_AC_OUTPUT:
				return IS_AC_OUTPUT_EDEFAULT == null ? isACOutput != null : !IS_AC_OUTPUT_EDEFAULT.equals(isACOutput);
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
		result.append(" (RatedMaxOutputPower: ");
		result.append(ratedMaxOutputPower);
		result.append(", OutputPowerUnits: ");
		result.append(outputPowerUnits);
		result.append(", IsACOutput: ");
		result.append(isACOutput);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerSourceImpl
