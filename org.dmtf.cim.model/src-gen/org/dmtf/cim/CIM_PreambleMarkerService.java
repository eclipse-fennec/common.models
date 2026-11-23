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
 * A representation of the model object '<em><b>CIM Preamble Marker Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PreambleMarkerService models the storing of traffic- conditioning results in a packet preamble. An instance appends a two-part string of the form '<type>,<value>' to the packet preamble. The concept of 'type's is discussed more fully in the Description of the class' FilterItemList property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PreambleMarkerService#getFilterItemList <em>Filter Item List</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PreambleMarkerService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PreambleMarkerService extends CIM_MarkerService {
	/**
	 * Returns the value of the '<em><b>Filter Item List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To foster interoperability, the basic format of the information captured by a PreambleMarker is specified. That information is contained in the FilterItemList property (an ordered, string array). Each entry in the array takes the form 'type,value'. When entries are added, they are appended to the end of the list. 
	 * 
	 * A limited set of standardized 'type's exist. They are: 
	 * - ConformingFromMeter, NonConformingFromMeter and PartConformingFromMeter to convey metering results (where the 'value' is the name of the meter) 
	 * - VlanId to describe the traffic's VLAN information (where the 'value' is the VLAN ID). 
	 * An implementation is free to define and use other preamble 'types'. 
	 * Note that a wildcard value of "any" is allowed to indicate that the preamble entry matches for any 'value' of the specified 'type'. For example, using the wildcard, an administrator can define a filter to select all packets that were found to be conforming ('type' = "ConformingFromMeter") without having to name each meter individually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Item List</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PreambleMarkerService_FilterItemList()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Ordered'"
	 * @generated
	 */
	EList<String> getFilterItemList();

} // CIM_PreambleMarkerService
