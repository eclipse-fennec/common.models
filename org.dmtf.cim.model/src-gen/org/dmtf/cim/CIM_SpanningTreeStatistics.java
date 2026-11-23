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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Spanning Tree Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding the SpanningTreeService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeStatistics#getTimeSinceTopologyChange <em>Time Since Topology Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeStatistics#getTopChanges <em>Top Changes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SpanningTreeStatistics extends CIM_ServiceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Time Since Topology Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time since the last topology change was detected by the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Since Topology Change</em>' attribute.
	 * @see #setTimeSinceTopologyChange(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeStatistics_TimeSinceTopologyChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpTimeSinceTopologyChange\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getTimeSinceTopologyChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeStatistics#getTimeSinceTopologyChange <em>Time Since Topology Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Since Topology Change</em>' attribute.
	 * @see #getTimeSinceTopologyChange()
	 * @generated
	 */
	void setTimeSinceTopologyChange(Long value);

	/**
	 * Returns the value of the '<em><b>Top Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of topology changes detected by the switch since the counter was last reset or initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Changes</em>' attribute.
	 * @see #setTopChanges(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeStatistics_TopChanges()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpTopChanges\"]'"
	 * @generated
	 */
	Long getTopChanges();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeStatistics#getTopChanges <em>Top Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Changes</em>' attribute.
	 * @see #getTopChanges()
	 * @generated
	 */
	void setTopChanges(Long value);

} // CIM_SpanningTreeStatistics
