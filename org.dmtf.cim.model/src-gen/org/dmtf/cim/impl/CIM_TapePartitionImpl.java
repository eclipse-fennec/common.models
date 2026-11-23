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

import org.dmtf.cim.CIM_TapePartition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tape Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapePartitionImpl#getUnusedBlocks <em>Unused Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TapePartitionImpl extends CIM_MediaPartitionImpl implements CIM_TapePartition {
	/**
	 * The default value of the '{@link #getUnusedBlocks() <em>Unused Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNUSED_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnusedBlocks() <em>Unused Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long unusedBlocks = UNUSED_BLOCKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TapePartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TapePartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnusedBlocks() {
		return unusedBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnusedBlocks(Long newUnusedBlocks) {
		Long oldUnusedBlocks = unusedBlocks;
		unusedBlocks = newUnusedBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_PARTITION__UNUSED_BLOCKS, oldUnusedBlocks, unusedBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TAPE_PARTITION__UNUSED_BLOCKS:
				return getUnusedBlocks();
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
			case CimPackage.CIM_TAPE_PARTITION__UNUSED_BLOCKS:
				setUnusedBlocks((Long)newValue);
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
			case CimPackage.CIM_TAPE_PARTITION__UNUSED_BLOCKS:
				setUnusedBlocks(UNUSED_BLOCKS_EDEFAULT);
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
			case CimPackage.CIM_TAPE_PARTITION__UNUSED_BLOCKS:
				return UNUSED_BLOCKS_EDEFAULT == null ? unusedBlocks != null : !UNUSED_BLOCKS_EDEFAULT.equals(unusedBlocks);
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
		result.append(" (UnusedBlocks: ");
		result.append(unusedBlocks);
		result.append(')');
		return result.toString();
	}

} //CIM_TapePartitionImpl
