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

import org.dmtf.cim.CIM_UnsignedCredential;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unsigned Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedCredentialImpl#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedCredentialImpl#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedCredentialImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedCredentialImpl#getPublicKeyEncoding <em>Public Key Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnsignedCredentialImpl#getOtherPublicKeyEncoding <em>Other Public Key Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnsignedCredentialImpl extends CIM_CredentialImpl implements CIM_UnsignedCredential {
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
	protected EList<String> publicKey;

	/**
	 * The default value of the '{@link #getPublicKeyEncoding() <em>Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeyEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PUBLIC_KEY_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKeyEncoding() <em>Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKeyEncoding()
	 * @generated
	 * @ordered
	 */
	protected Integer publicKeyEncoding = PUBLIC_KEY_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPublicKeyEncoding() <em>Other Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPublicKeyEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PUBLIC_KEY_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPublicKeyEncoding() <em>Other Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPublicKeyEncoding()
	 * @generated
	 * @ordered
	 */
	protected String otherPublicKeyEncoding = OTHER_PUBLIC_KEY_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnsignedCredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnsignedCredential();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY, oldPeerIdentity, peerIdentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY_TYPE, oldPeerIdentityType, peerIdentityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPublicKey() {
		if (publicKey == null) {
			publicKey = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY);
		}
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPublicKeyEncoding() {
		return publicKeyEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKeyEncoding(Integer newPublicKeyEncoding) {
		Integer oldPublicKeyEncoding = publicKeyEncoding;
		publicKeyEncoding = newPublicKeyEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY_ENCODING, oldPublicKeyEncoding, publicKeyEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPublicKeyEncoding() {
		return otherPublicKeyEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPublicKeyEncoding(String newOtherPublicKeyEncoding) {
		String oldOtherPublicKeyEncoding = otherPublicKeyEncoding;
		otherPublicKeyEncoding = newOtherPublicKeyEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNSIGNED_CREDENTIAL__OTHER_PUBLIC_KEY_ENCODING, oldOtherPublicKeyEncoding, otherPublicKeyEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY:
				return getPeerIdentity();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY_TYPE:
				return getPeerIdentityType();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY:
				return getPublicKey();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY_ENCODING:
				return getPublicKeyEncoding();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__OTHER_PUBLIC_KEY_ENCODING:
				return getOtherPublicKeyEncoding();
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
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY:
				setPeerIdentity((String)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY_TYPE:
				setPeerIdentityType((Integer)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY:
				getPublicKey().clear();
				getPublicKey().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY_ENCODING:
				setPublicKeyEncoding((Integer)newValue);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__OTHER_PUBLIC_KEY_ENCODING:
				setOtherPublicKeyEncoding((String)newValue);
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
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY:
				setPeerIdentity(PEER_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY_TYPE:
				setPeerIdentityType(PEER_IDENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY:
				getPublicKey().clear();
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY_ENCODING:
				setPublicKeyEncoding(PUBLIC_KEY_ENCODING_EDEFAULT);
				return;
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__OTHER_PUBLIC_KEY_ENCODING:
				setOtherPublicKeyEncoding(OTHER_PUBLIC_KEY_ENCODING_EDEFAULT);
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
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY:
				return PEER_IDENTITY_EDEFAULT == null ? peerIdentity != null : !PEER_IDENTITY_EDEFAULT.equals(peerIdentity);
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PEER_IDENTITY_TYPE:
				return PEER_IDENTITY_TYPE_EDEFAULT == null ? peerIdentityType != null : !PEER_IDENTITY_TYPE_EDEFAULT.equals(peerIdentityType);
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY:
				return publicKey != null && !publicKey.isEmpty();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__PUBLIC_KEY_ENCODING:
				return PUBLIC_KEY_ENCODING_EDEFAULT == null ? publicKeyEncoding != null : !PUBLIC_KEY_ENCODING_EDEFAULT.equals(publicKeyEncoding);
			case CimPackage.CIM_UNSIGNED_CREDENTIAL__OTHER_PUBLIC_KEY_ENCODING:
				return OTHER_PUBLIC_KEY_ENCODING_EDEFAULT == null ? otherPublicKeyEncoding != null : !OTHER_PUBLIC_KEY_ENCODING_EDEFAULT.equals(otherPublicKeyEncoding);
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
		result.append(" (PeerIdentity: ");
		result.append(peerIdentity);
		result.append(", PeerIdentityType: ");
		result.append(peerIdentityType);
		result.append(", PublicKey: ");
		result.append(publicKey);
		result.append(", PublicKeyEncoding: ");
		result.append(publicKeyEncoding);
		result.append(", OtherPublicKeyEncoding: ");
		result.append(otherPublicKeyEncoding);
		result.append(')');
		return result.toString();
	}

} //CIM_UnsignedCredentialImpl
