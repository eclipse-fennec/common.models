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

import org.dmtf.cim.CIM_LogicalNetwork;
import org.dmtf.cim.CIM_LogicalNetworkService;
import org.dmtf.cim.CIM_NetworkService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Network Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalNetworkServiceImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalNetworkServiceImpl#getNetworkService <em>Network Service</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalNetworkServiceImpl#getContainmentType <em>Containment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalNetworkServiceImpl extends MinimalEObjectImpl.Container implements CIM_LogicalNetworkService {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CIM_LogicalNetwork network;

	/**
	 * The cached value of the '{@link #getNetworkService() <em>Network Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkService()
	 * @generated
	 * @ordered
	 */
	protected CIM_NetworkService networkService;

	/**
	 * The default value of the '{@link #getContainmentType() <em>Containment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTAINMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainmentType() <em>Containment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentType()
	 * @generated
	 * @ordered
	 */
	protected Integer containmentType = CONTAINMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalNetworkServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalNetworkService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalNetwork getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (CIM_LogicalNetwork)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LogicalNetwork basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(CIM_LogicalNetwork newNetwork) {
		CIM_LogicalNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkService getNetworkService() {
		if (networkService != null && networkService.eIsProxy()) {
			InternalEObject oldNetworkService = (InternalEObject)networkService;
			networkService = (CIM_NetworkService)eResolveProxy(oldNetworkService);
			if (networkService != oldNetworkService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE, oldNetworkService, networkService));
			}
		}
		return networkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_NetworkService basicGetNetworkService() {
		return networkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkService(CIM_NetworkService newNetworkService) {
		CIM_NetworkService oldNetworkService = networkService;
		networkService = newNetworkService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE, oldNetworkService, networkService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getContainmentType() {
		return containmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainmentType(Integer newContainmentType) {
		Integer oldContainmentType = containmentType;
		containmentType = newContainmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_NETWORK_SERVICE__CONTAINMENT_TYPE, oldContainmentType, containmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE:
				if (resolve) return getNetworkService();
				return basicGetNetworkService();
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__CONTAINMENT_TYPE:
				return getContainmentType();
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
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK:
				setNetwork((CIM_LogicalNetwork)newValue);
				return;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE:
				setNetworkService((CIM_NetworkService)newValue);
				return;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__CONTAINMENT_TYPE:
				setContainmentType((Integer)newValue);
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
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK:
				setNetwork((CIM_LogicalNetwork)null);
				return;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE:
				setNetworkService((CIM_NetworkService)null);
				return;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__CONTAINMENT_TYPE:
				setContainmentType(CONTAINMENT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK:
				return network != null;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__NETWORK_SERVICE:
				return networkService != null;
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE__CONTAINMENT_TYPE:
				return CONTAINMENT_TYPE_EDEFAULT == null ? containmentType != null : !CONTAINMENT_TYPE_EDEFAULT.equals(containmentType);
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
		result.append(" (ContainmentType: ");
		result.append(containmentType);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalNetworkServiceImpl
