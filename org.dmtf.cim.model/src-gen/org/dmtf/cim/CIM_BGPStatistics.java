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
 * A representation of the model object '<em><b>CIM BGP Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains statistical information for a Service's sessions. It is deprecated since the statistics are defined in the BGP4 MIB at the level of individual peers/ endpoints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getInUpdates <em>In Updates</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getOutUpdates <em>Out Updates</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getInTotalMessages <em>In Total Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getOutTotalMessages <em>Out Total Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getLastError <em>Last Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getFsmEstablishedTransitions <em>Fsm Established Transitions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getFsmEstablishedTime <em>Fsm Established Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPStatistics#getInUpdateElapsedTime <em>In Update Elapsed Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_BGPEndpointStatistics\"]' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BGPStatistics extends CIM_ServiceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>In Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the number of BGP UPDATE messages received on this router's BGP connection. This is a 32-bit counter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Updates</em>' attribute.
	 * @see #setInUpdates(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_InUpdates()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.InUpdates\"]' Counter='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerInUpdates\"]'"
	 * @generated
	 */
	Long getInUpdates();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getInUpdates <em>In Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Updates</em>' attribute.
	 * @see #getInUpdates()
	 * @generated
	 */
	void setInUpdates(Long value);

	/**
	 * Returns the value of the '<em><b>Out Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the number of BGP UPDATE messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Updates</em>' attribute.
	 * @see #setOutUpdates(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_OutUpdates()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.OutUpdates\"]' Counter='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerOutUpdates\"]'"
	 * @generated
	 */
	Long getOutUpdates();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getOutUpdates <em>Out Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Updates</em>' attribute.
	 * @see #getOutUpdates()
	 * @generated
	 */
	void setOutUpdates(Long value);

	/**
	 * Returns the value of the '<em><b>In Total Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the total number of BGP messages received on this router's BGP connection. This is a 32-bit counter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Total Messages</em>' attribute.
	 * @see #setInTotalMessages(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_InTotalMessages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.InTotalMessages\"]' Counter='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerInTotalMessages\"]'"
	 * @generated
	 */
	Long getInTotalMessages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getInTotalMessages <em>In Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Total Messages</em>' attribute.
	 * @see #getInTotalMessages()
	 * @generated
	 */
	void setInTotalMessages(Long value);

	/**
	 * Returns the value of the '<em><b>Out Total Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the total number of BGP messages transmitted on this router's BGP connection. This is a 32-bit counter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Total Messages</em>' attribute.
	 * @see #setOutTotalMessages(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_OutTotalMessages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.OutTotalMessages\"]' Counter='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerOutTotalMessages\"]'"
	 * @generated
	 */
	Long getOutTotalMessages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getOutTotalMessages <em>Out Total Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Total Messages</em>' attribute.
	 * @see #getOutTotalMessages()
	 * @generated
	 */
	void setOutTotalMessages(Long value);

	/**
	 * Returns the value of the '<em><b>Last Error</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains the last error code and error subcode for this router's BGP connection. If no error has occurred, then each integer in the array is zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Error</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_LastError()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Deprecated='[\"CIM_BGPEndpointStatistics.LastError\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerLastError\"]'"
	 * @generated
	 */
	EList<Integer> getLastError();

	/**
	 * Returns the value of the '<em><b>Fsm Established Transitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains the total number of times that the BGP Finite State Machine has transitioned into the established state for this router's BGP connection. This is a 32-bit counter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fsm Established Transitions</em>' attribute.
	 * @see #setFsmEstablishedTransitions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_FsmEstablishedTransitions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.FsmEstablishedTransitions\"]' Counter='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerFsmEstablishedTransitions\"]'"
	 * @generated
	 */
	Long getFsmEstablishedTransitions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getFsmEstablishedTransitions <em>Fsm Established Transitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm Established Transitions</em>' attribute.
	 * @see #getFsmEstablishedTransitions()
	 * @generated
	 */
	void setFsmEstablishedTransitions(Long value);

	/**
	 * Returns the value of the '<em><b>Fsm Established Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates how long, in seconds, this peer has been in the established state, or how long since this peer was last in the established state. It is set to zero when a new peer is configured or when the router is booted. This has the semantics of a 32-bit gauge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fsm Established Time</em>' attribute.
	 * @see #setFsmEstablishedTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_FsmEstablishedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.FsmEstablishedTime\"]' Units='Seconds' Gauge='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerFsmEstablishedTime\"]' PUnit='second'"
	 * @generated
	 */
	Long getFsmEstablishedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getFsmEstablishedTime <em>Fsm Established Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm Established Time</em>' attribute.
	 * @see #getFsmEstablishedTime()
	 * @generated
	 */
	void setFsmEstablishedTime(Long value);

	/**
	 * Returns the value of the '<em><b>In Update Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time in seconds since the last BGP UPDATE message was received from the peer. This has the semantics of a 32-bit gauge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Update Elapsed Time</em>' attribute.
	 * @see #setInUpdateElapsedTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPStatistics_InUpdateElapsedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_BGPEndpointStatistics.InUpdateElapsedTime\"]' Units='Seconds' Gauge='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerInUpdateElapsedTime\"]' PUnit='second'"
	 * @generated
	 */
	Long getInUpdateElapsedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPStatistics#getInUpdateElapsedTime <em>In Update Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Update Elapsed Time</em>' attribute.
	 * @see #getInUpdateElapsedTime()
	 * @generated
	 */
	void setInUpdateElapsedTime(Long value);

} // CIM_BGPStatistics
