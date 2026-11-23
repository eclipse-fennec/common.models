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

import org.dmtf.cim.CIM_BiometricAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Biometric Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BiometricAuthenticationImpl#getTypeOfBiometric <em>Type Of Biometric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BiometricAuthenticationImpl#getOtherBiometric <em>Other Biometric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BiometricAuthenticationImpl#getPersonalIdentifier <em>Personal Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BiometricAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_BiometricAuthentication {
	/**
	 * The default value of the '{@link #getTypeOfBiometric() <em>Type Of Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfBiometric()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_BIOMETRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfBiometric() <em>Type Of Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfBiometric()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfBiometric = TYPE_OF_BIOMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherBiometric() <em>Other Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherBiometric()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_BIOMETRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherBiometric() <em>Other Biometric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherBiometric()
	 * @generated
	 * @ordered
	 */
	protected String otherBiometric = OTHER_BIOMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonalIdentifier() <em>Personal Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonalIdentifier() <em>Personal Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String personalIdentifier = PERSONAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BiometricAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BiometricAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfBiometric() {
		return typeOfBiometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfBiometric(Integer newTypeOfBiometric) {
		Integer oldTypeOfBiometric = typeOfBiometric;
		typeOfBiometric = newTypeOfBiometric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOMETRIC_AUTHENTICATION__TYPE_OF_BIOMETRIC, oldTypeOfBiometric, typeOfBiometric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherBiometric() {
		return otherBiometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherBiometric(String newOtherBiometric) {
		String oldOtherBiometric = otherBiometric;
		otherBiometric = newOtherBiometric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOMETRIC_AUTHENTICATION__OTHER_BIOMETRIC, oldOtherBiometric, otherBiometric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonalIdentifier() {
		return personalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalIdentifier(String newPersonalIdentifier) {
		String oldPersonalIdentifier = personalIdentifier;
		personalIdentifier = newPersonalIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOMETRIC_AUTHENTICATION__PERSONAL_IDENTIFIER, oldPersonalIdentifier, personalIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__TYPE_OF_BIOMETRIC:
				return getTypeOfBiometric();
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__OTHER_BIOMETRIC:
				return getOtherBiometric();
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__PERSONAL_IDENTIFIER:
				return getPersonalIdentifier();
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
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__TYPE_OF_BIOMETRIC:
				setTypeOfBiometric((Integer)newValue);
				return;
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__OTHER_BIOMETRIC:
				setOtherBiometric((String)newValue);
				return;
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__PERSONAL_IDENTIFIER:
				setPersonalIdentifier((String)newValue);
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
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__TYPE_OF_BIOMETRIC:
				setTypeOfBiometric(TYPE_OF_BIOMETRIC_EDEFAULT);
				return;
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__OTHER_BIOMETRIC:
				setOtherBiometric(OTHER_BIOMETRIC_EDEFAULT);
				return;
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__PERSONAL_IDENTIFIER:
				setPersonalIdentifier(PERSONAL_IDENTIFIER_EDEFAULT);
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
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__TYPE_OF_BIOMETRIC:
				return TYPE_OF_BIOMETRIC_EDEFAULT == null ? typeOfBiometric != null : !TYPE_OF_BIOMETRIC_EDEFAULT.equals(typeOfBiometric);
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__OTHER_BIOMETRIC:
				return OTHER_BIOMETRIC_EDEFAULT == null ? otherBiometric != null : !OTHER_BIOMETRIC_EDEFAULT.equals(otherBiometric);
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION__PERSONAL_IDENTIFIER:
				return PERSONAL_IDENTIFIER_EDEFAULT == null ? personalIdentifier != null : !PERSONAL_IDENTIFIER_EDEFAULT.equals(personalIdentifier);
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
		result.append(" (TypeOfBiometric: ");
		result.append(typeOfBiometric);
		result.append(", OtherBiometric: ");
		result.append(otherBiometric);
		result.append(", PersonalIdentifier: ");
		result.append(personalIdentifier);
		result.append(')');
		return result.toString();
	}

} //CIM_BiometricAuthenticationImpl
