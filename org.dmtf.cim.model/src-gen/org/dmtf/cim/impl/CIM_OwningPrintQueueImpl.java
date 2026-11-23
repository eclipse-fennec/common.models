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

import org.dmtf.cim.CIM_OwningPrintQueue;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Owning Print Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OwningPrintQueueImpl#getQueuePosition <em>Queue Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OwningPrintQueueImpl extends CIM_JobDestinationJobsImpl implements CIM_OwningPrintQueue {
	/**
	 * The default value of the '{@link #getQueuePosition() <em>Queue Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePosition()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUEUE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueuePosition() <em>Queue Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuePosition()
	 * @generated
	 * @ordered
	 */
	protected Long queuePosition = QUEUE_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OwningPrintQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OwningPrintQueue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQueuePosition() {
		return queuePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueuePosition(Long newQueuePosition) {
		Long oldQueuePosition = queuePosition;
		queuePosition = newQueuePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OWNING_PRINT_QUEUE__QUEUE_POSITION, oldQueuePosition, queuePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OWNING_PRINT_QUEUE__QUEUE_POSITION:
				return getQueuePosition();
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
			case CimPackage.CIM_OWNING_PRINT_QUEUE__QUEUE_POSITION:
				setQueuePosition((Long)newValue);
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
			case CimPackage.CIM_OWNING_PRINT_QUEUE__QUEUE_POSITION:
				setQueuePosition(QUEUE_POSITION_EDEFAULT);
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
			case CimPackage.CIM_OWNING_PRINT_QUEUE__QUEUE_POSITION:
				return QUEUE_POSITION_EDEFAULT == null ? queuePosition != null : !QUEUE_POSITION_EDEFAULT.equals(queuePosition);
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
		result.append(" (QueuePosition: ");
		result.append(queuePosition);
		result.append(')');
		return result.toString();
	}

} //CIM_OwningPrintQueueImpl
