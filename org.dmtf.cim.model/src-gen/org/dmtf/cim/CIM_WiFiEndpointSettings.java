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
 * A representation of the model object '<em><b>CIM Wi Fi Endpoint Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WiFiEndpointSettings describes setting data that can be applied to an instance of CIM_WiFiEndpoint to enable it to associate to a particular Wi-Fi network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getSSID <em>SSID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getKeyIndex <em>Key Index</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getPSKValue <em>PSK Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getPSKPassPhrase <em>PSK Pass Phrase</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::Wireless' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiEndpointSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priority shall indicate the priority of the instance among all WiFiEndpointSettings instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>SSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SSID shall indicate the Service Set Identifier (SSID) that shall be used when the settings are applied to a WiFiEndpoint. An SSID identifies a wireless network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SSID</em>' attribute.
	 * @see #setSSID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_SSID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"IEEE 802.11-2007 | 7.3.2.1\"]'"
	 * @generated
	 */
	String getSSID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getSSID <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID</em>' attribute.
	 * @see #getSSID()
	 * @generated
	 */
	void setSSID(String value);

	/**
	 * Returns the value of the '<em><b>BSS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSSType shall indicate the Basic Service Set (BSS) Type that shall be used when the settings are applied. A Basic Service Set is a set of stations controlled by a single coordination function.
	 * 	* Independent: the WiFiEndpoint is associated directly to another client station.
	 * 	* Infrastructure: the WiFiEndpoint is associated to a network via an access point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BSS Type</em>' attribute.
	 * @see #setBSSType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_BSSType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Independent\",\"Infrastructure\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 3.16\"]'"
	 * @generated
	 */
	Integer getBSSType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getBSSType <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSS Type</em>' attribute.
	 * @see #getBSSType()
	 * @generated
	 */
	void setBSSType(Integer value);

	/**
	 * Returns the value of the '<em><b>Encryption Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EncryptionMethod shall specify the 802.11 encryption method used when the settings are applied. 	* Other (1): shall indicate that the desired encryption method is not specified in the list below. If this value is used, OtherEncryptionMethod should not be NULL and should not be empty.
	 * 	* WEP (2): shall indicate that the desired encryption method is Wired Equivalency Privacy (WEP). This value should be used only if AuthenticationMethod contains 2 ("Open System") or 3 ("Shared Key").
	 * 	* TKIP (3): shall indicate that the desired encryption method is Temporal Key Integrity Protocol (TKIP). This value should be used only if AuthenticationMethod contains 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* CCMP (4): shall indicate that the desired encryption method is Counter Mode with Cipher Block Chaining Message Authentication Code Protocol (CCMP). This value should be used only if AuthenticationMethod contains 4 ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
	 * 	* None (5): shall indicate that no encryption is desired. This value should be used only if AuthenticationMethod contains 2 ("Open System") or 3 ("Shared Key").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption Method</em>' attribute.
	 * @see #setEncryptionMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_EncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6..\"]' Values='[\"Other\",\"WEP\",\"TKIP\",\"CCMP\",\"None\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.EncryptionMethod\",\"CIM_WiFiEndpointSettings.AuthenticationMethod\",\"CIM_WiFiEndpointSettings.OtherEncryptionMethod\"]'"
	 * @generated
	 */
	Integer getEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getEncryptionMethod <em>Encryption Method</em>}' attribute.
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
	 * OtherEncryptionMethod shall specify the 802.11 encryption method used when the settings are applied if and only if EncryptionMethod contains "Other". The format of this string shall be vendor-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encryption Method</em>' attribute.
	 * @see #setOtherEncryptionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_OtherEncryptionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WiFiEndpoint.OtherEncryptionMethod\",\"CIM_WiFiEndpointSettings.EncryptionMethod\"]'"
	 * @generated
	 */
	String getOtherEncryptionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getOtherEncryptionMethod <em>Other Encryption Method</em>}' attribute.
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
	 * AuthenticationMethod shall specify the 802.11 authentication method used when the settings are applied. 	* Other (1): shall indicate that the desired authentication method is not specified in the list below. If AuthenticationMethod contains 1, OtherAuthenticationMethod should not be NULL and should not be empty.
	 * 	* Open System (2): shall indicate that the desired authentication method is Open System. AuthenticationMethod should contain 2 only if EncryptionMethod contains 2 ("WEP") or 5 ("None").
	 * 	* Shared Key (3): shall indicate that the desired authentication method is Shared Key. AuthenticationMethod should contain 3 only if EncryptionMethod contains 2 ("WEP") or 5 ("None").
	 * 	* WPA PSK (4): shall indicate that the desired authentication method is WPA (Wi-Fi Protected Access) PSK (Pre-Shared Key). AuthenticationMethod should contain 4 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA IEEE 802.1x (5): shall indicate that the desired authentication method is WPA (Wi-Fi Protected Access) IEEE 802.1x. AuthenticationMethod should contain 5 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 PSK (6): shall indicate that the desired authentication method is WPA2 (Wi-Fi Protected Access Version 2) PSK (Pre-Shared Key). AuthenticationMethod should containt 6 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * 	* WPA2 IEEE 802.1x (7): shall indicated that the desired authentication method is WPA2 (Wi-Fi Protected Access Version 2) IEEE 802.1x. AuthenticationMethod should contain 7 only if EncryptionMethod contains 3 ("TKIP") or 4 ("CCMP").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see #setAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_AuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8..\"]' Values='[\"Other\",\"Open System\",\"Shared Key\",\"WPA PSK\",\"WPA IEEE 802.1x\",\"WPA2 PSK\",\"WPA2 IEEE 802.1x\",\"DMTF Reserved\"]' MappingStrings='[\"IEEE 802.11-2007 | 8\"]' ModelCorrespondence='[\"CIM_WiFiEndpoint.AuthenticationMethod\",\"CIM_WiFiEndpointSettings.EncryptionMethod\",\"CIM_WiFiEndpointSettings.OtherAuthenticationMethod\"]'"
	 * @generated
	 */
	Integer getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
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
	 * OtherAuthenticationMethod shall specify the 802.11 authentication method used when the settings are applied if and only if AuthenticationMethod contains "Other". The format of this string shall be vendor-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #setOtherAuthenticationMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_OtherAuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_WiFiEndpoint.OtherAuthenticationMethod\",\"CIM_WiFiEndpointSettings.AuthenticationMethod\"]'"
	 * @generated
	 */
	String getOtherAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getOtherAuthenticationMethod <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 */
	void setOtherAuthenticationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Keys shall contain the default WEP encryption keys. Keys should be non-NULL if and only if EncryptionMethod contains 2 ("WEP").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_Keys()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|IEEE 802.11 MIB.dot11WEPDefaultKeys\"]' ModelCorrespondence='[\"CIM_WiFiEndpointSettings.KeyIndex\",\"CIM_WiFiEndpointSettings.EncryptionMethod\"]'"
	 * @generated
	 */
	EList<String> getKeys();

	/**
	 * Returns the value of the '<em><b>Key Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KeyIndex shall contain the index of the active key in the Keys array property. KeyIndex should be non-NULL if and only Keys is non-NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Index</em>' attribute.
	 * @see #setKeyIndex(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_KeyIndex()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIB.IETF|IEEE 802.11 MIB.dot11WEPDefaultKeyID\"]' ModelCorrespondence='[\"CIM_WiFiEndpointSettings.Keys\"]'"
	 * @generated
	 */
	Integer getKeyIndex();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getKeyIndex <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Index</em>' attribute.
	 * @see #getKeyIndex()
	 * @generated
	 */
	void setKeyIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>PSK Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual binary value of a PSK (pre-shared key). PSKValue and PSKPassPhrase should not both be non-NULL. PSKValue should be NULL if AuthenticationMethod does not contain 4 ("WPA PSK") or 6 ("WPA2 PSK").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PSK Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_PSKValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' MappingStrings='[\"MIB.IETF|IEEE 802.11 MIB.dot11RSNAConfigPSKValue\"]' ModelCorrespondence='[\"CIM_WiFiEndpointSettings.PSKPassPhrase\",\"CIM_WiFiEndpointSettings.AuthenticationMethod\"]'"
	 * @generated
	 */
	EList<Integer> getPSKValue();

	/**
	 * Returns the value of the '<em><b>PSK Pass Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ASCII alphanumeric string used to generate a PSK (pre-shared key). PSKPassPhrase and PSKValue should not both be non-NULL. PSKPassPhrase should be NULL if AuthenticationMethod does not contain 4 ("WPA PSK") or 6 ("WPA2 PSK").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PSK Pass Phrase</em>' attribute.
	 * @see #setPSKPassPhrase(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiEndpointSettings_PSKPassPhrase()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MinLen='8' MaxLen='63' MappingStrings='[\"MIB.IETF|IEEE 802.11 MIB.dot11RSNAConfigPSKPassPhrase\"]' ModelCorrespondence='[\"CIM_WiFiEndpointSettings.PSKValue\",\"CIM_WiFiEndpointSettings.AuthenticationMethod\"]'"
	 * @generated
	 */
	String getPSKPassPhrase();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiEndpointSettings#getPSKPassPhrase <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSK Pass Phrase</em>' attribute.
	 * @see #getPSKPassPhrase()
	 * @generated
	 */
	void setPSKPassPhrase(String value);

} // CIM_WiFiEndpointSettings
