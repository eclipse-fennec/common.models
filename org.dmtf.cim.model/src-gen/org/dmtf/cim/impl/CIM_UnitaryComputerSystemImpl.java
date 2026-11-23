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

import org.dmtf.cim.CIM_UnitaryComputerSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unitary Computer System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitaryComputerSystemImpl#getInitialLoadInfo <em>Initial Load Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitaryComputerSystemImpl#getLastLoadInfo <em>Last Load Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitaryComputerSystemImpl#getPowerManagementSupported <em>Power Management Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitaryComputerSystemImpl#getPowerState <em>Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnitaryComputerSystemImpl#getWakeUpType <em>Wake Up Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnitaryComputerSystemImpl extends CIM_ComputerSystemImpl implements CIM_UnitaryComputerSystem {
	/**
	 * The cached value of the '{@link #getInitialLoadInfo() <em>Initial Load Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLoadInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> initialLoadInfo;

	/**
	 * The default value of the '{@link #getLastLoadInfo() <em>Last Load Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoadInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOAD_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoadInfo() <em>Last Load Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoadInfo()
	 * @generated
	 * @ordered
	 */
	protected String lastLoadInfo = LAST_LOAD_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerManagementSupported() <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POWER_MANAGEMENT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerManagementSupported() <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean powerManagementSupported = POWER_MANAGEMENT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerState() <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerState() <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerState()
	 * @generated
	 * @ordered
	 */
	protected Integer powerState = POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWakeUpType() <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeUpType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WAKE_UP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWakeUpType() <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeUpType()
	 * @generated
	 * @ordered
	 */
	protected Integer wakeUpType = WAKE_UP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnitaryComputerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnitaryComputerSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInitialLoadInfo() {
		if (initialLoadInfo == null) {
			initialLoadInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__INITIAL_LOAD_INFO);
		}
		return initialLoadInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLoadInfo() {
		return lastLoadInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoadInfo(String newLastLoadInfo) {
		String oldLastLoadInfo = lastLoadInfo;
		lastLoadInfo = newLastLoadInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__LAST_LOAD_INFO, oldLastLoadInfo, lastLoadInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPowerManagementSupported() {
		return powerManagementSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerManagementSupported(Boolean newPowerManagementSupported) {
		Boolean oldPowerManagementSupported = powerManagementSupported;
		powerManagementSupported = newPowerManagementSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_MANAGEMENT_SUPPORTED, oldPowerManagementSupported, powerManagementSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPowerState() {
		return powerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerState(Integer newPowerState) {
		Integer oldPowerState = powerState;
		powerState = newPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_STATE, oldPowerState, powerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWakeUpType() {
		return wakeUpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWakeUpType(Integer newWakeUpType) {
		Integer oldWakeUpType = wakeUpType;
		wakeUpType = newWakeUpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__WAKE_UP_TYPE, oldWakeUpType, wakeUpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__INITIAL_LOAD_INFO:
				return getInitialLoadInfo();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__LAST_LOAD_INFO:
				return getLastLoadInfo();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_MANAGEMENT_SUPPORTED:
				return getPowerManagementSupported();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_STATE:
				return getPowerState();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__WAKE_UP_TYPE:
				return getWakeUpType();
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
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__INITIAL_LOAD_INFO:
				getInitialLoadInfo().clear();
				getInitialLoadInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__LAST_LOAD_INFO:
				setLastLoadInfo((String)newValue);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_MANAGEMENT_SUPPORTED:
				setPowerManagementSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_STATE:
				setPowerState((Integer)newValue);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__WAKE_UP_TYPE:
				setWakeUpType((Integer)newValue);
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
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__INITIAL_LOAD_INFO:
				getInitialLoadInfo().clear();
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__LAST_LOAD_INFO:
				setLastLoadInfo(LAST_LOAD_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_MANAGEMENT_SUPPORTED:
				setPowerManagementSupported(POWER_MANAGEMENT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_STATE:
				setPowerState(POWER_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__WAKE_UP_TYPE:
				setWakeUpType(WAKE_UP_TYPE_EDEFAULT);
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
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__INITIAL_LOAD_INFO:
				return initialLoadInfo != null && !initialLoadInfo.isEmpty();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__LAST_LOAD_INFO:
				return LAST_LOAD_INFO_EDEFAULT == null ? lastLoadInfo != null : !LAST_LOAD_INFO_EDEFAULT.equals(lastLoadInfo);
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_MANAGEMENT_SUPPORTED:
				return POWER_MANAGEMENT_SUPPORTED_EDEFAULT == null ? powerManagementSupported != null : !POWER_MANAGEMENT_SUPPORTED_EDEFAULT.equals(powerManagementSupported);
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__POWER_STATE:
				return POWER_STATE_EDEFAULT == null ? powerState != null : !POWER_STATE_EDEFAULT.equals(powerState);
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM__WAKE_UP_TYPE:
				return WAKE_UP_TYPE_EDEFAULT == null ? wakeUpType != null : !WAKE_UP_TYPE_EDEFAULT.equals(wakeUpType);
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
		result.append(" (InitialLoadInfo: ");
		result.append(initialLoadInfo);
		result.append(", LastLoadInfo: ");
		result.append(lastLoadInfo);
		result.append(", PowerManagementSupported: ");
		result.append(powerManagementSupported);
		result.append(", PowerState: ");
		result.append(powerState);
		result.append(", WakeUpType: ");
		result.append(wakeUpType);
		result.append(')');
		return result.toString();
	}

} //CIM_UnitaryComputerSystemImpl
