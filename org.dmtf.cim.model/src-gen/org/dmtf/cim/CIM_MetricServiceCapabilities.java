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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Metric Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MetricServiceCapabilities describes the capabilities of the associated CIM_BaseMetricService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MetricServiceCapabilities#getControllableMetrics <em>Controllable Metrics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MetricServiceCapabilities#getMetricsControlTypes <em>Metrics Control Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MetricServiceCapabilities#getControllableManagedElements <em>Controllable Managed Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MetricServiceCapabilities#getManagedElementControlTypes <em>Managed Element Control Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MetricServiceCapabilities#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Metrics::BaseMetrics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MetricServiceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Controllable Metrics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ControllableMetrics identifies the instances of CIM_BaseMetricDefinition that can be controlled by the associated CIM_MetricService instance. Each string value shall be formatted as a WBEM URI defined as in accordance with DSP0207 that identifies an instance of CIM_BaseMetricDefinition. An instance of CIM_BaseMetricDefinition shall not be identified by a value of the ControllableMetrics property unless it is associated through CIM_ServiceAffectsElement to the associated instance of CIM_MetricService. If a value corresponding to an instance of CIM_BaseMetricDefinition is included in the ControllableMetrics property, the associated instance of CIM_MetricService shall support enabling and/or disabling at least one metric defined by the CIM_BaseMetricDefinition instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controllable Metrics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities_ControllableMetrics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MetricServiceCapabilities.MetricsControlTypes\"]'"
	 * @generated
	 */
	EList<String> getControllableMetrics();

	/**
	 * Returns the value of the '<em><b>Metrics Control Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MetricsControlTypes identifies the type of control supported by the associated CIM_MetricService instance for the CIM_BaseMetricDefinition identified by the value at the same array index in the ControllableMetrics property. A value of 2 "Discrete" shall indicate that individual metrics defined by the instance of CIM_BaseMetricDefinition identified at the corresponding array index of ControllableMetrics may be enabled and or disabled by the associated instance of CIM_MetricService.A value of 3 "Bulk" shall indicate that all metrics defined by the instance of CIM_BaseMetricDefinition identified by the value at the same array index of ControllableMetrics may be enabled and or disabled with a single operation. A value of 4 "Both" shall indicate that all metrics defined by the instance of CIM_BaseMetricDefinition identified by the value at the same array index of ControllableMetrics may be enabled and or disabled individually or as a single operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metrics Control Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities_MetricsControlTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Discrete\",\"Bulk\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MetricServiceCapabilities.ControllableMetrics\"]'"
	 * @generated
	 */
	EList<Integer> getMetricsControlTypes();

	/**
	 * Returns the value of the '<em><b>Controllable Managed Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ControllableManagedElements identifies the instances of CIM_ManagedElement that can be controlled by the associated CIM_MetricService instance. Each value shall be formatted as a WBEM URI defined according to DSP0207 identifying an instance of CIM_ManagedElement If a value corresponding to an instance of CIM_ManagedElement is included in the ControllableManagedElements property, the associated instance of CIM_MetricService shall support enabling and/or disabling at least one metric defined for the CIM_ManagedElement instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controllable Managed Elements</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities_ControllableManagedElements()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MetricServiceCapabilities.ManagedElementControlTypes\"]'"
	 * @generated
	 */
	EList<String> getControllableManagedElements();

	/**
	 * Returns the value of the '<em><b>Managed Element Control Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ManagedElementControlTypes identifies the type of control supported by the associated CIM_MetricService instance for the CIM_ManagedElement identified by the value at the same array index in the ControllableManagedElements property. A value of 2 "Discrete" shall indicate that individual metrics controlled by the associated instance of CIM_MetricService may be enabled and or disabled for the instance of CIM_ManagedElement identified at the corresponding array index of ControllableManagedElements.A value of 3 "Bulk" shall indicate that all metrics controlled by the associated instance of CIM_MetricService may be enabled and or disabled for the instance of CIM_ManagedElement identified at the corresponding array index of ControllableManagedElements. A value of 4 "Both" shall indicate that all metrics controlled by the associated instance of CIM_MetricService may be enabled and or disabled with a single operation or individually for the instance of CIM_ManagedElement identified by the value at the same array index of ControllableManagedElements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element Control Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities_ManagedElementControlTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Discrete\",\"Bulk\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MetricServiceCapabilities.ControllableManagedElements\"]'"
	 * @generated
	 */
	EList<Integer> getManagedElementControlTypes();

	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each enumeration corresponds to support for the like-named method of the MetricService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricServiceCapabilities_SupportedMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"ControlMetrics\",\"ControlMetricsByClass\",\"ShowMetrics\",\"ShowMetricsByClass\",\"GetMetricValues\",\"ControlSampleTimes\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedMethods();

} // CIM_MetricServiceCapabilities
