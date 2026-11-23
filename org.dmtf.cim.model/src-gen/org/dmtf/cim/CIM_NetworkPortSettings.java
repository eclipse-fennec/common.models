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
 * A representation of the model object '<em><b>CIM Network Port Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A NetworkPort may be configured via the NetworkPortSettings class. The requested configuration changes are expected to be stored to non-volatile memory. NetworkPortCapabilities defines which settings are configurable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortSettings#getNetworkIDs <em>Network IDs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPortSettings#getLinkTechnology <em>Link Technology</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPortSettings extends CIM_LogicalPortSettings {
	/**
	 * Returns the value of the '<em><b>Network IDs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of network identifiers that specify which Networks the NetworkPort may belong to. The ability to set this property is defined in NetworkPortCapabilities.
	 * 
	 * For example, in Fibre Channel the NetworkIDs would be populated with Virtual Fabric IDs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network IDs</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortSettings_NetworkIDs()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true'"
	 * @generated
	 */
	EList<String> getNetworkIDs();

	/**
	 * Returns the value of the '<em><b>Link Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requested LinkTechnology of the NetworkPort. The list of supported LinkTechnologies of the NetworkPort is defined in the NetworkPortCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Technology</em>' attribute.
	 * @see #setLinkTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortSettings_LinkTechnology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Ethernet\",\"IB\",\"FC\",\"FDDI\",\"ATM\",\"Token Ring\",\"Frame Relay\",\"Infrared\",\"BlueTooth\",\"Wireless LAN\"]' ModelCorrespondence='[\"CIM_NetworkPortCapabilities.NetworkIDsConfigurable\",\"CIM_NetworkPort.LinkTechnology\"]'"
	 * @generated
	 */
	Integer getLinkTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPortSettings#getLinkTechnology <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Technology</em>' attribute.
	 * @see #getLinkTechnology()
	 * @generated
	 */
	void setLinkTechnology(Integer value);

} // CIM_NetworkPortSettings
