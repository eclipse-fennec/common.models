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

import org.dmtf.cim.CIM_MaskingGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Masking Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingGroupImpl#getDeleteOnEmpty <em>Delete On Empty</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MaskingGroupImpl#getDeleteWhenBecomesUnassociated <em>Delete When Becomes Unassociated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MaskingGroupImpl extends CIM_SystemSpecificCollectionImpl implements CIM_MaskingGroup {
	/**
	 * The default value of the '{@link #getDeleteOnEmpty() <em>Delete On Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_EMPTY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteOnEmpty() <em>Delete On Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmpty()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnEmpty = DELETE_ON_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteWhenBecomesUnassociated() <em>Delete When Becomes Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteWhenBecomesUnassociated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_WHEN_BECOMES_UNASSOCIATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteWhenBecomesUnassociated() <em>Delete When Becomes Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteWhenBecomesUnassociated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteWhenBecomesUnassociated = DELETE_WHEN_BECOMES_UNASSOCIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MaskingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MaskingGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnEmpty() {
		return deleteOnEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnEmpty(Boolean newDeleteOnEmpty) {
		Boolean oldDeleteOnEmpty = deleteOnEmpty;
		deleteOnEmpty = newDeleteOnEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_GROUP__DELETE_ON_EMPTY, oldDeleteOnEmpty, deleteOnEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteWhenBecomesUnassociated() {
		return deleteWhenBecomesUnassociated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteWhenBecomesUnassociated(Boolean newDeleteWhenBecomesUnassociated) {
		Boolean oldDeleteWhenBecomesUnassociated = deleteWhenBecomesUnassociated;
		deleteWhenBecomesUnassociated = newDeleteWhenBecomesUnassociated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MASKING_GROUP__DELETE_WHEN_BECOMES_UNASSOCIATED, oldDeleteWhenBecomesUnassociated, deleteWhenBecomesUnassociated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MASKING_GROUP__DELETE_ON_EMPTY:
				return getDeleteOnEmpty();
			case CimPackage.CIM_MASKING_GROUP__DELETE_WHEN_BECOMES_UNASSOCIATED:
				return getDeleteWhenBecomesUnassociated();
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
			case CimPackage.CIM_MASKING_GROUP__DELETE_ON_EMPTY:
				setDeleteOnEmpty((Boolean)newValue);
				return;
			case CimPackage.CIM_MASKING_GROUP__DELETE_WHEN_BECOMES_UNASSOCIATED:
				setDeleteWhenBecomesUnassociated((Boolean)newValue);
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
			case CimPackage.CIM_MASKING_GROUP__DELETE_ON_EMPTY:
				setDeleteOnEmpty(DELETE_ON_EMPTY_EDEFAULT);
				return;
			case CimPackage.CIM_MASKING_GROUP__DELETE_WHEN_BECOMES_UNASSOCIATED:
				setDeleteWhenBecomesUnassociated(DELETE_WHEN_BECOMES_UNASSOCIATED_EDEFAULT);
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
			case CimPackage.CIM_MASKING_GROUP__DELETE_ON_EMPTY:
				return DELETE_ON_EMPTY_EDEFAULT == null ? deleteOnEmpty != null : !DELETE_ON_EMPTY_EDEFAULT.equals(deleteOnEmpty);
			case CimPackage.CIM_MASKING_GROUP__DELETE_WHEN_BECOMES_UNASSOCIATED:
				return DELETE_WHEN_BECOMES_UNASSOCIATED_EDEFAULT == null ? deleteWhenBecomesUnassociated != null : !DELETE_WHEN_BECOMES_UNASSOCIATED_EDEFAULT.equals(deleteWhenBecomesUnassociated);
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
		result.append(" (DeleteOnEmpty: ");
		result.append(deleteOnEmpty);
		result.append(", DeleteWhenBecomesUnassociated: ");
		result.append(deleteWhenBecomesUnassociated);
		result.append(')');
		return result.toString();
	}

} //CIM_MaskingGroupImpl
