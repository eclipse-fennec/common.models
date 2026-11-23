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

import org.dmtf.cim.CIM_VolatileStorage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Volatile Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolatileStorageImpl#getCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolatileStorageImpl#getCacheType <em>Cache Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VolatileStorageImpl extends CIM_MemoryImpl implements CIM_VolatileStorage {
	/**
	 * The default value of the '{@link #getCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheable()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheable = CACHEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CACHE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected Integer cacheType = CACHE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VolatileStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VolatileStorage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCacheable() {
		return cacheable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheable(Boolean newCacheable) {
		Boolean oldCacheable = cacheable;
		cacheable = newCacheable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLATILE_STORAGE__CACHEABLE, oldCacheable, cacheable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCacheType() {
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheType(Integer newCacheType) {
		Integer oldCacheType = cacheType;
		cacheType = newCacheType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLATILE_STORAGE__CACHE_TYPE, oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VOLATILE_STORAGE__CACHEABLE:
				return getCacheable();
			case CimPackage.CIM_VOLATILE_STORAGE__CACHE_TYPE:
				return getCacheType();
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
			case CimPackage.CIM_VOLATILE_STORAGE__CACHEABLE:
				setCacheable((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLATILE_STORAGE__CACHE_TYPE:
				setCacheType((Integer)newValue);
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
			case CimPackage.CIM_VOLATILE_STORAGE__CACHEABLE:
				setCacheable(CACHEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLATILE_STORAGE__CACHE_TYPE:
				setCacheType(CACHE_TYPE_EDEFAULT);
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
			case CimPackage.CIM_VOLATILE_STORAGE__CACHEABLE:
				return CACHEABLE_EDEFAULT == null ? cacheable != null : !CACHEABLE_EDEFAULT.equals(cacheable);
			case CimPackage.CIM_VOLATILE_STORAGE__CACHE_TYPE:
				return CACHE_TYPE_EDEFAULT == null ? cacheType != null : !CACHE_TYPE_EDEFAULT.equals(cacheType);
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
		result.append(" (Cacheable: ");
		result.append(cacheable);
		result.append(", CacheType: ");
		result.append(cacheType);
		result.append(')');
		return result.toString();
	}

} //CIM_VolatileStorageImpl
