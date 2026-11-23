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
 * A representation of the model object '<em><b>CIM iSCSI Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the capabilities of a iSCSIConfigurationService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getISCSIProtocolEndpointCreationSupported <em>ISCSI Protocol Endpoint Creation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getIdentifierSelectionSupported <em>Identifier Selection Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getISCSINodeCreationSupported <em>ISCSI Node Creation Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSIConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>ISCSI Protocol Endpoint Creation Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iSCSI Ports are modeled by instances of iSCSIProtocolEndpoints. If true, this property indicates that iSCSIProtocolEndpoints may be dynamically created and deleted in a Node. If false, iSCSIProtocolEndpoints are preexisting and statically defined within the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ISCSI Protocol Endpoint Creation Supported</em>' attribute.
	 * @see #setISCSIProtocolEndpointCreationSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConfigurationCapabilities_ISCSIProtocolEndpointCreationSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getISCSIProtocolEndpointCreationSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getISCSIProtocolEndpointCreationSupported <em>ISCSI Protocol Endpoint Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISCSI Protocol Endpoint Creation Supported</em>' attribute.
	 * @see #getISCSIProtocolEndpointCreationSupported()
	 * @generated
	 */
	void setISCSIProtocolEndpointCreationSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Identifier Selection Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, the implementation chooses the Identifier for the iSCSIProtocolEndpoint and the Identifier cannot be supplied as a parameter to CreateiSCSIProtocolEndpoint and MUST be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier Selection Supported</em>' attribute.
	 * @see #setIdentifierSelectionSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConfigurationCapabilities_IdentifierSelectionSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIdentifierSelectionSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getIdentifierSelectionSupported <em>Identifier Selection Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Selection Supported</em>' attribute.
	 * @see #getIdentifierSelectionSupported()
	 * @generated
	 */
	void setIdentifierSelectionSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>ISCSI Node Creation Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iSCSI Nodes are modeled by instances of SCSIProtocolController. If true, this property indicates that iSCSI Nodes may be dynamically created and deleted in a NetworkEntity. If false, iSCSI Nodes are pre-existing and statically defined within the Entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ISCSI Node Creation Supported</em>' attribute.
	 * @see #setISCSINodeCreationSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConfigurationCapabilities_ISCSINodeCreationSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getISCSINodeCreationSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSIConfigurationCapabilities#getISCSINodeCreationSupported <em>ISCSI Node Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISCSI Node Creation Supported</em>' attribute.
	 * @see #getISCSINodeCreationSupported()
	 * @generated
	 */
	void setISCSINodeCreationSupported(Boolean value);

} // CIM_iSCSIConfigurationCapabilities
