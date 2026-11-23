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
 * A representation of the model object '<em><b>CIM Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CIM_Check is a condition or characteristic that is expected to be true in an environment defined or scoped by an instance of a CIM_ComputerSystem. The Checks associated with a particular SoftwareElement are organized into one of two groups using the Phase property of the CIM_SoftwareElementChecks association. Conditions that are expected to be true when a SoftwareElement is in a particular state and environment are known as 'in-state' conditions. Conditions that need to be satisfied in order to transition the SoftwareElement to its next state are known as 'next-state' conditions. 
 * A CIM_ComputerSystem object represents the environment in which CIM_SoftwareElements are already deployed/installed or into which the elements will be deployed/installed. For the case in which an element is already installed, the CIM_InstalledSoftwareElement association identifies the CIM_ComputerSystem object that represents the "environment". When a SoftwareElement is being deployed for installation on a ComputerSystem, that system is the target of the Check and is identified using the TargetSystem reference of the InvokeOnSystem method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Check#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getCheckID <em>Check ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Check#getCheckMode <em>Check Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Check()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.55.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_Check extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name used to identify the SoftwareElement that is being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_SoftwareElement.Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_SoftwareElement.Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getVersion <em>Version</em>}' attribute.
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
	 * The SoftwareElementState of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element State</em>' attribute.
	 * @see #setSoftwareElementState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_SoftwareElementState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Deployable\",\"Installable\",\"Executable\",\"Running\"]' Propagated='CIM_SoftwareElement.SoftwareElementState'"
	 * @generated
	 */
	Integer getSoftwareElementState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getSoftwareElementState <em>Software Element State</em>}' attribute.
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
	 * This is an identifier for the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Element ID</em>' attribute.
	 * @see #setSoftwareElementID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_SoftwareElementID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_SoftwareElement.SoftwareElementID'"
	 * @generated
	 */
	String getSoftwareElementID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getSoftwareElementID <em>Software Element ID</em>}' attribute.
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
	 * The Target Operating System of the SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Operating System</em>' attribute.
	 * @see #setTargetOperatingSystem(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_TargetOperatingSystem()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' Propagated='CIM_SoftwareElement.TargetOperatingSystem'"
	 * @generated
	 */
	Integer getTargetOperatingSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getTargetOperatingSystem <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operating System</em>' attribute.
	 * @see #getTargetOperatingSystem()
	 * @generated
	 */
	void setTargetOperatingSystem(Integer value);

	/**
	 * Returns the value of the '<em><b>Check ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier used in conjunction with other keys to uniquely identify the Check.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check ID</em>' attribute.
	 * @see #setCheckID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_CheckID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCheckID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getCheckID <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check ID</em>' attribute.
	 * @see #getCheckID()
	 * @generated
	 */
	void setCheckID(String value);

	/**
	 * Returns the value of the '<em><b>Check Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CheckMode property is used to indicate whether the condition is expected to exist or not exist in the environment. When the value is True, the condition is expected to exist (e.g., a file is expected to be on a system), so the Invoke methods are expected to return True. When the value is False, the condition is not expected to exist (e.g., a file is not to be on a system), so the Invoke methods are expected to return False.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Mode</em>' attribute.
	 * @see #setCheckMode(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Check_CheckMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCheckMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Check#getCheckMode <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Mode</em>' attribute.
	 * @see #getCheckMode()
	 * @generated
	 */
	void setCheckMode(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Invoke method evaluates this Check. The details of the evaluation are described by the specific subclasses of CIM_Check. When the SoftwareElement being checked is already installed, the CIM_InstalledSoftwareElement association identifies the CIM_ComputerSystem in whose context the Invoke is executed. If this association is not in place, then the InvokeOnSystem method should be used - since it identifies the TargetSystem as an input parameter of the method. 
	 * The results of the Invoke method are based on the return value. A zero is returned if the condition is satisfied. A one is returned if the method is not supported. Any other value indicates the condition is not satisfied.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long Invoke();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InvokeOnSystem method evaluates this Check. The details of the evaluation are described by the specific subclasses of CIM_Check. The method's TargetSystem input parameter specifies the ComputerSystem in whose context the method is invoked. 
	 * The results of the InvokeOnSystem method are based on the return value. A zero is returned if the condition is satisfied. A one is returned if the method is not supported. Any other value indicates the condition is not satisfied.
	 * @param TargetSystem Reference to ComputerSystem in whose context the method is to be invoked.
	 * <!-- end-model-doc -->
	 * @model TargetSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long InvokeOnSystem(CIM_ComputerSystem TargetSystem);

} // CIM_Check
