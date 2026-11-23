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
 * A representation of the model object '<em><b>CIM Telnet Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A representation of a communications endpoint where a Telnet server can be accessed using the Telnet protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getEnabledTerminalModes <em>Enabled Terminal Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherEnabledTerminalMode <em>Other Enabled Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getTerminalMode <em>Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherTerminalMode <em>Other Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getEnabledCharacterDisplayModes <em>Enabled Character Display Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherEnabledCharacterDisplayMode <em>Other Enabled Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getCharacterDisplayMode <em>Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TelnetProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Enabled Terminal Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the terminal modes that are enabled for use in this server connection. Additional terminal modes may be supported by the service but not enabled for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Terminal Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_EnabledTerminalModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"VT100\",\"ANSI\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.OtherEnabledTerminalMode\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledTerminalModes();

	/**
	 * Returns the value of the '<em><b>Other Enabled Terminal Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EnabledTerminalModes property is set to 1, "Other" then free form string providing more information about supported terminal mode. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled Terminal Mode</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_OtherEnabledTerminalMode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.EnabledTerminalModes\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledTerminalMode();

	/**
	 * Returns the value of the '<em><b>Terminal Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The terminal mode in use for this Telnet endpoint.This value shall be one of the values in EnabledTerminalModes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminal Mode</em>' attribute.
	 * @see #setTerminalMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_TerminalMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"VT100\",\"ANSI\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.OtherTerminalMode\",\"CIM_TelnetProtocolEndpoint.EnabledTerminalModes\"]'"
	 * @generated
	 */
	Integer getTerminalMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getTerminalMode <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Mode</em>' attribute.
	 * @see #getTerminalMode()
	 * @generated
	 */
	void setTerminalMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Terminal Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the TerminalMode property contains a value of 1, "Other" then this is a free form string providing more information about the current terminal mode and this value shall be one of the values in OtherEnabledTerminalModes. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Terminal Mode</em>' attribute.
	 * @see #setOtherTerminalMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_OtherTerminalMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.TerminalMode\",\"CIM_TelnetProtocolEndpoint.OtherEnabledTerminalMode\"]'"
	 * @generated
	 */
	String getOtherTerminalMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherTerminalMode <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Terminal Mode</em>' attribute.
	 * @see #getOtherTerminalMode()
	 * @generated
	 */
	void setOtherTerminalMode(String value);

	/**
	 * Returns the value of the '<em><b>Enabled Character Display Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the character display modes enabled for the service. Additional character display modes may be supported but currently not enabled for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Character Display Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_EnabledCharacterDisplayModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Console\",\"Stream\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.OtherEnabledCharacterDisplayMode\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledCharacterDisplayModes();

	/**
	 * Returns the value of the '<em><b>Other Enabled Character Display Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the EnabledCharacterDisplayModes property is set to 1, "Other" then free form string providing more information about the enabled mode. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled Character Display Mode</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_OtherEnabledCharacterDisplayMode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.EnabledCharacterDisplayModes\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledCharacterDisplayMode();

	/**
	 * Returns the value of the '<em><b>Character Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The character display mode that is currently active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Character Display Mode</em>' attribute.
	 * @see #setCharacterDisplayMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_CharacterDisplayMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Console\",\"Stream\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.OtherCharacterDisplayMode\",\"CIM_TelnetProtocolEndpoint.EnabledCharacterDisplayModes\"]'"
	 * @generated
	 */
	Integer getCharacterDisplayMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getCharacterDisplayMode <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Display Mode</em>' attribute.
	 * @see #getCharacterDisplayMode()
	 * @generated
	 */
	void setCharacterDisplayMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Character Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the CharacterDisplayMode property is set to 1, "Other" then this is a free form string providing more information about the character display mode. If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Character Display Mode</em>' attribute.
	 * @see #setOtherCharacterDisplayMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_OtherCharacterDisplayMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_TelnetProtocolEndpoint.CharacterDisplayMode\",\"CIM_TelnetProtocolEndpoint.OtherEnabledCharacterDisplayMode\"]'"
	 * @generated
	 */
	String getOtherCharacterDisplayMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Character Display Mode</em>' attribute.
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 */
	void setOtherCharacterDisplayMode(String value);

	/**
	 * Returns the value of the '<em><b>Escape Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String indicating the Escape Character is in effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Escape Character</em>' attribute.
	 * @see #setEscapeCharacter(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_EscapeCharacter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getEscapeCharacter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getEscapeCharacter <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Character</em>' attribute.
	 * @see #getEscapeCharacter()
	 * @generated
	 */
	void setEscapeCharacter(String value);

	/**
	 * Returns the value of the '<em><b>Idle Timeout</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdleTimeout specifies how long the connection can be idle before it is closed. The default value, 0, indicates that there is no idle timeout period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Timeout</em>' attribute.
	 * @see #setIdleTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TelnetProtocolEndpoint_IdleTimeout()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getIdleTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TelnetProtocolEndpoint#getIdleTimeout <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout</em>' attribute.
	 * @see #getIdleTimeout()
	 * @generated
	 */
	void setIdleTimeout(Long value);

} // CIM_TelnetProtocolEndpoint
