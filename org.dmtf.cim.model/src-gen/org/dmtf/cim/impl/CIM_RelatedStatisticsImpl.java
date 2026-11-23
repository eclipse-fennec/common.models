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

import org.dmtf.cim.CIM_RelatedStatistics;
import org.dmtf.cim.CIM_StatisticalInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Related Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedStatisticsImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedStatisticsImpl#getRelatedStats <em>Related Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RelatedStatisticsImpl extends MinimalEObjectImpl.Container implements CIM_RelatedStatistics {
	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected CIM_StatisticalInformation stats;

	/**
	 * The cached value of the '{@link #getRelatedStats() <em>Related Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStats()
	 * @generated
	 * @ordered
	 */
	protected CIM_StatisticalInformation relatedStats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RelatedStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RelatedStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalInformation getStats() {
		if (stats != null && stats.eIsProxy()) {
			InternalEObject oldStats = (InternalEObject)stats;
			stats = (CIM_StatisticalInformation)eResolveProxy(oldStats);
			if (stats != oldStats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RELATED_STATISTICS__STATS, oldStats, stats));
			}
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StatisticalInformation basicGetStats() {
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStats(CIM_StatisticalInformation newStats) {
		CIM_StatisticalInformation oldStats = stats;
		stats = newStats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_STATISTICS__STATS, oldStats, stats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalInformation getRelatedStats() {
		if (relatedStats != null && relatedStats.eIsProxy()) {
			InternalEObject oldRelatedStats = (InternalEObject)relatedStats;
			relatedStats = (CIM_StatisticalInformation)eResolveProxy(oldRelatedStats);
			if (relatedStats != oldRelatedStats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS, oldRelatedStats, relatedStats));
			}
		}
		return relatedStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StatisticalInformation basicGetRelatedStats() {
		return relatedStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedStats(CIM_StatisticalInformation newRelatedStats) {
		CIM_StatisticalInformation oldRelatedStats = relatedStats;
		relatedStats = newRelatedStats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS, oldRelatedStats, relatedStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RELATED_STATISTICS__STATS:
				if (resolve) return getStats();
				return basicGetStats();
			case CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS:
				if (resolve) return getRelatedStats();
				return basicGetRelatedStats();
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
			case CimPackage.CIM_RELATED_STATISTICS__STATS:
				setStats((CIM_StatisticalInformation)newValue);
				return;
			case CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS:
				setRelatedStats((CIM_StatisticalInformation)newValue);
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
			case CimPackage.CIM_RELATED_STATISTICS__STATS:
				setStats((CIM_StatisticalInformation)null);
				return;
			case CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS:
				setRelatedStats((CIM_StatisticalInformation)null);
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
			case CimPackage.CIM_RELATED_STATISTICS__STATS:
				return stats != null;
			case CimPackage.CIM_RELATED_STATISTICS__RELATED_STATS:
				return relatedStats != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_RelatedStatisticsImpl
