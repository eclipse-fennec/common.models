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

import org.dmtf.cim.CIM_StorageProtectionCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Protection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionCapabilitiesImpl#getProtectionTimeGranularity <em>Protection Time Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageProtectionCapabilitiesImpl#getSupportedStorageElementFeatures <em>Supported Storage Element Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageProtectionCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageProtectionCapabilities {
	/**
	 * The default value of the '{@link #getProtectionTimeGranularity() <em>Protection Time Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionTimeGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTECTION_TIME_GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionTimeGranularity() <em>Protection Time Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionTimeGranularity()
	 * @generated
	 * @ordered
	 */
	protected Integer protectionTimeGranularity = PROTECTION_TIME_GRANULARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedStorageElementFeatures() <em>Supported Storage Element Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElementFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElementFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageProtectionCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageProtectionCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtectionTimeGranularity() {
		return protectionTimeGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtectionTimeGranularity(Integer newProtectionTimeGranularity) {
		Integer oldProtectionTimeGranularity = protectionTimeGranularity;
		protectionTimeGranularity = newProtectionTimeGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__PROTECTION_TIME_GRANULARITY, oldProtectionTimeGranularity, protectionTimeGranularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElementFeatures() {
		if (supportedStorageElementFeatures == null) {
			supportedStorageElementFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES);
		}
		return supportedStorageElementFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__PROTECTION_TIME_GRANULARITY:
				return getProtectionTimeGranularity();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return getSupportedStorageElementFeatures();
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
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__PROTECTION_TIME_GRANULARITY:
				setProtectionTimeGranularity((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSupportedStorageElementFeatures().clear();
				getSupportedStorageElementFeatures().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__PROTECTION_TIME_GRANULARITY:
				setProtectionTimeGranularity(PROTECTION_TIME_GRANULARITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSupportedStorageElementFeatures().clear();
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
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__PROTECTION_TIME_GRANULARITY:
				return PROTECTION_TIME_GRANULARITY_EDEFAULT == null ? protectionTimeGranularity != null : !PROTECTION_TIME_GRANULARITY_EDEFAULT.equals(protectionTimeGranularity);
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return supportedStorageElementFeatures != null && !supportedStorageElementFeatures.isEmpty();
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
		result.append(" (ProtectionTimeGranularity: ");
		result.append(protectionTimeGranularity);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SupportedStorageElementFeatures: ");
		result.append(supportedStorageElementFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageProtectionCapabilitiesImpl
