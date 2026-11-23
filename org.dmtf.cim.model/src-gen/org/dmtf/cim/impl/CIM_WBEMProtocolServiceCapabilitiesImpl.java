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

import org.dmtf.cim.CIM_WBEMProtocolServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM WBEM Protocol Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WBEMProtocolServiceCapabilitiesImpl#getWBEMProtocolVersionsSupported <em>WBEM Protocol Versions Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WBEMProtocolServiceCapabilitiesImpl#getGenericOperationCapabilities <em>Generic Operation Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WBEMProtocolServiceCapabilitiesImpl#getAuthenticationMechanismsSupported <em>Authentication Mechanisms Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WBEMProtocolServiceCapabilitiesImpl#getAuthenticationMechanismsDescriptions <em>Authentication Mechanisms Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WBEMProtocolServiceCapabilitiesImpl extends CIM_ProtocolServiceCapabilitiesImpl implements CIM_WBEMProtocolServiceCapabilities {
	/**
	 * The cached value of the '{@link #getWBEMProtocolVersionsSupported() <em>WBEM Protocol Versions Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBEMProtocolVersionsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> wbemProtocolVersionsSupported;

	/**
	 * The default value of the '{@link #getGenericOperationCapabilities() <em>Generic Operation Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericOperationCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_OPERATION_CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericOperationCapabilities() <em>Generic Operation Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericOperationCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String genericOperationCapabilities = GENERIC_OPERATION_CAPABILITIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthenticationMechanismsSupported() <em>Authentication Mechanisms Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanismsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> authenticationMechanismsSupported;

	/**
	 * The cached value of the '{@link #getAuthenticationMechanismsDescriptions() <em>Authentication Mechanisms Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMechanismsDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authenticationMechanismsDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WBEMProtocolServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WBEMProtocolServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWBEMProtocolVersionsSupported() {
		if (wbemProtocolVersionsSupported == null) {
			wbemProtocolVersionsSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__WBEM_PROTOCOL_VERSIONS_SUPPORTED);
		}
		return wbemProtocolVersionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenericOperationCapabilities() {
		return genericOperationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericOperationCapabilities(String newGenericOperationCapabilities) {
		String oldGenericOperationCapabilities = genericOperationCapabilities;
		genericOperationCapabilities = newGenericOperationCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__GENERIC_OPERATION_CAPABILITIES, oldGenericOperationCapabilities, genericOperationCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAuthenticationMechanismsSupported() {
		if (authenticationMechanismsSupported == null) {
			authenticationMechanismsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_SUPPORTED);
		}
		return authenticationMechanismsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAuthenticationMechanismsDescriptions() {
		if (authenticationMechanismsDescriptions == null) {
			authenticationMechanismsDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_DESCRIPTIONS);
		}
		return authenticationMechanismsDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__WBEM_PROTOCOL_VERSIONS_SUPPORTED:
				return getWBEMProtocolVersionsSupported();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__GENERIC_OPERATION_CAPABILITIES:
				return getGenericOperationCapabilities();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_SUPPORTED:
				return getAuthenticationMechanismsSupported();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_DESCRIPTIONS:
				return getAuthenticationMechanismsDescriptions();
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
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__WBEM_PROTOCOL_VERSIONS_SUPPORTED:
				getWBEMProtocolVersionsSupported().clear();
				getWBEMProtocolVersionsSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__GENERIC_OPERATION_CAPABILITIES:
				setGenericOperationCapabilities((String)newValue);
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_SUPPORTED:
				getAuthenticationMechanismsSupported().clear();
				getAuthenticationMechanismsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_DESCRIPTIONS:
				getAuthenticationMechanismsDescriptions().clear();
				getAuthenticationMechanismsDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__WBEM_PROTOCOL_VERSIONS_SUPPORTED:
				getWBEMProtocolVersionsSupported().clear();
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__GENERIC_OPERATION_CAPABILITIES:
				setGenericOperationCapabilities(GENERIC_OPERATION_CAPABILITIES_EDEFAULT);
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_SUPPORTED:
				getAuthenticationMechanismsSupported().clear();
				return;
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_DESCRIPTIONS:
				getAuthenticationMechanismsDescriptions().clear();
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
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__WBEM_PROTOCOL_VERSIONS_SUPPORTED:
				return wbemProtocolVersionsSupported != null && !wbemProtocolVersionsSupported.isEmpty();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__GENERIC_OPERATION_CAPABILITIES:
				return GENERIC_OPERATION_CAPABILITIES_EDEFAULT == null ? genericOperationCapabilities != null : !GENERIC_OPERATION_CAPABILITIES_EDEFAULT.equals(genericOperationCapabilities);
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_SUPPORTED:
				return authenticationMechanismsSupported != null && !authenticationMechanismsSupported.isEmpty();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES__AUTHENTICATION_MECHANISMS_DESCRIPTIONS:
				return authenticationMechanismsDescriptions != null && !authenticationMechanismsDescriptions.isEmpty();
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
		result.append(" (WBEMProtocolVersionsSupported: ");
		result.append(wbemProtocolVersionsSupported);
		result.append(", GenericOperationCapabilities: ");
		result.append(genericOperationCapabilities);
		result.append(", AuthenticationMechanismsSupported: ");
		result.append(authenticationMechanismsSupported);
		result.append(", AuthenticationMechanismsDescriptions: ");
		result.append(authenticationMechanismsDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_WBEMProtocolServiceCapabilitiesImpl
