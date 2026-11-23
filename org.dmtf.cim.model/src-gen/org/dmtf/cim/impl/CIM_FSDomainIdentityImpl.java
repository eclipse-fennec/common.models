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

import org.dmtf.cim.CIM_FSDomainIdentity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FS Domain Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSDomainIdentityImpl#getPrincipalID <em>Principal ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSDomainIdentityImpl#getDomainType <em>Domain Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSDomainIdentityImpl#getPrincipalType <em>Principal Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FSDomainIdentityImpl extends CIM_IdentityImpl implements CIM_FSDomainIdentity {
	/**
	 * The default value of the '{@link #getPrincipalID() <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINCIPAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipalID() <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalID()
	 * @generated
	 * @ordered
	 */
	protected String principalID = PRINCIPAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainType() <em>Domain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOMAIN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	protected Integer domainType = DOMAIN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipalType() <em>Principal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRINCIPAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipalType() <em>Principal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalType()
	 * @generated
	 * @ordered
	 */
	protected Integer principalType = PRINCIPAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FSDomainIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FSDomainIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrincipalID() {
		return principalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalID(String newPrincipalID) {
		String oldPrincipalID = principalID;
		principalID = newPrincipalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_ID, oldPrincipalID, principalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDomainType() {
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainType(Integer newDomainType) {
		Integer oldDomainType = domainType;
		domainType = newDomainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_DOMAIN_IDENTITY__DOMAIN_TYPE, oldDomainType, domainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrincipalType() {
		return principalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipalType(Integer newPrincipalType) {
		Integer oldPrincipalType = principalType;
		principalType = newPrincipalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_TYPE, oldPrincipalType, principalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_ID:
				return getPrincipalID();
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__DOMAIN_TYPE:
				return getDomainType();
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_TYPE:
				return getPrincipalType();
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
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_ID:
				setPrincipalID((String)newValue);
				return;
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__DOMAIN_TYPE:
				setDomainType((Integer)newValue);
				return;
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_TYPE:
				setPrincipalType((Integer)newValue);
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
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_ID:
				setPrincipalID(PRINCIPAL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__DOMAIN_TYPE:
				setDomainType(DOMAIN_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_TYPE:
				setPrincipalType(PRINCIPAL_TYPE_EDEFAULT);
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
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_ID:
				return PRINCIPAL_ID_EDEFAULT == null ? principalID != null : !PRINCIPAL_ID_EDEFAULT.equals(principalID);
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__DOMAIN_TYPE:
				return DOMAIN_TYPE_EDEFAULT == null ? domainType != null : !DOMAIN_TYPE_EDEFAULT.equals(domainType);
			case CimPackage.CIM_FS_DOMAIN_IDENTITY__PRINCIPAL_TYPE:
				return PRINCIPAL_TYPE_EDEFAULT == null ? principalType != null : !PRINCIPAL_TYPE_EDEFAULT.equals(principalType);
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
		result.append(" (PrincipalID: ");
		result.append(principalID);
		result.append(", DomainType: ");
		result.append(domainType);
		result.append(", PrincipalType: ");
		result.append(principalType);
		result.append(')');
		return result.toString();
	}

} //CIM_FSDomainIdentityImpl
