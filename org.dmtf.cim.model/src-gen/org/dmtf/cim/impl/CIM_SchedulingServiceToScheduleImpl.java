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
import org.dmtf.cim.CIM_SchedulingElement;
import org.dmtf.cim.CIM_SchedulingServiceToSchedule;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Scheduling Service To Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchedulingServiceToScheduleImpl#getSchedService <em>Sched Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SchedulingServiceToScheduleImpl#getSchedElement <em>Sched Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SchedulingServiceToScheduleImpl extends MinimalEObjectImpl.Container implements CIM_SchedulingServiceToSchedule {
	/**
	 * The cached value of the '{@link #getSchedService() <em>Sched Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedService()
	 * @generated
	 * @ordered
	 */
	protected CIM_PacketSchedulingService schedService;

	/**
	 * The cached value of the '{@link #getSchedElement() <em>Sched Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_SchedulingElement schedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SchedulingServiceToScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SchedulingServiceToSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PacketSchedulingService getSchedService() {
		if (schedService != null && schedService.eIsProxy()) {
			InternalEObject oldSchedService = (InternalEObject)schedService;
			schedService = (CIM_PacketSchedulingService)eResolveProxy(oldSchedService);
			if (schedService != oldSchedService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE, oldSchedService, schedService));
			}
		}
		return schedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_PacketSchedulingService basicGetSchedService() {
		return schedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedService(CIM_PacketSchedulingService newSchedService) {
		CIM_PacketSchedulingService oldSchedService = schedService;
		schedService = newSchedService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE, oldSchedService, schedService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SchedulingElement getSchedElement() {
		if (schedElement != null && schedElement.eIsProxy()) {
			InternalEObject oldSchedElement = (InternalEObject)schedElement;
			schedElement = (CIM_SchedulingElement)eResolveProxy(oldSchedElement);
			if (schedElement != oldSchedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT, oldSchedElement, schedElement));
			}
		}
		return schedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SchedulingElement basicGetSchedElement() {
		return schedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedElement(CIM_SchedulingElement newSchedElement) {
		CIM_SchedulingElement oldSchedElement = schedElement;
		schedElement = newSchedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT, oldSchedElement, schedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE:
				if (resolve) return getSchedService();
				return basicGetSchedService();
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT:
				if (resolve) return getSchedElement();
				return basicGetSchedElement();
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
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE:
				setSchedService((CIM_PacketSchedulingService)newValue);
				return;
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT:
				setSchedElement((CIM_SchedulingElement)newValue);
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
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE:
				setSchedService((CIM_PacketSchedulingService)null);
				return;
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT:
				setSchedElement((CIM_SchedulingElement)null);
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
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_SERVICE:
				return schedService != null;
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE__SCHED_ELEMENT:
				return schedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_SchedulingServiceToScheduleImpl
