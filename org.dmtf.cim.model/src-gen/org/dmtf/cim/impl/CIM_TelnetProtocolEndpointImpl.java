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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_TelnetProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Telnet Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getEnabledTerminalModes <em>Enabled Terminal Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getOtherEnabledTerminalMode <em>Other Enabled Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getTerminalMode <em>Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getOtherTerminalMode <em>Other Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getEnabledCharacterDisplayModes <em>Enabled Character Display Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getOtherEnabledCharacterDisplayMode <em>Other Enabled Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getCharacterDisplayMode <em>Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetProtocolEndpointImpl#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TelnetProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_TelnetProtocolEndpoint {
	/**
	 * The cached value of the '{@link #getEnabledTerminalModes() <em>Enabled Terminal Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledTerminalModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledTerminalModes;

	/**
	 * The cached value of the '{@link #getOtherEnabledTerminalMode() <em>Other Enabled Terminal Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEnabledTerminalMode;

	/**
	 * The default value of the '{@link #getTerminalMode() <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TERMINAL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminalMode() <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected Integer terminalMode = TERMINAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTerminalMode() <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TERMINAL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTerminalMode() <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected String otherTerminalMode = OTHER_TERMINAL_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnabledCharacterDisplayModes() <em>Enabled Character Display Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCharacterDisplayModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledCharacterDisplayModes;

	/**
	 * The cached value of the '{@link #getOtherEnabledCharacterDisplayMode() <em>Other Enabled Character Display Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEnabledCharacterDisplayMode;

	/**
	 * The default value of the '{@link #getCharacterDisplayMode() <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARACTER_DISPLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterDisplayMode() <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected Integer characterDisplayMode = CHARACTER_DISPLAY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCharacterDisplayMode() <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCharacterDisplayMode() <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected String otherCharacterDisplayMode = OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected String escapeCharacter = ESCAPE_CHARACTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long IDLE_TIMEOUT_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long idleTimeout = IDLE_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TelnetProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TelnetProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledTerminalModes() {
		if (enabledTerminalModes == null) {
			enabledTerminalModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_TERMINAL_MODES);
		}
		return enabledTerminalModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEnabledTerminalMode() {
		if (otherEnabledTerminalMode == null) {
			otherEnabledTerminalMode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_TERMINAL_MODE);
		}
		return otherEnabledTerminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTerminalMode() {
		return terminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminalMode(Integer newTerminalMode) {
		Integer oldTerminalMode = terminalMode;
		terminalMode = newTerminalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__TERMINAL_MODE, oldTerminalMode, terminalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTerminalMode() {
		return otherTerminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTerminalMode(String newOtherTerminalMode) {
		String oldOtherTerminalMode = otherTerminalMode;
		otherTerminalMode = newOtherTerminalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_TERMINAL_MODE, oldOtherTerminalMode, otherTerminalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledCharacterDisplayModes() {
		if (enabledCharacterDisplayModes == null) {
			enabledCharacterDisplayModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_CHARACTER_DISPLAY_MODES);
		}
		return enabledCharacterDisplayModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEnabledCharacterDisplayMode() {
		if (otherEnabledCharacterDisplayMode == null) {
			otherEnabledCharacterDisplayMode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_CHARACTER_DISPLAY_MODE);
		}
		return otherEnabledCharacterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCharacterDisplayMode() {
		return characterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterDisplayMode(Integer newCharacterDisplayMode) {
		Integer oldCharacterDisplayMode = characterDisplayMode;
		characterDisplayMode = newCharacterDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__CHARACTER_DISPLAY_MODE, oldCharacterDisplayMode, characterDisplayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCharacterDisplayMode() {
		return otherCharacterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCharacterDisplayMode(String newOtherCharacterDisplayMode) {
		String oldOtherCharacterDisplayMode = otherCharacterDisplayMode;
		otherCharacterDisplayMode = newOtherCharacterDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_CHARACTER_DISPLAY_MODE, oldOtherCharacterDisplayMode, otherCharacterDisplayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscapeCharacter() {
		return escapeCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscapeCharacter(String newEscapeCharacter) {
		String oldEscapeCharacter = escapeCharacter;
		escapeCharacter = newEscapeCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ESCAPE_CHARACTER, oldEscapeCharacter, escapeCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIdleTimeout() {
		return idleTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdleTimeout(Long newIdleTimeout) {
		Long oldIdleTimeout = idleTimeout;
		idleTimeout = newIdleTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__IDLE_TIMEOUT, oldIdleTimeout, idleTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_TERMINAL_MODES:
				return getEnabledTerminalModes();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_TERMINAL_MODE:
				return getOtherEnabledTerminalMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__TERMINAL_MODE:
				return getTerminalMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_TERMINAL_MODE:
				return getOtherTerminalMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_CHARACTER_DISPLAY_MODES:
				return getEnabledCharacterDisplayModes();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				return getOtherEnabledCharacterDisplayMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__CHARACTER_DISPLAY_MODE:
				return getCharacterDisplayMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_CHARACTER_DISPLAY_MODE:
				return getOtherCharacterDisplayMode();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ESCAPE_CHARACTER:
				return getEscapeCharacter();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				return getIdleTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_TERMINAL_MODES:
				getEnabledTerminalModes().clear();
				getEnabledTerminalModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_TERMINAL_MODE:
				getOtherEnabledTerminalMode().clear();
				getOtherEnabledTerminalMode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__TERMINAL_MODE:
				setTerminalMode((Integer)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_TERMINAL_MODE:
				setOtherTerminalMode((String)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_CHARACTER_DISPLAY_MODES:
				getEnabledCharacterDisplayModes().clear();
				getEnabledCharacterDisplayModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				getOtherEnabledCharacterDisplayMode().clear();
				getOtherEnabledCharacterDisplayMode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__CHARACTER_DISPLAY_MODE:
				setCharacterDisplayMode((Integer)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_CHARACTER_DISPLAY_MODE:
				setOtherCharacterDisplayMode((String)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ESCAPE_CHARACTER:
				setEscapeCharacter((String)newValue);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				setIdleTimeout((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_TERMINAL_MODES:
				getEnabledTerminalModes().clear();
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_TERMINAL_MODE:
				getOtherEnabledTerminalMode().clear();
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__TERMINAL_MODE:
				setTerminalMode(TERMINAL_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_TERMINAL_MODE:
				setOtherTerminalMode(OTHER_TERMINAL_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_CHARACTER_DISPLAY_MODES:
				getEnabledCharacterDisplayModes().clear();
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				getOtherEnabledCharacterDisplayMode().clear();
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__CHARACTER_DISPLAY_MODE:
				setCharacterDisplayMode(CHARACTER_DISPLAY_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_CHARACTER_DISPLAY_MODE:
				setOtherCharacterDisplayMode(OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ESCAPE_CHARACTER:
				setEscapeCharacter(ESCAPE_CHARACTER_EDEFAULT);
				return;
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				setIdleTimeout(IDLE_TIMEOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_TERMINAL_MODES:
				return enabledTerminalModes != null && !enabledTerminalModes.isEmpty();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_TERMINAL_MODE:
				return otherEnabledTerminalMode != null && !otherEnabledTerminalMode.isEmpty();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__TERMINAL_MODE:
				return TERMINAL_MODE_EDEFAULT == null ? terminalMode != null : !TERMINAL_MODE_EDEFAULT.equals(terminalMode);
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_TERMINAL_MODE:
				return OTHER_TERMINAL_MODE_EDEFAULT == null ? otherTerminalMode != null : !OTHER_TERMINAL_MODE_EDEFAULT.equals(otherTerminalMode);
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ENABLED_CHARACTER_DISPLAY_MODES:
				return enabledCharacterDisplayModes != null && !enabledCharacterDisplayModes.isEmpty();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				return otherEnabledCharacterDisplayMode != null && !otherEnabledCharacterDisplayMode.isEmpty();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__CHARACTER_DISPLAY_MODE:
				return CHARACTER_DISPLAY_MODE_EDEFAULT == null ? characterDisplayMode != null : !CHARACTER_DISPLAY_MODE_EDEFAULT.equals(characterDisplayMode);
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__OTHER_CHARACTER_DISPLAY_MODE:
				return OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT == null ? otherCharacterDisplayMode != null : !OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT.equals(otherCharacterDisplayMode);
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__ESCAPE_CHARACTER:
				return ESCAPE_CHARACTER_EDEFAULT == null ? escapeCharacter != null : !ESCAPE_CHARACTER_EDEFAULT.equals(escapeCharacter);
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				return IDLE_TIMEOUT_EDEFAULT == null ? idleTimeout != null : !IDLE_TIMEOUT_EDEFAULT.equals(idleTimeout);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (EnabledTerminalModes: ");
		result.append(enabledTerminalModes);
		result.append(", OtherEnabledTerminalMode: ");
		result.append(otherEnabledTerminalMode);
		result.append(", TerminalMode: ");
		result.append(terminalMode);
		result.append(", OtherTerminalMode: ");
		result.append(otherTerminalMode);
		result.append(", EnabledCharacterDisplayModes: ");
		result.append(enabledCharacterDisplayModes);
		result.append(", OtherEnabledCharacterDisplayMode: ");
		result.append(otherEnabledCharacterDisplayMode);
		result.append(", CharacterDisplayMode: ");
		result.append(characterDisplayMode);
		result.append(", OtherCharacterDisplayMode: ");
		result.append(otherCharacterDisplayMode);
		result.append(", EscapeCharacter: ");
		result.append(escapeCharacter);
		result.append(", IdleTimeout: ");
		result.append(idleTimeout);
		result.append(')');
		return result.toString();
	}

} //CIM_TelnetProtocolEndpointImpl
