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

import org.dmtf.cim.CIM_GroupMaskingMappingCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Group Masking Mapping Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_GroupMaskingMappingCapabilitiesImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GroupMaskingMappingCapabilitiesImpl#getSupportedInitiatorGroupFeatures <em>Supported Initiator Group Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GroupMaskingMappingCapabilitiesImpl#getSupportedTargetGroupFeatures <em>Supported Target Group Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GroupMaskingMappingCapabilitiesImpl#getSupportedDeviceGroupFeatures <em>Supported Device Group Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_GroupMaskingMappingCapabilitiesImpl extends CIM_ProtocolControllerMaskingCapabilitiesImpl implements CIM_GroupMaskingMappingCapabilities {
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
	 * The cached value of the '{@link #getSupportedInitiatorGroupFeatures() <em>Supported Initiator Group Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInitiatorGroupFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedInitiatorGroupFeatures;

	/**
	 * The cached value of the '{@link #getSupportedTargetGroupFeatures() <em>Supported Target Group Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTargetGroupFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedTargetGroupFeatures;

	/**
	 * The cached value of the '{@link #getSupportedDeviceGroupFeatures() <em>Supported Device Group Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDeviceGroupFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedDeviceGroupFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_GroupMaskingMappingCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_GroupMaskingMappingCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedFeatures() {
		if (supportedFeatures == null) {
			supportedFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_FEATURES);
		}
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedInitiatorGroupFeatures() {
		if (supportedInitiatorGroupFeatures == null) {
			supportedInitiatorGroupFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_INITIATOR_GROUP_FEATURES);
		}
		return supportedInitiatorGroupFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedTargetGroupFeatures() {
		if (supportedTargetGroupFeatures == null) {
			supportedTargetGroupFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_TARGET_GROUP_FEATURES);
		}
		return supportedTargetGroupFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedDeviceGroupFeatures() {
		if (supportedDeviceGroupFeatures == null) {
			supportedDeviceGroupFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_DEVICE_GROUP_FEATURES);
		}
		return supportedDeviceGroupFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_FEATURES:
				return getSupportedFeatures();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_INITIATOR_GROUP_FEATURES:
				return getSupportedInitiatorGroupFeatures();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_TARGET_GROUP_FEATURES:
				return getSupportedTargetGroupFeatures();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_DEVICE_GROUP_FEATURES:
				return getSupportedDeviceGroupFeatures();
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
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				getSupportedFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_INITIATOR_GROUP_FEATURES:
				getSupportedInitiatorGroupFeatures().clear();
				getSupportedInitiatorGroupFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_TARGET_GROUP_FEATURES:
				getSupportedTargetGroupFeatures().clear();
				getSupportedTargetGroupFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_DEVICE_GROUP_FEATURES:
				getSupportedDeviceGroupFeatures().clear();
				getSupportedDeviceGroupFeatures().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_INITIATOR_GROUP_FEATURES:
				getSupportedInitiatorGroupFeatures().clear();
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_TARGET_GROUP_FEATURES:
				getSupportedTargetGroupFeatures().clear();
				return;
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_DEVICE_GROUP_FEATURES:
				getSupportedDeviceGroupFeatures().clear();
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
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_FEATURES:
				return supportedFeatures != null && !supportedFeatures.isEmpty();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_INITIATOR_GROUP_FEATURES:
				return supportedInitiatorGroupFeatures != null && !supportedInitiatorGroupFeatures.isEmpty();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_TARGET_GROUP_FEATURES:
				return supportedTargetGroupFeatures != null && !supportedTargetGroupFeatures.isEmpty();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES__SUPPORTED_DEVICE_GROUP_FEATURES:
				return supportedDeviceGroupFeatures != null && !supportedDeviceGroupFeatures.isEmpty();
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
		result.append(", SupportedInitiatorGroupFeatures: ");
		result.append(supportedInitiatorGroupFeatures);
		result.append(", SupportedTargetGroupFeatures: ");
		result.append(supportedTargetGroupFeatures);
		result.append(", SupportedDeviceGroupFeatures: ");
		result.append(supportedDeviceGroupFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_GroupMaskingMappingCapabilitiesImpl
