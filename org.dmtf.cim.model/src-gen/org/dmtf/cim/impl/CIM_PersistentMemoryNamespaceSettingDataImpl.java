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

import org.dmtf.cim.CIM_PersistentMemoryNamespaceSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Persistent Memory Namespace Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryNamespaceSettingDataImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentMemoryNamespaceSettingDataImpl#getOptimize <em>Optimize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PersistentMemoryNamespaceSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_PersistentMemoryNamespaceSettingData {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected Integer accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimize() <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPTIMIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptimize() <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimize()
	 * @generated
	 * @ordered
	 */
	protected Integer optimize = OPTIMIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PersistentMemoryNamespaceSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PersistentMemoryNamespaceSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessType(Integer newAccessType) {
		Integer oldAccessType = accessType;
		accessType = newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOptimize() {
		return optimize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimize(Integer newOptimize) {
		Integer oldOptimize = optimize;
		optimize = newOptimize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__OPTIMIZE, oldOptimize, optimize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__ACCESS_TYPE:
				return getAccessType();
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__OPTIMIZE:
				return getOptimize();
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
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__ACCESS_TYPE:
				setAccessType((Integer)newValue);
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__OPTIMIZE:
				setOptimize((Integer)newValue);
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
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__OPTIMIZE:
				setOptimize(OPTIMIZE_EDEFAULT);
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
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__ACCESS_TYPE:
				return ACCESS_TYPE_EDEFAULT == null ? accessType != null : !ACCESS_TYPE_EDEFAULT.equals(accessType);
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA__OPTIMIZE:
				return OPTIMIZE_EDEFAULT == null ? optimize != null : !OPTIMIZE_EDEFAULT.equals(optimize);
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
		result.append(" (AccessType: ");
		result.append(accessType);
		result.append(", Optimize: ");
		result.append(optimize);
		result.append(')');
		return result.toString();
	}

} //CIM_PersistentMemoryNamespaceSettingDataImpl
