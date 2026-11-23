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

import org.dmtf.cim.CIM_SSHCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SSH Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHCapabilitiesImpl#getSupportedSSHVersions <em>Supported SSH Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHCapabilitiesImpl#getOtherSupportedSSHVersion <em>Other Supported SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHCapabilitiesImpl#getSupportedEncryptionAlgorithms <em>Supported Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHCapabilitiesImpl#getOtherSupportedEncryptionAlgorithm <em>Other Supported Encryption Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SSHCapabilitiesImpl extends CIM_ProtocolServiceCapabilitiesImpl implements CIM_SSHCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedSSHVersions() <em>Supported SSH Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSSHVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSSHVersions;

	/**
	 * The default value of the '{@link #getOtherSupportedSSHVersion() <em>Other Supported SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SUPPORTED_SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSupportedSSHVersion() <em>Other Supported SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected String otherSupportedSSHVersion = OTHER_SUPPORTED_SSH_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedEncryptionAlgorithms() <em>Supported Encryption Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedEncryptionAlgorithms;

	/**
	 * The default value of the '{@link #getOtherSupportedEncryptionAlgorithm() <em>Other Supported Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SUPPORTED_ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSupportedEncryptionAlgorithm() <em>Other Supported Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherSupportedEncryptionAlgorithm = OTHER_SUPPORTED_ENCRYPTION_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SSHCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SSHCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSSHVersions() {
		if (supportedSSHVersions == null) {
			supportedSSHVersions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_SSH_VERSIONS);
		}
		return supportedSSHVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSupportedSSHVersion() {
		return otherSupportedSSHVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSupportedSSHVersion(String newOtherSupportedSSHVersion) {
		String oldOtherSupportedSSHVersion = otherSupportedSSHVersion;
		otherSupportedSSHVersion = newOtherSupportedSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_SSH_VERSION, oldOtherSupportedSSHVersion, otherSupportedSSHVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedEncryptionAlgorithms() {
		if (supportedEncryptionAlgorithms == null) {
			supportedEncryptionAlgorithms = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_ENCRYPTION_ALGORITHMS);
		}
		return supportedEncryptionAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSupportedEncryptionAlgorithm() {
		return otherSupportedEncryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSupportedEncryptionAlgorithm(String newOtherSupportedEncryptionAlgorithm) {
		String oldOtherSupportedEncryptionAlgorithm = otherSupportedEncryptionAlgorithm;
		otherSupportedEncryptionAlgorithm = newOtherSupportedEncryptionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_ALGORITHM, oldOtherSupportedEncryptionAlgorithm, otherSupportedEncryptionAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_SSH_VERSIONS:
				return getSupportedSSHVersions();
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_SSH_VERSION:
				return getOtherSupportedSSHVersion();
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_ENCRYPTION_ALGORITHMS:
				return getSupportedEncryptionAlgorithms();
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_ALGORITHM:
				return getOtherSupportedEncryptionAlgorithm();
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
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_SSH_VERSIONS:
				getSupportedSSHVersions().clear();
				getSupportedSSHVersions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_SSH_VERSION:
				setOtherSupportedSSHVersion((String)newValue);
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_ENCRYPTION_ALGORITHMS:
				getSupportedEncryptionAlgorithms().clear();
				getSupportedEncryptionAlgorithms().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_ALGORITHM:
				setOtherSupportedEncryptionAlgorithm((String)newValue);
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
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_SSH_VERSIONS:
				getSupportedSSHVersions().clear();
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_SSH_VERSION:
				setOtherSupportedSSHVersion(OTHER_SUPPORTED_SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_ENCRYPTION_ALGORITHMS:
				getSupportedEncryptionAlgorithms().clear();
				return;
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_ALGORITHM:
				setOtherSupportedEncryptionAlgorithm(OTHER_SUPPORTED_ENCRYPTION_ALGORITHM_EDEFAULT);
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
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_SSH_VERSIONS:
				return supportedSSHVersions != null && !supportedSSHVersions.isEmpty();
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_SSH_VERSION:
				return OTHER_SUPPORTED_SSH_VERSION_EDEFAULT == null ? otherSupportedSSHVersion != null : !OTHER_SUPPORTED_SSH_VERSION_EDEFAULT.equals(otherSupportedSSHVersion);
			case CimPackage.CIM_SSH_CAPABILITIES__SUPPORTED_ENCRYPTION_ALGORITHMS:
				return supportedEncryptionAlgorithms != null && !supportedEncryptionAlgorithms.isEmpty();
			case CimPackage.CIM_SSH_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_ALGORITHM:
				return OTHER_SUPPORTED_ENCRYPTION_ALGORITHM_EDEFAULT == null ? otherSupportedEncryptionAlgorithm != null : !OTHER_SUPPORTED_ENCRYPTION_ALGORITHM_EDEFAULT.equals(otherSupportedEncryptionAlgorithm);
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
		result.append(" (SupportedSSHVersions: ");
		result.append(supportedSSHVersions);
		result.append(", OtherSupportedSSHVersion: ");
		result.append(otherSupportedSSHVersion);
		result.append(", SupportedEncryptionAlgorithms: ");
		result.append(supportedEncryptionAlgorithms);
		result.append(", OtherSupportedEncryptionAlgorithm: ");
		result.append(otherSupportedEncryptionAlgorithm);
		result.append(')');
		return result.toString();
	}

} //CIM_SSHCapabilitiesImpl
