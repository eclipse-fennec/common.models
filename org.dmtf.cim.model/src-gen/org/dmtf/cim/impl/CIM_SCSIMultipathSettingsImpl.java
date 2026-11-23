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

import org.dmtf.cim.CIM_SCSIMultipathSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Multipath Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getAsymmetric <em>Asymmetric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathSettingsImpl#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIMultipathSettingsImpl extends CIM_SettingDataImpl implements CIM_SCSIMultipathSettings {
	/**
	 * The default value of the '{@link #getAsymmetric() <em>Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASYMMETRIC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAsymmetric() <em>Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected Boolean asymmetric = ASYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLoadBalanceType() <em>Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_LOAD_BALANCE_TYPE_EDEFAULT = Integer.valueOf(7);

	/**
	 * The cached value of the '{@link #getCurrentLoadBalanceType() <em>Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected Integer currentLoadBalanceType = CURRENT_LOAD_BALANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCurrentLoadBalanceType() <em>Other Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCurrentLoadBalanceType() <em>Other Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected String otherCurrentLoadBalanceType = OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTO_FAILBACK_ENABLED_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected Integer autoFailbackEnabled = AUTO_FAILBACK_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long POLLING_RATE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected Long pollingRateMax = POLLING_RATE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_POLLING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected Long currentPollingRate = CURRENT_POLLING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIMultipathSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIMultipathSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAsymmetric() {
		return asymmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsymmetric(Boolean newAsymmetric) {
		Boolean oldAsymmetric = asymmetric;
		asymmetric = newAsymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__ASYMMETRIC, oldAsymmetric, asymmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentLoadBalanceType() {
		return currentLoadBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLoadBalanceType(Integer newCurrentLoadBalanceType) {
		Integer oldCurrentLoadBalanceType = currentLoadBalanceType;
		currentLoadBalanceType = newCurrentLoadBalanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_LOAD_BALANCE_TYPE, oldCurrentLoadBalanceType, currentLoadBalanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCurrentLoadBalanceType() {
		return otherCurrentLoadBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCurrentLoadBalanceType(String newOtherCurrentLoadBalanceType) {
		String oldOtherCurrentLoadBalanceType = otherCurrentLoadBalanceType;
		otherCurrentLoadBalanceType = newOtherCurrentLoadBalanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__OTHER_CURRENT_LOAD_BALANCE_TYPE, oldOtherCurrentLoadBalanceType, otherCurrentLoadBalanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutoFailbackEnabled() {
		return autoFailbackEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoFailbackEnabled(Integer newAutoFailbackEnabled) {
		Integer oldAutoFailbackEnabled = autoFailbackEnabled;
		autoFailbackEnabled = newAutoFailbackEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__AUTO_FAILBACK_ENABLED, oldAutoFailbackEnabled, autoFailbackEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPollingRateMax() {
		return pollingRateMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollingRateMax(Long newPollingRateMax) {
		Long oldPollingRateMax = pollingRateMax;
		pollingRateMax = newPollingRateMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__POLLING_RATE_MAX, oldPollingRateMax, pollingRateMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentPollingRate() {
		return currentPollingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPollingRate(Long newCurrentPollingRate) {
		Long oldCurrentPollingRate = currentPollingRate;
		currentPollingRate = newCurrentPollingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_POLLING_RATE, oldCurrentPollingRate, currentPollingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__ASYMMETRIC:
				return getAsymmetric();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_LOAD_BALANCE_TYPE:
				return getCurrentLoadBalanceType();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				return getOtherCurrentLoadBalanceType();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__AUTO_FAILBACK_ENABLED:
				return getAutoFailbackEnabled();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__POLLING_RATE_MAX:
				return getPollingRateMax();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_POLLING_RATE:
				return getCurrentPollingRate();
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
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__ASYMMETRIC:
				setAsymmetric((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_LOAD_BALANCE_TYPE:
				setCurrentLoadBalanceType((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				setOtherCurrentLoadBalanceType((String)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__POLLING_RATE_MAX:
				setPollingRateMax((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_POLLING_RATE:
				setCurrentPollingRate((Long)newValue);
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
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__ASYMMETRIC:
				setAsymmetric(ASYMMETRIC_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_LOAD_BALANCE_TYPE:
				setCurrentLoadBalanceType(CURRENT_LOAD_BALANCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				setOtherCurrentLoadBalanceType(OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled(AUTO_FAILBACK_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__POLLING_RATE_MAX:
				setPollingRateMax(POLLING_RATE_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_POLLING_RATE:
				setCurrentPollingRate(CURRENT_POLLING_RATE_EDEFAULT);
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
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__ASYMMETRIC:
				return ASYMMETRIC_EDEFAULT == null ? asymmetric != null : !ASYMMETRIC_EDEFAULT.equals(asymmetric);
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_LOAD_BALANCE_TYPE:
				return CURRENT_LOAD_BALANCE_TYPE_EDEFAULT == null ? currentLoadBalanceType != null : !CURRENT_LOAD_BALANCE_TYPE_EDEFAULT.equals(currentLoadBalanceType);
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				return OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT == null ? otherCurrentLoadBalanceType != null : !OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT.equals(otherCurrentLoadBalanceType);
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__AUTO_FAILBACK_ENABLED:
				return AUTO_FAILBACK_ENABLED_EDEFAULT == null ? autoFailbackEnabled != null : !AUTO_FAILBACK_ENABLED_EDEFAULT.equals(autoFailbackEnabled);
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__POLLING_RATE_MAX:
				return POLLING_RATE_MAX_EDEFAULT == null ? pollingRateMax != null : !POLLING_RATE_MAX_EDEFAULT.equals(pollingRateMax);
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS__CURRENT_POLLING_RATE:
				return CURRENT_POLLING_RATE_EDEFAULT == null ? currentPollingRate != null : !CURRENT_POLLING_RATE_EDEFAULT.equals(currentPollingRate);
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
		result.append(" (Asymmetric: ");
		result.append(asymmetric);
		result.append(", CurrentLoadBalanceType: ");
		result.append(currentLoadBalanceType);
		result.append(", OtherCurrentLoadBalanceType: ");
		result.append(otherCurrentLoadBalanceType);
		result.append(", AutoFailbackEnabled: ");
		result.append(autoFailbackEnabled);
		result.append(", PollingRateMax: ");
		result.append(pollingRateMax);
		result.append(", CurrentPollingRate: ");
		result.append(currentPollingRate);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIMultipathSettingsImpl
