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
 * A representation of the model object '<em><b>CIM iSCSI Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * iSCSISession is a network pipe between an initiator and target SCSIProtocolEndpoints. An iSCSISession is composed of one or more TCP connections which MUST be selected from a SystemSpecificCollection representing an iSCSI Portal Group. NetworkPipeComposition aggregates NetworkPipe instances representing iSCSI connections, which are associated to TCPProtocolEndpoints. Only an iSCSI initiator can create an iSCSI Session, an iSCSI Target MUST accept (or reject) a session request. EndOfNetworkPipe associates iSCSISession with SCSIProtocolEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getTSIH <em>TSIH</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getEndPointName <em>End Point Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getCurrentConnections <em>Current Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getInitialR2T <em>Initial R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getImmediateData <em>Immediate Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getMaxDataBurstLength <em>Max Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getDataSequenceInOrder <em>Data Sequence In Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getDataPDUInOrder <em>Data PDU In Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getErrorRecoveryLevel <em>Error Recovery Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getDefaultTimeToWait <em>Default Time To Wait</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISession#getDefaultTimeToRetain <em>Default Time To Retain</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::Pipes' override.Directionality='uint16' override.Directionality.Description='iSCSI sessions MUST be bidirectional.' override.Directionality.ValueMap='[\"2\"]' override.Directionality.Values='[\"Bi-Directional\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSISession extends CIM_NetworkPipe {
	/**
	 * Returns the value of the '<em><b>Session Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iSCSI Session type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Type</em>' attribute.
	 * @see #setSessionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_SessionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Discovery\",\"Normal\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnType\"]'"
	 * @generated
	 */
	Integer getSessionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getSessionType <em>Session Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Type</em>' attribute.
	 * @see #getSessionType()
	 * @generated
	 */
	void setSessionType(Integer value);

	/**
	 * Returns the value of the '<em><b>TSIH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target Session Identifying Handle (TSIH) for this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSIH</em>' attribute.
	 * @see #setTSIH(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_TSIH()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnTSIH\"]'"
	 * @generated
	 */
	Long getTSIH();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getTSIH <em>TSIH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSIH</em>' attribute.
	 * @see #getTSIH()
	 * @generated
	 */
	void setTSIH(Long value);

	/**
	 * Returns the value of the '<em><b>End Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The iSCSI Port Name (iSCSIProtocolEndPoint.Name), of the device at the other end of this iSCSISession.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point Name</em>' attribute.
	 * @see #setEndPointName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_EndPointName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnInitiatorName\",\"MIB.IETF|iSCSI-MIB.iscsiSsnTargetName\"]'"
	 * @generated
	 */
	String getEndPointName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getEndPointName <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Name</em>' attribute.
	 * @see #getEndPointName()
	 * @generated
	 */
	void setEndPointName(String value);

	/**
	 * Returns the value of the '<em><b>Current Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of transport protocol connections that currently belong to this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Connections</em>' attribute.
	 * @see #setCurrentConnections(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_CurrentConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnConnectionNumber\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.MaxConnectionsPerSession\"]'"
	 * @generated
	 */
	Long getCurrentConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getCurrentConnections <em>Current Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Connections</em>' attribute.
	 * @see #getCurrentConnections()
	 * @generated
	 */
	void setCurrentConnections(Long value);

	/**
	 * Returns the value of the '<em><b>Initial R2T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, indicates that the initiator MUST wait for an R2T before sending to the target. If set to false, the initiator MAY send data immediately, within limits set by iscsiSsnFirstBurstLength and the expected data transfer length of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial R2T</em>' attribute.
	 * @see #setInitialR2T(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_InitialR2T()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnInitialR2T\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.InitialR2TPreference\"]'"
	 * @generated
	 */
	Boolean getInitialR2T();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getInitialR2T <em>Initial R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial R2T</em>' attribute.
	 * @see #getInitialR2T()
	 * @generated
	 */
	void setInitialR2T(Boolean value);

	/**
	 * Returns the value of the '<em><b>Immediate Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the initiator and target have agreed to support immediate data on this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate Data</em>' attribute.
	 * @see #setImmediateData(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_ImmediateData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnImmediateData\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.ImmediateDataPreference\"]'"
	 * @generated
	 */
	Boolean getImmediateData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getImmediateData <em>Immediate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Data</em>' attribute.
	 * @see #getImmediateData()
	 * @generated
	 */
	void setImmediateData(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Outstanding R2T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of outstanding request-to-transmit (R2T)s per iSCSI task within this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Outstanding R2T</em>' attribute.
	 * @see #setMaxOutstandingR2T(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_MaxOutstandingR2T()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnMaxOutstandingR2T\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.MaxOutstandingR2T\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxOutstandingR2T();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Outstanding R2T</em>' attribute.
	 * @see #getMaxOutstandingR2T()
	 * @generated
	 */
	void setMaxOutstandingR2T(Long value);

	/**
	 * Returns the value of the '<em><b>Max Unsolicited First Data Burst Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length supported for unsolicited data sent within this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Unsolicited First Data Burst Length</em>' attribute.
	 * @see #setMaxUnsolicitedFirstDataBurstLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_MaxUnsolicitedFirstDataBurstLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnFirstBurstLength\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.MaxUnsolicitedFirstDataBurstLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxUnsolicitedFirstDataBurstLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unsolicited First Data Burst Length</em>' attribute.
	 * @see #getMaxUnsolicitedFirstDataBurstLength()
	 * @generated
	 */
	void setMaxUnsolicitedFirstDataBurstLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Data Burst Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Burst Length</em>' attribute.
	 * @see #setMaxDataBurstLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_MaxDataBurstLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnMaxBurstLength\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.MaxDataBurstLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxDataBurstLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getMaxDataBurstLength <em>Max Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Burst Length</em>' attribute.
	 * @see #getMaxDataBurstLength()
	 * @generated
	 */
	void setMaxDataBurstLength(Long value);

	/**
	 * Returns the value of the '<em><b>Data Sequence In Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False indicates that iSCSI data PDU sequences MAY be transferred in any order. True indicates that data PDU sequences MUST be transferred using continuously increasing offsets, except during error recovery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sequence In Order</em>' attribute.
	 * @see #setDataSequenceInOrder(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_DataSequenceInOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnDataSequenceInOrder\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.DataSequenceInOrderPreference\"]'"
	 * @generated
	 */
	Boolean getDataSequenceInOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getDataSequenceInOrder <em>Data Sequence In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sequence In Order</em>' attribute.
	 * @see #getDataSequenceInOrder()
	 * @generated
	 */
	void setDataSequenceInOrder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data PDU In Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False indicates that iSCSI data PDUs within sequences MAY be in any order. True indicates that data PDUs within sequences MUST be at continuously increasing addresses, with no gaps or overlay between PDUs. Default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data PDU In Order</em>' attribute.
	 * @see #setDataPDUInOrder(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_DataPDUInOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnDataPDUInOrder\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.DataPDUInOrderPreference\"]'"
	 * @generated
	 */
	Boolean getDataPDUInOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getDataPDUInOrder <em>Data PDU In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data PDU In Order</em>' attribute.
	 * @see #getDataPDUInOrder()
	 * @generated
	 */
	void setDataPDUInOrder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Recovery Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level of error recovery negotiated between the initiator and the target. Higher numbers represent more detailed recovery schemes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Recovery Level</em>' attribute.
	 * @see #setErrorRecoveryLevel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_ErrorRecoveryLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MaxValue='255' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnErrorRecoveryLevel\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.ErrorRecoveryLevelPreference\"]'"
	 * @generated
	 */
	Long getErrorRecoveryLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getErrorRecoveryLevel <em>Error Recovery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Recovery Level</em>' attribute.
	 * @see #getErrorRecoveryLevel()
	 * @generated
	 */
	void setErrorRecoveryLevel(Long value);

	/**
	 * Returns the value of the '<em><b>Max Connections Per Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of connections allowed in this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Connections Per Session</em>' attribute.
	 * @see #setMaxConnectionsPerSession(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_MaxConnectionsPerSession()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeMaxConnections\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.MaxConnectionsPerSession\"]'"
	 * @generated
	 */
	Long getMaxConnectionsPerSession();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections Per Session</em>' attribute.
	 * @see #getMaxConnectionsPerSession()
	 * @generated
	 */
	void setMaxConnectionsPerSession(Long value);

	/**
	 * Returns the value of the '<em><b>Default Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DefaultTime2Wait negotiated for this Session. This is the minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Time To Wait</em>' attribute.
	 * @see #setDefaultTimeToWait(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_DefaultTimeToWait()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MinValue='0' MaxValue='3600' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDefaultTime2Wait\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.DefaultTimeToWaitPreference\"]' PUnit='second'"
	 * @generated
	 */
	Long getDefaultTimeToWait();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getDefaultTimeToWait <em>Default Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time To Wait</em>' attribute.
	 * @see #getDefaultTimeToWait()
	 * @generated
	 */
	void setDefaultTimeToWait(Long value);

	/**
	 * Returns the value of the '<em><b>Default Time To Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DefaultTime2Retain negotiated for this Session. This is the maximum time, in seconds after an initial wait (Time2Wait), before which an active iSCSI task reassignment is still possible after an unexpected connection termination or a connection reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Time To Retain</em>' attribute.
	 * @see #setDefaultTimeToRetain(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISession_DefaultTimeToRetain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MinValue='0' MaxValue='3600' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDefaultTime2Retain\"]' ModelCorrespondence='[\"CIM_iSCSISessionSettings.DefaultTimeToRetainPreference\"]' PUnit='second'"
	 * @generated
	 */
	Long getDefaultTimeToRetain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISession#getDefaultTimeToRetain <em>Default Time To Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time To Retain</em>' attribute.
	 * @see #getDefaultTimeToRetain()
	 * @generated
	 */
	void setDefaultTimeToRetain(Long value);

} // CIM_iSCSISession
