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
 * A representation of the model object '<em><b>CIM File Server Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service provides active management for a FileServer. It supports the creation, modification, and deletion of FileServer elements and ConcreteJobs for long-runningtasks.
 * In addition, it supports the creation, modification, and deletion of IP Interfaces associated with a given FileServer.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileServerConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FileServerConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateFileServer creates a FileServer and returns a reference to it as the value of the parameter TheElement.The FileServer shall be an instance of ComputerSystem with Dedicated="FileServer". Even if this operation does not complete but creates a ConcreteJob, an implementation may return a valid reference in TheElement. If the job fails subsequently, it is possible for this reference to become invalid. 
	 * The desired settings for the FileServer are specified by several parameters (string-valued EmbeddedInstance elements of the appropriate class).
	 * A new FileServerSettings element that represents the settings of the FileServer shall be associated via ElementSettingData to the FileServer. In addition, new instances of CIFSSettingData, NFSSettingData, NISSettingData, IPInterfaceSettingData, and DNSSettingData shall be associated with the FileServerSettings element via ConcreteComponent. The IPInterfaceSettingData shall be used to 1) create an instance of IPProtocolEndPoint that shall be associated with the FileServer via HostedAccessPoint. 2) create an instance of NetworkVLAN and associate it with the IPProtocolEndPoint via MemberOfCollection, and 3) create an instance of TCPProtocolEndPoint associating it with the FileServer via HostedAccessPoint. The HostingComputerSystem identifies the ComputerSystem that is hosting the FileServer. A HostedDependency association shall be created to associate this ComputerSystem with the FileServer. The EthernetPort parameter is used to create an association between the EthernetPort's LANEndPoint and IPProtocolEndpoint, and to associate the EthernetPort with the CIFS and NFS ProtocolEndPoints via DeviceSAPImplementation. The NASComputerSystem is used to associate the new FileServer with the NAS system via ComponentCS
	 * @param ElementName An end user relevant name for the file server being created. The value shall be stored in the 'ElementName' property for the created element. This parameter shall not be NULL or the empty string.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElement The newly created FileServer.
	 * @param FileServerSettings The FileServerSettings for the newly created FileServer. If NULL or the empty string, a default FileServerSettings shall be used and returned on output.
	 * @param IPInterfaceSettingData The IPInterfaceSettingData that specifies the IP Interface that the FileServer will use for servicing all CIFS and NFS requests. If NULL or the empty string, a default IPInterfaceSettingData shall be used and returned on output
	 * @param CIFSSettingData The CIFSSettingData that specifies the CIFS settings for the FileServer being created. If this is NULL, the FileServer shall not have CIFS enabled and the resulting CIFSSettingData instance created shall have its "Enabled" property set to false. The CIFSSettingData instance will be returned on output.
	 * @param NFSSettingData The NFSSettingData that specifies the NFS settings for the FileServer being created. If this is NULL, the FileServer shall not have NFS enabled and the resulting NFSSettingData instance created shall have its "Enabled" property set to false. The NFSSettingData instance will be returned on output.
	 * @param DNSSettingData The DNSSettingData that specifies the DNS settings for the FileServer being created. If this is NULL, the FileServer shall not have access to a DNS server and a DNSSettingData instance shall not be instantiated for the FileServer.
	 * @param NISSettingData The NISSettingData that specifies the NIS settings for the FileServer being created. If this is NULL, the FileServer shall not have access to a NIS server and a NISSettingData instance shall not be instantiated for the FileServer.
	 * @param NASComputerSystem Either the NAS Head or Self-contained NAS system that the FileServer shall be a component system of.
	 * @param HostingComputerSystem The HostingComputerSystem identifies the ComputerSystem that will host the FileServer.
	 * @param EthernetPort The EthernetPort identifies the hardware port that the File Server will use for mount requests.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'" FileServerSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_FileServerSettings'" IPInterfaceSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_FSIPInterfaceSettingData'" CIFSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_CIFSSettingData'" NFSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_NFSSettingData'" DNSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_DNSSettingData'" NISSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_NISSettingData'" NASComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" HostingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" EthernetPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EthernetPort REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"4096\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Failed\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateFileServer(String ElementName, CIM_ConcreteJob Job, CIM_LogicalElement TheElement, String FileServerSettings, String IPInterfaceSettingData, String CIFSSettingData, String NFSSettingData, String DNSSettingData, String NISSettingData, CIM_ComputerSystem NASComputerSystem, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModifyFileServer modifies a FileServer specified by the input reference parameter FileServer.The desired new settings for the FileServer are specified by the various parameters (string-valued EmbeddedInstance objects of class FileSystemSetting).
	 * One or all of the SettingData parameters may contain EmbeddedInstance objects reflecting the aspect(s) of the FileServer that are to be Modified. The parameters are essentially the same as found in CreateFileServer except the HostingComputerSystem and EthernetPort cannot be modified through this method. To modify those, use the ModifyIPInterface method.
	 * @param FileServer The FileServer to be modified.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param ElementName A new end user relevant name for the FileServer specified by TheElement. If NULL, then the previous name is not changed.
	 * @param FileServerSettings If non-NULL, this specifies the new FileServerSettings for the FileServer. If NULL, then the FileServerSettings of the FileServer shall ot be modified.
	 * @param CIFSSettingData IF non-NULL, this specifies the new CIFS settings for the FileServer. If the "Enabled" property set to false, CIFS will be disabled for the FileServer. If NULL, then the CIFS setting of the FileServer shall not be modified.
	 * @param NFSSettingData IF non-NULL, this specifies the new NFS settings for the FileServer. If the "Enabled" property set to false, NFS will be disabled for the FileServer. If NULL, then the NFS setting of the FileServer shall not be modified.
	 * @param DNSSettingData IF non-NULL, this specifies the new DNS settings for the FileServer. If NULL, then the DNS setting of the FileServer shall not be modified.
	 * @param NISSettingData IF non-NULL, this specifies the new NIS settings for the FileServer. If NULL, then the NIS setting of the FileServer shall not be modified.
	 * <!-- end-model-doc -->
	 * @model FileServerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" FileServerSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FileServerSettings'" CIFSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_CIFSSettingData'" NFSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_NFSSettingData'" DNSSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_DNSSettingData'" NISSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_NISSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"4096\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Failed\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyFileServer(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job, String ElementName, String FileServerSettings, String CIFSSettingData, String NFSSettingData, String DNSSettingData, String NISSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeleteFileServer deletes a FileServer specified by the parameter FileServer. This operation may not succeed if the FileServer is hosting any FileSystems. The ComputerSystem instance that represents the FileServer will be deleted along with the associated instances FileServerSettings, CIFSSettingData, NFSSettingData, NISSettingData, IPInterfaceSettingData, IPProtocolEndPoint, TCPProtocolEndPoint, NetworkVLAN, and the CIFS/NFS ProtocolEndpoints. All related Associations shall be deleted as well. If necessary, a ConcreteJob will be started to delete the FileServer. A reference to the ConcreteJob will be returned in the output parameter Job.
	 * @param FileServer The FileServer that is to be deleted.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model FileServerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Failed, Unspecified Reasons\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteFileServer(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AddIPInterface adds a new IP Interface to an existing FileServer specified by the parameter FileServer. The parameters specify the IPInterfaceSettingData, HostingComputerSystem, and EthernetPort that make up the new IP Interface. In a manner similar to the actions in CreateFileServer, a new instance of IPInterfaceSettingData is associated with the FileServer via ConcreteComponent and is used to instantiate a new IPProtocolEndpoint, NetworkVLAN, and TCPProtocolEndpoint with appropriate associations, again as described in CreateFileServer. The HostingComputerSystem is associated with the FileServer via HostedDepedency. This operation may fail if the FileServer already has the same IP Interface or if any of the parameters are incompatible with the current state of the FileServer. If necessary, a ConcreteJob will be started to add the IP Interface. A reference to the ConcreteJob will be returned in the output parameter Job.
	 * @param FileServer The FileServer that is to which the IP Interface shall be added.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param IPInterfaceSettingData The IPInterfaceSettingData that specifies the settings of the IP Interface to be added to the FileServer.
	 * @param HostingComputerSystem The HostingComputerSystem identifies the ComputerSystem that will host the new IP Interface for the FileServer.
	 * @param EthernetPort The EthernetPort identifies the hardware port that will host the new IP Interface.
	 * <!-- end-model-doc -->
	 * @model FileServerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" IPInterfaceSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_FSIPInterfaceSettingData'" HostingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" EthernetPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EthernetPort REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Failed, Unspecified Reasons\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddIPInterface(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job, String IPInterfaceSettingData, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModifyIPInterface modifies an existing IP Interface on the FileServer specified by the parameter FileServer. The parameters identify the IP Interface to modify and specify the new IPInterfaceSettingData, HostingComputerSystem, and EthernetPort for the IP Interface. If necessary, a ConcreteJob will be started to add the IP Interface. A reference to the ConcreteJob will be returned in the output parameter Job.
	 * @param FileServer The FileServer who's IP Interface shall be modified.
	 * @param IPInterfaceSettingData The IPInterfaceSettingData that is to be modified. This is used to identify which IPInterfaceSettingData instance to modify
	 * @param Job Reference to the job (may be null if job completed).
	 * @param NewIPInterfaceSettingData If non-NULL, the IPInterfaceSettingData that will replace an existing IPInterfaceSettingData instance in the FileServer. If NULL, then the IPInterfaceSettingData will not be modified.
	 * @param HostingComputerSystem If non-NULL, the new ComputerSystem that will host the IPInterface. If NULL, the current ComputerSystem hosting the IPInterface will remain unchanged.
	 * @param EthernetPort If non-NULL, the EthernetPort identifies the new hardware port for the IPInterface. If NULL, the current EthernetPort setting will not be changed.
	 * <!-- end-model-doc -->
	 * @model FileServerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Out='true'" IPInterfaceSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FSIPInterfaceSettingData REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" NewIPInterfaceSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_FSIPInterfaceSettingData'" HostingComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" EthernetPortAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_EthernetPort REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Failed, Unspecified Reasons\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyIPInterface(CIM_ComputerSystem FileServer, CIM_FSIPInterfaceSettingData IPInterfaceSettingData, CIM_ConcreteJob Job, String NewIPInterfaceSettingData, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeleteIPInterface deletes an existing IP Interface on the FileServer specified by the parameter FileServer. The parameters identify the IP Interface to delete. This operation may fail if the IP Interface specified is the only IP Interface currently associated with the FileServer. Deleting a IP Interface includes deleting the IPInterfaceSettingData, IPProtocolEndPoint, NetworkVLAN, and TCPProtocolEndPoint instances. The related associations shall also be deleted. If necessary, a ConcreteJob will be started to add the IP Interface. A reference to the ConcreteJob will be returned in the output parameter Job.
	 * @param FileServer The FileServer who's IP Interface shall be deleted.
	 * @param IPInterfaceSettingData The IPInterfaceSettingData that is to be deleted. This is used to identify which IPInterfaceSettingData instance to delete.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model FileServerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Out='true'" IPInterfaceSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FSIPInterfaceSettingData REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Failed, Unspecified Reasons\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteIPInterface(CIM_ComputerSystem FileServer, CIM_FSIPInterfaceSettingData IPInterfaceSettingData, CIM_ConcreteJob Job);

} // CIM_FileServerConfigurationService
