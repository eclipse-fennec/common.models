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

import org.dmtf.cim.CIM_DHCPCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DHCP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPCapabilitiesImpl#getOptionsSupported <em>Options Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPCapabilitiesImpl#getIPv6OptionsSupported <em>IPv6 Options Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DHCPCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_DHCPCapabilities {
	/**
	 * The cached value of the '{@link #getOptionsSupported() <em>Options Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> optionsSupported;

	/**
	 * The cached value of the '{@link #getIPv6OptionsSupported() <em>IPv6 Options Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6OptionsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> iPv6OptionsSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DHCPCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DHCPCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOptionsSupported() {
		if (optionsSupported == null) {
			optionsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DHCP_CAPABILITIES__OPTIONS_SUPPORTED);
		}
		return optionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIPv6OptionsSupported() {
		if (iPv6OptionsSupported == null) {
			iPv6OptionsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DHCP_CAPABILITIES__IPV6_OPTIONS_SUPPORTED);
		}
		return iPv6OptionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				return getOptionsSupported();
			case CimPackage.CIM_DHCP_CAPABILITIES__IPV6_OPTIONS_SUPPORTED:
				return getIPv6OptionsSupported();
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
			case CimPackage.CIM_DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				getOptionsSupported().clear();
				getOptionsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DHCP_CAPABILITIES__IPV6_OPTIONS_SUPPORTED:
				getIPv6OptionsSupported().clear();
				getIPv6OptionsSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				getOptionsSupported().clear();
				return;
			case CimPackage.CIM_DHCP_CAPABILITIES__IPV6_OPTIONS_SUPPORTED:
				getIPv6OptionsSupported().clear();
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
			case CimPackage.CIM_DHCP_CAPABILITIES__OPTIONS_SUPPORTED:
				return optionsSupported != null && !optionsSupported.isEmpty();
			case CimPackage.CIM_DHCP_CAPABILITIES__IPV6_OPTIONS_SUPPORTED:
				return iPv6OptionsSupported != null && !iPv6OptionsSupported.isEmpty();
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
		result.append(" (OptionsSupported: ");
		result.append(optionsSupported);
		result.append(", IPv6OptionsSupported: ");
		result.append(iPv6OptionsSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_DHCPCapabilitiesImpl
