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
 * A representation of the model object '<em><b>CIM Boot Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BootSettingData is a set of settings that apply to system boot. An example of usage of this class is to hold several BIOS, NVRAM, firmware or system settings, typically seen in the BIOS setup screens. These settings would need to be modified by the system as part of the boot process. Since, it is often not possible to intercept the boot process to apply these settings, users can set these a priori in the instance associated with the selected BootSourceSetting, thereby instructing the system to apply them during the next system reboot.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BootSettingData#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootSettingData()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.19.0' UMLPackagePath='CIM::System::Boot' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BootSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OwningEntity identifies the vendor or organization that defines the contained boot settings. In order to ensure uniqueness, the value of OwningEntity MUST be constructed using the following algorithm: 
	 * <OrgID>[:<LocalID>] 
	 * where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the entity creating/defining the BootSettingData, or is a registered ID that is assigned to the entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, <OrgID> MUST NOT contain a colon (':'). 
	 * <LocalID> is optional and, when used, MUST be unique within the scope of the <OrgID>. When a <LocalID> is present, a colon MUST appear between <OrgID> and <LocalID>. For DMTF defined instances, the algorithm MUST be used with the <OrgID> set to 'CIM'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Entity</em>' attribute.
	 * @see #setOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BootSettingData_OwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BootSettingData#getOwningEntity <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Entity</em>' attribute.
	 * @see #getOwningEntity()
	 * @generated
	 */
	void setOwningEntity(String value);

} // CIM_BootSettingData
