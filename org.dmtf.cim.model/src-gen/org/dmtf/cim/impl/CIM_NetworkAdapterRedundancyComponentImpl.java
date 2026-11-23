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

import org.dmtf.cim.CIM_NetworkAdapterRedundancyComponent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Adapter Redundancy Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterRedundancyComponentImpl#getScopeOfBalancing <em>Scope Of Balancing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterRedundancyComponentImpl#getPrimaryAdapter <em>Primary Adapter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkAdapterRedundancyComponentImpl extends CIM_RedundancyComponentImpl implements CIM_NetworkAdapterRedundancyComponent {
	/**
	 * The default value of the '{@link #getScopeOfBalancing() <em>Scope Of Balancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeOfBalancing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCOPE_OF_BALANCING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScopeOfBalancing() <em>Scope Of Balancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeOfBalancing()
	 * @generated
	 * @ordered
	 */
	protected Integer scopeOfBalancing = SCOPE_OF_BALANCING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryAdapter() <em>Primary Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_ADAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryAdapter() <em>Primary Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAdapter()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryAdapter = PRIMARY_ADAPTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkAdapterRedundancyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkAdapterRedundancyComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getScopeOfBalancing() {
		return scopeOfBalancing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeOfBalancing(Integer newScopeOfBalancing) {
		Integer oldScopeOfBalancing = scopeOfBalancing;
		scopeOfBalancing = newScopeOfBalancing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__SCOPE_OF_BALANCING, oldScopeOfBalancing, scopeOfBalancing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryAdapter() {
		return primaryAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryAdapter(Integer newPrimaryAdapter) {
		Integer oldPrimaryAdapter = primaryAdapter;
		primaryAdapter = newPrimaryAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__PRIMARY_ADAPTER, oldPrimaryAdapter, primaryAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__SCOPE_OF_BALANCING:
				return getScopeOfBalancing();
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__PRIMARY_ADAPTER:
				return getPrimaryAdapter();
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
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__SCOPE_OF_BALANCING:
				setScopeOfBalancing((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__PRIMARY_ADAPTER:
				setPrimaryAdapter((Integer)newValue);
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
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__SCOPE_OF_BALANCING:
				setScopeOfBalancing(SCOPE_OF_BALANCING_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__PRIMARY_ADAPTER:
				setPrimaryAdapter(PRIMARY_ADAPTER_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__SCOPE_OF_BALANCING:
				return SCOPE_OF_BALANCING_EDEFAULT == null ? scopeOfBalancing != null : !SCOPE_OF_BALANCING_EDEFAULT.equals(scopeOfBalancing);
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT__PRIMARY_ADAPTER:
				return PRIMARY_ADAPTER_EDEFAULT == null ? primaryAdapter != null : !PRIMARY_ADAPTER_EDEFAULT.equals(primaryAdapter);
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
		result.append(" (ScopeOfBalancing: ");
		result.append(scopeOfBalancing);
		result.append(", PrimaryAdapter: ");
		result.append(primaryAdapter);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkAdapterRedundancyComponentImpl
