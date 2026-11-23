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
 * A representation of the model object '<em><b>CIM OSPF Protocol Endpoint Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for OSPF protocol endpoints, defining several general properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getTransitDelay <em>Transit Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getRetransmitInterval <em>Retransmit Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getOtherAuthType <em>Other Auth Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getAuthKey <em>Auth Key</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.EnabledState='uint16' override.EnabledState.Description='The operational status of the interface, see ospfIfAdminStat in RFC 1850. This is an integer enumeration whose complete definition is found in the EnabledLogicalElement class.' override.EnabledState.MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfAdminStat\"]' override.ProtocolIFType='uint16' override.ProtocolIFType.Description='ProtocolIFType\'s enumeration is limited to OSPF and reserved values for this subclass of ProtocolEndpoint.' override.ProtocolIFType.ValueMap='[\"1\",\"225..4095\",\"4109\",\"4301..32767\",\"32768..\"]' override.ProtocolIFType.Values='[\"Other\",\"IANA Reserved\",\"OSPF\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFProtocolEndpointBase extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Transit Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated delay, in seconds that it takes to transmit a Link State Update Packet over this interface, see C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transit Delay</em>' attribute.
	 * @see #setTransitDelay(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase_TransitDelay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfTransitDelay\"]' PUnit='second'"
	 * @generated
	 */
	Integer getTransitDelay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getTransitDelay <em>Transit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Delay</em>' attribute.
	 * @see #getTransitDelay()
	 * @generated
	 */
	void setTransitDelay(Integer value);

	/**
	 * Returns the value of the '<em><b>Retransmit Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of seconds between LSA (Link State Advertisement) retransmissions, see C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retransmit Interval</em>' attribute.
	 * @see #setRetransmitInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase_RetransmitInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfRetransInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getRetransmitInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getRetransmitInterval <em>Retransmit Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmit Interval</em>' attribute.
	 * @see #getRetransmitInterval()
	 * @generated
	 */
	void setRetransmitInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the authentication procedure to be used on the attached network, see C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Type</em>' attribute.
	 * @see #setAuthType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase_AuthType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Null authentication\",\"Simple password\",\"Cryptographic authentication\"]' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfAuthType\"]'"
	 * @generated
	 */
	Integer getAuthType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getAuthType <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Type</em>' attribute.
	 * @see #getAuthType()
	 * @generated
	 */
	void setAuthType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the authentication procedure if the value, "Other" (1) is set for AuthType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Auth Type</em>' attribute.
	 * @see #setOtherAuthType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase_OtherAuthType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_OSPFProtocolEndpoint.AuthType\"]'"
	 * @generated
	 */
	String getOtherAuthType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getOtherAuthType <em>Other Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Auth Type</em>' attribute.
	 * @see #getOtherAuthType()
	 * @generated
	 */
	void setOtherAuthType(String value);

	/**
	 * Returns the value of the '<em><b>Auth Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This key is used during the authentication procedure to verify OSPF protocol packets, see C.3 RFC 2328. It is used in the "Simple password" and in the "Cryptographic authentication" case too.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Key</em>' attribute.
	 * @see #setAuthKey(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpointBase_AuthKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfAuthKey\"]'"
	 * @generated
	 */
	String getAuthKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpointBase#getAuthKey <em>Auth Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Key</em>' attribute.
	 * @see #getAuthKey()
	 * @generated
	 */
	void setAuthKey(String value);

} // CIM_OSPFProtocolEndpointBase
