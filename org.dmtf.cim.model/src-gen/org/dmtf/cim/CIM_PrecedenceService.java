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
 * A representation of the model object '<em><b>CIM Precedence Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a specialization of the general concept of forwarding network traffic by adding specific semantics that define how traffic is forwarded based on the value of the ToS byte of a packet. 
 * 
 * This class is used to enable DiffServ devices and non- DiffServ devices to exchange traffic. This is done by defining a sibling class, DiffServService, to represent devices that forward traffic based on the DiffServ code point. This enables the administrator to define mappings between devices that do not support DiffServ (and instead use IP Precedence) and those that do support DiffServ. 
 * 
 * PrecedenceService is deprecated since forwarding based on the value of the ToS byte is specified using a FilterList, which is associated with a ClassifierElement. If there is a need to distinguish a higher-level set of coordinated QoS services, the QoSService class can be instantiated directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrecedenceService#getPrecedenceValue <em>Precedence Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrecedenceService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_QoSService\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PrecedenceService extends CIM_QoSService {
	/**
	 * Returns the value of the '<em><b>Precedence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer that defines the notion of precedence for different types of traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precedence Value</em>' attribute.
	 * @see #setPrecedenceValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrecedenceService_PrecedenceValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_IPHeadersFilter.HdrDSCP\"]'"
	 * @generated
	 */
	Integer getPrecedenceValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrecedenceService#getPrecedenceValue <em>Precedence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence Value</em>' attribute.
	 * @see #getPrecedenceValue()
	 * @generated
	 */
	void setPrecedenceValue(Integer value);

} // CIM_PrecedenceService
