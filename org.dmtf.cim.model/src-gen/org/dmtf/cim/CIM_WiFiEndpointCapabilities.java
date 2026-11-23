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
 * A representation of the model object '<em><b>CIM Wi Fi Endpoint Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the capabilities of a WiFiEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointCapabilities#getSupportedEncryptionMethods <em>Supported Encryption Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointCapabilities#getOtherSupportedEncryptionMethods <em>Other Supported Encryption Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointCapabilities#getSupportedAuthenticationMethods <em>Supported Authentication Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointCapabilities#getOtherSupportedAuthenticationMethods <em>Other Supported Authentication Methods</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::Wireless' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiEndpointCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Encryption Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of IEEE 802.11 encryption methods supported by the associated WifiEndpoint. Shall contain one or more of the values below.
	 * 	* Other (1): shall indicate that at least one encryption method not specified in the list below is supported. If SupportedEncryptionMethods contains 1, OtherSupportedEncryptionMethods shall not be NULL and shall not be empty.
	 * 	* WEP (2): shall indicate that Wired Equivalency Privacy (WEP) is supported. SupportedEncryptionMethods shall contain 2 only if SupportedAuthenticationMethods contains 2 ("Open System") or 3 ("Shared Key").
	 * 	* TKIP (3): shall indicate that the Temporal Key Integrity Protocol (TKIP) is supported. SupportedEncryptionMethods shall contain 3 only if SupportedAuthenticationMethods contains 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* CCMP (4): shall indicate that the Counter Mode with Cipher Block Chaining Message Authentication Code Protocol (CCMP) is supported. SupportedEncryptionMethods shall contain 4 only if SupportedAuthenticationMethods contains 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* None (5): shall indicate that the associated WiFiEndpoint supports connecting to a network without encryption. SupportedEncryptionMethods shall contain 5 only if SupportedAuthenticationMethods contains 2 ("Open System") or 3 ("Shared Key").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Encryption Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointCapabilities_SupportedEncryptionMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"Other\",\"WEP\",\"TKIP\",\"CCMP\",\"None\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.EncryptionMethod\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedEncryptionMethods();

	/**
	 * Returns the value of the '<em><b>Other Supported Encryption Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall contain additional encryption methods supported by the associated WifiEndpoint, but not listed in the valuemap for SupportedEncryptionMethods. The positions of these strings are the lowest indices of the array, and do not correspond to the positions of the values in SupportedEncryptionMethods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Encryption Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointCapabilities_OtherSupportedEncryptionMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_WiFiEndpoint.OtherEncryptionMethod\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedEncryptionMethods();

	/**
	 * Returns the value of the '<em><b>Supported Authentication Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of IEEE 802.11 authentication methods supported by the associated WifiEndpoint.	* Other (1): shall indicate that at least one authentication method not specified in the list below is supported. If SupportedAuthenticationMethods contains 1, OtherSupportedAuthenticationMethods shall not be NULL and shall not be empty.
	 * 	* Open System (2): shall indicate that Open System authentication is supported. SupportedAuthenticationMethods shall contain 2 only if SupportedEncryptionMethods contains 2 ("WEP") or 5 ("None").
	 * 	* Shared Key (3): shall indicate Shared Key authentication is supported. SupportedAuthenticationMethods shall contain 3 only if SupportedEncryptionMethods contains 2 ("WEP") or 5 ("None").
	 * 	* WPA PSK (4): shall indicate that WPA (Wi-Fi Protected Access) PSK (Pre-Shared Key) authentication is supported. SupportedAuthenticationMethods shall contain 4 only if SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA IEEE 802.1x (5): shall indicate that WPA (Wi-Fi Protected Access) IEEE 802.1x authentication is supported. SupportedAuthenticationMethods shall contain 5 only if SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 PSK (6): shall indicate that WPA2 (Wi-Fi Protected Access Version 2) PSK (Pre-Shared Key) authentication is supported. SupportedAuthenticationMethods shall contain 6 only if SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 IEEE 802.1x (7): shall indicate that WPA2 (Wi-Fi Protected Access Version 2) IEEE 802.1x authentication is supported. SupportedAuthenticationMethods shall contain 7 only if SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Authentication Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointCapabilities_SupportedAuthenticationMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Other\",\"Open System\",\"Shared Key\",\"WPA PSK\",\"WPA IEEE 802.1x\",\"WPA2 PSK\",\"WPA2 IEEE 802.1X\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.AuthenticationMethod\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAuthenticationMethods();

	/**
	 * Returns the value of the '<em><b>Other Supported Authentication Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall contain additional authentication methods supported by the associated WifiEndpoint, but not listed in the valuemap for SupportedAuthenticationMethods. The positions of these strings are the lowest indices of the array, and do not correspond to the positions of the values in SupportedAuthenticationMethods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Authentication Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointCapabilities_OtherSupportedAuthenticationMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_WiFiEndpoint.OtherAuthenticationMethod\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedAuthenticationMethods();

} // CIM_WiFiEndpointCapabilities
