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

import org.dmtf.cim.CIM_IKESAEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IKESA Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getInitiatorCookie <em>Initiator Cookie</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getResponderCookie <em>Responder Cookie</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getCipherAlgorithm <em>Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getOtherCipherAlgorithm <em>Other Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getOtherHashAlgorithm <em>Other Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IKESAEndpointImpl#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IKESAEndpointImpl extends CIM_SecurityAssociationEndpointImpl implements CIM_IKESAEndpoint {
	/**
	 * The default value of the '{@link #getInitiatorCookie() <em>Initiator Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorCookie()
	 * @generated
	 * @ordered
	 */
	protected static final Long INITIATOR_COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatorCookie() <em>Initiator Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorCookie()
	 * @generated
	 * @ordered
	 */
	protected Long initiatorCookie = INITIATOR_COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponderCookie() <em>Responder Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderCookie()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESPONDER_COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponderCookie() <em>Responder Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderCookie()
	 * @generated
	 * @ordered
	 */
	protected Long responderCookie = RESPONDER_COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipherAlgorithm() <em>Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CIPHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCipherAlgorithm() <em>Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer cipherAlgorithm = CIPHER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCipherAlgorithm() <em>Other Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CIPHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCipherAlgorithm() <em>Other Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCipherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherCipherAlgorithm = OTHER_CIPHER_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HASH_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer hashAlgorithm = HASH_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherHashAlgorithm() <em>Other Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_HASH_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherHashAlgorithm() <em>Other Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherHashAlgorithm = OTHER_HASH_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTHENTICATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer authenticationMethod = AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAuthenticationMethod() <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AUTHENTICATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAuthenticationMethod() <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherAuthenticationMethod = OTHER_AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected Integer groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected String vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IKESAEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IKESAEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInitiatorCookie() {
		return initiatorCookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiatorCookie(Long newInitiatorCookie) {
		Long oldInitiatorCookie = initiatorCookie;
		initiatorCookie = newInitiatorCookie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__INITIATOR_COOKIE, oldInitiatorCookie, initiatorCookie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResponderCookie() {
		return responderCookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponderCookie(Long newResponderCookie) {
		Long oldResponderCookie = responderCookie;
		responderCookie = newResponderCookie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__RESPONDER_COOKIE, oldResponderCookie, responderCookie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCipherAlgorithm() {
		return cipherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherAlgorithm(Integer newCipherAlgorithm) {
		Integer oldCipherAlgorithm = cipherAlgorithm;
		cipherAlgorithm = newCipherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__CIPHER_ALGORITHM, oldCipherAlgorithm, cipherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCipherAlgorithm() {
		return otherCipherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCipherAlgorithm(String newOtherCipherAlgorithm) {
		String oldOtherCipherAlgorithm = otherCipherAlgorithm;
		otherCipherAlgorithm = newOtherCipherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__OTHER_CIPHER_ALGORITHM, oldOtherCipherAlgorithm, otherCipherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHashAlgorithm() {
		return hashAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHashAlgorithm(Integer newHashAlgorithm) {
		Integer oldHashAlgorithm = hashAlgorithm;
		hashAlgorithm = newHashAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__HASH_ALGORITHM, oldHashAlgorithm, hashAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherHashAlgorithm() {
		return otherHashAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherHashAlgorithm(String newOtherHashAlgorithm) {
		String oldOtherHashAlgorithm = otherHashAlgorithm;
		otherHashAlgorithm = newOtherHashAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__OTHER_HASH_ALGORITHM, oldOtherHashAlgorithm, otherHashAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationMethod(Integer newAuthenticationMethod) {
		Integer oldAuthenticationMethod = authenticationMethod;
		authenticationMethod = newAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAuthenticationMethod() {
		return otherAuthenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAuthenticationMethod(String newOtherAuthenticationMethod) {
		String oldOtherAuthenticationMethod = otherAuthenticationMethod;
		otherAuthenticationMethod = newOtherAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__OTHER_AUTHENTICATION_METHOD, oldOtherAuthenticationMethod, otherAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(Integer newGroupId) {
		Integer oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(String newVendorID) {
		String oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IKESA_ENDPOINT__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IKESA_ENDPOINT__INITIATOR_COOKIE:
				return getInitiatorCookie();
			case CimPackage.CIM_IKESA_ENDPOINT__RESPONDER_COOKIE:
				return getResponderCookie();
			case CimPackage.CIM_IKESA_ENDPOINT__CIPHER_ALGORITHM:
				return getCipherAlgorithm();
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_CIPHER_ALGORITHM:
				return getOtherCipherAlgorithm();
			case CimPackage.CIM_IKESA_ENDPOINT__HASH_ALGORITHM:
				return getHashAlgorithm();
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_HASH_ALGORITHM:
				return getOtherHashAlgorithm();
			case CimPackage.CIM_IKESA_ENDPOINT__AUTHENTICATION_METHOD:
				return getAuthenticationMethod();
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				return getOtherAuthenticationMethod();
			case CimPackage.CIM_IKESA_ENDPOINT__GROUP_ID:
				return getGroupId();
			case CimPackage.CIM_IKESA_ENDPOINT__VENDOR_ID:
				return getVendorID();
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
			case CimPackage.CIM_IKESA_ENDPOINT__INITIATOR_COOKIE:
				setInitiatorCookie((Long)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__RESPONDER_COOKIE:
				setResponderCookie((Long)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__CIPHER_ALGORITHM:
				setCipherAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_CIPHER_ALGORITHM:
				setOtherCipherAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__HASH_ALGORITHM:
				setHashAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_HASH_ALGORITHM:
				setOtherHashAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__AUTHENTICATION_METHOD:
				setAuthenticationMethod((Integer)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod((String)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__GROUP_ID:
				setGroupId((Integer)newValue);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__VENDOR_ID:
				setVendorID((String)newValue);
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
			case CimPackage.CIM_IKESA_ENDPOINT__INITIATOR_COOKIE:
				setInitiatorCookie(INITIATOR_COOKIE_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__RESPONDER_COOKIE:
				setResponderCookie(RESPONDER_COOKIE_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__CIPHER_ALGORITHM:
				setCipherAlgorithm(CIPHER_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_CIPHER_ALGORITHM:
				setOtherCipherAlgorithm(OTHER_CIPHER_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__HASH_ALGORITHM:
				setHashAlgorithm(HASH_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_HASH_ALGORITHM:
				setOtherHashAlgorithm(OTHER_HASH_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__AUTHENTICATION_METHOD:
				setAuthenticationMethod(AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod(OTHER_AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IKESA_ENDPOINT__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
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
			case CimPackage.CIM_IKESA_ENDPOINT__INITIATOR_COOKIE:
				return INITIATOR_COOKIE_EDEFAULT == null ? initiatorCookie != null : !INITIATOR_COOKIE_EDEFAULT.equals(initiatorCookie);
			case CimPackage.CIM_IKESA_ENDPOINT__RESPONDER_COOKIE:
				return RESPONDER_COOKIE_EDEFAULT == null ? responderCookie != null : !RESPONDER_COOKIE_EDEFAULT.equals(responderCookie);
			case CimPackage.CIM_IKESA_ENDPOINT__CIPHER_ALGORITHM:
				return CIPHER_ALGORITHM_EDEFAULT == null ? cipherAlgorithm != null : !CIPHER_ALGORITHM_EDEFAULT.equals(cipherAlgorithm);
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_CIPHER_ALGORITHM:
				return OTHER_CIPHER_ALGORITHM_EDEFAULT == null ? otherCipherAlgorithm != null : !OTHER_CIPHER_ALGORITHM_EDEFAULT.equals(otherCipherAlgorithm);
			case CimPackage.CIM_IKESA_ENDPOINT__HASH_ALGORITHM:
				return HASH_ALGORITHM_EDEFAULT == null ? hashAlgorithm != null : !HASH_ALGORITHM_EDEFAULT.equals(hashAlgorithm);
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_HASH_ALGORITHM:
				return OTHER_HASH_ALGORITHM_EDEFAULT == null ? otherHashAlgorithm != null : !OTHER_HASH_ALGORITHM_EDEFAULT.equals(otherHashAlgorithm);
			case CimPackage.CIM_IKESA_ENDPOINT__AUTHENTICATION_METHOD:
				return AUTHENTICATION_METHOD_EDEFAULT == null ? authenticationMethod != null : !AUTHENTICATION_METHOD_EDEFAULT.equals(authenticationMethod);
			case CimPackage.CIM_IKESA_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				return OTHER_AUTHENTICATION_METHOD_EDEFAULT == null ? otherAuthenticationMethod != null : !OTHER_AUTHENTICATION_METHOD_EDEFAULT.equals(otherAuthenticationMethod);
			case CimPackage.CIM_IKESA_ENDPOINT__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case CimPackage.CIM_IKESA_ENDPOINT__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
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
		result.append(" (InitiatorCookie: ");
		result.append(initiatorCookie);
		result.append(", ResponderCookie: ");
		result.append(responderCookie);
		result.append(", CipherAlgorithm: ");
		result.append(cipherAlgorithm);
		result.append(", OtherCipherAlgorithm: ");
		result.append(otherCipherAlgorithm);
		result.append(", HashAlgorithm: ");
		result.append(hashAlgorithm);
		result.append(", OtherHashAlgorithm: ");
		result.append(otherHashAlgorithm);
		result.append(", AuthenticationMethod: ");
		result.append(authenticationMethod);
		result.append(", OtherAuthenticationMethod: ");
		result.append(otherAuthenticationMethod);
		result.append(", GroupId: ");
		result.append(groupId);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(')');
		return result.toString();
	}

} //CIM_IKESAEndpointImpl
