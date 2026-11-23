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

import org.dmtf.cim.CIM_BIOSPassword;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Password</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSPasswordImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSPasswordImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSPasswordImpl#getPasswordEncoding <em>Password Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSPasswordImpl#getIsSet <em>Is Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSPasswordImpl extends CIM_BIOSAttributeImpl implements CIM_BIOSPassword {
	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Long minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordEncoding() <em>Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final Long PASSWORD_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordEncoding() <em>Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordEncoding()
	 * @generated
	 * @ordered
	 */
	protected Long passwordEncoding = PASSWORD_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSet()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSet()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSet = IS_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSPasswordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSPassword();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(Long newMinLength) {
		Long oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_PASSWORD__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Long newMaxLength) {
		Long oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_PASSWORD__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPasswordEncoding() {
		return passwordEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordEncoding(Long newPasswordEncoding) {
		Long oldPasswordEncoding = passwordEncoding;
		passwordEncoding = newPasswordEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_PASSWORD__PASSWORD_ENCODING, oldPasswordEncoding, passwordEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSet() {
		return isSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSet(Boolean newIsSet) {
		Boolean oldIsSet = isSet;
		isSet = newIsSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_PASSWORD__IS_SET, oldIsSet, isSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_PASSWORD__MIN_LENGTH:
				return getMinLength();
			case CimPackage.CIM_BIOS_PASSWORD__MAX_LENGTH:
				return getMaxLength();
			case CimPackage.CIM_BIOS_PASSWORD__PASSWORD_ENCODING:
				return getPasswordEncoding();
			case CimPackage.CIM_BIOS_PASSWORD__IS_SET:
				return getIsSet();
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
			case CimPackage.CIM_BIOS_PASSWORD__MIN_LENGTH:
				setMinLength((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__MAX_LENGTH:
				setMaxLength((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__PASSWORD_ENCODING:
				setPasswordEncoding((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__IS_SET:
				setIsSet((Boolean)newValue);
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
			case CimPackage.CIM_BIOS_PASSWORD__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__PASSWORD_ENCODING:
				setPasswordEncoding(PASSWORD_ENCODING_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_PASSWORD__IS_SET:
				setIsSet(IS_SET_EDEFAULT);
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
			case CimPackage.CIM_BIOS_PASSWORD__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case CimPackage.CIM_BIOS_PASSWORD__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case CimPackage.CIM_BIOS_PASSWORD__PASSWORD_ENCODING:
				return PASSWORD_ENCODING_EDEFAULT == null ? passwordEncoding != null : !PASSWORD_ENCODING_EDEFAULT.equals(passwordEncoding);
			case CimPackage.CIM_BIOS_PASSWORD__IS_SET:
				return IS_SET_EDEFAULT == null ? isSet != null : !IS_SET_EDEFAULT.equals(isSet);
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
		result.append(" (MinLength: ");
		result.append(minLength);
		result.append(", MaxLength: ");
		result.append(maxLength);
		result.append(", PasswordEncoding: ");
		result.append(passwordEncoding);
		result.append(", IsSet: ");
		result.append(isSet);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSPasswordImpl
