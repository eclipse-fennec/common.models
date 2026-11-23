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

import java.util.Collection;

import org.dmtf.cim.CIM_VTLStatisticalDataServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VTL Statistical Data Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataServiceCapabilitiesImpl#getSupportedSyncActions <em>Supported Sync Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLStatisticalDataServiceCapabilitiesImpl#getSupportedAsyncActions <em>Supported Async Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VTLStatisticalDataServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_VTLStatisticalDataServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedSyncActions() <em>Supported Sync Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSyncActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSyncActions;

	/**
	 * The cached value of the '{@link #getSupportedAsyncActions() <em>Supported Async Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsyncActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsyncActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VTLStatisticalDataServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VTLStatisticalDataServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSyncActions() {
		if (supportedSyncActions == null) {
			supportedSyncActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_SYNC_ACTIONS);
		}
		return supportedSyncActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsyncActions() {
		if (supportedAsyncActions == null) {
			supportedAsyncActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_ASYNC_ACTIONS);
		}
		return supportedAsyncActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_SYNC_ACTIONS:
				return getSupportedSyncActions();
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_ASYNC_ACTIONS:
				return getSupportedAsyncActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_SYNC_ACTIONS:
				getSupportedSyncActions().clear();
				getSupportedSyncActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_ASYNC_ACTIONS:
				getSupportedAsyncActions().clear();
				getSupportedAsyncActions().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_SYNC_ACTIONS:
				getSupportedSyncActions().clear();
				return;
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_ASYNC_ACTIONS:
				getSupportedAsyncActions().clear();
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
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_SYNC_ACTIONS:
				return supportedSyncActions != null && !supportedSyncActions.isEmpty();
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES__SUPPORTED_ASYNC_ACTIONS:
				return supportedAsyncActions != null && !supportedAsyncActions.isEmpty();
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
		result.append(" (SupportedSyncActions: ");
		result.append(supportedSyncActions);
		result.append(", SupportedAsyncActions: ");
		result.append(supportedAsyncActions);
		result.append(')');
		return result.toString();
	}

} //CIM_VTLStatisticalDataServiceCapabilitiesImpl
