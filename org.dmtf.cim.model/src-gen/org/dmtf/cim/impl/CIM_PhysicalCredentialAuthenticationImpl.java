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

import org.dmtf.cim.CIM_PhysicalCredentialAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Credential Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalCredentialAuthenticationImpl#getTypeOfCredential <em>Type Of Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalCredentialAuthenticationImpl#getOtherCredential <em>Other Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalCredentialAuthenticationImpl#getPhysicalIdentifier <em>Physical Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalCredentialAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_PhysicalCredentialAuthentication {
	/**
	 * The default value of the '{@link #getTypeOfCredential() <em>Type Of Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfCredential()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_CREDENTIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfCredential() <em>Type Of Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfCredential()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfCredential = TYPE_OF_CREDENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCredential() <em>Other Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCredential()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CREDENTIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCredential() <em>Other Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCredential()
	 * @generated
	 * @ordered
	 */
	protected String otherCredential = OTHER_CREDENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalIdentifier() <em>Physical Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalIdentifier() <em>Physical Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String physicalIdentifier = PHYSICAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalCredentialAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalCredentialAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfCredential() {
		return typeOfCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfCredential(Integer newTypeOfCredential) {
		Integer oldTypeOfCredential = typeOfCredential;
		typeOfCredential = newTypeOfCredential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__TYPE_OF_CREDENTIAL, oldTypeOfCredential, typeOfCredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCredential() {
		return otherCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCredential(String newOtherCredential) {
		String oldOtherCredential = otherCredential;
		otherCredential = newOtherCredential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__OTHER_CREDENTIAL, oldOtherCredential, otherCredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalIdentifier() {
		return physicalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalIdentifier(String newPhysicalIdentifier) {
		String oldPhysicalIdentifier = physicalIdentifier;
		physicalIdentifier = newPhysicalIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__PHYSICAL_IDENTIFIER, oldPhysicalIdentifier, physicalIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__TYPE_OF_CREDENTIAL:
				return getTypeOfCredential();
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__OTHER_CREDENTIAL:
				return getOtherCredential();
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__PHYSICAL_IDENTIFIER:
				return getPhysicalIdentifier();
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
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__TYPE_OF_CREDENTIAL:
				setTypeOfCredential((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__OTHER_CREDENTIAL:
				setOtherCredential((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__PHYSICAL_IDENTIFIER:
				setPhysicalIdentifier((String)newValue);
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
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__TYPE_OF_CREDENTIAL:
				setTypeOfCredential(TYPE_OF_CREDENTIAL_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__OTHER_CREDENTIAL:
				setOtherCredential(OTHER_CREDENTIAL_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__PHYSICAL_IDENTIFIER:
				setPhysicalIdentifier(PHYSICAL_IDENTIFIER_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__TYPE_OF_CREDENTIAL:
				return TYPE_OF_CREDENTIAL_EDEFAULT == null ? typeOfCredential != null : !TYPE_OF_CREDENTIAL_EDEFAULT.equals(typeOfCredential);
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__OTHER_CREDENTIAL:
				return OTHER_CREDENTIAL_EDEFAULT == null ? otherCredential != null : !OTHER_CREDENTIAL_EDEFAULT.equals(otherCredential);
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION__PHYSICAL_IDENTIFIER:
				return PHYSICAL_IDENTIFIER_EDEFAULT == null ? physicalIdentifier != null : !PHYSICAL_IDENTIFIER_EDEFAULT.equals(physicalIdentifier);
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
		result.append(" (TypeOfCredential: ");
		result.append(typeOfCredential);
		result.append(", OtherCredential: ");
		result.append(otherCredential);
		result.append(", PhysicalIdentifier: ");
		result.append(physicalIdentifier);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalCredentialAuthenticationImpl
