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

import org.dmtf.cim.CIM_AllocationSchedulingElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Allocation Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationSchedulingElementImpl#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationSchedulingElementImpl#getBandwidthAllocation <em>Bandwidth Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationSchedulingElementImpl#getBurstAllocation <em>Burst Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationSchedulingElementImpl#getCanShare <em>Can Share</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocationSchedulingElementImpl#getWorkFlexible <em>Work Flexible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AllocationSchedulingElementImpl extends CIM_SchedulingElementImpl implements CIM_AllocationSchedulingElement {
	/**
	 * The default value of the '{@link #getAllocationUnits() <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALLOCATION_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationUnits() <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer allocationUnits = ALLOCATION_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidthAllocation() <em>Bandwidth Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final Long BANDWIDTH_ALLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidthAllocation() <em>Bandwidth Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthAllocation()
	 * @generated
	 * @ordered
	 */
	protected Long bandwidthAllocation = BANDWIDTH_ALLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBurstAllocation() <em>Burst Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final Long BURST_ALLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBurstAllocation() <em>Burst Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstAllocation()
	 * @generated
	 * @ordered
	 */
	protected Long burstAllocation = BURST_ALLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanShare() <em>Can Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanShare()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_SHARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanShare() <em>Can Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanShare()
	 * @generated
	 * @ordered
	 */
	protected Boolean canShare = CAN_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkFlexible() <em>Work Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlexible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WORK_FLEXIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkFlexible() <em>Work Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlexible()
	 * @generated
	 * @ordered
	 */
	protected Boolean workFlexible = WORK_FLEXIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AllocationSchedulingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AllocationSchedulingElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAllocationUnits() {
		return allocationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationUnits(Integer newAllocationUnits) {
		Integer oldAllocationUnits = allocationUnits;
		allocationUnits = newAllocationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__ALLOCATION_UNITS, oldAllocationUnits, allocationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBandwidthAllocation() {
		return bandwidthAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidthAllocation(Long newBandwidthAllocation) {
		Long oldBandwidthAllocation = bandwidthAllocation;
		bandwidthAllocation = newBandwidthAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BANDWIDTH_ALLOCATION, oldBandwidthAllocation, bandwidthAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBurstAllocation() {
		return burstAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBurstAllocation(Long newBurstAllocation) {
		Long oldBurstAllocation = burstAllocation;
		burstAllocation = newBurstAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BURST_ALLOCATION, oldBurstAllocation, burstAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanShare() {
		return canShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanShare(Boolean newCanShare) {
		Boolean oldCanShare = canShare;
		canShare = newCanShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__CAN_SHARE, oldCanShare, canShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWorkFlexible() {
		return workFlexible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkFlexible(Boolean newWorkFlexible) {
		Boolean oldWorkFlexible = workFlexible;
		workFlexible = newWorkFlexible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__WORK_FLEXIBLE, oldWorkFlexible, workFlexible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__ALLOCATION_UNITS:
				return getAllocationUnits();
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BANDWIDTH_ALLOCATION:
				return getBandwidthAllocation();
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BURST_ALLOCATION:
				return getBurstAllocation();
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__CAN_SHARE:
				return getCanShare();
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__WORK_FLEXIBLE:
				return getWorkFlexible();
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
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__ALLOCATION_UNITS:
				setAllocationUnits((Integer)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BANDWIDTH_ALLOCATION:
				setBandwidthAllocation((Long)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BURST_ALLOCATION:
				setBurstAllocation((Long)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__CAN_SHARE:
				setCanShare((Boolean)newValue);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__WORK_FLEXIBLE:
				setWorkFlexible((Boolean)newValue);
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
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__ALLOCATION_UNITS:
				setAllocationUnits(ALLOCATION_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BANDWIDTH_ALLOCATION:
				setBandwidthAllocation(BANDWIDTH_ALLOCATION_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BURST_ALLOCATION:
				setBurstAllocation(BURST_ALLOCATION_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__CAN_SHARE:
				setCanShare(CAN_SHARE_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__WORK_FLEXIBLE:
				setWorkFlexible(WORK_FLEXIBLE_EDEFAULT);
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
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__ALLOCATION_UNITS:
				return ALLOCATION_UNITS_EDEFAULT == null ? allocationUnits != null : !ALLOCATION_UNITS_EDEFAULT.equals(allocationUnits);
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BANDWIDTH_ALLOCATION:
				return BANDWIDTH_ALLOCATION_EDEFAULT == null ? bandwidthAllocation != null : !BANDWIDTH_ALLOCATION_EDEFAULT.equals(bandwidthAllocation);
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__BURST_ALLOCATION:
				return BURST_ALLOCATION_EDEFAULT == null ? burstAllocation != null : !BURST_ALLOCATION_EDEFAULT.equals(burstAllocation);
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__CAN_SHARE:
				return CAN_SHARE_EDEFAULT == null ? canShare != null : !CAN_SHARE_EDEFAULT.equals(canShare);
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT__WORK_FLEXIBLE:
				return WORK_FLEXIBLE_EDEFAULT == null ? workFlexible != null : !WORK_FLEXIBLE_EDEFAULT.equals(workFlexible);
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
		result.append(" (AllocationUnits: ");
		result.append(allocationUnits);
		result.append(", BandwidthAllocation: ");
		result.append(bandwidthAllocation);
		result.append(", BurstAllocation: ");
		result.append(burstAllocation);
		result.append(", CanShare: ");
		result.append(canShare);
		result.append(", WorkFlexible: ");
		result.append(workFlexible);
		result.append(')');
		return result.toString();
	}

} //CIM_AllocationSchedulingElementImpl
