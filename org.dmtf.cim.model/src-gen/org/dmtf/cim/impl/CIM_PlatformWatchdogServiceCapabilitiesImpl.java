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

import org.dmtf.cim.CIM_PlatformWatchdogServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Platform Watchdog Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceCapabilitiesImpl#getActionOnExpirationSupported <em>Action On Expiration Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceCapabilitiesImpl#getWatchdogTimerDataSupported <em>Watchdog Timer Data Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceCapabilitiesImpl#getLastExpirationDataSupported <em>Last Expiration Data Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PlatformWatchdogServiceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_PlatformWatchdogServiceCapabilities {
	/**
	 * The cached value of the '{@link #getActionOnExpirationSupported() <em>Action On Expiration Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOnExpirationSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> actionOnExpirationSupported;

	/**
	 * The cached value of the '{@link #getWatchdogTimerDataSupported() <em>Watchdog Timer Data Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchdogTimerDataSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> watchdogTimerDataSupported;

	/**
	 * The cached value of the '{@link #getLastExpirationDataSupported() <em>Last Expiration Data Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExpirationDataSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lastExpirationDataSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PlatformWatchdogServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PlatformWatchdogServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActionOnExpirationSupported() {
		if (actionOnExpirationSupported == null) {
			actionOnExpirationSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__ACTION_ON_EXPIRATION_SUPPORTED);
		}
		return actionOnExpirationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getWatchdogTimerDataSupported() {
		if (watchdogTimerDataSupported == null) {
			watchdogTimerDataSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__WATCHDOG_TIMER_DATA_SUPPORTED);
		}
		return watchdogTimerDataSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLastExpirationDataSupported() {
		if (lastExpirationDataSupported == null) {
			lastExpirationDataSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__LAST_EXPIRATION_DATA_SUPPORTED);
		}
		return lastExpirationDataSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__ACTION_ON_EXPIRATION_SUPPORTED:
				return getActionOnExpirationSupported();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__WATCHDOG_TIMER_DATA_SUPPORTED:
				return getWatchdogTimerDataSupported();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__LAST_EXPIRATION_DATA_SUPPORTED:
				return getLastExpirationDataSupported();
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__ACTION_ON_EXPIRATION_SUPPORTED:
				getActionOnExpirationSupported().clear();
				getActionOnExpirationSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__WATCHDOG_TIMER_DATA_SUPPORTED:
				getWatchdogTimerDataSupported().clear();
				getWatchdogTimerDataSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__LAST_EXPIRATION_DATA_SUPPORTED:
				getLastExpirationDataSupported().clear();
				getLastExpirationDataSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__ACTION_ON_EXPIRATION_SUPPORTED:
				getActionOnExpirationSupported().clear();
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__WATCHDOG_TIMER_DATA_SUPPORTED:
				getWatchdogTimerDataSupported().clear();
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__LAST_EXPIRATION_DATA_SUPPORTED:
				getLastExpirationDataSupported().clear();
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__ACTION_ON_EXPIRATION_SUPPORTED:
				return actionOnExpirationSupported != null && !actionOnExpirationSupported.isEmpty();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__WATCHDOG_TIMER_DATA_SUPPORTED:
				return watchdogTimerDataSupported != null && !watchdogTimerDataSupported.isEmpty();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES__LAST_EXPIRATION_DATA_SUPPORTED:
				return lastExpirationDataSupported != null && !lastExpirationDataSupported.isEmpty();
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
		result.append(" (ActionOnExpirationSupported: ");
		result.append(actionOnExpirationSupported);
		result.append(", WatchdogTimerDataSupported: ");
		result.append(watchdogTimerDataSupported);
		result.append(", LastExpirationDataSupported: ");
		result.append(lastExpirationDataSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_PlatformWatchdogServiceCapabilitiesImpl
