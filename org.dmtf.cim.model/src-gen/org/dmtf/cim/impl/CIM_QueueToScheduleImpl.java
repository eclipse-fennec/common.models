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

import org.dmtf.cim.CIM_QueueToSchedule;
import org.dmtf.cim.CIM_QueuingService;
import org.dmtf.cim.CIM_SchedulingElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Queue To Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueueToScheduleImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueueToScheduleImpl#getSchedElement <em>Sched Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueueToScheduleImpl extends MinimalEObjectImpl.Container implements CIM_QueueToSchedule {
	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected CIM_QueuingService queue;

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
	protected CIM_QueueToScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueueToSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueuingService getQueue() {
		if (queue != null && queue.eIsProxy()) {
			InternalEObject oldQueue = (InternalEObject)queue;
			queue = (CIM_QueuingService)eResolveProxy(oldQueue);
			if (queue != oldQueue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE, oldQueue, queue));
			}
		}
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_QueuingService basicGetQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueue(CIM_QueuingService newQueue) {
		CIM_QueuingService oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE, oldQueue, queue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT, oldSchedElement, schedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT, oldSchedElement, schedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE:
				if (resolve) return getQueue();
				return basicGetQueue();
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT:
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
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE:
				setQueue((CIM_QueuingService)newValue);
				return;
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT:
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
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE:
				setQueue((CIM_QueuingService)null);
				return;
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT:
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
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__QUEUE:
				return queue != null;
			case CimPackage.CIM_QUEUE_TO_SCHEDULE__SCHED_ELEMENT:
				return schedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_QueueToScheduleImpl
