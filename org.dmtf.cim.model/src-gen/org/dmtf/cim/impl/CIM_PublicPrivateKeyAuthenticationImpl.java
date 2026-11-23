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

import org.dmtf.cim.CIM_PublicPrivateKeyAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Public Private Key Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyAuthenticationImpl#getSelfIssuedKey <em>Self Issued Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyAuthenticationImpl#getDistinguishedName <em>Distinguished Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PublicPrivateKeyAuthenticationImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PublicPrivateKeyAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_PublicPrivateKeyAuthentication {
	/**
	 * The default value of the '{@link #getSelfIssuedKey() <em>Self Issued Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIssuedKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELF_ISSUED_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfIssuedKey() <em>Self Issued Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIssuedKey()
	 * @generated
	 * @ordered
	 */
	protected Boolean selfIssuedKey = SELF_ISSUED_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistinguishedName() <em>Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinguishedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTINGUISHED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistinguishedName() <em>Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinguishedName()
	 * @generated
	 * @ordered
	 */
	protected String distinguishedName = DISTINGUISHED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PublicPrivateKeyAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PublicPrivateKeyAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSelfIssuedKey() {
		return selfIssuedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfIssuedKey(Boolean newSelfIssuedKey) {
		Boolean oldSelfIssuedKey = selfIssuedKey;
		selfIssuedKey = newSelfIssuedKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__SELF_ISSUED_KEY, oldSelfIssuedKey, selfIssuedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistinguishedName() {
		return distinguishedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinguishedName(String newDistinguishedName) {
		String oldDistinguishedName = distinguishedName;
		distinguishedName = newDistinguishedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__DISTINGUISHED_NAME, oldDistinguishedName, distinguishedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__SELF_ISSUED_KEY:
				return getSelfIssuedKey();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__DISTINGUISHED_NAME:
				return getDistinguishedName();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__PUBLIC_KEY:
				return getPublicKey();
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__SELF_ISSUED_KEY:
				setSelfIssuedKey((Boolean)newValue);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__DISTINGUISHED_NAME:
				setDistinguishedName((String)newValue);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__PUBLIC_KEY:
				setPublicKey((String)newValue);
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__SELF_ISSUED_KEY:
				setSelfIssuedKey(SELF_ISSUED_KEY_EDEFAULT);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__DISTINGUISHED_NAME:
				setDistinguishedName(DISTINGUISHED_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__PUBLIC_KEY:
				setPublicKey(PUBLIC_KEY_EDEFAULT);
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
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__SELF_ISSUED_KEY:
				return SELF_ISSUED_KEY_EDEFAULT == null ? selfIssuedKey != null : !SELF_ISSUED_KEY_EDEFAULT.equals(selfIssuedKey);
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__DISTINGUISHED_NAME:
				return DISTINGUISHED_NAME_EDEFAULT == null ? distinguishedName != null : !DISTINGUISHED_NAME_EDEFAULT.equals(distinguishedName);
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION__PUBLIC_KEY:
				return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
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
		result.append(" (SelfIssuedKey: ");
		result.append(selfIssuedKey);
		result.append(", DistinguishedName: ");
		result.append(distinguishedName);
		result.append(", PublicKey: ");
		result.append(publicKey);
		result.append(')');
		return result.toString();
	}

} //CIM_PublicPrivateKeyAuthenticationImpl
