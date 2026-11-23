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

import org.dmtf.cim.CIM_MeterService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Meter Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MeterServiceImpl#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MeterServiceImpl#getOtherMeterType <em>Other Meter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MeterServiceImpl#getConformanceLevels <em>Conformance Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MeterServiceImpl extends CIM_ConditioningServiceImpl implements CIM_MeterService {
	/**
	 * The default value of the '{@link #getMeterType() <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer METER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterType() <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterType()
	 * @generated
	 * @ordered
	 */
	protected Integer meterType = METER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMeterType() <em>Other Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMeterType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_METER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMeterType() <em>Other Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMeterType()
	 * @generated
	 * @ordered
	 */
	protected String otherMeterType = OTHER_METER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformanceLevels() <em>Conformance Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceLevels()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONFORMANCE_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformanceLevels() <em>Conformance Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceLevels()
	 * @generated
	 * @ordered
	 */
	protected Integer conformanceLevels = CONFORMANCE_LEVELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MeterServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MeterService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMeterType() {
		return meterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterType(Integer newMeterType) {
		Integer oldMeterType = meterType;
		meterType = newMeterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METER_SERVICE__METER_TYPE, oldMeterType, meterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMeterType() {
		return otherMeterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMeterType(String newOtherMeterType) {
		String oldOtherMeterType = otherMeterType;
		otherMeterType = newOtherMeterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METER_SERVICE__OTHER_METER_TYPE, oldOtherMeterType, otherMeterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConformanceLevels() {
		return conformanceLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformanceLevels(Integer newConformanceLevels) {
		Integer oldConformanceLevels = conformanceLevels;
		conformanceLevels = newConformanceLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METER_SERVICE__CONFORMANCE_LEVELS, oldConformanceLevels, conformanceLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METER_SERVICE__METER_TYPE:
				return getMeterType();
			case CimPackage.CIM_METER_SERVICE__OTHER_METER_TYPE:
				return getOtherMeterType();
			case CimPackage.CIM_METER_SERVICE__CONFORMANCE_LEVELS:
				return getConformanceLevels();
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
			case CimPackage.CIM_METER_SERVICE__METER_TYPE:
				setMeterType((Integer)newValue);
				return;
			case CimPackage.CIM_METER_SERVICE__OTHER_METER_TYPE:
				setOtherMeterType((String)newValue);
				return;
			case CimPackage.CIM_METER_SERVICE__CONFORMANCE_LEVELS:
				setConformanceLevels((Integer)newValue);
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
			case CimPackage.CIM_METER_SERVICE__METER_TYPE:
				setMeterType(METER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_METER_SERVICE__OTHER_METER_TYPE:
				setOtherMeterType(OTHER_METER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_METER_SERVICE__CONFORMANCE_LEVELS:
				setConformanceLevels(CONFORMANCE_LEVELS_EDEFAULT);
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
			case CimPackage.CIM_METER_SERVICE__METER_TYPE:
				return METER_TYPE_EDEFAULT == null ? meterType != null : !METER_TYPE_EDEFAULT.equals(meterType);
			case CimPackage.CIM_METER_SERVICE__OTHER_METER_TYPE:
				return OTHER_METER_TYPE_EDEFAULT == null ? otherMeterType != null : !OTHER_METER_TYPE_EDEFAULT.equals(otherMeterType);
			case CimPackage.CIM_METER_SERVICE__CONFORMANCE_LEVELS:
				return CONFORMANCE_LEVELS_EDEFAULT == null ? conformanceLevels != null : !CONFORMANCE_LEVELS_EDEFAULT.equals(conformanceLevels);
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
		result.append(" (MeterType: ");
		result.append(meterType);
		result.append(", OtherMeterType: ");
		result.append(otherMeterType);
		result.append(", ConformanceLevels: ");
		result.append(conformanceLevels);
		result.append(')');
		return result.toString();
	}

} //CIM_MeterServiceImpl
