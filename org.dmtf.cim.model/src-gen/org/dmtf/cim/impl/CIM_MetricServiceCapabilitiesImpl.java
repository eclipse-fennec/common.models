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

import org.dmtf.cim.CIM_MetricServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Metric Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricServiceCapabilitiesImpl#getControllableMetrics <em>Controllable Metrics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricServiceCapabilitiesImpl#getMetricsControlTypes <em>Metrics Control Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricServiceCapabilitiesImpl#getControllableManagedElements <em>Controllable Managed Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricServiceCapabilitiesImpl#getManagedElementControlTypes <em>Managed Element Control Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MetricServiceCapabilitiesImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MetricServiceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_MetricServiceCapabilities {
	/**
	 * The cached value of the '{@link #getControllableMetrics() <em>Controllable Metrics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllableMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> controllableMetrics;

	/**
	 * The cached value of the '{@link #getMetricsControlTypes() <em>Metrics Control Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsControlTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> metricsControlTypes;

	/**
	 * The cached value of the '{@link #getControllableManagedElements() <em>Controllable Managed Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllableManagedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> controllableManagedElements;

	/**
	 * The cached value of the '{@link #getManagedElementControlTypes() <em>Managed Element Control Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElementControlTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> managedElementControlTypes;

	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MetricServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MetricServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getControllableMetrics() {
		if (controllableMetrics == null) {
			controllableMetrics = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_METRICS);
		}
		return controllableMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMetricsControlTypes() {
		if (metricsControlTypes == null) {
			metricsControlTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__METRICS_CONTROL_TYPES);
		}
		return metricsControlTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getControllableManagedElements() {
		if (controllableManagedElements == null) {
			controllableManagedElements = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_MANAGED_ELEMENTS);
		}
		return controllableManagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getManagedElementControlTypes() {
		if (managedElementControlTypes == null) {
			managedElementControlTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__MANAGED_ELEMENT_CONTROL_TYPES);
		}
		return managedElementControlTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_METRICS:
				return getControllableMetrics();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__METRICS_CONTROL_TYPES:
				return getMetricsControlTypes();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_MANAGED_ELEMENTS:
				return getControllableManagedElements();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__MANAGED_ELEMENT_CONTROL_TYPES:
				return getManagedElementControlTypes();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__SUPPORTED_METHODS:
				return getSupportedMethods();
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
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_METRICS:
				getControllableMetrics().clear();
				getControllableMetrics().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__METRICS_CONTROL_TYPES:
				getMetricsControlTypes().clear();
				getMetricsControlTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_MANAGED_ELEMENTS:
				getControllableManagedElements().clear();
				getControllableManagedElements().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__MANAGED_ELEMENT_CONTROL_TYPES:
				getManagedElementControlTypes().clear();
				getManagedElementControlTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_METRICS:
				getControllableMetrics().clear();
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__METRICS_CONTROL_TYPES:
				getMetricsControlTypes().clear();
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_MANAGED_ELEMENTS:
				getControllableManagedElements().clear();
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__MANAGED_ELEMENT_CONTROL_TYPES:
				getManagedElementControlTypes().clear();
				return;
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
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
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_METRICS:
				return controllableMetrics != null && !controllableMetrics.isEmpty();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__METRICS_CONTROL_TYPES:
				return metricsControlTypes != null && !metricsControlTypes.isEmpty();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__CONTROLLABLE_MANAGED_ELEMENTS:
				return controllableManagedElements != null && !controllableManagedElements.isEmpty();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__MANAGED_ELEMENT_CONTROL_TYPES:
				return managedElementControlTypes != null && !managedElementControlTypes.isEmpty();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
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
		result.append(" (ControllableMetrics: ");
		result.append(controllableMetrics);
		result.append(", MetricsControlTypes: ");
		result.append(metricsControlTypes);
		result.append(", ControllableManagedElements: ");
		result.append(controllableManagedElements);
		result.append(", ManagedElementControlTypes: ");
		result.append(managedElementControlTypes);
		result.append(", SupportedMethods: ");
		result.append(supportedMethods);
		result.append(')');
		return result.toString();
	}

} //CIM_MetricServiceCapabilitiesImpl
