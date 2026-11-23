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

import org.dmtf.cim.CIM_TelnetCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Telnet Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetCapabilitiesImpl#getSupportedTerminalModes <em>Supported Terminal Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetCapabilitiesImpl#getOtherSupportedTerminalMode <em>Other Supported Terminal Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetCapabilitiesImpl#getSupportedCharacterDisplayModes <em>Supported Character Display Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TelnetCapabilitiesImpl#getOtherSupportedCharacterDisplayMode <em>Other Supported Character Display Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TelnetCapabilitiesImpl extends CIM_ProtocolServiceCapabilitiesImpl implements CIM_TelnetCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedTerminalModes() <em>Supported Terminal Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTerminalModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedTerminalModes;

	/**
	 * The cached value of the '{@link #getOtherSupportedTerminalMode() <em>Other Supported Terminal Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedTerminalMode;

	/**
	 * The cached value of the '{@link #getSupportedCharacterDisplayModes() <em>Supported Character Display Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCharacterDisplayModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCharacterDisplayModes;

	/**
	 * The cached value of the '{@link #getOtherSupportedCharacterDisplayMode() <em>Other Supported Character Display Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedCharacterDisplayMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TelnetCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TelnetCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedTerminalModes() {
		if (supportedTerminalModes == null) {
			supportedTerminalModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_TERMINAL_MODES);
		}
		return supportedTerminalModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedTerminalMode() {
		if (otherSupportedTerminalMode == null) {
			otherSupportedTerminalMode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_TERMINAL_MODE);
		}
		return otherSupportedTerminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCharacterDisplayModes() {
		if (supportedCharacterDisplayModes == null) {
			supportedCharacterDisplayModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_CHARACTER_DISPLAY_MODES);
		}
		return supportedCharacterDisplayModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedCharacterDisplayMode() {
		if (otherSupportedCharacterDisplayMode == null) {
			otherSupportedCharacterDisplayMode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_CHARACTER_DISPLAY_MODE);
		}
		return otherSupportedCharacterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_TERMINAL_MODES:
				return getSupportedTerminalModes();
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_TERMINAL_MODE:
				return getOtherSupportedTerminalMode();
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_CHARACTER_DISPLAY_MODES:
				return getSupportedCharacterDisplayModes();
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_CHARACTER_DISPLAY_MODE:
				return getOtherSupportedCharacterDisplayMode();
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
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_TERMINAL_MODES:
				getSupportedTerminalModes().clear();
				getSupportedTerminalModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_TERMINAL_MODE:
				getOtherSupportedTerminalMode().clear();
				getOtherSupportedTerminalMode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_CHARACTER_DISPLAY_MODES:
				getSupportedCharacterDisplayModes().clear();
				getSupportedCharacterDisplayModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_CHARACTER_DISPLAY_MODE:
				getOtherSupportedCharacterDisplayMode().clear();
				getOtherSupportedCharacterDisplayMode().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_TERMINAL_MODES:
				getSupportedTerminalModes().clear();
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_TERMINAL_MODE:
				getOtherSupportedTerminalMode().clear();
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_CHARACTER_DISPLAY_MODES:
				getSupportedCharacterDisplayModes().clear();
				return;
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_CHARACTER_DISPLAY_MODE:
				getOtherSupportedCharacterDisplayMode().clear();
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
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_TERMINAL_MODES:
				return supportedTerminalModes != null && !supportedTerminalModes.isEmpty();
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_TERMINAL_MODE:
				return otherSupportedTerminalMode != null && !otherSupportedTerminalMode.isEmpty();
			case CimPackage.CIM_TELNET_CAPABILITIES__SUPPORTED_CHARACTER_DISPLAY_MODES:
				return supportedCharacterDisplayModes != null && !supportedCharacterDisplayModes.isEmpty();
			case CimPackage.CIM_TELNET_CAPABILITIES__OTHER_SUPPORTED_CHARACTER_DISPLAY_MODE:
				return otherSupportedCharacterDisplayMode != null && !otherSupportedCharacterDisplayMode.isEmpty();
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
		result.append(" (SupportedTerminalModes: ");
		result.append(supportedTerminalModes);
		result.append(", OtherSupportedTerminalMode: ");
		result.append(otherSupportedTerminalMode);
		result.append(", SupportedCharacterDisplayModes: ");
		result.append(supportedCharacterDisplayModes);
		result.append(", OtherSupportedCharacterDisplayMode: ");
		result.append(otherSupportedCharacterDisplayMode);
		result.append(')');
		return result.toString();
	}

} //CIM_TelnetCapabilitiesImpl
