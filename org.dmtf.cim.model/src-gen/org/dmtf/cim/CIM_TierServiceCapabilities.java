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
 * A representation of the model object '<em><b>CIM Tier Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a TierService to manage storage tiers. An instance of TierServiceCapabilities is associated with a TierService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedFeatures <em>Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedStorageObjects <em>Supported Storage Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedStorageElements <em>Supported Storage Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedTierFeatures <em>Supported Tier Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedCompression <em>Supported Compression</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedDataMovement <em>Supported Data Movement</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierServiceCapabilities#getSupportedManualMovementProvisioning <em>Supported Manual Movement Provisioning</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TierServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported features of the storage tier service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"System Creates StorageTiers\",\"Client Can Create StorageTiers\",\"System Creates TierDomains\",\"Client Can Create TierDomains\",\"Supports SubLUN\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Storage Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported storage objects that can be used to form a storage tier.ComponentsOfStoragePool: In calling the method CreateStorageTier, it is possible to supply one or StoragePools and request the storage tiers to be created based on the "ConcreteComponents" of the StoragePools, i.e. StorageExtents. ElementsOfStoragePool: Storage tier is comprised of elements, e.g. volumes, allocated from a StoragePool. 
	 * External StoragePool: represents a storage capacity that is external to the ComputerSystem. 
	 * Primordial StorageExtent: represent storage extents that are directly associated to a disk drive and have an extent discriminator of "SNIA:DiskDrive".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Objects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedStorageObjects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"StorageVolume\",\"LogicalDisk\",\"StorageExtent\",\"StoragePool\",\"ComponentsOfStoragePool\",\"ElementsOfStoragePool\",\"External StoragePool\",\"Primordial StorageExtent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageObjects();

	/**
	 * Returns the value of the '<em><b>Supported Storage Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported storage elements that can be moved between storage tiers. DeviceMaskingGroup: All members of DeviceMaskingGroup are moved to the storage tiers with the same performance characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Elements</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedStorageElements()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"StorageVolume\",\"LogicalDisk\",\"DeviceMaskingGroup\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElements();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions properties then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"CreateStorageTier\",\"AddToStorageTier\",\"RemoveFromStorageTier\",\"CreateTierDomain\",\"DeleteTierDomain\",\"ModifyStorageTierDomainAssociation\",\"GetStorageTierCandidateObjects\",\"DeleteStorageTier\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierServiceCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed synchronously -- without the creation of a job. If an operation is included in both this property and SupportedAsynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"CreateStorageTier\",\"AddToStorageTier\",\"RemoveFromStorageTier\",\"CreateTierDomain\",\"DeleteTierDomain\",\"ModifyStorageTierDomainAssociation\",\"GetStorageTierCandidateObjects\",\"DeleteStorageTier\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierServiceCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Tier Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported features of the storage tiers. 
	 * Performance generally relates to the underlying technology, for example, Solid State versus Fibre Channel drives. QoS refers to the Quality of Service, for example, RAID protected versus unprotected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Tier Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedTierFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"StorageTiers Based On Performance Only\",\"StorageTiers Based On QoS Only\",\"StorageTiers Based On Performance and QoS\",\"StorageTiers Based On Other Characteristics\",\"StorageTiers Can Overlap\",\"StorageTiers Can Be Empty\",\"StorageTiers In Multiple TierDomains\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedTierFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Compression</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the Automated Storage Tiering subsystem has the capability to compress storage volumes that are subject to tiering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Compression</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedCompression()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"ThinlyProvisioned\",\"ThicklyProvisioned\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCompression();

	/**
	 * Returns the value of the '<em><b>Supported Data Movement</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the supported data movement choices that are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Data Movement</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedDataMovement()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Auto\",\"Manual\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierDomain.DataMovement\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedDataMovement();

	/**
	 * Returns the value of the '<em><b>Supported Manual Movement Provisioning</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the supported data movement choices that are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Manual Movement Provisioning</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierServiceCapabilities_SupportedManualMovementProvisioning()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"ThinlyProvisioned\",\"ThicklyProvisioned\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierDomain.DataMovement\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedManualMovementProvisioning();

} // CIM_TierServiceCapabilities
