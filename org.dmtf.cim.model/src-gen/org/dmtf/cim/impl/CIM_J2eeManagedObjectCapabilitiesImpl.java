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

import org.dmtf.cim.CIM_J2eeManagedObjectCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Managed Object Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeManagedObjectCapabilitiesImpl#getStateManageable <em>State Manageable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeManagedObjectCapabilitiesImpl#getStatisticsProvider <em>Statistics Provider</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeManagedObjectCapabilitiesImpl#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_J2eeManagedObjectCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_J2eeManagedObjectCapabilities {
	/**
	 * The default value of the '{@link #getStateManageable() <em>State Manageable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateManageable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATE_MANAGEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateManageable() <em>State Manageable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateManageable()
	 * @generated
	 * @ordered
	 */
	protected Boolean stateManageable = STATE_MANAGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticsProvider() <em>Statistics Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsProvider()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATISTICS_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatisticsProvider() <em>Statistics Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsProvider()
	 * @generated
	 * @ordered
	 */
	protected Boolean statisticsProvider = STATISTICS_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventProvider() <em>Event Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventProvider()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EVENT_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventProvider() <em>Event Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventProvider()
	 * @generated
	 * @ordered
	 */
	protected Boolean eventProvider = EVENT_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeManagedObjectCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeManagedObjectCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStateManageable() {
		return stateManageable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateManageable(Boolean newStateManageable) {
		Boolean oldStateManageable = stateManageable;
		stateManageable = newStateManageable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATE_MANAGEABLE, oldStateManageable, stateManageable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStatisticsProvider() {
		return statisticsProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatisticsProvider(Boolean newStatisticsProvider) {
		Boolean oldStatisticsProvider = statisticsProvider;
		statisticsProvider = newStatisticsProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATISTICS_PROVIDER, oldStatisticsProvider, statisticsProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEventProvider() {
		return eventProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventProvider(Boolean newEventProvider) {
		Boolean oldEventProvider = eventProvider;
		eventProvider = newEventProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__EVENT_PROVIDER, oldEventProvider, eventProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATE_MANAGEABLE:
				return getStateManageable();
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATISTICS_PROVIDER:
				return getStatisticsProvider();
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__EVENT_PROVIDER:
				return getEventProvider();
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
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATE_MANAGEABLE:
				setStateManageable((Boolean)newValue);
				return;
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATISTICS_PROVIDER:
				setStatisticsProvider((Boolean)newValue);
				return;
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__EVENT_PROVIDER:
				setEventProvider((Boolean)newValue);
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
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATE_MANAGEABLE:
				setStateManageable(STATE_MANAGEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATISTICS_PROVIDER:
				setStatisticsProvider(STATISTICS_PROVIDER_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__EVENT_PROVIDER:
				setEventProvider(EVENT_PROVIDER_EDEFAULT);
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
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATE_MANAGEABLE:
				return STATE_MANAGEABLE_EDEFAULT == null ? stateManageable != null : !STATE_MANAGEABLE_EDEFAULT.equals(stateManageable);
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__STATISTICS_PROVIDER:
				return STATISTICS_PROVIDER_EDEFAULT == null ? statisticsProvider != null : !STATISTICS_PROVIDER_EDEFAULT.equals(statisticsProvider);
			case CimPackage.CIM_J2EE_MANAGED_OBJECT_CAPABILITIES__EVENT_PROVIDER:
				return EVENT_PROVIDER_EDEFAULT == null ? eventProvider != null : !EVENT_PROVIDER_EDEFAULT.equals(eventProvider);
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
		result.append(" (StateManageable: ");
		result.append(stateManageable);
		result.append(", StatisticsProvider: ");
		result.append(statisticsProvider);
		result.append(", EventProvider: ");
		result.append(eventProvider);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeManagedObjectCapabilitiesImpl
