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

import org.dmtf.cim.CIM_J2eeServletStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Servlet Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeServletStatsImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeServletStatsImpl#getServletTimeMaxTime <em>Servlet Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeServletStatsImpl#getServiceTimeMinTime <em>Service Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeServletStatsImpl#getServletTimeTotalTime <em>Servlet Time Total Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeServletStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeServletStats {
	/**
	 * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected String serviceTime = SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServletTimeMaxTime() <em>Servlet Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVLET_TIME_MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServletTimeMaxTime() <em>Servlet Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected String servletTimeMaxTime = SERVLET_TIME_MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTimeMinTime() <em>Service Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TIME_MIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceTimeMinTime() <em>Service Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected String serviceTimeMinTime = SERVICE_TIME_MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServletTimeTotalTime() <em>Servlet Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVLET_TIME_TOTAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServletTimeTotalTime() <em>Servlet Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected String servletTimeTotalTime = SERVLET_TIME_TOTAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeServletStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeServletStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTime(String newServiceTime) {
		String oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME, oldServiceTime, serviceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServletTimeMaxTime() {
		return servletTimeMaxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServletTimeMaxTime(String newServletTimeMaxTime) {
		String oldServletTimeMaxTime = servletTimeMaxTime;
		servletTimeMaxTime = newServletTimeMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_MAX_TIME, oldServletTimeMaxTime, servletTimeMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceTimeMinTime() {
		return serviceTimeMinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTimeMinTime(String newServiceTimeMinTime) {
		String oldServiceTimeMinTime = serviceTimeMinTime;
		serviceTimeMinTime = newServiceTimeMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME_MIN_TIME, oldServiceTimeMinTime, serviceTimeMinTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServletTimeTotalTime() {
		return servletTimeTotalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServletTimeTotalTime(String newServletTimeTotalTime) {
		String oldServletTimeTotalTime = servletTimeTotalTime;
		servletTimeTotalTime = newServletTimeTotalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_TOTAL_TIME, oldServletTimeTotalTime, servletTimeTotalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME:
				return getServiceTime();
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_MAX_TIME:
				return getServletTimeMaxTime();
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME_MIN_TIME:
				return getServiceTimeMinTime();
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_TOTAL_TIME:
				return getServletTimeTotalTime();
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
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME:
				setServiceTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_MAX_TIME:
				setServletTimeMaxTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME_MIN_TIME:
				setServiceTimeMinTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_TOTAL_TIME:
				setServletTimeTotalTime((String)newValue);
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
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME:
				setServiceTime(SERVICE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_MAX_TIME:
				setServletTimeMaxTime(SERVLET_TIME_MAX_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME_MIN_TIME:
				setServiceTimeMinTime(SERVICE_TIME_MIN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_TOTAL_TIME:
				setServletTimeTotalTime(SERVLET_TIME_TOTAL_TIME_EDEFAULT);
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
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME:
				return SERVICE_TIME_EDEFAULT == null ? serviceTime != null : !SERVICE_TIME_EDEFAULT.equals(serviceTime);
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_MAX_TIME:
				return SERVLET_TIME_MAX_TIME_EDEFAULT == null ? servletTimeMaxTime != null : !SERVLET_TIME_MAX_TIME_EDEFAULT.equals(servletTimeMaxTime);
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVICE_TIME_MIN_TIME:
				return SERVICE_TIME_MIN_TIME_EDEFAULT == null ? serviceTimeMinTime != null : !SERVICE_TIME_MIN_TIME_EDEFAULT.equals(serviceTimeMinTime);
			case CimPackage.CIM_J2EE_SERVLET_STATS__SERVLET_TIME_TOTAL_TIME:
				return SERVLET_TIME_TOTAL_TIME_EDEFAULT == null ? servletTimeTotalTime != null : !SERVLET_TIME_TOTAL_TIME_EDEFAULT.equals(servletTimeTotalTime);
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
		result.append(" (ServiceTime: ");
		result.append(serviceTime);
		result.append(", ServletTimeMaxTime: ");
		result.append(servletTimeMaxTime);
		result.append(", ServiceTimeMinTime: ");
		result.append(serviceTimeMinTime);
		result.append(", ServletTimeTotalTime: ");
		result.append(servletTimeTotalTime);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeServletStatsImpl
