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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM FS Quota Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The capabilities of the FSQuotaManagementService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getSupportedTargetTypes <em>Supported Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getSupportedPrincipalTypes <em>Supported Principal Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getConflictingEntriesUsage <em>Conflicting Entries Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getSupportedResourceTypes <em>Supported Resource Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getDefaultSupported <em>Default Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsActiveSettingPerEntrySupported <em>Is Active Setting Per Entry Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsMonitoredSettingPerEntrySupported <em>Is Monitored Setting Per Entry Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsGracePeriodSupported <em>Is Grace Period Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Target Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container types supported by the quota management service. This indicates which managed element a quota may be placed upon. Note that tree quotas are placed on pathnames within a container. In other words, a tree quota limits the amount of resource that all the objects on a given directory path and all of its children may consume. If this array is empty or NULL, quotas cannot be managed on the device, and all attempted operations MUST return an error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Target Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_SupportedTargetTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"ManagedElement\",\"Filesystem\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedTargetTypes();

	/**
	 * Returns the value of the '<em><b>Supported Principal Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of Principal that are supported by the quota management service. While a tree is not strictly speaking a principal--it is a directory in a filesystem, possibly the root--it is still an entity that a quota may be set upon, so it is included here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Principal Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_SupportedPrincipalTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"User\",\"Group\",\"Tree\",\"User-tree\",\"Group-tree\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedPrincipalTypes();

	/**
	 * Returns the value of the '<em><b>Conflicting Entries Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When two conflicting QuotaEntry instances-meaning they both target the same ManagedElement, tree and principal--are submitted to the system, several behaviors are possible. The system may ignore all settings after the first. It may overwrite the prior setting, meaning the last write wins. It may reject duplicates with an error. This property specifies which behavior this quota management service has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conflicting Entries Usage</em>' attribute.
	 * @see #setConflictingEntriesUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_ConflictingEntriesUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"UseFirst\",\"UseLast\",\"Reject\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getConflictingEntriesUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getConflictingEntriesUsage <em>Conflicting Entries Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflicting Entries Usage</em>' attribute.
	 * @see #getConflictingEntriesUsage()
	 * @generated
	 */
	void setConflictingEntriesUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Resource Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing all the resource types which the system supports setting quotas on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Resource Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_SupportedResourceTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Bytes\",\"Files\",\"Directories\",\"Files+Directories\",\"Inodes\",\"Blocks\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedResourceTypes();

	/**
	 * Returns the value of the '<em><b>Default Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array that indicates which principal types may have default quotas set upon them by the FSQuotaManagementService. Possible values are the same as for SupportedResourceTypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_DefaultSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"User\",\"Group\",\"Tree\",\"User-tree\",\"Group-tree\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getDefaultSupported();

	/**
	 * Returns the value of the '<em><b>Is Active Setting Per Entry Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether quotas may be made active or inactive per entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active Setting Per Entry Supported</em>' attribute.
	 * @see #setIsActiveSettingPerEntrySupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_IsActiveSettingPerEntrySupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsActiveSettingPerEntrySupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsActiveSettingPerEntrySupported <em>Is Active Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active Setting Per Entry Supported</em>' attribute.
	 * @see #getIsActiveSettingPerEntrySupported()
	 * @generated
	 */
	void setIsActiveSettingPerEntrySupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Monitored Setting Per Entry Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether quota monitoring may be turned on and off per entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Monitored Setting Per Entry Supported</em>' attribute.
	 * @see #setIsMonitoredSettingPerEntrySupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_IsMonitoredSettingPerEntrySupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsMonitoredSettingPerEntrySupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsMonitoredSettingPerEntrySupported <em>Is Monitored Setting Per Entry Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Monitored Setting Per Entry Supported</em>' attribute.
	 * @see #getIsMonitoredSettingPerEntrySupported()
	 * @generated
	 */
	void setIsMonitoredSettingPerEntrySupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Grace Period Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a grace period may be set on a quota. If it can, then crossing over a soft threshold for more than the period of time specified in the grace period effectively converts the soft threshold to a hard limit, cutting off further allocation of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Grace Period Supported</em>' attribute.
	 * @see #setIsGracePeriodSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaCapabilities_IsGracePeriodSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsGracePeriodSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSQuotaCapabilities#getIsGracePeriodSupported <em>Is Grace Period Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Grace Period Supported</em>' attribute.
	 * @see #getIsGracePeriodSupported()
	 * @generated
	 */
	void setIsGracePeriodSupported(Boolean value);

} // CIM_FSQuotaCapabilities
