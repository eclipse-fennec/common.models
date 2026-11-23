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

import org.dmtf.cim.CIM_TransparentBridgingService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Transparent Bridging Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TransparentBridgingServiceImpl#getAgingTime <em>Aging Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TransparentBridgingServiceImpl#getFID <em>FID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TransparentBridgingServiceImpl extends CIM_ForwardingServiceImpl implements CIM_TransparentBridgingService {
	/**
	 * The default value of the '{@link #getAgingTime() <em>Aging Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long AGING_TIME_EDEFAULT = Long.valueOf(300L);

	/**
	 * The cached value of the '{@link #getAgingTime() <em>Aging Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgingTime()
	 * @generated
	 * @ordered
	 */
	protected Long agingTime = AGING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFID() <em>FID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFID()
	 * @generated
	 * @ordered
	 */
	protected static final Long FID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFID() <em>FID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFID()
	 * @generated
	 * @ordered
	 */
	protected Long fid = FID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TransparentBridgingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TransparentBridgingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAgingTime() {
		return agingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgingTime(Long newAgingTime) {
		Long oldAgingTime = agingTime;
		agingTime = newAgingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__AGING_TIME, oldAgingTime, agingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFID() {
		return fid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFID(Long newFID) {
		Long oldFID = fid;
		fid = newFID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__FID, oldFID, fid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__AGING_TIME:
				return getAgingTime();
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__FID:
				return getFID();
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__AGING_TIME:
				setAgingTime((Long)newValue);
				return;
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__FID:
				setFID((Long)newValue);
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__AGING_TIME:
				setAgingTime(AGING_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__FID:
				setFID(FID_EDEFAULT);
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
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__AGING_TIME:
				return AGING_TIME_EDEFAULT == null ? agingTime != null : !AGING_TIME_EDEFAULT.equals(agingTime);
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE__FID:
				return FID_EDEFAULT == null ? fid != null : !FID_EDEFAULT.equals(fid);
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
		result.append(" (AgingTime: ");
		result.append(agingTime);
		result.append(", FID: ");
		result.append(fid);
		result.append(')');
		return result.toString();
	}

} //CIM_TransparentBridgingServiceImpl
