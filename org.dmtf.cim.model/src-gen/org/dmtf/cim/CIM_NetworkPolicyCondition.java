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
 * A representation of the model object '<em><b>CIM Network Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class describes network policy conditions that can be applied to policy rules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.53.0' UMLPackagePath='CIM::Network' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.\nTo ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nIf not set to null for DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPolicyCondition extends CIM_Policy {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the type of parameter that is used to match traffic.
	 * 
	 * SourceIPAddress: IP address indicating the sender of the packet.
	 * DestinationIPAddress: IP address indicating the receiver of the packet.
	 * VirtualIPAddress: describes the IP address from which the server pool is accessed from.
	 * SourcePort: identifies the sending port
	 * SourcePortRange: identifies a range of sending ports
	 * DestinationPort: identifies the receiving port
	 * DestinationPortRange: identifies a range of receiving ports
	 * HTTPURL: identifies the URL under a HTTP request.
	 * HTTPContent: identifies the Content-Type field under the HTPP request
	 * HTTPCookieName: identifies a cookie name under the HTTP request
	 * HTTPCookieValue: identifies a cookie value under the HTTP request
	 * HTTPHeaderName: identifies a header name under the HTTP request
	 * HTTPHeaderValue: identifies a header value under the HTTP request
	 * HTTPMethod: identifies the HTTP method used in the HTTP request.
	 * Protocol: identifies the Protocol field under the IPv4 Header.
	 * NextHeader: identifies the Protocol field under the IPv6 Header.
	 * SourceSubnet: identifies the subnet of the sender of the packet.
	 * DestinationSubnet: identifies the subnet of the receiver of the packet.
	 * Application: identifies the name of the application.
	 * SourceDomainName: identifies the domain name of the sender of the packet.
	 * DestinationDomainName: identifies the domain name of the receiver of the packet.
	 * SourceMACAddress: MAC address indicating the sender of the packet.
	 * DestinationMACAddress: MAC address indicating the receiver of the packet.
	 * SourceHostName: identifies the host name of the sender of the packet.
	 * DestinationHostName: identifies the host name of the receiver of the packet.
	 * SourceNetwork: identifies the network of the sender of the packet.
	 * DestinationNetwork: identifies the network of the sender of the packet.
	 * TCPFlag: identifies the flags field under the TCP header.
	 * TCPState: identifies the state of the TCP connection.
	 * EtherType: identifies the etherType field under the Ethernet frame.
	 * ICMPType: identifies the Type field under a ICMP header.
	 * ConnectionLimit: identifies maximum number of concurrent connections.
	 * VirtualSystemName: identifies the name of a VirtualSystem.
	 * VNIC-ID: identifies the ID of a Virtual NIC.
	 * CoS: identifies the Class of Service (CoS) field that is present in an Ethernet frame header.
	 * DSCP: identifies the Differentiated Services Code Point (DSCP) field under the IPv4 Header.
	 * PacketLength: identifies the TotalLength field under the IP Header
	 * SSLCipher: identifies the SSL cipher suite used for the HTTPS connection.
	 * SSLCipherStrength: identifies the SSL cipher strength of the SSL Certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyCondition_ParameterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"..\",\"32767..65535\"]' Values='[\"Other\",\"SourceIPAddress\",\"DestinationIPAddress\",\"VirtualIPAddress\",\"SourcePort\",\"SourcePortRange\",\"DestinationPort\",\"DestinationPortRange\",\"HTTPURL\",\"HTTPContent\",\"HTTPCookieName\",\"HTTPCookieValue\",\"HTTPHeaderName\",\"HTTPHeaderValue\",\"HTTPMethod\",\"Protocol\",\"NextHeader\",\"SourceSubnet\",\"DestinationSubnet\",\"Application\",\"SourceDomainName\",\"DestinationDomainName\",\"SourceMACAddress\",\"DestinationMACAddress\",\"SourceHostName\",\"DestinationHostName\",\"SourceNetwork\",\"DestinationNetwork\",\"TCPFlag\",\"TCPState\",\"EtherType\",\"ICMPType\",\"ConnectionLimit\",\"VirtualSystemName\",\"VNIC-ID\",\"CoS\",\"DSCP\",\"PacketLength\",\"SSLCipher\",\"SSLCipherStrength\",\"HeaderName\",\"HeaderValue\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getParameterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(Integer value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property defines the possible values for the operator function.
	 * 
	 * IsEqualTo - The value of the parameter is the same as the given value (All value types)
	 * IsGreaterThan - The value of a parameter is strictly greater than the given value (Numeric values only)
	 * IsLessThan - The value of a parameter is strictly less than the given value (Numeric values only)
	 * IsInRange - The value of a parameter is between or includes the given values (Numeric values only)
	 * BeginsWithString - An initial substring of the parameter is the same as the given string (String values only)
	 * EndsWithString - A final substring of the parameter is the same as the given string (String values only)
	 * ContainsString - A substring of the parameter is the same as the given string (String values only)
	 * IsContainedInList - The value of the parameter is contained in the given list (All value types)
	 * IsNotEqualTo - The value of the parameter is not the same at the given value (All value types)
	 * IsNotGreaterThan - The parameter is less than or equal to the given value (Numeric values only)
	 * IsNotLessThan - The parameter is greater than or equal to the given value (Numeric values only)
	 * IsNotInRange - The parameter is strictly outside the given range of values (Numeric values only)
	 * DoesNotBeginWithString - Any initial substring of the parameter does not match the given string (String values only)
	 * DoesNotEndWithString - Any final substring of the parameter does not match the given string (String values only)
	 * DoesNotContainString - Any substring of the parameter does not match the given string (String values only)
	 * IsNotContainedInList - The parameter is not amongst those listed (All value types)
	 * Offset - One can use a portion of an HTTP header to make persistent connections to a specific server. To define the portion of the header, one specifies header offset and length values. So, the offset here refers to the offset from the HTTP header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyCondition_Operator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"32767..65535\"]' Values='[\"Other\",\"IsEqualTo\",\"IsGreaterThan\",\"IsLessThan\",\"IsInRange\",\"BeginsWithString\",\"EndsWithString\",\"ContainsString\",\"IsContainedInList\",\"IsNotEqualTo\",\"IsNotGreaterThan\",\"IsNotLessThan\",\"IsNotInRange\",\"DoesNotBeginWithString\",\"DoesNotEndWithString\",\"DoesNotContainString\",\"IsNotContainedInList\",\"Offset\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getOperator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the value of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' attribute.
	 * @see #setParameterValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyCondition_ParameterValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getParameterValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyCondition#getParameterValue <em>Parameter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value</em>' attribute.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(String value);

} // CIM_NetworkPolicyCondition
