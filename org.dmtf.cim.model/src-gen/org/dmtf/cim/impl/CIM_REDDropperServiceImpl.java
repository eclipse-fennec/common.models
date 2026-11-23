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

import org.dmtf.cim.CIM_REDDropperService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM RED Dropper Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_REDDropperServiceImpl#getMinQueueThreshold <em>Min Queue Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_REDDropperServiceImpl#getMaxQueueThreshold <em>Max Queue Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_REDDropperServiceImpl#getStartProbability <em>Start Probability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_REDDropperServiceImpl#getStopProbability <em>Stop Probability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_REDDropperServiceImpl#getThresholdUnits <em>Threshold Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_REDDropperServiceImpl extends CIM_DropperServiceImpl implements CIM_REDDropperService {
	/**
	 * The default value of the '{@link #getMinQueueThreshold() <em>Min Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_QUEUE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinQueueThreshold() <em>Min Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected Long minQueueThreshold = MIN_QUEUE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQueueThreshold() <em>Max Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_QUEUE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQueueThreshold() <em>Max Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected Long maxQueueThreshold = MAX_QUEUE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartProbability() <em>Start Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Long START_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartProbability() <em>Start Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartProbability()
	 * @generated
	 * @ordered
	 */
	protected Long startProbability = START_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopProbability() <em>Stop Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Long STOP_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopProbability() <em>Stop Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopProbability()
	 * @generated
	 * @ordered
	 */
	protected Long stopProbability = STOP_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdUnits() <em>Threshold Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THRESHOLD_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdUnits() <em>Threshold Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer thresholdUnits = THRESHOLD_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_REDDropperServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_REDDropperService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinQueueThreshold() {
		return minQueueThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinQueueThreshold(Long newMinQueueThreshold) {
		Long oldMinQueueThreshold = minQueueThreshold;
		minQueueThreshold = newMinQueueThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RED_DROPPER_SERVICE__MIN_QUEUE_THRESHOLD, oldMinQueueThreshold, minQueueThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxQueueThreshold() {
		return maxQueueThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQueueThreshold(Long newMaxQueueThreshold) {
		Long oldMaxQueueThreshold = maxQueueThreshold;
		maxQueueThreshold = newMaxQueueThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RED_DROPPER_SERVICE__MAX_QUEUE_THRESHOLD, oldMaxQueueThreshold, maxQueueThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStartProbability() {
		return startProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartProbability(Long newStartProbability) {
		Long oldStartProbability = startProbability;
		startProbability = newStartProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RED_DROPPER_SERVICE__START_PROBABILITY, oldStartProbability, startProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStopProbability() {
		return stopProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopProbability(Long newStopProbability) {
		Long oldStopProbability = stopProbability;
		stopProbability = newStopProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RED_DROPPER_SERVICE__STOP_PROBABILITY, oldStopProbability, stopProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThresholdUnits() {
		return thresholdUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdUnits(Integer newThresholdUnits) {
		Integer oldThresholdUnits = thresholdUnits;
		thresholdUnits = newThresholdUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RED_DROPPER_SERVICE__THRESHOLD_UNITS, oldThresholdUnits, thresholdUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RED_DROPPER_SERVICE__MIN_QUEUE_THRESHOLD:
				return getMinQueueThreshold();
			case CimPackage.CIM_RED_DROPPER_SERVICE__MAX_QUEUE_THRESHOLD:
				return getMaxQueueThreshold();
			case CimPackage.CIM_RED_DROPPER_SERVICE__START_PROBABILITY:
				return getStartProbability();
			case CimPackage.CIM_RED_DROPPER_SERVICE__STOP_PROBABILITY:
				return getStopProbability();
			case CimPackage.CIM_RED_DROPPER_SERVICE__THRESHOLD_UNITS:
				return getThresholdUnits();
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
			case CimPackage.CIM_RED_DROPPER_SERVICE__MIN_QUEUE_THRESHOLD:
				setMinQueueThreshold((Long)newValue);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__MAX_QUEUE_THRESHOLD:
				setMaxQueueThreshold((Long)newValue);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__START_PROBABILITY:
				setStartProbability((Long)newValue);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__STOP_PROBABILITY:
				setStopProbability((Long)newValue);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__THRESHOLD_UNITS:
				setThresholdUnits((Integer)newValue);
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
			case CimPackage.CIM_RED_DROPPER_SERVICE__MIN_QUEUE_THRESHOLD:
				setMinQueueThreshold(MIN_QUEUE_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__MAX_QUEUE_THRESHOLD:
				setMaxQueueThreshold(MAX_QUEUE_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__START_PROBABILITY:
				setStartProbability(START_PROBABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__STOP_PROBABILITY:
				setStopProbability(STOP_PROBABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_RED_DROPPER_SERVICE__THRESHOLD_UNITS:
				setThresholdUnits(THRESHOLD_UNITS_EDEFAULT);
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
			case CimPackage.CIM_RED_DROPPER_SERVICE__MIN_QUEUE_THRESHOLD:
				return MIN_QUEUE_THRESHOLD_EDEFAULT == null ? minQueueThreshold != null : !MIN_QUEUE_THRESHOLD_EDEFAULT.equals(minQueueThreshold);
			case CimPackage.CIM_RED_DROPPER_SERVICE__MAX_QUEUE_THRESHOLD:
				return MAX_QUEUE_THRESHOLD_EDEFAULT == null ? maxQueueThreshold != null : !MAX_QUEUE_THRESHOLD_EDEFAULT.equals(maxQueueThreshold);
			case CimPackage.CIM_RED_DROPPER_SERVICE__START_PROBABILITY:
				return START_PROBABILITY_EDEFAULT == null ? startProbability != null : !START_PROBABILITY_EDEFAULT.equals(startProbability);
			case CimPackage.CIM_RED_DROPPER_SERVICE__STOP_PROBABILITY:
				return STOP_PROBABILITY_EDEFAULT == null ? stopProbability != null : !STOP_PROBABILITY_EDEFAULT.equals(stopProbability);
			case CimPackage.CIM_RED_DROPPER_SERVICE__THRESHOLD_UNITS:
				return THRESHOLD_UNITS_EDEFAULT == null ? thresholdUnits != null : !THRESHOLD_UNITS_EDEFAULT.equals(thresholdUnits);
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
		result.append(" (MinQueueThreshold: ");
		result.append(minQueueThreshold);
		result.append(", MaxQueueThreshold: ");
		result.append(maxQueueThreshold);
		result.append(", StartProbability: ");
		result.append(startProbability);
		result.append(", StopProbability: ");
		result.append(stopProbability);
		result.append(", ThresholdUnits: ");
		result.append(thresholdUnits);
		result.append(')');
		return result.toString();
	}

} //CIM_REDDropperServiceImpl
