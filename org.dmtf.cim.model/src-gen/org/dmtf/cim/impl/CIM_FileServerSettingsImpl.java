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

import org.dmtf.cim.CIM_FileServerSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Server Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerSettingsImpl#getHostLookupOrder <em>Host Lookup Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerSettingsImpl#getUserLoginLookupOrder <em>User Login Lookup Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerSettingsImpl#getNFSCIFSAccountMapping <em>NFSCIFS Account Mapping</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileServerSettingsImpl#getAccountMappingDomain <em>Account Mapping Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileServerSettingsImpl extends CIM_SettingDataImpl implements CIM_FileServerSettings {
	/**
	 * The cached value of the '{@link #getHostLookupOrder() <em>Host Lookup Order</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostLookupOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hostLookupOrder;

	/**
	 * The cached value of the '{@link #getUserLoginLookupOrder() <em>User Login Lookup Order</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginLookupOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> userLoginLookupOrder;

	/**
	 * The default value of the '{@link #getNFSCIFSAccountMapping() <em>NFSCIFS Account Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFSCIFSAccountMapping()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NFSCIFS_ACCOUNT_MAPPING_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getNFSCIFSAccountMapping() <em>NFSCIFS Account Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFSCIFSAccountMapping()
	 * @generated
	 * @ordered
	 */
	protected Integer nfscifsAccountMapping = NFSCIFS_ACCOUNT_MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountMappingDomain() <em>Account Mapping Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountMappingDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_MAPPING_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountMappingDomain() <em>Account Mapping Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountMappingDomain()
	 * @generated
	 * @ordered
	 */
	protected String accountMappingDomain = ACCOUNT_MAPPING_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileServerSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileServerSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHostLookupOrder() {
		if (hostLookupOrder == null) {
			hostLookupOrder = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SERVER_SETTINGS__HOST_LOOKUP_ORDER);
		}
		return hostLookupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getUserLoginLookupOrder() {
		if (userLoginLookupOrder == null) {
			userLoginLookupOrder = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SERVER_SETTINGS__USER_LOGIN_LOOKUP_ORDER);
		}
		return userLoginLookupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNFSCIFSAccountMapping() {
		return nfscifsAccountMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNFSCIFSAccountMapping(Integer newNFSCIFSAccountMapping) {
		Integer oldNFSCIFSAccountMapping = nfscifsAccountMapping;
		nfscifsAccountMapping = newNFSCIFSAccountMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_SETTINGS__NFSCIFS_ACCOUNT_MAPPING, oldNFSCIFSAccountMapping, nfscifsAccountMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountMappingDomain() {
		return accountMappingDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountMappingDomain(String newAccountMappingDomain) {
		String oldAccountMappingDomain = accountMappingDomain;
		accountMappingDomain = newAccountMappingDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SERVER_SETTINGS__ACCOUNT_MAPPING_DOMAIN, oldAccountMappingDomain, accountMappingDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SERVER_SETTINGS__HOST_LOOKUP_ORDER:
				return getHostLookupOrder();
			case CimPackage.CIM_FILE_SERVER_SETTINGS__USER_LOGIN_LOOKUP_ORDER:
				return getUserLoginLookupOrder();
			case CimPackage.CIM_FILE_SERVER_SETTINGS__NFSCIFS_ACCOUNT_MAPPING:
				return getNFSCIFSAccountMapping();
			case CimPackage.CIM_FILE_SERVER_SETTINGS__ACCOUNT_MAPPING_DOMAIN:
				return getAccountMappingDomain();
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
			case CimPackage.CIM_FILE_SERVER_SETTINGS__HOST_LOOKUP_ORDER:
				getHostLookupOrder().clear();
				getHostLookupOrder().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__USER_LOGIN_LOOKUP_ORDER:
				getUserLoginLookupOrder().clear();
				getUserLoginLookupOrder().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__NFSCIFS_ACCOUNT_MAPPING:
				setNFSCIFSAccountMapping((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__ACCOUNT_MAPPING_DOMAIN:
				setAccountMappingDomain((String)newValue);
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
			case CimPackage.CIM_FILE_SERVER_SETTINGS__HOST_LOOKUP_ORDER:
				getHostLookupOrder().clear();
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__USER_LOGIN_LOOKUP_ORDER:
				getUserLoginLookupOrder().clear();
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__NFSCIFS_ACCOUNT_MAPPING:
				setNFSCIFSAccountMapping(NFSCIFS_ACCOUNT_MAPPING_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SERVER_SETTINGS__ACCOUNT_MAPPING_DOMAIN:
				setAccountMappingDomain(ACCOUNT_MAPPING_DOMAIN_EDEFAULT);
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
			case CimPackage.CIM_FILE_SERVER_SETTINGS__HOST_LOOKUP_ORDER:
				return hostLookupOrder != null && !hostLookupOrder.isEmpty();
			case CimPackage.CIM_FILE_SERVER_SETTINGS__USER_LOGIN_LOOKUP_ORDER:
				return userLoginLookupOrder != null && !userLoginLookupOrder.isEmpty();
			case CimPackage.CIM_FILE_SERVER_SETTINGS__NFSCIFS_ACCOUNT_MAPPING:
				return NFSCIFS_ACCOUNT_MAPPING_EDEFAULT == null ? nfscifsAccountMapping != null : !NFSCIFS_ACCOUNT_MAPPING_EDEFAULT.equals(nfscifsAccountMapping);
			case CimPackage.CIM_FILE_SERVER_SETTINGS__ACCOUNT_MAPPING_DOMAIN:
				return ACCOUNT_MAPPING_DOMAIN_EDEFAULT == null ? accountMappingDomain != null : !ACCOUNT_MAPPING_DOMAIN_EDEFAULT.equals(accountMappingDomain);
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
		result.append(" (HostLookupOrder: ");
		result.append(hostLookupOrder);
		result.append(", UserLoginLookupOrder: ");
		result.append(userLoginLookupOrder);
		result.append(", NFSCIFSAccountMapping: ");
		result.append(nfscifsAccountMapping);
		result.append(", AccountMappingDomain: ");
		result.append(accountMappingDomain);
		result.append(')');
		return result.toString();
	}

} //CIM_FileServerSettingsImpl
