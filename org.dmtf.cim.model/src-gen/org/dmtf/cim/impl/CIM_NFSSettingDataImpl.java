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

import org.dmtf.cim.CIM_NFSSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM NFS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getMaximumTCPConnections <em>Maximum TCP Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getNonNFSuid <em>Non NF Suid</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getNonNFSgid <em>Non NF Sgid</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getUseReservedPorts <em>Use Reserved Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NFSSettingDataImpl#getOnlyRootChown <em>Only Root Chown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NFSSettingDataImpl extends CIM_SettingDataImpl implements CIM_NFSSettingData {
	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARSET_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected Integer charset = CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumTCPConnections() <em>Maximum TCP Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTCPConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_TCP_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumTCPConnections() <em>Maximum TCP Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTCPConnections()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumTCPConnections = MAXIMUM_TCP_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_EDEFAULT = Integer.valueOf(2049);

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Integer port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonNFSuid() <em>Non NF Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonNFSuid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NON_NF_SUID_EDEFAULT = Integer.valueOf(-1);

	/**
	 * The cached value of the '{@link #getNonNFSuid() <em>Non NF Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonNFSuid()
	 * @generated
	 * @ordered
	 */
	protected Integer nonNFSuid = NON_NF_SUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonNFSgid() <em>Non NF Sgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonNFSgid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NON_NF_SGID_EDEFAULT = Integer.valueOf(-1);

	/**
	 * The cached value of the '{@link #getNonNFSgid() <em>Non NF Sgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonNFSgid()
	 * @generated
	 * @ordered
	 */
	protected Integer nonNFSgid = NON_NF_SGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseReservedPorts() <em>Use Reserved Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReservedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_RESERVED_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseReservedPorts() <em>Use Reserved Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReservedPorts()
	 * @generated
	 * @ordered
	 */
	protected Boolean useReservedPorts = USE_RESERVED_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlyRootChown() <em>Only Root Chown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyRootChown()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_ROOT_CHOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlyRootChown() <em>Only Root Chown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyRootChown()
	 * @generated
	 * @ordered
	 */
	protected Boolean onlyRootChown = ONLY_ROOT_CHOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NFSSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NFSSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharset(Integer newCharset) {
		Integer oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__CHARSET, oldCharset, charset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumTCPConnections() {
		return maximumTCPConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumTCPConnections(Integer newMaximumTCPConnections) {
		Integer oldMaximumTCPConnections = maximumTCPConnections;
		maximumTCPConnections = newMaximumTCPConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__MAXIMUM_TCP_CONNECTIONS, oldMaximumTCPConnections, maximumTCPConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(Integer newPort) {
		Integer oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNonNFSuid() {
		return nonNFSuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonNFSuid(Integer newNonNFSuid) {
		Integer oldNonNFSuid = nonNFSuid;
		nonNFSuid = newNonNFSuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SUID, oldNonNFSuid, nonNFSuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNonNFSgid() {
		return nonNFSgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonNFSgid(Integer newNonNFSgid) {
		Integer oldNonNFSgid = nonNFSgid;
		nonNFSgid = newNonNFSgid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SGID, oldNonNFSgid, nonNFSgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseReservedPorts() {
		return useReservedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseReservedPorts(Boolean newUseReservedPorts) {
		Boolean oldUseReservedPorts = useReservedPorts;
		useReservedPorts = newUseReservedPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__USE_RESERVED_PORTS, oldUseReservedPorts, useReservedPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlyRootChown() {
		return onlyRootChown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlyRootChown(Boolean newOnlyRootChown) {
		Boolean oldOnlyRootChown = onlyRootChown;
		onlyRootChown = newOnlyRootChown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NFS_SETTING_DATA__ONLY_ROOT_CHOWN, oldOnlyRootChown, onlyRootChown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NFS_SETTING_DATA__ENABLED:
				return getEnabled();
			case CimPackage.CIM_NFS_SETTING_DATA__CHARSET:
				return getCharset();
			case CimPackage.CIM_NFS_SETTING_DATA__MAXIMUM_TCP_CONNECTIONS:
				return getMaximumTCPConnections();
			case CimPackage.CIM_NFS_SETTING_DATA__PORT:
				return getPort();
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SUID:
				return getNonNFSuid();
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SGID:
				return getNonNFSgid();
			case CimPackage.CIM_NFS_SETTING_DATA__USE_RESERVED_PORTS:
				return getUseReservedPorts();
			case CimPackage.CIM_NFS_SETTING_DATA__ONLY_ROOT_CHOWN:
				return getOnlyRootChown();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_NFS_SETTING_DATA__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__CHARSET:
				setCharset((Integer)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__MAXIMUM_TCP_CONNECTIONS:
				setMaximumTCPConnections((Integer)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__PORT:
				setPort((Integer)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SUID:
				setNonNFSuid((Integer)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SGID:
				setNonNFSgid((Integer)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__USE_RESERVED_PORTS:
				setUseReservedPorts((Boolean)newValue);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__ONLY_ROOT_CHOWN:
				setOnlyRootChown((Boolean)newValue);
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
			case CimPackage.CIM_NFS_SETTING_DATA__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__MAXIMUM_TCP_CONNECTIONS:
				setMaximumTCPConnections(MAXIMUM_TCP_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SUID:
				setNonNFSuid(NON_NF_SUID_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SGID:
				setNonNFSgid(NON_NF_SGID_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__USE_RESERVED_PORTS:
				setUseReservedPorts(USE_RESERVED_PORTS_EDEFAULT);
				return;
			case CimPackage.CIM_NFS_SETTING_DATA__ONLY_ROOT_CHOWN:
				setOnlyRootChown(ONLY_ROOT_CHOWN_EDEFAULT);
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
			case CimPackage.CIM_NFS_SETTING_DATA__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case CimPackage.CIM_NFS_SETTING_DATA__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case CimPackage.CIM_NFS_SETTING_DATA__MAXIMUM_TCP_CONNECTIONS:
				return MAXIMUM_TCP_CONNECTIONS_EDEFAULT == null ? maximumTCPConnections != null : !MAXIMUM_TCP_CONNECTIONS_EDEFAULT.equals(maximumTCPConnections);
			case CimPackage.CIM_NFS_SETTING_DATA__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SUID:
				return NON_NF_SUID_EDEFAULT == null ? nonNFSuid != null : !NON_NF_SUID_EDEFAULT.equals(nonNFSuid);
			case CimPackage.CIM_NFS_SETTING_DATA__NON_NF_SGID:
				return NON_NF_SGID_EDEFAULT == null ? nonNFSgid != null : !NON_NF_SGID_EDEFAULT.equals(nonNFSgid);
			case CimPackage.CIM_NFS_SETTING_DATA__USE_RESERVED_PORTS:
				return USE_RESERVED_PORTS_EDEFAULT == null ? useReservedPorts != null : !USE_RESERVED_PORTS_EDEFAULT.equals(useReservedPorts);
			case CimPackage.CIM_NFS_SETTING_DATA__ONLY_ROOT_CHOWN:
				return ONLY_ROOT_CHOWN_EDEFAULT == null ? onlyRootChown != null : !ONLY_ROOT_CHOWN_EDEFAULT.equals(onlyRootChown);
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
		result.append(" (Enabled: ");
		result.append(enabled);
		result.append(", Charset: ");
		result.append(charset);
		result.append(", MaximumTCPConnections: ");
		result.append(maximumTCPConnections);
		result.append(", Port: ");
		result.append(port);
		result.append(", NonNFSuid: ");
		result.append(nonNFSuid);
		result.append(", NonNFSgid: ");
		result.append(nonNFSgid);
		result.append(", UseReservedPorts: ");
		result.append(useReservedPorts);
		result.append(", OnlyRootChown: ");
		result.append(onlyRootChown);
		result.append(')');
		return result.toString();
	}

} //CIM_NFSSettingDataImpl
