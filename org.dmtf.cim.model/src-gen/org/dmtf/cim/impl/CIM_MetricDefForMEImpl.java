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

import org.dmtf.cim.CIM_MetricDefForME;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Metric Def For ME</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricDefForMEImpl#getMetricCollectionEnabled <em>Metric Collection Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MetricDefForMEImpl extends CIM_DependencyImpl implements CIM_MetricDefForME {
	/**
	 * The default value of the '{@link #getMetricCollectionEnabled() <em>Metric Collection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricCollectionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Integer METRIC_COLLECTION_ENABLED_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getMetricCollectionEnabled() <em>Metric Collection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricCollectionEnabled()
	 * @generated
	 * @ordered
	 */
	protected Integer metricCollectionEnabled = METRIC_COLLECTION_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MetricDefForMEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MetricDefForME();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMetricCollectionEnabled() {
		return metricCollectionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetricCollectionEnabled(Integer newMetricCollectionEnabled) {
		Integer oldMetricCollectionEnabled = metricCollectionEnabled;
		metricCollectionEnabled = newMetricCollectionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_METRIC_DEF_FOR_ME__METRIC_COLLECTION_ENABLED, oldMetricCollectionEnabled, metricCollectionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METRIC_DEF_FOR_ME__METRIC_COLLECTION_ENABLED:
				return getMetricCollectionEnabled();
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
			case CimPackage.CIM_METRIC_DEF_FOR_ME__METRIC_COLLECTION_ENABLED:
				setMetricCollectionEnabled((Integer)newValue);
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
			case CimPackage.CIM_METRIC_DEF_FOR_ME__METRIC_COLLECTION_ENABLED:
				setMetricCollectionEnabled(METRIC_COLLECTION_ENABLED_EDEFAULT);
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
			case CimPackage.CIM_METRIC_DEF_FOR_ME__METRIC_COLLECTION_ENABLED:
				return METRIC_COLLECTION_ENABLED_EDEFAULT == null ? metricCollectionEnabled != null : !METRIC_COLLECTION_ENABLED_EDEFAULT.equals(metricCollectionEnabled);
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
		result.append(" (MetricCollectionEnabled: ");
		result.append(metricCollectionEnabled);
		result.append(')');
		return result.toString();
	}

} //CIM_MetricDefForMEImpl
