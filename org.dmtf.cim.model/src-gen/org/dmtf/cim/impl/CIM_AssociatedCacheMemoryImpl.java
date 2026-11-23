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

import org.dmtf.cim.CIM_AssociatedCacheMemory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated Cache Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherLevelDescription <em>Other Level Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherWritePolicyDescription <em>Other Write Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherCacheTypeDescription <em>Other Cache Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherReplacementPolicyDescription <em>Other Replacement Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getReadPolicy <em>Read Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherReadPolicyDescription <em>Other Read Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getFlushTimer <em>Flush Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getAssociativity <em>Associativity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedCacheMemoryImpl#getOtherAssociativityDescription <em>Other Associativity Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedCacheMemoryImpl extends CIM_AssociatedMemoryImpl implements CIM_AssociatedCacheMemory {
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
	 * The default value of the '{@link #getOtherLevelDescription() <em>Other Level Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLevelDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LEVEL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLevelDescription() <em>Other Level Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLevelDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherLevelDescription = OTHER_LEVEL_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOtherWritePolicyDescription() <em>Other Write Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherWritePolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_WRITE_POLICY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherWritePolicyDescription() <em>Other Write Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherWritePolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherWritePolicyDescription = OTHER_WRITE_POLICY_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOtherCacheTypeDescription() <em>Other Cache Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCacheTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CACHE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCacheTypeDescription() <em>Other Cache Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCacheTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCacheTypeDescription = OTHER_CACHE_TYPE_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOtherReplacementPolicyDescription() <em>Other Replacement Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherReplacementPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_REPLACEMENT_POLICY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherReplacementPolicyDescription() <em>Other Replacement Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherReplacementPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherReplacementPolicyDescription = OTHER_REPLACEMENT_POLICY_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOtherReadPolicyDescription() <em>Other Read Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherReadPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_READ_POLICY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherReadPolicyDescription() <em>Other Read Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherReadPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherReadPolicyDescription = OTHER_READ_POLICY_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOtherAssociativityDescription() <em>Other Associativity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAssociativityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ASSOCIATIVITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAssociativityDescription() <em>Other Associativity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAssociativityDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherAssociativityDescription = OTHER_ASSOCIATIVITY_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssociatedCacheMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedCacheMemory();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLevelDescription() {
		return otherLevelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLevelDescription(String newOtherLevelDescription) {
		String oldOtherLevelDescription = otherLevelDescription;
		otherLevelDescription = newOtherLevelDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_LEVEL_DESCRIPTION, oldOtherLevelDescription, otherLevelDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherWritePolicyDescription() {
		return otherWritePolicyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherWritePolicyDescription(String newOtherWritePolicyDescription) {
		String oldOtherWritePolicyDescription = otherWritePolicyDescription;
		otherWritePolicyDescription = newOtherWritePolicyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_WRITE_POLICY_DESCRIPTION, oldOtherWritePolicyDescription, otherWritePolicyDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__CACHE_TYPE, oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCacheTypeDescription() {
		return otherCacheTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCacheTypeDescription(String newOtherCacheTypeDescription) {
		String oldOtherCacheTypeDescription = otherCacheTypeDescription;
		otherCacheTypeDescription = newOtherCacheTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_CACHE_TYPE_DESCRIPTION, oldOtherCacheTypeDescription, otherCacheTypeDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LINE_SIZE, oldLineSize, lineSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__REPLACEMENT_POLICY, oldReplacementPolicy, replacementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherReplacementPolicyDescription() {
		return otherReplacementPolicyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherReplacementPolicyDescription(String newOtherReplacementPolicyDescription) {
		String oldOtherReplacementPolicyDescription = otherReplacementPolicyDescription;
		otherReplacementPolicyDescription = newOtherReplacementPolicyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_REPLACEMENT_POLICY_DESCRIPTION, oldOtherReplacementPolicyDescription, otherReplacementPolicyDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__READ_POLICY, oldReadPolicy, readPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherReadPolicyDescription() {
		return otherReadPolicyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherReadPolicyDescription(String newOtherReadPolicyDescription) {
		String oldOtherReadPolicyDescription = otherReadPolicyDescription;
		otherReadPolicyDescription = newOtherReadPolicyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_READ_POLICY_DESCRIPTION, oldOtherReadPolicyDescription, otherReadPolicyDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__FLUSH_TIMER, oldFlushTimer, flushTimer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__ASSOCIATIVITY, oldAssociativity, associativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAssociativityDescription() {
		return otherAssociativityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAssociativityDescription(String newOtherAssociativityDescription) {
		String oldOtherAssociativityDescription = otherAssociativityDescription;
		otherAssociativityDescription = newOtherAssociativityDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_ASSOCIATIVITY_DESCRIPTION, oldOtherAssociativityDescription, otherAssociativityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LEVEL:
				return getLevel();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_LEVEL_DESCRIPTION:
				return getOtherLevelDescription();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__WRITE_POLICY:
				return getWritePolicy();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_WRITE_POLICY_DESCRIPTION:
				return getOtherWritePolicyDescription();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__CACHE_TYPE:
				return getCacheType();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_CACHE_TYPE_DESCRIPTION:
				return getOtherCacheTypeDescription();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LINE_SIZE:
				return getLineSize();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__REPLACEMENT_POLICY:
				return getReplacementPolicy();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_REPLACEMENT_POLICY_DESCRIPTION:
				return getOtherReplacementPolicyDescription();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__READ_POLICY:
				return getReadPolicy();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_READ_POLICY_DESCRIPTION:
				return getOtherReadPolicyDescription();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__FLUSH_TIMER:
				return getFlushTimer();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__ASSOCIATIVITY:
				return getAssociativity();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_ASSOCIATIVITY_DESCRIPTION:
				return getOtherAssociativityDescription();
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
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LEVEL:
				setLevel((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_LEVEL_DESCRIPTION:
				setOtherLevelDescription((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__WRITE_POLICY:
				setWritePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_WRITE_POLICY_DESCRIPTION:
				setOtherWritePolicyDescription((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__CACHE_TYPE:
				setCacheType((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_CACHE_TYPE_DESCRIPTION:
				setOtherCacheTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LINE_SIZE:
				setLineSize((Long)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__REPLACEMENT_POLICY:
				setReplacementPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_REPLACEMENT_POLICY_DESCRIPTION:
				setOtherReplacementPolicyDescription((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__READ_POLICY:
				setReadPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_READ_POLICY_DESCRIPTION:
				setOtherReadPolicyDescription((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__FLUSH_TIMER:
				setFlushTimer((Long)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__ASSOCIATIVITY:
				setAssociativity((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_ASSOCIATIVITY_DESCRIPTION:
				setOtherAssociativityDescription((String)newValue);
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
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_LEVEL_DESCRIPTION:
				setOtherLevelDescription(OTHER_LEVEL_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_WRITE_POLICY_DESCRIPTION:
				setOtherWritePolicyDescription(OTHER_WRITE_POLICY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__CACHE_TYPE:
				setCacheType(CACHE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_CACHE_TYPE_DESCRIPTION:
				setOtherCacheTypeDescription(OTHER_CACHE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LINE_SIZE:
				setLineSize(LINE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__REPLACEMENT_POLICY:
				setReplacementPolicy(REPLACEMENT_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_REPLACEMENT_POLICY_DESCRIPTION:
				setOtherReplacementPolicyDescription(OTHER_REPLACEMENT_POLICY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__READ_POLICY:
				setReadPolicy(READ_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_READ_POLICY_DESCRIPTION:
				setOtherReadPolicyDescription(OTHER_READ_POLICY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__FLUSH_TIMER:
				setFlushTimer(FLUSH_TIMER_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__ASSOCIATIVITY:
				setAssociativity(ASSOCIATIVITY_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_ASSOCIATIVITY_DESCRIPTION:
				setOtherAssociativityDescription(OTHER_ASSOCIATIVITY_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_LEVEL_DESCRIPTION:
				return OTHER_LEVEL_DESCRIPTION_EDEFAULT == null ? otherLevelDescription != null : !OTHER_LEVEL_DESCRIPTION_EDEFAULT.equals(otherLevelDescription);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__WRITE_POLICY:
				return WRITE_POLICY_EDEFAULT == null ? writePolicy != null : !WRITE_POLICY_EDEFAULT.equals(writePolicy);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_WRITE_POLICY_DESCRIPTION:
				return OTHER_WRITE_POLICY_DESCRIPTION_EDEFAULT == null ? otherWritePolicyDescription != null : !OTHER_WRITE_POLICY_DESCRIPTION_EDEFAULT.equals(otherWritePolicyDescription);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__CACHE_TYPE:
				return CACHE_TYPE_EDEFAULT == null ? cacheType != null : !CACHE_TYPE_EDEFAULT.equals(cacheType);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_CACHE_TYPE_DESCRIPTION:
				return OTHER_CACHE_TYPE_DESCRIPTION_EDEFAULT == null ? otherCacheTypeDescription != null : !OTHER_CACHE_TYPE_DESCRIPTION_EDEFAULT.equals(otherCacheTypeDescription);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__LINE_SIZE:
				return LINE_SIZE_EDEFAULT == null ? lineSize != null : !LINE_SIZE_EDEFAULT.equals(lineSize);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__REPLACEMENT_POLICY:
				return REPLACEMENT_POLICY_EDEFAULT == null ? replacementPolicy != null : !REPLACEMENT_POLICY_EDEFAULT.equals(replacementPolicy);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_REPLACEMENT_POLICY_DESCRIPTION:
				return OTHER_REPLACEMENT_POLICY_DESCRIPTION_EDEFAULT == null ? otherReplacementPolicyDescription != null : !OTHER_REPLACEMENT_POLICY_DESCRIPTION_EDEFAULT.equals(otherReplacementPolicyDescription);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__READ_POLICY:
				return READ_POLICY_EDEFAULT == null ? readPolicy != null : !READ_POLICY_EDEFAULT.equals(readPolicy);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_READ_POLICY_DESCRIPTION:
				return OTHER_READ_POLICY_DESCRIPTION_EDEFAULT == null ? otherReadPolicyDescription != null : !OTHER_READ_POLICY_DESCRIPTION_EDEFAULT.equals(otherReadPolicyDescription);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__FLUSH_TIMER:
				return FLUSH_TIMER_EDEFAULT == null ? flushTimer != null : !FLUSH_TIMER_EDEFAULT.equals(flushTimer);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__ASSOCIATIVITY:
				return ASSOCIATIVITY_EDEFAULT == null ? associativity != null : !ASSOCIATIVITY_EDEFAULT.equals(associativity);
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY__OTHER_ASSOCIATIVITY_DESCRIPTION:
				return OTHER_ASSOCIATIVITY_DESCRIPTION_EDEFAULT == null ? otherAssociativityDescription != null : !OTHER_ASSOCIATIVITY_DESCRIPTION_EDEFAULT.equals(otherAssociativityDescription);
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
		result.append(", OtherLevelDescription: ");
		result.append(otherLevelDescription);
		result.append(", WritePolicy: ");
		result.append(writePolicy);
		result.append(", OtherWritePolicyDescription: ");
		result.append(otherWritePolicyDescription);
		result.append(", CacheType: ");
		result.append(cacheType);
		result.append(", OtherCacheTypeDescription: ");
		result.append(otherCacheTypeDescription);
		result.append(", LineSize: ");
		result.append(lineSize);
		result.append(", ReplacementPolicy: ");
		result.append(replacementPolicy);
		result.append(", OtherReplacementPolicyDescription: ");
		result.append(otherReplacementPolicyDescription);
		result.append(", ReadPolicy: ");
		result.append(readPolicy);
		result.append(", OtherReadPolicyDescription: ");
		result.append(otherReadPolicyDescription);
		result.append(", FlushTimer: ");
		result.append(flushTimer);
		result.append(", Associativity: ");
		result.append(associativity);
		result.append(", OtherAssociativityDescription: ");
		result.append(otherAssociativityDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_AssociatedCacheMemoryImpl
