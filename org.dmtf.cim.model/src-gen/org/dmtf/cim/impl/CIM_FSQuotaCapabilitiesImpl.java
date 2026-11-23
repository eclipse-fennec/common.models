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

import org.dmtf.cim.CIM_FSQuotaCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FS Quota Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getSupportedTargetTypes <em>Supported Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getSupportedPrincipalTypes <em>Supported Principal Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getConflictingEntriesUsage <em>Conflicting Entries Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getSupportedResourceTypes <em>Supported Resource Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getDefaultSupported <em>Default Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getIsActiveSettingPerEntrySupported <em>Is Active Setting Per Entry Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getIsMonitoredSettingPerEntrySupported <em>Is Monitored Setting Per Entry Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FSQuotaCapabilitiesImpl#getIsGracePeriodSupported <em>Is Grace Period Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FSQuotaCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FSQuotaCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedTargetTypes() <em>Supported Target Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTargetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedTargetTypes;

	/**
	 * The cached value of the '{@link #getSupportedPrincipalTypes() <em>Supported Principal Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPrincipalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedPrincipalTypes;

	/**
	 * The default value of the '{@link #getConflictingEntriesUsage() <em>Conflicting Entries Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingEntriesUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONFLICTING_ENTRIES_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConflictingEntriesUsage() <em>Conflicting Entries Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingEntriesUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer conflictingEntriesUsage = CONFLICTING_ENTRIES_USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedResourceTypes() <em>Supported Resource Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedResourceTypes;

	/**
	 * The cached value of the '{@link #getDefaultSupported() <em>Default Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> defaultSupported;

	/**
	 * The default value of the '{@link #getIsActiveSettingPerEntrySupported() <em>Is Active Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActiveSettingPerEntrySupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsActiveSettingPerEntrySupported() <em>Is Active Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActiveSettingPerEntrySupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean isActiveSettingPerEntrySupported = IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMonitoredSettingPerEntrySupported() <em>Is Monitored Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMonitoredSettingPerEntrySupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMonitoredSettingPerEntrySupported() <em>Is Monitored Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMonitoredSettingPerEntrySupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMonitoredSettingPerEntrySupported = IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsGracePeriodSupported() <em>Is Grace Period Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGracePeriodSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GRACE_PERIOD_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsGracePeriodSupported() <em>Is Grace Period Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGracePeriodSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGracePeriodSupported = IS_GRACE_PERIOD_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FSQuotaCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FSQuotaCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedTargetTypes() {
		if (supportedTargetTypes == null) {
			supportedTargetTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_TARGET_TYPES);
		}
		return supportedTargetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedPrincipalTypes() {
		if (supportedPrincipalTypes == null) {
			supportedPrincipalTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_PRINCIPAL_TYPES);
		}
		return supportedPrincipalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConflictingEntriesUsage() {
		return conflictingEntriesUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConflictingEntriesUsage(Integer newConflictingEntriesUsage) {
		Integer oldConflictingEntriesUsage = conflictingEntriesUsage;
		conflictingEntriesUsage = newConflictingEntriesUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_CAPABILITIES__CONFLICTING_ENTRIES_USAGE, oldConflictingEntriesUsage, conflictingEntriesUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedResourceTypes() {
		if (supportedResourceTypes == null) {
			supportedResourceTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_RESOURCE_TYPES);
		}
		return supportedResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDefaultSupported() {
		if (defaultSupported == null) {
			defaultSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FS_QUOTA_CAPABILITIES__DEFAULT_SUPPORTED);
		}
		return defaultSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsActiveSettingPerEntrySupported() {
		return isActiveSettingPerEntrySupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActiveSettingPerEntrySupported(Boolean newIsActiveSettingPerEntrySupported) {
		Boolean oldIsActiveSettingPerEntrySupported = isActiveSettingPerEntrySupported;
		isActiveSettingPerEntrySupported = newIsActiveSettingPerEntrySupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED, oldIsActiveSettingPerEntrySupported, isActiveSettingPerEntrySupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsMonitoredSettingPerEntrySupported() {
		return isMonitoredSettingPerEntrySupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMonitoredSettingPerEntrySupported(Boolean newIsMonitoredSettingPerEntrySupported) {
		Boolean oldIsMonitoredSettingPerEntrySupported = isMonitoredSettingPerEntrySupported;
		isMonitoredSettingPerEntrySupported = newIsMonitoredSettingPerEntrySupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED, oldIsMonitoredSettingPerEntrySupported, isMonitoredSettingPerEntrySupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsGracePeriodSupported() {
		return isGracePeriodSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsGracePeriodSupported(Boolean newIsGracePeriodSupported) {
		Boolean oldIsGracePeriodSupported = isGracePeriodSupported;
		isGracePeriodSupported = newIsGracePeriodSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_GRACE_PERIOD_SUPPORTED, oldIsGracePeriodSupported, isGracePeriodSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				return getSupportedTargetTypes();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_PRINCIPAL_TYPES:
				return getSupportedPrincipalTypes();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__CONFLICTING_ENTRIES_USAGE:
				return getConflictingEntriesUsage();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_RESOURCE_TYPES:
				return getSupportedResourceTypes();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__DEFAULT_SUPPORTED:
				return getDefaultSupported();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED:
				return getIsActiveSettingPerEntrySupported();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED:
				return getIsMonitoredSettingPerEntrySupported();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_GRACE_PERIOD_SUPPORTED:
				return getIsGracePeriodSupported();
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
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				getSupportedTargetTypes().clear();
				getSupportedTargetTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_PRINCIPAL_TYPES:
				getSupportedPrincipalTypes().clear();
				getSupportedPrincipalTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__CONFLICTING_ENTRIES_USAGE:
				setConflictingEntriesUsage((Integer)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_RESOURCE_TYPES:
				getSupportedResourceTypes().clear();
				getSupportedResourceTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__DEFAULT_SUPPORTED:
				getDefaultSupported().clear();
				getDefaultSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED:
				setIsActiveSettingPerEntrySupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED:
				setIsMonitoredSettingPerEntrySupported((Boolean)newValue);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_GRACE_PERIOD_SUPPORTED:
				setIsGracePeriodSupported((Boolean)newValue);
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
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				getSupportedTargetTypes().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_PRINCIPAL_TYPES:
				getSupportedPrincipalTypes().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__CONFLICTING_ENTRIES_USAGE:
				setConflictingEntriesUsage(CONFLICTING_ENTRIES_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_RESOURCE_TYPES:
				getSupportedResourceTypes().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__DEFAULT_SUPPORTED:
				getDefaultSupported().clear();
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED:
				setIsActiveSettingPerEntrySupported(IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED:
				setIsMonitoredSettingPerEntrySupported(IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_GRACE_PERIOD_SUPPORTED:
				setIsGracePeriodSupported(IS_GRACE_PERIOD_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_TARGET_TYPES:
				return supportedTargetTypes != null && !supportedTargetTypes.isEmpty();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_PRINCIPAL_TYPES:
				return supportedPrincipalTypes != null && !supportedPrincipalTypes.isEmpty();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__CONFLICTING_ENTRIES_USAGE:
				return CONFLICTING_ENTRIES_USAGE_EDEFAULT == null ? conflictingEntriesUsage != null : !CONFLICTING_ENTRIES_USAGE_EDEFAULT.equals(conflictingEntriesUsage);
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__SUPPORTED_RESOURCE_TYPES:
				return supportedResourceTypes != null && !supportedResourceTypes.isEmpty();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__DEFAULT_SUPPORTED:
				return defaultSupported != null && !defaultSupported.isEmpty();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED:
				return IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT == null ? isActiveSettingPerEntrySupported != null : !IS_ACTIVE_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT.equals(isActiveSettingPerEntrySupported);
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED:
				return IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT == null ? isMonitoredSettingPerEntrySupported != null : !IS_MONITORED_SETTING_PER_ENTRY_SUPPORTED_EDEFAULT.equals(isMonitoredSettingPerEntrySupported);
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES__IS_GRACE_PERIOD_SUPPORTED:
				return IS_GRACE_PERIOD_SUPPORTED_EDEFAULT == null ? isGracePeriodSupported != null : !IS_GRACE_PERIOD_SUPPORTED_EDEFAULT.equals(isGracePeriodSupported);
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
		result.append(" (SupportedTargetTypes: ");
		result.append(supportedTargetTypes);
		result.append(", SupportedPrincipalTypes: ");
		result.append(supportedPrincipalTypes);
		result.append(", ConflictingEntriesUsage: ");
		result.append(conflictingEntriesUsage);
		result.append(", SupportedResourceTypes: ");
		result.append(supportedResourceTypes);
		result.append(", DefaultSupported: ");
		result.append(defaultSupported);
		result.append(", IsActiveSettingPerEntrySupported: ");
		result.append(isActiveSettingPerEntrySupported);
		result.append(", IsMonitoredSettingPerEntrySupported: ");
		result.append(isMonitoredSettingPerEntrySupported);
		result.append(", IsGracePeriodSupported: ");
		result.append(isGracePeriodSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_FSQuotaCapabilitiesImpl
