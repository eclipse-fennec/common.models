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

import org.dmtf.cim.CIM_SupportAccess;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Support Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SupportAccessImpl#getSupportAccessId <em>Support Access Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SupportAccessImpl#getCommunicationInfo <em>Communication Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SupportAccessImpl#getCommunicationMode <em>Communication Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SupportAccessImpl#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SupportAccessImpl extends CIM_ManagedElementImpl implements CIM_SupportAccess {
	/**
	 * The default value of the '{@link #getSupportAccessId() <em>Support Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportAccessId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_ACCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportAccessId() <em>Support Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportAccessId()
	 * @generated
	 * @ordered
	 */
	protected String supportAccessId = SUPPORT_ACCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationInfo() <em>Communication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationInfo() <em>Communication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInfo()
	 * @generated
	 * @ordered
	 */
	protected String communicationInfo = COMMUNICATION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationMode() <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMUNICATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationMode() <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer communicationMode = COMMUNICATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SupportAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SupportAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupportAccessId() {
		return supportAccessId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportAccessId(String newSupportAccessId) {
		String oldSupportAccessId = supportAccessId;
		supportAccessId = newSupportAccessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUPPORT_ACCESS__SUPPORT_ACCESS_ID, oldSupportAccessId, supportAccessId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationInfo() {
		return communicationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationInfo(String newCommunicationInfo) {
		String oldCommunicationInfo = communicationInfo;
		communicationInfo = newCommunicationInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_INFO, oldCommunicationInfo, communicationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommunicationMode() {
		return communicationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationMode(Integer newCommunicationMode) {
		Integer oldCommunicationMode = communicationMode;
		communicationMode = newCommunicationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_MODE, oldCommunicationMode, communicationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUPPORT_ACCESS__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SUPPORT_ACCESS__SUPPORT_ACCESS_ID:
				return getSupportAccessId();
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_INFO:
				return getCommunicationInfo();
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_MODE:
				return getCommunicationMode();
			case CimPackage.CIM_SUPPORT_ACCESS__LOCALE:
				return getLocale();
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
			case CimPackage.CIM_SUPPORT_ACCESS__SUPPORT_ACCESS_ID:
				setSupportAccessId((String)newValue);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_INFO:
				setCommunicationInfo((String)newValue);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_MODE:
				setCommunicationMode((Integer)newValue);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__LOCALE:
				setLocale((String)newValue);
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
			case CimPackage.CIM_SUPPORT_ACCESS__SUPPORT_ACCESS_ID:
				setSupportAccessId(SUPPORT_ACCESS_ID_EDEFAULT);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_INFO:
				setCommunicationInfo(COMMUNICATION_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_MODE:
				setCommunicationMode(COMMUNICATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_SUPPORT_ACCESS__LOCALE:
				setLocale(LOCALE_EDEFAULT);
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
			case CimPackage.CIM_SUPPORT_ACCESS__SUPPORT_ACCESS_ID:
				return SUPPORT_ACCESS_ID_EDEFAULT == null ? supportAccessId != null : !SUPPORT_ACCESS_ID_EDEFAULT.equals(supportAccessId);
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_INFO:
				return COMMUNICATION_INFO_EDEFAULT == null ? communicationInfo != null : !COMMUNICATION_INFO_EDEFAULT.equals(communicationInfo);
			case CimPackage.CIM_SUPPORT_ACCESS__COMMUNICATION_MODE:
				return COMMUNICATION_MODE_EDEFAULT == null ? communicationMode != null : !COMMUNICATION_MODE_EDEFAULT.equals(communicationMode);
			case CimPackage.CIM_SUPPORT_ACCESS__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
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
		result.append(" (SupportAccessId: ");
		result.append(supportAccessId);
		result.append(", CommunicationInfo: ");
		result.append(communicationInfo);
		result.append(", CommunicationMode: ");
		result.append(communicationMode);
		result.append(", Locale: ");
		result.append(locale);
		result.append(')');
		return result.toString();
	}

} //CIM_SupportAccessImpl
