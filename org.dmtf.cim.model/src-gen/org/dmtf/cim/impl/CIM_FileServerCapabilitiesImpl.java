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

import org.dmtf.cim.CIM_FileServerCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Server Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getFileServerSettingsSupported <em>File Server Settings Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getCIFSSupported <em>CIFS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getNFSSupported <em>NFS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getNISSupported <em>NIS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getDNSSupported <em>DNS Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getNetworkVLANSupported <em>Network VLAN Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerCapabilitiesImpl#getScaleOutSupported <em>Scale Out Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileServerCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileServerCapabilities {
	/**
	 * The default value of the '{@link #getFileServerSettingsSupported() <em>File Server Settings Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileServerSettingsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FILE_SERVER_SETTINGS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileServerSettingsSupported() <em>File Server Settings Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileServerSettingsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean fileServerSettingsSupported = FILE_SERVER_SETTINGS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCIFSSupported() <em>CIFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIFSSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CIFS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIFSSupported() <em>CIFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIFSSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean cifsSupported = CIFS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNFSSupported() <em>NFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFSSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NFS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNFSSupported() <em>NFS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFSSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean nfsSupported = NFS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNISSupported() <em>NIS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNISSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NIS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNISSupported() <em>NIS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNISSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean nisSupported = NIS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDNSSupported() <em>DNS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DNS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDNSSupported() <em>DNS Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean dnsSupported = DNS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkVLANSupported() <em>Network VLAN Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkVLANSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NETWORK_VLAN_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkVLANSupported() <em>Network VLAN Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkVLANSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean networkVLANSupported = NETWORK_VLAN_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleOutSupported() <em>Scale Out Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOutSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SCALE_OUT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleOutSupported() <em>Scale Out Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOutSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean scaleOutSupported = SCALE_OUT_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileServerCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileServerCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFileServerSettingsSupported() {
		return fileServerSettingsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileServerSettingsSupported(Boolean newFileServerSettingsSupported) {
		Boolean oldFileServerSettingsSupported = fileServerSettingsSupported;
		fileServerSettingsSupported = newFileServerSettingsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__FILE_SERVER_SETTINGS_SUPPORTED, oldFileServerSettingsSupported, fileServerSettingsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCIFSSupported() {
		return cifsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIFSSupported(Boolean newCIFSSupported) {
		Boolean oldCIFSSupported = cifsSupported;
		cifsSupported = newCIFSSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__CIFS_SUPPORTED, oldCIFSSupported, cifsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNFSSupported() {
		return nfsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNFSSupported(Boolean newNFSSupported) {
		Boolean oldNFSSupported = nfsSupported;
		nfsSupported = newNFSSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__NFS_SUPPORTED, oldNFSSupported, nfsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNISSupported() {
		return nisSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNISSupported(Boolean newNISSupported) {
		Boolean oldNISSupported = nisSupported;
		nisSupported = newNISSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__NIS_SUPPORTED, oldNISSupported, nisSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDNSSupported() {
		return dnsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDNSSupported(Boolean newDNSSupported) {
		Boolean oldDNSSupported = dnsSupported;
		dnsSupported = newDNSSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__DNS_SUPPORTED, oldDNSSupported, dnsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNetworkVLANSupported() {
		return networkVLANSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkVLANSupported(Boolean newNetworkVLANSupported) {
		Boolean oldNetworkVLANSupported = networkVLANSupported;
		networkVLANSupported = newNetworkVLANSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__NETWORK_VLAN_SUPPORTED, oldNetworkVLANSupported, networkVLANSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getScaleOutSupported() {
		return scaleOutSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleOutSupported(Boolean newScaleOutSupported) {
		Boolean oldScaleOutSupported = scaleOutSupported;
		scaleOutSupported = newScaleOutSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CAPABILITIES__SCALE_OUT_SUPPORTED, oldScaleOutSupported, scaleOutSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__FILE_SERVER_SETTINGS_SUPPORTED:
				return getFileServerSettingsSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__CIFS_SUPPORTED:
				return getCIFSSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NFS_SUPPORTED:
				return getNFSSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NIS_SUPPORTED:
				return getNISSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__DNS_SUPPORTED:
				return getDNSSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NETWORK_VLAN_SUPPORTED:
				return getNetworkVLANSupported();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__SCALE_OUT_SUPPORTED:
				return getScaleOutSupported();
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
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__FILE_SERVER_SETTINGS_SUPPORTED:
				setFileServerSettingsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__CIFS_SUPPORTED:
				setCIFSSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NFS_SUPPORTED:
				setNFSSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NIS_SUPPORTED:
				setNISSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__DNS_SUPPORTED:
				setDNSSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NETWORK_VLAN_SUPPORTED:
				setNetworkVLANSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__SCALE_OUT_SUPPORTED:
				setScaleOutSupported((Boolean)newValue);
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
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__FILE_SERVER_SETTINGS_SUPPORTED:
				setFileServerSettingsSupported(FILE_SERVER_SETTINGS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__CIFS_SUPPORTED:
				setCIFSSupported(CIFS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NFS_SUPPORTED:
				setNFSSupported(NFS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NIS_SUPPORTED:
				setNISSupported(NIS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__DNS_SUPPORTED:
				setDNSSupported(DNS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NETWORK_VLAN_SUPPORTED:
				setNetworkVLANSupported(NETWORK_VLAN_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__SCALE_OUT_SUPPORTED:
				setScaleOutSupported(SCALE_OUT_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__FILE_SERVER_SETTINGS_SUPPORTED:
				return FILE_SERVER_SETTINGS_SUPPORTED_EDEFAULT == null ? fileServerSettingsSupported != null : !FILE_SERVER_SETTINGS_SUPPORTED_EDEFAULT.equals(fileServerSettingsSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__CIFS_SUPPORTED:
				return CIFS_SUPPORTED_EDEFAULT == null ? cifsSupported != null : !CIFS_SUPPORTED_EDEFAULT.equals(cifsSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NFS_SUPPORTED:
				return NFS_SUPPORTED_EDEFAULT == null ? nfsSupported != null : !NFS_SUPPORTED_EDEFAULT.equals(nfsSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NIS_SUPPORTED:
				return NIS_SUPPORTED_EDEFAULT == null ? nisSupported != null : !NIS_SUPPORTED_EDEFAULT.equals(nisSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__DNS_SUPPORTED:
				return DNS_SUPPORTED_EDEFAULT == null ? dnsSupported != null : !DNS_SUPPORTED_EDEFAULT.equals(dnsSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__NETWORK_VLAN_SUPPORTED:
				return NETWORK_VLAN_SUPPORTED_EDEFAULT == null ? networkVLANSupported != null : !NETWORK_VLAN_SUPPORTED_EDEFAULT.equals(networkVLANSupported);
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES__SCALE_OUT_SUPPORTED:
				return SCALE_OUT_SUPPORTED_EDEFAULT == null ? scaleOutSupported != null : !SCALE_OUT_SUPPORTED_EDEFAULT.equals(scaleOutSupported);
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
		result.append(" (FileServerSettingsSupported: ");
		result.append(fileServerSettingsSupported);
		result.append(", CIFSSupported: ");
		result.append(cifsSupported);
		result.append(", NFSSupported: ");
		result.append(nfsSupported);
		result.append(", NISSupported: ");
		result.append(nisSupported);
		result.append(", DNSSupported: ");
		result.append(dnsSupported);
		result.append(", NetworkVLANSupported: ");
		result.append(networkVLANSupported);
		result.append(", ScaleOutSupported: ");
		result.append(scaleOutSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FileServerCapabilitiesImpl
