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
 * A representation of the model object '<em><b>CIM Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OperatingSystem is software/firmware that makes a ComputerSystem's hardware usable, and implements and/or manages the resources, file systems, processes, user interfaces, services, ... available on the ComputerSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getOSType <em>OS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getLastBootUpTime <em>Last Boot Up Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getLocalDateTime <em>Local Date Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getCurrentTimeZone <em>Current Time Zone</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfLicensedUsers <em>Number Of Licensed Users</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfUsers <em>Number Of Users</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfProcesses <em>Number Of Processes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getMaxNumberOfProcesses <em>Max Number Of Processes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getTotalSwapSpaceSize <em>Total Swap Space Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getTotalVirtualMemorySize <em>Total Virtual Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getFreeVirtualMemory <em>Free Virtual Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getFreePhysicalMemory <em>Free Physical Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getTotalVisibleMemorySize <em>Total Visible Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getSizeStoredInPagingFiles <em>Size Stored In Paging Files</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getFreeSpaceInPagingFiles <em>Free Space In Paging Files</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getMaxProcessMemorySize <em>Max Process Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getDistributed <em>Distributed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystem#getMaxProcessesPerUser <em>Max Processes Per User</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::System::OperatingSystem' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"MIF.DMTF|Operating System|001.2\"]' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OperatingSystem extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.CreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.Name'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>OS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A integer indicating the type of OperatingSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Type</em>' attribute.
	 * @see #setOSType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_OSType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' ModelCorrespondence='[\"CIM_OperatingSystem.OtherTypeDescription\",\"CIM_SoftwareElement.TargetOperatingSystem\"]'"
	 * @generated
	 */
	Integer getOSType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getOSType <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Type</em>' attribute.
	 * @see #getOSType()
	 * @generated
	 */
	void setOSType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_OperatingSystem.OSType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Operating System|001.3\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Last Boot Up Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when the OperatingSystem was last booted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Boot Up Time</em>' attribute.
	 * @see #setLastBootUpTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_LastBootUpTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIF.DMTF|General Information|001.5\"]'"
	 * @generated
	 */
	String getLastBootUpTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getLastBootUpTime <em>Last Boot Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Boot Up Time</em>' attribute.
	 * @see #getLastBootUpTime()
	 * @generated
	 */
	void setLastBootUpTime(String value);

	/**
	 * Returns the value of the '<em><b>Local Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperatingSystem's notion of the local date and time of day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Date Time</em>' attribute.
	 * @see #setLocalDateTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_LocalDateTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemDate\",\"MIF.DMTF|General Information|001.6\"]'"
	 * @generated
	 */
	String getLocalDateTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getLocalDateTime <em>Local Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Date Time</em>' attribute.
	 * @see #getLocalDateTime()
	 * @generated
	 */
	void setLocalDateTime(String value);

	/**
	 * Returns the value of the '<em><b>Current Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Time Zone</em>' attribute.
	 * @see #setCurrentTimeZone(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_CurrentTimeZone()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16' Units='Minutes' PUnit='minute'"
	 * @generated
	 */
	Integer getCurrentTimeZone();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getCurrentTimeZone <em>Current Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time Zone</em>' attribute.
	 * @see #getCurrentTimeZone()
	 * @generated
	 */
	void setCurrentTimeZone(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Licensed Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of user licenses for the OperatingSystem. If unlimited, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Licensed Users</em>' attribute.
	 * @see #setNumberOfLicensedUsers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_NumberOfLicensedUsers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getNumberOfLicensedUsers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfLicensedUsers <em>Number Of Licensed Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Licensed Users</em>' attribute.
	 * @see #getNumberOfLicensedUsers()
	 * @generated
	 */
	void setNumberOfLicensedUsers(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of user sessions for which the OperatingSystem is currently storing state information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Users</em>' attribute.
	 * @see #setNumberOfUsers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_NumberOfUsers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Gauge='true' MappingStrings='[\"MIF.DMTF|Host System|001.4\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemNumUsers\"]'"
	 * @generated
	 */
	Long getNumberOfUsers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfUsers <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Users</em>' attribute.
	 * @see #getNumberOfUsers()
	 * @generated
	 */
	void setNumberOfUsers(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Processes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of process contexts currently loaded or running on the OperatingSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Processes</em>' attribute.
	 * @see #setNumberOfProcesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_NumberOfProcesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Gauge='true' MappingStrings='[\"MIF.DMTF|Host System|001.5\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemProcesses\"]'"
	 * @generated
	 */
	Long getNumberOfProcesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getNumberOfProcesses <em>Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Processes</em>' attribute.
	 * @see #getNumberOfProcesses()
	 * @generated
	 */
	void setNumberOfProcesses(Long value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Processes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Processes</em>' attribute.
	 * @see #setMaxNumberOfProcesses(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_MaxNumberOfProcesses()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Host System|001.6\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemMaxProcesses\"]'"
	 * @generated
	 */
	Long getMaxNumberOfProcesses();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getMaxNumberOfProcesses <em>Max Number Of Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Processes</em>' attribute.
	 * @see #getMaxNumberOfProcesses()
	 * @generated
	 */
	void setMaxNumberOfProcesses(Long value);

	/**
	 * Returns the value of the '<em><b>Total Swap Space Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Swap Space Size</em>' attribute.
	 * @see #setTotalSwapSpaceSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_TotalSwapSpaceSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getTotalSwapSpaceSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getTotalSwapSpaceSize <em>Total Swap Space Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Swap Space Size</em>' attribute.
	 * @see #getTotalSwapSpaceSize()
	 * @generated
	 */
	void setTotalSwapSpaceSize(Long value);

	/**
	 * Returns the value of the '<em><b>Total Virtual Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Virtual Memory Size</em>' attribute.
	 * @see #setTotalVirtualMemorySize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_TotalVirtualMemorySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|System Memory Settings|001.5\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getTotalVirtualMemorySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getTotalVirtualMemorySize <em>Total Virtual Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Virtual Memory Size</em>' attribute.
	 * @see #getTotalVirtualMemorySize()
	 * @generated
	 */
	void setTotalVirtualMemorySize(Long value);

	/**
	 * Returns the value of the '<em><b>Free Virtual Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Virtual Memory</em>' attribute.
	 * @see #setFreeVirtualMemory(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_FreeVirtualMemory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Gauge='true' MappingStrings='[\"MIF.DMTF|System Memory Settings|001.6\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getFreeVirtualMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getFreeVirtualMemory <em>Free Virtual Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Virtual Memory</em>' attribute.
	 * @see #getFreeVirtualMemory()
	 * @generated
	 */
	void setFreeVirtualMemory(Long value);

	/**
	 * Returns the value of the '<em><b>Free Physical Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Kbytes of physical memory currently unused and available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Physical Memory</em>' attribute.
	 * @see #setFreePhysicalMemory(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_FreePhysicalMemory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Gauge='true' MappingStrings='[\"MIF.DMTF|System Memory Settings|001.2\",\"MIF.UNIX|Host Physical Memory|6.1\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getFreePhysicalMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getFreePhysicalMemory <em>Free Physical Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Physical Memory</em>' attribute.
	 * @see #getFreePhysicalMemory()
	 * @generated
	 */
	void setFreePhysicalMemory(Long value);

	/**
	 * Returns the value of the '<em><b>Total Visible Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Visible Memory Size</em>' attribute.
	 * @see #setTotalVisibleMemorySize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_TotalVisibleMemorySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getTotalVisibleMemorySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getTotalVisibleMemorySize <em>Total Visible Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Visible Memory Size</em>' attribute.
	 * @see #getTotalVisibleMemorySize()
	 * @generated
	 */
	void setTotalVisibleMemorySize(Long value);

	/**
	 * Returns the value of the '<em><b>Size Stored In Paging Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Stored In Paging Files</em>' attribute.
	 * @see #setSizeStoredInPagingFiles(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_SizeStoredInPagingFiles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|System Memory Settings|001.3\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getSizeStoredInPagingFiles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getSizeStoredInPagingFiles <em>Size Stored In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Stored In Paging Files</em>' attribute.
	 * @see #getSizeStoredInPagingFiles()
	 * @generated
	 */
	void setSizeStoredInPagingFiles(Long value);

	/**
	 * Returns the value of the '<em><b>Free Space In Paging Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Space In Paging Files</em>' attribute.
	 * @see #setFreeSpaceInPagingFiles(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_FreeSpaceInPagingFiles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Gauge='true' MappingStrings='[\"MIF.DMTF|System Memory Settings|001.4\"]' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getFreeSpaceInPagingFiles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getFreeSpaceInPagingFiles <em>Free Space In Paging Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Space In Paging Files</em>' attribute.
	 * @see #getFreeSpaceInPagingFiles()
	 * @generated
	 */
	void setFreeSpaceInPagingFiles(Long value);

	/**
	 * Returns the value of the '<em><b>Max Process Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Process Memory Size</em>' attribute.
	 * @see #setMaxProcessMemorySize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_MaxProcessMemorySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getMaxProcessMemorySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getMaxProcessMemorySize <em>Max Process Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Process Memory Size</em>' attribute.
	 * @see #getMaxProcessMemorySize()
	 * @generated
	 */
	void setMaxProcessMemorySize(Long value);

	/**
	 * Returns the value of the '<em><b>Distributed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distributed</em>' attribute.
	 * @see #setDistributed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_Distributed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDistributed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getDistributed <em>Distributed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributed</em>' attribute.
	 * @see #getDistributed()
	 * @generated
	 */
	void setDistributed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Processes Per User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value that indicates the maximum processes that a user can have associate with it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Processes Per User</em>' attribute.
	 * @see #setMaxProcessesPerUser(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystem_MaxProcessesPerUser()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxProcessesPerUser();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystem#getMaxProcessesPerUser <em>Max Processes Per User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Processes Per User</em>' attribute.
	 * @see #getMaxProcessesPerUser()
	 * @generated
	 */
	void setMaxProcessesPerUser(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests a reboot of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long Reboot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests a shutdown of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. It is up to the implementation or subclass of OperatingSystem to establish dependencies between the Shutdown and Reboot methods, and for example, to provide more sophisticated capabilities such as scheduled shutdown/ reboot, etc. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long Shutdown();

} // CIM_OperatingSystem
