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
 * A representation of the model object '<em><b>CIM iSCSI Connection Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The settings for the usage of an iSCSI NetworkPortal by an iSCSIProtcolEndpoint. These settings are the starting point for negotiation for connection establishment. If an implmentation supports different connections settings for a NetworkPortal for each iSCSIProtocolEndpoint that is bound to it, an instance of this class will be associated by ElementSettingData to an instance of iSCSIProtocolEndpoint. If an implementation supports the same connection settings for a NetworkPortal for all iSCSIProtocolEndpoints then an instance of this class will be associated by ElementSettingData to an instance of either TCPProtocolEndpoint (When the NetworkPortal is a target) or IPProtocolEndpoint (When the NetworkPortal is an initiator). The properties that reflect the actual outcome of the negotiation are found in the iSCSIConnection class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryHeaderDigestMethod <em>Primary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherPrimaryHeaderDigestMethod <em>Other Primary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryDataDigestMethod <em>Primary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherPrimaryDataDigestMethod <em>Other Primary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryHeaderDigestMethod <em>Secondary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherSecondaryHeaderDigestMethod <em>Other Secondary Header Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryDataDigestMethod <em>Secondary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherSecondaryDataDigestMethod <em>Other Secondary Data Digest Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getRequestingMarkersOnReceive <em>Requesting Markers On Receive</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryAuthenticationMethod <em>Primary Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryAuthenticationMethod <em>Secondary Authentication Method</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSIConnectionSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Max Receive Data Segment Length</b></em>' attribute.
	 * The default value is <code>"8192"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum PDU length this portal can receive. This MAY be constrained by hardware characteristics and individual implementations MAY choose not to allow this property to be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Receive Data Segment Length</em>' attribute.
	 * @see #setMaxReceiveDataSegmentLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_MaxReceiveDataSegmentLength()
	 * @model default="8192"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Bytes' MinValue='512' MaxValue='16777215' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalMaxRecvDataSegLength\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.MaxReceiveDataSegmentLength\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxReceiveDataSegmentLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getMaxReceiveDataSegmentLength <em>Max Receive Data Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Data Segment Length</em>' attribute.
	 * @see #getMaxReceiveDataSegmentLength()
	 * @generated
	 */
	void setMaxReceiveDataSegmentLength(Long value);

	/**
	 * Returns the value of the '<em><b>Primary Header Digest Method</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred header digest for this portal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Header Digest Method</em>' attribute.
	 * @see #setPrimaryHeaderDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_PrimaryHeaderDigestMethod()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalPrimaryHdrDigest\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.HeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherPrimaryHeaderDigestMethod\"]'"
	 * @generated
	 */
	Integer getPrimaryHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryHeaderDigestMethod <em>Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Header Digest Method</em>' attribute.
	 * @see #getPrimaryHeaderDigestMethod()
	 * @generated
	 */
	void setPrimaryHeaderDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Primary Header Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the preferred Header Digest method when PrimaryHeaderDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Primary Header Digest Method</em>' attribute.
	 * @see #setOtherPrimaryHeaderDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_OtherPrimaryHeaderDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_iSCSIConnection.OtherHeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.PrimaryHeaderDigestMethod\"]'"
	 * @generated
	 */
	String getOtherPrimaryHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherPrimaryHeaderDigestMethod <em>Other Primary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Primary Header Digest Method</em>' attribute.
	 * @see #getOtherPrimaryHeaderDigestMethod()
	 * @generated
	 */
	void setOtherPrimaryHeaderDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Primary Data Digest Method</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred data digest method for this portal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Data Digest Method</em>' attribute.
	 * @see #setPrimaryDataDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_PrimaryDataDigestMethod()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalPrimaryDataDigest\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.DataDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherPrimaryDataDigestMethod\"]'"
	 * @generated
	 */
	Integer getPrimaryDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryDataDigestMethod <em>Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Data Digest Method</em>' attribute.
	 * @see #getPrimaryDataDigestMethod()
	 * @generated
	 */
	void setPrimaryDataDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Primary Data Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the preferred Data Digest method when PrimaryDataDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Primary Data Digest Method</em>' attribute.
	 * @see #setOtherPrimaryDataDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_OtherPrimaryDataDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_iSCSIConnection.OtherDataDigestMethod\",\"CIM_iSCSIConnectionSettings.PrimaryDataDigestMethod\"]'"
	 * @generated
	 */
	String getOtherPrimaryDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherPrimaryDataDigestMethod <em>Other Primary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Primary Data Digest Method</em>' attribute.
	 * @see #getOtherPrimaryDataDigestMethod()
	 * @generated
	 */
	void setOtherPrimaryDataDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Header Digest Method</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The secondary header digest preference for this portal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Header Digest Method</em>' attribute.
	 * @see #setSecondaryHeaderDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_SecondaryHeaderDigestMethod()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\",\"No Secondary Preference\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalSecondaryHdrDigest\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.HeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherSecondaryHeaderDigestMethod\"]'"
	 * @generated
	 */
	Integer getSecondaryHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryHeaderDigestMethod <em>Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Header Digest Method</em>' attribute.
	 * @see #getSecondaryHeaderDigestMethod()
	 * @generated
	 */
	void setSecondaryHeaderDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Secondary Header Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the alternate Header Digest method preference when SecondaryHeaderDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Secondary Header Digest Method</em>' attribute.
	 * @see #setOtherSecondaryHeaderDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_OtherSecondaryHeaderDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_iSCSIConnection.OtherHeaderDigestMethod\",\"CIM_iSCSIConnectionSettings.SecondaryHeaderDigestMethod\"]'"
	 * @generated
	 */
	String getOtherSecondaryHeaderDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherSecondaryHeaderDigestMethod <em>Other Secondary Header Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Secondary Header Digest Method</em>' attribute.
	 * @see #getOtherSecondaryHeaderDigestMethod()
	 * @generated
	 */
	void setOtherSecondaryHeaderDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Data Digest Method</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The secondary data digest preference for this portal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Data Digest Method</em>' attribute.
	 * @see #setSecondaryDataDigestMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_SecondaryDataDigestMethod()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"No Digest\",\"CRC32C\",\"No Secondary Preference\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalSecondaryDataDigest\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.DataDigestMethod\",\"CIM_iSCSIConnectionSettings.OtherSecondaryDataDigestMethod\"]'"
	 * @generated
	 */
	Integer getSecondaryDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryDataDigestMethod <em>Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Data Digest Method</em>' attribute.
	 * @see #getSecondaryDataDigestMethod()
	 * @generated
	 */
	void setSecondaryDataDigestMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Secondary Data Digest Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the alternate Data Digest method preference when SecondaryDataDigestMethod is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Secondary Data Digest Method</em>' attribute.
	 * @see #setOtherSecondaryDataDigestMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_OtherSecondaryDataDigestMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_iSCSIConnection.OtherDataDigestMethod\",\"CIM_iSCSIConnectionSettings.SecondaryDataDigestMethod\"]'"
	 * @generated
	 */
	String getOtherSecondaryDataDigestMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getOtherSecondaryDataDigestMethod <em>Other Secondary Data Digest Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Secondary Data Digest Method</em>' attribute.
	 * @see #getOtherSecondaryDataDigestMethod()
	 * @generated
	 */
	void setOtherSecondaryDataDigestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Requesting Markers On Receive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether or not this portal will request markers in it's incoming data stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requesting Markers On Receive</em>' attribute.
	 * @see #setRequestingMarkersOnReceive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_RequestingMarkersOnReceive()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiPortalRecvMarker\"]' ModelCorrespondence='[\"CIM_iSCSIConnection.ReceivingMarkers\"]'"
	 * @generated
	 */
	Boolean getRequestingMarkersOnReceive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getRequestingMarkersOnReceive <em>Requesting Markers On Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requesting Markers On Receive</em>' attribute.
	 * @see #getRequestingMarkersOnReceive()
	 * @generated
	 */
	void setRequestingMarkersOnReceive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Authentication Method</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred primary authentication method for connections, as communicated during the login phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Authentication Method</em>' attribute.
	 * @see #setPrimaryAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_PrimaryAuthenticationMethod()
	 * @model default="5"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"None\",\"No Authentication\",\"SRP\",\"CHAP\",\"Kerberos\"]' MappingStrings='[\"MIB.IETF|IPS-AUTH-MIB.ipsAuthCredAuthMethod\"]' ModelCorrespondence='[\"CIM_iSCSICapabilities.AuthenticationMethodsSupported\",\"CIM_iSCSIConnectionSettings.SecondaryAuthenticationMethod\",\"CIM_iSCSIConnection.AuthenticationMethodUsed\"]'"
	 * @generated
	 */
	Integer getPrimaryAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getPrimaryAuthenticationMethod <em>Primary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Authentication Method</em>' attribute.
	 * @see #getPrimaryAuthenticationMethod()
	 * @generated
	 */
	void setPrimaryAuthenticationMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Secondary Authentication Method</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred secondary authentication method for connections, as communicated during the login phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Authentication Method</em>' attribute.
	 * @see #setSecondaryAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConnectionSettings_SecondaryAuthenticationMethod()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"None\",\"No Authentication\",\"SRP\",\"CHAP\",\"Kerberos\"]' MappingStrings='[\"MIB.IETF|IPS-AUTH-MIB.ipsAuthCredAuthMethod\"]' ModelCorrespondence='[\"CIM_iSCSICapabilities.AuthenticationMethodsSupported\",\"CIM_iSCSIConnectionSettings.PrimaryAuthenticationMethod\",\"CIM_iSCSIConnection.AuthenticationMethodUsed\"]'"
	 * @generated
	 */
	Integer getSecondaryAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConnectionSettings#getSecondaryAuthenticationMethod <em>Secondary Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Authentication Method</em>' attribute.
	 * @see #getSecondaryAuthenticationMethod()
	 * @generated
	 */
	void setSecondaryAuthenticationMethod(Integer value);

} // CIM_iSCSIConnectionSettings
