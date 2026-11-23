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
 * A representation of the model object '<em><b>CIM Wi Fi Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WiFiPortCapabilities is a specialization of CIM_NetworkPortCapabilities that describes the capabilities of a WiFiPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WiFiPortCapabilities#getSupportedPortTypes <em>Supported Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WiFiPortCapabilities#getOtherSupportedPortTypes <em>Other Supported Port Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WiFiPortCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WiFiPortCapabilities extends CIM_NetworkPortCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Port Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 802.11 modes that the Port supports. See description of PortType property in CIM_WiFiPort for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Port Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiPortCapabilities_SupportedPortTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"..\",\"16000..65535\"]' Values='[\"Unknown\",\"Other\",\"802.11a\",\"802.11b\",\"802.11g\",\"802.11n (Wi-Fi 4)\",\"802.11ac (Wi-Fi 5)\",\"802.11ax (Wi-Fi 6)\",\"802.11ax (Wi-Fi 6E)\",\"802.11be (Wi-Fi 7)\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_WiFiPort.PortType\",\"CIM_WiFiPortCapabilities.OtherSupportedPortTypes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedPortTypes();

	/**
	 * Returns the value of the '<em><b>Other Supported Port Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional 802.11 modes supported by the associated WiFiPort, but not listed in the valuemap for SupportedPortTypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Port Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WiFiPortCapabilities_OtherSupportedPortTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_WiFiPort.OtherPortType\",\"CIM_WiFiPortCapabilities.SupportedPortTypes\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedPortTypes();

} // CIM_WiFiPortCapabilities
