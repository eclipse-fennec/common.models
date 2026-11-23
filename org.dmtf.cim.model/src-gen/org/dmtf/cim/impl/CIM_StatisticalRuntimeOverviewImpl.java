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

import org.dmtf.cim.CIM_StatisticalRuntimeOverview;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Statistical Runtime Overview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalRuntimeOverviewImpl#getLastActivity <em>Last Activity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalRuntimeOverviewImpl#getNumberOfActiveRequests <em>Number Of Active Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalRuntimeOverviewImpl#getNumberOfActiveRequestors <em>Number Of Active Requestors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalRuntimeOverviewImpl#getAverageResponseTime <em>Average Response Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StatisticalRuntimeOverviewImpl extends CIM_StatisticalDataImpl implements CIM_StatisticalRuntimeOverview {
	/**
	 * The default value of the '{@link #getLastActivity() <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastActivity() <em>Last Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActivity()
	 * @generated
	 * @ordered
	 */
	protected String lastActivity = LAST_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfActiveRequests() <em>Number Of Active Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActiveRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_ACTIVE_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfActiveRequests() <em>Number Of Active Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActiveRequests()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfActiveRequests = NUMBER_OF_ACTIVE_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfActiveRequestors() <em>Number Of Active Requestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActiveRequestors()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_ACTIVE_REQUESTORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfActiveRequestors() <em>Number Of Active Requestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActiveRequestors()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfActiveRequestors = NUMBER_OF_ACTIVE_REQUESTORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageResponseTime() <em>Average Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageResponseTime() <em>Average Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Long averageResponseTime = AVERAGE_RESPONSE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StatisticalRuntimeOverviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StatisticalRuntimeOverview();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastActivity() {
		return lastActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastActivity(String newLastActivity) {
		String oldLastActivity = lastActivity;
		lastActivity = newLastActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__LAST_ACTIVITY, oldLastActivity, lastActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfActiveRequests() {
		return numberOfActiveRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfActiveRequests(Long newNumberOfActiveRequests) {
		Long oldNumberOfActiveRequests = numberOfActiveRequests;
		numberOfActiveRequests = newNumberOfActiveRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTS, oldNumberOfActiveRequests, numberOfActiveRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfActiveRequestors() {
		return numberOfActiveRequestors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfActiveRequestors(Long newNumberOfActiveRequestors) {
		Long oldNumberOfActiveRequestors = numberOfActiveRequestors;
		numberOfActiveRequestors = newNumberOfActiveRequestors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTORS, oldNumberOfActiveRequestors, numberOfActiveRequestors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageResponseTime() {
		return averageResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageResponseTime(Long newAverageResponseTime) {
		Long oldAverageResponseTime = averageResponseTime;
		averageResponseTime = newAverageResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__AVERAGE_RESPONSE_TIME, oldAverageResponseTime, averageResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__LAST_ACTIVITY:
				return getLastActivity();
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTS:
				return getNumberOfActiveRequests();
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTORS:
				return getNumberOfActiveRequestors();
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__AVERAGE_RESPONSE_TIME:
				return getAverageResponseTime();
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
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__LAST_ACTIVITY:
				setLastActivity((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTS:
				setNumberOfActiveRequests((Long)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTORS:
				setNumberOfActiveRequestors((Long)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__AVERAGE_RESPONSE_TIME:
				setAverageResponseTime((Long)newValue);
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
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__LAST_ACTIVITY:
				setLastActivity(LAST_ACTIVITY_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTS:
				setNumberOfActiveRequests(NUMBER_OF_ACTIVE_REQUESTS_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTORS:
				setNumberOfActiveRequestors(NUMBER_OF_ACTIVE_REQUESTORS_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__AVERAGE_RESPONSE_TIME:
				setAverageResponseTime(AVERAGE_RESPONSE_TIME_EDEFAULT);
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
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__LAST_ACTIVITY:
				return LAST_ACTIVITY_EDEFAULT == null ? lastActivity != null : !LAST_ACTIVITY_EDEFAULT.equals(lastActivity);
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTS:
				return NUMBER_OF_ACTIVE_REQUESTS_EDEFAULT == null ? numberOfActiveRequests != null : !NUMBER_OF_ACTIVE_REQUESTS_EDEFAULT.equals(numberOfActiveRequests);
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__NUMBER_OF_ACTIVE_REQUESTORS:
				return NUMBER_OF_ACTIVE_REQUESTORS_EDEFAULT == null ? numberOfActiveRequestors != null : !NUMBER_OF_ACTIVE_REQUESTORS_EDEFAULT.equals(numberOfActiveRequestors);
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW__AVERAGE_RESPONSE_TIME:
				return AVERAGE_RESPONSE_TIME_EDEFAULT == null ? averageResponseTime != null : !AVERAGE_RESPONSE_TIME_EDEFAULT.equals(averageResponseTime);
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
		result.append(" (LastActivity: ");
		result.append(lastActivity);
		result.append(", NumberOfActiveRequests: ");
		result.append(numberOfActiveRequests);
		result.append(", NumberOfActiveRequestors: ");
		result.append(numberOfActiveRequestors);
		result.append(", AverageResponseTime: ");
		result.append(averageResponseTime);
		result.append(')');
		return result.toString();
	}

} //CIM_StatisticalRuntimeOverviewImpl
