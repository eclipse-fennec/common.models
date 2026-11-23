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

import org.dmtf.cim.CIM_OperationalPowerStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operational Power Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerStatisticalDataImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerStatisticalDataImpl#getMilliwatts <em>Milliwatts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerStatisticalDataImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OperationalPowerStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_OperationalPowerStatisticalData {
	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMilliwatts() <em>Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilliwatts()
	 * @generated
	 * @ordered
	 */
	protected static final Long MILLIWATTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMilliwatts() <em>Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilliwatts()
	 * @generated
	 * @ordered
	 */
	protected Long milliwatts = MILLIWATTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Long precision = PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperationalPowerStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperationalPowerStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(Integer newElementType) {
		Integer oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMilliwatts() {
		return milliwatts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilliwatts(Long newMilliwatts) {
		Long oldMilliwatts = milliwatts;
		milliwatts = newMilliwatts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__MILLIWATTS, oldMilliwatts, milliwatts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(Long newPrecision) {
		Long oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__MILLIWATTS:
				return getMilliwatts();
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__PRECISION:
				return getPrecision();
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__MILLIWATTS:
				setMilliwatts((Long)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__PRECISION:
				setPrecision((Long)newValue);
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__MILLIWATTS:
				setMilliwatts(MILLIWATTS_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__MILLIWATTS:
				return MILLIWATTS_EDEFAULT == null ? milliwatts != null : !MILLIWATTS_EDEFAULT.equals(milliwatts);
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
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
		result.append(" (ElementType: ");
		result.append(elementType);
		result.append(", Milliwatts: ");
		result.append(milliwatts);
		result.append(", Precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //CIM_OperationalPowerStatisticalDataImpl
