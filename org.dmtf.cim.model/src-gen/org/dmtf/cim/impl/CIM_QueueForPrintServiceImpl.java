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

import org.dmtf.cim.CIM_QueueForPrintService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Queue For Print Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueueForPrintServiceImpl#getQueueAcceptingFromService <em>Queue Accepting From Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueueForPrintServiceImpl extends CIM_DependencyImpl implements CIM_QueueForPrintService {
	/**
	 * The default value of the '{@link #getQueueAcceptingFromService() <em>Queue Accepting From Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueAcceptingFromService()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean QUEUE_ACCEPTING_FROM_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueAcceptingFromService() <em>Queue Accepting From Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueAcceptingFromService()
	 * @generated
	 * @ordered
	 */
	protected Boolean queueAcceptingFromService = QUEUE_ACCEPTING_FROM_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_QueueForPrintServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueueForPrintService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getQueueAcceptingFromService() {
		return queueAcceptingFromService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueAcceptingFromService(Boolean newQueueAcceptingFromService) {
		Boolean oldQueueAcceptingFromService = queueAcceptingFromService;
		queueAcceptingFromService = newQueueAcceptingFromService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE__QUEUE_ACCEPTING_FROM_SERVICE, oldQueueAcceptingFromService, queueAcceptingFromService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE__QUEUE_ACCEPTING_FROM_SERVICE:
				return getQueueAcceptingFromService();
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
			case CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE__QUEUE_ACCEPTING_FROM_SERVICE:
				setQueueAcceptingFromService((Boolean)newValue);
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
			case CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE__QUEUE_ACCEPTING_FROM_SERVICE:
				setQueueAcceptingFromService(QUEUE_ACCEPTING_FROM_SERVICE_EDEFAULT);
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
			case CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE__QUEUE_ACCEPTING_FROM_SERVICE:
				return QUEUE_ACCEPTING_FROM_SERVICE_EDEFAULT == null ? queueAcceptingFromService != null : !QUEUE_ACCEPTING_FROM_SERVICE_EDEFAULT.equals(queueAcceptingFromService);
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
		result.append(" (QueueAcceptingFromService: ");
		result.append(queueAcceptingFromService);
		result.append(')');
		return result.toString();
	}

} //CIM_QueueForPrintServiceImpl
