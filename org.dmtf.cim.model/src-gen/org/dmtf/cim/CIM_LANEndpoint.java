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
 * A representation of the model object '<em><b>CIM LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A communication endpoint which, when its associated interface device is connected to a LAN, may send and receive data frames. LANEndpoints include Ethernet, Token Ring and FDDI interfaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getMACAddress <em>MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getAliasAddresses <em>Alias Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getGroupAddresses <em>Group Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANEndpoint#getMaxDataSize <em>Max Data Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.54.1' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LANEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>LANID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LANID</em>' attribute.
	 * @see #setLANID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_LANID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LANConnectivitySegment.LANID\",\"CIM_LANSegment.LANID\"]'"
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANEndpoint#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LAN Type</em>' attribute.
	 * @see #setLANType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_LANType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ProtocolEndpoint.ProtocolType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"TokenRing\",\"FDDI\"]' ModelCorrespondence='[\"CIM_LANConnectivitySegment.ConnectivityType\",\"CIM_LANSegment.LANType\"]'"
	 * @generated
	 */
	Integer getLANType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANEndpoint#getLANType <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN Type</em>' attribute.
	 * @see #getLANType()
	 * @generated
	 */
	void setLANType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other LAN Type</em>' attribute.
	 * @see #setOtherLANType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_OtherLANType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ProtocolEndpoint.OtherTypeDescription\"]' ModelCorrespondence='[\"CIM_LANConnectivitySegment.OtherTypeDescription\",\"CIM_LANEndpoint.LANType\"]'"
	 * @generated
	 */
	String getOtherLANType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANEndpoint#getOtherLANType <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other LAN Type</em>' attribute.
	 * @see #getOtherLANType()
	 * @generated
	 */
	void setOtherLANType(String value);

	/**
	 * Returns the value of the '<em><b>MAC Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MAC Address</em>' attribute.
	 * @see #setMACAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_MACAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='12'"
	 * @generated
	 */
	String getMACAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANEndpoint#getMACAddress <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAC Address</em>' attribute.
	 * @see #getMACAddress()
	 * @generated
	 */
	void setMACAddress(String value);

	/**
	 * Returns the value of the '<em><b>Alias Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other unicast addresses that may be used to communicate with the LANEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_AliasAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getAliasAddresses();

	/**
	 * Returns the value of the '<em><b>Group Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multicast addresses to which the LANEndpoint listens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_GroupAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getGroupAddresses();

	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest information field that may be sent or received by the LANEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANEndpoint_MaxDataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' PUnit='bit'"
	 * @generated
	 */
	Long getMaxDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANEndpoint#getMaxDataSize <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Size</em>' attribute.
	 * @see #getMaxDataSize()
	 * @generated
	 */
	void setMaxDataSize(Long value);

} // CIM_LANEndpoint
