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
 * A representation of the model object '<em><b>CIM VRF Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_VRFConfigurationService description contains a set of extrinsic methods to manage Virtual Routing and Forwarding tables. The methods include the creation and removal of the VRFs and the managements of the services, port, interfaces and routers, routes that are associated in VRF context.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VRFConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.52.0' UMLPackagePath='CIM::Network' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VRFConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and names a new VRF
	 * @param TargetRouter The TargetRouter is a reference to a CIM_System instance that represents the host of the VRF. Typically this would be the instance of CIM_ComputerSystem representing the switch or an instance of CIM_AutonomousSystem that represents a router.
	 * @param VRF A string containing an embedded instance of class-subclass CIM_VirtualRoutingAndForwardingTable a subclass of CIM_Collection
	 * @param ResultingVRF If a the VRF creation is successfully, reference to an instance of class CIM_VirtualRoutingAndForwardingTable that represents the newly created VRF is returned.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model TargetRouterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF'" VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_VirtualRoutingAndForwardingTable'" ResultingVRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateVRF(CIM_System TargetRouter, String VRF, CIM_VirtualRoutingAndForwardingTable ResultingVRF, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes VRF
	 * @param VRF A reference to the instance of the VRF that should be removed
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveVRF(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add an IP route to a VRF
	 * @param VRF A reference to the instance of the VRF to which the route should be added
	 * @param Route A string containing an embedded instance of class-subclass CIM_NextHopIPRoute providing the property values for the new IP route.
	 * @param ResultingRoute If a the Route creation is successfully, a reference to an instance of class CIM_NexHopIPRoute that represents the newly created IP route is returned.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" RouteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_NextHopIPRoute'" ResultingRouteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NextHopIPRoute REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddRoute(CIM_VirtualRoutingAndForwardingTable VRF, String Route, CIM_NextHopIPRoute ResultingRoute, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes an IP route
	 * @param VRF A reference to the instance of the VRF from which the route is to be removed
	 * @param Route A reference to the instance of the route that should be removed
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" RouteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NextHopIPRoute REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveRoute(CIM_VirtualRoutingAndForwardingTable VRF, CIM_NextHopIPRoute Route, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add an EthernetPort as a member of the VRF
	 * @param VRF A reference to the instance of the VRF that that the interface is to be a member of
	 * @param Port A reference to the instance of the Port to which the route should be added
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" PortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EthernetPort REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddPortMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_EthernetPort Port, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes a port from a VRF
	 * @param VRF A reference to the instance of the VRF from which the port is being removed
	 * @param Port A reference to the instance of the Port being removed
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" PortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EthernetPort REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemovePortMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_EthernetPort Port, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add  a Service ie. NTP, SNMP Server ... as a member of the VRF
	 * @param VRF A reference to the instance of the VRF that that the interface is to be a member of
	 * @param SAP A reference to the instance of the service access point to which the route should be added. This would include Remote Service Access Points as well as level 3 interfaces.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" SAPAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddSAPMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ServiceAccessPoint SAP, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes a service from a VRF
	 * @param VRF A reference to the instance of the VRF from which the port is being removed
	 * @param SAPMember A reference to the instance of the Service Access Point being removed
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model VRFAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualRoutingAndForwardingTable REF'" SAPMemberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveSAPMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ServiceAccessPoint SAPMember, CIM_ConcreteJob Job);

} // CIM_VRFConfigurationService
