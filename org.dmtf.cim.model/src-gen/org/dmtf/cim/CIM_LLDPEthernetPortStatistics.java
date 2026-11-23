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
 * A representation of the model object '<em><b>CIM LLDP Ethernet Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class describes LLDP statistics that applies to LLDP frames on this Ethernet Port. For more detailed descriptions on these properties, please refer to IEEE LLDP-EXT-DOT1-V2-MIB.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getTxDestMACAddress <em>Tx Dest MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getTxPortFramesTotal <em>Tx Port Frames Total</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getTxLLDPDULengthErrors <em>Tx LLDPDU Length Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxDestMACAddress <em>Rx Dest MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxPortFramesDiscardedTotal <em>Rx Port Frames Discarded Total</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxPortFramesErrors <em>Rx Port Frames Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxPortTLVsDiscardedTotal <em>Rx Port TL Vs Discarded Total</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxPortTLVsUnrecognizedTotal <em>Rx Port TL Vs Unrecognized Total</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPortStatistics#getRxPortAgeoutsTotal <em>Rx Port Ageouts Total</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.34.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LLDPEthernetPortStatistics extends CIM_EthernetPortStatistics {
	/**
	 * Returns the value of the '<em><b>Tx Dest MAC Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remote MAC addresses to which LLDP frames were transmitted through the port to which these statistics apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Dest MAC Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_TxDestMACAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsTxDestMACAddress\"]'"
	 * @generated
	 */
	EList<String> getTxDestMACAddress();

	/**
	 * Returns the value of the '<em><b>Tx Port Frames Total</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of LLDP frames transmitted through the port to which these statistics apply to the remote MAC address in the corresponding entry of TxDestMACAddress. This array and the TxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Port Frames Total</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_TxPortFramesTotal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsTxPortFramesTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.TxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getTxPortFramesTotal();

	/**
	 * Returns the value of the '<em><b>Tx LLDPDU Length Errors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of LLDPDU Length Errors recorded for the LLDP frames transmitted through this port to which these statistics apply to the remote MAC address in the corresponding entry of TxDestMACAddress. This array and the TxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx LLDPDU Length Errors</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_TxLLDPDULengthErrors()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsTxLLDPDULengthErrors\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.TxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getTxLLDPDULengthErrors();

	/**
	 * Returns the value of the '<em><b>Rx Dest MAC Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remote MAC addresses from which LLDP frames were received through the port to which these statistics apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Dest MAC Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxDestMACAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxDestMACAddress\"]'"
	 * @generated
	 */
	EList<String> getRxDestMACAddress();

	/**
	 * Returns the value of the '<em><b>Rx Port Frames Discarded Total</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * he number of LLDP frames received through the port to which these statistics apply from the remote MAC address in the corresponding entry of RxDestMACAddress, that were then discarded for any reason. This array and the RxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Port Frames Discarded Total</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxPortFramesDiscardedTotal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxPortFramesDiscardedTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.RxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getRxPortFramesDiscardedTotal();

	/**
	 * Returns the value of the '<em><b>Rx Port Frames Errors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of LLDP frames with errors received through the port to which these statistics apply from the remote MAC address in the corresponding entry of RxDestMACAddress. This array and the RxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Port Frames Errors</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxPortFramesErrors()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxPortFramesTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.RxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getRxPortFramesErrors();

	/**
	 * Returns the value of the '<em><b>Rx Port TL Vs Discarded Total</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of TLVs in LLDP frames received through the port to which these statistics apply from the remote MAC address in the corresponding entry of RxDestMACAddress, that were discarded for any reason. This array and the RxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Port TL Vs Discarded Total</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxPortTLVsDiscardedTotal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxPortTLVsDiscardedTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.RxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getRxPortTLVsDiscardedTotal();

	/**
	 * Returns the value of the '<em><b>Rx Port TL Vs Unrecognized Total</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of TLVs in LLDP frames received through the port to which these statistics apply from the remote MAC address in the corresponding entry of RxDestMACAddress, that were not recognized. This array and the RxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Port TL Vs Unrecognized Total</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxPortTLVsUnrecognizedTotal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxPortTLVsUnrecognizedTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.RxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getRxPortTLVsUnrecognizedTotal();

	/**
	 * Returns the value of the '<em><b>Rx Port Ageouts Total</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of age-outs in the (remote) port of the remote MAC address in the corresponding entry of RxDestMACAddress. This array and the RxDestMACAddress array shall be index-correlated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Port Ageouts Total</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPortStatistics_RxPortAgeoutsTotal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Counter='true' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2StatsRxPortAgeoutsTotal\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPortStatistics.RxDestMACAddress\"]'"
	 * @generated
	 */
	EList<Long> getRxPortAgeoutsTotal();

} // CIM_LLDPEthernetPortStatistics
