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

import org.dmtf.cim.CIM_RelatedStatisticalData;
import org.dmtf.cim.CIM_StatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Related Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedStatisticalDataImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedStatisticalDataImpl#getRelatedStats <em>Related Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RelatedStatisticalDataImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RelatedStatisticalDataImpl extends MinimalEObjectImpl.Container implements CIM_RelatedStatisticalData {
	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected CIM_StatisticalData stats;

	/**
	 * The cached value of the '{@link #getRelatedStats() <em>Related Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStats()
	 * @generated
	 * @ordered
	 */
	protected CIM_StatisticalData relatedStats;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RelatedStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RelatedStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalData getStats() {
		if (stats != null && stats.eIsProxy()) {
			InternalEObject oldStats = (InternalEObject)stats;
			stats = (CIM_StatisticalData)eResolveProxy(oldStats);
			if (stats != oldStats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS, oldStats, stats));
			}
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StatisticalData basicGetStats() {
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStats(CIM_StatisticalData newStats) {
		CIM_StatisticalData oldStats = stats;
		stats = newStats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS, oldStats, stats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalData getRelatedStats() {
		if (relatedStats != null && relatedStats.eIsProxy()) {
			InternalEObject oldRelatedStats = (InternalEObject)relatedStats;
			relatedStats = (CIM_StatisticalData)eResolveProxy(oldRelatedStats);
			if (relatedStats != oldRelatedStats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS, oldRelatedStats, relatedStats));
			}
		}
		return relatedStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_StatisticalData basicGetRelatedStats() {
		return relatedStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedStats(CIM_StatisticalData newRelatedStats) {
		CIM_StatisticalData oldRelatedStats = relatedStats;
		relatedStats = newRelatedStats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS, oldRelatedStats, relatedStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RELATED_STATISTICAL_DATA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS:
				if (resolve) return getStats();
				return basicGetStats();
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS:
				if (resolve) return getRelatedStats();
				return basicGetRelatedStats();
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__DESCRIPTION:
				return getDescription();
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
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS:
				setStats((CIM_StatisticalData)newValue);
				return;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS:
				setRelatedStats((CIM_StatisticalData)newValue);
				return;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__DESCRIPTION:
				setDescription((String)newValue);
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
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS:
				setStats((CIM_StatisticalData)null);
				return;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS:
				setRelatedStats((CIM_StatisticalData)null);
				return;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__STATS:
				return stats != null;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__RELATED_STATS:
				return relatedStats != null;
			case CimPackage.CIM_RELATED_STATISTICAL_DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CIM_RelatedStatisticalDataImpl
