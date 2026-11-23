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
 * A representation of the model object '<em><b>CIM Protocol Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of EnabledLogicalElementCapabilities that defines the capabilities of a ProtocolService. An instance of CIM_ProtocolServiceCapabilities is associated with a ProtocolService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getMaxListeningPorts <em>Max Listening Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getListeningPortManagementSupported <em>Listening Port Management Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Network::Misc' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolServiceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxConnections specifies the maximum number of connections supported by the protocol service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #setMaxConnections(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolServiceCapabilities_MaxConnections()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MaxValue='65535' ModelCorrespondence='[\"CIM_ProtocolService.MaxConnections\"]'"
	 * @generated
	 */
	Integer getMaxConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Listening Ports</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxListeningPorts specifies the maximum number of ports on which a protocol service will listen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Listening Ports</em>' attribute.
	 * @see #setMaxListeningPorts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolServiceCapabilities_MaxListeningPorts()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='65535' ModelCorrespondence='[\"CIM_ProtocolServiceCapabilities.ListeningPortManagementSupported\"]'"
	 * @generated
	 */
	Integer getMaxListeningPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getMaxListeningPorts <em>Max Listening Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Listening Ports</em>' attribute.
	 * @see #getMaxListeningPorts()
	 * @generated
	 */
	void setMaxListeningPorts(Integer value);

	/**
	 * Returns the value of the '<em><b>Listening Port Management Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ListeningPortManagementSupported indicates whether the management of the ports on which the associated ProtocolService listens is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Listening Port Management Supported</em>' attribute.
	 * @see #setListeningPortManagementSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolServiceCapabilities_ListeningPortManagementSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_ProtocolServiceCapabilities.MaxListeningPorts\"]'"
	 * @generated
	 */
	Boolean getListeningPortManagementSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolServiceCapabilities#getListeningPortManagementSupported <em>Listening Port Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listening Port Management Supported</em>' attribute.
	 * @see #getListeningPortManagementSupported()
	 * @generated
	 */
	void setListeningPortManagementSupported(Boolean value);

} // CIM_ProtocolServiceCapabilities
