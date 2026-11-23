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

import org.dmtf.cim.CIM_HeadTailDropper;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Head Tail Dropper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_HeadTailDropperImpl#getQueueThreshold <em>Queue Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_HeadTailDropperImpl extends CIM_DropperServiceImpl implements CIM_HeadTailDropper {
	/**
	 * The default value of the '{@link #getQueueThreshold() <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUEUE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueThreshold() <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected Long queueThreshold = QUEUE_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_HeadTailDropperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_HeadTailDropper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQueueThreshold() {
		return queueThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueThreshold(Long newQueueThreshold) {
		Long oldQueueThreshold = queueThreshold;
		queueThreshold = newQueueThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_HEAD_TAIL_DROPPER__QUEUE_THRESHOLD, oldQueueThreshold, queueThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_HEAD_TAIL_DROPPER__QUEUE_THRESHOLD:
				return getQueueThreshold();
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
			case CimPackage.CIM_HEAD_TAIL_DROPPER__QUEUE_THRESHOLD:
				setQueueThreshold((Long)newValue);
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
			case CimPackage.CIM_HEAD_TAIL_DROPPER__QUEUE_THRESHOLD:
				setQueueThreshold(QUEUE_THRESHOLD_EDEFAULT);
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
			case CimPackage.CIM_HEAD_TAIL_DROPPER__QUEUE_THRESHOLD:
				return QUEUE_THRESHOLD_EDEFAULT == null ? queueThreshold != null : !QUEUE_THRESHOLD_EDEFAULT.equals(queueThreshold);
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
		result.append(" (QueueThreshold: ");
		result.append(queueThreshold);
		result.append(')');
		return result.toString();
	}

} //CIM_HeadTailDropperImpl
