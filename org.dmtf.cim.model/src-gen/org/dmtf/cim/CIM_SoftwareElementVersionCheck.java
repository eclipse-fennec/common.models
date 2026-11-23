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
 * A representation of the model object '<em><b>CIM Software Element Version Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SoftwareElementVersionCheck specifies the release of a SoftwareElement that must exist in the environment. This Check can be for a specific, minimum, maximum or a range of versions. To specify a specific version, the lower and upper versions must be the same. To specify a minimum, only the lower version needs to be defined. To specify a maximum version, only the upper version needs to be defined. To specify a range, both upper and lower versions need to be defined. The details of this Check are compared with the corresponding details found in a CIM_SoftwareElement object, associated to the CIM_ComputerSystem instance that describes the environment (related by the association, CIM_InstalledSoftwareElement). There should be at least one CIM_SoftwareElement that satisfies the details of the Check. In other words, all the SoftwareElements on the relevant computer system do not need to satisfy the Check.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getSoftwareElementName <em>Software Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getLowerSoftwareElementVersion <em>Lower Software Element Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getUpperSoftwareElementVersion <em>Upper Software Element Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getSoftwareElementStateDesired <em>Software Element State Desired</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getTargetOperatingSystemDesired <em>Target Operating System Desired</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElementVersionCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Software Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element Name</em>' attribute.
	 * @see #setSoftwareElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck_SoftwareElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_SoftwareElement.Name\"]'"
	 * @generated
	 */
	String getSoftwareElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getSoftwareElementName <em>Software Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element Name</em>' attribute.
	 * @see #getSoftwareElementName()
	 * @generated
	 */
	void setSoftwareElementName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Software Element Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum version of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Software Element Version</em>' attribute.
	 * @see #setLowerSoftwareElementVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck_LowerSoftwareElementVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_SoftwareElement.Version\"]'"
	 * @generated
	 */
	String getLowerSoftwareElementVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getLowerSoftwareElementVersion <em>Lower Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Software Element Version</em>' attribute.
	 * @see #getLowerSoftwareElementVersion()
	 * @generated
	 */
	void setLowerSoftwareElementVersion(String value);

	/**
	 * Returns the value of the '<em><b>Upper Software Element Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum version of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Software Element Version</em>' attribute.
	 * @see #setUpperSoftwareElementVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck_UpperSoftwareElementVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_SoftwareElement.Version\"]'"
	 * @generated
	 */
	String getUpperSoftwareElementVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getUpperSoftwareElementVersion <em>Upper Software Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Software Element Version</em>' attribute.
	 * @see #getUpperSoftwareElementVersion()
	 * @generated
	 */
	void setUpperSoftwareElementVersion(String value);

	/**
	 * Returns the value of the '<em><b>Software Element State Desired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element State Desired</em>' attribute.
	 * @see #setSoftwareElementStateDesired(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck_SoftwareElementStateDesired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Deployable\",\"Installable\",\"Executable\",\"Running\"]' ModelCorrespondence='[\"CIM_SoftwareElement.SoftwareElementState\"]'"
	 * @generated
	 */
	Integer getSoftwareElementStateDesired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getSoftwareElementStateDesired <em>Software Element State Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element State Desired</em>' attribute.
	 * @see #getSoftwareElementStateDesired()
	 * @generated
	 */
	void setSoftwareElementStateDesired(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Operating System Desired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target operating system of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Operating System Desired</em>' attribute.
	 * @see #setTargetOperatingSystemDesired(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementVersionCheck_TargetOperatingSystemDesired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' ModelCorrespondence='[\"CIM_SoftwareElement.TargetOperatingSystem\"]'"
	 * @generated
	 */
	Integer getTargetOperatingSystemDesired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementVersionCheck#getTargetOperatingSystemDesired <em>Target Operating System Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operating System Desired</em>' attribute.
	 * @see #getTargetOperatingSystemDesired()
	 * @generated
	 */
	void setTargetOperatingSystemDesired(Integer value);

} // CIM_SoftwareElementVersionCheck
