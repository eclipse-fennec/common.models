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
 * A representation of the model object '<em><b>CIM Switch Port Transparent Bridging Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding a SwitchPort, at which transparent bridging is performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getInFrames <em>In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getOutFrames <em>Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getInDiscards <em>In Discards</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortTransparentBridgingStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,SAPCreationClassName,SAPName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortTransparentBridgingStatistics extends CIM_SAPStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>In Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames that have been received by the port from its segment. Note that a frame is only counted if and only if it is for a protocol being processed by the local bridging function, including bridge management frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Frames</em>' attribute.
	 * @see #setInFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortTransparentBridgingStatistics_InFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortInFrames\"]'"
	 * @generated
	 */
	Long getInFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getInFrames <em>In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Frames</em>' attribute.
	 * @see #getInFrames()
	 * @generated
	 */
	void setInFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Out Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames that have been transmitted by the port to its segment. Note that a frame is only counted if and only if it is for a protocol being processed by the local bridging function, including bridge management frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Frames</em>' attribute.
	 * @see #setOutFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortTransparentBridgingStatistics_OutFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortOutFrames\"]'"
	 * @generated
	 */
	Long getOutFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getOutFrames <em>Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Frames</em>' attribute.
	 * @see #getOutFrames()
	 * @generated
	 */
	void setOutFrames(Long value);

	/**
	 * Returns the value of the '<em><b>In Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of valid frames received which were discarded (i.e., filtered) by the forwarding process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Discards</em>' attribute.
	 * @see #setInDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortTransparentBridgingStatistics_InDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortInDiscards\"]'"
	 * @generated
	 */
	Long getInDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortTransparentBridgingStatistics#getInDiscards <em>In Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Discards</em>' attribute.
	 * @see #getInDiscards()
	 * @generated
	 */
	void setInDiscards(Long value);

} // CIM_SwitchPortTransparentBridgingStatistics
