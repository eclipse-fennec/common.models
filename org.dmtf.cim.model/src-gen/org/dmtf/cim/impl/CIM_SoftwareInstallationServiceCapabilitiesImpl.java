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

import org.dmtf.cim.CIM_SoftwareInstallationServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Installation Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedTargetTypes <em>Supported Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedExtendedResourceTypes <em>Supported Extended Resource Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getCanAddToCollection <em>Can Add To Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedInstallOptions <em>Supported Install Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getOtherSupportedExtendedResourceTypeDescriptions <em>Other Supported Extended Resource Type Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedExtendedResourceTypesMajorVersions <em>Supported Extended Resource Types Major Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedExtendedResourceTypesMinorVersions <em>Supported Extended Resource Types Minor Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedExtendedResourceTypesRevisionNumbers <em>Supported Extended Resource Types Revision Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedExtendedResourceTypesBuildNumbers <em>Supported Extended Resource Types Build Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SoftwareInstallationServiceCapabilitiesImpl#getSupportedURISchemes <em>Supported URI Schemes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SoftwareInstallationServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_SoftwareInstallationServiceCapabilities {
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
	 * The cached value of the '{@link #getSupportedTargetTypes() <em>Supported Target Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTargetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedTargetTypes;

	/**
	 * The cached value of the '{@link #getSupportedExtendedResourceTypes() <em>Supported Extended Resource Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExtendedResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExtendedResourceTypes;

	/**
	 * The default value of the '{@link #getCanAddToCollection() <em>Can Add To Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanAddToCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_ADD_TO_COLLECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanAddToCollection() <em>Can Add To Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanAddToCollection()
	 * @generated
	 * @ordered
	 */
	protected Boolean canAddToCollection = CAN_ADD_TO_COLLECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedInstallOptions() <em>Supported Install Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInstallOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedInstallOptions;

	/**
	 * The cached value of the '{@link #getOtherSupportedExtendedResourceTypeDescriptions() <em>Other Supported Extended Resource Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedExtendedResourceTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedExtendedResourceTypeDescriptions;

	/**
	 * The cached value of the '{@link #getSupportedExtendedResourceTypesMajorVersions() <em>Supported Extended Resource Types Major Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExtendedResourceTypesMajorVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExtendedResourceTypesMajorVersions;

	/**
	 * The cached value of the '{@link #getSupportedExtendedResourceTypesMinorVersions() <em>Supported Extended Resource Types Minor Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExtendedResourceTypesMinorVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExtendedResourceTypesMinorVersions;

	/**
	 * The cached value of the '{@link #getSupportedExtendedResourceTypesRevisionNumbers() <em>Supported Extended Resource Types Revision Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExtendedResourceTypesRevisionNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExtendedResourceTypesRevisionNumbers;

	/**
	 * The cached value of the '{@link #getSupportedExtendedResourceTypesBuildNumbers() <em>Supported Extended Resource Types Build Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExtendedResourceTypesBuildNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExtendedResourceTypesBuildNumbers;

	/**
	 * The cached value of the '{@link #getSupportedURISchemes() <em>Supported URI Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedURISchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedURISchemes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareInstallationServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareInstallationServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
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
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedTargetTypes() {
		if (supportedTargetTypes == null) {
			supportedTargetTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_TARGET_TYPES);
		}
		return supportedTargetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExtendedResourceTypes() {
		if (supportedExtendedResourceTypes == null) {
			supportedExtendedResourceTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES);
		}
		return supportedExtendedResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanAddToCollection() {
		return canAddToCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanAddToCollection(Boolean newCanAddToCollection) {
		Boolean oldCanAddToCollection = canAddToCollection;
		canAddToCollection = newCanAddToCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__CAN_ADD_TO_COLLECTION, oldCanAddToCollection, canAddToCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedInstallOptions() {
		if (supportedInstallOptions == null) {
			supportedInstallOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_INSTALL_OPTIONS);
		}
		return supportedInstallOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedExtendedResourceTypeDescriptions() {
		if (otherSupportedExtendedResourceTypeDescriptions == null) {
			otherSupportedExtendedResourceTypeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXTENDED_RESOURCE_TYPE_DESCRIPTIONS);
		}
		return otherSupportedExtendedResourceTypeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExtendedResourceTypesMajorVersions() {
		if (supportedExtendedResourceTypesMajorVersions == null) {
			supportedExtendedResourceTypesMajorVersions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MAJOR_VERSIONS);
		}
		return supportedExtendedResourceTypesMajorVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExtendedResourceTypesMinorVersions() {
		if (supportedExtendedResourceTypesMinorVersions == null) {
			supportedExtendedResourceTypesMinorVersions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MINOR_VERSIONS);
		}
		return supportedExtendedResourceTypesMinorVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExtendedResourceTypesRevisionNumbers() {
		if (supportedExtendedResourceTypesRevisionNumbers == null) {
			supportedExtendedResourceTypesRevisionNumbers = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_REVISION_NUMBERS);
		}
		return supportedExtendedResourceTypesRevisionNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExtendedResourceTypesBuildNumbers() {
		if (supportedExtendedResourceTypesBuildNumbers == null) {
			supportedExtendedResourceTypesBuildNumbers = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_BUILD_NUMBERS);
		}
		return supportedExtendedResourceTypesBuildNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedURISchemes() {
		if (supportedURISchemes == null) {
			supportedURISchemes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_URI_SCHEMES);
		}
		return supportedURISchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				return getSupportedTargetTypes();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES:
				return getSupportedExtendedResourceTypes();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__CAN_ADD_TO_COLLECTION:
				return getCanAddToCollection();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_INSTALL_OPTIONS:
				return getSupportedInstallOptions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXTENDED_RESOURCE_TYPE_DESCRIPTIONS:
				return getOtherSupportedExtendedResourceTypeDescriptions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MAJOR_VERSIONS:
				return getSupportedExtendedResourceTypesMajorVersions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MINOR_VERSIONS:
				return getSupportedExtendedResourceTypesMinorVersions();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_REVISION_NUMBERS:
				return getSupportedExtendedResourceTypesRevisionNumbers();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_BUILD_NUMBERS:
				return getSupportedExtendedResourceTypesBuildNumbers();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_URI_SCHEMES:
				return getSupportedURISchemes();
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
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				getSupportedTargetTypes().clear();
				getSupportedTargetTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES:
				getSupportedExtendedResourceTypes().clear();
				getSupportedExtendedResourceTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__CAN_ADD_TO_COLLECTION:
				setCanAddToCollection((Boolean)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_INSTALL_OPTIONS:
				getSupportedInstallOptions().clear();
				getSupportedInstallOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXTENDED_RESOURCE_TYPE_DESCRIPTIONS:
				getOtherSupportedExtendedResourceTypeDescriptions().clear();
				getOtherSupportedExtendedResourceTypeDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MAJOR_VERSIONS:
				getSupportedExtendedResourceTypesMajorVersions().clear();
				getSupportedExtendedResourceTypesMajorVersions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MINOR_VERSIONS:
				getSupportedExtendedResourceTypesMinorVersions().clear();
				getSupportedExtendedResourceTypesMinorVersions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_REVISION_NUMBERS:
				getSupportedExtendedResourceTypesRevisionNumbers().clear();
				getSupportedExtendedResourceTypesRevisionNumbers().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_BUILD_NUMBERS:
				getSupportedExtendedResourceTypesBuildNumbers().clear();
				getSupportedExtendedResourceTypesBuildNumbers().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_URI_SCHEMES:
				getSupportedURISchemes().clear();
				getSupportedURISchemes().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				getSupportedTargetTypes().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES:
				getSupportedExtendedResourceTypes().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__CAN_ADD_TO_COLLECTION:
				setCanAddToCollection(CAN_ADD_TO_COLLECTION_EDEFAULT);
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_INSTALL_OPTIONS:
				getSupportedInstallOptions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXTENDED_RESOURCE_TYPE_DESCRIPTIONS:
				getOtherSupportedExtendedResourceTypeDescriptions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MAJOR_VERSIONS:
				getSupportedExtendedResourceTypesMajorVersions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MINOR_VERSIONS:
				getSupportedExtendedResourceTypesMinorVersions().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_REVISION_NUMBERS:
				getSupportedExtendedResourceTypesRevisionNumbers().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_BUILD_NUMBERS:
				getSupportedExtendedResourceTypesBuildNumbers().clear();
				return;
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_URI_SCHEMES:
				getSupportedURISchemes().clear();
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
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				return supportedTargetTypes != null && !supportedTargetTypes.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES:
				return supportedExtendedResourceTypes != null && !supportedExtendedResourceTypes.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__CAN_ADD_TO_COLLECTION:
				return CAN_ADD_TO_COLLECTION_EDEFAULT == null ? canAddToCollection != null : !CAN_ADD_TO_COLLECTION_EDEFAULT.equals(canAddToCollection);
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_INSTALL_OPTIONS:
				return supportedInstallOptions != null && !supportedInstallOptions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__OTHER_SUPPORTED_EXTENDED_RESOURCE_TYPE_DESCRIPTIONS:
				return otherSupportedExtendedResourceTypeDescriptions != null && !otherSupportedExtendedResourceTypeDescriptions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MAJOR_VERSIONS:
				return supportedExtendedResourceTypesMajorVersions != null && !supportedExtendedResourceTypesMajorVersions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_MINOR_VERSIONS:
				return supportedExtendedResourceTypesMinorVersions != null && !supportedExtendedResourceTypesMinorVersions.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_REVISION_NUMBERS:
				return supportedExtendedResourceTypesRevisionNumbers != null && !supportedExtendedResourceTypesRevisionNumbers.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_EXTENDED_RESOURCE_TYPES_BUILD_NUMBERS:
				return supportedExtendedResourceTypesBuildNumbers != null && !supportedExtendedResourceTypesBuildNumbers.isEmpty();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES__SUPPORTED_URI_SCHEMES:
				return supportedURISchemes != null && !supportedURISchemes.isEmpty();
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
		result.append(" (SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SupportedTargetTypes: ");
		result.append(supportedTargetTypes);
		result.append(", SupportedExtendedResourceTypes: ");
		result.append(supportedExtendedResourceTypes);
		result.append(", CanAddToCollection: ");
		result.append(canAddToCollection);
		result.append(", SupportedInstallOptions: ");
		result.append(supportedInstallOptions);
		result.append(", OtherSupportedExtendedResourceTypeDescriptions: ");
		result.append(otherSupportedExtendedResourceTypeDescriptions);
		result.append(", SupportedExtendedResourceTypesMajorVersions: ");
		result.append(supportedExtendedResourceTypesMajorVersions);
		result.append(", SupportedExtendedResourceTypesMinorVersions: ");
		result.append(supportedExtendedResourceTypesMinorVersions);
		result.append(", SupportedExtendedResourceTypesRevisionNumbers: ");
		result.append(supportedExtendedResourceTypesRevisionNumbers);
		result.append(", SupportedExtendedResourceTypesBuildNumbers: ");
		result.append(supportedExtendedResourceTypesBuildNumbers);
		result.append(", SupportedURISchemes: ");
		result.append(supportedURISchemes);
		result.append(')');
		return result.toString();
	}

} //CIM_SoftwareInstallationServiceCapabilitiesImpl
