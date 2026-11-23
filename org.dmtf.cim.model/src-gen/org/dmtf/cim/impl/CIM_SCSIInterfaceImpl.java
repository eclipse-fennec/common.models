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

import org.dmtf.cim.CIM_SCSIInterface;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getSCSITimeouts <em>SCSI Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getSCSIRetries <em>SCSI Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getInitiatorId <em>Initiator Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getTargetLUN <em>Target LUN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getSCSIReservation <em>SCSI Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getSCSISignal <em>SCSI Signal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getMaxQueueDepth <em>Max Queue Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIInterfaceImpl#getQueueDepthLimit <em>Queue Depth Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIInterfaceImpl extends CIM_ControlledByImpl implements CIM_SCSIInterface {
	/**
	 * The default value of the '{@link #getSCSITimeouts() <em>SCSI Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSITimeouts()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCSI_TIMEOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCSITimeouts() <em>SCSI Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSITimeouts()
	 * @generated
	 * @ordered
	 */
	protected Long scsiTimeouts = SCSI_TIMEOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCSIRetries() <em>SCSI Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSIRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCSI_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCSIRetries() <em>SCSI Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSIRetries()
	 * @generated
	 * @ordered
	 */
	protected Long scsiRetries = SCSI_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiatorId() <em>Initiator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorId()
	 * @generated
	 * @ordered
	 */
	protected static final Long INITIATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatorId() <em>Initiator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorId()
	 * @generated
	 * @ordered
	 */
	protected Long initiatorId = INITIATOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final Long TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Long targetId = TARGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLUN() <em>Target LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLUN()
	 * @generated
	 * @ordered
	 */
	protected static final Long TARGET_LUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLUN() <em>Target LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLUN()
	 * @generated
	 * @ordered
	 */
	protected Long targetLUN = TARGET_LUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCSIReservation() <em>SCSI Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSIReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCSI_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCSIReservation() <em>SCSI Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSIReservation()
	 * @generated
	 * @ordered
	 */
	protected Integer scsiReservation = SCSI_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCSISignal() <em>SCSI Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSISignal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCSI_SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCSISignal() <em>SCSI Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCSISignal()
	 * @generated
	 * @ordered
	 */
	protected Integer scsiSignal = SCSI_SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQueueDepth() <em>Max Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_QUEUE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQueueDepth() <em>Max Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQueueDepth()
	 * @generated
	 * @ordered
	 */
	protected Long maxQueueDepth = MAX_QUEUE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueDepthLimit() <em>Queue Depth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueDepthLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long QUEUE_DEPTH_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueDepthLimit() <em>Queue Depth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueDepthLimit()
	 * @generated
	 * @ordered
	 */
	protected Long queueDepthLimit = QUEUE_DEPTH_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSCSITimeouts() {
		return scsiTimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCSITimeouts(Long newSCSITimeouts) {
		Long oldSCSITimeouts = scsiTimeouts;
		scsiTimeouts = newSCSITimeouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__SCSI_TIMEOUTS, oldSCSITimeouts, scsiTimeouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSCSIRetries() {
		return scsiRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCSIRetries(Long newSCSIRetries) {
		Long oldSCSIRetries = scsiRetries;
		scsiRetries = newSCSIRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__SCSI_RETRIES, oldSCSIRetries, scsiRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInitiatorId() {
		return initiatorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiatorId(Long newInitiatorId) {
		Long oldInitiatorId = initiatorId;
		initiatorId = newInitiatorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__INITIATOR_ID, oldInitiatorId, initiatorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetId(Long newTargetId) {
		Long oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTargetLUN() {
		return targetLUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetLUN(Long newTargetLUN) {
		Long oldTargetLUN = targetLUN;
		targetLUN = newTargetLUN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__TARGET_LUN, oldTargetLUN, targetLUN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCSIReservation() {
		return scsiReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCSIReservation(Integer newSCSIReservation) {
		Integer oldSCSIReservation = scsiReservation;
		scsiReservation = newSCSIReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__SCSI_RESERVATION, oldSCSIReservation, scsiReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCSISignal() {
		return scsiSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCSISignal(Integer newSCSISignal) {
		Integer oldSCSISignal = scsiSignal;
		scsiSignal = newSCSISignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__SCSI_SIGNAL, oldSCSISignal, scsiSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxQueueDepth() {
		return maxQueueDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQueueDepth(Long newMaxQueueDepth) {
		Long oldMaxQueueDepth = maxQueueDepth;
		maxQueueDepth = newMaxQueueDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__MAX_QUEUE_DEPTH, oldMaxQueueDepth, maxQueueDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getQueueDepthLimit() {
		return queueDepthLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueDepthLimit(Long newQueueDepthLimit) {
		Long oldQueueDepthLimit = queueDepthLimit;
		queueDepthLimit = newQueueDepthLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_INTERFACE__QUEUE_DEPTH_LIMIT, oldQueueDepthLimit, queueDepthLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_TIMEOUTS:
				return getSCSITimeouts();
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RETRIES:
				return getSCSIRetries();
			case CimPackage.CIM_SCSI_INTERFACE__INITIATOR_ID:
				return getInitiatorId();
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_ID:
				return getTargetId();
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_LUN:
				return getTargetLUN();
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RESERVATION:
				return getSCSIReservation();
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_SIGNAL:
				return getSCSISignal();
			case CimPackage.CIM_SCSI_INTERFACE__MAX_QUEUE_DEPTH:
				return getMaxQueueDepth();
			case CimPackage.CIM_SCSI_INTERFACE__QUEUE_DEPTH_LIMIT:
				return getQueueDepthLimit();
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
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_TIMEOUTS:
				setSCSITimeouts((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RETRIES:
				setSCSIRetries((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__INITIATOR_ID:
				setInitiatorId((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_ID:
				setTargetId((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_LUN:
				setTargetLUN((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RESERVATION:
				setSCSIReservation((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_SIGNAL:
				setSCSISignal((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__MAX_QUEUE_DEPTH:
				setMaxQueueDepth((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__QUEUE_DEPTH_LIMIT:
				setQueueDepthLimit((Long)newValue);
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
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_TIMEOUTS:
				setSCSITimeouts(SCSI_TIMEOUTS_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RETRIES:
				setSCSIRetries(SCSI_RETRIES_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__INITIATOR_ID:
				setInitiatorId(INITIATOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_ID:
				setTargetId(TARGET_ID_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_LUN:
				setTargetLUN(TARGET_LUN_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RESERVATION:
				setSCSIReservation(SCSI_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_SIGNAL:
				setSCSISignal(SCSI_SIGNAL_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__MAX_QUEUE_DEPTH:
				setMaxQueueDepth(MAX_QUEUE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_INTERFACE__QUEUE_DEPTH_LIMIT:
				setQueueDepthLimit(QUEUE_DEPTH_LIMIT_EDEFAULT);
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
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_TIMEOUTS:
				return SCSI_TIMEOUTS_EDEFAULT == null ? scsiTimeouts != null : !SCSI_TIMEOUTS_EDEFAULT.equals(scsiTimeouts);
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RETRIES:
				return SCSI_RETRIES_EDEFAULT == null ? scsiRetries != null : !SCSI_RETRIES_EDEFAULT.equals(scsiRetries);
			case CimPackage.CIM_SCSI_INTERFACE__INITIATOR_ID:
				return INITIATOR_ID_EDEFAULT == null ? initiatorId != null : !INITIATOR_ID_EDEFAULT.equals(initiatorId);
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
			case CimPackage.CIM_SCSI_INTERFACE__TARGET_LUN:
				return TARGET_LUN_EDEFAULT == null ? targetLUN != null : !TARGET_LUN_EDEFAULT.equals(targetLUN);
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_RESERVATION:
				return SCSI_RESERVATION_EDEFAULT == null ? scsiReservation != null : !SCSI_RESERVATION_EDEFAULT.equals(scsiReservation);
			case CimPackage.CIM_SCSI_INTERFACE__SCSI_SIGNAL:
				return SCSI_SIGNAL_EDEFAULT == null ? scsiSignal != null : !SCSI_SIGNAL_EDEFAULT.equals(scsiSignal);
			case CimPackage.CIM_SCSI_INTERFACE__MAX_QUEUE_DEPTH:
				return MAX_QUEUE_DEPTH_EDEFAULT == null ? maxQueueDepth != null : !MAX_QUEUE_DEPTH_EDEFAULT.equals(maxQueueDepth);
			case CimPackage.CIM_SCSI_INTERFACE__QUEUE_DEPTH_LIMIT:
				return QUEUE_DEPTH_LIMIT_EDEFAULT == null ? queueDepthLimit != null : !QUEUE_DEPTH_LIMIT_EDEFAULT.equals(queueDepthLimit);
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
		result.append(" (SCSITimeouts: ");
		result.append(scsiTimeouts);
		result.append(", SCSIRetries: ");
		result.append(scsiRetries);
		result.append(", InitiatorId: ");
		result.append(initiatorId);
		result.append(", TargetId: ");
		result.append(targetId);
		result.append(", TargetLUN: ");
		result.append(targetLUN);
		result.append(", SCSIReservation: ");
		result.append(scsiReservation);
		result.append(", SCSISignal: ");
		result.append(scsiSignal);
		result.append(", MaxQueueDepth: ");
		result.append(maxQueueDepth);
		result.append(", QueueDepthLimit: ");
		result.append(queueDepthLimit);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIInterfaceImpl
