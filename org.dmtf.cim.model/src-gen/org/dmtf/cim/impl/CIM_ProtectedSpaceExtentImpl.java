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

import org.dmtf.cim.CIM_ProtectedSpaceExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protected Space Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtectedSpaceExtentImpl#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtectedSpaceExtentImpl extends CIM_StorageExtentImpl implements CIM_ProtectedSpaceExtent {
	/**
	 * The default value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepth = USER_DATA_STRIPE_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtectedSpaceExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtectedSpaceExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepth() {
		return userDataStripeDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepth(Long newUserDataStripeDepth) {
		Long oldUserDataStripeDepth = userDataStripeDepth;
		userDataStripeDepth = newUserDataStripeDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTECTED_SPACE_EXTENT__USER_DATA_STRIPE_DEPTH, oldUserDataStripeDepth, userDataStripeDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTECTED_SPACE_EXTENT__USER_DATA_STRIPE_DEPTH:
				return getUserDataStripeDepth();
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
			case CimPackage.CIM_PROTECTED_SPACE_EXTENT__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth((Long)newValue);
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
			case CimPackage.CIM_PROTECTED_SPACE_EXTENT__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth(USER_DATA_STRIPE_DEPTH_EDEFAULT);
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
			case CimPackage.CIM_PROTECTED_SPACE_EXTENT__USER_DATA_STRIPE_DEPTH:
				return USER_DATA_STRIPE_DEPTH_EDEFAULT == null ? userDataStripeDepth != null : !USER_DATA_STRIPE_DEPTH_EDEFAULT.equals(userDataStripeDepth);
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
		result.append(" (UserDataStripeDepth: ");
		result.append(userDataStripeDepth);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtectedSpaceExtentImpl
