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
 * A representation of the model object '<em><b>CIM IPX Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IPX communication point from which data may be sent or received.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPXProtocolEndpoint#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPXProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.ProtocolIFType='uint16' override.ProtocolIFType.Description='ProtocolIFType\'s enumeration is limited to IPX and reserved values for this subclass of ProtocolEndpoint.' override.ProtocolIFType.ValueMap='[\"1\",\"225..4095\",\"4099\",\"4301..32767\",\"32768..\"]' override.ProtocolIFType.Values='[\"Other\",\"IANA Reserved\",\"IPX\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPXProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IPX address formatted as eight hexadecimal digits representing the network number, followed by a colon, followed by twelve hexadecimal digits representing the host address (e.g. "00112233:010203040506").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPXProtocolEndpoint_Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPXProtocolEndpoint#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // CIM_IPXProtocolEndpoint
