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
 * A representation of the model object '<em><b>CIM Volume View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VolumeView instance is a view that is derived from CIM_StorageVolume, CIM_ElementSettingData, CIM_StorageSetting, CIM_AllocatedFromStoragePool and CIM_StoragePool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVSystemCreationClassName <em>SV System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVSystemName <em>SV System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVCreationClassName <em>SV Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVDeviceID <em>SV Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVName <em>SV Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVNameFormat <em>SV Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVNameNamespace <em>SV Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVExtentStatus <em>SV Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVOperationalStatus <em>SV Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVBlockSize <em>SV Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVNumberOfBlocks <em>SV Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVConsumableBlocks <em>SV Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVIsBasedOnUnderlyingRedundancy <em>SV Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVNoSinglePointOfFailure <em>SV No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVDataRedundancy <em>SV Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVPackageRedundancy <em>SV Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVDeltaReservation <em>SV Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVUsage <em>SV Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVOtherUsageDescription <em>SV Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVClientSettableUsage <em>SV Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSInstanceID <em>SS Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSElementName <em>SS Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSNoSinglePointOfFailure <em>SS No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyMin <em>SS Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyMax <em>SS Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyGoal <em>SS Data Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyMin <em>SS Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyMax <em>SS Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyGoal <em>SS Package Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSChangeableType <em>SS Changeable Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSPInstanceID <em>SP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSPPoolID <em>SP Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVOtherIdentifyingInfo <em>SV Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVIdentifyingDescriptions <em>SV Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVElementName <em>SV Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVPrimordial <em>SV Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVExtentDiscriminator <em>SV Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLength <em>SS Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLengthMin <em>SS Extent Stripe Length Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLengthMax <em>SS Extent Stripe Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSParityLayout <em>SS Parity Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepth <em>SS User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepthMin <em>SS User Data Stripe Depth Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepthMax <em>SS User Data Stripe Depth Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSStoragePoolInitialUsage <em>SS Storage Pool Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSSStorageExtentInitialUsage <em>SS Storage Extent Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeView#getSVIsComposite <em>SV Is Composite</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Device::Views' keys='SVSystemCreationClassName,SVSystemName,SVCreationClassName,SVDeviceID,SPInstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VolumeView extends CIM_LogicalDeviceView {
	/**
	 * Returns the value of the '<em><b>SV System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemCreationClassName for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (or LogicalDisk) instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV System Creation Class Name</em>' attribute.
	 * @see #setSVSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.SystemCreationClassName\",\"CIM_LogicalDisk.SystemCreationClassName\"]'"
	 * @generated
	 */
	String getSVSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVSystemCreationClassName <em>SV System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV System Creation Class Name</em>' attribute.
	 * @see #getSVSystemCreationClassName()
	 * @generated
	 */
	void setSVSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SystemName for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (LogicalDisk) instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV System Name</em>' attribute.
	 * @see #setSVSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.SystemName\",\"CIM_LogicalDisk.SystemName\"]'"
	 * @generated
	 */
	String getSVSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVSystemName <em>SV System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV System Name</em>' attribute.
	 * @see #getSVSystemName()
	 * @generated
	 */
	void setSVSystemName(String value);

	/**
	 * Returns the value of the '<em><b>SV Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (or LogicalDisk) instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Creation Class Name</em>' attribute.
	 * @see #setSVCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.CreationClassName\",\"CIM_LogicalDisk.CreationClassName\"]'"
	 * @generated
	 */
	String getSVCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVCreationClassName <em>SV Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Creation Class Name</em>' attribute.
	 * @see #getSVCreationClassName()
	 * @generated
	 */
	void setSVCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>SV Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier of the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Device ID</em>' attribute.
	 * @see #setSVDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StorageVolume.DeviceID\",\"CIM_LogicalDisk.DeviceID\"]'"
	 * @generated
	 */
	String getSVDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVDeviceID <em>SV Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Device ID</em>' attribute.
	 * @see #getSVDeviceID()
	 * @generated
	 */
	void setSVDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>SV Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Name</em>' attribute.
	 * @see #setSVName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.Name\",\"CIM_LogicalDisk.Name\"]'"
	 * @generated
	 */
	String getSVName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVName <em>SV Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Name</em>' attribute.
	 * @see #getSVName()
	 * @generated
	 */
	void setSVName(String value);

	/**
	 * Returns the value of the '<em><b>SV Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the identifier for the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Name Format</em>' attribute.
	 * @see #setSVNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameFormat\",\"CIM_LogicalDisk.NameFormat\"]'"
	 * @generated
	 */
	Integer getSVNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVNameFormat <em>SV Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Name Format</em>' attribute.
	 * @see #getSVNameFormat()
	 * @generated
	 */
	void setSVNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NameNamespace as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Name Namespace</em>' attribute.
	 * @see #setSVNameNamespace(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.NameNamespace\",\"CIM_LogicalDisk.NameNamespace\"]'"
	 * @generated
	 */
	Integer getSVNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVNameNamespace <em>SV Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Name Namespace</em>' attribute.
	 * @see #getSVNameNamespace()
	 * @generated
	 */
	void setSVNameNamespace(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Extent Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStatus as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Extent Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVExtentStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentStatus\",\"CIM_LogicalDisk.ExtentStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVExtentStatus();

	/**
	 * Returns the value of the '<em><b>SV Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OperationalStatus as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVOperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.OperationalStatus\",\"CIM_LogicalDisk.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getSVOperationalStatus();

	/**
	 * Returns the value of the '<em><b>SV Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BlockSize for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (or LogicalDisk) instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Block Size</em>' attribute.
	 * @see #setSVBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.BlockSize\",\"CIM_LogicalDisk.BlockSize\"]'"
	 * @generated
	 */
	Long getSVBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVBlockSize <em>SV Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Block Size</em>' attribute.
	 * @see #getSVBlockSize()
	 * @generated
	 */
	void setSVBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>SV Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of blocks that make up the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Number Of Blocks</em>' attribute.
	 * @see #setSVNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVNumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.NumberOfBlocks\",\"CIM_LogicalDisk.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getSVNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVNumberOfBlocks <em>SV Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Number Of Blocks</em>' attribute.
	 * @see #getSVNumberOfBlocks()
	 * @generated
	 */
	void setSVNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of usable blocks in the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Consumable Blocks</em>' attribute.
	 * @see #setSVConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageVolume.ConsumableBlocks\",\"CIM_LogicalDisk.ConsumableBlocks\"]'"
	 * @generated
	 */
	Long getSVConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVConsumableBlocks <em>SV Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Consumable Blocks</em>' attribute.
	 * @see #getSVConsumableBlocks()
	 * @generated
	 */
	void setSVConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>SV Is Based On Underlying Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not redundancy is supported for the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Is Based On Underlying Redundancy</em>' attribute.
	 * @see #setSVIsBasedOnUnderlyingRedundancy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVIsBasedOnUnderlyingRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSVIsBasedOnUnderlyingRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVIsBasedOnUnderlyingRedundancy <em>SV Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Is Based On Underlying Redundancy</em>' attribute.
	 * @see #getSVIsBasedOnUnderlyingRedundancy()
	 * @generated
	 */
	void setSVIsBasedOnUnderlyingRedundancy(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not NoSinglePointOfFailure is supported for the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV No Single Point Of Failure</em>' attribute.
	 * @see #setSVNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVNoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.NoSinglePointOfFailure\",\"CIM_LogicalDisk.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getSVNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVNoSinglePointOfFailure <em>SV No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV No Single Point Of Failure</em>' attribute.
	 * @see #getSVNoSinglePointOfFailure()
	 * @generated
	 */
	void setSVNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Data Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancy supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Data Redundancy</em>' attribute.
	 * @see #setSVDataRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVDataRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.DataRedundancy\",\"CIM_LogicalDisk.DataRedundancy\"]'"
	 * @generated
	 */
	Integer getSVDataRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVDataRedundancy <em>SV Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Data Redundancy</em>' attribute.
	 * @see #getSVDataRedundancy()
	 * @generated
	 */
	void setSVDataRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Package Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancy supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Package Redundancy</em>' attribute.
	 * @see #setSVPackageRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVPackageRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.PackageRedundancy\",\"CIM_LogicalDisk.PackageRedundancy\"]'"
	 * @generated
	 */
	Integer getSVPackageRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVPackageRedundancy <em>SV Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Package Redundancy</em>' attribute.
	 * @see #getSVPackageRedundancy()
	 * @generated
	 */
	void setSVPackageRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Delta Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeltaReservation supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Delta Reservation</em>' attribute.
	 * @see #setSVDeltaReservation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVDeltaReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ModelCorrespondence='[\"CIM_StorageVolume.DeltaReservation\",\"CIM_LogicalDisk.DeltaReservation\"]'"
	 * @generated
	 */
	Integer getSVDeltaReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVDeltaReservation <em>SV Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Delta Reservation</em>' attribute.
	 * @see #getSVDeltaReservation()
	 * @generated
	 */
	void setSVDeltaReservation(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Usage</em>' attribute.
	 * @see #setSVUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageVolume.Usage\",\"CIM_LogicalDisk.Usage\"]'"
	 * @generated
	 */
	Integer getSVUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVUsage <em>SV Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Usage</em>' attribute.
	 * @see #getSVUsage()
	 * @generated
	 */
	void setSVUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OtherUsageDescription supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Other Usage Description</em>' attribute.
	 * @see #setSVOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVOtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.OtherUsageDescription\",\"CIM_LogicalDisk.OtherUsageDescription\"]'"
	 * @generated
	 */
	String getSVOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVOtherUsageDescription <em>SV Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Other Usage Description</em>' attribute.
	 * @see #getSVOtherUsageDescription()
	 * @generated
	 */
	void setSVOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>SV Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ClientSettableUsage supported by the volume as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageVolume.ClientSettableUsage\",\"CIM_LogicalDisk.ClientSettableUsage\"]'"
	 * @generated
	 */
	EList<Integer> getSVClientSettableUsage();

	/**
	 * Returns the value of the '<em><b>SS Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Instance ID</em>' attribute.
	 * @see #setSSInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageSetting.InstanceID\"]'"
	 * @generated
	 */
	String getSSInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSInstanceID <em>SS Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Instance ID</em>' attribute.
	 * @see #getSSInstanceID()
	 * @generated
	 */
	void setSSInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SS Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementName of the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Element Name</em>' attribute.
	 * @see #setSSElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageSetting.ElementName\"]'"
	 * @generated
	 */
	String getSSElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSElementName <em>SS Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Element Name</em>' attribute.
	 * @see #getSSElementName()
	 * @generated
	 */
	void setSSElementName(String value);

	/**
	 * Returns the value of the '<em><b>SS No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not NoSinglePointOfFailure was requested in the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS No Single Point Of Failure</em>' attribute.
	 * @see #setSSNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSNoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageSetting.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getSSNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSNoSinglePointOfFailure <em>SS No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS No Single Point Of Failure</em>' attribute.
	 * @see #getSSNoSinglePointOfFailure()
	 * @generated
	 */
	void setSSNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>SS Data Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyMin value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Data Redundancy Min</em>' attribute.
	 * @see #setSSDataRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSDataRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyMin\"]'"
	 * @generated
	 */
	Integer getSSDataRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyMin <em>SS Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Data Redundancy Min</em>' attribute.
	 * @see #getSSDataRedundancyMin()
	 * @generated
	 */
	void setSSDataRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Data Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyMax value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Data Redundancy Max</em>' attribute.
	 * @see #setSSDataRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSDataRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyMax\"]'"
	 * @generated
	 */
	Integer getSSDataRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyMax <em>SS Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Data Redundancy Max</em>' attribute.
	 * @see #getSSDataRedundancyMax()
	 * @generated
	 */
	void setSSDataRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Data Redundancy Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataRedundancyGoal supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Data Redundancy Goal</em>' attribute.
	 * @see #setSSDataRedundancyGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSDataRedundancyGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getSSDataRedundancyGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSDataRedundancyGoal <em>SS Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Data Redundancy Goal</em>' attribute.
	 * @see #getSSDataRedundancyGoal()
	 * @generated
	 */
	void setSSDataRedundancyGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Package Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyMin value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Package Redundancy Min</em>' attribute.
	 * @see #setSSPackageRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSPackageRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyMin\"]'"
	 * @generated
	 */
	Integer getSSPackageRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyMin <em>SS Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Package Redundancy Min</em>' attribute.
	 * @see #getSSPackageRedundancyMin()
	 * @generated
	 */
	void setSSPackageRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Package Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyMax value supported by the StorageSetting for the volume as reported in the underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Package Redundancy Max</em>' attribute.
	 * @see #setSSPackageRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSPackageRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyMax\"]'"
	 * @generated
	 */
	Integer getSSPackageRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyMax <em>SS Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Package Redundancy Max</em>' attribute.
	 * @see #getSSPackageRedundancyMax()
	 * @generated
	 */
	void setSSPackageRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Package Redundancy Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PackageRedundancyGoal supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Package Redundancy Goal</em>' attribute.
	 * @see #setSSPackageRedundancyGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSPackageRedundancyGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getSSPackageRedundancyGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSPackageRedundancyGoal <em>SS Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Package Redundancy Goal</em>' attribute.
	 * @see #getSSPackageRedundancyGoal()
	 * @generated
	 */
	void setSSPackageRedundancyGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Changeable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChangeableType defined for the StorageSetting for the volume as reported in the underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Changeable Type</em>' attribute.
	 * @see #setSSChangeableType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSChangeableType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.ChangeableType\"]'"
	 * @generated
	 */
	Integer getSSChangeableType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSChangeableType <em>SS Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Changeable Type</em>' attribute.
	 * @see #getSSChangeableType()
	 * @generated
	 */
	void setSSChangeableType(Integer value);

	/**
	 * Returns the value of the '<em><b>AFSP Space Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SpaceConsumed from the StoragePool by the volume as reported in its underlying AllocatedFromStoragePool association to the StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #setAFSPSpaceConsumed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_AFSPSpaceConsumed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]'"
	 * @generated
	 */
	Long getAFSPSpaceConsumed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 */
	void setAFSPSpaceConsumed(Long value);

	/**
	 * Returns the value of the '<em><b>SP Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceID of the StoragePool for the volume as reported in the underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Instance ID</em>' attribute.
	 * @see #setSPInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SPInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' ModelCorrespondence='[\"CIM_StoragePool.InstanceID\"]'"
	 * @generated
	 */
	String getSPInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSPInstanceID <em>SP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Instance ID</em>' attribute.
	 * @see #getSPInstanceID()
	 * @generated
	 */
	void setSPInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>SP Pool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PoolID of the StoragePool for the volume as reported in the underlying StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SP Pool ID</em>' attribute.
	 * @see #setSPPoolID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SPPoolID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StoragePool.PoolID\"]'"
	 * @generated
	 */
	String getSPPoolID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSPPoolID <em>SP Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Pool ID</em>' attribute.
	 * @see #getSPPoolID()
	 * @generated
	 */
	void setSPPoolID(String value);

	/**
	 * Returns the value of the '<em><b>SV Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVOtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.OtherIdentifyingInfo\",\"CIM_LogicalDisk.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getSVOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>SV Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the other identifiers for the StorageVolume (or LogicalDisk) as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVIdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.IdentifyingDescriptions\",\"CIM_LogicalDisk.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getSVIdentifyingDescriptions();

	/**
	 * Returns the value of the '<em><b>SV Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user friendly name for the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Element Name</em>' attribute.
	 * @see #setSVElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageVolume.ElementName\",\"CIM_LogicalDisk.ElementName\"]'"
	 * @generated
	 */
	String getSVElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVElementName <em>SV Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Element Name</em>' attribute.
	 * @see #getSVElementName()
	 * @generated
	 */
	void setSVElementName(String value);

	/**
	 * Returns the value of the '<em><b>SV Primordial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Primordial property for the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Primordial</em>' attribute.
	 * @see #setSVPrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVPrimordial()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.Primordial\",\"CIM_LogicalDisk.Primordial\"]'"
	 * @generated
	 */
	Boolean getSVPrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVPrimordial <em>SV Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Primordial</em>' attribute.
	 * @see #getSVPrimordial()
	 * @generated
	 */
	void setSVPrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>SV Extent Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentDiscriminatorl property for the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Extent Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVExtentDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageVolume.ExtentDiscriminator\",\"CIM_LogicalDisk.ExtentDiscriminator\"]'"
	 * @generated
	 */
	EList<String> getSVExtentDiscriminator();

	/**
	 * Returns the value of the '<em><b>SS Extent Stripe Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStripeLength value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Extent Stripe Length</em>' attribute.
	 * @see #setSSExtentStripeLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSExtentStripeLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLength\"]'"
	 * @generated
	 */
	Integer getSSExtentStripeLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLength <em>SS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Extent Stripe Length</em>' attribute.
	 * @see #getSSExtentStripeLength()
	 * @generated
	 */
	void setSSExtentStripeLength(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Extent Stripe Length Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStripeLengthMin value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Extent Stripe Length Min</em>' attribute.
	 * @see #setSSExtentStripeLengthMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSExtentStripeLengthMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLengthMin\"]'"
	 * @generated
	 */
	Integer getSSExtentStripeLengthMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLengthMin <em>SS Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Extent Stripe Length Min</em>' attribute.
	 * @see #getSSExtentStripeLengthMin()
	 * @generated
	 */
	void setSSExtentStripeLengthMin(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Extent Stripe Length Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentStripeLengthMax supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Extent Stripe Length Max</em>' attribute.
	 * @see #setSSExtentStripeLengthMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSExtentStripeLengthMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLengthMax\"]'"
	 * @generated
	 */
	Integer getSSExtentStripeLengthMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSExtentStripeLengthMax <em>SS Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Extent Stripe Length Max</em>' attribute.
	 * @see #getSSExtentStripeLengthMax()
	 * @generated
	 */
	void setSSExtentStripeLengthMax(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Parity Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParityLayout defined by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Parity Layout</em>' attribute.
	 * @see #setSSParityLayout(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSParityLayout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.ParityLayout\"]'"
	 * @generated
	 */
	Integer getSSParityLayout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSParityLayout <em>SS Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Parity Layout</em>' attribute.
	 * @see #getSSParityLayout()
	 * @generated
	 */
	void setSSParityLayout(Integer value);

	/**
	 * Returns the value of the '<em><b>SS User Data Stripe Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UserDataStripeDepth value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS User Data Stripe Depth</em>' attribute.
	 * @see #setSSUserDataStripeDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSUserDataStripeDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepth\"]'"
	 * @generated
	 */
	Long getSSUserDataStripeDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepth <em>SS User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS User Data Stripe Depth</em>' attribute.
	 * @see #getSSUserDataStripeDepth()
	 * @generated
	 */
	void setSSUserDataStripeDepth(Long value);

	/**
	 * Returns the value of the '<em><b>SS User Data Stripe Depth Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UserDataStripeDepthMin value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS User Data Stripe Depth Min</em>' attribute.
	 * @see #setSSUserDataStripeDepthMin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSUserDataStripeDepthMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepthMin\"]'"
	 * @generated
	 */
	Long getSSUserDataStripeDepthMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepthMin <em>SS User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS User Data Stripe Depth Min</em>' attribute.
	 * @see #getSSUserDataStripeDepthMin()
	 * @generated
	 */
	void setSSUserDataStripeDepthMin(Long value);

	/**
	 * Returns the value of the '<em><b>SS User Data Stripe Depth Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UserDataStripeDepthMax value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS User Data Stripe Depth Max</em>' attribute.
	 * @see #setSSUserDataStripeDepthMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSUserDataStripeDepthMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepthMax\"]'"
	 * @generated
	 */
	Long getSSUserDataStripeDepthMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSUserDataStripeDepthMax <em>SS User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS User Data Stripe Depth Max</em>' attribute.
	 * @see #getSSUserDataStripeDepthMax()
	 * @generated
	 */
	void setSSUserDataStripeDepthMax(Long value);

	/**
	 * Returns the value of the '<em><b>SS Storage Pool Initial Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StoragePoolInitialUsage value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Storage Pool Initial Usage</em>' attribute.
	 * @see #setSSStoragePoolInitialUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSStoragePoolInitialUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.StoragePoolInitialUsage\"]'"
	 * @generated
	 */
	Integer getSSStoragePoolInitialUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSStoragePoolInitialUsage <em>SS Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Storage Pool Initial Usage</em>' attribute.
	 * @see #getSSStoragePoolInitialUsage()
	 * @generated
	 */
	void setSSStoragePoolInitialUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SS Storage Extent Initial Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StorageExtentInitialUsage value supported by the StorageSetting for the volume as reported in its underlying StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SS Storage Extent Initial Usage</em>' attribute.
	 * @see #setSSStorageExtentInitialUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SSStorageExtentInitialUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.StorageExtentInitialUsage\"]'"
	 * @generated
	 */
	Integer getSSStorageExtentInitialUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSSStorageExtentInitialUsage <em>SS Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Storage Extent Initial Usage</em>' attribute.
	 * @see #getSSStorageExtentInitialUsage()
	 * @generated
	 */
	void setSSStorageExtentInitialUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>SV Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IsComposite property as reported in the underlying StorageVolume (or LogicalDisk).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Is Composite</em>' attribute.
	 * @see #setSVIsComposite(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeView_SVIsComposite()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageVolume.IsComposite\",\"CIM_LogicalDisk.IsComposite\"]'"
	 * @generated
	 */
	Boolean getSVIsComposite();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeView#getSVIsComposite <em>SV Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Is Composite</em>' attribute.
	 * @see #getSVIsComposite()
	 * @generated
	 */
	void setSVIsComposite(Boolean value);

} // CIM_VolumeView
