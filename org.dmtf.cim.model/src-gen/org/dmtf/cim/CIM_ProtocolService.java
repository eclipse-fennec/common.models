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
 * A representation of the model object '<em><b>CIM Protocol Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProtocolService represents represents an application layer service available on a hosting system. Often times, the service name reflects the employed/supported communication protocol (e.g. file transfer - FTP), however in some other cases it does not. (e.g. mail notification service - biff). Access to the service is modeled with one or more instances of ProtocolEndpoint. This class represents the availability of the function on the system. Issuing a stop to this instance is equivalent to disabling the functionality and making it unavailable to users. Thus a stop of this service will result in the removing of all ProtocolEndpoints which are associated with the instance via ServicAccessBySAP. The functionality can be made available again by issuing a start to the service. This class contains service definitions which are currently needed. Future extensions are expected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolService#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolService#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolService#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolService#getCurrentActiveConnections <em>Current Active Connections</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Core::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this service provides. Values defined for this property are limited to the known use cases where it is desirable to represent the ability to enable or disable the functionality on the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolService_Protocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"SSH\",\"Telnet\",\"CLP\",\"CIM-XML\",\"WS-Management\",\"CIM-RS\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ProtocolService.OtherProtocol\"]'"
	 * @generated
	 */
	Integer getProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolService#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Protocol property is set to 1 "Other" then free form string providing more information about the protocol. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protocol</em>' attribute.
	 * @see #setOtherProtocol(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolService_OtherProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolService.Protocol\"]'"
	 * @generated
	 */
	String getOtherProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolService#getOtherProtocol <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol</em>' attribute.
	 * @see #getOtherProtocol()
	 * @generated
	 */
	void setOtherProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxConnections specifies the maximum number of connections currently allowed by the service. The values 32768..65535 are DMTF Reserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #setMaxConnections(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolService_MaxConnections()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MaxValue='65535'"
	 * @generated
	 */
	Integer getMaxConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolService#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Active Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CurrentActiveConnections indicates the number of sessions currently established with the protocol service. A value of null for this property shall indicate the number of active sessions is unknown. A value of zero shall indicate there are no active sessions. Any other value shall correspond to the number of active sessions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Active Connections</em>' attribute.
	 * @see #setCurrentActiveConnections(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolService_CurrentActiveConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='0' MaxValue='65535'"
	 * @generated
	 */
	Integer getCurrentActiveConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolService#getCurrentActiveConnections <em>Current Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Active Connections</em>' attribute.
	 * @see #getCurrentActiveConnections()
	 * @generated
	 */
	void setCurrentActiveConnections(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a CIM_TCPProtocoEndpoint instance and associate it with this CIM_ProtocolService instance via an instance of CIM_ServiceAccessBySAP. The newly created instance of CIM_TCPProtocolEndpoint will be for the port specified. When the CIM_IPProtocolEndpoint is not specified, the method will create an instance of CIM_HostedAccessPoint which associates the newly created CIM_TCPProtocolEndpoint instance with the instance of CIM_ComputerSystem with which this instance is associated via an instance of CIM_HostedService (the scoping system) It will also create instances of CIM_BindsTo which associate the created CIM_TCPProtocolEndpoint with each instance CIM_IPProtocolEndpoint which is associated with the scoping system. When an instance of CIM_IPProtocolEndpoint is specified, the CIM_HostedAccessPoint will associate the CIM_TCPProtocolEndpoint with the same instance which is associated with the CIM_IPProtocolEndpoint. In addition, the implementation will create a single instance of CIM_BindsTo that associates the CIM_TCPProtocolEndpoint with the specified instance of CIM_IPProtocolEndpoint. For each instance of CIM_BindsTo created by this method, the value of the Dependent property will be a reference to the newly created instance of CIM_TCPProtocolEndpoint. An extrinsic method is required in order to provide atomic creation of multiple, related instances. Prior to creating the instances, the implementation will verify that a CIM_TCPProtocolEndpoint instance can be created and associated with this instance.
	 * @param PortNumber The desired listening port.
	 * @param IPEndpoint A specific CIM_IPProtocolEndpoint on which the service will listen to the specified port.
	 * @param TCPEndpoint The created TCPProtocolEndpoint.
	 * <!-- end-model-doc -->
	 * @model PortNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true'" IPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPProtocolEndpoint REF'" TCPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_TCPProtocolEndpoint REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occurred\",\"Invalid Port\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ListenOnPort(Long PortNumber, CIM_IPProtocolEndpoint IPEndpoint, CIM_TCPProtocolEndpoint TCPEndpoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a CIM_TCPProtocoEndpoint instance and associate it with this CIM_ProtocolService instance via an instance of CIM_ServiceAccessBySAP. The newly created instance of CIM_TCPProtocolEndpoint shall be for the port and ProtocolIFType specified. When the CIM_IPProtocolEndpoint is not specified, the method shall create an instance of CIM_HostedAccessPoint which associates the newly created CIM_TCPProtocolEndpoint instance with the instance of CIM_ComputerSystem with which this instance is associated via an instance of CIM_HostedService (the scoping system). The implementation shall also create instances of CIM_BindsTo which associate the created CIM_TCPProtocolEndpoint with each instance CIM_IPProtocolEndpoint which is associated with the scoping system (in other words the listening port is bound to all IPs). When an instance of CIM_IPProtocolEndpoint is specified, the CIM_HostedAccessPoint shall associate the CIM_TCPProtocolEndpoint with the same instance which is associated with the CIM_IPProtocolEndpoint (andthe implementation shall only bind to the IP Address represented by the CIM_IPProtocolEndpoint). In addition, the implementation shall create a single instance of CIM_BindsTo that associates the CIM_TCPProtocolEndpoint with the specified instance of CIM_IPProtocolEndpoint. For each instance of CIM_BindsTo created by this method, the value of the Dependent property will be a reference to the newly created instance of CIM_TCPProtocolEndpoint. An extrinsic method is required in order to provide atomic creation of multiple, related instances. Prior to creating the instances, the implementation shall verify that a CIM_TCPProtocolEndpoint instance can be created and associated with this instance.
	 * @param PortNumber The desired listening port.
	 * @param IPEndpoint A specific CIM_IPProtocolEndpoint on which the service will listen to the specified port.
	 * @param TCPEndpoint The created TCPProtocolEndpoint.
	 * @param ProtocolIFType The ProtocolIFType
	 * <!-- end-model-doc -->
	 * @model PortNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true'" IPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPProtocolEndpoint REF'" TCPEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_TCPProtocolEndpoint REF' In='false' Out='true'" ProtocolIFTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' ValueMap='[\"1\",\"225..4095\",\"4111\",\"4200\",\"4201\",\"4202\",\"4203\",\"4204\",\"4205\",\"4300\",\"4400\",\"4401\",\"4402\",\"4403\",\"4404\",\"4405\",\"4406\",\"4301..32767\"]' Values='[\"Other\",\"IANA Reserved\",\"TCP\",\"NFS\",\"CIFS\",\"DAFS\",\"WebDAV\",\"HTTP\",\"FTP\",\"NDMP\",\"Telnet\",\"SSH\",\"SM CLP\",\"SMTP\",\"LDAP\",\"RDP\",\"HTTPS\",\"DMTF Reserved\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occurred\",\"Invalid Port\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ListenOnPortIF(Long PortNumber, CIM_IPProtocolEndpoint IPEndpoint, CIM_TCPProtocolEndpoint TCPEndpoint, Long ProtocolIFType);

} // CIM_ProtocolService
