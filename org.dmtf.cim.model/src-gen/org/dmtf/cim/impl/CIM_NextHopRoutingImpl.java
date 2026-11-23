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

import org.dmtf.cim.CIM_NextHopRouting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Next Hop Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRoutingImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRoutingImpl#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRoutingImpl#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopRoutingImpl#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_NextHopRoutingImpl extends CIM_LogicalElementImpl implements CIM_NextHopRouting {
	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationMask() <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationMask() <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected String destinationMask = DESTINATION_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_HOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected String nextHop = NEXT_HOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NextHopRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NextHopRouting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationAddress(String newDestinationAddress) {
		String oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationMask() {
		return destinationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationMask(String newDestinationMask) {
		String oldDestinationMask = destinationMask;
		destinationMask = newDestinationMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_MASK, oldDestinationMask, destinationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextHop() {
		return nextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextHop(String newNextHop) {
		String oldNextHop = nextHop;
		nextHop = newNextHop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTING__NEXT_HOP, oldNextHop, nextHop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStatic(Boolean newIsStatic) {
		Boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_ROUTING__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_MASK:
				return getDestinationMask();
			case CimPackage.CIM_NEXT_HOP_ROUTING__NEXT_HOP:
				return getNextHop();
			case CimPackage.CIM_NEXT_HOP_ROUTING__IS_STATIC:
				return getIsStatic();
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
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				setDestinationAddress((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_MASK:
				setDestinationMask((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__NEXT_HOP:
				setNextHop((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__IS_STATIC:
				setIsStatic((Boolean)newValue);
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
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_MASK:
				setDestinationMask(DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__NEXT_HOP:
				setNextHop(NEXT_HOP_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_ROUTING__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case CimPackage.CIM_NEXT_HOP_ROUTING__DESTINATION_MASK:
				return DESTINATION_MASK_EDEFAULT == null ? destinationMask != null : !DESTINATION_MASK_EDEFAULT.equals(destinationMask);
			case CimPackage.CIM_NEXT_HOP_ROUTING__NEXT_HOP:
				return NEXT_HOP_EDEFAULT == null ? nextHop != null : !NEXT_HOP_EDEFAULT.equals(nextHop);
			case CimPackage.CIM_NEXT_HOP_ROUTING__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
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
		result.append(" (DestinationAddress: ");
		result.append(destinationAddress);
		result.append(", DestinationMask: ");
		result.append(destinationMask);
		result.append(", NextHop: ");
		result.append(nextHop);
		result.append(", IsStatic: ");
		result.append(isStatic);
		result.append(')');
		return result.toString();
	}

} //CIM_NextHopRoutingImpl
