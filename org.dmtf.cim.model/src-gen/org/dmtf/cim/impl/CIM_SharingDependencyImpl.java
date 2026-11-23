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

import org.dmtf.cim.CIM_SharingDependency;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Sharing Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SharingDependencyImpl#getCurrentAccess <em>Current Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SharingDependencyImpl#getOtherCurrentAccess <em>Other Current Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SharingDependencyImpl extends CIM_HostedDependencyImpl implements CIM_SharingDependency {
	/**
	 * The default value of the '{@link #getCurrentAccess() <em>Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentAccess() <em>Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer currentAccess = CURRENT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCurrentAccess() <em>Other Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CURRENT_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCurrentAccess() <em>Other Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentAccess()
	 * @generated
	 * @ordered
	 */
	protected String otherCurrentAccess = OTHER_CURRENT_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SharingDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SharingDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentAccess() {
		return currentAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentAccess(Integer newCurrentAccess) {
		Integer oldCurrentAccess = currentAccess;
		currentAccess = newCurrentAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SHARING_DEPENDENCY__CURRENT_ACCESS, oldCurrentAccess, currentAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCurrentAccess() {
		return otherCurrentAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCurrentAccess(String newOtherCurrentAccess) {
		String oldOtherCurrentAccess = otherCurrentAccess;
		otherCurrentAccess = newOtherCurrentAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SHARING_DEPENDENCY__OTHER_CURRENT_ACCESS, oldOtherCurrentAccess, otherCurrentAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SHARING_DEPENDENCY__CURRENT_ACCESS:
				return getCurrentAccess();
			case CimPackage.CIM_SHARING_DEPENDENCY__OTHER_CURRENT_ACCESS:
				return getOtherCurrentAccess();
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
			case CimPackage.CIM_SHARING_DEPENDENCY__CURRENT_ACCESS:
				setCurrentAccess((Integer)newValue);
				return;
			case CimPackage.CIM_SHARING_DEPENDENCY__OTHER_CURRENT_ACCESS:
				setOtherCurrentAccess((String)newValue);
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
			case CimPackage.CIM_SHARING_DEPENDENCY__CURRENT_ACCESS:
				setCurrentAccess(CURRENT_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_SHARING_DEPENDENCY__OTHER_CURRENT_ACCESS:
				setOtherCurrentAccess(OTHER_CURRENT_ACCESS_EDEFAULT);
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
			case CimPackage.CIM_SHARING_DEPENDENCY__CURRENT_ACCESS:
				return CURRENT_ACCESS_EDEFAULT == null ? currentAccess != null : !CURRENT_ACCESS_EDEFAULT.equals(currentAccess);
			case CimPackage.CIM_SHARING_DEPENDENCY__OTHER_CURRENT_ACCESS:
				return OTHER_CURRENT_ACCESS_EDEFAULT == null ? otherCurrentAccess != null : !OTHER_CURRENT_ACCESS_EDEFAULT.equals(otherCurrentAccess);
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
		result.append(" (CurrentAccess: ");
		result.append(currentAccess);
		result.append(", OtherCurrentAccess: ");
		result.append(otherCurrentAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_SharingDependencyImpl
