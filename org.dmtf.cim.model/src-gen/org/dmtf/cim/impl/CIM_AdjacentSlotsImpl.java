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

import org.dmtf.cim.CIM_AdjacentSlots;
import org.dmtf.cim.CIM_Slot;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Adjacent Slots</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdjacentSlotsImpl#getSlotA <em>Slot A</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdjacentSlotsImpl#getSlotB <em>Slot B</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdjacentSlotsImpl#getDistanceBetweenSlots <em>Distance Between Slots</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AdjacentSlotsImpl#getSharedSlots <em>Shared Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AdjacentSlotsImpl extends MinimalEObjectImpl.Container implements CIM_AdjacentSlots {
	/**
	 * The cached value of the '{@link #getSlotA() <em>Slot A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotA()
	 * @generated
	 * @ordered
	 */
	protected CIM_Slot slotA;

	/**
	 * The cached value of the '{@link #getSlotB() <em>Slot B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotB()
	 * @generated
	 * @ordered
	 */
	protected CIM_Slot slotB;

	/**
	 * The default value of the '{@link #getDistanceBetweenSlots() <em>Distance Between Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBetweenSlots()
	 * @generated
	 * @ordered
	 */
	protected static final Float DISTANCE_BETWEEN_SLOTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceBetweenSlots() <em>Distance Between Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBetweenSlots()
	 * @generated
	 * @ordered
	 */
	protected Float distanceBetweenSlots = DISTANCE_BETWEEN_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedSlots() <em>Shared Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSlots()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHARED_SLOTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedSlots() <em>Shared Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSlots()
	 * @generated
	 * @ordered
	 */
	protected Boolean sharedSlots = SHARED_SLOTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AdjacentSlotsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AdjacentSlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Slot getSlotA() {
		if (slotA != null && slotA.eIsProxy()) {
			InternalEObject oldSlotA = (InternalEObject)slotA;
			slotA = (CIM_Slot)eResolveProxy(oldSlotA);
			if (slotA != oldSlotA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ADJACENT_SLOTS__SLOT_A, oldSlotA, slotA));
			}
		}
		return slotA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Slot basicGetSlotA() {
		return slotA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotA(CIM_Slot newSlotA) {
		CIM_Slot oldSlotA = slotA;
		slotA = newSlotA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADJACENT_SLOTS__SLOT_A, oldSlotA, slotA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Slot getSlotB() {
		if (slotB != null && slotB.eIsProxy()) {
			InternalEObject oldSlotB = (InternalEObject)slotB;
			slotB = (CIM_Slot)eResolveProxy(oldSlotB);
			if (slotB != oldSlotB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ADJACENT_SLOTS__SLOT_B, oldSlotB, slotB));
			}
		}
		return slotB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Slot basicGetSlotB() {
		return slotB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotB(CIM_Slot newSlotB) {
		CIM_Slot oldSlotB = slotB;
		slotB = newSlotB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADJACENT_SLOTS__SLOT_B, oldSlotB, slotB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDistanceBetweenSlots() {
		return distanceBetweenSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistanceBetweenSlots(Float newDistanceBetweenSlots) {
		Float oldDistanceBetweenSlots = distanceBetweenSlots;
		distanceBetweenSlots = newDistanceBetweenSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADJACENT_SLOTS__DISTANCE_BETWEEN_SLOTS, oldDistanceBetweenSlots, distanceBetweenSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSharedSlots() {
		return sharedSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedSlots(Boolean newSharedSlots) {
		Boolean oldSharedSlots = sharedSlots;
		sharedSlots = newSharedSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADJACENT_SLOTS__SHARED_SLOTS, oldSharedSlots, sharedSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_A:
				if (resolve) return getSlotA();
				return basicGetSlotA();
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_B:
				if (resolve) return getSlotB();
				return basicGetSlotB();
			case CimPackage.CIM_ADJACENT_SLOTS__DISTANCE_BETWEEN_SLOTS:
				return getDistanceBetweenSlots();
			case CimPackage.CIM_ADJACENT_SLOTS__SHARED_SLOTS:
				return getSharedSlots();
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
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_A:
				setSlotA((CIM_Slot)newValue);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_B:
				setSlotB((CIM_Slot)newValue);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__DISTANCE_BETWEEN_SLOTS:
				setDistanceBetweenSlots((Float)newValue);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__SHARED_SLOTS:
				setSharedSlots((Boolean)newValue);
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
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_A:
				setSlotA((CIM_Slot)null);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_B:
				setSlotB((CIM_Slot)null);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__DISTANCE_BETWEEN_SLOTS:
				setDistanceBetweenSlots(DISTANCE_BETWEEN_SLOTS_EDEFAULT);
				return;
			case CimPackage.CIM_ADJACENT_SLOTS__SHARED_SLOTS:
				setSharedSlots(SHARED_SLOTS_EDEFAULT);
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
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_A:
				return slotA != null;
			case CimPackage.CIM_ADJACENT_SLOTS__SLOT_B:
				return slotB != null;
			case CimPackage.CIM_ADJACENT_SLOTS__DISTANCE_BETWEEN_SLOTS:
				return DISTANCE_BETWEEN_SLOTS_EDEFAULT == null ? distanceBetweenSlots != null : !DISTANCE_BETWEEN_SLOTS_EDEFAULT.equals(distanceBetweenSlots);
			case CimPackage.CIM_ADJACENT_SLOTS__SHARED_SLOTS:
				return SHARED_SLOTS_EDEFAULT == null ? sharedSlots != null : !SHARED_SLOTS_EDEFAULT.equals(sharedSlots);
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
		result.append(" (DistanceBetweenSlots: ");
		result.append(distanceBetweenSlots);
		result.append(", SharedSlots: ");
		result.append(sharedSlots);
		result.append(')');
		return result.toString();
	}

} //CIM_AdjacentSlotsImpl
