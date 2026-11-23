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

import org.dmtf.cim.CIM_StatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Statistics Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticsCollectionImpl#getSampleInterval <em>Sample Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticsCollectionImpl#getTimeLastSampled <em>Time Last Sampled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StatisticsCollectionImpl extends CIM_SystemSpecificCollectionImpl implements CIM_StatisticsCollection {
	/**
	 * The default value of the '{@link #getSampleInterval() <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_INTERVAL_EDEFAULT = "00000000000000.000000:000";

	/**
	 * The cached value of the '{@link #getSampleInterval() <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleInterval()
	 * @generated
	 * @ordered
	 */
	protected String sampleInterval = SAMPLE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeLastSampled() <em>Time Last Sampled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLastSampled()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_LAST_SAMPLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeLastSampled() <em>Time Last Sampled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLastSampled()
	 * @generated
	 * @ordered
	 */
	protected String timeLastSampled = TIME_LAST_SAMPLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StatisticsCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StatisticsCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSampleInterval(String newSampleInterval) {
		String oldSampleInterval = sampleInterval;
		sampleInterval = newSampleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICS_COLLECTION__SAMPLE_INTERVAL, oldSampleInterval, sampleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeLastSampled() {
		return timeLastSampled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeLastSampled(String newTimeLastSampled) {
		String oldTimeLastSampled = timeLastSampled;
		timeLastSampled = newTimeLastSampled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICS_COLLECTION__TIME_LAST_SAMPLED, oldTimeLastSampled, timeLastSampled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATISTICS_COLLECTION__SAMPLE_INTERVAL:
				return getSampleInterval();
			case CimPackage.CIM_STATISTICS_COLLECTION__TIME_LAST_SAMPLED:
				return getTimeLastSampled();
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
			case CimPackage.CIM_STATISTICS_COLLECTION__SAMPLE_INTERVAL:
				setSampleInterval((String)newValue);
				return;
			case CimPackage.CIM_STATISTICS_COLLECTION__TIME_LAST_SAMPLED:
				setTimeLastSampled((String)newValue);
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
			case CimPackage.CIM_STATISTICS_COLLECTION__SAMPLE_INTERVAL:
				setSampleInterval(SAMPLE_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICS_COLLECTION__TIME_LAST_SAMPLED:
				setTimeLastSampled(TIME_LAST_SAMPLED_EDEFAULT);
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
			case CimPackage.CIM_STATISTICS_COLLECTION__SAMPLE_INTERVAL:
				return SAMPLE_INTERVAL_EDEFAULT == null ? sampleInterval != null : !SAMPLE_INTERVAL_EDEFAULT.equals(sampleInterval);
			case CimPackage.CIM_STATISTICS_COLLECTION__TIME_LAST_SAMPLED:
				return TIME_LAST_SAMPLED_EDEFAULT == null ? timeLastSampled != null : !TIME_LAST_SAMPLED_EDEFAULT.equals(timeLastSampled);
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
		result.append(" (SampleInterval: ");
		result.append(sampleInterval);
		result.append(", TimeLastSampled: ");
		result.append(timeLastSampled);
		result.append(')');
		return result.toString();
	}

} //CIM_StatisticsCollectionImpl
