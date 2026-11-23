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

import org.dmtf.cim.CIM_ConditioningService;
import org.dmtf.cim.CIM_MeterService;
import org.dmtf.cim.CIM_NextServiceAfterMeter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Next Service After Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextServiceAfterMeterImpl#getPrecedingService <em>Preceding Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextServiceAfterMeterImpl#getFollowingService <em>Following Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextServiceAfterMeterImpl#getMeterResult <em>Meter Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NextServiceAfterMeterImpl extends MinimalEObjectImpl.Container implements CIM_NextServiceAfterMeter {
	/**
	 * The cached value of the '{@link #getPrecedingService() <em>Preceding Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingService()
	 * @generated
	 * @ordered
	 */
	protected CIM_MeterService precedingService;

	/**
	 * The cached value of the '{@link #getFollowingService() <em>Following Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingService()
	 * @generated
	 * @ordered
	 */
	protected CIM_ConditioningService followingService;

	/**
	 * The default value of the '{@link #getMeterResult() <em>Meter Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterResult()
	 * @generated
	 * @ordered
	 */
	protected static final Integer METER_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterResult() <em>Meter Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterResult()
	 * @generated
	 * @ordered
	 */
	protected Integer meterResult = METER_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NextServiceAfterMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NextServiceAfterMeter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MeterService getPrecedingService() {
		if (precedingService != null && precedingService.eIsProxy()) {
			InternalEObject oldPrecedingService = (InternalEObject)precedingService;
			precedingService = (CIM_MeterService)eResolveProxy(oldPrecedingService);
			if (precedingService != oldPrecedingService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE, oldPrecedingService, precedingService));
			}
		}
		return precedingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_MeterService basicGetPrecedingService() {
		return precedingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecedingService(CIM_MeterService newPrecedingService) {
		CIM_MeterService oldPrecedingService = precedingService;
		precedingService = newPrecedingService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE, oldPrecedingService, precedingService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConditioningService getFollowingService() {
		if (followingService != null && followingService.eIsProxy()) {
			InternalEObject oldFollowingService = (InternalEObject)followingService;
			followingService = (CIM_ConditioningService)eResolveProxy(oldFollowingService);
			if (followingService != oldFollowingService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE, oldFollowingService, followingService));
			}
		}
		return followingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ConditioningService basicGetFollowingService() {
		return followingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowingService(CIM_ConditioningService newFollowingService) {
		CIM_ConditioningService oldFollowingService = followingService;
		followingService = newFollowingService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE, oldFollowingService, followingService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMeterResult() {
		return meterResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterResult(Integer newMeterResult) {
		Integer oldMeterResult = meterResult;
		meterResult = newMeterResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_SERVICE_AFTER_METER__METER_RESULT, oldMeterResult, meterResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE:
				if (resolve) return getPrecedingService();
				return basicGetPrecedingService();
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE:
				if (resolve) return getFollowingService();
				return basicGetFollowingService();
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__METER_RESULT:
				return getMeterResult();
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
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE:
				setPrecedingService((CIM_MeterService)newValue);
				return;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE:
				setFollowingService((CIM_ConditioningService)newValue);
				return;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__METER_RESULT:
				setMeterResult((Integer)newValue);
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
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE:
				setPrecedingService((CIM_MeterService)null);
				return;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE:
				setFollowingService((CIM_ConditioningService)null);
				return;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__METER_RESULT:
				setMeterResult(METER_RESULT_EDEFAULT);
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
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__PRECEDING_SERVICE:
				return precedingService != null;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__FOLLOWING_SERVICE:
				return followingService != null;
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER__METER_RESULT:
				return METER_RESULT_EDEFAULT == null ? meterResult != null : !METER_RESULT_EDEFAULT.equals(meterResult);
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
		result.append(" (MeterResult: ");
		result.append(meterResult);
		result.append(')');
		return result.toString();
	}

} //CIM_NextServiceAfterMeterImpl
