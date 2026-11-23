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

import org.dmtf.cim.CIM_TierServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tier Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedStorageObjects <em>Supported Storage Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedStorageElements <em>Supported Storage Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedTierFeatures <em>Supported Tier Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedCompression <em>Supported Compression</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedDataMovement <em>Supported Data Movement</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierServiceCapabilitiesImpl#getSupportedManualMovementProvisioning <em>Supported Manual Movement Provisioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TierServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_TierServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedFeatures;

	/**
	 * The cached value of the '{@link #getSupportedStorageObjects() <em>Supported Storage Objects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageObjects;

	/**
	 * The cached value of the '{@link #getSupportedStorageElements() <em>Supported Storage Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElements;

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
	 * The cached value of the '{@link #getSupportedTierFeatures() <em>Supported Tier Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTierFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedTierFeatures;

	/**
	 * The cached value of the '{@link #getSupportedCompression() <em>Supported Compression</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCompression()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCompression;

	/**
	 * The cached value of the '{@link #getSupportedDataMovement() <em>Supported Data Movement</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDataMovement()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedDataMovement;

	/**
	 * The cached value of the '{@link #getSupportedManualMovementProvisioning() <em>Supported Manual Movement Provisioning</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedManualMovementProvisioning()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedManualMovementProvisioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TierServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TierServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedFeatures() {
		if (supportedFeatures == null) {
			supportedFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_FEATURES);
		}
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageObjects() {
		if (supportedStorageObjects == null) {
			supportedStorageObjects = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS);
		}
		return supportedStorageObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElements() {
		if (supportedStorageElements == null) {
			supportedStorageElements = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS);
		}
		return supportedStorageElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
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
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedTierFeatures() {
		if (supportedTierFeatures == null) {
			supportedTierFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_TIER_FEATURES);
		}
		return supportedTierFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCompression() {
		if (supportedCompression == null) {
			supportedCompression = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_COMPRESSION);
		}
		return supportedCompression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedDataMovement() {
		if (supportedDataMovement == null) {
			supportedDataMovement = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_DATA_MOVEMENT);
		}
		return supportedDataMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedManualMovementProvisioning() {
		if (supportedManualMovementProvisioning == null) {
			supportedManualMovementProvisioning = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_MANUAL_MOVEMENT_PROVISIONING);
		}
		return supportedManualMovementProvisioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_FEATURES:
				return getSupportedFeatures();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				return getSupportedStorageObjects();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				return getSupportedStorageElements();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_TIER_FEATURES:
				return getSupportedTierFeatures();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_COMPRESSION:
				return getSupportedCompression();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_DATA_MOVEMENT:
				return getSupportedDataMovement();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_MANUAL_MOVEMENT_PROVISIONING:
				return getSupportedManualMovementProvisioning();
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
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				getSupportedFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				getSupportedStorageObjects().clear();
				getSupportedStorageObjects().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				getSupportedStorageElements().clear();
				getSupportedStorageElements().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_TIER_FEATURES:
				getSupportedTierFeatures().clear();
				getSupportedTierFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_COMPRESSION:
				getSupportedCompression().clear();
				getSupportedCompression().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_DATA_MOVEMENT:
				getSupportedDataMovement().clear();
				getSupportedDataMovement().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_MANUAL_MOVEMENT_PROVISIONING:
				getSupportedManualMovementProvisioning().clear();
				getSupportedManualMovementProvisioning().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				getSupportedStorageObjects().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				getSupportedStorageElements().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_TIER_FEATURES:
				getSupportedTierFeatures().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_COMPRESSION:
				getSupportedCompression().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_DATA_MOVEMENT:
				getSupportedDataMovement().clear();
				return;
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_MANUAL_MOVEMENT_PROVISIONING:
				getSupportedManualMovementProvisioning().clear();
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
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_FEATURES:
				return supportedFeatures != null && !supportedFeatures.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				return supportedStorageObjects != null && !supportedStorageObjects.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_ELEMENTS:
				return supportedStorageElements != null && !supportedStorageElements.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_TIER_FEATURES:
				return supportedTierFeatures != null && !supportedTierFeatures.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_COMPRESSION:
				return supportedCompression != null && !supportedCompression.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_DATA_MOVEMENT:
				return supportedDataMovement != null && !supportedDataMovement.isEmpty();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES__SUPPORTED_MANUAL_MOVEMENT_PROVISIONING:
				return supportedManualMovementProvisioning != null && !supportedManualMovementProvisioning.isEmpty();
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
		result.append(" (SupportedFeatures: ");
		result.append(supportedFeatures);
		result.append(", SupportedStorageObjects: ");
		result.append(supportedStorageObjects);
		result.append(", SupportedStorageElements: ");
		result.append(supportedStorageElements);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SupportedTierFeatures: ");
		result.append(supportedTierFeatures);
		result.append(", SupportedCompression: ");
		result.append(supportedCompression);
		result.append(", SupportedDataMovement: ");
		result.append(supportedDataMovement);
		result.append(", SupportedManualMovementProvisioning: ");
		result.append(supportedManualMovementProvisioning);
		result.append(')');
		return result.toString();
	}

} //CIM_TierServiceCapabilitiesImpl
