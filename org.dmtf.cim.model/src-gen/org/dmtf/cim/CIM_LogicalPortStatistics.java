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
 * A representation of the model object '<em><b>CIM Logical Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LogicalPortStatistics class describes the statistics for the LogicalPort of ProtocolEndpoiont.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortStatistics#getBytesTransmitted <em>Bytes Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortStatistics#getBytesReceived <em>Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortStatistics#getPacketsTransmitted <em>Packets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortStatistics#getPacketsReceived <em>Packets Received</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalPortStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Bytes Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of bytes that are transmitted, including framing characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Transmitted</em>' attribute.
	 * @see #setBytesTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortStatistics_BytesTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' MappingStrings='[\"MIB.IETF|MIB-II.ifOutOctets\",\"MIF.DMTF|Network Adapter 802 Port|001.7\"]'"
	 * @generated
	 */
	Long getBytesTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortStatistics#getBytesTransmitted <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Transmitted</em>' attribute.
	 * @see #getBytesTransmitted()
	 * @generated
	 */
	void setBytesTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of bytes that are received, including framing characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Received</em>' attribute.
	 * @see #setBytesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortStatistics_BytesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' MappingStrings='[\"MIB.IETF|MIB-II.ifInOctets\",\"MIF.DMTF|Network Adapter 802 Port|001.9\"]'"
	 * @generated
	 */
	Long getBytesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortStatistics#getBytesReceived <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Received</em>' attribute.
	 * @see #getBytesReceived()
	 * @generated
	 */
	void setBytesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Packets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of packets that are transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packets Transmitted</em>' attribute.
	 * @see #setPacketsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortStatistics_PacketsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPacketsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortStatistics#getPacketsTransmitted <em>Packets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packets Transmitted</em>' attribute.
	 * @see #getPacketsTransmitted()
	 * @generated
	 */
	void setPacketsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Packets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of packets that are received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packets Received</em>' attribute.
	 * @see #setPacketsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortStatistics_PacketsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPacketsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortStatistics#getPacketsReceived <em>Packets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packets Received</em>' attribute.
	 * @see #getPacketsReceived()
	 * @generated
	 */
	void setPacketsReceived(Long value);

} // CIM_LogicalPortStatistics
