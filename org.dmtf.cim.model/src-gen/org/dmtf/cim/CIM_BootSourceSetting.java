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
 * A representation of the model object '<em><b>CIM Boot Source Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from SettingData that provides the information necessary to describe a boot source. This may be optionally associated to a bootable logical device, such as a hard disk partition, or a network device. The information from this class instance is used by the boot manager, such as BIOS/EFI or OS Loader to initiate the boot process, when this instance appears in a BootConfigSetting collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BootSourceSetting#getBootString <em>Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootSourceSetting#getBIOSBootString <em>BIOS Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootSourceSetting#getStructuredBootString <em>Structured Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootSourceSetting#getFailThroughSupported <em>Fail Through Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootSourceSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::System::Boot' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BootSourceSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Boot String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string identifying the boot source. It is typically used by the instrumentation to pass to the boot manager as a selection string. This could be a string identifying the bootable device, such as "CDROM 1", or could be an implementation specific address of a bootable partition, such as the following. "fd(64)unix root=hd(40) swap=hd(41)", or "multi(0)disk(0)rdisk(0)partition(1)\WINDOWS="Microsoft Windows XP Professional"".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot String</em>' attribute.
	 * @see #setBootString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BootSourceSetting_BootString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getBootString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BootSourceSetting#getBootString <em>Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot String</em>' attribute.
	 * @see #getBootString()
	 * @generated
	 */
	void setBootString(String value);

	/**
	 * Returns the value of the '<em><b>BIOS Boot String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string identifying the boot source which corresponds to the string used by the BIOS to uniquely name the boot source. For example, in systems which implement the BIOS Boot Specification, the string could correspond to the descString string for entries in the IPL Table or BCV Table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BIOS Boot String</em>' attribute.
	 * @see #setBIOSBootString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BootSourceSetting_BIOSBootString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getBIOSBootString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BootSourceSetting#getBIOSBootString <em>BIOS Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIOS Boot String</em>' attribute.
	 * @see #getBIOSBootString()
	 * @generated
	 */
	void setBIOSBootString(String value);

	/**
	 * Returns the value of the '<em><b>Structured Boot String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string identifying the boot source using the format "<OrgID>:<identifier>:<index>", in which neither <OrgID>, <identifier> or <index> contains a colon (":"). The value of <OrgID> is a copyrighted, trademarked or otherwise unique name that is owned by the entity defining the <identifier>, or is a registered ID that is assigned to the entity by a recognized global authority. For DMTF defined identifiers, the <OrgID> is set to 'CIM'. The <identifiers> are "Floppy", "Hard-Disk", "CD/DVD", "Network", "PCMCIA", "USB". The value of <index> shall be a non-zero integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Boot String</em>' attribute.
	 * @see #setStructuredBootString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BootSourceSetting_StructuredBootString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getStructuredBootString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BootSourceSetting#getStructuredBootString <em>Structured Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Boot String</em>' attribute.
	 * @see #getStructuredBootString()
	 * @generated
	 */
	void setStructuredBootString(String value);

	/**
	 * Returns the value of the '<em><b>Fail Through Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the behavior when the attempt to boot using the boot source fails (no media, timeout). The current values in the enumeration are: 
	 * 0 = Unknown 
	 * 1 = Is Supported 
	 * 2 = Is Not Supported. 
	 * A value of 1 (Is Supported) indicates that next boot source the boot order is used. A value of 2 (Is Not Supported) indicates that the boot order is terminated and no other boot sources associated to the same CIM_BootConfigSetting are used). The default is 1 (Is Supported)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fail Through Supported</em>' attribute.
	 * @see #setFailThroughSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BootSourceSetting_FailThroughSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Is Supported\",\"Not Supported\"]'"
	 * @generated
	 */
	Integer getFailThroughSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BootSourceSetting#getFailThroughSupported <em>Fail Through Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Through Supported</em>' attribute.
	 * @see #getFailThroughSupported()
	 * @generated
	 */
	void setFailThroughSupported(Integer value);

} // CIM_BootSourceSetting
