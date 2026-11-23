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

import org.dmtf.cim.CIM_OperationalPowerManifest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operational Power Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerManifestImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerManifestImpl#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerManifestImpl#getIncludeMilliwatts <em>Include Milliwatts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerManifestImpl#getIncludePrecision <em>Include Precision</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerManifestImpl#getCSVSequence <em>CSV Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OperationalPowerManifestImpl extends CIM_ManagedElementImpl implements CIM_OperationalPowerManifest {
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
	 * The default value of the '{@link #getIncludeStatisticTime() <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_STATISTIC_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeStatisticTime() <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeStatisticTime = INCLUDE_STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMilliwatts() <em>Include Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMilliwatts()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_MILLIWATTS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncludeMilliwatts() <em>Include Milliwatts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMilliwatts()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMilliwatts = INCLUDE_MILLIWATTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludePrecision() <em>Include Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_PRECISION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludePrecision() <em>Include Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePrecision()
	 * @generated
	 * @ordered
	 */
	protected Boolean includePrecision = INCLUDE_PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCSVSequence() <em>CSV Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSVSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> csvSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperationalPowerManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperationalPowerManifest();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeStatisticTime() {
		return includeStatisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeStatisticTime(Boolean newIncludeStatisticTime) {
		Boolean oldIncludeStatisticTime = includeStatisticTime;
		includeStatisticTime = newIncludeStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_STATISTIC_TIME, oldIncludeStatisticTime, includeStatisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMilliwatts() {
		return includeMilliwatts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMilliwatts(Boolean newIncludeMilliwatts) {
		Boolean oldIncludeMilliwatts = includeMilliwatts;
		includeMilliwatts = newIncludeMilliwatts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_MILLIWATTS, oldIncludeMilliwatts, includeMilliwatts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludePrecision() {
		return includePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludePrecision(Boolean newIncludePrecision) {
		Boolean oldIncludePrecision = includePrecision;
		includePrecision = newIncludePrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_PRECISION, oldIncludePrecision, includePrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCSVSequence() {
		if (csvSequence == null) {
			csvSequence = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__CSV_SEQUENCE);
		}
		return csvSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_STATISTIC_TIME:
				return getIncludeStatisticTime();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_MILLIWATTS:
				return getIncludeMilliwatts();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_PRECISION:
				return getIncludePrecision();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__CSV_SEQUENCE:
				return getCSVSequence();
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
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime((Boolean)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_MILLIWATTS:
				setIncludeMilliwatts((Boolean)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_PRECISION:
				setIncludePrecision((Boolean)newValue);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__CSV_SEQUENCE:
				getCSVSequence().clear();
				getCSVSequence().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime(INCLUDE_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_MILLIWATTS:
				setIncludeMilliwatts(INCLUDE_MILLIWATTS_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_PRECISION:
				setIncludePrecision(INCLUDE_PRECISION_EDEFAULT);
				return;
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__CSV_SEQUENCE:
				getCSVSequence().clear();
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
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_STATISTIC_TIME:
				return INCLUDE_STATISTIC_TIME_EDEFAULT == null ? includeStatisticTime != null : !INCLUDE_STATISTIC_TIME_EDEFAULT.equals(includeStatisticTime);
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_MILLIWATTS:
				return INCLUDE_MILLIWATTS_EDEFAULT == null ? includeMilliwatts != null : !INCLUDE_MILLIWATTS_EDEFAULT.equals(includeMilliwatts);
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__INCLUDE_PRECISION:
				return INCLUDE_PRECISION_EDEFAULT == null ? includePrecision != null : !INCLUDE_PRECISION_EDEFAULT.equals(includePrecision);
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST__CSV_SEQUENCE:
				return csvSequence != null && !csvSequence.isEmpty();
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
		result.append(", IncludeStatisticTime: ");
		result.append(includeStatisticTime);
		result.append(", IncludeMilliwatts: ");
		result.append(includeMilliwatts);
		result.append(", IncludePrecision: ");
		result.append(includePrecision);
		result.append(", CSVSequence: ");
		result.append(csvSequence);
		result.append(')');
		return result.toString();
	}

} //CIM_OperationalPowerManifestImpl
