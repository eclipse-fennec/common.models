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
 * A representation of the model object '<em><b>CIM Network Port Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_NetworkPortConfigurationService provides management of the network interfaces associated with a network port.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPortConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::Misc' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPortConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a CIM_LANEndpoint instance and associate it with the specified NetworkPort instance via an instance of CIM_PortImplementsEndpoint. The newly created instance of CIM_LANEndpont contains the configuration properties specified or default values applicable for the specified NetworkPort instance. This method will also create an instance of CIM_HostedAccessPoint which associates the newly created CIM_LANEndpoint instance with the instance of CIM_ComputerSystem which scopes the specified CIM_NetworkPort. An extrinsic method is required in order to provide atomic creation of multiple, related instances. Prior to creating the instances, the implementation will verify that a CIM_LANEndpoint instance can be created and associated with the CIM_NetworkPort instance.
	 * @param Port The NetworkPort to which the network interface will be added.
	 * @param Endpoint The created LANEndpoint.
	 * @param Address The MAC address requested.
	 * @param LANID The requested LAN ID.
	 * @param AliasAddresses The requested alias addresses.
	 * @param GroupAddresses The requested group addresses.
	 * <!-- end-model-doc -->
	 * @model PortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPort REF' Required='true' In='true'" EndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LANEndpoint REF' In='false' Out='true'" AddressAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true'" LANIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" AliasAddressesUnique="false" AliasAddressesMany="true"
	 *        AliasAddressesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'" GroupAddressesUnique="false" GroupAddressesMany="true"
	 *        GroupAddressesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long AddLANEndpoint(CIM_NetworkPort Port, CIM_LANEndpoint Endpoint, String Address, String LANID, EList<String> AliasAddresses, EList<String> GroupAddresses);

} // CIM_NetworkPortConfigurationService
