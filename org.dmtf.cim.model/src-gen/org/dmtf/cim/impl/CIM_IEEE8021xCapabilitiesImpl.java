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

import org.dmtf.cim.CIM_IEEE8021xCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IEEE802 1x Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xCapabilitiesImpl#getSupportedAuthenticationProtocols <em>Supported Authentication Protocols</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xCapabilitiesImpl#getRoamingSupported <em>Roaming Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xCapabilitiesImpl#getFastRoamingSupported <em>Fast Roaming Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IEEE8021xCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_IEEE8021xCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedAuthenticationProtocols() <em>Supported Authentication Protocols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAuthenticationProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAuthenticationProtocols;

	/**
	 * The default value of the '{@link #getRoamingSupported() <em>Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoamingSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ROAMING_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoamingSupported() <em>Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoamingSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean roamingSupported = ROAMING_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFastRoamingSupported() <em>Fast Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastRoamingSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAST_ROAMING_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFastRoamingSupported() <em>Fast Roaming Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastRoamingSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean fastRoamingSupported = FAST_ROAMING_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IEEE8021xCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IEEE8021xCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAuthenticationProtocols() {
		if (supportedAuthenticationProtocols == null) {
			supportedAuthenticationProtocols = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IEEE802_1X_CAPABILITIES__SUPPORTED_AUTHENTICATION_PROTOCOLS);
		}
		return supportedAuthenticationProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRoamingSupported() {
		return roamingSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoamingSupported(Boolean newRoamingSupported) {
		Boolean oldRoamingSupported = roamingSupported;
		roamingSupported = newRoamingSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_CAPABILITIES__ROAMING_SUPPORTED, oldRoamingSupported, roamingSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFastRoamingSupported() {
		return fastRoamingSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFastRoamingSupported(Boolean newFastRoamingSupported) {
		Boolean oldFastRoamingSupported = fastRoamingSupported;
		fastRoamingSupported = newFastRoamingSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_CAPABILITIES__FAST_ROAMING_SUPPORTED, oldFastRoamingSupported, fastRoamingSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				return getSupportedAuthenticationProtocols();
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__ROAMING_SUPPORTED:
				return getRoamingSupported();
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__FAST_ROAMING_SUPPORTED:
				return getFastRoamingSupported();
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
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				getSupportedAuthenticationProtocols().clear();
				getSupportedAuthenticationProtocols().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__ROAMING_SUPPORTED:
				setRoamingSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__FAST_ROAMING_SUPPORTED:
				setFastRoamingSupported((Boolean)newValue);
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
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				getSupportedAuthenticationProtocols().clear();
				return;
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__ROAMING_SUPPORTED:
				setRoamingSupported(ROAMING_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__FAST_ROAMING_SUPPORTED:
				setFastRoamingSupported(FAST_ROAMING_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__SUPPORTED_AUTHENTICATION_PROTOCOLS:
				return supportedAuthenticationProtocols != null && !supportedAuthenticationProtocols.isEmpty();
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__ROAMING_SUPPORTED:
				return ROAMING_SUPPORTED_EDEFAULT == null ? roamingSupported != null : !ROAMING_SUPPORTED_EDEFAULT.equals(roamingSupported);
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES__FAST_ROAMING_SUPPORTED:
				return FAST_ROAMING_SUPPORTED_EDEFAULT == null ? fastRoamingSupported != null : !FAST_ROAMING_SUPPORTED_EDEFAULT.equals(fastRoamingSupported);
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
		result.append(" (SupportedAuthenticationProtocols: ");
		result.append(supportedAuthenticationProtocols);
		result.append(", RoamingSupported: ");
		result.append(roamingSupported);
		result.append(", FastRoamingSupported: ");
		result.append(fastRoamingSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_IEEE8021xCapabilitiesImpl
