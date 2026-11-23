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

import org.dmtf.cim.CIM_AggregatePExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Aggregate PExtent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AggregatePExtentImpl#getBlocksOfCheckData <em>Blocks Of Check Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AggregatePExtentImpl extends CIM_StorageExtentImpl implements CIM_AggregatePExtent {
	/**
	 * The default value of the '{@link #getBlocksOfCheckData() <em>Blocks Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCKS_OF_CHECK_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlocksOfCheckData() <em>Blocks Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected Long blocksOfCheckData = BLOCKS_OF_CHECK_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AggregatePExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AggregatePExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlocksOfCheckData() {
		return blocksOfCheckData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlocksOfCheckData(Long newBlocksOfCheckData) {
		Long oldBlocksOfCheckData = blocksOfCheckData;
		blocksOfCheckData = newBlocksOfCheckData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGGREGATE_PEXTENT__BLOCKS_OF_CHECK_DATA, oldBlocksOfCheckData, blocksOfCheckData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AGGREGATE_PEXTENT__BLOCKS_OF_CHECK_DATA:
				return getBlocksOfCheckData();
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
			case CimPackage.CIM_AGGREGATE_PEXTENT__BLOCKS_OF_CHECK_DATA:
				setBlocksOfCheckData((Long)newValue);
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
			case CimPackage.CIM_AGGREGATE_PEXTENT__BLOCKS_OF_CHECK_DATA:
				setBlocksOfCheckData(BLOCKS_OF_CHECK_DATA_EDEFAULT);
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
			case CimPackage.CIM_AGGREGATE_PEXTENT__BLOCKS_OF_CHECK_DATA:
				return BLOCKS_OF_CHECK_DATA_EDEFAULT == null ? blocksOfCheckData != null : !BLOCKS_OF_CHECK_DATA_EDEFAULT.equals(blocksOfCheckData);
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
		result.append(" (BlocksOfCheckData: ");
		result.append(blocksOfCheckData);
		result.append(')');
		return result.toString();
	}

} //CIM_AggregatePExtentImpl
