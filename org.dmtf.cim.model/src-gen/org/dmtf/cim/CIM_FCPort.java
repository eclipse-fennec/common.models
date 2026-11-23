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
 * A representation of the model object '<em><b>CIM FC Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a Fibre Channel Port Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getSupportedCOS <em>Supported COS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getActiveCOS <em>Active COS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getSupportedFC4Types <em>Supported FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getActiveFC4Types <em>Active FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getDetailedPortState <em>Detailed Port State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getDomainPortNumber <em>Domain Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getLogicalModulePortNumber <em>Logical Module Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getPortAvailability <em>Port Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPort#getPortDiscriminator <em>Port Discriminator</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::FC' override.PortType='uint16' override.PortType.Description='The specific mode currently enabled for the Port. If the port is logged in, this will be the negotiated port type, otherwise the configured port type will be reported. \nThe values: \"N\" = Node Port, \"NL\" = Node Port supporting FC arbitrated loop, \"NX\" = Port may negotiate to become either a node port (N) or a node port supporting FC arbitrated loop (NL), \"E\" = Expansion Port connecting fabric elements (for example, FC switches), \"F\" = Fabric (element) Port, \"FL\" = Fabric (element) Port supporting FC arbitrated loop, \"FX\" = Port may negotiate to become a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). \"B\" = Bridge port, and \"G\" = Port may negotiate to become either an expansion port (E), or a fabric port (F), \"GL\" = Port may negotiate to become an expansion port (E), a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). \nPortTypes are defined in the ANSI X3 standards. When set to 1 (\"Other\"), the related property OtherPortType contains a string description of the type of port.' override.PortType.ValueMap='[\"0\",\"1\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"16000..65535\"]' override.PortType.Values='[\"Unknown\",\"Other\",\"N\",\"NL\",\"F/NL\",\"Nx\",\"E\",\"F\",\"FL\",\"B\",\"G\",\"Vendor Reserved\"]' override.PortNumber='uint16' override.PortNumber.Description='The labeled port number for administrative purposes. This is typically what is exposed through the devices element manager or CLI.' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCPort extends CIM_NetworkPort {
	/**
	 * Returns the value of the '<em><b>Supported COS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that indicates the Fibre Channel Classes of Service that are supported. The active COS are indicated in ActiveCOS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported COS</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_SupportedCOS()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"F\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCOS();

	/**
	 * Returns the value of the '<em><b>Active COS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that indicates the Classes of Service that are active. The Active COS is indicated in ActiveCOS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active COS</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_ActiveCOS()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"F\"]' ModelCorrespondence='[\"CIM_FCPort.SupportedCOS\"]'"
	 * @generated
	 */
	EList<Integer> getActiveCOS();

	/**
	 * Returns the value of the '<em><b>Supported FC4 Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that indicates the Fibre Channel FC-4 protocols supported. The protocols that are active and running are indicated in the ActiveFC4Types property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported FC4 Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_SupportedFC4Types()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"4\",\"5\",\"8\",\"9\",\"17\",\"18\",\"19\",\"21\",\"22\",\"23\",\"25\",\"26\",\"27\",\"28\",\"32\",\"34\",\"36\",\"64\",\"80\",\"81\",\"82\",\"88\",\"96\",\"255..\"]' Values='[\"Unknown\",\"Other\",\"ISO/IEC 8802 - 2 LLC\",\"IP over FC\",\"SCSI - FCP\",\"SCSI - GPP\",\"IPI - 3 Master\",\"IPI - 3 Slave\",\"IPI - 3 Peer\",\"CP IPI - 3 Master\",\"CP IPI - 3 Slave\",\"CP IPI - 3 Peer\",\"SBCCS Channel\",\"SBCCS Control Unit\",\"FC-SB-2 Channel\",\"FC-SB-2 Control Unit\",\"Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)\",\"FC-SW\",\"FC - SNMP\",\"HIPPI - FP\",\"BBL Control\",\"BBL FDDI Encapsulated LAN PDU\",\"BBL 802.3 Encapsulated LAN PDU\",\"FC - VI\",\"FC - AV\",\"Vendor Unique\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFC4Types();

	/**
	 * Returns the value of the '<em><b>Active FC4 Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that indicates the Fibre Channel FC-4 protocols currently running. A list of all supported protocols is indicated in the SupportedFC4Types property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active FC4 Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_ActiveFC4Types()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"4\",\"5\",\"8\",\"9\",\"17\",\"18\",\"19\",\"21\",\"22\",\"23\",\"25\",\"26\",\"27\",\"28\",\"32\",\"34\",\"36\",\"64\",\"80\",\"81\",\"82\",\"88\",\"96\",\"255..\"]' Values='[\"Unknown\",\"Other\",\"ISO/IEC 8802 - 2 LLC\",\"IP over FC\",\"SCSI - FCP\",\"SCSI - GPP\",\"IPI - 3 Master\",\"IPI - 3 Slave\",\"IPI - 3 Peer\",\"CP IPI - 3 Master\",\"CP IPI - 3 Slave\",\"CP IPI - 3 Peer\",\"SBCCS Channel\",\"SBCCS Control Unit\",\"FC-SB-2 Channel\",\"FC-SB-2 Control Unit\",\"Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)\",\"FC-SW\",\"FC - SNMP\",\"HIPPI - FP\",\"BBL Control\",\"BBL FDDI Encapsulated LAN PDU\",\"BBL 802.3 Encapsulated LAN PDU\",\"FC - VI\",\"FC - AV\",\"Vendor Unique\"]' ModelCorrespondence='[\"CIM_FCPort.SupportedFC4Types\"]'"
	 * @generated
	 */
	EList<Integer> getActiveFC4Types();

	/**
	 * Returns the value of the '<em><b>Detailed Port State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional port state/status information for the FCPort beyond that provided in OperationalStatus and EnabledState.
	 * The following detailed port states may occur when OperationStatus is set to OK: Transceiver Validation(2) indicates that the transceiver is being validated. Locking To Reference Signal(3) indicates that the port is locking to the reference signal. Sync (4) indicates the port is receiving light and is synchronized with the other port. 
	 * 
	 * The following detailed port states may occur when OperationStatus is set to Error: 
	 * Invalid Transceiver (5) indicates the port has detected an invalid transceiver. 
	 * No Light (6) indicates transciever is not receiving light. 
	 * No Sync (7) indicates that port is receiving light but cannot synchronize. 
	 * Laser Fault (8) indicates the transceiver is reporting the laser is not working or the transceiver is not reporting data for the laser, or software detected the error by polling the transceiver and shut the port down Port Fault (9) indicates the port encountered errors beyond the transceiver including excessive low level link initializations. 
	 * Diagnostic Fault (10) indicates that diagnoistic tests running various traffic types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Port State</em>' attribute.
	 * @see #setDetailedPortState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_DetailedPortState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Transceiver Validation\",\"Locking To Reference Signal\",\"Sync\",\"Invalid Transceiver\",\"No Light\",\"No Sync\",\"Laser Fault\",\"Port Fault\",\"Diagnostic Fault\",\"Vendor Reserved\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getDetailedPortState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPort#getDetailedPortState <em>Detailed Port State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Port State</em>' attribute.
	 * @see #getDetailedPortState()
	 * @generated
	 */
	void setDetailedPortState(Integer value);

	/**
	 * Returns the value of the '<em><b>Domain Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port number used for domain id and physical port zone members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Port Number</em>' attribute.
	 * @see #setDomainPortNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_DomainPortNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDomainPortNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPort#getDomainPortNumber <em>Domain Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Port Number</em>' attribute.
	 * @see #getDomainPortNumber()
	 * @generated
	 */
	void setDomainPortNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Module Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port number labeled for an administrative purposes relative to the logical module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Module Port Number</em>' attribute.
	 * @see #setLogicalModulePortNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_LogicalModulePortNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLogicalModulePortNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPort#getLogicalModulePortNumber <em>Logical Module Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Module Port Number</em>' attribute.
	 * @see #getLogicalModulePortNumber()
	 * @generated
	 */
	void setLogicalModulePortNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Availability</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The availability of the port for a client to determine whether the port can be made operational. The values: Available (2) indicates that the port can be made operational, Not Installed (3) indicates some aspect of the port has not been installed preventing it from being operational but is discoverable through instrumentation, No Transceiver (4) indicates that the transceiver is not installed to allow the port to become operational, Not Licensed (5) indicates that the port cannot be made operational due to a license not existing for the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Availability</em>' attribute.
	 * @see #setPortAvailability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_PortAvailability()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"Unknown\",\"Available\",\"Not Installed\",\"No Transceiver\",\"Not Licensed\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getPortAvailability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPort#getPortAvailability <em>Port Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Availability</em>' attribute.
	 * @see #getPortAvailability()
	 * @generated
	 */
	void setPortAvailability(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration used to discriminate the context in which this FCPort is instantiated: 
	 * Not Applicable (2) indicates that this FCPort was not instantiated in any special context.
	 * VF (3) indicates this FCPort was instantiated in the context of Virtual Fabrics (VF).
	 * FCIP (4) indicates that this FCport was instantiated in the context of FC over IP (FCIP).
	 * IFR (5) indicates that this FCPort was instantiated in the context of Inter-Fabric Routing (IFR).
	 * IFR (Virtual) (6) indicates that this FCPort was instantiated in the context of Inter-Fabric Routing (IFR) and has no physical representation.
	 * NPIV (7) indicates that this FCPort was instantiated in the context of N Port Virtualization (NPIV).
	 * Internal (8) indicates that this FCPort is not externally visible and is represented physically 
	 * internally in the hardware (unlike VF).
	 * Chassis (9) indicates that this FCPort is externally visible but is not supported by a traditional 
	 * fibre channel connector (for example a chassis to chassis connection).
	 * FCoE (10) indicates that this FCPort is instantiated for Fibre Channel over Ethernet (FCoE).
	 * FC (Native) (11) indicates that this FCPort represents a native FCPort.
	 * HBA (12) indicates that this FCPort is instantiated in a Host Bus Adapter (HBA) context.
	 * Storage (13) indicates that this FCPort in instantiated in a storage (e.g., disk array) context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPort_PortDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\"]' Values='[\"Unknown\",\"Not Applicable\",\"VF\",\"FCIP\",\"IFR\",\"IFR (Virtual)\",\"NPIV\",\"Internal\",\"Chassis\",\"FCoE\",\"FC (Native)\",\"HBA\",\"Storage\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getPortDiscriminator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests the fibre channel port represented by an instance of this class to be taken into the decommissioned state.
	 * The decommissioned state is an intended offline state, so the system does not attempt to take the port back online as part of any automated recovery actions.
	 * This method supports a normal mode of operation and a forceful mode of operation. In the normal mode of operation, it behaves gracefully by not decommissioning the port if this would cause any functional disruption. In the forceful mode of operation, it decommissions the port even if this causes functional disruptions.
	 * This method shall return one of the following return values:
	 * 0 (Success): The port was decommissioned.
	 * 1 (Other error): The port was not decommissioned because some other error occurred.
	 * 2 (Denied: Port is in use): The port was not decommissioned because it is currently in use. This reason for denying the decommissioning request shall be used only in the normal mode of operation.
	 * 3 (Denied: Port is last path to device): The port was not decommissioned because it is the last path to a device. This reason for denying the decommissioning request shall be used only in the normal mode of operation.
	 * @param Force
	 *   Indicates that the forceful mode of operation shall be used, as follows:
	 *   A value of True indicates that the forceful mode of operation shall be used. A value of False or Null indicates that the normal mode of operation shall be used.
	 * @param Messages
	 *   When the decommissioning request has failed (denied or error), this parameter shall return one ore more DMTF standard messages describing the reason for the failure.
	 *   When the decommissioning request has succeeded, this parameter may return one or more DMTF standard messages providing additional information on the actions that have been performed when the request was processed.
	 * <!-- end-model-doc -->
	 * @model ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" MessagesUnique="false" MessagesMany="true"
	 *        MessagesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_Message' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Other error\",\"Denied Port is in use\",\"Denied Port is last path to device\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long Decommission(Boolean Force, EList<String> Messages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests the fibre channel port represented by an instance of this class to be taken online after it was previously decommissioned.
	 * This method shall return one of the following return values:
	 * 0 (Success): The port was taken online.
	 * 1 (Other error): The port was not taken online because some other error occurred.
	 * 2 (Denied: Port not decommissioned): The port was not taken online because the port is not currently in the decommissioned state.
	 * @param Messages
	 *   When the recommissioning request has failed (denied or error), this parameter shall return one ore more DMTF standard messages describing the reason for the failure.
	 *   When the recommissioning request has succeeded, this parameter may return one or more DMTF standard messages providing additional information on the actions that have been performed when the request was processed.
	 * <!-- end-model-doc -->
	 * @model MessagesUnique="false" MessagesMany="true"
	 *        MessagesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_Message' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Other error\",\"Denied Port not decommissioned\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long Recommission(EList<String> Messages);

} // CIM_FCPort
