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
 * A representation of the model object '<em><b>CIM Localization Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated to avoid conflicts with localization implementations using CIM/XML over HTTP protocol, the preferred mechanism. 
 * Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LocalizationCapabilities#getSupportedInputLocales <em>Supported Input Locales</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocalizationCapabilities#getSupportedOutputLocales <em>Supported Output Locales</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocalizationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Version='2.11.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LocalizationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Input Locales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
	 * A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 
	 * 
	 * The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
	 * Each array entry consists of three sub-strings, separated by underscores: 
	 * - The first sub-string is the language code, as specified in ISO639. 
	 * - The second sub-string is the country code, as specified in ISO3166. 
	 * - The third sub-string is a variant, which is vendor specific. 
	 * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
	 * The language and country codes are required; the variant may be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Input Locales</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalizationCapabilities_SupportedInputLocales()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getSupportedInputLocales();

	/**
	 * Returns the value of the '<em><b>Supported Output Locales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
	 * A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 
	 * 
	 * The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutput Locales property is empty, it is assumed that the default locale is en_US (English). 
	 * Each array entry consists of three sub-strings, separated by underscores: 
	 * - The first sub-string is the language code, as specified in ISO639. 
	 * - The second sub-string is the country code, as specified in ISO3166. 
	 * - The third sub-string is a variant, which is vendor specific. 
	 * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
	 * The language and country codes are required; the variant may be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Output Locales</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocalizationCapabilities_SupportedOutputLocales()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getSupportedOutputLocales();

} // CIM_LocalizationCapabilities
