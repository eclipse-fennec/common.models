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
 * A representation of the model object '<em><b>CIM Setting Associated To Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines settings that can be used to create or modify elements. Unlike ElementSettingData, these settings are not used to express the characteristics of existing managed elements. 
 * Typically, the capabilities associated with this class define the characteristics of a service in creating or modifying elements that are dependent on the service directly or indirectly. A CIM Client may use this association to find SettingData instances that can be used to create or modify these dependent elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SettingAssociatedToCapabilities#getDefaultSetting <em>Default Setting</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingAssociatedToCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.11.0' UMLPackagePath='CIM::System::FilesystemServices' override.Antecedent='CIM_Capabilities REF' override.Antecedent.Description='The Capabilities.' override.Dependent='CIM_SettingData REF' override.Dependent.Description='The Setting.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SettingAssociatedToCapabilities extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Default Setting</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element whose characteristics are described by the associated Capabilities instance has a dependent element created or modified without specifying an associated SettingData instance, then the default SettingData will be used in that operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Setting</em>' attribute.
	 * @see #setDefaultSetting(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingAssociatedToCapabilities_DefaultSetting()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getDefaultSetting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingAssociatedToCapabilities#getDefaultSetting <em>Default Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Setting</em>' attribute.
	 * @see #getDefaultSetting()
	 * @generated
	 */
	void setDefaultSetting(Boolean value);

} // CIM_SettingAssociatedToCapabilities
