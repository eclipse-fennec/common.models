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
 * A representation of the model object '<em><b>CIM Software Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SoftwareElement class is used to decompose a CIM_SoftwareFeature object into a set of individually manageable or deployable parts, for a particular platform. A SoftwareElement's platform is uniquely identified by its underlying hardware architecture and operating system (for example Sun Solaris on Sun Sparc or Windows NT on Intel platforms). As such, to understand the details of how the functionality of a particular SoftwareFeature is provided on a particular platform, the CIM_SoftwareElement objects referenced by CIM_SoftwareFeatureSoftwareElements associations are organized in disjoint sets based on the TargetOperatingSystem property. A CIM_SoftwareElement object captures the management details of a part or component in one of four states characterized by the SoftwareElementState property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getOtherTargetOS <em>Other Target OS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getIdentificationCode <em>Identification Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElement#getLanguageEdition <em>Language Edition</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Name='string' override.Name.Key='true' override.Name.Description='The name used to identify this SoftwareElement.' override.Name.MaxLen='256' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElement extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software Version should be in the form <Major>.<Minor>.<Revision> or <Major>.<Minor><letter><revision>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|SubComponent Software |001.4\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Software Element State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SoftwareElementState is defined in this model to identify various states of a SoftwareElement's life cycle. 
	 * - A SoftwareElement in the deployable state describes the details necessary to successfully distribute it and the details (Checks and Actions) required to move it to the installable state (i.e, the next state). 
	 * - A SoftwareElement in the installable state describes the details necessary to successfully install it and the details (Checks and Actions) required to create an element in the executable state (i.e., the next state). 
	 * - A SoftwareElement in the executable state describes the details necessary to successfully start it and the details (Checks and Actions) required to move it to the running state (i.e., the next state). 
	 * - A SoftwareElement in the running state describes the details necessary to manage the started element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element State</em>' attribute.
	 * @see #setSoftwareElementState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_SoftwareElementState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Deployable\",\"Installable\",\"Executable\",\"Running\"]'"
	 * @generated
	 */
	Integer getSoftwareElementState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getSoftwareElementState <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element State</em>' attribute.
	 * @see #getSoftwareElementState()
	 * @generated
	 */
	void setSoftwareElementState(Integer value);

	/**
	 * Returns the value of the '<em><b>Software Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an identifier for the SoftwareElement and is designed to be used in conjunction with other keys to create a unique representation of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element ID</em>' attribute.
	 * @see #setSoftwareElementID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_SoftwareElementID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSoftwareElementID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getSoftwareElementID <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element ID</em>' attribute.
	 * @see #getSoftwareElementID()
	 * @generated
	 */
	void setSoftwareElementID(String value);

	/**
	 * Returns the value of the '<em><b>Target Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TargetOperatingSystem property specifies the element's operating system environment. The value of this property does not ensure that it is binary executable. Two other pieces of information are needed. First, the version of the OS needs to be specified using the class, CIM_OSVersion Check. The second piece of information is the architecture that the OS runs on. This information is verified using CIM_ArchitectureCheck. The combination of these constructs clearly identifies the level of OS required for a particular SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Operating System</em>' attribute.
	 * @see #setTargetOperatingSystem(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_TargetOperatingSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' MappingStrings='[\"MIF.DMTF|SubComponent Software|001.8\"]' ModelCorrespondence='[\"CIM_OperatingSystem.OSType\"]'"
	 * @generated
	 */
	Integer getTargetOperatingSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getTargetOperatingSystem <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operating System</em>' attribute.
	 * @see #getTargetOperatingSystem()
	 * @generated
	 */
	void setTargetOperatingSystem(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Target OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherTargetOS property records the manufacturer and operating system type for a SoftwareElement when the TargetOperatingSystem property has a value of 1 ("Other"). For all other values of TargetOperatingSystem, the OtherTargetOS property is NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Target OS</em>' attribute.
	 * @see #setOtherTargetOS(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_OtherTargetOS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_OperatingSystem.OtherTypeDescription\"]'"
	 * @generated
	 */
	String getOtherTargetOS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getOtherTargetOS <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Target OS</em>' attribute.
	 * @see #getOtherTargetOS()
	 * @generated
	 */
	void setOtherTargetOS(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_Manufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MIF.DMTF|SubComponent Software|001.3\"]'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal identifier for this compilation of SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #setBuildNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_BuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|Software Component Information|002.4\"]'"
	 * @generated
	 */
	String getBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assigned serial number of this SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|ComponentID|001.4\"]'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Code Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code set used by this SoftwareElement. It defines the bit patterns that a system uses to identify characters. ISO defines various code sets such as UTF-8 and ISO8859-1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Set</em>' attribute.
	 * @see #setCodeSet(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_CodeSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getCodeSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getCodeSet <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Set</em>' attribute.
	 * @see #getCodeSet()
	 * @generated
	 */
	void setCodeSet(String value);

	/**
	 * Returns the value of the '<em><b>Identification Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufacturer's identifier for this SoftwareElement. Often this will be a stock keeping unit (SKU) or a part number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Code</em>' attribute.
	 * @see #setIdentificationCode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_IdentificationCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|SubComponent Software|001.6\"]'"
	 * @generated
	 */
	String getIdentificationCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getIdentificationCode <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Code</em>' attribute.
	 * @see #getIdentificationCode()
	 * @generated
	 */
	void setIdentificationCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property identifies the language edition of this SoftwareElement. The language codes defined in ISO 639 should be used. Where the element represents a multi-lingual or international version, the string "Multilingual" should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Edition</em>' attribute.
	 * @see #setLanguageEdition(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElement_LanguageEdition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32' MappingStrings='[\"MIF.DMTF|SubComponent Software|001.7\"]'"
	 * @generated
	 */
	String getLanguageEdition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElement#getLanguageEdition <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Edition</em>' attribute.
	 * @see #getLanguageEdition()
	 * @generated
	 */
	void setLanguageEdition(String value);

} // CIM_SoftwareElement
