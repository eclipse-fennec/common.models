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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ApplicationSystem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Application System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemImpl#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ApplicationSystemImpl#getLastServingStatusUpdate <em>Last Serving Status Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ApplicationSystemImpl extends CIM_SystemImpl implements CIM_ApplicationSystem {
	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected Integer distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected String startupTime = STARTUP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServingStatus() <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERVING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServingStatus() <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServingStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer servingStatus = SERVING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastServingStatusUpdate() <em>Last Serving Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastServingStatusUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_SERVING_STATUS_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastServingStatusUpdate() <em>Last Serving Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastServingStatusUpdate()
	 * @generated
	 * @ordered
	 */
	protected String lastServingStatusUpdate = LAST_SERVING_STATUS_UPDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ApplicationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ApplicationSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistribution(Integer newDistribution) {
		Integer oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartupTime() {
		return startupTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartupTime(String newStartupTime) {
		String oldStartupTime = startupTime;
		startupTime = newStartupTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM__STARTUP_TIME, oldStartupTime, startupTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getServingStatus() {
		return servingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServingStatus(Integer newServingStatus) {
		Integer oldServingStatus = servingStatus;
		servingStatus = newServingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM__SERVING_STATUS, oldServingStatus, servingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastServingStatusUpdate() {
		return lastServingStatusUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastServingStatusUpdate(String newLastServingStatusUpdate) {
		String oldLastServingStatusUpdate = lastServingStatusUpdate;
		lastServingStatusUpdate = newLastServingStatusUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_APPLICATION_SYSTEM__LAST_SERVING_STATUS_UPDATE, oldLastServingStatusUpdate, lastServingStatusUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer StartApplication() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer StopApplication() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_APPLICATION_SYSTEM__DISTRIBUTION:
				return getDistribution();
			case CimPackage.CIM_APPLICATION_SYSTEM__STARTUP_TIME:
				return getStartupTime();
			case CimPackage.CIM_APPLICATION_SYSTEM__SERVING_STATUS:
				return getServingStatus();
			case CimPackage.CIM_APPLICATION_SYSTEM__LAST_SERVING_STATUS_UPDATE:
				return getLastServingStatusUpdate();
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
			case CimPackage.CIM_APPLICATION_SYSTEM__DISTRIBUTION:
				setDistribution((Integer)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__STARTUP_TIME:
				setStartupTime((String)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__SERVING_STATUS:
				setServingStatus((Integer)newValue);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__LAST_SERVING_STATUS_UPDATE:
				setLastServingStatusUpdate((String)newValue);
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
			case CimPackage.CIM_APPLICATION_SYSTEM__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__STARTUP_TIME:
				setStartupTime(STARTUP_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__SERVING_STATUS:
				setServingStatus(SERVING_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_APPLICATION_SYSTEM__LAST_SERVING_STATUS_UPDATE:
				setLastServingStatusUpdate(LAST_SERVING_STATUS_UPDATE_EDEFAULT);
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
			case CimPackage.CIM_APPLICATION_SYSTEM__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case CimPackage.CIM_APPLICATION_SYSTEM__STARTUP_TIME:
				return STARTUP_TIME_EDEFAULT == null ? startupTime != null : !STARTUP_TIME_EDEFAULT.equals(startupTime);
			case CimPackage.CIM_APPLICATION_SYSTEM__SERVING_STATUS:
				return SERVING_STATUS_EDEFAULT == null ? servingStatus != null : !SERVING_STATUS_EDEFAULT.equals(servingStatus);
			case CimPackage.CIM_APPLICATION_SYSTEM__LAST_SERVING_STATUS_UPDATE:
				return LAST_SERVING_STATUS_UPDATE_EDEFAULT == null ? lastServingStatusUpdate != null : !LAST_SERVING_STATUS_UPDATE_EDEFAULT.equals(lastServingStatusUpdate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_APPLICATION_SYSTEM___START_APPLICATION:
				return StartApplication();
			case CimPackage.CIM_APPLICATION_SYSTEM___STOP_APPLICATION:
				return StopApplication();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Distribution: ");
		result.append(distribution);
		result.append(", StartupTime: ");
		result.append(startupTime);
		result.append(", ServingStatus: ");
		result.append(servingStatus);
		result.append(", LastServingStatusUpdate: ");
		result.append(lastServingStatusUpdate);
		result.append(')');
		return result.toString();
	}

} //CIM_ApplicationSystemImpl
