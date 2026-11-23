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
 * A representation of the model object '<em><b>CIM Network Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkPortCapabilities describes the capabilities supported for properties that are configurable in NetworkPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getSpeedConfigurable <em>Speed Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getPortSpeedsSupported <em>Port Speeds Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getNetworkIDsConfigurable <em>Network IDs Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getNetworkIDsFormat <em>Network IDs Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getLinkTechnologiesSupported <em>Link Technologies Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPortCapabilities extends CIM_LogicalPortCapabilities {
	/**
	 * Returns the value of the '<em><b>Speed Configurable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether the Speed can be configured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Configurable</em>' attribute.
	 * @see #setSpeedConfigurable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities_SpeedConfigurable()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_NetworkPortCapabilities.PortSpeedsSupported\"]'"
	 * @generated
	 */
	Boolean getSpeedConfigurable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getSpeedConfigurable <em>Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Configurable</em>' attribute.
	 * @see #getSpeedConfigurable()
	 * @generated
	 */
	void setSpeedConfigurable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Port Speeds Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of supported port speeds that can be configured on NetworkPort.Speed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Speeds Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities_PortSpeedsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ModelCorrespondence='[\"CIM_NetworkPort.Speed\"]'"
	 * @generated
	 */
	EList<Long> getPortSpeedsSupported();

	/**
	 * Returns the value of the '<em><b>Network IDs Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the NetworkPort can be configured to connect to specific Networks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network IDs Configurable</em>' attribute.
	 * @see #setNetworkIDsConfigurable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities_NetworkIDsConfigurable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_NetworkPortSettings.NetworkIDs\"]'"
	 * @generated
	 */
	Boolean getNetworkIDsConfigurable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getNetworkIDsConfigurable <em>Network IDs Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network IDs Configurable</em>' attribute.
	 * @see #getNetworkIDsConfigurable()
	 * @generated
	 */
	void setNetworkIDsConfigurable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Network IDs Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format that is expected to populate the NetworkIds for the associated NetworkPortSettings.list of supported LinkTechnologies of the NetworkPort is defined in the NetworkPortCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network IDs Format</em>' attribute.
	 * @see #setNetworkIDsFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities_NetworkIDsFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"..\",\"32768..65535\"]' Values='[\"Virtual Fabric ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_NetworkPortSettings.NetworkIDs\"]'"
	 * @generated
	 */
	Integer getNetworkIDsFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPortCapabilities#getNetworkIDsFormat <em>Network IDs Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network IDs Format</em>' attribute.
	 * @see #getNetworkIDsFormat()
	 * @generated
	 */
	void setNetworkIDsFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Link Technologies Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the LinkTechnologies supported by the the NetworkPort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Technologies Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortCapabilities_LinkTechnologiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Ethernet\",\"IB\",\"FC\",\"FDDI\",\"ATM\",\"Token Ring\",\"Frame Relay\",\"Infrared\",\"BlueTooth\",\"Wireless LAN\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_NetworkPortSettings.NetworkIDs\",\"CIM_NetworkPort.LinkTechnology\"]'"
	 * @generated
	 */
	EList<Integer> getLinkTechnologiesSupported();

} // CIM_NetworkPortCapabilities
