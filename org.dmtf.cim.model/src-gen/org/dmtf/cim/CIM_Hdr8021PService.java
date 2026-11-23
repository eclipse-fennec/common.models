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
 * A representation of the model object '<em><b>CIM Hdr8021 PService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a specialization of the general concept of forwarding network traffic by adding specific semantics that define how traffic is forwarded based on the value of the Priority field in the 802.1P header. 
 * 
 * This class is used to enable DiffServ domains and domains that support 802.1P only to exchange traffic. It represents the mapping between implementations that only support 802.1P priority marking to be mapped to implementations that support DiffServ, which use DSCPs. 
 * 
 * Hdr8021PService is deprecated since forwarding based on the value of the Priority field in the 802.1P header is specified using a FilterList, which is associated with a ClassifierElement. If there is a need to distinguish a higher-level set of coordinated QoS services, the QoSService class can be instantiated directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Hdr8021PService#getPriorityValue <em>Priority Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021PService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_QoSService\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Hdr8021PService extends CIM_QoSService {
	/**
	 * Returns the value of the '<em><b>Priority Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an 8-bit unsigned integer that defines the notion of priority as specified in 802.1P implementations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority Value</em>' attribute.
	 * @see #setPriorityValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Hdr8021PService_PriorityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_Hdr8021Filter.HdrPriorityValue8021\"]'"
	 * @generated
	 */
	Integer getPriorityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Hdr8021PService#getPriorityValue <em>Priority Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Value</em>' attribute.
	 * @see #getPriorityValue()
	 * @generated
	 */
	void setPriorityValue(Integer value);

} // CIM_Hdr8021PService
