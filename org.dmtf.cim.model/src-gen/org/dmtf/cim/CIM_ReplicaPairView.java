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
 * A representation of the model object '<em><b>CIM Replica Pair View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ReplicaView instance is a view that is derived from a source and target CIM_StorageVolume (or CIM_LogicalDisk) and a CIM_StorageSynchronized association between them.
 * CIM_ElementView may associate CIM_ReplicaPairView to its underlying elements (regardless of whether or not they are instantiated).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceSystemCreationClassName <em>SV Source System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceSystemName <em>SV Source System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceCreationClassName <em>SV Source Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDeviceID <em>SV Source Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceName <em>SV Source Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNameFormat <em>SV Source Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNameNamespace <em>SV Source Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceExtentStatus <em>SV Source Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceOperationalStatus <em>SV Source Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceBlockSize <em>SV Source Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNumberOfBlocks <em>SV Source Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceConsumableBlocks <em>SV Source Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourcePrimordial <em>SV Source Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceIsBasedOnUnderlyingRedundancy <em>SV Source Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNoSinglePointOfFailure <em>SV Source No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDataRedundancy <em>SV Source Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourcePackageRedundancy <em>SV Source Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDeltaReservation <em>SV Source Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceExtentDiscriminator <em>SV Source Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceOtherIdentifyingInfo <em>SV Source Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceIdentifyingDescriptions <em>SV Source Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceElementName <em>SV Source Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceUsage <em>SV Source Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceOtherUsageDescription <em>SV Source Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceClientSettableUsage <em>SV Source Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSWhenSynced <em>SS When Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncMaintained <em>SS Sync Maintained</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSCopyType <em>SS Copy Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncState <em>SS Sync State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSCopyPriority <em>SS Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncType <em>SS Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSMode <em>SS Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSSProgressStatus <em>SS Progress Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetSystemCreationClassName <em>SV Target System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetSystemName <em>SV Target System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetCreationClassName <em>SV Target Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDeviceID <em>SV Target Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetName <em>SV Target Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNameFormat <em>SV Target Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNameNamespace <em>SV Target Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetExtentStatus <em>SV Target Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetOperationalStatus <em>SV Target Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetBlockSize <em>SV Target Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNumberOfBlocks <em>SV Target Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetConsumableBlocks <em>SV Target Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetPrimordial <em>SV Target Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetIsBasedOnUnderlyingRedundancy <em>SV Target Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNoSinglePointOfFailure <em>SV Target No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDataRedundancy <em>SV Target Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetPackageRedundancy <em>SV Target Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDeltaReservation <em>SV Target Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetExtentDiscriminator <em>SV Target Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetOtherIdentifyingInfo <em>SV Target Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetIdentifyingDescriptions <em>SV Target Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetElementName <em>SV Target Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetUsage <em>SV Target Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetOtherUsageDescription <em>SV Target Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetClientSettableUsage <em>SV Target Client Settable Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Views' keys='SVTargetSystemCreationClassName,SVTargetSystemName,SVTargetCreationClassName,SVTargetDeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicaPairView extends CIM_LogicalDeviceView {
	/**
	 * Returns the value of the '<em><b>SV Source System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the source StorageVolume as reported in the underlying source StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source System Creation Class Name</em>' attribute.
	 * @see #setSVSourceSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSVSourceSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceSystemCreationClassName <em>SV Source System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source System Creation Class Name</em>' attribute.
	 * @see #getSVSourceSystemCreationClassName()
	 * @generated
	 */
	void setSVSourceSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV Source System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the source StorageVolume as reported in the underlying source StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source System Name</em>' attribute.
	 * @see #setSVSourceSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.SystemName\"]'"
	 * @generated
	 */
	String getSVSourceSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceSystemName <em>SV Source System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source System Name</em>' attribute.
	 * @see #getSVSourceSystemName()
	 * @generated
	 */
	void setSVSourceSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the source StorageVolume as reported in the underlying source StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Creation Class Name</em>' attribute.
	 * @see #setSVSourceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.CreationClassName\"]'"
	 * @generated
	 */
	String getSVSourceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceCreationClassName <em>SV Source Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Creation Class Name</em>' attribute.
	 * @see #getSVSourceCreationClassName()
	 * @generated
	 */
	void setSVSourceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier of the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Device ID</em>' attribute.
	 * @see #setSVSourceDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.DeviceID\"]'"
	 * @generated
	 */
	String getSVSourceDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDeviceID <em>SV Source Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Device ID</em>' attribute.
	 * @see #getSVSourceDeviceID()
	 * @generated
	 */
	void setSVSourceDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Name</em>' attribute.
	 * @see #setSVSourceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.Name\"]'"
	 * @generated
	 */
	String getSVSourceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceName <em>SV Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Name</em>' attribute.
	 * @see #getSVSourceName()
	 * @generated
	 */
	void setSVSourceName(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the identifier for the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Name Format</em>' attribute.
	 * @see #setSVSourceNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameFormat\"]'"
	 * @generated
	 */
	Integer getSVSourceNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNameFormat <em>SV Source Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Name Format</em>' attribute.
	 * @see #getSVSourceNameFormat()
	 * @generated
	 */
	void setSVSourceNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NameNamespace as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Name Namespace</em>' attribute.
	 * @see #setSVSourceNameNamespace(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameNamespace\"]'"
	 * @generated
	 */
	Integer getSVSourceNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNameNamespace <em>SV Source Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Name Namespace</em>' attribute.
	 * @see #getSVSourceNameNamespace()
	 * @generated
	 */
	void setSVSourceNameNamespace(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Extent Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStatus as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Extent Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceExtentStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVSourceExtentStatus();

	/**
	 * Returns the value of the '<em><b>SV Source Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVSourceOperationalStatus();

	/**
	 * Returns the value of the '<em><b>SV Source Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BlockSize for the source StorageVolume as reported in the underlying source StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Block Size</em>' attribute.
	 * @see #setSVSourceBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.BlockSize\"]'"
	 * @generated
	 */
	Long getSVSourceBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceBlockSize <em>SV Source Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Block Size</em>' attribute.
	 * @see #getSVSourceBlockSize()
	 * @generated
	 */
	void setSVSourceBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>SV Source Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of blocks that make up the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Number Of Blocks</em>' attribute.
	 * @see #setSVSourceNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceNumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getSVSourceNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNumberOfBlocks <em>SV Source Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Number Of Blocks</em>' attribute.
	 * @see #getSVSourceNumberOfBlocks()
	 * @generated
	 */
	void setSVSourceNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Source Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of usable blocks in the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Consumable Blocks</em>' attribute.
	 * @see #setSVSourceConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.ConsumableBlocks\"]'"
	 * @generated
	 */
	Long getSVSourceConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceConsumableBlocks <em>SV Source Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Consumable Blocks</em>' attribute.
	 * @see #getSVSourceConsumableBlocks()
	 * @generated
	 */
	void setSVSourceConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Source Primordial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Primordial property for the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Primordial</em>' attribute.
	 * @see #setSVSourcePrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourcePrimordial()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.Primordial\"]'"
	 * @generated
	 */
	Boolean getSVSourcePrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourcePrimordial <em>SV Source Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Primordial</em>' attribute.
	 * @see #getSVSourcePrimordial()
	 * @generated
	 */
	void setSVSourcePrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Source Is Based On Underlying Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not redundancy is supported for the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Is Based On Underlying Redundancy</em>' attribute.
	 * @see #setSVSourceIsBasedOnUnderlyingRedundancy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceIsBasedOnUnderlyingRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.IsBasedOnUnderlyingRedundancy\"]'"
	 * @generated
	 */
	Boolean getSVSourceIsBasedOnUnderlyingRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceIsBasedOnUnderlyingRedundancy <em>SV Source Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Is Based On Underlying Redundancy</em>' attribute.
	 * @see #getSVSourceIsBasedOnUnderlyingRedundancy()
	 * @generated
	 */
	void setSVSourceIsBasedOnUnderlyingRedundancy(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Source No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not NoSinglePointOfFailure is supported for the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source No Single Point Of Failure</em>' attribute.
	 * @see #setSVSourceNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceNoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getSVSourceNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceNoSinglePointOfFailure <em>SV Source No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source No Single Point Of Failure</em>' attribute.
	 * @see #getSVSourceNoSinglePointOfFailure()
	 * @generated
	 */
	void setSVSourceNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Source Data Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancy supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Data Redundancy</em>' attribute.
	 * @see #setSVSourceDataRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceDataRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.DataRedundancy\"]'"
	 * @generated
	 */
	Integer getSVSourceDataRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDataRedundancy <em>SV Source Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Data Redundancy</em>' attribute.
	 * @see #getSVSourceDataRedundancy()
	 * @generated
	 */
	void setSVSourceDataRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Package Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancy supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Package Redundancy</em>' attribute.
	 * @see #setSVSourcePackageRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourcePackageRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.PackageRedundancy\"]'"
	 * @generated
	 */
	Integer getSVSourcePackageRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourcePackageRedundancy <em>SV Source Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Package Redundancy</em>' attribute.
	 * @see #getSVSourcePackageRedundancy()
	 * @generated
	 */
	void setSVSourcePackageRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Delta Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeltaReservation supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Delta Reservation</em>' attribute.
	 * @see #setSVSourceDeltaReservation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceDeltaReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ModelCorrespondence='[\"CIM_StorageVolume.DeltaReservation\"]'"
	 * @generated
	 */
	Integer getSVSourceDeltaReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceDeltaReservation <em>SV Source Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Delta Reservation</em>' attribute.
	 * @see #getSVSourceDeltaReservation()
	 * @generated
	 */
	void setSVSourceDeltaReservation(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Extent Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentDiscriminator property for the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Extent Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceExtentDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentDiscriminator\"]'"
	 * @generated
	 */
	EList<String> getSVSourceExtentDiscriminator();

	/**
	 * Returns the value of the '<em><b>SV Source Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers for the source StorageVolume (or LogicalDisk) as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceOtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getSVSourceOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>SV Source Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the other identifiers for the source StorageVolume (or LogicalDisk) as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceIdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getSVSourceIdentifyingDescriptions();

	/**
	 * Returns the value of the '<em><b>SV Source Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user friendly name for the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Element Name</em>' attribute.
	 * @see #setSVSourceElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.ElementName\"]'"
	 * @generated
	 */
	String getSVSourceElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceElementName <em>SV Source Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Element Name</em>' attribute.
	 * @see #getSVSourceElementName()
	 * @generated
	 */
	void setSVSourceElementName(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Usage</em>' attribute.
	 * @see #setSVSourceUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.Usage\"]'"
	 * @generated
	 */
	Integer getSVSourceUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceUsage <em>SV Source Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Usage</em>' attribute.
	 * @see #getSVSourceUsage()
	 * @generated
	 */
	void setSVSourceUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Source Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherUsageDescription supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Other Usage Description</em>' attribute.
	 * @see #setSVSourceOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceOtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.OtherUsageDescription\"]'"
	 * @generated
	 */
	String getSVSourceOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVSourceOtherUsageDescription <em>SV Source Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Source Other Usage Description</em>' attribute.
	 * @see #getSVSourceOtherUsageDescription()
	 * @generated
	 */
	void setSVSourceOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>SV Source Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettableUsage supported by the volume as reported in the underlying source StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Source Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVSourceClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ClientSettableUsage\"]'"
	 * @generated
	 */
	EList<Integer> getSVSourceClientSettableUsage();

	/**
	 * Returns the value of the '<em><b>SS When Synced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The WhenSynced on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS When Synced</em>' attribute.
	 * @see #setSSWhenSynced(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSWhenSynced()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_StorageSynchronized.WhenSynced\"]'"
	 * @generated
	 */
	String getSSWhenSynced();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSWhenSynced <em>SS When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS When Synced</em>' attribute.
	 * @see #getSSWhenSynced()
	 * @generated
	 */
	void setSSWhenSynced(String value);

	/**
	 * Returns the value of the '<em><b>SS Sync Maintained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SyncMaintained on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Sync Maintained</em>' attribute.
	 * @see #setSSSyncMaintained(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSSyncMaintained()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageSynchronized.SyncMaintained\"]'"
	 * @generated
	 */
	Boolean getSSSyncMaintained();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncMaintained <em>SS Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Sync Maintained</em>' attribute.
	 * @see #getSSSyncMaintained()
	 * @generated
	 */
	void setSSSyncMaintained(Boolean value);

	/**
	 * Returns the value of the '<em><b>SS Copy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CopyType on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Copy Type</em>' attribute.
	 * @see #setSSCopyType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSCopyType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.CopyType\"]'"
	 * @generated
	 */
	Integer getSSCopyType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSCopyType <em>SS Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Copy Type</em>' attribute.
	 * @see #getSSCopyType()
	 * @generated
	 */
	void setSSCopyType(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Sync State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SyncState on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Sync State</em>' attribute.
	 * @see #setSSSyncState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSSyncState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.SyncState\"]'"
	 * @generated
	 */
	Integer getSSSyncState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncState <em>SS Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Sync State</em>' attribute.
	 * @see #getSSSyncState()
	 * @generated
	 */
	void setSSSyncState(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Copy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CopyPriority on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Copy Priority</em>' attribute.
	 * @see #setSSCopyPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSCopyPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.CopyPriority\"]'"
	 * @generated
	 */
	Integer getSSCopyPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSCopyPriority <em>SS Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Copy Priority</em>' attribute.
	 * @see #getSSCopyPriority()
	 * @generated
	 */
	void setSSCopyPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Sync Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SyncType on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Sync Type</em>' attribute.
	 * @see #setSSSyncType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSSyncType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.SyncType\"]'"
	 * @generated
	 */
	Integer getSSSyncType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSSyncType <em>SS Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Sync Type</em>' attribute.
	 * @see #getSSSyncType()
	 * @generated
	 */
	void setSSSyncType(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Mode on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Mode</em>' attribute.
	 * @see #setSSMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.Mode\"]'"
	 * @generated
	 */
	Integer getSSMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSMode <em>SS Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Mode</em>' attribute.
	 * @see #getSSMode()
	 * @generated
	 */
	void setSSMode(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Progress Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ProgressStatus on the StorageSynchronized association between the underlying source and target StorageVolumes (or LogicalDisks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Progress Status</em>' attribute.
	 * @see #setSSProgressStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SSProgressStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSynchronized.ProgressStatus\"]'"
	 * @generated
	 */
	Integer getSSProgressStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSSProgressStatus <em>SS Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Progress Status</em>' attribute.
	 * @see #getSSProgressStatus()
	 * @generated
	 */
	void setSSProgressStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the target StorageVolume as reported in the underlying target StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target System Creation Class Name</em>' attribute.
	 * @see #setSVTargetSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSVTargetSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetSystemCreationClassName <em>SV Target System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target System Creation Class Name</em>' attribute.
	 * @see #getSVTargetSystemCreationClassName()
	 * @generated
	 */
	void setSVTargetSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV Target System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the target StorageVolume as reported in the underlying target StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target System Name</em>' attribute.
	 * @see #setSVTargetSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.SystemName\"]'"
	 * @generated
	 */
	String getSVTargetSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetSystemName <em>SV Target System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target System Name</em>' attribute.
	 * @see #getSVTargetSystemName()
	 * @generated
	 */
	void setSVTargetSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the target StorageVolume as reported in the underlying target StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Creation Class Name</em>' attribute.
	 * @see #setSVTargetCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.CreationClassName\"]'"
	 * @generated
	 */
	String getSVTargetCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetCreationClassName <em>SV Target Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Creation Class Name</em>' attribute.
	 * @see #getSVTargetCreationClassName()
	 * @generated
	 */
	void setSVTargetCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier of the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Device ID</em>' attribute.
	 * @see #setSVTargetDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.DeviceID\"]'"
	 * @generated
	 */
	String getSVTargetDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDeviceID <em>SV Target Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Device ID</em>' attribute.
	 * @see #getSVTargetDeviceID()
	 * @generated
	 */
	void setSVTargetDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Name</em>' attribute.
	 * @see #setSVTargetName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.Name\"]'"
	 * @generated
	 */
	String getSVTargetName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetName <em>SV Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Name</em>' attribute.
	 * @see #getSVTargetName()
	 * @generated
	 */
	void setSVTargetName(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the identifier for the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Name Format</em>' attribute.
	 * @see #setSVTargetNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameFormat\"]'"
	 * @generated
	 */
	Integer getSVTargetNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNameFormat <em>SV Target Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Name Format</em>' attribute.
	 * @see #getSVTargetNameFormat()
	 * @generated
	 */
	void setSVTargetNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NameNamespace as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Name Namespace</em>' attribute.
	 * @see #setSVTargetNameNamespace(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameNamespace\"]'"
	 * @generated
	 */
	Integer getSVTargetNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNameNamespace <em>SV Target Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Name Namespace</em>' attribute.
	 * @see #getSVTargetNameNamespace()
	 * @generated
	 */
	void setSVTargetNameNamespace(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Extent Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStatus as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Extent Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetExtentStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVTargetExtentStatus();

	/**
	 * Returns the value of the '<em><b>SV Target Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVTargetOperationalStatus();

	/**
	 * Returns the value of the '<em><b>SV Target Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BlockSize for the target StorageVolume as reported in the underlying target StorageVolume instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Block Size</em>' attribute.
	 * @see #setSVTargetBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.BlockSize\"]'"
	 * @generated
	 */
	Long getSVTargetBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetBlockSize <em>SV Target Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Block Size</em>' attribute.
	 * @see #getSVTargetBlockSize()
	 * @generated
	 */
	void setSVTargetBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>SV Target Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of blocks that make up the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Number Of Blocks</em>' attribute.
	 * @see #setSVTargetNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetNumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getSVTargetNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNumberOfBlocks <em>SV Target Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Number Of Blocks</em>' attribute.
	 * @see #getSVTargetNumberOfBlocks()
	 * @generated
	 */
	void setSVTargetNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Target Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of usable blocks in the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Consumable Blocks</em>' attribute.
	 * @see #setSVTargetConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.ConsumableBlocks\"]'"
	 * @generated
	 */
	Long getSVTargetConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetConsumableBlocks <em>SV Target Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Consumable Blocks</em>' attribute.
	 * @see #getSVTargetConsumableBlocks()
	 * @generated
	 */
	void setSVTargetConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Target Primordial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Primordial property for the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Primordial</em>' attribute.
	 * @see #setSVTargetPrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetPrimordial()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.Primordial\"]'"
	 * @generated
	 */
	Boolean getSVTargetPrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetPrimordial <em>SV Target Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Primordial</em>' attribute.
	 * @see #getSVTargetPrimordial()
	 * @generated
	 */
	void setSVTargetPrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Target Is Based On Underlying Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not redundancy is supported for the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Is Based On Underlying Redundancy</em>' attribute.
	 * @see #setSVTargetIsBasedOnUnderlyingRedundancy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetIsBasedOnUnderlyingRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.IsBasedOnUnderlyingRedundancy\"]'"
	 * @generated
	 */
	Boolean getSVTargetIsBasedOnUnderlyingRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetIsBasedOnUnderlyingRedundancy <em>SV Target Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Is Based On Underlying Redundancy</em>' attribute.
	 * @see #getSVTargetIsBasedOnUnderlyingRedundancy()
	 * @generated
	 */
	void setSVTargetIsBasedOnUnderlyingRedundancy(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Target No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not NoSinglePointOfFailure is supported for the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target No Single Point Of Failure</em>' attribute.
	 * @see #setSVTargetNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetNoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getSVTargetNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetNoSinglePointOfFailure <em>SV Target No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target No Single Point Of Failure</em>' attribute.
	 * @see #getSVTargetNoSinglePointOfFailure()
	 * @generated
	 */
	void setSVTargetNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Target Data Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancy supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Data Redundancy</em>' attribute.
	 * @see #setSVTargetDataRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetDataRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.DataRedundancy\"]'"
	 * @generated
	 */
	Integer getSVTargetDataRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDataRedundancy <em>SV Target Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Data Redundancy</em>' attribute.
	 * @see #getSVTargetDataRedundancy()
	 * @generated
	 */
	void setSVTargetDataRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Package Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancy supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Package Redundancy</em>' attribute.
	 * @see #setSVTargetPackageRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetPackageRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.PackageRedundancy\"]'"
	 * @generated
	 */
	Integer getSVTargetPackageRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetPackageRedundancy <em>SV Target Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Package Redundancy</em>' attribute.
	 * @see #getSVTargetPackageRedundancy()
	 * @generated
	 */
	void setSVTargetPackageRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Delta Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeltaReservation supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Delta Reservation</em>' attribute.
	 * @see #setSVTargetDeltaReservation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetDeltaReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ModelCorrespondence='[\"CIM_StorageVolume.DeltaReservation\"]'"
	 * @generated
	 */
	Integer getSVTargetDeltaReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetDeltaReservation <em>SV Target Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Delta Reservation</em>' attribute.
	 * @see #getSVTargetDeltaReservation()
	 * @generated
	 */
	void setSVTargetDeltaReservation(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Extent Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentDiscriminatorl property for the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Extent Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetExtentDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentDiscriminator\"]'"
	 * @generated
	 */
	EList<String> getSVTargetExtentDiscriminator();

	/**
	 * Returns the value of the '<em><b>SV Target Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers for the target StorageVolume (or LogicalDisk) as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetOtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getSVTargetOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>SV Target Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the other identifiers for the target StorageVolume (or LogicalDisk) as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetIdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getSVTargetIdentifyingDescriptions();

	/**
	 * Returns the value of the '<em><b>SV Target Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user friendly name for the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Element Name</em>' attribute.
	 * @see #setSVTargetElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.ElementName\"]'"
	 * @generated
	 */
	String getSVTargetElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetElementName <em>SV Target Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Element Name</em>' attribute.
	 * @see #getSVTargetElementName()
	 * @generated
	 */
	void setSVTargetElementName(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Usage</em>' attribute.
	 * @see #setSVTargetUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.Usage\"]'"
	 * @generated
	 */
	Integer getSVTargetUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetUsage <em>SV Target Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Usage</em>' attribute.
	 * @see #getSVTargetUsage()
	 * @generated
	 */
	void setSVTargetUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Target Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherUsageDescription supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Other Usage Description</em>' attribute.
	 * @see #setSVTargetOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetOtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.OtherUsageDescription\"]'"
	 * @generated
	 */
	String getSVTargetOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicaPairView#getSVTargetOtherUsageDescription <em>SV Target Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Target Other Usage Description</em>' attribute.
	 * @see #getSVTargetOtherUsageDescription()
	 * @generated
	 */
	void setSVTargetOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>SV Target Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettableUsage supported by the volume as reported in the underlying target StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Target Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPairView_SVTargetClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ClientSettableUsage\"]'"
	 * @generated
	 */
	EList<Integer> getSVTargetClientSettableUsage();

} // CIM_ReplicaPairView
