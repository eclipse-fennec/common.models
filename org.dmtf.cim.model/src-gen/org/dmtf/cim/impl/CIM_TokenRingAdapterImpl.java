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

import java.util.Collection;

import org.dmtf.cim.CIM_TokenRingAdapter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Token Ring Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRingStatus <em>Ring Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRingState <em>Ring State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRingOpenStatus <em>Ring Open Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRingSpeed <em>Ring Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getBurstErrors <em>Burst Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getACErrors <em>AC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getAbortTransErrors <em>Abort Trans Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getInternalErrors <em>Internal Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getLostFrameErrors <em>Lost Frame Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getReceiveCongestions <em>Receive Congestions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getFrameCopiedErrors <em>Frame Copied Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getTokenErrors <em>Token Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getSoftErrors <em>Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getHardErrors <em>Hard Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getSignalLossCount <em>Signal Loss Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getTransmittedBeacons <em>Transmitted Beacons</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRecoverys <em>Recoverys</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getLobeWires <em>Lobe Wires</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getRemoves <em>Removes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getSingles <em>Singles</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenRingAdapterImpl#getFrequencyErrors <em>Frequency Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TokenRingAdapterImpl extends CIM_NetworkAdapterImpl implements CIM_TokenRingAdapter {
	/**
	 * The default value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataSize = MAX_DATA_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The cached value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledCapabilities;

	/**
	 * The default value of the '{@link #getRingStatus() <em>Ring Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long RING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingStatus() <em>Ring Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingStatus()
	 * @generated
	 * @ordered
	 */
	protected Long ringStatus = RING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingState() <em>Ring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingState() <em>Ring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingState()
	 * @generated
	 * @ordered
	 */
	protected Integer ringState = RING_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingOpenStatus() <em>Ring Open Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingOpenStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_OPEN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingOpenStatus() <em>Ring Open Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingOpenStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer ringOpenStatus = RING_OPEN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingSpeed() <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RING_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingSpeed() <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingSpeed()
	 * @generated
	 * @ordered
	 */
	protected Integer ringSpeed = RING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBurstErrors() <em>Burst Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long BURST_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBurstErrors() <em>Burst Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstErrors()
	 * @generated
	 * @ordered
	 */
	protected Long burstErrors = BURST_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getACErrors() <em>AC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long AC_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACErrors() <em>AC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACErrors()
	 * @generated
	 * @ordered
	 */
	protected Long acErrors = AC_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbortTransErrors() <em>Abort Trans Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortTransErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long ABORT_TRANS_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbortTransErrors() <em>Abort Trans Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortTransErrors()
	 * @generated
	 * @ordered
	 */
	protected Long abortTransErrors = ABORT_TRANS_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalErrors() <em>Internal Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERNAL_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalErrors() <em>Internal Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalErrors()
	 * @generated
	 * @ordered
	 */
	protected Long internalErrors = INTERNAL_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLostFrameErrors() <em>Lost Frame Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLostFrameErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOST_FRAME_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLostFrameErrors() <em>Lost Frame Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLostFrameErrors()
	 * @generated
	 * @ordered
	 */
	protected Long lostFrameErrors = LOST_FRAME_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveCongestions() <em>Receive Congestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCongestions()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_CONGESTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveCongestions() <em>Receive Congestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCongestions()
	 * @generated
	 * @ordered
	 */
	protected Long receiveCongestions = RECEIVE_CONGESTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameCopiedErrors() <em>Frame Copied Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCopiedErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAME_COPIED_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameCopiedErrors() <em>Frame Copied Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCopiedErrors()
	 * @generated
	 * @ordered
	 */
	protected Long frameCopiedErrors = FRAME_COPIED_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenErrors() <em>Token Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOKEN_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenErrors() <em>Token Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenErrors()
	 * @generated
	 * @ordered
	 */
	protected Long tokenErrors = TOKEN_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftErrors() <em>Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long SOFT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftErrors() <em>Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftErrors()
	 * @generated
	 * @ordered
	 */
	protected Long softErrors = SOFT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardErrors() <em>Hard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long HARD_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardErrors() <em>Hard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardErrors()
	 * @generated
	 * @ordered
	 */
	protected Long hardErrors = HARD_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalLossCount() <em>Signal Loss Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLossCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIGNAL_LOSS_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalLossCount() <em>Signal Loss Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLossCount()
	 * @generated
	 * @ordered
	 */
	protected Long signalLossCount = SIGNAL_LOSS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmittedBeacons() <em>Transmitted Beacons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittedBeacons()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMITTED_BEACONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmittedBeacons() <em>Transmitted Beacons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittedBeacons()
	 * @generated
	 * @ordered
	 */
	protected Long transmittedBeacons = TRANSMITTED_BEACONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoverys() <em>Recoverys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverys()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECOVERYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoverys() <em>Recoverys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverys()
	 * @generated
	 * @ordered
	 */
	protected Long recoverys = RECOVERYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLobeWires() <em>Lobe Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobeWires()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOBE_WIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLobeWires() <em>Lobe Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobeWires()
	 * @generated
	 * @ordered
	 */
	protected Long lobeWires = LOBE_WIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoves() <em>Removes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoves()
	 * @generated
	 * @ordered
	 */
	protected static final Long REMOVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoves() <em>Removes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoves()
	 * @generated
	 * @ordered
	 */
	protected Long removes = REMOVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingles() <em>Singles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingles()
	 * @generated
	 * @ordered
	 */
	protected static final Long SINGLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingles() <em>Singles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingles()
	 * @generated
	 * @ordered
	 */
	protected Long singles = SINGLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyErrors() <em>Frequency Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREQUENCY_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyErrors() <em>Frequency Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyErrors()
	 * @generated
	 * @ordered
	 */
	protected Long frequencyErrors = FREQUENCY_ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TokenRingAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TokenRingAdapter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataSize() {
		return maxDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataSize(Long newMaxDataSize) {
		Long oldMaxDataSize = maxDataSize;
		maxDataSize = newMaxDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledCapabilities() {
		if (enabledCapabilities == null) {
			enabledCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TOKEN_RING_ADAPTER__ENABLED_CAPABILITIES);
		}
		return enabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRingStatus() {
		return ringStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingStatus(Long newRingStatus) {
		Long oldRingStatus = ringStatus;
		ringStatus = newRingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATUS, oldRingStatus, ringStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingState() {
		return ringState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingState(Integer newRingState) {
		Integer oldRingState = ringState;
		ringState = newRingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATE, oldRingState, ringState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingOpenStatus() {
		return ringOpenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingOpenStatus(Integer newRingOpenStatus) {
		Integer oldRingOpenStatus = ringOpenStatus;
		ringOpenStatus = newRingOpenStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RING_OPEN_STATUS, oldRingOpenStatus, ringOpenStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingSpeed() {
		return ringSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingSpeed(Integer newRingSpeed) {
		Integer oldRingSpeed = ringSpeed;
		ringSpeed = newRingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RING_SPEED, oldRingSpeed, ringSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBurstErrors() {
		return burstErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBurstErrors(Long newBurstErrors) {
		Long oldBurstErrors = burstErrors;
		burstErrors = newBurstErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__BURST_ERRORS, oldBurstErrors, burstErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getACErrors() {
		return acErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACErrors(Long newACErrors) {
		Long oldACErrors = acErrors;
		acErrors = newACErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__AC_ERRORS, oldACErrors, acErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAbortTransErrors() {
		return abortTransErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbortTransErrors(Long newAbortTransErrors) {
		Long oldAbortTransErrors = abortTransErrors;
		abortTransErrors = newAbortTransErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__ABORT_TRANS_ERRORS, oldAbortTransErrors, abortTransErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInternalErrors() {
		return internalErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalErrors(Long newInternalErrors) {
		Long oldInternalErrors = internalErrors;
		internalErrors = newInternalErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__INTERNAL_ERRORS, oldInternalErrors, internalErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLostFrameErrors() {
		return lostFrameErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLostFrameErrors(Long newLostFrameErrors) {
		Long oldLostFrameErrors = lostFrameErrors;
		lostFrameErrors = newLostFrameErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__LOST_FRAME_ERRORS, oldLostFrameErrors, lostFrameErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveCongestions() {
		return receiveCongestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveCongestions(Long newReceiveCongestions) {
		Long oldReceiveCongestions = receiveCongestions;
		receiveCongestions = newReceiveCongestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RECEIVE_CONGESTIONS, oldReceiveCongestions, receiveCongestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFrameCopiedErrors() {
		return frameCopiedErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrameCopiedErrors(Long newFrameCopiedErrors) {
		Long oldFrameCopiedErrors = frameCopiedErrors;
		frameCopiedErrors = newFrameCopiedErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__FRAME_COPIED_ERRORS, oldFrameCopiedErrors, frameCopiedErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTokenErrors() {
		return tokenErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenErrors(Long newTokenErrors) {
		Long oldTokenErrors = tokenErrors;
		tokenErrors = newTokenErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__TOKEN_ERRORS, oldTokenErrors, tokenErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSoftErrors() {
		return softErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftErrors(Long newSoftErrors) {
		Long oldSoftErrors = softErrors;
		softErrors = newSoftErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__SOFT_ERRORS, oldSoftErrors, softErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHardErrors() {
		return hardErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardErrors(Long newHardErrors) {
		Long oldHardErrors = hardErrors;
		hardErrors = newHardErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__HARD_ERRORS, oldHardErrors, hardErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSignalLossCount() {
		return signalLossCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalLossCount(Long newSignalLossCount) {
		Long oldSignalLossCount = signalLossCount;
		signalLossCount = newSignalLossCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__SIGNAL_LOSS_COUNT, oldSignalLossCount, signalLossCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmittedBeacons() {
		return transmittedBeacons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmittedBeacons(Long newTransmittedBeacons) {
		Long oldTransmittedBeacons = transmittedBeacons;
		transmittedBeacons = newTransmittedBeacons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__TRANSMITTED_BEACONS, oldTransmittedBeacons, transmittedBeacons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRecoverys() {
		return recoverys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoverys(Long newRecoverys) {
		Long oldRecoverys = recoverys;
		recoverys = newRecoverys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__RECOVERYS, oldRecoverys, recoverys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLobeWires() {
		return lobeWires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLobeWires(Long newLobeWires) {
		Long oldLobeWires = lobeWires;
		lobeWires = newLobeWires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__LOBE_WIRES, oldLobeWires, lobeWires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRemoves() {
		return removes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoves(Long newRemoves) {
		Long oldRemoves = removes;
		removes = newRemoves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__REMOVES, oldRemoves, removes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSingles() {
		return singles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingles(Long newSingles) {
		Long oldSingles = singles;
		singles = newSingles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__SINGLES, oldSingles, singles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFrequencyErrors() {
		return frequencyErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequencyErrors(Long newFrequencyErrors) {
		Long oldFrequencyErrors = frequencyErrors;
		frequencyErrors = newFrequencyErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_RING_ADAPTER__FREQUENCY_ERRORS, oldFrequencyErrors, frequencyErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TOKEN_RING_ADAPTER__MAX_DATA_SIZE:
				return getMaxDataSize();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATUS:
				return getRingStatus();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATE:
				return getRingState();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_OPEN_STATUS:
				return getRingOpenStatus();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_SPEED:
				return getRingSpeed();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__BURST_ERRORS:
				return getBurstErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__AC_ERRORS:
				return getACErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ABORT_TRANS_ERRORS:
				return getAbortTransErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__INTERNAL_ERRORS:
				return getInternalErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOST_FRAME_ERRORS:
				return getLostFrameErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECEIVE_CONGESTIONS:
				return getReceiveCongestions();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FRAME_COPIED_ERRORS:
				return getFrameCopiedErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TOKEN_ERRORS:
				return getTokenErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SOFT_ERRORS:
				return getSoftErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__HARD_ERRORS:
				return getHardErrors();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SIGNAL_LOSS_COUNT:
				return getSignalLossCount();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TRANSMITTED_BEACONS:
				return getTransmittedBeacons();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECOVERYS:
				return getRecoverys();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOBE_WIRES:
				return getLobeWires();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__REMOVES:
				return getRemoves();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SINGLES:
				return getSingles();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FREQUENCY_ERRORS:
				return getFrequencyErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_TOKEN_RING_ADAPTER__MAX_DATA_SIZE:
				setMaxDataSize((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				getEnabledCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATUS:
				setRingStatus((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATE:
				setRingState((Integer)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_OPEN_STATUS:
				setRingOpenStatus((Integer)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_SPEED:
				setRingSpeed((Integer)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__BURST_ERRORS:
				setBurstErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__AC_ERRORS:
				setACErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ABORT_TRANS_ERRORS:
				setAbortTransErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__INTERNAL_ERRORS:
				setInternalErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOST_FRAME_ERRORS:
				setLostFrameErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECEIVE_CONGESTIONS:
				setReceiveCongestions((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FRAME_COPIED_ERRORS:
				setFrameCopiedErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TOKEN_ERRORS:
				setTokenErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SOFT_ERRORS:
				setSoftErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__HARD_ERRORS:
				setHardErrors((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SIGNAL_LOSS_COUNT:
				setSignalLossCount((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TRANSMITTED_BEACONS:
				setTransmittedBeacons((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECOVERYS:
				setRecoverys((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOBE_WIRES:
				setLobeWires((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__REMOVES:
				setRemoves((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SINGLES:
				setSingles((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FREQUENCY_ERRORS:
				setFrequencyErrors((Long)newValue);
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
			case CimPackage.CIM_TOKEN_RING_ADAPTER__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATUS:
				setRingStatus(RING_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATE:
				setRingState(RING_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_OPEN_STATUS:
				setRingOpenStatus(RING_OPEN_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_SPEED:
				setRingSpeed(RING_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__BURST_ERRORS:
				setBurstErrors(BURST_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__AC_ERRORS:
				setACErrors(AC_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ABORT_TRANS_ERRORS:
				setAbortTransErrors(ABORT_TRANS_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__INTERNAL_ERRORS:
				setInternalErrors(INTERNAL_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOST_FRAME_ERRORS:
				setLostFrameErrors(LOST_FRAME_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECEIVE_CONGESTIONS:
				setReceiveCongestions(RECEIVE_CONGESTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FRAME_COPIED_ERRORS:
				setFrameCopiedErrors(FRAME_COPIED_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TOKEN_ERRORS:
				setTokenErrors(TOKEN_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SOFT_ERRORS:
				setSoftErrors(SOFT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__HARD_ERRORS:
				setHardErrors(HARD_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SIGNAL_LOSS_COUNT:
				setSignalLossCount(SIGNAL_LOSS_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TRANSMITTED_BEACONS:
				setTransmittedBeacons(TRANSMITTED_BEACONS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECOVERYS:
				setRecoverys(RECOVERYS_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOBE_WIRES:
				setLobeWires(LOBE_WIRES_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__REMOVES:
				setRemoves(REMOVES_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SINGLES:
				setSingles(SINGLES_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FREQUENCY_ERRORS:
				setFrequencyErrors(FREQUENCY_ERRORS_EDEFAULT);
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
			case CimPackage.CIM_TOKEN_RING_ADAPTER__MAX_DATA_SIZE:
				return MAX_DATA_SIZE_EDEFAULT == null ? maxDataSize != null : !MAX_DATA_SIZE_EDEFAULT.equals(maxDataSize);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ENABLED_CAPABILITIES:
				return enabledCapabilities != null && !enabledCapabilities.isEmpty();
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATUS:
				return RING_STATUS_EDEFAULT == null ? ringStatus != null : !RING_STATUS_EDEFAULT.equals(ringStatus);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_STATE:
				return RING_STATE_EDEFAULT == null ? ringState != null : !RING_STATE_EDEFAULT.equals(ringState);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_OPEN_STATUS:
				return RING_OPEN_STATUS_EDEFAULT == null ? ringOpenStatus != null : !RING_OPEN_STATUS_EDEFAULT.equals(ringOpenStatus);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RING_SPEED:
				return RING_SPEED_EDEFAULT == null ? ringSpeed != null : !RING_SPEED_EDEFAULT.equals(ringSpeed);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__BURST_ERRORS:
				return BURST_ERRORS_EDEFAULT == null ? burstErrors != null : !BURST_ERRORS_EDEFAULT.equals(burstErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__AC_ERRORS:
				return AC_ERRORS_EDEFAULT == null ? acErrors != null : !AC_ERRORS_EDEFAULT.equals(acErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__ABORT_TRANS_ERRORS:
				return ABORT_TRANS_ERRORS_EDEFAULT == null ? abortTransErrors != null : !ABORT_TRANS_ERRORS_EDEFAULT.equals(abortTransErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__INTERNAL_ERRORS:
				return INTERNAL_ERRORS_EDEFAULT == null ? internalErrors != null : !INTERNAL_ERRORS_EDEFAULT.equals(internalErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOST_FRAME_ERRORS:
				return LOST_FRAME_ERRORS_EDEFAULT == null ? lostFrameErrors != null : !LOST_FRAME_ERRORS_EDEFAULT.equals(lostFrameErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECEIVE_CONGESTIONS:
				return RECEIVE_CONGESTIONS_EDEFAULT == null ? receiveCongestions != null : !RECEIVE_CONGESTIONS_EDEFAULT.equals(receiveCongestions);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FRAME_COPIED_ERRORS:
				return FRAME_COPIED_ERRORS_EDEFAULT == null ? frameCopiedErrors != null : !FRAME_COPIED_ERRORS_EDEFAULT.equals(frameCopiedErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TOKEN_ERRORS:
				return TOKEN_ERRORS_EDEFAULT == null ? tokenErrors != null : !TOKEN_ERRORS_EDEFAULT.equals(tokenErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SOFT_ERRORS:
				return SOFT_ERRORS_EDEFAULT == null ? softErrors != null : !SOFT_ERRORS_EDEFAULT.equals(softErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__HARD_ERRORS:
				return HARD_ERRORS_EDEFAULT == null ? hardErrors != null : !HARD_ERRORS_EDEFAULT.equals(hardErrors);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SIGNAL_LOSS_COUNT:
				return SIGNAL_LOSS_COUNT_EDEFAULT == null ? signalLossCount != null : !SIGNAL_LOSS_COUNT_EDEFAULT.equals(signalLossCount);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__TRANSMITTED_BEACONS:
				return TRANSMITTED_BEACONS_EDEFAULT == null ? transmittedBeacons != null : !TRANSMITTED_BEACONS_EDEFAULT.equals(transmittedBeacons);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__RECOVERYS:
				return RECOVERYS_EDEFAULT == null ? recoverys != null : !RECOVERYS_EDEFAULT.equals(recoverys);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__LOBE_WIRES:
				return LOBE_WIRES_EDEFAULT == null ? lobeWires != null : !LOBE_WIRES_EDEFAULT.equals(lobeWires);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__REMOVES:
				return REMOVES_EDEFAULT == null ? removes != null : !REMOVES_EDEFAULT.equals(removes);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__SINGLES:
				return SINGLES_EDEFAULT == null ? singles != null : !SINGLES_EDEFAULT.equals(singles);
			case CimPackage.CIM_TOKEN_RING_ADAPTER__FREQUENCY_ERRORS:
				return FREQUENCY_ERRORS_EDEFAULT == null ? frequencyErrors != null : !FREQUENCY_ERRORS_EDEFAULT.equals(frequencyErrors);
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
		result.append(" (MaxDataSize: ");
		result.append(maxDataSize);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", EnabledCapabilities: ");
		result.append(enabledCapabilities);
		result.append(", RingStatus: ");
		result.append(ringStatus);
		result.append(", RingState: ");
		result.append(ringState);
		result.append(", RingOpenStatus: ");
		result.append(ringOpenStatus);
		result.append(", RingSpeed: ");
		result.append(ringSpeed);
		result.append(", BurstErrors: ");
		result.append(burstErrors);
		result.append(", ACErrors: ");
		result.append(acErrors);
		result.append(", AbortTransErrors: ");
		result.append(abortTransErrors);
		result.append(", InternalErrors: ");
		result.append(internalErrors);
		result.append(", LostFrameErrors: ");
		result.append(lostFrameErrors);
		result.append(", ReceiveCongestions: ");
		result.append(receiveCongestions);
		result.append(", FrameCopiedErrors: ");
		result.append(frameCopiedErrors);
		result.append(", TokenErrors: ");
		result.append(tokenErrors);
		result.append(", SoftErrors: ");
		result.append(softErrors);
		result.append(", HardErrors: ");
		result.append(hardErrors);
		result.append(", SignalLossCount: ");
		result.append(signalLossCount);
		result.append(", TransmittedBeacons: ");
		result.append(transmittedBeacons);
		result.append(", Recoverys: ");
		result.append(recoverys);
		result.append(", LobeWires: ");
		result.append(lobeWires);
		result.append(", Removes: ");
		result.append(removes);
		result.append(", Singles: ");
		result.append(singles);
		result.append(", FrequencyErrors: ");
		result.append(frequencyErrors);
		result.append(')');
		return result.toString();
	}

} //CIM_TokenRingAdapterImpl
