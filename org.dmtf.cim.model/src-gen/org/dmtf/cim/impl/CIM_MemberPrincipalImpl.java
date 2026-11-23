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

import org.dmtf.cim.CIM_MemberPrincipal;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Member Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemberPrincipalImpl#getUserAccessBy <em>User Access By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemberPrincipalImpl extends CIM_MemberOfCollectionImpl implements CIM_MemberPrincipal {
	/**
	 * The default value of the '{@link #getUserAccessBy() <em>User Access By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAccessBy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USER_ACCESS_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAccessBy() <em>User Access By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAccessBy()
	 * @generated
	 * @ordered
	 */
	protected Integer userAccessBy = USER_ACCESS_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemberPrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemberPrincipal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUserAccessBy() {
		return userAccessBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAccessBy(Integer newUserAccessBy) {
		Integer oldUserAccessBy = userAccessBy;
		userAccessBy = newUserAccessBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMBER_PRINCIPAL__USER_ACCESS_BY, oldUserAccessBy, userAccessBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMBER_PRINCIPAL__USER_ACCESS_BY:
				return getUserAccessBy();
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
			case CimPackage.CIM_MEMBER_PRINCIPAL__USER_ACCESS_BY:
				setUserAccessBy((Integer)newValue);
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
			case CimPackage.CIM_MEMBER_PRINCIPAL__USER_ACCESS_BY:
				setUserAccessBy(USER_ACCESS_BY_EDEFAULT);
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
			case CimPackage.CIM_MEMBER_PRINCIPAL__USER_ACCESS_BY:
				return USER_ACCESS_BY_EDEFAULT == null ? userAccessBy != null : !USER_ACCESS_BY_EDEFAULT.equals(userAccessBy);
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
		result.append(" (UserAccessBy: ");
		result.append(userAccessBy);
		result.append(')');
		return result.toString();
	}

} //CIM_MemberPrincipalImpl
