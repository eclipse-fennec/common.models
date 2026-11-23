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
 * A representation of the model object '<em><b>CIM Virtual System Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_VirtualSystemSettingData defines the virtual aspects of a virtual system through a set of virtualization specific properties. CIM_VirtualSystemSettingData is also used as the top level class of virtual system configurations. Virtual system configurations model configuration information about virtual systems and their components. A virtual system configuration consists of one top-level instance of class CIM_VirtualSystemSettingData that aggregates a number of instances of class CIM_ResourceAllocationSettingData, using association CIM_ConcreteComponent. 
 * Virtual system configurations may for example be used to reflect configurations of 
 * - virtual systems that are defined at a virtualization platform, 
 * - virtual systems that are currently active, 
 * - input requests to create new virtual systems, 
 * - input requests to modify existing virtual systems, or 
 * - snapshots of virtual systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getVirtualSystemIdentifier <em>Virtual System Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getVirtualSystemType <em>Virtual System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationID <em>Configuration ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationDataRoot <em>Configuration Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationFile <em>Configuration File</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSnapshotDataRoot <em>Snapshot Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSuspendDataRoot <em>Suspend Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSwapFileDataRoot <em>Swap File Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getLogDataRoot <em>Log Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupAction <em>Automatic Startup Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupActionDelay <em>Automatic Startup Action Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupActionSequenceNumber <em>Automatic Startup Action Sequence Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticShutdownAction <em>Automatic Shutdown Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticRecoveryAction <em>Automatic Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getRecoveryFile <em>Recovery File</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.43.0' UMLPackagePath='CIM::System::SystemElements' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Virtual System Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the virtualization platform. Note that the VirtualSystemIdentifier is not the hostname assigned to the operating system instance running within the virtual system, nor is it an IP address or MAC address assigned to any of its network ports. 
	 * On create requests VirtualSystemIdentifier may contain implementation specific rules (like simple patterns or regular expresssion) that may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual System Identifier</em>' attribute.
	 * @see #setVirtualSystemIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_VirtualSystemIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVirtualSystemIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getVirtualSystemIdentifier <em>Virtual System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual System Identifier</em>' attribute.
	 * @see #getVirtualSystemIdentifier()
	 * @generated
	 */
	void setVirtualSystemIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Virtual System Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VirtualSystemType shall reflect a particular type of virtual system.
	 * The property value shall conform to this format (in ABNF): vs-type = dmtf-value / other-org-value / legacy-value; dmtf-value = "DMTF:" defining-org ":" org-vs-type; other-org-value = defining-org ":" org-vs-type;
	 * Where: 
	 * dmtf-value: is a property value defined by DMTF and is defined in the description of this property. 
	 * other-org-value: is a property value defined by a business entity other than DMTF and is not defined in the description of this property. 
	 * legacy-value: is a property value defined by a business entity other than DMTF and is not defined in the description of this property. These values are permitted but recommended to be deprecated over time. 
	 * defining-org: is an identifier for the business entity that defines the virtual system type. It shall include a copyrighted, trademarked, or otherwise unique name that is owned by that business entity. It shall not be "DMTF" and shall not contain a colon (:).
	 * org-vs-type: is an identifier for the virtual system type within the defining business entity. It shall be unique within the defining-org. It may use any character allowed for CIM strings, except for the following: U+0000-U+001F (Unicode C0 controls) U+0020 (space), note that the reason is that OVF allows for multiple space-separated vs-type values in this property. U+007F (Unicode C0 controls) U+0080-U+009F (Unicode C1 controls)
	 * 
	 * If there is a need to structure the value into segments, the segments should be separated with a single colon (:).
	 * The values of this property shall be processed case sensitively. They are intended to be processed programmatically (instead of being a display name) and should be short.
	 * 
	 * The following DMTF values are defined: 
	 * DMTF:unknown - the virtual system type is unknown or cannot be determined
	 * DMTF:XEN:PV -- Para Virtualized Machine (tuned for XEN, not able to migrate to another virtualization platform)
	 * DMTF:XEN:HVM -- Hardware Virtualized Machine (able to migrate to another virtualization platform)
	 * DMTF:HP:HPVM -- HP Integrity Virtualization Technology
	 * DMTF:HP:Servers -- Physical servers, including blades
	 * DMTF:Huawei:UVP -- Huawei Unified Virtulization Platform
	 * DMTF:IBM:z/Arch:LPAR:ESA/390 -- IBM z/Architecture capable LPAR in ESA/390 mode
	 * DMTF:IBM:z/Arch:LPAR:ESA/TPFvIBM z/Architecture capable LPAR in ESA/390 TPF mode
	 * DMTF:IBM:z/Arch:LPAR:LINUX -- IBM z/Architecture capable LPAR in LINUX mode
	 * DMTF:IBM:z/Arch:LPAR:VM -- IBM z/Architecture capable LPAR in z/VM mode
	 * DMTF:IBM:z/Arch:LPAR:CF -- IBM z/Architecture capable LPAR in Coupling Facility mode
	 * DMTF:IBM:z/Arch:z/VM:ESA/390 -- IBM z/Architecture capable z/VM guest in ESA/390 virtual config mode
	 * DMTF:IBM:z/Arch:z/VM:LINUX -- IBM z/Architecture capable z/VM guest in LINUX virtual config mode
	 * DMTF:IBM:z/Arch:z/VM:VM -- IBM z/Architecture capable z/VM guest in VM virtual config mode
	 * DMTF:IBM:z/Arch:z/VM:CF -- IBM z/Architecture capable z/VM guest in CF virtual config mode
	 * DMTF:IBM:POWER:AIXLINUX -- IBM POWER LPAR of AIXLINUX typeDMTF:IBM:POWER:VIOS -- IBM POWER LPAR of VIOS type
	 * DMTF:IBM:POWER:i5/OS -- IBM POWER LPAR of i5/OS type
	 * DMTF:KVM -- KVM guest
	 * DMTF:Microsoft:Hyper-V
	 * DMTF:Microsoft:Virtual PC
	 * DMTF:Oracle:X86:OracleVM_Xen:PVM_Linux -- OracleVM capable Linux guest in Xen Para Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_Xen:HVM_Linux -- OracleVM capable Linux guest in Xen Full Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_Xen:Windows -- OracleVM capable Windows guest in Xen Full Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_Xen:Solaris -- OracleVM capable Solaris guest in Xen Full Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_VirtualBox:Linux -- OracleVM capable Linux guest in VirtualBox Full Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_VirtualBox:Windows -- OracleVM capable Windows guest in VirtualBox Full Virtualization mode
	 * DMTF:Oracle:X86:OracleVM_VirtualBox:Solaris -- OracleVM capable Solaris guest in VirtualBox Full Virtualization mode
	 * DMTF:Oracle:Sparc:OracleVM_LDoms:Solaris -- OracleVM capable Solaris guest in LDoms mode
	 * DMTF:Oracle:X86:OracleVM_Xen:PVHVM_Linux -- OracleVM capable Linux guest in Xen Full Virtualization with PV driver mode
	 * DMTF:Oracle:X86:OracleVM_Xen:PVHVM_Windows -- OracleVM capable Windows guest in Xen Full Virtualization with PV driver mode
	 * DMTF:VMware:vmx-04 -- ESX 3.0 and greater, Workstation 5.0 and greater, Server 1.0 and greater
	 * DMTF:VMware:vmx-07 -- ESX 4.0 and greater, Workstation 7.0 and greater, Server 2.0 and greater, Fusion 2.0 and greater
	 * DMTF:VMware:vmx-08 -- vSphere 5.0 and greater, Workstation 8.0 and greater, Fusion 4.0 and greater
	 * DMTF:VMware:vmx-09 -- vSphere 5.1 and greater, Workstation 9.0 and greater, Fusion 5.0 and greater
	 * DMTF:Linux:LXC -- a container that deploys on a Linux operating system with kernal 2.6.24 or later
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual System Type</em>' attribute.
	 * @see #setVirtualSystemType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_VirtualSystemType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVirtualSystemType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getVirtualSystemType <em>Virtual System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual System Type</em>' attribute.
	 * @see #getVirtualSystemType()
	 * @generated
	 */
	void setVirtualSystemType(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End-user supplied notes that are related to the virtual system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_Notes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getNotes();

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when the virtual system configuration was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_CreationTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreationTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(String value);

	/**
	 * Returns the value of the '<em><b>Configuration ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique id of the virtual system configuration. Note that the ConfigurationID is different from the InstanceID as it is assigned by the implementation to a virtual system or a virtual system configuration. It is not a key, and the same value may occur within more than one instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration ID</em>' attribute.
	 * @see #setConfigurationID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_ConfigurationID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getConfigurationID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationID <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration ID</em>' attribute.
	 * @see #getConfigurationID()
	 * @generated
	 */
	void setConfigurationID(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Data Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a directory where information about the virtual system configuration is stored.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Data Root</em>' attribute.
	 * @see #setConfigurationDataRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_ConfigurationDataRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getConfigurationDataRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationDataRoot <em>Configuration Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Data Root</em>' attribute.
	 * @see #getConfigurationDataRoot()
	 * @generated
	 */
	void setConfigurationDataRoot(String value);

	/**
	 * Returns the value of the '<em><b>Configuration File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a file where information about the virtual system configuration is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration File</em>' attribute.
	 * @see #setConfigurationFile(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_ConfigurationFile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getConfigurationFile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getConfigurationFile <em>Configuration File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration File</em>' attribute.
	 * @see #getConfigurationFile()
	 * @generated
	 */
	void setConfigurationFile(String value);

	/**
	 * Returns the value of the '<em><b>Snapshot Data Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a directory where information about virtual system snapshots is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Data Root</em>' attribute.
	 * @see #setSnapshotDataRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_SnapshotDataRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSnapshotDataRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSnapshotDataRoot <em>Snapshot Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot Data Root</em>' attribute.
	 * @see #getSnapshotDataRoot()
	 * @generated
	 */
	void setSnapshotDataRoot(String value);

	/**
	 * Returns the value of the '<em><b>Suspend Data Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a directory where suspend related information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspend Data Root</em>' attribute.
	 * @see #setSuspendDataRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_SuspendDataRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSuspendDataRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSuspendDataRoot <em>Suspend Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend Data Root</em>' attribute.
	 * @see #getSuspendDataRoot()
	 * @generated
	 */
	void setSuspendDataRoot(String value);

	/**
	 * Returns the value of the '<em><b>Swap File Data Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a directory where swapfiles of the virtual system are stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swap File Data Root</em>' attribute.
	 * @see #setSwapFileDataRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_SwapFileDataRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSwapFileDataRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getSwapFileDataRoot <em>Swap File Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap File Data Root</em>' attribute.
	 * @see #getSwapFileDataRoot()
	 * @generated
	 */
	void setSwapFileDataRoot(String value);

	/**
	 * Returns the value of the '<em><b>Log Data Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a directory where log information about the virtual system is stored. A relative path appends to the value of the ConfigurationDataRoot property.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Data Root</em>' attribute.
	 * @see #setLogDataRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_LogDataRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLogDataRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getLogDataRoot <em>Log Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Data Root</em>' attribute.
	 * @see #getLogDataRoot()
	 * @generated
	 */
	void setLogDataRoot(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Startup Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take for the virtual system when the host is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Startup Action</em>' attribute.
	 * @see #setAutomaticStartupAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_AutomaticStartupAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"None\",\"Restart if previously active\",\"Always startup\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getAutomaticStartupAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupAction <em>Automatic Startup Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Startup Action</em>' attribute.
	 * @see #getAutomaticStartupAction()
	 * @generated
	 */
	void setAutomaticStartupAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Automatic Startup Action Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delay applicable to startup action. The value shall be in the interval variant of the datetime datatype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Startup Action Delay</em>' attribute.
	 * @see #setAutomaticStartupActionDelay(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_AutomaticStartupActionDelay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getAutomaticStartupActionDelay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupActionDelay <em>Automatic Startup Action Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Startup Action Delay</em>' attribute.
	 * @see #getAutomaticStartupActionDelay()
	 * @generated
	 */
	void setAutomaticStartupActionDelay(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Startup Action Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number indicating the relative sequence of virtual system activation when the host system is started. A lower number indicates earlier activation. If one or more configurations show the same value, the sequence is implementation dependent. A value of 0 indicates that the sequence is implementation dependent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Startup Action Sequence Number</em>' attribute.
	 * @see #setAutomaticStartupActionSequenceNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_AutomaticStartupActionSequenceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAutomaticStartupActionSequenceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticStartupActionSequenceNumber <em>Automatic Startup Action Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Startup Action Sequence Number</em>' attribute.
	 * @see #getAutomaticStartupActionSequenceNumber()
	 * @generated
	 */
	void setAutomaticStartupActionSequenceNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Automatic Shutdown Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take for the virtual system when the host is shut down.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Shutdown Action</em>' attribute.
	 * @see #setAutomaticShutdownAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_AutomaticShutdownAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"Turn Off\",\"Save state\",\"Shutdown\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getAutomaticShutdownAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticShutdownAction <em>Automatic Shutdown Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Shutdown Action</em>' attribute.
	 * @see #getAutomaticShutdownAction()
	 * @generated
	 */
	void setAutomaticShutdownAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Automatic Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take for the virtual system when the software executed by the virtual system fails. Failures in this case means a failure that is detectable by the host platform, such as a non-interuptable wait state condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Recovery Action</em>' attribute.
	 * @see #setAutomaticRecoveryAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_AutomaticRecoveryAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"None\",\"Restart\",\"Revert to snapshot\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getAutomaticRecoveryAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getAutomaticRecoveryAction <em>Automatic Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Recovery Action</em>' attribute.
	 * @see #getAutomaticRecoveryAction()
	 * @generated
	 */
	void setAutomaticRecoveryAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Recovery File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filepath of a file where recovery relateded information of the virtual system is stored.Format shall be URI based on RFC 2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovery File</em>' attribute.
	 * @see #setRecoveryFile(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingData_RecoveryFile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRecoveryFile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSettingData#getRecoveryFile <em>Recovery File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery File</em>' attribute.
	 * @see #getRecoveryFile()
	 * @generated
	 */
	void setRecoveryFile(String value);

} // CIM_VirtualSystemSettingData
