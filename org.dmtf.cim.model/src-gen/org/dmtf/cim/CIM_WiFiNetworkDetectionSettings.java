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
 * A representation of the model object '<em><b>CIM Wi Fi Network Detection Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WiFiNetworkDetectionSettings describes setting data that control the behavior of the network detection and selection logic in a Wi-Fi Port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getTargetNetworkCategories <em>Target Network Categories</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getPreferredNetworks <em>Preferred Networks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getKnownNetworks <em>Known Networks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getMinimumSignalStrength <em>Minimum Signal Strength</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getPortTypes <em>Port Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Network::Wireless' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiNetworkDetectionSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Target Network Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of wireless networks that will be searched for.
	 * A value of 2 "Any" shall indicate that no restrictions are enforced on the SSIDs searched for.
	 * A value of 3 "Preferred" shall indicate that only networks listed in the PreferredNetworks property are searced for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Network Categories</em>' attribute.
	 * @see #setTargetNetworkCategories(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings_TargetNetworkCategories()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"16384..32767\"]' Values='[\"Any\",\"Preferred\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getTargetNetworkCategories();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getTargetNetworkCategories <em>Target Network Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Network Categories</em>' attribute.
	 * @see #getTargetNetworkCategories()
	 * @generated
	 */
	void setTargetNetworkCategories(Integer value);

	/**
	 * Returns the value of the '<em><b>Preferred Networks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PreferredNetworks lists the SSIDs of preferred wireless LAN networks. Each value contained shall also be contained in the KnownNetworks property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Networks</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings_PreferredNetworks()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPreferredNetworks();

	/**
	 * Returns the value of the '<em><b>Known Networks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KnownNetworks lists the SSIDs of networks that have been previously identified to or by the wireless LAN endpoint on the platform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Known Networks</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings_KnownNetworks()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getKnownNetworks();

	/**
	 * Returns the value of the '<em><b>Minimum Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinimumSignalStrength specifies the minimum signal strength required to be received by the wireless LAN endpoint in order for it to attempt to connect to the wireless network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Signal Strength</em>' attribute.
	 * @see #setMinimumSignalStrength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings_MinimumSignalStrength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' PUnit='decibel(m) * -1'"
	 * @generated
	 */
	Integer getMinimumSignalStrength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WiFiNetworkDetectionSettings#getMinimumSignalStrength <em>Minimum Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Signal Strength</em>' attribute.
	 * @see #getMinimumSignalStrength()
	 * @generated
	 */
	void setMinimumSignalStrength(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProtocolTypes lists the different 802.11 variations that a network may support in order to for the wireless catcher to attempt a connection to the network. The enumeration values are selected to align with CIM_ProtocolEndpoint.ProtocolIFType's enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiNetworkDetectionSettings_PortTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"..\",\"16000..65535\"]' Values='[\"Unknown\",\"Other\",\"802.11a\",\"802.11b\",\"802.11g\",\"802.11n (Wi-Fi 4)\",\"802.11ac (Wi-Fi 5)\",\"802.11ax (Wi-Fi 6)\",\"802.11ax (Wi-Fi 6E)\",\"802.11be (Wi-Fi 7)\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_LogicalPort.PortType\"]'"
	 * @generated
	 */
	EList<Integer> getPortTypes();

} // CIM_WiFiNetworkDetectionSettings
