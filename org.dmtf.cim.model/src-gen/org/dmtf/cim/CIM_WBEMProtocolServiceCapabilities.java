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
 * A representation of the model object '<em><b>CIM WBEM Protocol Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WBEMProtocolServiceCapabilities defines the capabilities for a WBEM Protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities#getWBEMProtocolVersionsSupported <em>WBEM Protocol Versions Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities#getGenericOperationCapabilities <em>Generic Operation Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities#getAuthenticationMechanismsSupported <em>Authentication Mechanisms Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities#getAuthenticationMechanismsDescriptions <em>Authentication Mechanisms Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WBEMProtocolServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMProtocol' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WBEMProtocolServiceCapabilities extends CIM_ProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>WBEM Protocol Versions Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes the latest version for each major version supported. For example, 1.3.1, 2.0.0. This property shall not include multiple revisions of the same major version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WBEM Protocol Versions Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMProtocolServiceCapabilities_WBEMProtocolVersionsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true'"
	 * @generated
	 */
	EList<String> getWBEMProtocolVersionsSupported();

	/**
	 * Returns the value of the '<em><b>Generic Operation Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The generic operations capabilities supported. For more information on generic operations see DSP0223.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Operation Capabilities</em>' attribute.
	 * @see #setGenericOperationCapabilities(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMProtocolServiceCapabilities_GenericOperationCapabilities()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_GenericOperationCapabilitiesStructure'"
	 * @generated
	 */
	String getGenericOperationCapabilities();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities#getGenericOperationCapabilities <em>Generic Operation Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Operation Capabilities</em>' attribute.
	 * @see #getGenericOperationCapabilities()
	 * @generated
	 */
	void setGenericOperationCapabilities(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Mechanisms Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated array describing the types of authentication supported by the associated ProtocolService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Mechanisms Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMProtocolServiceCapabilities_AuthenticationMechanismsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\"]' Values='[\"Unknown\",\"Other\",\"None\",\"Basic\",\"Digest\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_WBEMProtocolServiceCapabilities.AuthenticationMechanismsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAuthenticationMechanismsSupported();

	/**
	 * Returns the value of the '<em><b>Authentication Mechanisms Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array shall be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Mechanisms Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMProtocolServiceCapabilities_AuthenticationMechanismsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_WBEMProtocolServiceCapabilities.AuthenticationMechanismsSupported\"]'"
	 * @generated
	 */
	EList<String> getAuthenticationMechanismsDescriptions();

} // CIM_WBEMProtocolServiceCapabilities
