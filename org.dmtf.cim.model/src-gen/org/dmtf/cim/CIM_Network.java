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
 * A representation of the model object '<em><b>CIM Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Network is a subclass of AdminDomain that groups interconnected networking and computing objects capable of exchanging information. Instances of CIM_Network can represent an enterprise's global network or specific connectivity domains within the global network. These concepts are similar to those defined for the Network object in ITU's M.3100 specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Network#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Network#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Network()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Network::Systems' MappingStrings='[\"Recommendation.ITU|M3100.Network\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Network extends CIM_AdminDomain {
	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the type of the network when the Type[] property contains value 1 ("Other"). This property shall be set to null when Type[] property does not contain value 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Network_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Network.Type\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Network#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the type of the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Network_Type()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Other\",\"Local Area Network (LAN)\",\"Wireless Local Area Network (WLAN)\",\"Wide Area Network (WAN)\",\"Metropolitan Area Network (MAN)\",\"Storage Area Network (SAN)\",\"Virtual Local Area Network (VLAN)\",\"Ethernet Network\",\"IP Network\",\"IPv4 Network\",\"IPv6 Network\",\"Overlay Network\"]'"
	 * @generated
	 */
	EList<Integer> getType();

} // CIM_Network
