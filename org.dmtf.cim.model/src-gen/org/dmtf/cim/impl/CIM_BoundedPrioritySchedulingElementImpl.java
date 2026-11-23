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

import org.dmtf.cim.CIM_BoundedPrioritySchedulingElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Bounded Priority Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BoundedPrioritySchedulingElementImpl#getBandwidthBound <em>Bandwidth Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BoundedPrioritySchedulingElementImpl extends CIM_PrioritySchedulingElementImpl implements CIM_BoundedPrioritySchedulingElement {
	/**
	 * The default value of the '{@link #getBandwidthBound() <em>Bandwidth Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long BANDWIDTH_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidthBound() <em>Bandwidth Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthBound()
	 * @generated
	 * @ordered
	 */
	protected Long bandwidthBound = BANDWIDTH_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BoundedPrioritySchedulingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BoundedPrioritySchedulingElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBandwidthBound() {
		return bandwidthBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidthBound(Long newBandwidthBound) {
		Long oldBandwidthBound = bandwidthBound;
		bandwidthBound = newBandwidthBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT__BANDWIDTH_BOUND, oldBandwidthBound, bandwidthBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT__BANDWIDTH_BOUND:
				return getBandwidthBound();
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
			case CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT__BANDWIDTH_BOUND:
				setBandwidthBound((Long)newValue);
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
			case CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT__BANDWIDTH_BOUND:
				setBandwidthBound(BANDWIDTH_BOUND_EDEFAULT);
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
			case CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT__BANDWIDTH_BOUND:
				return BANDWIDTH_BOUND_EDEFAULT == null ? bandwidthBound != null : !BANDWIDTH_BOUND_EDEFAULT.equals(bandwidthBound);
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
		result.append(" (BandwidthBound: ");
		result.append(bandwidthBound);
		result.append(')');
		return result.toString();
	}

} //CIM_BoundedPrioritySchedulingElementImpl
