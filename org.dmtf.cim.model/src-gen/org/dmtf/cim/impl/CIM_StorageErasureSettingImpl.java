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

import org.dmtf.cim.CIM_StorageErasureSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Erasure Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureSettingImpl#getErasureMethod <em>Erasure Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageErasureSettingImpl#getEraseOnReturnToPool <em>Erase On Return To Pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageErasureSettingImpl extends CIM_SettingDataImpl implements CIM_StorageErasureSetting {
	/**
	 * The default value of the '{@link #getErasureMethod() <em>Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasureMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ERASURE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErasureMethod() <em>Erasure Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasureMethod()
	 * @generated
	 * @ordered
	 */
	protected String erasureMethod = ERASURE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEraseOnReturnToPool() <em>Erase On Return To Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEraseOnReturnToPool()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ERASE_ON_RETURN_TO_POOL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getEraseOnReturnToPool() <em>Erase On Return To Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEraseOnReturnToPool()
	 * @generated
	 * @ordered
	 */
	protected Boolean eraseOnReturnToPool = ERASE_ON_RETURN_TO_POOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageErasureSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageErasureSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErasureMethod() {
		return erasureMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasureMethod(String newErasureMethod) {
		String oldErasureMethod = erasureMethod;
		erasureMethod = newErasureMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASURE_METHOD, oldErasureMethod, erasureMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEraseOnReturnToPool() {
		return eraseOnReturnToPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEraseOnReturnToPool(Boolean newEraseOnReturnToPool) {
		Boolean oldEraseOnReturnToPool = eraseOnReturnToPool;
		eraseOnReturnToPool = newEraseOnReturnToPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASE_ON_RETURN_TO_POOL, oldEraseOnReturnToPool, eraseOnReturnToPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASURE_METHOD:
				return getErasureMethod();
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASE_ON_RETURN_TO_POOL:
				return getEraseOnReturnToPool();
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
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASURE_METHOD:
				setErasureMethod((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASE_ON_RETURN_TO_POOL:
				setEraseOnReturnToPool((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASURE_METHOD:
				setErasureMethod(ERASURE_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASE_ON_RETURN_TO_POOL:
				setEraseOnReturnToPool(ERASE_ON_RETURN_TO_POOL_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASURE_METHOD:
				return ERASURE_METHOD_EDEFAULT == null ? erasureMethod != null : !ERASURE_METHOD_EDEFAULT.equals(erasureMethod);
			case CimPackage.CIM_STORAGE_ERASURE_SETTING__ERASE_ON_RETURN_TO_POOL:
				return ERASE_ON_RETURN_TO_POOL_EDEFAULT == null ? eraseOnReturnToPool != null : !ERASE_ON_RETURN_TO_POOL_EDEFAULT.equals(eraseOnReturnToPool);
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
		result.append(" (ErasureMethod: ");
		result.append(erasureMethod);
		result.append(", EraseOnReturnToPool: ");
		result.append(eraseOnReturnToPool);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageErasureSettingImpl
