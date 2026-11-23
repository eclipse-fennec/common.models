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

import org.dmtf.cim.CIM_FileExportCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Export Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getSupportedSynchronousMethods <em>Supported Synchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getSupportedAsynchronousMethods <em>Supported Asynchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileExportCapabilitiesImpl#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileExportCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileExportCapabilities {
	/**
	 * The cached value of the '{@link #getFileSharingProtocol() <em>File Sharing Protocol</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSharingProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> fileSharingProtocol;

	/**
	 * The cached value of the '{@link #getProtocolVersions() <em>Protocol Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> protocolVersions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousMethods() <em>Supported Synchronous Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousMethods;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousMethods() <em>Supported Asynchronous Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousMethods;

	/**
	 * The default value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_ENABLED_STATE_EDEFAULT = Integer.valueOf(8);

	/**
	 * The cached value of the '{@link #getInitialEnabledState() <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialEnabledState = INITIAL_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CA_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean caSupported = CA_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileExportCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileExportCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFileSharingProtocol() {
		if (fileSharingProtocol == null) {
			fileSharingProtocol = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__FILE_SHARING_PROTOCOL);
		}
		return fileSharingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProtocolVersions() {
		if (protocolVersions == null) {
			protocolVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__PROTOCOL_VERSIONS);
		}
		return protocolVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousMethods() {
		if (supportedSynchronousMethods == null) {
			supportedSynchronousMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS);
		}
		return supportedSynchronousMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousMethods() {
		if (supportedAsynchronousMethods == null) {
			supportedAsynchronousMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS);
		}
		return supportedAsynchronousMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialEnabledState() {
		return initialEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialEnabledState(Integer newInitialEnabledState) {
		Integer oldInitialEnabledState = initialEnabledState;
		initialEnabledState = newInitialEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__INITIAL_ENABLED_STATE, oldInitialEnabledState, initialEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCASupported() {
		return caSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCASupported(Boolean newCASupported) {
		Boolean oldCASupported = caSupported;
		caSupported = newCASupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_EXPORT_CAPABILITIES__CA_SUPPORTED, oldCASupported, caSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__FILE_SHARING_PROTOCOL:
				return getFileSharingProtocol();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__PROTOCOL_VERSIONS:
				return getProtocolVersions();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				return getSupportedSynchronousMethods();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				return getSupportedAsynchronousMethods();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__INITIAL_ENABLED_STATE:
				return getInitialEnabledState();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__CA_SUPPORTED:
				return getCASupported();
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
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__FILE_SHARING_PROTOCOL:
				getFileSharingProtocol().clear();
				getFileSharingProtocol().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				getProtocolVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				getSupportedSynchronousMethods().clear();
				getSupportedSynchronousMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				getSupportedAsynchronousMethods().clear();
				getSupportedAsynchronousMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__INITIAL_ENABLED_STATE:
				setInitialEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__CA_SUPPORTED:
				setCASupported((Boolean)newValue);
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
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__FILE_SHARING_PROTOCOL:
				getFileSharingProtocol().clear();
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				getSupportedSynchronousMethods().clear();
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				getSupportedAsynchronousMethods().clear();
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__INITIAL_ENABLED_STATE:
				setInitialEnabledState(INITIAL_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__CA_SUPPORTED:
				setCASupported(CA_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__FILE_SHARING_PROTOCOL:
				return fileSharingProtocol != null && !fileSharingProtocol.isEmpty();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__PROTOCOL_VERSIONS:
				return protocolVersions != null && !protocolVersions.isEmpty();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				return supportedSynchronousMethods != null && !supportedSynchronousMethods.isEmpty();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				return supportedAsynchronousMethods != null && !supportedAsynchronousMethods.isEmpty();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__INITIAL_ENABLED_STATE:
				return INITIAL_ENABLED_STATE_EDEFAULT == null ? initialEnabledState != null : !INITIAL_ENABLED_STATE_EDEFAULT.equals(initialEnabledState);
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES__CA_SUPPORTED:
				return CA_SUPPORTED_EDEFAULT == null ? caSupported != null : !CA_SUPPORTED_EDEFAULT.equals(caSupported);
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
		result.append(" (FileSharingProtocol: ");
		result.append(fileSharingProtocol);
		result.append(", ProtocolVersions: ");
		result.append(protocolVersions);
		result.append(", SupportedSynchronousMethods: ");
		result.append(supportedSynchronousMethods);
		result.append(", SupportedAsynchronousMethods: ");
		result.append(supportedAsynchronousMethods);
		result.append(", InitialEnabledState: ");
		result.append(initialEnabledState);
		result.append(", CASupported: ");
		result.append(caSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FileExportCapabilitiesImpl
