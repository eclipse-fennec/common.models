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

import org.dmtf.cim.CIM_PacketSchedulingService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Packet Scheduling Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PacketSchedulingServiceImpl#getSchedulerType <em>Scheduler Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PacketSchedulingServiceImpl#getOtherSchedulerType <em>Other Scheduler Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PacketSchedulingServiceImpl extends CIM_ConditioningServiceImpl implements CIM_PacketSchedulingService {
	/**
	 * The default value of the '{@link #getSchedulerType() <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCHEDULER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulerType() <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected Integer schedulerType = SCHEDULER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSchedulerType() <em>Other Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SCHEDULER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSchedulerType() <em>Other Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected String otherSchedulerType = OTHER_SCHEDULER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PacketSchedulingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PacketSchedulingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSchedulerType() {
		return schedulerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulerType(Integer newSchedulerType) {
		Integer oldSchedulerType = schedulerType;
		schedulerType = newSchedulerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PACKET_SCHEDULING_SERVICE__SCHEDULER_TYPE, oldSchedulerType, schedulerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSchedulerType() {
		return otherSchedulerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSchedulerType(String newOtherSchedulerType) {
		String oldOtherSchedulerType = otherSchedulerType;
		otherSchedulerType = newOtherSchedulerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PACKET_SCHEDULING_SERVICE__OTHER_SCHEDULER_TYPE, oldOtherSchedulerType, otherSchedulerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__SCHEDULER_TYPE:
				return getSchedulerType();
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__OTHER_SCHEDULER_TYPE:
				return getOtherSchedulerType();
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
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__SCHEDULER_TYPE:
				setSchedulerType((Integer)newValue);
				return;
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__OTHER_SCHEDULER_TYPE:
				setOtherSchedulerType((String)newValue);
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
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__SCHEDULER_TYPE:
				setSchedulerType(SCHEDULER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__OTHER_SCHEDULER_TYPE:
				setOtherSchedulerType(OTHER_SCHEDULER_TYPE_EDEFAULT);
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
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__SCHEDULER_TYPE:
				return SCHEDULER_TYPE_EDEFAULT == null ? schedulerType != null : !SCHEDULER_TYPE_EDEFAULT.equals(schedulerType);
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE__OTHER_SCHEDULER_TYPE:
				return OTHER_SCHEDULER_TYPE_EDEFAULT == null ? otherSchedulerType != null : !OTHER_SCHEDULER_TYPE_EDEFAULT.equals(otherSchedulerType);
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
		result.append(" (SchedulerType: ");
		result.append(schedulerType);
		result.append(", OtherSchedulerType: ");
		result.append(otherSchedulerType);
		result.append(')');
		return result.toString();
	}

} //CIM_PacketSchedulingServiceImpl
