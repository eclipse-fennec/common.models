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

import org.dmtf.cim.CIM_CacheMemory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Cache Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getReadPolicy <em>Read Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getFlushTimer <em>Flush Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CacheMemoryImpl#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CacheMemoryImpl extends CIM_MemoryImpl implements CIM_CacheMemory {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WRITE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer writePolicy = WRITE_POLICY_EDEFAULT;

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
	 * The default value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected Long lineSize = LINE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementPolicy() <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLACEMENT_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacementPolicy() <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer replacementPolicy = REPLACEMENT_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadPolicy() <em>Read Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer READ_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadPolicy() <em>Read Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer readPolicy = READ_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlushTimer() <em>Flush Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushTimer()
	 * @generated
	 * @ordered
	 */
	protected static final Long FLUSH_TIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlushTimer() <em>Flush Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushTimer()
	 * @generated
	 * @ordered
	 */
	protected Long flushTimer = FLUSH_TIMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ASSOCIATIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected Integer associativity = ASSOCIATIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CacheMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CacheMemory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Integer newLevel) {
		Integer oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWritePolicy() {
		return writePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritePolicy(Integer newWritePolicy) {
		Integer oldWritePolicy = writePolicy;
		writePolicy = newWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__WRITE_POLICY, oldWritePolicy, writePolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__CACHE_TYPE, oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSize(Long newLineSize) {
		Long oldLineSize = lineSize;
		lineSize = newLineSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__LINE_SIZE, oldLineSize, lineSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplacementPolicy() {
		return replacementPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplacementPolicy(Integer newReplacementPolicy) {
		Integer oldReplacementPolicy = replacementPolicy;
		replacementPolicy = newReplacementPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__REPLACEMENT_POLICY, oldReplacementPolicy, replacementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReadPolicy() {
		return readPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadPolicy(Integer newReadPolicy) {
		Integer oldReadPolicy = readPolicy;
		readPolicy = newReadPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__READ_POLICY, oldReadPolicy, readPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFlushTimer() {
		return flushTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlushTimer(Long newFlushTimer) {
		Long oldFlushTimer = flushTimer;
		flushTimer = newFlushTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__FLUSH_TIMER, oldFlushTimer, flushTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAssociativity() {
		return associativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociativity(Integer newAssociativity) {
		Integer oldAssociativity = associativity;
		associativity = newAssociativity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CACHE_MEMORY__ASSOCIATIVITY, oldAssociativity, associativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CACHE_MEMORY__LEVEL:
				return getLevel();
			case CimPackage.CIM_CACHE_MEMORY__WRITE_POLICY:
				return getWritePolicy();
			case CimPackage.CIM_CACHE_MEMORY__CACHE_TYPE:
				return getCacheType();
			case CimPackage.CIM_CACHE_MEMORY__LINE_SIZE:
				return getLineSize();
			case CimPackage.CIM_CACHE_MEMORY__REPLACEMENT_POLICY:
				return getReplacementPolicy();
			case CimPackage.CIM_CACHE_MEMORY__READ_POLICY:
				return getReadPolicy();
			case CimPackage.CIM_CACHE_MEMORY__FLUSH_TIMER:
				return getFlushTimer();
			case CimPackage.CIM_CACHE_MEMORY__ASSOCIATIVITY:
				return getAssociativity();
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
			case CimPackage.CIM_CACHE_MEMORY__LEVEL:
				setLevel((Integer)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__WRITE_POLICY:
				setWritePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__CACHE_TYPE:
				setCacheType((Integer)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__LINE_SIZE:
				setLineSize((Long)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__REPLACEMENT_POLICY:
				setReplacementPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__READ_POLICY:
				setReadPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__FLUSH_TIMER:
				setFlushTimer((Long)newValue);
				return;
			case CimPackage.CIM_CACHE_MEMORY__ASSOCIATIVITY:
				setAssociativity((Integer)newValue);
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
			case CimPackage.CIM_CACHE_MEMORY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__CACHE_TYPE:
				setCacheType(CACHE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__LINE_SIZE:
				setLineSize(LINE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__REPLACEMENT_POLICY:
				setReplacementPolicy(REPLACEMENT_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__READ_POLICY:
				setReadPolicy(READ_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__FLUSH_TIMER:
				setFlushTimer(FLUSH_TIMER_EDEFAULT);
				return;
			case CimPackage.CIM_CACHE_MEMORY__ASSOCIATIVITY:
				setAssociativity(ASSOCIATIVITY_EDEFAULT);
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
			case CimPackage.CIM_CACHE_MEMORY__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case CimPackage.CIM_CACHE_MEMORY__WRITE_POLICY:
				return WRITE_POLICY_EDEFAULT == null ? writePolicy != null : !WRITE_POLICY_EDEFAULT.equals(writePolicy);
			case CimPackage.CIM_CACHE_MEMORY__CACHE_TYPE:
				return CACHE_TYPE_EDEFAULT == null ? cacheType != null : !CACHE_TYPE_EDEFAULT.equals(cacheType);
			case CimPackage.CIM_CACHE_MEMORY__LINE_SIZE:
				return LINE_SIZE_EDEFAULT == null ? lineSize != null : !LINE_SIZE_EDEFAULT.equals(lineSize);
			case CimPackage.CIM_CACHE_MEMORY__REPLACEMENT_POLICY:
				return REPLACEMENT_POLICY_EDEFAULT == null ? replacementPolicy != null : !REPLACEMENT_POLICY_EDEFAULT.equals(replacementPolicy);
			case CimPackage.CIM_CACHE_MEMORY__READ_POLICY:
				return READ_POLICY_EDEFAULT == null ? readPolicy != null : !READ_POLICY_EDEFAULT.equals(readPolicy);
			case CimPackage.CIM_CACHE_MEMORY__FLUSH_TIMER:
				return FLUSH_TIMER_EDEFAULT == null ? flushTimer != null : !FLUSH_TIMER_EDEFAULT.equals(flushTimer);
			case CimPackage.CIM_CACHE_MEMORY__ASSOCIATIVITY:
				return ASSOCIATIVITY_EDEFAULT == null ? associativity != null : !ASSOCIATIVITY_EDEFAULT.equals(associativity);
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
		result.append(" (Level: ");
		result.append(level);
		result.append(", WritePolicy: ");
		result.append(writePolicy);
		result.append(", CacheType: ");
		result.append(cacheType);
		result.append(", LineSize: ");
		result.append(lineSize);
		result.append(", ReplacementPolicy: ");
		result.append(replacementPolicy);
		result.append(", ReadPolicy: ");
		result.append(readPolicy);
		result.append(", FlushTimer: ");
		result.append(flushTimer);
		result.append(", Associativity: ");
		result.append(associativity);
		result.append(')');
		return result.toString();
	}

} //CIM_CacheMemoryImpl
