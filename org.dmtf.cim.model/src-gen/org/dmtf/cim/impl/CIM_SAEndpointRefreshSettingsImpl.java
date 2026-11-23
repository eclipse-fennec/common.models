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

import org.dmtf.cim.CIM_SAEndpointRefreshSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Endpoint Refresh Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAEndpointRefreshSettingsImpl#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAEndpointRefreshSettingsImpl#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SAEndpointRefreshSettingsImpl extends CIM_SettingDataImpl implements CIM_SAEndpointRefreshSettings {
	/**
	 * The default value of the '{@link #getRefreshThresholdSecondsPercentage() <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshThresholdSecondsPercentage() <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer refreshThresholdSecondsPercentage = REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshThresholdKbytesPercentage() <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshThresholdKbytesPercentage() <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer refreshThresholdKbytesPercentage = REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SAEndpointRefreshSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SAEndpointRefreshSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRefreshThresholdSecondsPercentage() {
		return refreshThresholdSecondsPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshThresholdSecondsPercentage(Integer newRefreshThresholdSecondsPercentage) {
		Integer oldRefreshThresholdSecondsPercentage = refreshThresholdSecondsPercentage;
		refreshThresholdSecondsPercentage = newRefreshThresholdSecondsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_SECONDS_PERCENTAGE, oldRefreshThresholdSecondsPercentage, refreshThresholdSecondsPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRefreshThresholdKbytesPercentage() {
		return refreshThresholdKbytesPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshThresholdKbytesPercentage(Integer newRefreshThresholdKbytesPercentage) {
		Integer oldRefreshThresholdKbytesPercentage = refreshThresholdKbytesPercentage;
		refreshThresholdKbytesPercentage = newRefreshThresholdKbytesPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_KBYTES_PERCENTAGE, oldRefreshThresholdKbytesPercentage, refreshThresholdKbytesPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				return getRefreshThresholdSecondsPercentage();
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				return getRefreshThresholdKbytesPercentage();
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
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				setRefreshThresholdSecondsPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				setRefreshThresholdKbytesPercentage((Integer)newValue);
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
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				setRefreshThresholdSecondsPercentage(REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				setRefreshThresholdKbytesPercentage(REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT);
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
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_SECONDS_PERCENTAGE:
				return REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT == null ? refreshThresholdSecondsPercentage != null : !REFRESH_THRESHOLD_SECONDS_PERCENTAGE_EDEFAULT.equals(refreshThresholdSecondsPercentage);
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS__REFRESH_THRESHOLD_KBYTES_PERCENTAGE:
				return REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT == null ? refreshThresholdKbytesPercentage != null : !REFRESH_THRESHOLD_KBYTES_PERCENTAGE_EDEFAULT.equals(refreshThresholdKbytesPercentage);
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
		result.append(" (RefreshThresholdSecondsPercentage: ");
		result.append(refreshThresholdSecondsPercentage);
		result.append(", RefreshThresholdKbytesPercentage: ");
		result.append(refreshThresholdKbytesPercentage);
		result.append(')');
		return result.toString();
	}

} //CIM_SAEndpointRefreshSettingsImpl
