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
 * A representation of the model object '<em><b>CIM USB Redirection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBRedirectionService describes the service that manages the USB Redirection of a system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::USBRedirection' override.RedirectionServiceType='uint16[]' override.RedirectionServiceType.Description='RedirectionServiceType\'s enumeration is limited to the \'USB\' and reserved RedirectionServiceType values for this subclass of CIM_RedirectionService.' override.RedirectionServiceType.ValueMap='[\"4\",\"..\",\"32768..65535\"]' override.RedirectionServiceType.Values='[\"USB\",\"DMTF Reserved\",\"Vendor Specified\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_USBRedirectionService extends CIM_RedirectionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is used to add new redirection sessions modeled by CIM_USBRedirectionSAP, to the USB Redirection Service. The USBDevice parameter may contain references to instances of CIM_USBDevice that model the USB Device to be redirected by the new USB Redirection Session. Alternatively new instances of CIM_USBDevice may be created to redirect in the new session. The NewUSBDevices parameter describes the new devices to be created. Typically the new CIM_USBDevices created represent devices that are emulated by the USB Redirection Service. Or the new USB devices may be associated to the existing logical devices specified in the RedirectedLogicalDevices parameter. When the ConnectionMode parameter specifies the new redirection session be in the 'Connect' mode, the AccessInfo parameter specifies the remote network location the redirection session should connect to when it is enabled. Upon completion the following instances will have been created, CIM_USBRedirectionSAP, CIM_ServiceAccessBySAP associating the new USBRedirectionSAP with the USBRedirectionService, CIM_HostedAccessPoint associating the new SAP with the CIM_ComputerSystem that hosts the new SAP, CIM_SAPAvailableForElement associating the CIM_ComputerSystem that has the USB device being redirection with the new SAP, EnabledLogicalElementCapabilities that describes the capabilities of the new SAP, ElementCapabilties associating the new EnabledLogicalElementCapabilities with the new SAP, SAPAvailableForElement associating the new SAP with the USBDevices specified in the parameters to this method. CIM_BindsTo a new CIM_ProtocolEndpoint to the new SAP if the ConnectionMode is 2, or if the ConnectionMode parameter is 3, a new CIM_RemoteAccessAvailableToElement associating the new SAP to a new CIM_RemoteServiceAccessPoint.
	 * @param NewUSBRedirectionSAP A string-valued embedded instance of CIM_USBRedirectionSAP describing the new SAP to be created.
	 * @param NewSAPRequestedStatesSupported an enumeration of the RequestedStatesSupported capability for the newly created SAP. The values specified for this parameter must be from the set of values found in the Redirection Service's CIM_USBRedirectionCapabilities.RequestedStatesSupporteForCreatedSAP array.
	 * @param USBDevices Array of existing devices to redirect via the redirection session. These will be associated with the new CIM_USBRedirectionSAP by a CIM_SAPAvailableForElement association.
	 * @param CreateDevices CreateDevices is a boolean that when TRUE tells the method to create new instances of CIM_USBDevice for each embedded instance in the NewUSBDevices parameter. When CreateDevices is FALSE, the NewUSBDevices and RedirectedLogicalDevices parameters are unused.
	 * @param NewUSBDevices The NewUSBDevices parameter contains the description of the new CIM_USBDevice instances to be created and redirected via the redirection session. This is an array of class CIM_USBDevice encoded as a string-valued embedded instance parameter. The string-valued embedded instances allow specifying the properties desired for the CIM_USBDevice instances that will be created by this method. The new CIM_USBDevice instances created by this method will be associated with the CIM_USBRedirectionService instance by a CIM_ServiceAffectsElement association and with the newly created CIM_USBRedirectionSAP by a CIM_SAPAvailableForElement association. Each entry in this list of new USB Devices is related to the entry in the RedirectedLogicalDevices array that is located at the same index.
	 * @param RedirectedLogicalDevices RedirectedLogicalDevices parameter is an array of references to concrete subclass of CIM_LogicalDevice that will be associated with the new instances of CIM_USBDevice created from the embedded instances of NewUSBDevices. Each entry of this array is related to the entry of NewUSBDevices array that is located at the same index.
	 * @param NewRemoteServiceAccessPoint When the ConnectionMode parameter of the new SAP is 3, 'Connect' this parameter contains a string-valued embedded instance of CIM_RemoteServiceAccessPoint to be created and associated by a CIM_RemoteAccessAvailableToElement association to the new SAP. The represents the remote redirection access point that the new SAP should connect to.
	 * @param SAP A reference to the instances of CIM_USBRedirectionSAP created by the method. This parameter is not returned when the method is run as a Job
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model NewUSBRedirectionSAPAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_USBRedirectionSAP'" NewSAPRequestedStatesSupportedUnique="false" NewSAPRequestedStatesSupportedMany="true"
	 *        NewSAPRequestedStatesSupportedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ModelCorrespondence='[\"CIM_USBRedirectionCapabilities.RequestedStatesSupportedForCreatedSAP\"]'" USBDevicesUnique="false" USBDevicesMany="true"
	 *        USBDevicesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_USBDevice REF[]' In='true'" CreateDevicesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" NewUSBDevicesUnique="false" NewUSBDevicesMany="true"
	 *        NewUSBDevicesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' EmbeddedInstance='CIM_USBDevice' ArrayType='Indexed' ModelCorrespondence='[\"CIM_USBRedirectionService.CreateRedirectionSAP.RedirectedLogicalDevices\"]'" RedirectedLogicalDevicesUnique="false" RedirectedLogicalDevicesMany="true"
	 *        RedirectedLogicalDevicesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF[]' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_USBRedirectionService.CreateRedirectionSAP.NewUSBDevices\"]'" NewRemoteServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_RemoteServiceAccessPoint'" SAPAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_USBRedirectionSAP REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateRedirectionSAP(String NewUSBRedirectionSAP, EList<Integer> NewSAPRequestedStatesSupported, EList<CIM_USBDevice> USBDevices, Boolean CreateDevices, EList<String> NewUSBDevices, EList<CIM_LogicalDevice> RedirectedLogicalDevices, String NewRemoteServiceAccessPoint, CIM_USBRedirectionSAP SAP, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is invoked to delete a USB Redirection session. This includes the associations created by CreateRedirectionSession. The method may also delete the instances of USBDevice associated by a CIM_SAPAvailableForElement association with the CIM_USBRedirectionSAP instance being deleted.
	 * @param SAP A reference to the instance of CIM_USBRedirectionSAP the method shall delete.
	 * @param DeleteUSBDevices Indicates whether the USBDevices associated to the SAP shall also be deleted by this method.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model SAPAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_USBRedirectionSAP REF' In='true'" DeleteUSBDevicesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long DeleteRedirectionSAP(CIM_USBRedirectionSAP SAP, Boolean DeleteUSBDevices, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is invoked to create an new instance of USBDevice that will be redirected by the USB Redirection Service. The RedirectedLogicalDevice parameter may contain a reference to an existing instance of a concrete subclass of CIM_LogicalDevice that will be redirected via the USB RedirectionService. Upon Successful completion of this operation the following instances will have been created. A new instance of CIM_USBDevice, a new instance of ServiceAffectsElement associating the new instance of CIM_USBDevice with the instance of USBRedirectionService. If the RedirectedLogicalDevice parameter is not empty, a new CIM_LogicalIdentity is created associating the new CIM_USBDevice with the RedirectedLogicalDevice.
	 * @param NewUSBDevice The NewUSBDevice parameter contains the description of the new CIM_USBDevice instance to be created and redirected via the redirection session. This parameter is a string-valued embedded instance of the CIM_USBDevice class.
	 * @param RedirectedLogicalDevice If not empty, this is a reference to a concrete subclasss of CIM_LogicalDevice representing the device to be redirected by the USB Redirection Service. This might, for example, be a CIM_CDROMDrive or a CIM_DisketteDrive.
	 * @param USBDevice A reference to the instance of CIM_USBDevice created by the method. This parameter is not returned when the method is run as a Job
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model NewUSBDeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_USBDevice' ModelCorrespondence='[\"CIM_USBRedirectionService.CreateUSBDevice.RedirectedLogicalDevice\"]'" RedirectedLogicalDeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'" USBDeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_USBDevice REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateUSBDevice(String NewUSBDevice, CIM_LogicalDevice RedirectedLogicalDevice, CIM_USBDevice USBDevice, CIM_ConcreteJob Job);

} // CIM_USBRedirectionService
