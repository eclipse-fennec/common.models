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

import org.dmtf.cim.CIM_ServiceAffectsElementWithQuota;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service Affects Element With Quota</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementWithQuotaImpl#getQuota <em>Quota</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementWithQuotaImpl#getQuotaUsed <em>Quota Used</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAffectsElementWithQuotaImpl#getQuotaUnits <em>Quota Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ServiceAffectsElementWithQuotaImpl extends CIM_ServiceAffectsElementImpl implements CIM_ServiceAffectsElementWithQuota {
	/**
	 * The default value of the '{@link #getQuota() <em>Quota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuota()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUOTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuota() <em>Quota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuota()
	 * @generated
	 * @ordered
	 */
	protected Long quota = QUOTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotaUsed() <em>Quota Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUOTA_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotaUsed() <em>Quota Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaUsed()
	 * @generated
	 * @ordered
	 */
	protected Long quotaUsed = QUOTA_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotaUnits() <em>Quota Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTA_UNITS_EDEFAULT = "byte";

	/**
	 * The cached value of the '{@link #getQuotaUnits() <em>Quota Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaUnits()
	 * @generated
	 * @ordered
	 */
	protected String quotaUnits = QUOTA_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceAffectsElementWithQuotaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ServiceAffectsElementWithQuota();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQuota() {
		return quota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuota(Long newQuota) {
		Long oldQuota = quota;
		quota = newQuota;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA, oldQuota, quota));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQuotaUsed() {
		return quotaUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaUsed(Long newQuotaUsed) {
		Long oldQuotaUsed = quotaUsed;
		quotaUsed = newQuotaUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_USED, oldQuotaUsed, quotaUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuotaUnits() {
		return quotaUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaUnits(String newQuotaUnits) {
		String oldQuotaUnits = quotaUnits;
		quotaUnits = newQuotaUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_UNITS, oldQuotaUnits, quotaUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA:
				return getQuota();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_USED:
				return getQuotaUsed();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_UNITS:
				return getQuotaUnits();
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA:
				setQuota((Long)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_USED:
				setQuotaUsed((Long)newValue);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_UNITS:
				setQuotaUnits((String)newValue);
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA:
				setQuota(QUOTA_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_USED:
				setQuotaUsed(QUOTA_USED_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_UNITS:
				setQuotaUnits(QUOTA_UNITS_EDEFAULT);
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
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA:
				return QUOTA_EDEFAULT == null ? quota != null : !QUOTA_EDEFAULT.equals(quota);
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_USED:
				return QUOTA_USED_EDEFAULT == null ? quotaUsed != null : !QUOTA_USED_EDEFAULT.equals(quotaUsed);
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA__QUOTA_UNITS:
				return QUOTA_UNITS_EDEFAULT == null ? quotaUnits != null : !QUOTA_UNITS_EDEFAULT.equals(quotaUnits);
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
		result.append(" (Quota: ");
		result.append(quota);
		result.append(", QuotaUsed: ");
		result.append(quotaUsed);
		result.append(", QuotaUnits: ");
		result.append(quotaUnits);
		result.append(')');
		return result.toString();
	}

} //CIM_ServiceAffectsElementWithQuotaImpl
