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

import org.dmtf.cim.CIM_J2eeNotification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeNotificationImpl#getIndicationType <em>Indication Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeNotificationImpl#getOtherIndicationType <em>Other Indication Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeNotificationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeNotificationImpl#getUserData <em>User Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeNotificationImpl extends CIM_ProcessIndicationImpl implements CIM_J2eeNotification {
	/**
	 * The default value of the '{@link #getIndicationType() <em>Indication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicationType() <em>Indication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationType()
	 * @generated
	 * @ordered
	 */
	protected Integer indicationType = INDICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIndicationType() <em>Other Indication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIndicationType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INDICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIndicationType() <em>Other Indication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIndicationType()
	 * @generated
	 * @ordered
	 */
	protected String otherIndicationType = OTHER_INDICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected String userData = USER_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeNotification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIndicationType() {
		return indicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndicationType(Integer newIndicationType) {
		Integer oldIndicationType = indicationType;
		indicationType = newIndicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_NOTIFICATION__INDICATION_TYPE, oldIndicationType, indicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherIndicationType() {
		return otherIndicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIndicationType(String newOtherIndicationType) {
		String oldOtherIndicationType = otherIndicationType;
		otherIndicationType = newOtherIndicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_NOTIFICATION__OTHER_INDICATION_TYPE, oldOtherIndicationType, otherIndicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_NOTIFICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserData() {
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserData(String newUserData) {
		String oldUserData = userData;
		userData = newUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_NOTIFICATION__USER_DATA, oldUserData, userData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_NOTIFICATION__INDICATION_TYPE:
				return getIndicationType();
			case CimPackage.CIM_J2EE_NOTIFICATION__OTHER_INDICATION_TYPE:
				return getOtherIndicationType();
			case CimPackage.CIM_J2EE_NOTIFICATION__MESSAGE:
				return getMessage();
			case CimPackage.CIM_J2EE_NOTIFICATION__USER_DATA:
				return getUserData();
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
			case CimPackage.CIM_J2EE_NOTIFICATION__INDICATION_TYPE:
				setIndicationType((Integer)newValue);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__OTHER_INDICATION_TYPE:
				setOtherIndicationType((String)newValue);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__MESSAGE:
				setMessage((String)newValue);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__USER_DATA:
				setUserData((String)newValue);
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
			case CimPackage.CIM_J2EE_NOTIFICATION__INDICATION_TYPE:
				setIndicationType(INDICATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__OTHER_INDICATION_TYPE:
				setOtherIndicationType(OTHER_INDICATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_NOTIFICATION__USER_DATA:
				setUserData(USER_DATA_EDEFAULT);
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
			case CimPackage.CIM_J2EE_NOTIFICATION__INDICATION_TYPE:
				return INDICATION_TYPE_EDEFAULT == null ? indicationType != null : !INDICATION_TYPE_EDEFAULT.equals(indicationType);
			case CimPackage.CIM_J2EE_NOTIFICATION__OTHER_INDICATION_TYPE:
				return OTHER_INDICATION_TYPE_EDEFAULT == null ? otherIndicationType != null : !OTHER_INDICATION_TYPE_EDEFAULT.equals(otherIndicationType);
			case CimPackage.CIM_J2EE_NOTIFICATION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CimPackage.CIM_J2EE_NOTIFICATION__USER_DATA:
				return USER_DATA_EDEFAULT == null ? userData != null : !USER_DATA_EDEFAULT.equals(userData);
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
		result.append(" (IndicationType: ");
		result.append(indicationType);
		result.append(", OtherIndicationType: ");
		result.append(otherIndicationType);
		result.append(", Message: ");
		result.append(message);
		result.append(", UserData: ");
		result.append(userData);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeNotificationImpl
