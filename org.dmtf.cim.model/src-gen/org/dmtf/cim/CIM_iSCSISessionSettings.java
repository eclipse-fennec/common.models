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
 * A representation of the model object '<em><b>CIM iSCSI Session Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The default negotiation settings for an iSCSI Session. These properties are used as the starting position for login negotiations between initiator and target nodes. The properties describing the resulting outcome of the login negotiation are in the iSCSISession class. Depending on a given implementation an instance of iSCSISessionSettings will be associated by ElementSettingData to one or more instances of iSCSIProtocolEndpoint, SCSIProtocolController, or ComputerSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getInitialR2TPreference <em>Initial R2T Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getImmediateDataPreference <em>Immediate Data Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxDataBurstLength <em>Max Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDataSequenceInOrderPreference <em>Data Sequence In Order Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDataPDUInOrderPreference <em>Data PDU In Order Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDefaultTimeToWaitPreference <em>Default Time To Wait Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDefaultTimeToRetainPreference <em>Default Time To Retain Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionSettings#getErrorRecoveryLevelPreference <em>Error Recovery Level Preference</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSISessionSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Max Connections Per Session</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of connections allowed in each session to and/or from this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Connections Per Session</em>' attribute.
	 * @see #setMaxConnectionsPerSession(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_MaxConnectionsPerSession()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeMaxConnections\"]' ModelCorrespondence='[\"CIM_iSCSISession.MaxConnectionsPerSession\"]'"
	 * @generated
	 */
	Long getMaxConnectionsPerSession();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections Per Session</em>' attribute.
	 * @see #getMaxConnectionsPerSession()
	 * @generated
	 */
	void setMaxConnectionsPerSession(Long value);

	/**
	 * Returns the value of the '<em><b>Initial R2T Preference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the InitialR2T preference for this node: true = YES, false = will try to negotiate NO, will accept YES.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial R2T Preference</em>' attribute.
	 * @see #setInitialR2TPreference(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_InitialR2TPreference()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeInitialR2T\"]' ModelCorrespondence='[\"CIM_iSCSISession.InitialR2T\"]'"
	 * @generated
	 */
	Boolean getInitialR2TPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getInitialR2TPreference <em>Initial R2T Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial R2T Preference</em>' attribute.
	 * @see #getInitialR2TPreference()
	 * @generated
	 */
	void setInitialR2TPreference(Boolean value);

	/**
	 * Returns the value of the '<em><b>Immediate Data Preference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates ImmediateData preference for this node True = YES (but will accept NO), False = NO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate Data Preference</em>' attribute.
	 * @see #setImmediateDataPreference(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_ImmediateDataPreference()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeImmediateData\"]' ModelCorrespondence='[\"CIM_iSCSISession.ImmediateData\"]'"
	 * @generated
	 */
	Boolean getImmediateDataPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getImmediateDataPreference <em>Immediate Data Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Data Preference</em>' attribute.
	 * @see #getImmediateDataPreference()
	 * @generated
	 */
	void setImmediateDataPreference(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Outstanding R2T</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of outstanding R2Ts allowed per ISCSI task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Outstanding R2T</em>' attribute.
	 * @see #setMaxOutstandingR2T(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_MaxOutstandingR2T()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeMaxOutstandingR2T\"]' ModelCorrespondence='[\"CIM_iSCSISession.MaxOutstandingR2T\"]'"
	 * @generated
	 */
	Long getMaxOutstandingR2T();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Outstanding R2T</em>' attribute.
	 * @see #getMaxOutstandingR2T()
	 * @generated
	 */
	void setMaxOutstandingR2T(Long value);

	/**
	 * Returns the value of the '<em><b>Max Unsolicited First Data Burst Length</b></em>' attribute.
	 * The default value is <code>"65536"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length (bytes) supported for unsolicited data to/from this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Unsolicited First Data Burst Length</em>' attribute.
	 * @see #setMaxUnsolicitedFirstDataBurstLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_MaxUnsolicitedFirstDataBurstLength()
	 * @model default="65536"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeFirstBurstLength\"]' ModelCorrespondence='[\"CIM_iSCSISession.MaxUnsolicitedFirstDataBurstLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxUnsolicitedFirstDataBurstLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unsolicited First Data Burst Length</em>' attribute.
	 * @see #getMaxUnsolicitedFirstDataBurstLength()
	 * @generated
	 */
	void setMaxUnsolicitedFirstDataBurstLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Data Burst Length</b></em>' attribute.
	 * The default value is <code>"262144"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Burst Length</em>' attribute.
	 * @see #setMaxDataBurstLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_MaxDataBurstLength()
	 * @model default="262144"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeMaxBurstLength\"]' ModelCorrespondence='[\"CIM_iSCSISession.MaxDataBurstLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxDataBurstLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getMaxDataBurstLength <em>Max Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Burst Length</em>' attribute.
	 * @see #getMaxDataBurstLength()
	 * @generated
	 */
	void setMaxDataBurstLength(Long value);

	/**
	 * Returns the value of the '<em><b>Data Sequence In Order Preference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataSequenceInOrder preference of this node. False (=No) indicates that iSCSI data PDU sequences MAY be transferred in any order. True (=Yes) indicates that data PDU sequences MUST be transferred using continuously increasing offsets, except during error recovery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sequence In Order Preference</em>' attribute.
	 * @see #setDataSequenceInOrderPreference(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_DataSequenceInOrderPreference()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDataSequenceInOrder\"]' ModelCorrespondence='[\"CIM_iSCSISession.DataSequenceInOrder\"]'"
	 * @generated
	 */
	Boolean getDataSequenceInOrderPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDataSequenceInOrderPreference <em>Data Sequence In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sequence In Order Preference</em>' attribute.
	 * @see #getDataSequenceInOrderPreference()
	 * @generated
	 */
	void setDataSequenceInOrderPreference(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data PDU In Order Preference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataPDUInOrder preference of this node. False (=No) indicates that iSCSI data PDUs within sequences MAY be in any order. True (=Yes) indicates that data PDUs within sequences MUST be at continuously increasing addresses, with no gaps or overlay between PDUs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data PDU In Order Preference</em>' attribute.
	 * @see #setDataPDUInOrderPreference(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_DataPDUInOrderPreference()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDataPDUInOrder\"]' ModelCorrespondence='[\"CIM_iSCSISession.DataPDUInOrder\"]'"
	 * @generated
	 */
	Boolean getDataPDUInOrderPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDataPDUInOrderPreference <em>Data PDU In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data PDU In Order Preference</em>' attribute.
	 * @see #getDataPDUInOrderPreference()
	 * @generated
	 */
	void setDataPDUInOrderPreference(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Time To Wait Preference</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DefaultTime2Wait preference of this node. This is the minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Time To Wait Preference</em>' attribute.
	 * @see #setDefaultTimeToWaitPreference(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_DefaultTimeToWaitPreference()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Seconds' MinValue='0' MaxValue='3600' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDefaultTime2Wait\"]' ModelCorrespondence='[\"CIM_iSCSISession.DefaultTimeToWait\"]' PUnit='second'"
	 * @generated
	 */
	Long getDefaultTimeToWaitPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDefaultTimeToWaitPreference <em>Default Time To Wait Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time To Wait Preference</em>' attribute.
	 * @see #getDefaultTimeToWaitPreference()
	 * @generated
	 */
	void setDefaultTimeToWaitPreference(Long value);

	/**
	 * Returns the value of the '<em><b>Default Time To Retain Preference</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DefaultTime2Retain preference of this node. This is the maximum time, in seconds after an initial wait (Time2Wait), before which an active iSCSI task reassignment is still possible after an unexpected connection termination or a connection reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Time To Retain Preference</em>' attribute.
	 * @see #setDefaultTimeToRetainPreference(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_DefaultTimeToRetainPreference()
	 * @model default="20"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Seconds' MinValue='0' MaxValue='3600' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeDefaultTime2Retain\"]' ModelCorrespondence='[\"CIM_iSCSISession.DefaultTimeToRetain\"]' PUnit='second'"
	 * @generated
	 */
	Long getDefaultTimeToRetainPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getDefaultTimeToRetainPreference <em>Default Time To Retain Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time To Retain Preference</em>' attribute.
	 * @see #getDefaultTimeToRetainPreference()
	 * @generated
	 */
	void setDefaultTimeToRetainPreference(Long value);

	/**
	 * Returns the value of the '<em><b>Error Recovery Level Preference</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ErrorRecoveryLevel preference of this node. Currently, only 0-2 are valid. This is designed to accommodate future error recover levels. 
	 * Higher error recovery levels imply support in addition to support for the lower error level functions. In other words, error level 2 implies support for levels 0-1, since those functions are subsets of error level 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Recovery Level Preference</em>' attribute.
	 * @see #setErrorRecoveryLevelPreference(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionSettings_ErrorRecoveryLevelPreference()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MinValue='0' MaxValue='255' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiNodeErrorRecoveryLevel\"]' ModelCorrespondence='[\"CIM_iSCSISession.ErrorRecoveryLevel\"]'"
	 * @generated
	 */
	Long getErrorRecoveryLevelPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionSettings#getErrorRecoveryLevelPreference <em>Error Recovery Level Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Recovery Level Preference</em>' attribute.
	 * @see #getErrorRecoveryLevelPreference()
	 * @generated
	 */
	void setErrorRecoveryLevelPreference(Long value);

} // CIM_iSCSISessionSettings
