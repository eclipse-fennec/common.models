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

import org.dmtf.cim.CIM_QueuingService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Queuing Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueuingServiceImpl#getCurrentQueueDepth <em>Current Queue Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueuingServiceImpl#getDepthUnits <em>Depth Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueuingServiceImpl extends CIM_ConditioningServiceImpl implements CIM_QueuingService {
	/**
	 * The default value of the '{@link #getCurrentQueueDepth() <em>Current Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_QUEUE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentQueueDepth() <em>Current Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected Long currentQueueDepth = CURRENT_QUEUE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthUnits() <em>Depth Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEPTH_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepthUnits() <em>Depth Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer depthUnits = DEPTH_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_QueuingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueuingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentQueueDepth() {
		return currentQueueDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentQueueDepth(Long newCurrentQueueDepth) {
		Long oldCurrentQueueDepth = currentQueueDepth;
		currentQueueDepth = newCurrentQueueDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUING_SERVICE__CURRENT_QUEUE_DEPTH, oldCurrentQueueDepth, currentQueueDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDepthUnits() {
		return depthUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthUnits(Integer newDepthUnits) {
		Integer oldDepthUnits = depthUnits;
		depthUnits = newDepthUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUING_SERVICE__DEPTH_UNITS, oldDepthUnits, depthUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUEUING_SERVICE__CURRENT_QUEUE_DEPTH:
				return getCurrentQueueDepth();
			case CimPackage.CIM_QUEUING_SERVICE__DEPTH_UNITS:
				return getDepthUnits();
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
			case CimPackage.CIM_QUEUING_SERVICE__CURRENT_QUEUE_DEPTH:
				setCurrentQueueDepth((Long)newValue);
				return;
			case CimPackage.CIM_QUEUING_SERVICE__DEPTH_UNITS:
				setDepthUnits((Integer)newValue);
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
			case CimPackage.CIM_QUEUING_SERVICE__CURRENT_QUEUE_DEPTH:
				setCurrentQueueDepth(CURRENT_QUEUE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_QUEUING_SERVICE__DEPTH_UNITS:
				setDepthUnits(DEPTH_UNITS_EDEFAULT);
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
			case CimPackage.CIM_QUEUING_SERVICE__CURRENT_QUEUE_DEPTH:
				return CURRENT_QUEUE_DEPTH_EDEFAULT == null ? currentQueueDepth != null : !CURRENT_QUEUE_DEPTH_EDEFAULT.equals(currentQueueDepth);
			case CimPackage.CIM_QUEUING_SERVICE__DEPTH_UNITS:
				return DEPTH_UNITS_EDEFAULT == null ? depthUnits != null : !DEPTH_UNITS_EDEFAULT.equals(depthUnits);
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
		result.append(" (CurrentQueueDepth: ");
		result.append(currentQueueDepth);
		result.append(", DepthUnits: ");
		result.append(depthUnits);
		result.append(')');
		return result.toString();
	}

} //CIM_QueuingServiceImpl
