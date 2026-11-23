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

import org.dmtf.cim.CIM_RemoveDirectoryAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Remove Directory Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoveDirectoryActionImpl#getMustBeEmpty <em>Must Be Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RemoveDirectoryActionImpl extends CIM_DirectoryActionImpl implements CIM_RemoveDirectoryAction {
	/**
	 * The default value of the '{@link #getMustBeEmpty() <em>Must Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUST_BE_EMPTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustBeEmpty() <em>Must Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeEmpty()
	 * @generated
	 * @ordered
	 */
	protected Boolean mustBeEmpty = MUST_BE_EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RemoveDirectoryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RemoveDirectoryAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMustBeEmpty() {
		return mustBeEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustBeEmpty(Boolean newMustBeEmpty) {
		Boolean oldMustBeEmpty = mustBeEmpty;
		mustBeEmpty = newMustBeEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOVE_DIRECTORY_ACTION__MUST_BE_EMPTY, oldMustBeEmpty, mustBeEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REMOVE_DIRECTORY_ACTION__MUST_BE_EMPTY:
				return getMustBeEmpty();
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
			case CimPackage.CIM_REMOVE_DIRECTORY_ACTION__MUST_BE_EMPTY:
				setMustBeEmpty((Boolean)newValue);
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
			case CimPackage.CIM_REMOVE_DIRECTORY_ACTION__MUST_BE_EMPTY:
				setMustBeEmpty(MUST_BE_EMPTY_EDEFAULT);
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
			case CimPackage.CIM_REMOVE_DIRECTORY_ACTION__MUST_BE_EMPTY:
				return MUST_BE_EMPTY_EDEFAULT == null ? mustBeEmpty != null : !MUST_BE_EMPTY_EDEFAULT.equals(mustBeEmpty);
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
		result.append(" (MustBeEmpty: ");
		result.append(mustBeEmpty);
		result.append(')');
		return result.toString();
	}

} //CIM_RemoveDirectoryActionImpl
