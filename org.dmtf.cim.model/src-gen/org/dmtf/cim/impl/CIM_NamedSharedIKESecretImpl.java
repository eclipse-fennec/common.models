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

import org.dmtf.cim.CIM_NamedSharedIKESecret;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Named Shared IKE Secret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getLocalIdentity <em>Local Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getLocalIdentityType <em>Local Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NamedSharedIKESecretImpl#getSharedSecretName <em>Shared Secret Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NamedSharedIKESecretImpl extends CIM_CredentialImpl implements CIM_NamedSharedIKESecret {
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
	 * The default value of the '{@link #getLocalIdentity() <em>Local Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_IDENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIdentity() <em>Local Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentity()
	 * @generated
	 * @ordered
	 */
	protected String localIdentity = LOCAL_IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalIdentityType() <em>Local Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_IDENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIdentityType() <em>Local Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentityType()
	 * @generated
	 * @ordered
	 */
	protected Integer localIdentityType = LOCAL_IDENTITY_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSharedSecretName() <em>Shared Secret Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSecretName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARED_SECRET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedSecretName() <em>Shared Secret Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSecretName()
	 * @generated
	 * @ordered
	 */
	protected String sharedSecretName = SHARED_SECRET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NamedSharedIKESecretImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NamedSharedIKESecret();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_NAME, oldSystemName, systemName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_CREATION_CLASS_NAME, oldServiceCreationClassName, serviceCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalIdentity() {
		return localIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalIdentity(String newLocalIdentity) {
		String oldLocalIdentity = localIdentity;
		localIdentity = newLocalIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY, oldLocalIdentity, localIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalIdentityType() {
		return localIdentityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalIdentityType(Integer newLocalIdentityType) {
		Integer oldLocalIdentityType = localIdentityType;
		localIdentityType = newLocalIdentityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY_TYPE, oldLocalIdentityType, localIdentityType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY, oldPeerIdentity, peerIdentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY_TYPE, oldPeerIdentityType, peerIdentityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSharedSecretName() {
		return sharedSecretName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedSecretName(String newSharedSecretName) {
		String oldSharedSecretName = sharedSecretName;
		sharedSecretName = newSharedSecretName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SHARED_SECRET_NAME, oldSharedSecretName, sharedSecretName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_CREATION_CLASS_NAME:
				return getServiceCreationClassName();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY:
				return getLocalIdentity();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY_TYPE:
				return getLocalIdentityType();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY:
				return getPeerIdentity();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY_TYPE:
				return getPeerIdentityType();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SHARED_SECRET_NAME:
				return getSharedSecretName();
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
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY:
				setLocalIdentity((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY_TYPE:
				setLocalIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY:
				setPeerIdentity((String)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY_TYPE:
				setPeerIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SHARED_SECRET_NAME:
				setSharedSecretName((String)newValue);
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
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_CREATION_CLASS_NAME:
				setServiceCreationClassName(SERVICE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY:
				setLocalIdentity(LOCAL_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY_TYPE:
				setLocalIdentityType(LOCAL_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY:
				setPeerIdentity(PEER_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY_TYPE:
				setPeerIdentityType(PEER_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SHARED_SECRET_NAME:
				setSharedSecretName(SHARED_SECRET_NAME_EDEFAULT);
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
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_CREATION_CLASS_NAME:
				return SERVICE_CREATION_CLASS_NAME_EDEFAULT == null ? serviceCreationClassName != null : !SERVICE_CREATION_CLASS_NAME_EDEFAULT.equals(serviceCreationClassName);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY:
				return LOCAL_IDENTITY_EDEFAULT == null ? localIdentity != null : !LOCAL_IDENTITY_EDEFAULT.equals(localIdentity);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__LOCAL_IDENTITY_TYPE:
				return LOCAL_IDENTITY_TYPE_EDEFAULT == null ? localIdentityType != null : !LOCAL_IDENTITY_TYPE_EDEFAULT.equals(localIdentityType);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY:
				return PEER_IDENTITY_EDEFAULT == null ? peerIdentity != null : !PEER_IDENTITY_EDEFAULT.equals(peerIdentity);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__PEER_IDENTITY_TYPE:
				return PEER_IDENTITY_TYPE_EDEFAULT == null ? peerIdentityType != null : !PEER_IDENTITY_TYPE_EDEFAULT.equals(peerIdentityType);
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET__SHARED_SECRET_NAME:
				return SHARED_SECRET_NAME_EDEFAULT == null ? sharedSecretName != null : !SHARED_SECRET_NAME_EDEFAULT.equals(sharedSecretName);
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
		result.append(", LocalIdentity: ");
		result.append(localIdentity);
		result.append(", LocalIdentityType: ");
		result.append(localIdentityType);
		result.append(", PeerIdentity: ");
		result.append(peerIdentity);
		result.append(", PeerIdentityType: ");
		result.append(peerIdentityType);
		result.append(", SharedSecretName: ");
		result.append(sharedSecretName);
		result.append(')');
		return result.toString();
	}

} //CIM_NamedSharedIKESecretImpl
