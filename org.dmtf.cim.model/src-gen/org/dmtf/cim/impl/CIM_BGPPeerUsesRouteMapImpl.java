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

import org.dmtf.cim.CIM_BGPPeerUsesRouteMap;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Peer Uses Route Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPPeerUsesRouteMapImpl#getMapSequence <em>Map Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPPeerUsesRouteMapImpl extends CIM_CollectedMSEsImpl implements CIM_BGPPeerUsesRouteMap {
	/**
	 * The default value of the '{@link #getMapSequence() <em>Map Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAP_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapSequence() <em>Map Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSequence()
	 * @generated
	 * @ordered
	 */
	protected Integer mapSequence = MAP_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPPeerUsesRouteMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPPeerUsesRouteMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMapSequence() {
		return mapSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapSequence(Integer newMapSequence) {
		Integer oldMapSequence = mapSequence;
		mapSequence = newMapSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP__MAP_SEQUENCE, oldMapSequence, mapSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP__MAP_SEQUENCE:
				return getMapSequence();
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
			case CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP__MAP_SEQUENCE:
				setMapSequence((Integer)newValue);
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
			case CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP__MAP_SEQUENCE:
				setMapSequence(MAP_SEQUENCE_EDEFAULT);
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
			case CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP__MAP_SEQUENCE:
				return MAP_SEQUENCE_EDEFAULT == null ? mapSequence != null : !MAP_SEQUENCE_EDEFAULT.equals(mapSequence);
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
		result.append(" (MapSequence: ");
		result.append(mapSequence);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPPeerUsesRouteMapImpl
