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
 * A representation of the model object '<em><b>CIM Switch Port Spanning Tree Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding a SwitchPort participating in the spanning tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTreeStatistics#getForwardTransitions <em>Forward Transitions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTreeStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,SAPCreationClassName,SAPName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortSpanningTreeStatistics extends CIM_SAPStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Forward Transitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times the port has transitioned from the Learning state to the Forwarding state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forward Transitions</em>' attribute.
	 * @see #setForwardTransitions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTreeStatistics_ForwardTransitions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortForwardTransitions\"]'"
	 * @generated
	 */
	Long getForwardTransitions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTreeStatistics#getForwardTransitions <em>Forward Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Transitions</em>' attribute.
	 * @see #getForwardTransitions()
	 * @generated
	 */
	void setForwardTransitions(Long value);

} // CIM_SwitchPortSpanningTreeStatistics
