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
 * A representation of the model object '<em><b>CIM iSCSI Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The iSCSIConfigurationService provides methods that allow a client to manipulate iSCSIProtocolEndpoints in an iSCSI Node. iSCSIProtocolController models the iSCSI Port. The instance of the service is scoped by an instance of ComputerSystem that represents that Network Entity. The capabilities of this service are defined in the companion class iSCSIConfigurationCapabilities.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSIConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Network::iSCSI' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSIConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates an iSCSI Port in the form of an instance of iSCSIProtocolEndpoint. As part of the creation process the iSCSIProtocolEndpoint is 'bound to' the underlying TCP or IP ProtocolEndpoints which are specified as inputs by creating instances of the BindsTo association between the new instance and those instances. In addition, an instance of SAPAvailableForElement is created between the specified SCSIProtocolController and the new instance of iSCSIProtocolEndpoint.
	 * @param iSCSINode The SCSIProtocolController instance representing the iSCSI Node that will contain the iSCSI Port.
	 * @param Role For iSCSI, each iSCSIProtocolEndpoint must act as either a target or an initiator endpoint. This property indicates which role this iSCSIProtocolEndpoint implements.
	 * @param Identifier If this is an Initiator Port, Identifier MUST contain the ISID, if this is a Target Port, Identifier MUST contain the Target Portal Group Tag (TGPT). Each iSCSIProtocolEndpoint (iSCSI port) associated to a common SCSIProtocolController (iSCSI node) must have a unique Identifier. This field is a string that contains 12 hexadecimal digits. If the property IdentifierSelectionSupported in class iSCSIConfigurationCapabilities is false, this parameter MUST be set to NULL.
	 * @param NetworkPortals Array of References to either TCPProtocolEndpoints representing Target NetworkPortals or IPProtocolEndpoint instances representing Initiator NetworkPortals. If TCPProtocolEndpoints are supplied each MUST be in turn associated to an instance of IPProtocolEndpoint via a BindsTo association in order to provide the Target Network Portal functionality. The selected Portal endpoints MUST be from the same SystemSpecificCollection, which represents a Portal Group.
	 * @param iSCSIPort A reference to the new iSCSIProtocolEndpoint that is created.
	 * <!-- end-model-doc -->
	 * @model iSCSINodeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF'" RoleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Initiator\",\"Target\"]'" IdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='13' ModelCorrespondence='[\"CIM_iSCSIConfigurationCapabilities.IdentifierSelectionSupported\"]'" NetworkPortalsUnique="false" NetworkPortalsMany="true"
	 *        NetworkPortalsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF[]'" iSCSIPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_iSCSIProtocolEndpoint REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"SCSIProtocolController Non-existent\",\"Role Not Supported By Specified SCSIProtocolController\",\"Identifier In Use, Not Unique\",\"Identifier Selection Not Supported\",\"ProtocolEndpoint Non-Existent\",\"TCPProtocolEndpoint Not Bound To Underlying IPProtocolEndpoint\",\"TCPProtocolEndpoint In Use By Other iSCSIProtocolEndpoint In Same Target SCSIProtocolController\",\"ProtocolEndpoints Not From Same Endpoint Collection\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateiSCSIProtocolEndpoint(CIM_SCSIProtocolController iSCSINode, Integer Role, String Identifier, EList<CIM_ProtocolEndpoint> NetworkPortals, CIM_iSCSIProtocolEndpoint iSCSIPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method deletes an instance of iSCSIProtocolEndpoint and all associations in which this iSCSIProtocolEndpoint is referenced.
	 * @param iSCSIPort The iSCSIProtocolEndpoint to be deleted.
	 * <!-- end-model-doc -->
	 * @model iSCSIPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_iSCSIProtocolEndpoint REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Endpoint Non-Existent\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteiSCSIProtocolEndpoint(CIM_iSCSIProtocolEndpoint iSCSIPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method provides for modification of an existing iSCSIProtocolEndpoint by associating a TCPProtocolEndpoint representing an Target NetworkPortal or an IPProtocolEndpoint instance representing an Initiator NetworkPortal to the iSCSIProtocolEndpoint. The association is persisted as an instance of BindsTo. The selected Portal endpoint must be from the same SystemSpecificCollection, which represents a Portal Group, as the endpoints currently bound to the iSCSIProtocolEndpoint. This action is intended to be reversed by the use of the intrinsic method 'DeleteInstance'.
	 * @param iSCSIPort A reference to the iSCSIProtocolEndpoint.
	 * @param NetworkPortal The ProtocolEndpoint instance. If an iSCSI Initiator Port is being modified this will be an IPProtocolEndpoint. If an iSCSI Target Port is being modified this will be a TCPProtocolEndpoint.
	 * <!-- end-model-doc -->
	 * @model iSCSIPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_iSCSIProtocolEndpoint REF'" NetworkPortalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"ProtocolEndpoint Non-Existent\",\"TCPProtocolEndpoint Not Bound To Underlying IPProtocolEndpoint\",\"ProtocolEndpoint In Use By Other iSCSIProtocolEndpoint In Same Target SCSIProtocolController\",\"ProtocolEndpoint Not From Same Endpoint Collection\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long BindiSCSIProtocolEndPoint(CIM_iSCSIProtocolEndpoint iSCSIPort, CIM_ProtocolEndpoint NetworkPortal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates an iSCSI Node in the form of an instance of SCSIProtocolController. As part of the creation process a SystemDevice association is created between the new SCSIProtocolController and the scoping Network Entity (CIM_ComputerSystem) hosting this service.
	 * @param Alias The iSCSI Alias for the new Node.
	 * @param iSCSINode The SCSIProtocolController instance representing the created iSCSI Node.
	 * <!-- end-model-doc -->
	 * @model AliasAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128' ModelCorrespondence='[\"CIM_SCSIProtocolController.ElementName\"]'" iSCSINodeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Node Creation Not Supported\",\"Alias In Use By Other Node\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateiSCSINode(String Alias, CIM_SCSIProtocolController iSCSINode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method deletes an instance of SCSIProtocolController respresenting an iSCSI Node. If Sessions are active on iSCSIProtocolEndpoints belonging to this node an error will be returned. If no Sessions are active the scoped iSCSIProtocolEndpoints will be deleted.
	 * @param iSCSINode The SCSIProtocolController instance representing the iSCSI Node that will be deleted.
	 * <!-- end-model-doc -->
	 * @model iSCSINodeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"SCSIProtocolController Non-Existent\",\"Sessions Active on Node Ports\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteiSCSINode(CIM_SCSIProtocolController iSCSINode);

} // CIM_iSCSIConfigurationService
