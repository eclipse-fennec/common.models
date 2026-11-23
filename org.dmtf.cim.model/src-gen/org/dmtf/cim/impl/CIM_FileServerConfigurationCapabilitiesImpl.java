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

import org.dmtf.cim.CIM_FileServerConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Server Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getCanConfigureCIFS <em>Can Configure CIFS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getCanConfigureNFS <em>Can Configure NFS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getCanConfigureNIS <em>Can Configure NIS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getCanConfigureDNS <em>Can Configure DNS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerConfigurationCapabilitiesImpl#getCanConfigureNetworkVLAN <em>Can Configure Network VLAN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileServerConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileServerConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSynchronousMethodsSupported() <em>Synchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> synchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getAsynchronousMethodsSupported() <em>Asynchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> asynchronousMethodsSupported;

	/**
	 * The default value of the '{@link #getCanConfigureCIFS() <em>Can Configure CIFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureCIFS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONFIGURE_CIFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanConfigureCIFS() <em>Can Configure CIFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureCIFS()
	 * @generated
	 * @ordered
	 */
	protected Boolean canConfigureCIFS = CAN_CONFIGURE_CIFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanConfigureNFS() <em>Can Configure NFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNFS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONFIGURE_NFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanConfigureNFS() <em>Can Configure NFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNFS()
	 * @generated
	 * @ordered
	 */
	protected Boolean canConfigureNFS = CAN_CONFIGURE_NFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanConfigureNIS() <em>Can Configure NIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNIS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONFIGURE_NIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanConfigureNIS() <em>Can Configure NIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNIS()
	 * @generated
	 * @ordered
	 */
	protected Boolean canConfigureNIS = CAN_CONFIGURE_NIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanConfigureDNS() <em>Can Configure DNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureDNS()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONFIGURE_DNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanConfigureDNS() <em>Can Configure DNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureDNS()
	 * @generated
	 * @ordered
	 */
	protected Boolean canConfigureDNS = CAN_CONFIGURE_DNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanConfigureNetworkVLAN() <em>Can Configure Network VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNetworkVLAN()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CONFIGURE_NETWORK_VLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanConfigureNetworkVLAN() <em>Can Configure Network VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanConfigureNetworkVLAN()
	 * @generated
	 * @ordered
	 */
	protected Boolean canConfigureNetworkVLAN = CAN_CONFIGURE_NETWORK_VLAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileServerConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileServerConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSynchronousMethodsSupported() {
		if (synchronousMethodsSupported == null) {
			synchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED);
		}
		return synchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAsynchronousMethodsSupported() {
		if (asynchronousMethodsSupported == null) {
			asynchronousMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED);
		}
		return asynchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanConfigureCIFS() {
		return canConfigureCIFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanConfigureCIFS(Boolean newCanConfigureCIFS) {
		Boolean oldCanConfigureCIFS = canConfigureCIFS;
		canConfigureCIFS = newCanConfigureCIFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_CIFS, oldCanConfigureCIFS, canConfigureCIFS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanConfigureNFS() {
		return canConfigureNFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanConfigureNFS(Boolean newCanConfigureNFS) {
		Boolean oldCanConfigureNFS = canConfigureNFS;
		canConfigureNFS = newCanConfigureNFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NFS, oldCanConfigureNFS, canConfigureNFS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanConfigureNIS() {
		return canConfigureNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanConfigureNIS(Boolean newCanConfigureNIS) {
		Boolean oldCanConfigureNIS = canConfigureNIS;
		canConfigureNIS = newCanConfigureNIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NIS, oldCanConfigureNIS, canConfigureNIS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanConfigureDNS() {
		return canConfigureDNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanConfigureDNS(Boolean newCanConfigureDNS) {
		Boolean oldCanConfigureDNS = canConfigureDNS;
		canConfigureDNS = newCanConfigureDNS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_DNS, oldCanConfigureDNS, canConfigureDNS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanConfigureNetworkVLAN() {
		return canConfigureNetworkVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanConfigureNetworkVLAN(Boolean newCanConfigureNetworkVLAN) {
		Boolean oldCanConfigureNetworkVLAN = canConfigureNetworkVLAN;
		canConfigureNetworkVLAN = newCanConfigureNetworkVLAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NETWORK_VLAN, oldCanConfigureNetworkVLAN, canConfigureNetworkVLAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return getSynchronousMethodsSupported();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return getAsynchronousMethodsSupported();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_CIFS:
				return getCanConfigureCIFS();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NFS:
				return getCanConfigureNFS();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NIS:
				return getCanConfigureNIS();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_DNS:
				return getCanConfigureDNS();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NETWORK_VLAN:
				return getCanConfigureNetworkVLAN();
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
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				getSynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				getAsynchronousMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_CIFS:
				setCanConfigureCIFS((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NFS:
				setCanConfigureNFS((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NIS:
				setCanConfigureNIS((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_DNS:
				setCanConfigureDNS((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NETWORK_VLAN:
				setCanConfigureNetworkVLAN((Boolean)newValue);
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
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_CIFS:
				setCanConfigureCIFS(CAN_CONFIGURE_CIFS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NFS:
				setCanConfigureNFS(CAN_CONFIGURE_NFS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NIS:
				setCanConfigureNIS(CAN_CONFIGURE_NIS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_DNS:
				setCanConfigureDNS(CAN_CONFIGURE_DNS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NETWORK_VLAN:
				setCanConfigureNetworkVLAN(CAN_CONFIGURE_NETWORK_VLAN_EDEFAULT);
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
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return synchronousMethodsSupported != null && !synchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return asynchronousMethodsSupported != null && !asynchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_CIFS:
				return CAN_CONFIGURE_CIFS_EDEFAULT == null ? canConfigureCIFS != null : !CAN_CONFIGURE_CIFS_EDEFAULT.equals(canConfigureCIFS);
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NFS:
				return CAN_CONFIGURE_NFS_EDEFAULT == null ? canConfigureNFS != null : !CAN_CONFIGURE_NFS_EDEFAULT.equals(canConfigureNFS);
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NIS:
				return CAN_CONFIGURE_NIS_EDEFAULT == null ? canConfigureNIS != null : !CAN_CONFIGURE_NIS_EDEFAULT.equals(canConfigureNIS);
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_DNS:
				return CAN_CONFIGURE_DNS_EDEFAULT == null ? canConfigureDNS != null : !CAN_CONFIGURE_DNS_EDEFAULT.equals(canConfigureDNS);
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES__CAN_CONFIGURE_NETWORK_VLAN:
				return CAN_CONFIGURE_NETWORK_VLAN_EDEFAULT == null ? canConfigureNetworkVLAN != null : !CAN_CONFIGURE_NETWORK_VLAN_EDEFAULT.equals(canConfigureNetworkVLAN);
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
		result.append(" (SynchronousMethodsSupported: ");
		result.append(synchronousMethodsSupported);
		result.append(", AsynchronousMethodsSupported: ");
		result.append(asynchronousMethodsSupported);
		result.append(", CanConfigureCIFS: ");
		result.append(canConfigureCIFS);
		result.append(", CanConfigureNFS: ");
		result.append(canConfigureNFS);
		result.append(", CanConfigureNIS: ");
		result.append(canConfigureNIS);
		result.append(", CanConfigureDNS: ");
		result.append(canConfigureDNS);
		result.append(", CanConfigureNetworkVLAN: ");
		result.append(canConfigureNetworkVLAN);
		result.append(')');
		return result.toString();
	}

} //CIM_FileServerConfigurationCapabilitiesImpl
