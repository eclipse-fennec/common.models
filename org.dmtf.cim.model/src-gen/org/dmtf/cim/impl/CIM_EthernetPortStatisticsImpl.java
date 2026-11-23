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

import org.dmtf.cim.CIM_EthernetPortStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Ethernet Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getSymbolErrors <em>Symbol Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getAlignmentErrors <em>Alignment Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getFCSErrors <em>FCS Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getSingleCollisionFrames <em>Single Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getMultipleCollisionFrames <em>Multiple Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getSQETestErrors <em>SQE Test Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getDeferredTransmissions <em>Deferred Transmissions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getLateCollisions <em>Late Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getExcessiveCollisions <em>Excessive Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getInternalMACTransmitErrors <em>Internal MAC Transmit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getInternalMACReceiveErrors <em>Internal MAC Receive Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getCarrierSenseErrors <em>Carrier Sense Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortStatisticsImpl#getFrameTooLongs <em>Frame Too Longs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EthernetPortStatisticsImpl extends CIM_NetworkPortStatisticsImpl implements CIM_EthernetPortStatistics {
	/**
	 * The default value of the '{@link #getSymbolErrors() <em>Symbol Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long SYMBOL_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolErrors() <em>Symbol Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolErrors()
	 * @generated
	 * @ordered
	 */
	protected Long symbolErrors = SYMBOL_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignmentErrors() <em>Alignment Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long ALIGNMENT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignmentErrors() <em>Alignment Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentErrors()
	 * @generated
	 * @ordered
	 */
	protected Long alignmentErrors = ALIGNMENT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFCSErrors() <em>FCS Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCSErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long FCS_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCSErrors() <em>FCS Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCSErrors()
	 * @generated
	 * @ordered
	 */
	protected Long fcsErrors = FCS_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingleCollisionFrames() <em>Single Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleCollisionFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long SINGLE_COLLISION_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleCollisionFrames() <em>Single Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleCollisionFrames()
	 * @generated
	 * @ordered
	 */
	protected Long singleCollisionFrames = SINGLE_COLLISION_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleCollisionFrames() <em>Multiple Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleCollisionFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long MULTIPLE_COLLISION_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleCollisionFrames() <em>Multiple Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleCollisionFrames()
	 * @generated
	 * @ordered
	 */
	protected Long multipleCollisionFrames = MULTIPLE_COLLISION_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSQETestErrors() <em>SQE Test Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQETestErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long SQE_TEST_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSQETestErrors() <em>SQE Test Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQETestErrors()
	 * @generated
	 * @ordered
	 */
	protected Long sqeTestErrors = SQE_TEST_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeferredTransmissions() <em>Deferred Transmissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferredTransmissions()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFERRED_TRANSMISSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeferredTransmissions() <em>Deferred Transmissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferredTransmissions()
	 * @generated
	 * @ordered
	 */
	protected Long deferredTransmissions = DEFERRED_TRANSMISSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLateCollisions() <em>Late Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateCollisions()
	 * @generated
	 * @ordered
	 */
	protected static final Long LATE_COLLISIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLateCollisions() <em>Late Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateCollisions()
	 * @generated
	 * @ordered
	 */
	protected Long lateCollisions = LATE_COLLISIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcessiveCollisions() <em>Excessive Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcessiveCollisions()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXCESSIVE_COLLISIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcessiveCollisions() <em>Excessive Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcessiveCollisions()
	 * @generated
	 * @ordered
	 */
	protected Long excessiveCollisions = EXCESSIVE_COLLISIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalMACTransmitErrors() <em>Internal MAC Transmit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMACTransmitErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERNAL_MAC_TRANSMIT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalMACTransmitErrors() <em>Internal MAC Transmit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMACTransmitErrors()
	 * @generated
	 * @ordered
	 */
	protected Long internalMACTransmitErrors = INTERNAL_MAC_TRANSMIT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalMACReceiveErrors() <em>Internal MAC Receive Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMACReceiveErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERNAL_MAC_RECEIVE_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalMACReceiveErrors() <em>Internal MAC Receive Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMACReceiveErrors()
	 * @generated
	 * @ordered
	 */
	protected Long internalMACReceiveErrors = INTERNAL_MAC_RECEIVE_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierSenseErrors() <em>Carrier Sense Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierSenseErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long CARRIER_SENSE_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierSenseErrors() <em>Carrier Sense Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierSenseErrors()
	 * @generated
	 * @ordered
	 */
	protected Long carrierSenseErrors = CARRIER_SENSE_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameTooLongs() <em>Frame Too Longs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameTooLongs()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAME_TOO_LONGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameTooLongs() <em>Frame Too Longs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameTooLongs()
	 * @generated
	 * @ordered
	 */
	protected Long frameTooLongs = FRAME_TOO_LONGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EthernetPortStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EthernetPortStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSymbolErrors() {
		return symbolErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolErrors(Long newSymbolErrors) {
		Long oldSymbolErrors = symbolErrors;
		symbolErrors = newSymbolErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__SYMBOL_ERRORS, oldSymbolErrors, symbolErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAlignmentErrors() {
		return alignmentErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignmentErrors(Long newAlignmentErrors) {
		Long oldAlignmentErrors = alignmentErrors;
		alignmentErrors = newAlignmentErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__ALIGNMENT_ERRORS, oldAlignmentErrors, alignmentErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFCSErrors() {
		return fcsErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCSErrors(Long newFCSErrors) {
		Long oldFCSErrors = fcsErrors;
		fcsErrors = newFCSErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__FCS_ERRORS, oldFCSErrors, fcsErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSingleCollisionFrames() {
		return singleCollisionFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleCollisionFrames(Long newSingleCollisionFrames) {
		Long oldSingleCollisionFrames = singleCollisionFrames;
		singleCollisionFrames = newSingleCollisionFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__SINGLE_COLLISION_FRAMES, oldSingleCollisionFrames, singleCollisionFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMultipleCollisionFrames() {
		return multipleCollisionFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleCollisionFrames(Long newMultipleCollisionFrames) {
		Long oldMultipleCollisionFrames = multipleCollisionFrames;
		multipleCollisionFrames = newMultipleCollisionFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__MULTIPLE_COLLISION_FRAMES, oldMultipleCollisionFrames, multipleCollisionFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSQETestErrors() {
		return sqeTestErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSQETestErrors(Long newSQETestErrors) {
		Long oldSQETestErrors = sqeTestErrors;
		sqeTestErrors = newSQETestErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__SQE_TEST_ERRORS, oldSQETestErrors, sqeTestErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDeferredTransmissions() {
		return deferredTransmissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeferredTransmissions(Long newDeferredTransmissions) {
		Long oldDeferredTransmissions = deferredTransmissions;
		deferredTransmissions = newDeferredTransmissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__DEFERRED_TRANSMISSIONS, oldDeferredTransmissions, deferredTransmissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLateCollisions() {
		return lateCollisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLateCollisions(Long newLateCollisions) {
		Long oldLateCollisions = lateCollisions;
		lateCollisions = newLateCollisions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__LATE_COLLISIONS, oldLateCollisions, lateCollisions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExcessiveCollisions() {
		return excessiveCollisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcessiveCollisions(Long newExcessiveCollisions) {
		Long oldExcessiveCollisions = excessiveCollisions;
		excessiveCollisions = newExcessiveCollisions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__EXCESSIVE_COLLISIONS, oldExcessiveCollisions, excessiveCollisions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInternalMACTransmitErrors() {
		return internalMACTransmitErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalMACTransmitErrors(Long newInternalMACTransmitErrors) {
		Long oldInternalMACTransmitErrors = internalMACTransmitErrors;
		internalMACTransmitErrors = newInternalMACTransmitErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_TRANSMIT_ERRORS, oldInternalMACTransmitErrors, internalMACTransmitErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInternalMACReceiveErrors() {
		return internalMACReceiveErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalMACReceiveErrors(Long newInternalMACReceiveErrors) {
		Long oldInternalMACReceiveErrors = internalMACReceiveErrors;
		internalMACReceiveErrors = newInternalMACReceiveErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_RECEIVE_ERRORS, oldInternalMACReceiveErrors, internalMACReceiveErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCarrierSenseErrors() {
		return carrierSenseErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierSenseErrors(Long newCarrierSenseErrors) {
		Long oldCarrierSenseErrors = carrierSenseErrors;
		carrierSenseErrors = newCarrierSenseErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__CARRIER_SENSE_ERRORS, oldCarrierSenseErrors, carrierSenseErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFrameTooLongs() {
		return frameTooLongs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrameTooLongs(Long newFrameTooLongs) {
		Long oldFrameTooLongs = frameTooLongs;
		frameTooLongs = newFrameTooLongs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_STATISTICS__FRAME_TOO_LONGS, oldFrameTooLongs, frameTooLongs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SYMBOL_ERRORS:
				return getSymbolErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__ALIGNMENT_ERRORS:
				return getAlignmentErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FCS_ERRORS:
				return getFCSErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SINGLE_COLLISION_FRAMES:
				return getSingleCollisionFrames();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__MULTIPLE_COLLISION_FRAMES:
				return getMultipleCollisionFrames();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SQE_TEST_ERRORS:
				return getSQETestErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__DEFERRED_TRANSMISSIONS:
				return getDeferredTransmissions();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__LATE_COLLISIONS:
				return getLateCollisions();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__EXCESSIVE_COLLISIONS:
				return getExcessiveCollisions();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_TRANSMIT_ERRORS:
				return getInternalMACTransmitErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_RECEIVE_ERRORS:
				return getInternalMACReceiveErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__CARRIER_SENSE_ERRORS:
				return getCarrierSenseErrors();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FRAME_TOO_LONGS:
				return getFrameTooLongs();
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
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SYMBOL_ERRORS:
				setSymbolErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__ALIGNMENT_ERRORS:
				setAlignmentErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FCS_ERRORS:
				setFCSErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SINGLE_COLLISION_FRAMES:
				setSingleCollisionFrames((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__MULTIPLE_COLLISION_FRAMES:
				setMultipleCollisionFrames((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SQE_TEST_ERRORS:
				setSQETestErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__DEFERRED_TRANSMISSIONS:
				setDeferredTransmissions((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__LATE_COLLISIONS:
				setLateCollisions((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__EXCESSIVE_COLLISIONS:
				setExcessiveCollisions((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_TRANSMIT_ERRORS:
				setInternalMACTransmitErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_RECEIVE_ERRORS:
				setInternalMACReceiveErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__CARRIER_SENSE_ERRORS:
				setCarrierSenseErrors((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FRAME_TOO_LONGS:
				setFrameTooLongs((Long)newValue);
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
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SYMBOL_ERRORS:
				setSymbolErrors(SYMBOL_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__ALIGNMENT_ERRORS:
				setAlignmentErrors(ALIGNMENT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FCS_ERRORS:
				setFCSErrors(FCS_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SINGLE_COLLISION_FRAMES:
				setSingleCollisionFrames(SINGLE_COLLISION_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__MULTIPLE_COLLISION_FRAMES:
				setMultipleCollisionFrames(MULTIPLE_COLLISION_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SQE_TEST_ERRORS:
				setSQETestErrors(SQE_TEST_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__DEFERRED_TRANSMISSIONS:
				setDeferredTransmissions(DEFERRED_TRANSMISSIONS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__LATE_COLLISIONS:
				setLateCollisions(LATE_COLLISIONS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__EXCESSIVE_COLLISIONS:
				setExcessiveCollisions(EXCESSIVE_COLLISIONS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_TRANSMIT_ERRORS:
				setInternalMACTransmitErrors(INTERNAL_MAC_TRANSMIT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_RECEIVE_ERRORS:
				setInternalMACReceiveErrors(INTERNAL_MAC_RECEIVE_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__CARRIER_SENSE_ERRORS:
				setCarrierSenseErrors(CARRIER_SENSE_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FRAME_TOO_LONGS:
				setFrameTooLongs(FRAME_TOO_LONGS_EDEFAULT);
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
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SYMBOL_ERRORS:
				return SYMBOL_ERRORS_EDEFAULT == null ? symbolErrors != null : !SYMBOL_ERRORS_EDEFAULT.equals(symbolErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__ALIGNMENT_ERRORS:
				return ALIGNMENT_ERRORS_EDEFAULT == null ? alignmentErrors != null : !ALIGNMENT_ERRORS_EDEFAULT.equals(alignmentErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FCS_ERRORS:
				return FCS_ERRORS_EDEFAULT == null ? fcsErrors != null : !FCS_ERRORS_EDEFAULT.equals(fcsErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SINGLE_COLLISION_FRAMES:
				return SINGLE_COLLISION_FRAMES_EDEFAULT == null ? singleCollisionFrames != null : !SINGLE_COLLISION_FRAMES_EDEFAULT.equals(singleCollisionFrames);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__MULTIPLE_COLLISION_FRAMES:
				return MULTIPLE_COLLISION_FRAMES_EDEFAULT == null ? multipleCollisionFrames != null : !MULTIPLE_COLLISION_FRAMES_EDEFAULT.equals(multipleCollisionFrames);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__SQE_TEST_ERRORS:
				return SQE_TEST_ERRORS_EDEFAULT == null ? sqeTestErrors != null : !SQE_TEST_ERRORS_EDEFAULT.equals(sqeTestErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__DEFERRED_TRANSMISSIONS:
				return DEFERRED_TRANSMISSIONS_EDEFAULT == null ? deferredTransmissions != null : !DEFERRED_TRANSMISSIONS_EDEFAULT.equals(deferredTransmissions);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__LATE_COLLISIONS:
				return LATE_COLLISIONS_EDEFAULT == null ? lateCollisions != null : !LATE_COLLISIONS_EDEFAULT.equals(lateCollisions);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__EXCESSIVE_COLLISIONS:
				return EXCESSIVE_COLLISIONS_EDEFAULT == null ? excessiveCollisions != null : !EXCESSIVE_COLLISIONS_EDEFAULT.equals(excessiveCollisions);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_TRANSMIT_ERRORS:
				return INTERNAL_MAC_TRANSMIT_ERRORS_EDEFAULT == null ? internalMACTransmitErrors != null : !INTERNAL_MAC_TRANSMIT_ERRORS_EDEFAULT.equals(internalMACTransmitErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__INTERNAL_MAC_RECEIVE_ERRORS:
				return INTERNAL_MAC_RECEIVE_ERRORS_EDEFAULT == null ? internalMACReceiveErrors != null : !INTERNAL_MAC_RECEIVE_ERRORS_EDEFAULT.equals(internalMACReceiveErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__CARRIER_SENSE_ERRORS:
				return CARRIER_SENSE_ERRORS_EDEFAULT == null ? carrierSenseErrors != null : !CARRIER_SENSE_ERRORS_EDEFAULT.equals(carrierSenseErrors);
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS__FRAME_TOO_LONGS:
				return FRAME_TOO_LONGS_EDEFAULT == null ? frameTooLongs != null : !FRAME_TOO_LONGS_EDEFAULT.equals(frameTooLongs);
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
		result.append(" (SymbolErrors: ");
		result.append(symbolErrors);
		result.append(", AlignmentErrors: ");
		result.append(alignmentErrors);
		result.append(", FCSErrors: ");
		result.append(fcsErrors);
		result.append(", SingleCollisionFrames: ");
		result.append(singleCollisionFrames);
		result.append(", MultipleCollisionFrames: ");
		result.append(multipleCollisionFrames);
		result.append(", SQETestErrors: ");
		result.append(sqeTestErrors);
		result.append(", DeferredTransmissions: ");
		result.append(deferredTransmissions);
		result.append(", LateCollisions: ");
		result.append(lateCollisions);
		result.append(", ExcessiveCollisions: ");
		result.append(excessiveCollisions);
		result.append(", InternalMACTransmitErrors: ");
		result.append(internalMACTransmitErrors);
		result.append(", InternalMACReceiveErrors: ");
		result.append(internalMACReceiveErrors);
		result.append(", CarrierSenseErrors: ");
		result.append(carrierSenseErrors);
		result.append(", FrameTooLongs: ");
		result.append(frameTooLongs);
		result.append(')');
		return result.toString();
	}

} //CIM_EthernetPortStatisticsImpl
