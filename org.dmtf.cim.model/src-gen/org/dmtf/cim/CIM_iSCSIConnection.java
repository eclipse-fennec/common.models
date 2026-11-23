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
 * A representation of the model object '<em><b>CIM iSCSI Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains the attributes of and negotiated values for, an iSCSI Connection which is modeled as a subclass of NetworkPipe. The original settings that are a starting point for negotiation are found in the class iSCSIConnectionSettings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getMaxTransmitDataSegmentLength <em>Max Transmit Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getHeaderDigestMethod <em>Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getOtherHeaderDigestMethod <em>Other Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getDataDigestMethod <em>Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getOtherDataDigestMethod <em>Other Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getReceivingMarkers <em>Receiving Markers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getSendingMarkers <em>Sending Markers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getActiveiSCSIVersion <em>Activei SCSI Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getAuthenticationMethodUsed <em>Authentication Method Used</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnection#getMutualAuthentication <em>Mutual Authentication</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSIConnection extends CIM_NetworkPipe {
	/**
	 * Returns the value of the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The iSCSI Connection ID for this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection ID</em>' attribute.
	 * @see #setConnectionID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_ConnectionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnCid\"]'"
	 * @generated
	 */
	Long getConnectionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(Long value);

	/**
	 * Returns the value of the '<em><b>Max Receive Data Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum data payload size supported for command or data PDUs able to be received on this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Receive Data Segment Length</em>' attribute.
	 * @see #setMaxReceiveDataSegmentLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_MaxReceiveDataSegmentLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnMaxRecvDataSegLength\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.MaxReceiveDataSegmentLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxReceiveDataSegmentLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Data Segment Length</em>' attribute.
	 * @see #getMaxReceiveDataSegmentLength()
	 * @generated
	 */
	void setMaxReceiveDataSegmentLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Transmit Data Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum data payload size supported for command or data PDUs to be sent on this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Transmit Data Segment Length</em>' attribute.
	 * @see #setMaxTransmitDataSegmentLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_MaxTransmitDataSegmentLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnMaxXmitDataSegLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxTransmitDataSegmentLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getMaxTransmitDataSegmentLength <em>Max Transmit Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Transmit Data Segment Length</em>' attribute.
	 * @see #getMaxTransmitDataSegmentLength()
	 * @generated
	 */
	void setMaxTransmitDataSegmentLength(Long value);

	/**
	 * Returns the value of the '<em><b>Header Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the iSCSI header digest scheme in use within this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Digest Method</em>' attribute.
	 * @see #setHeaderDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_HeaderDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnHeaderIntegrity\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.PrimaryHeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.SecondaryHeaderDigestMethod\",\"CIM_iSCSIConnection.OtherHeaderDigestMethod\"]'"
	 * @generated
	 */
	Integer getHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getHeaderDigestMethod <em>Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Digest Method</em>' attribute.
	 * @see #getHeaderDigestMethod()
	 * @generated
	 */
	void setHeaderDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Header Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Header Digest scheme in use when HeaderDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Header Digest Method</em>' attribute.
	 * @see #setOtherHeaderDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_OtherHeaderDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.OtherPrimaryHeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherSecondaryHeaderDigestMethod\",\"CIM_iSCSIConnection.HeaderDigestMethod\"]'"
	 * @generated
	 */
	String getOtherHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getOtherHeaderDigestMethod <em>Other Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Header Digest Method</em>' attribute.
	 * @see #getOtherHeaderDigestMethod()
	 * @generated
	 */
	void setOtherHeaderDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Data Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the iSCSI data digest scheme in use within this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Digest Method</em>' attribute.
	 * @see #setDataDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_DataDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnDataIntegrity\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.PrimaryHeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.SecondaryHeaderDigestMethod\",\"CIM_iSCSIConnection.OtherDataDigestMethod\"]'"
	 * @generated
	 */
	Integer getDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getDataDigestMethod <em>Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Digest Method</em>' attribute.
	 * @see #getDataDigestMethod()
	 * @generated
	 */
	void setDataDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Data Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Data Digest scheme in use when DataDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Data Digest Method</em>' attribute.
	 * @see #setOtherDataDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_OtherDataDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.OtherPrimaryDataDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherSecondaryDataDigestMethod\",\"CIM_iSCSIConnection.DataDigestMethod\"]'"
	 * @generated
	 */
	String getOtherDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getOtherDataDigestMethod <em>Other Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Data Digest Method</em>' attribute.
	 * @see #getOtherDataDigestMethod()
	 * @generated
	 */
	void setOtherDataDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Receiving Markers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether or not this connection is receiving markers in in its incoming data stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiving Markers</em>' attribute.
	 * @see #setReceivingMarkers(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_ReceivingMarkers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnRecvMarker\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.RequestingMarkersOnReceive\"]'"
	 * @generated
	 */
	Boolean getReceivingMarkers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getReceivingMarkers <em>Receiving Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Markers</em>' attribute.
	 * @see #getReceivingMarkers()
	 * @generated
	 */
	void setReceivingMarkers(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sending Markers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether or not this connection is inserting markers in in its outgoing data stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending Markers</em>' attribute.
	 * @see #setSendingMarkers(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_SendingMarkers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnSendMarker\"]'"
	 * @generated
	 */
	Boolean getSendingMarkers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getSendingMarkers <em>Sending Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Markers</em>' attribute.
	 * @see #getSendingMarkers()
	 * @generated
	 */
	void setSendingMarkers(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activei SCSI Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Active version number of the iSCSI specification negotiated on this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activei SCSI Version</em>' attribute.
	 * @see #setActiveiSCSIVersion(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_ActiveiSCSIVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiCxnVersionActive\"]' ModelCorrespondence='[\"CIM_iSCSICapabilities.MinimumSpecificationVersionSupported\",\"CIM_iSCSICapabilities.MaximumSpecificationVersionSupported\"]'"
	 * @generated
	 */
	Boolean getActiveiSCSIVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getActiveiSCSIVersion <em>Activei SCSI Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activei SCSI Version</em>' attribute.
	 * @see #getActiveiSCSIVersion()
	 * @generated
	 */
	void setActiveiSCSIVersion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Authentication Method Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The authentication method being used on this connection, as communicated during the login phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Method Used</em>' attribute.
	 * @see #setAuthenticationMethodUsed(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_AuthenticationMethodUsed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"No Authentication\",\"SRP\",\"CHAP\",\"Kerberos\"]' MappingStrings='[\"MIB.IETF|IPS-AUTH-MIB.ipsAuthCredAuthMethod\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.PrimaryAuthenticationMethod\",\"CIM_iSCSIConnectionSettings.SecondaryAuthenticationMethod\",\"CIM_iSCSICapabilities.AuthenticationMethodsSupported\"]'"
	 * @generated
	 */
	Integer getAuthenticationMethodUsed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getAuthenticationMethodUsed <em>Authentication Method Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Method Used</em>' attribute.
	 * @see #getAuthenticationMethodUsed()
	 * @generated
	 */
	void setAuthenticationMethodUsed(Integer value);

	/**
	 * Returns the value of the '<em><b>Mutual Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property when true, indicates that the Target was required to authenticate itself to the Initiator, in addition to the Initiator authenticating itself to the Target. When false, and AuthenticationMethod is other than 'No Authentication', only the Initatior authenticated itself to the Target. 
	 * When AuthenticationMethodUsed is 'No Authentication', this property must be false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutual Authentication</em>' attribute.
	 * @see #setMutualAuthentication(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnection_MutualAuthentication()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMutualAuthentication();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnection#getMutualAuthentication <em>Mutual Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual Authentication</em>' attribute.
	 * @see #getMutualAuthentication()
	 * @generated
	 */
	void setMutualAuthentication(Boolean value);

} // CIM_iSCSIConnection
