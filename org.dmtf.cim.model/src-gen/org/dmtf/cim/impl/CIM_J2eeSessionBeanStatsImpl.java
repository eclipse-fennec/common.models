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

import org.dmtf.cim.CIM_J2eeSessionBeanStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Session Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeSessionBeanStatsImpl#getMethodReadyCount <em>Method Ready Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeSessionBeanStatsImpl#getMethodReadyLowWaterMark <em>Method Ready Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeSessionBeanStatsImpl#getMethodReadyHighWaterMark <em>Method Ready High Water Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_J2eeSessionBeanStatsImpl extends CIM_J2eeEJBStatsImpl implements CIM_J2eeSessionBeanStats {
	/**
	 * The default value of the '{@link #getMethodReadyCount() <em>Method Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long METHOD_READY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodReadyCount() <em>Method Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyCount()
	 * @generated
	 * @ordered
	 */
	protected Long methodReadyCount = METHOD_READY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodReadyLowWaterMark() <em>Method Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long METHOD_READY_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodReadyLowWaterMark() <em>Method Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long methodReadyLowWaterMark = METHOD_READY_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodReadyHighWaterMark() <em>Method Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long METHOD_READY_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodReadyHighWaterMark() <em>Method Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodReadyHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long methodReadyHighWaterMark = METHOD_READY_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeSessionBeanStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeSessionBeanStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMethodReadyCount() {
		return methodReadyCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodReadyCount(Long newMethodReadyCount) {
		Long oldMethodReadyCount = methodReadyCount;
		methodReadyCount = newMethodReadyCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_COUNT, oldMethodReadyCount, methodReadyCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMethodReadyLowWaterMark() {
		return methodReadyLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodReadyLowWaterMark(Long newMethodReadyLowWaterMark) {
		Long oldMethodReadyLowWaterMark = methodReadyLowWaterMark;
		methodReadyLowWaterMark = newMethodReadyLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_LOW_WATER_MARK, oldMethodReadyLowWaterMark, methodReadyLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMethodReadyHighWaterMark() {
		return methodReadyHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodReadyHighWaterMark(Long newMethodReadyHighWaterMark) {
		Long oldMethodReadyHighWaterMark = methodReadyHighWaterMark;
		methodReadyHighWaterMark = newMethodReadyHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_HIGH_WATER_MARK, oldMethodReadyHighWaterMark, methodReadyHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_COUNT:
				return getMethodReadyCount();
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_LOW_WATER_MARK:
				return getMethodReadyLowWaterMark();
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_HIGH_WATER_MARK:
				return getMethodReadyHighWaterMark();
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
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_COUNT:
				setMethodReadyCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_LOW_WATER_MARK:
				setMethodReadyLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_HIGH_WATER_MARK:
				setMethodReadyHighWaterMark((Long)newValue);
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
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_COUNT:
				setMethodReadyCount(METHOD_READY_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_LOW_WATER_MARK:
				setMethodReadyLowWaterMark(METHOD_READY_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_HIGH_WATER_MARK:
				setMethodReadyHighWaterMark(METHOD_READY_HIGH_WATER_MARK_EDEFAULT);
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
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_COUNT:
				return METHOD_READY_COUNT_EDEFAULT == null ? methodReadyCount != null : !METHOD_READY_COUNT_EDEFAULT.equals(methodReadyCount);
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_LOW_WATER_MARK:
				return METHOD_READY_LOW_WATER_MARK_EDEFAULT == null ? methodReadyLowWaterMark != null : !METHOD_READY_LOW_WATER_MARK_EDEFAULT.equals(methodReadyLowWaterMark);
			case CimPackage.CIM_J2EE_SESSION_BEAN_STATS__METHOD_READY_HIGH_WATER_MARK:
				return METHOD_READY_HIGH_WATER_MARK_EDEFAULT == null ? methodReadyHighWaterMark != null : !METHOD_READY_HIGH_WATER_MARK_EDEFAULT.equals(methodReadyHighWaterMark);
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
		result.append(" (MethodReadyCount: ");
		result.append(methodReadyCount);
		result.append(", MethodReadyLowWaterMark: ");
		result.append(methodReadyLowWaterMark);
		result.append(", MethodReadyHighWaterMark: ");
		result.append(methodReadyHighWaterMark);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeSessionBeanStatsImpl
