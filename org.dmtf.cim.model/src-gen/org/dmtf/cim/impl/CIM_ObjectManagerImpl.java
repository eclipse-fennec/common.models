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

import org.dmtf.cim.CIM_ObjectManager;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Object Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ObjectManagerImpl#getGatherStatisticalData <em>Gather Statistical Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ObjectManagerImpl extends CIM_WBEMServiceImpl implements CIM_ObjectManager {
	/**
	 * The default value of the '{@link #getGatherStatisticalData() <em>Gather Statistical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatherStatisticalData()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GATHER_STATISTICAL_DATA_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getGatherStatisticalData() <em>Gather Statistical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatherStatisticalData()
	 * @generated
	 * @ordered
	 */
	protected Boolean gatherStatisticalData = GATHER_STATISTICAL_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ObjectManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ObjectManager();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGatherStatisticalData() {
		return gatherStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatherStatisticalData(Boolean newGatherStatisticalData) {
		Boolean oldGatherStatisticalData = gatherStatisticalData;
		gatherStatisticalData = newGatherStatisticalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OBJECT_MANAGER__GATHER_STATISTICAL_DATA, oldGatherStatisticalData, gatherStatisticalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OBJECT_MANAGER__GATHER_STATISTICAL_DATA:
				return getGatherStatisticalData();
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
			case CimPackage.CIM_OBJECT_MANAGER__GATHER_STATISTICAL_DATA:
				setGatherStatisticalData((Boolean)newValue);
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
			case CimPackage.CIM_OBJECT_MANAGER__GATHER_STATISTICAL_DATA:
				setGatherStatisticalData(GATHER_STATISTICAL_DATA_EDEFAULT);
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
			case CimPackage.CIM_OBJECT_MANAGER__GATHER_STATISTICAL_DATA:
				return GATHER_STATISTICAL_DATA_EDEFAULT == null ? gatherStatisticalData != null : !GATHER_STATISTICAL_DATA_EDEFAULT.equals(gatherStatisticalData);
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
		result.append(" (GatherStatisticalData: ");
		result.append(gatherStatisticalData);
		result.append(')');
		return result.toString();
	}

} //CIM_ObjectManagerImpl
