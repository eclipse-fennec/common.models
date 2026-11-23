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

import org.dmtf.cim.CIM_PhysicalAssetCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Asset Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalAssetCapabilitiesImpl#getFRUInfoSupported <em>FRU Info Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalAssetCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_PhysicalAssetCapabilities {
	/**
	 * The default value of the '{@link #getFRUInfoSupported() <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUInfoSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FRU_INFO_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFRUInfoSupported() <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUInfoSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean fruInfoSupported = FRU_INFO_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalAssetCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalAssetCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFRUInfoSupported() {
		return fruInfoSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRUInfoSupported(Boolean newFRUInfoSupported) {
		Boolean oldFRUInfoSupported = fruInfoSupported;
		fruInfoSupported = newFRUInfoSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES__FRU_INFO_SUPPORTED, oldFRUInfoSupported, fruInfoSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES__FRU_INFO_SUPPORTED:
				return getFRUInfoSupported();
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
			case CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES__FRU_INFO_SUPPORTED:
				setFRUInfoSupported((Boolean)newValue);
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
			case CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES__FRU_INFO_SUPPORTED:
				setFRUInfoSupported(FRU_INFO_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES__FRU_INFO_SUPPORTED:
				return FRU_INFO_SUPPORTED_EDEFAULT == null ? fruInfoSupported != null : !FRU_INFO_SUPPORTED_EDEFAULT.equals(fruInfoSupported);
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
		result.append(" (FRUInfoSupported: ");
		result.append(fruInfoSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalAssetCapabilitiesImpl
