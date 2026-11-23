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

import org.dmtf.cim.CIM_AllocatedFromStoragePoolViewView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Allocated From Storage Pool View View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocatedFromStoragePoolViewViewImpl#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AllocatedFromStoragePoolViewViewImpl extends CIM_AbstractElementAllocatedFromPoolImpl implements CIM_AllocatedFromStoragePoolViewView {
	/**
	 * The default value of the '{@link #getAFSPSpaceConsumed() <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final Long AFSP_SPACE_CONSUMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAFSPSpaceConsumed() <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected Long afspSpaceConsumed = AFSP_SPACE_CONSUMED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AllocatedFromStoragePoolViewViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AllocatedFromStoragePoolViewView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAFSPSpaceConsumed() {
		return afspSpaceConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAFSPSpaceConsumed(Long newAFSPSpaceConsumed) {
		Long oldAFSPSpaceConsumed = afspSpaceConsumed;
		afspSpaceConsumed = newAFSPSpaceConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW__AFSP_SPACE_CONSUMED, oldAFSPSpaceConsumed, afspSpaceConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW__AFSP_SPACE_CONSUMED:
				return getAFSPSpaceConsumed();
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed((Long)newValue);
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed(AFSP_SPACE_CONSUMED_EDEFAULT);
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW__AFSP_SPACE_CONSUMED:
				return AFSP_SPACE_CONSUMED_EDEFAULT == null ? afspSpaceConsumed != null : !AFSP_SPACE_CONSUMED_EDEFAULT.equals(afspSpaceConsumed);
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
		result.append(" (AFSPSpaceConsumed: ");
		result.append(afspSpaceConsumed);
		result.append(')');
		return result.toString();
	}

} //CIM_AllocatedFromStoragePoolViewViewImpl
