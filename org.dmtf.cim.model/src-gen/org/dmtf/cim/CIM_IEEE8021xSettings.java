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
 * A representation of the model object '<em><b>CIM IEEE802 1x Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE8021xSettings specifies a set of IEEE 802.1x Port-Based Network Access Control settings that can be applied to a ISO OSI layer 2 ProtocolEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getAuthenticationProtocol <em>Authentication Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getRoamingIdentity <em>Roaming Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getServerCertificateName <em>Server Certificate Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getServerCertificateNameComparison <em>Server Certificate Name Comparison</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getUsername <em>Username</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getPassword <em>Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getProtectedAccessCredential <em>Protected Access Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getPACPassword <em>PAC Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xSettings#getPSK <em>PSK</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::IEEE8021x' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IEEE8021xSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Authentication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuthenticationProtocol shall indicate the desired EAP (Extensible Authentication Protocol) type.
	 * 	* EAP-TLS (0): shall indicate that the desired EAP type is the Transport Layer Security EAP type specified in RFC 2716. If AuthenticationProtocol contains 0, Username should not be null, ServerCertificateName and ServerCertificateNameComparison may be null or not null, and RoamingIdentity, Password, Domain, ProtectedAccessCredential, PACPassword, and PSK should be null.
	 * 	* EAP-TTLS/MSCHAPv2 (1): shall indicate that the desired EAP type is the Tunneled TLS Authentication Protocol EAP type specified in draft-ietf-pppext-eap-ttls, with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method. If AuthenticationProtocol contains 1, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, and Domain may be null or not null, and ProtectedAccessCredential, PACPassword, and PSK should be null.
	 * 	* PEAPv0/EAP-MSCHAPv2 (2): shall indicate that the desired EAP type is the Protected Extensible Authentication Protocol (PEAP) Version 0 EAP type specified in draft-kamath-pppext-peapv0, with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method. If AuthenticationProtocol contains2, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, and Domain may be null or not null, and ProtectedAccessCredential, PACPassword, and PSK should be null.
	 * 	* PEAPv1/EAP-GTC (3): shall indicate that the desired EAP type is the Protected Extensible Authentication Protocol (PEAP) Version 1 EAP type specified in draft-josefsson-pppext-eap-tls-eap, with Generic Token Card (GTC) as the inner authentication method. If AuthenticationProtocol contains 3, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, and Domain may be null or not null, and ProtectedAccessCredential, PACPassword, and PSK should be null.
	 * 	* EAP-FAST/MSCHAPv2 (4): shall indicate that the desired EAP type is the Flexible Authentication Extensible Authentication Protocol EAP type specified in IETF RFC 4851, with Microsoft PPP CHAP Extensions, Version 2 (MSCHAPv2) as the inner authentication method. If AuthenticationProtocol contains 4, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, Domain, ProtectedAccessCredential, and PACPassword may be null or not null, and PSK should be null.
	 * 	* EAP-FAST/GTC (5): shall indicate that the desired EAP type is the Flexible Authentication Extensible Authentication Protocol EAP type specified in IETF RFC 4851, with Generic Token Card (GTC) as the inner authentication method. If AuthenticationProtocol contains 5, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, Domain, ProtectedAccessCredential, and PACPassword may be null or not null, and PSK should be null.
	 * 	* EAP-MD5 (6): shall indicate that the desired EAP type is the EAP MD5 authentication method, specified in RFC 3748. If AuthenticationProtocol contains 6, Username and Password should not be null, Domain may be null or not null, and RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, ProtectedAccessCredential, PACPassword, and PSK should be null.
	 * 	* EAP-PSK (7): shall indicate that the desired EAP type is the EAP-PSK (Pre-Shared Key) EAP type specified in RFC 4764. If AuthenticationProtocol contains 7, Username and PSK should not be null, Domain and RoamingIdentity may be null or not null, and Password, ServerCertificateName, ServerCertificateNameComparison, ProtectedAccessCredential, and PACPassword should be null.
	 * 	* EAP-SIM (8): shall indicate that the desired EAP type is the Extensible Authentication Protocol Method for Global System for Mobile Communications (GSM) Subscriber Identity Modules (EAP-SIM), specified in RFC 4186. If AuthenticationProtocol contains 8, Username and PSK should not be null, Domain and RoamingIdentity may be null or not null, and Password, ServerCertificateName, ServerCertificateNameComparison, ProtectedAccessCredential, and PACPassword should be null.
	 * 	* EAP-AKA (9): shall indicate that the desired EAP type is the EAP Method for 3rd Generation Authentication and Key Agreement (EAP-AKA), specified in RFC 4187. If AuthenticationProtocol contains 9, Username and PSK should not be null, Domain and RoamingIdentity may be null or not null, and Password, ServerCertificateName, ServerCertificateNameComparison, ProtectedAccessCredential, and PACPassword should be null.
	 * 	* EAP-FAST/TLS (10): shall indicate that the desired EAP type is the Flexible Authentication EAP type specified in IETF RFC 4851, with TLS as the inner authentication method. If AuthenticationProtocol contains 10, Username and Password should not be null, RoamingIdentity, ServerCertificateName, ServerCertificateNameComparison, Domain, ProtectedAccessCredential, and PACPassword may be null or not null, and PSK should be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Protocol</em>' attribute.
	 * @see #setAuthenticationProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_AuthenticationProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\"]' Values='[\"EAP-TLS\",\"EAP-TTLS/MSCHAPv2\",\"PEAPv0/EAP-MSCHAPv2\",\"PEAPv1/EAP-GTC\",\"EAP-FAST/MSCHAPv2\",\"EAP-FAST/GTC\",\"EAP-MD5\",\"EAP-PSK\",\"EAP-SIM\",\"EAP-AKA\",\"EAP-FAST/TLS\",\"DMTF Reserved\"]' MappingStrings='[\"RFC4017.IETF\",\"RFC2716.IETF\",\"draft-ietf-pppext-eap-ttls.IETF\",\"draft-kamath-pppext-peapv0.IETF\",\"draft-josefsson-pppext-eap-tls-eap\",\"RFC4851.IETF\",\"RFC3748.IETF\",\"RFC4764.IETF\",\"RFC4186.IETF\",\"RFC4187.IETF\"]'"
	 * @generated
	 */
	Integer getAuthenticationProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getAuthenticationProtocol <em>Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Protocol</em>' attribute.
	 * @see #getAuthenticationProtocol()
	 * @generated
	 */
	void setAuthenticationProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Roaming Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string presented to the authentication server in 802.1x protocol exchange. The AAA server determines the format of this string. Formats supported by AAA servers include: <domain>\<username>, <username>@<domain>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roaming Identity</em>' attribute.
	 * @see #setRoamingIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_RoamingIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRoamingIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getRoamingIdentity <em>Roaming Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roaming Identity</em>' attribute.
	 * @see #getRoamingIdentity()
	 * @generated
	 */
	void setRoamingIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Server Certificate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name that shall be compared against the subject name field in the certificate provided by the AAA server. Shall contain either the fully qualified domain name of the AAA server, in which case ServerCertificateNameComparison shall contain "FullName", or the domain suffix of the AAA server, in which case ServerCertificateNameComparison shall contain "DomainSuffix".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Certificate Name</em>' attribute.
	 * @see #setServerCertificateName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_ServerCertificateName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IEEE8021xSettings.ServerCertificateNameComparison\"]'"
	 * @generated
	 */
	String getServerCertificateName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getServerCertificateName <em>Server Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Certificate Name</em>' attribute.
	 * @see #getServerCertificateName()
	 * @generated
	 */
	void setServerCertificateName(String value);

	/**
	 * Returns the value of the '<em><b>Server Certificate Name Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The comparison algorithm that shall be used by the server to validate the subject name field of the certificate presented by the AAA server against the value of the ServerCertificateName property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Certificate Name Comparison</em>' attribute.
	 * @see #setServerCertificateNameComparison(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_ServerCertificateNameComparison()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"Other\",\"FullName\",\"DomainSuffix\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_IEEE8021xSettings.ServerCertificateName\"]'"
	 * @generated
	 */
	Integer getServerCertificateNameComparison();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getServerCertificateNameComparison <em>Server Certificate Name Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Certificate Name Comparison</em>' attribute.
	 * @see #getServerCertificateNameComparison()
	 * @generated
	 */
	void setServerCertificateNameComparison(Integer value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the user requesting access to the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_Username()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC2716.IETF\",\"draft-ietf-pppext-eap-ttls.IETF\",\"draft-kamath-pppext-peapv0.IETF\",\"draft-josefsson-pppext-eap-tls-eap\",\"RFC4851.IETF\",\"RFC3748.IETF\",\"RFC4764.IETF\",\"RFC4186.IETF\",\"RFC4187.IETF\"]'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A password associated with the user identified by Username within Domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_Password()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"draft-ietf-pppext-eap-ttls.IETF\",\"draft-kamath-pppext-peapv0.IETF\",\"draft-josefsson-pppext-eap-tls-eap\",\"RFC4851.IETF\",\"RFC3748.IETF\"]'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain (also known as realm) within which Username is unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_Domain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"draft-ietf-pppext-eap-ttls.IETF\",\"draft-kamath-pppext-peapv0.IETF\",\"draft-josefsson-pppext-eap-tls-eap\",\"RFC4851.IETF\",\"RFC3748.IETF\",\"RFC4764.IETF\",\"RFC4186.IETF\",\"RFC4187.IETF\"]'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Protected Access Credential</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A credential used by the supplicant and AAA server to establish a mutually authenticated encrypted tunnel for confidential user authentication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protected Access Credential</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_ProtectedAccessCredential()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' MappingStrings='[\"RFC4851.IETF\"]'"
	 * @generated
	 */
	EList<Integer> getProtectedAccessCredential();

	/**
	 * Returns the value of the '<em><b>PAC Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional password to extract the PAC (Protected Access Credential) information from the PAC data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PAC Password</em>' attribute.
	 * @see #setPACPassword(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_PACPassword()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC4851.IETF\"]'"
	 * @generated
	 */
	String getPACPassword();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xSettings#getPACPassword <em>PAC Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAC Password</em>' attribute.
	 * @see #getPACPassword()
	 * @generated
	 */
	void setPACPassword(String value);

	/**
	 * Returns the value of the '<em><b>PSK</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pre-shared key used for pre-shared key EAP types such as EAP-PSK, EAP-SIM, and EAP-AKA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PSK</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xSettings_PSK()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' MappingStrings='[\"RFC4764.IETF\",\"RFC4186.IETF\",\"RFC4187.IETF\"]'"
	 * @generated
	 */
	EList<Integer> getPSK();

} // CIM_IEEE8021xSettings
