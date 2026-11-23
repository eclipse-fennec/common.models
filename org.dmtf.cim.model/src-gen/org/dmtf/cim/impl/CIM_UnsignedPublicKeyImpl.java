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

import org.dmtf.cim.CIM_UnsignedPublicKey;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unsigned Public Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedPublicKeyImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnsignedPublicKeyImpl extends CIM_CredentialImpl implements CIM_UnsignedPublicKey {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceCreationClassName() <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceCreationClassName() <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String serviceCreationClassName = SERVICE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerIdentity() <em>Peer Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String PEER_IDENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeerIdentity() <em>Peer Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentity()
	 * @generated
	 * @ordered
	 */
	protected String peerIdentity = PEER_IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerIdentityType() <em>Peer Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PEER_IDENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeerIdentityType() <em>Peer Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentityType()
	 * @generated
	 * @ordered
	 */
	protected Integer peerIdentityType = PEER_IDENTITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> publicKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnsignedPublicKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnsignedPublicKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceCreationClassName() {
		return serviceCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceCreationClassName(String newServiceCreationClassName) {
		String oldServiceCreationClassName = serviceCreationClassName;
		serviceCreationClassName = newServiceCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_CREATION_CLASS_NAME, oldServiceCreationClassName, serviceCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeerIdentity() {
		return peerIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerIdentity(String newPeerIdentity) {
		String oldPeerIdentity = peerIdentity;
		peerIdentity = newPeerIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY, oldPeerIdentity, peerIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPeerIdentityType() {
		return peerIdentityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerIdentityType(Integer newPeerIdentityType) {
		Integer oldPeerIdentityType = peerIdentityType;
		peerIdentityType = newPeerIdentityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY_TYPE, oldPeerIdentityType, peerIdentityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPublicKey() {
		if (publicKey == null) {
			publicKey = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PUBLIC_KEY);
		}
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_CREATION_CLASS_NAME:
				return getServiceCreationClassName();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY:
				return getPeerIdentity();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY_TYPE:
				return getPeerIdentityType();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PUBLIC_KEY:
				return getPublicKey();
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
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY:
				setPeerIdentity((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY_TYPE:
				setPeerIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PUBLIC_KEY:
				getPublicKey().clear();
				getPublicKey().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName(SERVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY:
				setPeerIdentity(PEER_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY_TYPE:
				setPeerIdentityType(PEER_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PUBLIC_KEY:
				getPublicKey().clear();
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
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_CREATION_CLASS_NAME:
				return SERVICE_CREATION_CLASS_NAME_EDEFAULT == null ? serviceCreationClassName != null : !SERVICE_CREATION_CLASS_NAME_EDEFAULT.equals(serviceCreationClassName);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY:
				return PEER_IDENTITY_EDEFAULT == null ? peerIdentity != null : !PEER_IDENTITY_EDEFAULT.equals(peerIdentity);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PEER_IDENTITY_TYPE:
				return PEER_IDENTITY_TYPE_EDEFAULT == null ? peerIdentityType != null : !PEER_IDENTITY_TYPE_EDEFAULT.equals(peerIdentityType);
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY__PUBLIC_KEY:
				return publicKey != null && !publicKey.isEmpty();
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", ServiceCreationClassName: ");
		result.append(serviceCreationClassName);
		result.append(", ServiceName: ");
		result.append(serviceName);
		result.append(", PeerIdentity: ");
		result.append(peerIdentity);
		result.append(", PeerIdentityType: ");
		result.append(peerIdentityType);
		result.append(", PublicKey: ");
		result.append(publicKey);
		result.append(')');
		return result.toString();
	}

} //CIM_UnsignedPublicKeyImpl
