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

import org.dmtf.cim.CIM_IsSpare;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Is Spare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IsSpareImpl#getSpareStatus <em>Spare Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IsSpareImpl#getFailoverSupported <em>Failover Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IsSpareImpl extends CIM_DependencyImpl implements CIM_IsSpare {
	/**
	 * The default value of the '{@link #getSpareStatus() <em>Spare Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPARE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpareStatus() <em>Spare Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer spareStatus = SPARE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailoverSupported() <em>Failover Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailoverSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FAILOVER_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailoverSupported() <em>Failover Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailoverSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer failoverSupported = FAILOVER_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IsSpareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IsSpare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpareStatus() {
		return spareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpareStatus(Integer newSpareStatus) {
		Integer oldSpareStatus = spareStatus;
		spareStatus = newSpareStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IS_SPARE__SPARE_STATUS, oldSpareStatus, spareStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFailoverSupported() {
		return failoverSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailoverSupported(Integer newFailoverSupported) {
		Integer oldFailoverSupported = failoverSupported;
		failoverSupported = newFailoverSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IS_SPARE__FAILOVER_SUPPORTED, oldFailoverSupported, failoverSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IS_SPARE__SPARE_STATUS:
				return getSpareStatus();
			case CimPackage.CIM_IS_SPARE__FAILOVER_SUPPORTED:
				return getFailoverSupported();
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
			case CimPackage.CIM_IS_SPARE__SPARE_STATUS:
				setSpareStatus((Integer)newValue);
				return;
			case CimPackage.CIM_IS_SPARE__FAILOVER_SUPPORTED:
				setFailoverSupported((Integer)newValue);
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
			case CimPackage.CIM_IS_SPARE__SPARE_STATUS:
				setSpareStatus(SPARE_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_IS_SPARE__FAILOVER_SUPPORTED:
				setFailoverSupported(FAILOVER_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_IS_SPARE__SPARE_STATUS:
				return SPARE_STATUS_EDEFAULT == null ? spareStatus != null : !SPARE_STATUS_EDEFAULT.equals(spareStatus);
			case CimPackage.CIM_IS_SPARE__FAILOVER_SUPPORTED:
				return FAILOVER_SUPPORTED_EDEFAULT == null ? failoverSupported != null : !FAILOVER_SUPPORTED_EDEFAULT.equals(failoverSupported);
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
		result.append(" (SpareStatus: ");
		result.append(spareStatus);
		result.append(", FailoverSupported: ");
		result.append(failoverSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_IsSpareImpl
