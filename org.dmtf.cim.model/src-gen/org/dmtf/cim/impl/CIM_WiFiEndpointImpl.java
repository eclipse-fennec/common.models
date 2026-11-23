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

import org.dmtf.cim.CIM_WiFiEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getIEEE8021xAuthenticationProtocol <em>IEEE802 1x Authentication Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getAccessPointAddress <em>Access Point Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointImpl#getAssociated <em>Associated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiEndpointImpl extends CIM_LANEndpointImpl implements CIM_WiFiEndpoint {
	/**
	 * The default value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCRYPTION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer encryptionMethod = ENCRYPTION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEncryptionMethod() <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENCRYPTION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEncryptionMethod() <em>Other Encryption Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected String otherEncryptionMethod = OTHER_ENCRYPTION_METHOD_EDEFAULT;

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
	 * The default value of the '{@link #getIEEE8021xAuthenticationProtocol() <em>IEEE802 1x Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEEE8021xAuthenticationProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IEEE802_1X_AUTHENTICATION_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIEEE8021xAuthenticationProtocol() <em>IEEE802 1x Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEEE8021xAuthenticationProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer ieee8021xAuthenticationProtocol = IEEE802_1X_AUTHENTICATION_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPointAddress() <em>Access Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPointAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_POINT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPointAddress() <em>Access Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPointAddress()
	 * @generated
	 * @ordered
	 */
	protected String accessPointAddress = ACCESS_POINT_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBSSType() <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSSType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BSS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBSSType() <em>BSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSSType()
	 * @generated
	 * @ordered
	 */
	protected Integer bssType = BSS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociated() <em>Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSOCIATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociated() <em>Associated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociated()
	 * @generated
	 * @ordered
	 */
	protected Boolean associated = ASSOCIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncryptionMethod() {
		return encryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionMethod(Integer newEncryptionMethod) {
		Integer oldEncryptionMethod = encryptionMethod;
		encryptionMethod = newEncryptionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__ENCRYPTION_METHOD, oldEncryptionMethod, encryptionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEncryptionMethod() {
		return otherEncryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEncryptionMethod(String newOtherEncryptionMethod) {
		String oldOtherEncryptionMethod = otherEncryptionMethod;
		otherEncryptionMethod = newOtherEncryptionMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__OTHER_ENCRYPTION_METHOD, oldOtherEncryptionMethod, otherEncryptionMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__OTHER_AUTHENTICATION_METHOD, oldOtherAuthenticationMethod, otherAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIEEE8021xAuthenticationProtocol() {
		return ieee8021xAuthenticationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIEEE8021xAuthenticationProtocol(Integer newIEEE8021xAuthenticationProtocol) {
		Integer oldIEEE8021xAuthenticationProtocol = ieee8021xAuthenticationProtocol;
		ieee8021xAuthenticationProtocol = newIEEE8021xAuthenticationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__IEEE802_1X_AUTHENTICATION_PROTOCOL, oldIEEE8021xAuthenticationProtocol, ieee8021xAuthenticationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPointAddress() {
		return accessPointAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPointAddress(String newAccessPointAddress) {
		String oldAccessPointAddress = accessPointAddress;
		accessPointAddress = newAccessPointAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__ACCESS_POINT_ADDRESS, oldAccessPointAddress, accessPointAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBSSType() {
		return bssType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBSSType(Integer newBSSType) {
		Integer oldBSSType = bssType;
		bssType = newBSSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__BSS_TYPE, oldBSSType, bssType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAssociated() {
		return associated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociated(Boolean newAssociated) {
		Boolean oldAssociated = associated;
		associated = newAssociated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT__ASSOCIATED, oldAssociated, associated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_ENDPOINT__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_ENCRYPTION_METHOD:
				return getOtherEncryptionMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT__AUTHENTICATION_METHOD:
				return getAuthenticationMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				return getOtherAuthenticationMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT__IEEE802_1X_AUTHENTICATION_PROTOCOL:
				return getIEEE8021xAuthenticationProtocol();
			case CimPackage.CIM_WI_FI_ENDPOINT__ACCESS_POINT_ADDRESS:
				return getAccessPointAddress();
			case CimPackage.CIM_WI_FI_ENDPOINT__BSS_TYPE:
				return getBSSType();
			case CimPackage.CIM_WI_FI_ENDPOINT__ASSOCIATED:
				return getAssociated();
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
			case CimPackage.CIM_WI_FI_ENDPOINT__ENCRYPTION_METHOD:
				setEncryptionMethod((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__AUTHENTICATION_METHOD:
				setAuthenticationMethod((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__IEEE802_1X_AUTHENTICATION_PROTOCOL:
				setIEEE8021xAuthenticationProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__ACCESS_POINT_ADDRESS:
				setAccessPointAddress((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__BSS_TYPE:
				setBSSType((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__ASSOCIATED:
				setAssociated((Boolean)newValue);
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
			case CimPackage.CIM_WI_FI_ENDPOINT__ENCRYPTION_METHOD:
				setEncryptionMethod(ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod(OTHER_ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__AUTHENTICATION_METHOD:
				setAuthenticationMethod(AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod(OTHER_AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__IEEE802_1X_AUTHENTICATION_PROTOCOL:
				setIEEE8021xAuthenticationProtocol(IEEE802_1X_AUTHENTICATION_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__ACCESS_POINT_ADDRESS:
				setAccessPointAddress(ACCESS_POINT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__BSS_TYPE:
				setBSSType(BSS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT__ASSOCIATED:
				setAssociated(ASSOCIATED_EDEFAULT);
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
			case CimPackage.CIM_WI_FI_ENDPOINT__ENCRYPTION_METHOD:
				return ENCRYPTION_METHOD_EDEFAULT == null ? encryptionMethod != null : !ENCRYPTION_METHOD_EDEFAULT.equals(encryptionMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_ENCRYPTION_METHOD:
				return OTHER_ENCRYPTION_METHOD_EDEFAULT == null ? otherEncryptionMethod != null : !OTHER_ENCRYPTION_METHOD_EDEFAULT.equals(otherEncryptionMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT__AUTHENTICATION_METHOD:
				return AUTHENTICATION_METHOD_EDEFAULT == null ? authenticationMethod != null : !AUTHENTICATION_METHOD_EDEFAULT.equals(authenticationMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT__OTHER_AUTHENTICATION_METHOD:
				return OTHER_AUTHENTICATION_METHOD_EDEFAULT == null ? otherAuthenticationMethod != null : !OTHER_AUTHENTICATION_METHOD_EDEFAULT.equals(otherAuthenticationMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT__IEEE802_1X_AUTHENTICATION_PROTOCOL:
				return IEEE802_1X_AUTHENTICATION_PROTOCOL_EDEFAULT == null ? ieee8021xAuthenticationProtocol != null : !IEEE802_1X_AUTHENTICATION_PROTOCOL_EDEFAULT.equals(ieee8021xAuthenticationProtocol);
			case CimPackage.CIM_WI_FI_ENDPOINT__ACCESS_POINT_ADDRESS:
				return ACCESS_POINT_ADDRESS_EDEFAULT == null ? accessPointAddress != null : !ACCESS_POINT_ADDRESS_EDEFAULT.equals(accessPointAddress);
			case CimPackage.CIM_WI_FI_ENDPOINT__BSS_TYPE:
				return BSS_TYPE_EDEFAULT == null ? bssType != null : !BSS_TYPE_EDEFAULT.equals(bssType);
			case CimPackage.CIM_WI_FI_ENDPOINT__ASSOCIATED:
				return ASSOCIATED_EDEFAULT == null ? associated != null : !ASSOCIATED_EDEFAULT.equals(associated);
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
		result.append(" (EncryptionMethod: ");
		result.append(encryptionMethod);
		result.append(", OtherEncryptionMethod: ");
		result.append(otherEncryptionMethod);
		result.append(", AuthenticationMethod: ");
		result.append(authenticationMethod);
		result.append(", OtherAuthenticationMethod: ");
		result.append(otherAuthenticationMethod);
		result.append(", IEEE8021xAuthenticationProtocol: ");
		result.append(ieee8021xAuthenticationProtocol);
		result.append(", AccessPointAddress: ");
		result.append(accessPointAddress);
		result.append(", BSSType: ");
		result.append(bssType);
		result.append(", Associated: ");
		result.append(associated);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiEndpointImpl
