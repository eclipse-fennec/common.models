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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_FCAdapterEventCounters;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Adapter Event Counters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getABTSFramesReceived <em>ABTS Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getABTSFramesSent <em>ABTS Frames Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getFBSYsReceived <em>FBS Ys Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPBSYsReceived <em>PBS Ys Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPBSYsSent <em>PBS Ys Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getFRJTsReceived <em>FRJ Ts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPRJTsReceived <em>PRJ Ts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPRJTsSent <em>PRJ Ts Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPRLIsRejected <em>PRL Is Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getPRLOsRejected <em>PRL Os Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCAdapterEventCountersImpl#getABTSFramesRejected <em>ABTS Frames Rejected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCAdapterEventCountersImpl extends CIM_DeviceStatisticalInformationImpl implements CIM_FCAdapterEventCounters {
	/**
	 * The default value of the '{@link #getABTSFramesReceived() <em>ABTS Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long ABTS_FRAMES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getABTSFramesReceived() <em>ABTS Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long abtsFramesReceived = ABTS_FRAMES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getABTSFramesSent() <em>ABTS Frames Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long ABTS_FRAMES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getABTSFramesSent() <em>ABTS Frames Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesSent()
	 * @generated
	 * @ordered
	 */
	protected Long abtsFramesSent = ABTS_FRAMES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFBSYsReceived() <em>FBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBSYsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long FBS_YS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFBSYsReceived() <em>FBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBSYsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long fbsYsReceived = FBS_YS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPBSYsReceived() <em>PBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long PBS_YS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPBSYsReceived() <em>PBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long pbsYsReceived = PBS_YS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPBSYsSent() <em>PBS Ys Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long PBS_YS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPBSYsSent() <em>PBS Ys Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYsSent()
	 * @generated
	 * @ordered
	 */
	protected Long pbsYsSent = PBS_YS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFRJTsReceived() <em>FRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRJTsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRJ_TS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFRJTsReceived() <em>FRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRJTsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long frjTsReceived = FRJ_TS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRJTsReceived() <em>PRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRJ_TS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRJTsReceived() <em>PRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long prjTsReceived = PRJ_TS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRJTsSent() <em>PRJ Ts Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRJ_TS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRJTsSent() <em>PRJ Ts Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTsSent()
	 * @generated
	 * @ordered
	 */
	protected Long prjTsSent = PRJ_TS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRLIsRejected() <em>PRL Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRLIsRejected()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRL_IS_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRLIsRejected() <em>PRL Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRLIsRejected()
	 * @generated
	 * @ordered
	 */
	protected Long prlIsRejected = PRL_IS_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRLOsRejected() <em>PRL Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRLOsRejected()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRL_OS_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRLOsRejected() <em>PRL Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRLOsRejected()
	 * @generated
	 * @ordered
	 */
	protected Long prlOsRejected = PRL_OS_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getABTSFramesRejected() <em>ABTS Frames Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesRejected()
	 * @generated
	 * @ordered
	 */
	protected static final Long ABTS_FRAMES_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getABTSFramesRejected() <em>ABTS Frames Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABTSFramesRejected()
	 * @generated
	 * @ordered
	 */
	protected Long abtsFramesRejected = ABTS_FRAMES_REJECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCAdapterEventCountersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCAdapterEventCounters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getABTSFramesReceived() {
		return abtsFramesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setABTSFramesReceived(Long newABTSFramesReceived) {
		Long oldABTSFramesReceived = abtsFramesReceived;
		abtsFramesReceived = newABTSFramesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_RECEIVED, oldABTSFramesReceived, abtsFramesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getABTSFramesSent() {
		return abtsFramesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setABTSFramesSent(Long newABTSFramesSent) {
		Long oldABTSFramesSent = abtsFramesSent;
		abtsFramesSent = newABTSFramesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_SENT, oldABTSFramesSent, abtsFramesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFBSYsReceived() {
		return fbsYsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFBSYsReceived(Long newFBSYsReceived) {
		Long oldFBSYsReceived = fbsYsReceived;
		fbsYsReceived = newFBSYsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FBS_YS_RECEIVED, oldFBSYsReceived, fbsYsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPBSYsReceived() {
		return pbsYsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPBSYsReceived(Long newPBSYsReceived) {
		Long oldPBSYsReceived = pbsYsReceived;
		pbsYsReceived = newPBSYsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_RECEIVED, oldPBSYsReceived, pbsYsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPBSYsSent() {
		return pbsYsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPBSYsSent(Long newPBSYsSent) {
		Long oldPBSYsSent = pbsYsSent;
		pbsYsSent = newPBSYsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_SENT, oldPBSYsSent, pbsYsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFRJTsReceived() {
		return frjTsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRJTsReceived(Long newFRJTsReceived) {
		Long oldFRJTsReceived = frjTsReceived;
		frjTsReceived = newFRJTsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FRJ_TS_RECEIVED, oldFRJTsReceived, frjTsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPRJTsReceived() {
		return prjTsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRJTsReceived(Long newPRJTsReceived) {
		Long oldPRJTsReceived = prjTsReceived;
		prjTsReceived = newPRJTsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_RECEIVED, oldPRJTsReceived, prjTsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPRJTsSent() {
		return prjTsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRJTsSent(Long newPRJTsSent) {
		Long oldPRJTsSent = prjTsSent;
		prjTsSent = newPRJTsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_SENT, oldPRJTsSent, prjTsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPRLIsRejected() {
		return prlIsRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRLIsRejected(Long newPRLIsRejected) {
		Long oldPRLIsRejected = prlIsRejected;
		prlIsRejected = newPRLIsRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_IS_REJECTED, oldPRLIsRejected, prlIsRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPRLOsRejected() {
		return prlOsRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRLOsRejected(Long newPRLOsRejected) {
		Long oldPRLOsRejected = prlOsRejected;
		prlOsRejected = newPRLOsRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_OS_REJECTED, oldPRLOsRejected, prlOsRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getABTSFramesRejected() {
		return abtsFramesRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setABTSFramesRejected(Long newABTSFramesRejected) {
		Long oldABTSFramesRejected = abtsFramesRejected;
		abtsFramesRejected = newABTSFramesRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_REJECTED, oldABTSFramesRejected, abtsFramesRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ResetCounter(Integer SelectedCounter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_RECEIVED:
				return getABTSFramesReceived();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_SENT:
				return getABTSFramesSent();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FBS_YS_RECEIVED:
				return getFBSYsReceived();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_RECEIVED:
				return getPBSYsReceived();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_SENT:
				return getPBSYsSent();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FRJ_TS_RECEIVED:
				return getFRJTsReceived();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_RECEIVED:
				return getPRJTsReceived();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_SENT:
				return getPRJTsSent();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_IS_REJECTED:
				return getPRLIsRejected();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_OS_REJECTED:
				return getPRLOsRejected();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_REJECTED:
				return getABTSFramesRejected();
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
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_RECEIVED:
				setABTSFramesReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_SENT:
				setABTSFramesSent((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FBS_YS_RECEIVED:
				setFBSYsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_RECEIVED:
				setPBSYsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_SENT:
				setPBSYsSent((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FRJ_TS_RECEIVED:
				setFRJTsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_RECEIVED:
				setPRJTsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_SENT:
				setPRJTsSent((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_IS_REJECTED:
				setPRLIsRejected((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_OS_REJECTED:
				setPRLOsRejected((Long)newValue);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_REJECTED:
				setABTSFramesRejected((Long)newValue);
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
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_RECEIVED:
				setABTSFramesReceived(ABTS_FRAMES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_SENT:
				setABTSFramesSent(ABTS_FRAMES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FBS_YS_RECEIVED:
				setFBSYsReceived(FBS_YS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_RECEIVED:
				setPBSYsReceived(PBS_YS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_SENT:
				setPBSYsSent(PBS_YS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FRJ_TS_RECEIVED:
				setFRJTsReceived(FRJ_TS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_RECEIVED:
				setPRJTsReceived(PRJ_TS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_SENT:
				setPRJTsSent(PRJ_TS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_IS_REJECTED:
				setPRLIsRejected(PRL_IS_REJECTED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_OS_REJECTED:
				setPRLOsRejected(PRL_OS_REJECTED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_REJECTED:
				setABTSFramesRejected(ABTS_FRAMES_REJECTED_EDEFAULT);
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
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_RECEIVED:
				return ABTS_FRAMES_RECEIVED_EDEFAULT == null ? abtsFramesReceived != null : !ABTS_FRAMES_RECEIVED_EDEFAULT.equals(abtsFramesReceived);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_SENT:
				return ABTS_FRAMES_SENT_EDEFAULT == null ? abtsFramesSent != null : !ABTS_FRAMES_SENT_EDEFAULT.equals(abtsFramesSent);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FBS_YS_RECEIVED:
				return FBS_YS_RECEIVED_EDEFAULT == null ? fbsYsReceived != null : !FBS_YS_RECEIVED_EDEFAULT.equals(fbsYsReceived);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_RECEIVED:
				return PBS_YS_RECEIVED_EDEFAULT == null ? pbsYsReceived != null : !PBS_YS_RECEIVED_EDEFAULT.equals(pbsYsReceived);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PBS_YS_SENT:
				return PBS_YS_SENT_EDEFAULT == null ? pbsYsSent != null : !PBS_YS_SENT_EDEFAULT.equals(pbsYsSent);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__FRJ_TS_RECEIVED:
				return FRJ_TS_RECEIVED_EDEFAULT == null ? frjTsReceived != null : !FRJ_TS_RECEIVED_EDEFAULT.equals(frjTsReceived);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_RECEIVED:
				return PRJ_TS_RECEIVED_EDEFAULT == null ? prjTsReceived != null : !PRJ_TS_RECEIVED_EDEFAULT.equals(prjTsReceived);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRJ_TS_SENT:
				return PRJ_TS_SENT_EDEFAULT == null ? prjTsSent != null : !PRJ_TS_SENT_EDEFAULT.equals(prjTsSent);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_IS_REJECTED:
				return PRL_IS_REJECTED_EDEFAULT == null ? prlIsRejected != null : !PRL_IS_REJECTED_EDEFAULT.equals(prlIsRejected);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__PRL_OS_REJECTED:
				return PRL_OS_REJECTED_EDEFAULT == null ? prlOsRejected != null : !PRL_OS_REJECTED_EDEFAULT.equals(prlOsRejected);
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS__ABTS_FRAMES_REJECTED:
				return ABTS_FRAMES_REJECTED_EDEFAULT == null ? abtsFramesRejected != null : !ABTS_FRAMES_REJECTED_EDEFAULT.equals(abtsFramesRejected);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS___RESET_COUNTER__INTEGER:
				return ResetCounter((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ABTSFramesReceived: ");
		result.append(abtsFramesReceived);
		result.append(", ABTSFramesSent: ");
		result.append(abtsFramesSent);
		result.append(", FBSYsReceived: ");
		result.append(fbsYsReceived);
		result.append(", PBSYsReceived: ");
		result.append(pbsYsReceived);
		result.append(", PBSYsSent: ");
		result.append(pbsYsSent);
		result.append(", FRJTsReceived: ");
		result.append(frjTsReceived);
		result.append(", PRJTsReceived: ");
		result.append(prjTsReceived);
		result.append(", PRJTsSent: ");
		result.append(prjTsSent);
		result.append(", PRLIsRejected: ");
		result.append(prlIsRejected);
		result.append(", PRLOsRejected: ");
		result.append(prlOsRejected);
		result.append(", ABTSFramesRejected: ");
		result.append(abtsFramesRejected);
		result.append(')');
		return result.toString();
	}

} //CIM_FCAdapterEventCountersImpl
