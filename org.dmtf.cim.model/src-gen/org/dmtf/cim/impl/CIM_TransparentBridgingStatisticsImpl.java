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

import org.dmtf.cim.CIM_TransparentBridgingStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Transparent Bridging Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TransparentBridgingStatisticsImpl#getLearnedEntryDiscards <em>Learned Entry Discards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TransparentBridgingStatisticsImpl extends CIM_ServiceStatisticalInformationImpl implements CIM_TransparentBridgingStatistics {
	/**
	 * The default value of the '{@link #getLearnedEntryDiscards() <em>Learned Entry Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnedEntryDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long LEARNED_ENTRY_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLearnedEntryDiscards() <em>Learned Entry Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearnedEntryDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long learnedEntryDiscards = LEARNED_ENTRY_DISCARDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TransparentBridgingStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TransparentBridgingStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLearnedEntryDiscards() {
		return learnedEntryDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearnedEntryDiscards(Long newLearnedEntryDiscards) {
		Long oldLearnedEntryDiscards = learnedEntryDiscards;
		learnedEntryDiscards = newLearnedEntryDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS__LEARNED_ENTRY_DISCARDS, oldLearnedEntryDiscards, learnedEntryDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS__LEARNED_ENTRY_DISCARDS:
				return getLearnedEntryDiscards();
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS__LEARNED_ENTRY_DISCARDS:
				setLearnedEntryDiscards((Long)newValue);
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS__LEARNED_ENTRY_DISCARDS:
				setLearnedEntryDiscards(LEARNED_ENTRY_DISCARDS_EDEFAULT);
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS__LEARNED_ENTRY_DISCARDS:
				return LEARNED_ENTRY_DISCARDS_EDEFAULT == null ? learnedEntryDiscards != null : !LEARNED_ENTRY_DISCARDS_EDEFAULT.equals(learnedEntryDiscards);
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
		result.append(" (LearnedEntryDiscards: ");
		result.append(learnedEntryDiscards);
		result.append(')');
		return result.toString();
	}

} //CIM_TransparentBridgingStatisticsImpl
