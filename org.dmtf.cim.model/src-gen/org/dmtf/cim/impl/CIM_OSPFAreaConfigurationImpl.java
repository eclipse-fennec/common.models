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

import org.dmtf.cim.CIM_OSPFAreaConfiguration;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OSPF Area Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFAreaConfigurationImpl#getStubDefaultCost <em>Stub Default Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSPFAreaConfigurationImpl#getStubMetricType <em>Stub Metric Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSPFAreaConfigurationImpl extends CIM_LogicalElementImpl implements CIM_OSPFAreaConfiguration {
	/**
	 * The default value of the '{@link #getStubDefaultCost() <em>Stub Default Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubDefaultCost()
	 * @generated
	 * @ordered
	 */
	protected static final Long STUB_DEFAULT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubDefaultCost() <em>Stub Default Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubDefaultCost()
	 * @generated
	 * @ordered
	 */
	protected Long stubDefaultCost = STUB_DEFAULT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStubMetricType() <em>Stub Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubMetricType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STUB_METRIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubMetricType() <em>Stub Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubMetricType()
	 * @generated
	 * @ordered
	 */
	protected Integer stubMetricType = STUB_METRIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSPFAreaConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSPFAreaConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStubDefaultCost() {
		return stubDefaultCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStubDefaultCost(Long newStubDefaultCost) {
		Long oldStubDefaultCost = stubDefaultCost;
		stubDefaultCost = newStubDefaultCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_DEFAULT_COST, oldStubDefaultCost, stubDefaultCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStubMetricType() {
		return stubMetricType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStubMetricType(Integer newStubMetricType) {
		Integer oldStubMetricType = stubMetricType;
		stubMetricType = newStubMetricType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_METRIC_TYPE, oldStubMetricType, stubMetricType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_DEFAULT_COST:
				return getStubDefaultCost();
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_METRIC_TYPE:
				return getStubMetricType();
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
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_DEFAULT_COST:
				setStubDefaultCost((Long)newValue);
				return;
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_METRIC_TYPE:
				setStubMetricType((Integer)newValue);
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
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_DEFAULT_COST:
				setStubDefaultCost(STUB_DEFAULT_COST_EDEFAULT);
				return;
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_METRIC_TYPE:
				setStubMetricType(STUB_METRIC_TYPE_EDEFAULT);
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
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_DEFAULT_COST:
				return STUB_DEFAULT_COST_EDEFAULT == null ? stubDefaultCost != null : !STUB_DEFAULT_COST_EDEFAULT.equals(stubDefaultCost);
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION__STUB_METRIC_TYPE:
				return STUB_METRIC_TYPE_EDEFAULT == null ? stubMetricType != null : !STUB_METRIC_TYPE_EDEFAULT.equals(stubMetricType);
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
		result.append(" (StubDefaultCost: ");
		result.append(stubDefaultCost);
		result.append(", StubMetricType: ");
		result.append(stubMetricType);
		result.append(')');
		return result.toString();
	}

} //CIM_OSPFAreaConfigurationImpl
