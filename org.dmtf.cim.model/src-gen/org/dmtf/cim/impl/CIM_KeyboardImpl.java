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

import org.dmtf.cim.CIM_Keyboard;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Keyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_KeyboardImpl#getNumberOfFunctionKeys <em>Number Of Function Keys</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_KeyboardImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_KeyboardImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_KeyboardImpl extends CIM_UserDeviceImpl implements CIM_Keyboard {
	/**
	 * The default value of the '{@link #getNumberOfFunctionKeys() <em>Number Of Function Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFunctionKeys()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_FUNCTION_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfFunctionKeys() <em>Number Of Function Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFunctionKeys()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfFunctionKeys = NUMBER_OF_FUNCTION_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected String layout = LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected Integer password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_KeyboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Keyboard();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfFunctionKeys() {
		return numberOfFunctionKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfFunctionKeys(Integer newNumberOfFunctionKeys) {
		Integer oldNumberOfFunctionKeys = numberOfFunctionKeys;
		numberOfFunctionKeys = newNumberOfFunctionKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KEYBOARD__NUMBER_OF_FUNCTION_KEYS, oldNumberOfFunctionKeys, numberOfFunctionKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(String newLayout) {
		String oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KEYBOARD__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(Integer newPassword) {
		Integer oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_KEYBOARD__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_KEYBOARD__NUMBER_OF_FUNCTION_KEYS:
				return getNumberOfFunctionKeys();
			case CimPackage.CIM_KEYBOARD__LAYOUT:
				return getLayout();
			case CimPackage.CIM_KEYBOARD__PASSWORD:
				return getPassword();
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
			case CimPackage.CIM_KEYBOARD__NUMBER_OF_FUNCTION_KEYS:
				setNumberOfFunctionKeys((Integer)newValue);
				return;
			case CimPackage.CIM_KEYBOARD__LAYOUT:
				setLayout((String)newValue);
				return;
			case CimPackage.CIM_KEYBOARD__PASSWORD:
				setPassword((Integer)newValue);
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
			case CimPackage.CIM_KEYBOARD__NUMBER_OF_FUNCTION_KEYS:
				setNumberOfFunctionKeys(NUMBER_OF_FUNCTION_KEYS_EDEFAULT);
				return;
			case CimPackage.CIM_KEYBOARD__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case CimPackage.CIM_KEYBOARD__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case CimPackage.CIM_KEYBOARD__NUMBER_OF_FUNCTION_KEYS:
				return NUMBER_OF_FUNCTION_KEYS_EDEFAULT == null ? numberOfFunctionKeys != null : !NUMBER_OF_FUNCTION_KEYS_EDEFAULT.equals(numberOfFunctionKeys);
			case CimPackage.CIM_KEYBOARD__LAYOUT:
				return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
			case CimPackage.CIM_KEYBOARD__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (NumberOfFunctionKeys: ");
		result.append(numberOfFunctionKeys);
		result.append(", Layout: ");
		result.append(layout);
		result.append(", Password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //CIM_KeyboardImpl
