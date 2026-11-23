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

import org.dmtf.cim.CIM_WiFiEndpointSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Endpoint Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getSSID <em>SSID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getBSSType <em>BSS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getOtherEncryptionMethod <em>Other Encryption Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getKeyIndex <em>Key Index</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getPSKValue <em>PSK Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointSettingsImpl#getPSKPassPhrase <em>PSK Pass Phrase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiEndpointSettingsImpl extends CIM_SettingDataImpl implements CIM_WiFiEndpointSettings {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;

	/**
	 * The default value of the '{@link #getKeyIndex() <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyIndex() <em>Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer keyIndex = KEY_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPSKValue() <em>PSK Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pskValue;

	/**
	 * The default value of the '{@link #getPSKPassPhrase() <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected static final String PSK_PASS_PHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPSKPassPhrase() <em>PSK Pass Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSKPassPhrase()
	 * @generated
	 * @ordered
	 */
	protected String pskPassPhrase = PSK_PASS_PHRASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiEndpointSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiEndpointSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSID() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSID(String newSSID) {
		String oldSSID = ssid;
		ssid = newSSID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__SSID, oldSSID, ssid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__BSS_TYPE, oldBSSType, bssType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD, oldEncryptionMethod, encryptionMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD, oldOtherEncryptionMethod, otherEncryptionMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD, oldOtherAuthenticationMethod, otherAuthenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKeys() {
		if (keys == null) {
			keys = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKeyIndex() {
		return keyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyIndex(Integer newKeyIndex) {
		Integer oldKeyIndex = keyIndex;
		keyIndex = newKeyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEY_INDEX, oldKeyIndex, keyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPSKValue() {
		if (pskValue == null) {
			pskValue = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_VALUE);
		}
		return pskValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPSKPassPhrase() {
		return pskPassPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPSKPassPhrase(String newPSKPassPhrase) {
		String oldPSKPassPhrase = pskPassPhrase;
		pskPassPhrase = newPSKPassPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE, oldPSKPassPhrase, pskPassPhrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				return getPriority();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__SSID:
				return getSSID();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				return getBSSType();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				return getOtherEncryptionMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				return getAuthenticationMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				return getOtherAuthenticationMethod();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEYS:
				return getKeys();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				return getKeyIndex();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				return getPSKValue();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				return getPSKPassPhrase();
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
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__SSID:
				setSSID((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				setBSSType((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				setEncryptionMethod((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				setAuthenticationMethod((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod((String)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				setKeyIndex((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				getPSKValue().clear();
				getPSKValue().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				setPSKPassPhrase((String)newValue);
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
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__SSID:
				setSSID(SSID_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				setBSSType(BSS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				setEncryptionMethod(ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				setOtherEncryptionMethod(OTHER_ENCRYPTION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				setAuthenticationMethod(AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				setOtherAuthenticationMethod(OTHER_AUTHENTICATION_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEYS:
				getKeys().clear();
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				setKeyIndex(KEY_INDEX_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				getPSKValue().clear();
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				setPSKPassPhrase(PSK_PASS_PHRASE_EDEFAULT);
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
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
				return BSS_TYPE_EDEFAULT == null ? bssType != null : !BSS_TYPE_EDEFAULT.equals(bssType);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
				return ENCRYPTION_METHOD_EDEFAULT == null ? encryptionMethod != null : !ENCRYPTION_METHOD_EDEFAULT.equals(encryptionMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
				return OTHER_ENCRYPTION_METHOD_EDEFAULT == null ? otherEncryptionMethod != null : !OTHER_ENCRYPTION_METHOD_EDEFAULT.equals(otherEncryptionMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
				return AUTHENTICATION_METHOD_EDEFAULT == null ? authenticationMethod != null : !AUTHENTICATION_METHOD_EDEFAULT.equals(authenticationMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
				return OTHER_AUTHENTICATION_METHOD_EDEFAULT == null ? otherAuthenticationMethod != null : !OTHER_AUTHENTICATION_METHOD_EDEFAULT.equals(otherAuthenticationMethod);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEYS:
				return keys != null && !keys.isEmpty();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
				return KEY_INDEX_EDEFAULT == null ? keyIndex != null : !KEY_INDEX_EDEFAULT.equals(keyIndex);
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
				return pskValue != null && !pskValue.isEmpty();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
				return PSK_PASS_PHRASE_EDEFAULT == null ? pskPassPhrase != null : !PSK_PASS_PHRASE_EDEFAULT.equals(pskPassPhrase);
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
		result.append(" (Priority: ");
		result.append(priority);
		result.append(", SSID: ");
		result.append(ssid);
		result.append(", BSSType: ");
		result.append(bssType);
		result.append(", EncryptionMethod: ");
		result.append(encryptionMethod);
		result.append(", OtherEncryptionMethod: ");
		result.append(otherEncryptionMethod);
		result.append(", AuthenticationMethod: ");
		result.append(authenticationMethod);
		result.append(", OtherAuthenticationMethod: ");
		result.append(otherAuthenticationMethod);
		result.append(", Keys: ");
		result.append(keys);
		result.append(", KeyIndex: ");
		result.append(keyIndex);
		result.append(", PSKValue: ");
		result.append(pskValue);
		result.append(", PSKPassPhrase: ");
		result.append(pskPassPhrase);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiEndpointSettingsImpl
