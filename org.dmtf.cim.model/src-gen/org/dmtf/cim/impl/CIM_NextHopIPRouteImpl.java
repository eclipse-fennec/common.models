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

import org.dmtf.cim.CIM_NextHopIPRoute;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Next Hop IP Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopIPRouteImpl#getRouteDerivation <em>Route Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopIPRouteImpl#getOtherDerivation <em>Other Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopIPRouteImpl#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopIPRouteImpl#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NextHopIPRouteImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NextHopIPRouteImpl extends CIM_NextHopRouteImpl implements CIM_NextHopIPRoute {
	/**
	 * The default value of the '{@link #getRouteDerivation() <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROUTE_DERIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDerivation() <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDerivation()
	 * @generated
	 * @ordered
	 */
	protected Integer routeDerivation = ROUTE_DERIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDerivation() <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DERIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDerivation() <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDerivation()
	 * @generated
	 * @ordered
	 */
	protected String otherDerivation = OTHER_DERIVATION_EDEFAULT;

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
	 * The default value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFIX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected Integer prefixLength = PREFIX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NextHopIPRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NextHopIPRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRouteDerivation() {
		return routeDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDerivation(Integer newRouteDerivation) {
		Integer oldRouteDerivation = routeDerivation;
		routeDerivation = newRouteDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION, oldRouteDerivation, routeDerivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDerivation() {
		return otherDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDerivation(String newOtherDerivation) {
		String oldOtherDerivation = otherDerivation;
		otherDerivation = newOtherDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_IP_ROUTE__OTHER_DERIVATION, oldOtherDerivation, otherDerivation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_IP_ROUTE__DESTINATION_MASK, oldDestinationMask, destinationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrefixLength() {
		return prefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixLength(Integer newPrefixLength) {
		Integer oldPrefixLength = prefixLength;
		prefixLength = newPrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_IP_ROUTE__PREFIX_LENGTH, oldPrefixLength, prefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NEXT_HOP_IP_ROUTE__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				return getRouteDerivation();
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				return getOtherDerivation();
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				return getDestinationMask();
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				return getPrefixLength();
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				return getAddressType();
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
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				setRouteDerivation((Integer)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				setOtherDerivation((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				setDestinationMask((String)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				setPrefixLength((Integer)newValue);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
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
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				setRouteDerivation(ROUTE_DERIVATION_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				setOtherDerivation(OTHER_DERIVATION_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				setDestinationMask(DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				setPrefixLength(PREFIX_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				return ROUTE_DERIVATION_EDEFAULT == null ? routeDerivation != null : !ROUTE_DERIVATION_EDEFAULT.equals(routeDerivation);
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				return OTHER_DERIVATION_EDEFAULT == null ? otherDerivation != null : !OTHER_DERIVATION_EDEFAULT.equals(otherDerivation);
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				return DESTINATION_MASK_EDEFAULT == null ? destinationMask != null : !DESTINATION_MASK_EDEFAULT.equals(destinationMask);
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				return PREFIX_LENGTH_EDEFAULT == null ? prefixLength != null : !PREFIX_LENGTH_EDEFAULT.equals(prefixLength);
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
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
		result.append(" (RouteDerivation: ");
		result.append(routeDerivation);
		result.append(", OtherDerivation: ");
		result.append(otherDerivation);
		result.append(", DestinationMask: ");
		result.append(destinationMask);
		result.append(", PrefixLength: ");
		result.append(prefixLength);
		result.append(", AddressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //CIM_NextHopIPRouteImpl
