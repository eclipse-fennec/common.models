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
 * A representation of the model object '<em><b>CIM IP Encapsulation Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The service has a set of extrinsic methods to control the creation and removal of the instances required to create an IP encapsulation gateway also known as an IP Tunnel gateway..
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.52.0' UMLPackagePath='CIM::Network' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPEncapsulationManagementService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an instance of CIM_IPEncapsulationInterface that is used in IP Tunnel gateways. The method also creates a set of CIM_IPProtocolEndpoints and optionally a set of CIM_EncapsulationMappingSettingData instances.
	 * @param TargetSystem reference to a system or network. The supported target interfaces for a CIM_IPEncapsulationInterface class or subclass
	 * @param EncapsulationGateway A required string containing an embedded instance of the class or subclass of CIM_IPEncapsulationInterface describes the initial configuration of the resulting CIM_IPEncapsulationInterface instance. The populated properties of the embedded instance should not contain key properties, and any key property values may be ignored
	 * @param PAIPEndpoint string containing an embedded instance of the class or subclass of CIM_IPProtocolEndpoint that describes the initial configuration of a CIM_IPProtocolEndpoint that is on the provider network. The populated properties of the embedded instance should not contain key properties, and any key property values may be ignored.
	 * @param CAIPEndpoint string containing an embedded instances of the class or subclass of CIM_IPProtocolEndpoint that describes the initial configuration of an CIM_IPProtocolEndpoint that is on the customer network. The populated properties of the embedded instance should not contain key properties, and any key property values may be ignored.
	 * @param EncapsulationMapping array of strings containing embedded instances of the class or subclass of CIM_EncapsulationMappingSettingData that describes entries in a mapping table used by the encapsulation gateway to provide the encapsulation header information used by the gateway. The populated properties of the embedded CIM_EncapsulationMappingSettingData instances should not contain key properties, and any key property values may be ignored.
	 * @param ResultingInterface If the creation of the CIM_IPEncapsulationInterface is successful, the instance of the class CIM_IPEncapsulationInterface that represents the instantiated instance of CIM_IPEncapsulationInteface is returned.
	 * @param Job a ConcreteJob instance is returned if the execution of the method is asynchronous
	 * <!-- end-model-doc -->
	 * @model TargetSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF'" EncapsulationGatewayAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_IPEncapsulationInterface'" PAIPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_IPProtocolEndpoint'" CAIPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_IPProtocolEndpoint'" EncapsulationMappingUnique="false" EncapsulationMappingMany="true"
	 *        EncapsulationMappingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_EncapsulationMappingSettingData'" ResultingInterfaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPEncapsulationInterface REF' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long AddIPEncapsulationInterface(CIM_System TargetSystem, String EncapsulationGateway, String PAIPEndpoint, String CAIPEndpoint, EList<String> EncapsulationMapping, CIM_IPEncapsulationInterface ResultingInterface, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a set of IPEncapuslationMappings used to configure an IP Tunnel.
	 * @param TargetInterface Reference to the IPEncapsulationInterface instance to associate the mapping.
	 * @param EncapsulationMappings array of strings containing embedded instances of the class or subclass of CIM_EncapsulationMappingSettingData that describes entries in a mapping table used by the encapsulation interface to provide the encapsulation header for the resultant IIPEncapsulationInterface. The populated properties of the embedded CIM_EncapsulationMappingSettingData instances should not contain key properties, and any key property values may be ignored.
	 * @param Job If the method is executed asyncronously an reference to CIM_ConcreteJob is returned
	 * <!-- end-model-doc -->
	 * @model TargetInterfaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPEncapsulationInterface REF'" EncapsulationMappingsUnique="false" EncapsulationMappingsMany="true"
	 *        EncapsulationMappingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_EncapsulationMappingSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long AddIPEncapsulationMappings(CIM_IPEncapsulationInterface TargetInterface, EList<String> EncapsulationMappings, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to remove an IPEncapsulationInterface and any associated CIM_ProtocolEndpoints or CIM_SettingData.
	 * @param Gateway A reference to the gateway that is to be removed.
	 * @param Job If the method is excuted asynchronously a reference to a ConcreteJob instance is returned.
	 * <!-- end-model-doc -->
	 * @model GatewayAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPEncapsulationInterface REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long RemoveIPEncapsulationInterface(CIM_IPEncapsulationInterface Gateway, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successful execution of the RemoveIPEncapsulationMappings removes the instances referenced in the methods EncapsulationMapping parameter
	 * @param EncapsulationMappings An array of references to the set of CIM_EncapsulationMappingSettingData instances that shall be removed.
	 * @param Job If the method is executed asynchronously then a reference to a CIM_ConcreteJob instance is returned
	 * <!-- end-model-doc -->
	 * @model EncapsulationMappingsUnique="false" EncapsulationMappingsMany="true"
	 *        EncapsulationMappingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EncapsulationMappingSettingData REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long RemoveIPEncapsulationMappings(EList<CIM_EncapsulationMappingSettingData> EncapsulationMappings, CIM_ConcreteJob Job);

} // CIM_IPEncapsulationManagementService
