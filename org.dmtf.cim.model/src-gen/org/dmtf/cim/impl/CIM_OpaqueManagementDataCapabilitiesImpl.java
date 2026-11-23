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

import org.dmtf.cim.CIM_OpaqueManagementDataCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Opaque Management Data Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getMaxAvailableStorage <em>Max Available Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getMaxReadLength <em>Max Read Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getMaxWriteLength <em>Max Write Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getSupportedExportURISchemes <em>Supported Export URI Schemes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getSupportedImportURISchemes <em>Supported Import URI Schemes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getTruncationSupported <em>Truncation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OpaqueManagementDataCapabilitiesImpl#getMaxInstancesSupported <em>Max Instances Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OpaqueManagementDataCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_OpaqueManagementDataCapabilities {
	/**
	 * The default value of the '{@link #getMaxAvailableStorage() <em>Max Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAvailableStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_AVAILABLE_STORAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAvailableStorage() <em>Max Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAvailableStorage()
	 * @generated
	 * @ordered
	 */
	protected Long maxAvailableStorage = MAX_AVAILABLE_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReadLength() <em>Max Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReadLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_READ_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxReadLength() <em>Max Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReadLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxReadLength = MAX_READ_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWriteLength() <em>Max Write Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWriteLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_WRITE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWriteLength() <em>Max Write Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWriteLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxWriteLength = MAX_WRITE_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedExportURISchemes() <em>Supported Export URI Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedExportURISchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedExportURISchemes;

	/**
	 * The cached value of the '{@link #getSupportedImportURISchemes() <em>Supported Import URI Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedImportURISchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedImportURISchemes;

	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedMethods;

	/**
	 * The default value of the '{@link #getTruncationSupported() <em>Truncation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruncationSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRUNCATION_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTruncationSupported() <em>Truncation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruncationSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean truncationSupported = TRUNCATION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstancesSupported() <em>Max Instances Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstancesSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_INSTANCES_SUPPORTED_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getMaxInstancesSupported() <em>Max Instances Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstancesSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer maxInstancesSupported = MAX_INSTANCES_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OpaqueManagementDataCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OpaqueManagementDataCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxAvailableStorage() {
		return maxAvailableStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAvailableStorage(Long newMaxAvailableStorage) {
		Long oldMaxAvailableStorage = maxAvailableStorage;
		maxAvailableStorage = newMaxAvailableStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_AVAILABLE_STORAGE, oldMaxAvailableStorage, maxAvailableStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxReadLength() {
		return maxReadLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxReadLength(Long newMaxReadLength) {
		Long oldMaxReadLength = maxReadLength;
		maxReadLength = newMaxReadLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_READ_LENGTH, oldMaxReadLength, maxReadLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxWriteLength() {
		return maxWriteLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWriteLength(Long newMaxWriteLength) {
		Long oldMaxWriteLength = maxWriteLength;
		maxWriteLength = newMaxWriteLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_WRITE_LENGTH, oldMaxWriteLength, maxWriteLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedExportURISchemes() {
		if (supportedExportURISchemes == null) {
			supportedExportURISchemes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_EXPORT_URI_SCHEMES);
		}
		return supportedExportURISchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedImportURISchemes() {
		if (supportedImportURISchemes == null) {
			supportedImportURISchemes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_IMPORT_URI_SCHEMES);
		}
		return supportedImportURISchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTruncationSupported() {
		return truncationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruncationSupported(Boolean newTruncationSupported) {
		Boolean oldTruncationSupported = truncationSupported;
		truncationSupported = newTruncationSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__TRUNCATION_SUPPORTED, oldTruncationSupported, truncationSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxInstancesSupported() {
		return maxInstancesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxInstancesSupported(Integer newMaxInstancesSupported) {
		Integer oldMaxInstancesSupported = maxInstancesSupported;
		maxInstancesSupported = newMaxInstancesSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_INSTANCES_SUPPORTED, oldMaxInstancesSupported, maxInstancesSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_AVAILABLE_STORAGE:
				return getMaxAvailableStorage();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_READ_LENGTH:
				return getMaxReadLength();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_WRITE_LENGTH:
				return getMaxWriteLength();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_EXPORT_URI_SCHEMES:
				return getSupportedExportURISchemes();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_IMPORT_URI_SCHEMES:
				return getSupportedImportURISchemes();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_METHODS:
				return getSupportedMethods();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__TRUNCATION_SUPPORTED:
				return getTruncationSupported();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_INSTANCES_SUPPORTED:
				return getMaxInstancesSupported();
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_AVAILABLE_STORAGE:
				setMaxAvailableStorage((Long)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_READ_LENGTH:
				setMaxReadLength((Long)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_WRITE_LENGTH:
				setMaxWriteLength((Long)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_EXPORT_URI_SCHEMES:
				getSupportedExportURISchemes().clear();
				getSupportedExportURISchemes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_IMPORT_URI_SCHEMES:
				getSupportedImportURISchemes().clear();
				getSupportedImportURISchemes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__TRUNCATION_SUPPORTED:
				setTruncationSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_INSTANCES_SUPPORTED:
				setMaxInstancesSupported((Integer)newValue);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_AVAILABLE_STORAGE:
				setMaxAvailableStorage(MAX_AVAILABLE_STORAGE_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_READ_LENGTH:
				setMaxReadLength(MAX_READ_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_WRITE_LENGTH:
				setMaxWriteLength(MAX_WRITE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_EXPORT_URI_SCHEMES:
				getSupportedExportURISchemes().clear();
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_IMPORT_URI_SCHEMES:
				getSupportedImportURISchemes().clear();
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__TRUNCATION_SUPPORTED:
				setTruncationSupported(TRUNCATION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_INSTANCES_SUPPORTED:
				setMaxInstancesSupported(MAX_INSTANCES_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_AVAILABLE_STORAGE:
				return MAX_AVAILABLE_STORAGE_EDEFAULT == null ? maxAvailableStorage != null : !MAX_AVAILABLE_STORAGE_EDEFAULT.equals(maxAvailableStorage);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_READ_LENGTH:
				return MAX_READ_LENGTH_EDEFAULT == null ? maxReadLength != null : !MAX_READ_LENGTH_EDEFAULT.equals(maxReadLength);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_WRITE_LENGTH:
				return MAX_WRITE_LENGTH_EDEFAULT == null ? maxWriteLength != null : !MAX_WRITE_LENGTH_EDEFAULT.equals(maxWriteLength);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_EXPORT_URI_SCHEMES:
				return supportedExportURISchemes != null && !supportedExportURISchemes.isEmpty();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_IMPORT_URI_SCHEMES:
				return supportedImportURISchemes != null && !supportedImportURISchemes.isEmpty();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__TRUNCATION_SUPPORTED:
				return TRUNCATION_SUPPORTED_EDEFAULT == null ? truncationSupported != null : !TRUNCATION_SUPPORTED_EDEFAULT.equals(truncationSupported);
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES__MAX_INSTANCES_SUPPORTED:
				return MAX_INSTANCES_SUPPORTED_EDEFAULT == null ? maxInstancesSupported != null : !MAX_INSTANCES_SUPPORTED_EDEFAULT.equals(maxInstancesSupported);
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
		result.append(" (MaxAvailableStorage: ");
		result.append(maxAvailableStorage);
		result.append(", MaxReadLength: ");
		result.append(maxReadLength);
		result.append(", MaxWriteLength: ");
		result.append(maxWriteLength);
		result.append(", SupportedExportURISchemes: ");
		result.append(supportedExportURISchemes);
		result.append(", SupportedImportURISchemes: ");
		result.append(supportedImportURISchemes);
		result.append(", SupportedMethods: ");
		result.append(supportedMethods);
		result.append(", TruncationSupported: ");
		result.append(truncationSupported);
		result.append(", MaxInstancesSupported: ");
		result.append(maxInstancesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_OpaqueManagementDataCapabilitiesImpl
