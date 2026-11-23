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
 * A representation of the model object '<em><b>CIM Wi Fi Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A wireless communication endpoint which, when its associated interface device is associated with an IEEE 802.11 wireless LAN, may send and receive data frames.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getIEEE8021xAuthenticationProtocol <em>IEEE802 1x Authentication Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getAccessPointAddress <em>Access Point Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpoint#getAssociated <em>Associated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::Wireless' override.LANID='string' override.LANID.Description='LANID shall contain the Service Set Identifier (SSID) of the wireless LAN with which the Endpoint is associated, or shall be NULL if the Endpoint is not currently associated or this information is not known.' override.LANID.MappingStrings='[\"IEEE 802.11-2007 | 7.3.2.1\"]' override.ProtocolIFType='uint16' override.ProtocolIFType.Description='ProtocolIFType\'s enumeration is limited to Wi-Fi and reserved values for this subclass of ProtocolEndpoint.' override.ProtocolIFType.ValueMap='[\"1\",\"71\",\"225..4095\",\"4301..32767\",\"32768..\"]' override.ProtocolIFType.Values='[\"Other\",\"IEEE 802.11\",\"IANA Reserved\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiEndpoint extends CIM_LANEndpoint {
	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EncryptionMethod shall specify the encryption method in use to protect the confidentiality of data sent and received by the WiFiEndpoint.
	 * 	* Unknown (0): shall indicate that the encryption method is unknown to the server.
	 * 	* Other (1): shall indicate that the encryption method is known to the server but not defined in the list below. If EncryptionMethod contains 1, OtherEncryptionMethod shall not be NULL and shall not be empty.
	 * 	* WEP (2): shall indicate that the encryption method is Wired Equivalency Privacy (WEP). The value of EncryptionMethod shall be 2 only if the value of AuthenticationMethod is 2 ("Open System") or 3 ("Shared Key").
	 * 	* TKIP (3): shall indicate that the encryption method is Temporal Key Integrity Protocol (TKIP). The value of EncryptionMethod shall be 3 only if the value of AuthenticationMethod is 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* CCMP (4): shall indicate that the encryption method is Counter Mode with Cipher Block Chaining Message Authentication Code Protocol (CCMP). The value of EncryptionMethod shall be 4 only if the value of AuthenticationMethod is 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* None (5): shall indicate that no encryption method is in use. The value of EncryptionMethod shall be 5 only if the value of AuthenticationMethod is 2 ("Open System") or 3 ("Shared Key").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Method</em>' attribute.
	 * @see #setEncryptionMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_EncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..\"]' Values='[\"Unknown\",\"Other\",\"WEP\",\"TKIP\",\"CCMP\",\"None\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.AuthenticationMethod\",\"CIM_WiFiEndpoint.OtherEncryptionMethod\"]'"
	 * @generated
	 */
	Integer getEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getEncryptionMethod <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Method</em>' attribute.
	 * @see #getEncryptionMethod()
	 * @generated
	 */
	void setEncryptionMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherEncryptionMethod shall specify the 802.11 encryption method if and only if EncryptionMethod contains "Other". The format of this string shall be vendor-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encryption Method</em>' attribute.
	 * @see #setOtherEncryptionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_OtherEncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WiFiEndpoint.EncryptionMethod\"]'"
	 * @generated
	 */
	String getOtherEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getOtherEncryptionMethod <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encryption Method</em>' attribute.
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 */
	void setOtherEncryptionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuthenticationMethod shall specify the method used to authenticate the WiFiEndpoint and the network to one another.
	 * 	* Unknown (0): shall indicate that the authentication method is unknown to the server.	* Other (1): shall indicate that the authentication method is known to the server but not specified in the list below. If AuthenticationMethod contains 1, OtherAuthenticationMethod shall not be NULL and shall not be empty.
	 * 	* Open System (2): shall indicate that the authentication method is Open System. AuthenticationMethod shall contain 2 only if EncryptionMethod contains 2 ("WEP").
	 * 	* Shared Key (3): shall indicate that the authentication method is Shared Key. AuthenticationMethod shall contain 3 only if EncryptionMethod contains 2 ("WEP").
	 * 	* WPA PSK (4): shall indicate that the authentication method is WPA (Wi-Fi Protected Access) PSK (Pre-Shared Key). AuthenticationMethod shall contain 4 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA IEEE 802.1x (5): shall indicate that the authentication method is WPA (Wi-Fi Protected Access) IEEE 802.1x. AuthenticationMethod shall contain 5 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 PSK (6): shall indicate that the authentication method is WPA2 (Wi-Fi Protected Access Version 2) PSK (Pre-Shared Key). AuthenticationMethod shall contain 6 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 IEEE 802.1x (7): shall indicate that the authentication method is WPA2 (Wi-Fi Protected Access Version 2) IEEE 802.1x. AuthenticationMethod shall contain 6 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* CCKM IEEE 802.1x (8): CCKM (Cisco Centralized Key Management with LEAP or EAP-FAST)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see #setAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_AuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9..\"]' Values='[\"Unknown\",\"Other\",\"Open System\",\"Shared Key\",\"WPA PSK\",\"WPA IEEE 802.1x\",\"WPA2 PSK\",\"WPA2 IEEE 802.1x\",\"CCKM IEEE 802.1x\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.EncryptionMethod\",\"CIM_WiFiEndpoint.IEEE8021xAuthenticationProtocol\",\"CIM_WiFiEndpoint.OtherAuthenticationMethod\"]'"
	 * @generated
	 */
	Integer getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Method</em>' attribute.
	 * @see #getAuthenticationMethod()
	 * @generated
	 */
	void setAuthenticationMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherAuthenticationMethod shall specify the 802.11 authentication method if and only if AuthenticationMethod contains "Other". The format of this string shall be vendor-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #setOtherAuthenticationMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_OtherAuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WiFiEndpoint.AuthenticationMethod\"]'"
	 * @generated
	 */
	String getOtherAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getOtherAuthenticationMethod <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 */
	void setOtherAuthenticationMethod(String value);

	/**
	 * Returns the value of the '<em><b>IEEE802 1x Authentication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IEEE8021xAuthenticationProtocol shall contain the EAP (Extensible Authentication Protocol) type if and only if AuthenticationMethod contains "WPA IEEE 802.1x" or "WPA2 IEEE 802.1x" or "CCKM IEEE 802.1x"
	 * .	* EAP-TLS (0): shall indicate the Transport Layer Security EAP type specified in RFC 2716.
	 * 	* EAP-TTLS/MSCHAPv2 (1): shall indicate the Tunneled TLS Authentication Protocol EAP type (specified in draft-ietf-pppext-eap-ttls) with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method.
	 * 	* PEAPv0/EAP-MSCHAPv2 (2): shall indicate the Protected Extensible Authentication Protocol (PEAP) Version 0 EAP type (specified in draft-kamath-pppext-peapv0), with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method.
	 * 	* PEAPv1/EAP-GTC (3): shall indicate the Protected Extensible Authentication Protocol (PEAP) Version 1 EAP type (specified in draft-josefsson-pppext-eap-tls-eap), with Generic Token Card (GTC) as the inner authentication method.
	 * 	* EAP-FAST/MSCHAPv2 (4): shall indicate the Flexible Authentication Extensible Authentication Protocol EAP type specified in IETF RFC 4851, with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method.
	 * 	* EAP-FAST/GTC (5): shall indicate the Flexible Authentication Extensible Authentication Protocol EAP type specified in IETF RFC 4851, with Generic Token Card (GTC) as the inner authentication method.
	 * 	* EAP-MD5 (6): shall indicate the EAP MD5 authentication method, specified in RFC 3748.
	 * 	* EAP-PSK (7): shall indicate the EAP-PSK (Pre-shared Key) Protocol specified in RFC 4764.
	 * 	* EAP-SIM (8): shall indicate the Extensible Authentication Protocol Method for Global System for Mobile Communications (GSM) Subscriber Identity Modules (EAP-SIM), specified in RFC 4186.
	 * 	* EAP-AKA (9): shall indicate the Extensible Authentication Protocol Method for 3rd Generation Authentication and Key Agreement (EAP-AKA) authentication method, specified in RFC 4187.
	 * 	* EAP-FAST/TLS (10): shall indicate the Flexible Authentication Extensible Authentication Protocol EAP type specified in IETF RFC 4851, with TLS as the inner authentication method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IEEE802 1x Authentication Protocol</em>' attribute.
	 * @see #setIEEE8021xAuthenticationProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_IEEE8021xAuthenticationProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..\"]' Values='[\"EAP-TLS\",\"EAP-TTLS/MSCHAPv2\",\"PEAPv0/EAP-MSCHAPv2\",\"PEAPv1/EAP-GTC\",\"EAP-FAST/MSCHAPv2\",\"EAP-FAST/GTC\",\"EAP-MD5\",\"EAP-PSK\",\"EAP-SIM\",\"EAP-AKA\",\"EAP-FAST/TLS\",\"DMTF Reserved\"]' MappingStrings='[\"RFC4017.IETF\",\"RFC2716.IETF\",\"draft-ietf-pppext-eap-ttls.IETF\",\"draft-kamath-pppext-peapv0.IETF\",\"draft-josefsson-pppext-eap-tls-eap\",\"RFC4851.IETF\",\"RFC3748.IETF\",\"RFC4764.IETF\",\"RFC4186.IETF\",\"RFC4187.IETF\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.AuthenticationMethod\"]'"
	 * @generated
	 */
	Integer getIEEE8021xAuthenticationProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getIEEE8021xAuthenticationProtocol <em>IEEE802 1x Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEEE802 1x Authentication Protocol</em>' attribute.
	 * @see #getIEEE8021xAuthenticationProtocol()
	 * @generated
	 */
	void setIEEE8021xAuthenticationProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AccessPointAddress shall contain the MAC address of the access point with which the WiFiEndpoint is currently associated. If the WiFiEndpoint is not currently associated, then AccessPointAddress shall be NULL.The MAC address shall be formatted as twelve hexadecimal digits (for example, "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Point Address</em>' attribute.
	 * @see #setAccessPointAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_AccessPointAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAccessPointAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getAccessPointAddress <em>Access Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Point Address</em>' attribute.
	 * @see #getAccessPointAddress()
	 * @generated
	 */
	void setAccessPointAddress(String value);

	/**
	 * Returns the value of the '<em><b>BSS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSSType shall indicate the Basic Service Set (BSS) Type of the network that corresponds to the instance. A Basic Service Set is a set of stations controlled by a single coordination function.
	 * 	* Independent: the WiFiEndpoint is associated directly to another client station.
	 * 	* Infrastructure: the WiFiEndpoint is associated to a network via an access point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BSS Type</em>' attribute.
	 * @see #setBSSType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_BSSType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4..\"]' Values='[\"Unknown\",\"Independent\",\"Infrastructure\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 3.16\"]'"
	 * @generated
	 */
	Integer getBSSType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getBSSType <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSS Type</em>' attribute.
	 * @see #getBSSType()
	 * @generated
	 */
	void setBSSType(Integer value);

	/**
	 * Returns the value of the '<em><b>Associated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated shall indicate whether or not the WiFiEndpoint is currently associated to an access point or client station.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated</em>' attribute.
	 * @see #setAssociated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpoint_Associated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAssociated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpoint#getAssociated <em>Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated</em>' attribute.
	 * @see #getAssociated()
	 * @generated
	 */
	void setAssociated(Boolean value);

} // CIM_WiFiEndpoint
