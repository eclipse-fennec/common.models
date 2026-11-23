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

import org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Source Routing Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getSpecInFrames <em>Spec In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getSpecOutFrames <em>Spec Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getApeInFrames <em>Ape In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getApeOutFrames <em>Ape Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getSteInFrames <em>Ste In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getSteOutFrames <em>Ste Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getSegmentMismatchDiscards <em>Segment Mismatch Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getDuplicateSegmentDiscards <em>Duplicate Segment Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getHopCountExceedsDiscards <em>Hop Count Exceeds Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getDupLanIdOrTreeErrors <em>Dup Lan Id Or Tree Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSourceRoutingStatisticsImpl#getLanIdMismatches <em>Lan Id Mismatches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortSourceRoutingStatisticsImpl extends CIM_SAPStatisticalInformationImpl implements CIM_SwitchPortSourceRoutingStatistics {
	/**
	 * The default value of the '{@link #getSpecInFrames() <em>Spec In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPEC_IN_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecInFrames() <em>Spec In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInFrames()
	 * @generated
	 * @ordered
	 */
	protected Long specInFrames = SPEC_IN_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecOutFrames() <em>Spec Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecOutFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPEC_OUT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecOutFrames() <em>Spec Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecOutFrames()
	 * @generated
	 * @ordered
	 */
	protected Long specOutFrames = SPEC_OUT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getApeInFrames() <em>Ape In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApeInFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long APE_IN_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApeInFrames() <em>Ape In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApeInFrames()
	 * @generated
	 * @ordered
	 */
	protected Long apeInFrames = APE_IN_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getApeOutFrames() <em>Ape Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApeOutFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long APE_OUT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApeOutFrames() <em>Ape Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApeOutFrames()
	 * @generated
	 * @ordered
	 */
	protected Long apeOutFrames = APE_OUT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteInFrames() <em>Ste In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteInFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long STE_IN_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteInFrames() <em>Ste In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteInFrames()
	 * @generated
	 * @ordered
	 */
	protected Long steInFrames = STE_IN_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteOutFrames() <em>Ste Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteOutFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long STE_OUT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteOutFrames() <em>Ste Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteOutFrames()
	 * @generated
	 * @ordered
	 */
	protected Long steOutFrames = STE_OUT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSegmentMismatchDiscards() <em>Segment Mismatch Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentMismatchDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long SEGMENT_MISMATCH_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentMismatchDiscards() <em>Segment Mismatch Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentMismatchDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long segmentMismatchDiscards = SEGMENT_MISMATCH_DISCARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuplicateSegmentDiscards() <em>Duplicate Segment Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateSegmentDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long DUPLICATE_SEGMENT_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuplicateSegmentDiscards() <em>Duplicate Segment Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateSegmentDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long duplicateSegmentDiscards = DUPLICATE_SEGMENT_DISCARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHopCountExceedsDiscards() <em>Hop Count Exceeds Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopCountExceedsDiscards()
	 * @generated
	 * @ordered
	 */
	protected static final Long HOP_COUNT_EXCEEDS_DISCARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHopCountExceedsDiscards() <em>Hop Count Exceeds Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopCountExceedsDiscards()
	 * @generated
	 * @ordered
	 */
	protected Long hopCountExceedsDiscards = HOP_COUNT_EXCEEDS_DISCARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDupLanIdOrTreeErrors() <em>Dup Lan Id Or Tree Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDupLanIdOrTreeErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long DUP_LAN_ID_OR_TREE_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDupLanIdOrTreeErrors() <em>Dup Lan Id Or Tree Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDupLanIdOrTreeErrors()
	 * @generated
	 * @ordered
	 */
	protected Long dupLanIdOrTreeErrors = DUP_LAN_ID_OR_TREE_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanIdMismatches() <em>Lan Id Mismatches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanIdMismatches()
	 * @generated
	 * @ordered
	 */
	protected static final Long LAN_ID_MISMATCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanIdMismatches() <em>Lan Id Mismatches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanIdMismatches()
	 * @generated
	 * @ordered
	 */
	protected Long lanIdMismatches = LAN_ID_MISMATCHES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortSourceRoutingStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortSourceRoutingStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpecInFrames() {
		return specInFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecInFrames(Long newSpecInFrames) {
		Long oldSpecInFrames = specInFrames;
		specInFrames = newSpecInFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_IN_FRAMES, oldSpecInFrames, specInFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpecOutFrames() {
		return specOutFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecOutFrames(Long newSpecOutFrames) {
		Long oldSpecOutFrames = specOutFrames;
		specOutFrames = newSpecOutFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_OUT_FRAMES, oldSpecOutFrames, specOutFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getApeInFrames() {
		return apeInFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApeInFrames(Long newApeInFrames) {
		Long oldApeInFrames = apeInFrames;
		apeInFrames = newApeInFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_IN_FRAMES, oldApeInFrames, apeInFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getApeOutFrames() {
		return apeOutFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApeOutFrames(Long newApeOutFrames) {
		Long oldApeOutFrames = apeOutFrames;
		apeOutFrames = newApeOutFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_OUT_FRAMES, oldApeOutFrames, apeOutFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSteInFrames() {
		return steInFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteInFrames(Long newSteInFrames) {
		Long oldSteInFrames = steInFrames;
		steInFrames = newSteInFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_IN_FRAMES, oldSteInFrames, steInFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSteOutFrames() {
		return steOutFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteOutFrames(Long newSteOutFrames) {
		Long oldSteOutFrames = steOutFrames;
		steOutFrames = newSteOutFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_OUT_FRAMES, oldSteOutFrames, steOutFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSegmentMismatchDiscards() {
		return segmentMismatchDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentMismatchDiscards(Long newSegmentMismatchDiscards) {
		Long oldSegmentMismatchDiscards = segmentMismatchDiscards;
		segmentMismatchDiscards = newSegmentMismatchDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SEGMENT_MISMATCH_DISCARDS, oldSegmentMismatchDiscards, segmentMismatchDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDuplicateSegmentDiscards() {
		return duplicateSegmentDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuplicateSegmentDiscards(Long newDuplicateSegmentDiscards) {
		Long oldDuplicateSegmentDiscards = duplicateSegmentDiscards;
		duplicateSegmentDiscards = newDuplicateSegmentDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUPLICATE_SEGMENT_DISCARDS, oldDuplicateSegmentDiscards, duplicateSegmentDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHopCountExceedsDiscards() {
		return hopCountExceedsDiscards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHopCountExceedsDiscards(Long newHopCountExceedsDiscards) {
		Long oldHopCountExceedsDiscards = hopCountExceedsDiscards;
		hopCountExceedsDiscards = newHopCountExceedsDiscards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__HOP_COUNT_EXCEEDS_DISCARDS, oldHopCountExceedsDiscards, hopCountExceedsDiscards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDupLanIdOrTreeErrors() {
		return dupLanIdOrTreeErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDupLanIdOrTreeErrors(Long newDupLanIdOrTreeErrors) {
		Long oldDupLanIdOrTreeErrors = dupLanIdOrTreeErrors;
		dupLanIdOrTreeErrors = newDupLanIdOrTreeErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUP_LAN_ID_OR_TREE_ERRORS, oldDupLanIdOrTreeErrors, dupLanIdOrTreeErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLanIdMismatches() {
		return lanIdMismatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanIdMismatches(Long newLanIdMismatches) {
		Long oldLanIdMismatches = lanIdMismatches;
		lanIdMismatches = newLanIdMismatches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__LAN_ID_MISMATCHES, oldLanIdMismatches, lanIdMismatches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_IN_FRAMES:
				return getSpecInFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_OUT_FRAMES:
				return getSpecOutFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_IN_FRAMES:
				return getApeInFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_OUT_FRAMES:
				return getApeOutFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_IN_FRAMES:
				return getSteInFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_OUT_FRAMES:
				return getSteOutFrames();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SEGMENT_MISMATCH_DISCARDS:
				return getSegmentMismatchDiscards();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUPLICATE_SEGMENT_DISCARDS:
				return getDuplicateSegmentDiscards();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__HOP_COUNT_EXCEEDS_DISCARDS:
				return getHopCountExceedsDiscards();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUP_LAN_ID_OR_TREE_ERRORS:
				return getDupLanIdOrTreeErrors();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__LAN_ID_MISMATCHES:
				return getLanIdMismatches();
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_IN_FRAMES:
				setSpecInFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_OUT_FRAMES:
				setSpecOutFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_IN_FRAMES:
				setApeInFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_OUT_FRAMES:
				setApeOutFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_IN_FRAMES:
				setSteInFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_OUT_FRAMES:
				setSteOutFrames((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SEGMENT_MISMATCH_DISCARDS:
				setSegmentMismatchDiscards((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUPLICATE_SEGMENT_DISCARDS:
				setDuplicateSegmentDiscards((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__HOP_COUNT_EXCEEDS_DISCARDS:
				setHopCountExceedsDiscards((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUP_LAN_ID_OR_TREE_ERRORS:
				setDupLanIdOrTreeErrors((Long)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__LAN_ID_MISMATCHES:
				setLanIdMismatches((Long)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_IN_FRAMES:
				setSpecInFrames(SPEC_IN_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_OUT_FRAMES:
				setSpecOutFrames(SPEC_OUT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_IN_FRAMES:
				setApeInFrames(APE_IN_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_OUT_FRAMES:
				setApeOutFrames(APE_OUT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_IN_FRAMES:
				setSteInFrames(STE_IN_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_OUT_FRAMES:
				setSteOutFrames(STE_OUT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SEGMENT_MISMATCH_DISCARDS:
				setSegmentMismatchDiscards(SEGMENT_MISMATCH_DISCARDS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUPLICATE_SEGMENT_DISCARDS:
				setDuplicateSegmentDiscards(DUPLICATE_SEGMENT_DISCARDS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__HOP_COUNT_EXCEEDS_DISCARDS:
				setHopCountExceedsDiscards(HOP_COUNT_EXCEEDS_DISCARDS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUP_LAN_ID_OR_TREE_ERRORS:
				setDupLanIdOrTreeErrors(DUP_LAN_ID_OR_TREE_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__LAN_ID_MISMATCHES:
				setLanIdMismatches(LAN_ID_MISMATCHES_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_IN_FRAMES:
				return SPEC_IN_FRAMES_EDEFAULT == null ? specInFrames != null : !SPEC_IN_FRAMES_EDEFAULT.equals(specInFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SPEC_OUT_FRAMES:
				return SPEC_OUT_FRAMES_EDEFAULT == null ? specOutFrames != null : !SPEC_OUT_FRAMES_EDEFAULT.equals(specOutFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_IN_FRAMES:
				return APE_IN_FRAMES_EDEFAULT == null ? apeInFrames != null : !APE_IN_FRAMES_EDEFAULT.equals(apeInFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__APE_OUT_FRAMES:
				return APE_OUT_FRAMES_EDEFAULT == null ? apeOutFrames != null : !APE_OUT_FRAMES_EDEFAULT.equals(apeOutFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_IN_FRAMES:
				return STE_IN_FRAMES_EDEFAULT == null ? steInFrames != null : !STE_IN_FRAMES_EDEFAULT.equals(steInFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__STE_OUT_FRAMES:
				return STE_OUT_FRAMES_EDEFAULT == null ? steOutFrames != null : !STE_OUT_FRAMES_EDEFAULT.equals(steOutFrames);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__SEGMENT_MISMATCH_DISCARDS:
				return SEGMENT_MISMATCH_DISCARDS_EDEFAULT == null ? segmentMismatchDiscards != null : !SEGMENT_MISMATCH_DISCARDS_EDEFAULT.equals(segmentMismatchDiscards);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUPLICATE_SEGMENT_DISCARDS:
				return DUPLICATE_SEGMENT_DISCARDS_EDEFAULT == null ? duplicateSegmentDiscards != null : !DUPLICATE_SEGMENT_DISCARDS_EDEFAULT.equals(duplicateSegmentDiscards);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__HOP_COUNT_EXCEEDS_DISCARDS:
				return HOP_COUNT_EXCEEDS_DISCARDS_EDEFAULT == null ? hopCountExceedsDiscards != null : !HOP_COUNT_EXCEEDS_DISCARDS_EDEFAULT.equals(hopCountExceedsDiscards);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__DUP_LAN_ID_OR_TREE_ERRORS:
				return DUP_LAN_ID_OR_TREE_ERRORS_EDEFAULT == null ? dupLanIdOrTreeErrors != null : !DUP_LAN_ID_OR_TREE_ERRORS_EDEFAULT.equals(dupLanIdOrTreeErrors);
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS__LAN_ID_MISMATCHES:
				return LAN_ID_MISMATCHES_EDEFAULT == null ? lanIdMismatches != null : !LAN_ID_MISMATCHES_EDEFAULT.equals(lanIdMismatches);
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
		result.append(" (SpecInFrames: ");
		result.append(specInFrames);
		result.append(", SpecOutFrames: ");
		result.append(specOutFrames);
		result.append(", ApeInFrames: ");
		result.append(apeInFrames);
		result.append(", ApeOutFrames: ");
		result.append(apeOutFrames);
		result.append(", SteInFrames: ");
		result.append(steInFrames);
		result.append(", SteOutFrames: ");
		result.append(steOutFrames);
		result.append(", SegmentMismatchDiscards: ");
		result.append(segmentMismatchDiscards);
		result.append(", DuplicateSegmentDiscards: ");
		result.append(duplicateSegmentDiscards);
		result.append(", HopCountExceedsDiscards: ");
		result.append(hopCountExceedsDiscards);
		result.append(", DupLanIdOrTreeErrors: ");
		result.append(dupLanIdOrTreeErrors);
		result.append(", LanIdMismatches: ");
		result.append(lanIdMismatches);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortSourceRoutingStatisticsImpl
