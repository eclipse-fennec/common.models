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
 * A representation of the model object '<em><b>CIM IEEE802 1x Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IEEE8021xCapabilities describes the IEEE 802.1x security capabilities of a layer 2 ProtocolEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xCapabilities#getSupportedAuthenticationProtocols <em>Supported Authentication Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xCapabilities#getRoamingSupported <em>Roaming Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IEEE8021xCapabilities#getFastRoamingSupported <em>Fast Roaming Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::IEEE8021x' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IEEE8021xCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Authentication Protocols</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IEEE 802.1x Extensible Authentication Protocol types supported by the associated ProtocolEndpoint. See AuthenticationProtocol description in CIM_IEEE8021xSettings for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Authentication Protocols</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xCapabilities_SupportedAuthenticationProtocols()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\"]' Values='[\"EAP-TLS\",\"EAP-TTLS/MSCHAPv2\",\"PEAPv0/EAP-MSCHAPv2\",\"PEAPv1/EAP-GTC\",\"EAP-FAST/MSCHAPv2\",\"EAP-FAST/GTC\",\"EAP-MD5\",\"EAP-PSK\",\"EAP-SIM\",\"EAP-AKA\",\"EAP-FAST/TLS\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAuthenticationProtocols();

	/**
	 * Returns the value of the '<em><b>Roaming Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the associated ProtocolEndpoint supports moving a session due to roaming.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roaming Supported</em>' attribute.
	 * @see #setRoamingSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xCapabilities_RoamingSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRoamingSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xCapabilities#getRoamingSupported <em>Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roaming Supported</em>' attribute.
	 * @see #getRoamingSupported()
	 * @generated
	 */
	void setRoamingSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Fast Roaming Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the associated ProtocolEndpoint supports fast reconnection of an IEEE 802.1x session when it roams from one access point to another.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fast Roaming Supported</em>' attribute.
	 * @see #setFastRoamingSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IEEE8021xCapabilities_FastRoamingSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFastRoamingSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IEEE8021xCapabilities#getFastRoamingSupported <em>Fast Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Roaming Supported</em>' attribute.
	 * @see #getFastRoamingSupported()
	 * @generated
	 */
	void setFastRoamingSupported(Boolean value);

} // CIM_IEEE8021xCapabilities
