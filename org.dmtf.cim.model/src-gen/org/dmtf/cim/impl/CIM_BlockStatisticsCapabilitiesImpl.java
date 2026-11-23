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

import org.dmtf.cim.CIM_BlockStatisticsCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Block Statistics Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsCapabilitiesImpl#getClockTickInterval <em>Clock Tick Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsCapabilitiesImpl#getElementTypeFeatures <em>Element Type Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsCapabilitiesImpl#getRateElementTypesSupported <em>Rate Element Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsCapabilitiesImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BlockStatisticsCapabilitiesImpl extends CIM_StatisticsCapabilitiesImpl implements CIM_BlockStatisticsCapabilities {
	/**
	 * The default value of the '{@link #getClockTickInterval() <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockTickInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOCK_TICK_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockTickInterval() <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockTickInterval()
	 * @generated
	 * @ordered
	 */
	protected Long clockTickInterval = CLOCK_TICK_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementTypeFeatures() <em>Element Type Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypeFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> elementTypeFeatures;

	/**
	 * The cached value of the '{@link #getRateElementTypesSupported() <em>Rate Element Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateElementTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> rateElementTypesSupported;

	/**
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BlockStatisticsCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BlockStatisticsCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClockTickInterval() {
		return clockTickInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClockTickInterval(Long newClockTickInterval) {
		Long oldClockTickInterval = clockTickInterval;
		clockTickInterval = newClockTickInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL, oldClockTickInterval, clockTickInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getElementTypeFeatures() {
		if (elementTypeFeatures == null) {
			elementTypeFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__ELEMENT_TYPE_FEATURES);
		}
		return elementTypeFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRateElementTypesSupported() {
		if (rateElementTypesSupported == null) {
			rateElementTypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__RATE_ELEMENT_TYPES_SUPPORTED);
		}
		return rateElementTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedFeatures() {
		if (supportedFeatures == null) {
			supportedFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__SUPPORTED_FEATURES);
		}
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				return getClockTickInterval();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__ELEMENT_TYPE_FEATURES:
				return getElementTypeFeatures();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__RATE_ELEMENT_TYPES_SUPPORTED:
				return getRateElementTypesSupported();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__SUPPORTED_FEATURES:
				return getSupportedFeatures();
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
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				setClockTickInterval((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__ELEMENT_TYPE_FEATURES:
				getElementTypeFeatures().clear();
				getElementTypeFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__RATE_ELEMENT_TYPES_SUPPORTED:
				getRateElementTypesSupported().clear();
				getRateElementTypesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				getSupportedFeatures().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				setClockTickInterval(CLOCK_TICK_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__ELEMENT_TYPE_FEATURES:
				getElementTypeFeatures().clear();
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__RATE_ELEMENT_TYPES_SUPPORTED:
				getRateElementTypesSupported().clear();
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
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
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				return CLOCK_TICK_INTERVAL_EDEFAULT == null ? clockTickInterval != null : !CLOCK_TICK_INTERVAL_EDEFAULT.equals(clockTickInterval);
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__ELEMENT_TYPE_FEATURES:
				return elementTypeFeatures != null && !elementTypeFeatures.isEmpty();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__RATE_ELEMENT_TYPES_SUPPORTED:
				return rateElementTypesSupported != null && !rateElementTypesSupported.isEmpty();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES__SUPPORTED_FEATURES:
				return supportedFeatures != null && !supportedFeatures.isEmpty();
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
		result.append(" (ClockTickInterval: ");
		result.append(clockTickInterval);
		result.append(", ElementTypeFeatures: ");
		result.append(elementTypeFeatures);
		result.append(", RateElementTypesSupported: ");
		result.append(rateElementTypesSupported);
		result.append(", SupportedFeatures: ");
		result.append(supportedFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_BlockStatisticsCapabilitiesImpl
