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
 * A representation of the model object '<em><b>CIM Telnet Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of ProtocolServiceCapabilities that defines the capabilities of a Telnet Service. An instance of TelnetCapabilities is associated with the ProtocolService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TelnetCapabilities#getSupportedTerminalModes <em>Supported Terminal Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetCapabilities#getOtherSupportedTerminalMode <em>Other Supported Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetCapabilities#getSupportedCharacterDisplayModes <em>Supported Character Display Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetCapabilities#getOtherSupportedCharacterDisplayMode <em>Other Supported Character Display Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TelnetCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TelnetCapabilities extends CIM_ProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Terminal Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the terminal modes that the service supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Terminal Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetCapabilities_SupportedTerminalModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"VT100\",\"ANSI\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetCapabilities.OtherSupportedTerminalMode\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedTerminalModes();

	/**
	 * Returns the value of the '<em><b>Other Supported Terminal Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SupportedTerminalModes property is set to 1, "Other" then free form string providing more information about supported terminal modes. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Terminal Mode</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetCapabilities_OtherSupportedTerminalMode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetCapabilities.SupportedTerminalModes\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedTerminalMode();

	/**
	 * Returns the value of the '<em><b>Supported Character Display Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the Character display modes supported by the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Character Display Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetCapabilities_SupportedCharacterDisplayModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Console\",\"Stream\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetCapabilities.OtherSupportedCharacterDisplayMode\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCharacterDisplayModes();

	/**
	 * Returns the value of the '<em><b>Other Supported Character Display Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SupportedCharacterDisplayModes property is set to 1 "Other" then free form string providing more information about the supported modes. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Character Display Mode</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetCapabilities_OtherSupportedCharacterDisplayMode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetCapabilities.SupportedCharacterDisplayModes\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedCharacterDisplayMode();

} // CIM_TelnetCapabilities
