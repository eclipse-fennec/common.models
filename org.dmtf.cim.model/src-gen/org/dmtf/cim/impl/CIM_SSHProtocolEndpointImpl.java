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

import org.dmtf.cim.CIM_SSHProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SSH Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getEnabledSSHVersions <em>Enabled SSH Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getSSHVersion <em>SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getOtherSSHVersion <em>Other SSH Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getOtherEncryptionAlgorithm <em>Other Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getIdleTimeout <em>Idle Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getKeepAlive <em>Keep Alive</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getForwardX11 <em>Forward X11</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SSHProtocolEndpointImpl#getCompression <em>Compression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SSHProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_SSHProtocolEndpoint {
	/**
	 * The cached value of the '{@link #getEnabledSSHVersions() <em>Enabled SSH Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledSSHVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledSSHVersions;

	/**
	 * The default value of the '{@link #getOtherEnabledSSHVersion() <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledSSHVersion() <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledSSHVersion = OTHER_ENABLED_SSH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSHVersion() <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSHVersion() <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer sshVersion = SSH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSSHVersion() <em>Other SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSSHVersion() <em>Other SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected String otherSSHVersion = OTHER_SSH_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnabledEncryptionAlgorithms() <em>Enabled Encryption Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledEncryptionAlgorithms;

	/**
	 * The cached value of the '{@link #getOtherEnabledEncryptionAlgorithm() <em>Other Enabled Encryption Algorithm</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEnabledEncryptionAlgorithm;

	/**
	 * The default value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer encryptionAlgorithm = ENCRYPTION_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherEncryptionAlgorithm() <em>Other Encryption Algorithm</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEncryptionAlgorithm;

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
	 * The default value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean KEEP_ALIVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected Boolean keepAlive = KEEP_ALIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForwardX11() <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardX11()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FORWARD_X11_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getForwardX11() <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardX11()
	 * @generated
	 * @ordered
	 */
	protected Boolean forwardX11 = FORWARD_X11_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPRESSION_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected Boolean compression = COMPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SSHProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SSHProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledSSHVersions() {
		if (enabledSSHVersions == null) {
			enabledSSHVersions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_SSH_VERSIONS);
		}
		return enabledSSHVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEnabledSSHVersion() {
		return otherEnabledSSHVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEnabledSSHVersion(String newOtherEnabledSSHVersion) {
		String oldOtherEnabledSSHVersion = otherEnabledSSHVersion;
		otherEnabledSSHVersion = newOtherEnabledSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_SSH_VERSION, oldOtherEnabledSSHVersion, otherEnabledSSHVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSHVersion() {
		return sshVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSHVersion(Integer newSSHVersion) {
		Integer oldSSHVersion = sshVersion;
		sshVersion = newSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__SSH_VERSION, oldSSHVersion, sshVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSSHVersion() {
		return otherSSHVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSSHVersion(String newOtherSSHVersion) {
		String oldOtherSSHVersion = otherSSHVersion;
		otherSSHVersion = newOtherSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_SSH_VERSION, oldOtherSSHVersion, otherSSHVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledEncryptionAlgorithms() {
		if (enabledEncryptionAlgorithms == null) {
			enabledEncryptionAlgorithms = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_ENCRYPTION_ALGORITHMS);
		}
		return enabledEncryptionAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEnabledEncryptionAlgorithm() {
		if (otherEnabledEncryptionAlgorithm == null) {
			otherEnabledEncryptionAlgorithm = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_ENCRYPTION_ALGORITHM);
		}
		return otherEnabledEncryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncryptionAlgorithm() {
		return encryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionAlgorithm(Integer newEncryptionAlgorithm) {
		Integer oldEncryptionAlgorithm = encryptionAlgorithm;
		encryptionAlgorithm = newEncryptionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENCRYPTION_ALGORITHM, oldEncryptionAlgorithm, encryptionAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEncryptionAlgorithm() {
		if (otherEncryptionAlgorithm == null) {
			otherEncryptionAlgorithm = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENCRYPTION_ALGORITHM);
		}
		return otherEncryptionAlgorithm;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__IDLE_TIMEOUT, oldIdleTimeout, idleTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getKeepAlive() {
		return keepAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepAlive(Boolean newKeepAlive) {
		Boolean oldKeepAlive = keepAlive;
		keepAlive = newKeepAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__KEEP_ALIVE, oldKeepAlive, keepAlive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForwardX11() {
		return forwardX11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForwardX11(Boolean newForwardX11) {
		Boolean oldForwardX11 = forwardX11;
		forwardX11 = newForwardX11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__FORWARD_X11, oldForwardX11, forwardX11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompression(Boolean newCompression) {
		Boolean oldCompression = compression;
		compression = newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_SSH_VERSIONS:
				return getEnabledSSHVersions();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_SSH_VERSION:
				return getOtherEnabledSSHVersion();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__SSH_VERSION:
				return getSSHVersion();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_SSH_VERSION:
				return getOtherSSHVersion();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_ENCRYPTION_ALGORITHMS:
				return getEnabledEncryptionAlgorithms();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				return getOtherEnabledEncryptionAlgorithm();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENCRYPTION_ALGORITHM:
				return getEncryptionAlgorithm();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENCRYPTION_ALGORITHM:
				return getOtherEncryptionAlgorithm();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				return getIdleTimeout();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return getKeepAlive();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__FORWARD_X11:
				return getForwardX11();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__COMPRESSION:
				return getCompression();
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
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_SSH_VERSIONS:
				getEnabledSSHVersions().clear();
				getEnabledSSHVersions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_SSH_VERSION:
				setOtherEnabledSSHVersion((String)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__SSH_VERSION:
				setSSHVersion((Integer)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_SSH_VERSION:
				setOtherSSHVersion((String)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_ENCRYPTION_ALGORITHMS:
				getEnabledEncryptionAlgorithms().clear();
				getEnabledEncryptionAlgorithms().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				getOtherEnabledEncryptionAlgorithm().clear();
				getOtherEnabledEncryptionAlgorithm().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENCRYPTION_ALGORITHM:
				getOtherEncryptionAlgorithm().clear();
				getOtherEncryptionAlgorithm().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				setIdleTimeout((Long)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive((Boolean)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__FORWARD_X11:
				setForwardX11((Boolean)newValue);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__COMPRESSION:
				setCompression((Boolean)newValue);
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
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_SSH_VERSIONS:
				getEnabledSSHVersions().clear();
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_SSH_VERSION:
				setOtherEnabledSSHVersion(OTHER_ENABLED_SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__SSH_VERSION:
				setSSHVersion(SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_SSH_VERSION:
				setOtherSSHVersion(OTHER_SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_ENCRYPTION_ALGORITHMS:
				getEnabledEncryptionAlgorithms().clear();
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				getOtherEnabledEncryptionAlgorithm().clear();
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm(ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENCRYPTION_ALGORITHM:
				getOtherEncryptionAlgorithm().clear();
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				setIdleTimeout(IDLE_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive(KEEP_ALIVE_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__FORWARD_X11:
				setForwardX11(FORWARD_X11_EDEFAULT);
				return;
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
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
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_SSH_VERSIONS:
				return enabledSSHVersions != null && !enabledSSHVersions.isEmpty();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_SSH_VERSION:
				return OTHER_ENABLED_SSH_VERSION_EDEFAULT == null ? otherEnabledSSHVersion != null : !OTHER_ENABLED_SSH_VERSION_EDEFAULT.equals(otherEnabledSSHVersion);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__SSH_VERSION:
				return SSH_VERSION_EDEFAULT == null ? sshVersion != null : !SSH_VERSION_EDEFAULT.equals(sshVersion);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_SSH_VERSION:
				return OTHER_SSH_VERSION_EDEFAULT == null ? otherSSHVersion != null : !OTHER_SSH_VERSION_EDEFAULT.equals(otherSSHVersion);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENABLED_ENCRYPTION_ALGORITHMS:
				return enabledEncryptionAlgorithms != null && !enabledEncryptionAlgorithms.isEmpty();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				return otherEnabledEncryptionAlgorithm != null && !otherEnabledEncryptionAlgorithm.isEmpty();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__ENCRYPTION_ALGORITHM:
				return ENCRYPTION_ALGORITHM_EDEFAULT == null ? encryptionAlgorithm != null : !ENCRYPTION_ALGORITHM_EDEFAULT.equals(encryptionAlgorithm);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__OTHER_ENCRYPTION_ALGORITHM:
				return otherEncryptionAlgorithm != null && !otherEncryptionAlgorithm.isEmpty();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__IDLE_TIMEOUT:
				return IDLE_TIMEOUT_EDEFAULT == null ? idleTimeout != null : !IDLE_TIMEOUT_EDEFAULT.equals(idleTimeout);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return KEEP_ALIVE_EDEFAULT == null ? keepAlive != null : !KEEP_ALIVE_EDEFAULT.equals(keepAlive);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__FORWARD_X11:
				return FORWARD_X11_EDEFAULT == null ? forwardX11 != null : !FORWARD_X11_EDEFAULT.equals(forwardX11);
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT__COMPRESSION:
				return COMPRESSION_EDEFAULT == null ? compression != null : !COMPRESSION_EDEFAULT.equals(compression);
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
		result.append(" (EnabledSSHVersions: ");
		result.append(enabledSSHVersions);
		result.append(", OtherEnabledSSHVersion: ");
		result.append(otherEnabledSSHVersion);
		result.append(", SSHVersion: ");
		result.append(sshVersion);
		result.append(", OtherSSHVersion: ");
		result.append(otherSSHVersion);
		result.append(", EnabledEncryptionAlgorithms: ");
		result.append(enabledEncryptionAlgorithms);
		result.append(", OtherEnabledEncryptionAlgorithm: ");
		result.append(otherEnabledEncryptionAlgorithm);
		result.append(", EncryptionAlgorithm: ");
		result.append(encryptionAlgorithm);
		result.append(", OtherEncryptionAlgorithm: ");
		result.append(otherEncryptionAlgorithm);
		result.append(", IdleTimeout: ");
		result.append(idleTimeout);
		result.append(", KeepAlive: ");
		result.append(keepAlive);
		result.append(", ForwardX11: ");
		result.append(forwardX11);
		result.append(", Compression: ");
		result.append(compression);
		result.append(')');
		return result.toString();
	}

} //CIM_SSHProtocolEndpointImpl
