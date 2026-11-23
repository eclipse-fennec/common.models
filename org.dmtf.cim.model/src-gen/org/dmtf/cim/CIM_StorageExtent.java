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
 * A representation of the model object '<em><b>CIM Storage Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageExtent describes the capabilities and management of the various media that exist to store data and allow data retrieval. This superclass could be used to represent the various components of RAID (Hardware or Software) or as a raw logical extent on top of physical media.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getDataOrganization <em>Data Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getErrorMethodology <em>Error Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getNumberOfBlocks <em>Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getConsumableBlocks <em>Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getIsBasedOnUnderlyingRedundancy <em>Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getSequentialAccess <em>Sequential Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getExtentStatus <em>Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getDataRedundancy <em>Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getPackageRedundancy <em>Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getDeltaReservation <em>Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getPrimordial <em>Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getNameNamespace <em>Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getOtherNameNamespace <em>Other Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getOtherNameFormat <em>Other Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getClientSettableUsage <em>Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getCompressionRate <em>Compression Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getCompressionState <em>Compression State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getExtentDiscriminator <em>Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getExtentInterleaveDepth <em>Extent Interleave Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getExtentStripeLength <em>Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getIsCompressed <em>Is Compressed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getIsConcatenated <em>Is Concatenated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageExtent#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::StorageExtent' override.Name='string' override.Name.Description='A unique identifier for the Extent.' override.Name.MappingStrings='[\"SPC.INCITS-T10| VPD 83, Association 0 | Identifier\"]' override.Name.ModelCorrespondence='[\"CIM_StorageExtent.NameFormat\",\"CIM_StorageExtent.NameNamespace\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageExtent extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Data Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of data organization used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Organization</em>' attribute.
	 * @see #setDataOrganization(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_DataOrganization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Fixed Block\",\"Variable Block\",\"Count Key Data\"]'"
	 * @generated
	 */
	Integer getDataOrganization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getDataOrganization <em>Data Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Organization</em>' attribute.
	 * @see #getDataOrganization()
	 * @generated
	 */
	void setDataOrganization(Integer value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string describing the media and/or its use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_Purpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrStorageDescr\"]'"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_Access()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Readable\",\"Writeable\",\"Read/Write Supported\",\"Write Once\"]'"
	 * @generated
	 */
	Integer getAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Methodology</em>' attribute.
	 * @see #setErrorMethodology(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ErrorMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getErrorMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getErrorMethodology <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Methodology</em>' attribute.
	 * @see #getErrorMethodology()
	 * @generated
	 */
	void setErrorMethodology(String value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_BlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Host Storage|001.4\",\"MIB.IETF|HOST-RESOURCES-MIB.hrStorageAllocationUnits\",\"MIF.DMTF|Storage Devices|001.5\"]'"
	 * @generated
	 */
	Long getBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #setNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_NumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Host Storage|001.5\",\"MIB.IETF|HOST-RESOURCES-MIB.hrStorageSize\"]'"
	 * @generated
	 */
	Long getNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getNumberOfBlocks <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #getNumberOfBlocks()
	 * @generated
	 */
	void setNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumable Blocks</em>' attribute.
	 * @see #setConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getConsumableBlocks <em>Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumable Blocks</em>' attribute.
	 * @see #getConsumableBlocks()
	 * @generated
	 */
	void setConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Is Based On Underlying Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Based On Underlying Redundancy</em>' attribute.
	 * @see #setIsBasedOnUnderlyingRedundancy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_IsBasedOnUnderlyingRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsBasedOnUnderlyingRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getIsBasedOnUnderlyingRedundancy <em>Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Based On Underlying Redundancy</em>' attribute.
	 * @see #getIsBasedOnUnderlyingRedundancy()
	 * @generated
	 */
	void setIsBasedOnUnderlyingRedundancy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sequential Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequential Access</em>' attribute.
	 * @see #setSequentialAccess(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_SequentialAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSequentialAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getSequentialAccess <em>Sequential Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential Access</em>' attribute.
	 * @see #getSequentialAccess()
	 * @generated
	 */
	void setSequentialAccess(Boolean value);

	/**
	 * Returns the value of the '<em><b>Extent Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the ExtentStatus property. 
	 * 'In-Band Access Granted' says that access to data on an extent is granted to some consumer and is only valid when 'Exported' is also set. It is set as a side effect of PrivilegeManagementService.ChangeAccess or equivalent interfaces. 
	 * 'Imported' indicates that the extent is used in the current system, but known to be managed by some other system. For example, a server imports volumes from a disk array. 
	 * 'Exported' indicates the extent is meant to be used by some comsumer. A disk array's logical units are exported. 
	 * Intermediate composite extents may be neither imported nor exported.
	 * 'Relocating' indicates the extent is being relocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ExtentStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unknown\",\"None/Not Applicable\",\"Broken\",\"Data Lost\",\"Dynamic Reconfig\",\"Exposed\",\"Fractionally Exposed\",\"Partially Exposed\",\"Protection Disabled\",\"Readying\",\"Rebuild\",\"Recalculate\",\"Spare in Use\",\"Verify In Progress\",\"In-Band Access Granted\",\"Imported\",\"Exported\",\"Relocating\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getExtentStatus();

	/**
	 * Returns the value of the '<em><b>No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not there exists no single point of failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #setNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_NoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageSetting.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #getNoSinglePointOfFailure()
	 * @generated
	 */
	void setNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of complete copies of data currently maintained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy</em>' attribute.
	 * @see #setDataRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_DataRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyGoal\",\"CIM_StorageSetting.DataRedundancyMax\",\"CIM_StorageSetting.DataRedundancyMin\"]'"
	 * @generated
	 */
	Integer getDataRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getDataRedundancy <em>Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy</em>' attribute.
	 * @see #getDataRedundancy()
	 * @generated
	 */
	void setDataRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy</em>' attribute.
	 * @see #setPackageRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_PackageRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyGoal\",\"CIM_StorageSetting.PackageRedundancyMax\",\"CIM_StorageSetting.PackageRedundancyMin\"]'"
	 * @generated
	 */
	Integer getPackageRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getPackageRedundancy <em>Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy</em>' attribute.
	 * @see #getPackageRedundancy()
	 * @generated
	 */
	void setPackageRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation</em>' attribute.
	 * @see #setDeltaReservation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_DeltaReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percentage' MinValue='1' MaxValue='100' ModelCorrespondence='[\"CIM_StorageSetting.DeltaReservationGoal\",\"CIM_StorageSetting.DeltaReservationMax\",\"CIM_StorageSetting.DeltaReservationMin\"]'"
	 * @generated
	 */
	Integer getDeltaReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getDeltaReservation <em>Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation</em>' attribute.
	 * @see #getDeltaReservation()
	 * @generated
	 */
	void setDeltaReservation(Integer value);

	/**
	 * Returns the value of the '<em><b>Primordial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primordial</em>' attribute.
	 * @see #setPrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_Primordial()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getPrimordial <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primordial</em>' attribute.
	 * @see #getPrimordial()
	 * @generated
	 */
	void setPrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list here applies to all StorageExtent subclasses. Please look at the Description in each subclass for guidelines on the approriate values for that subclass. Note that any of these formats could apply to a CompositeExtent. 
	 * 
	 * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageExtent.NameNamespace. 
	 * 
	 * For example, the preferred source for SCSI virtual (RAID) disk names is from Inquiry VPD page 83 response, type 3 identifiers. These will have NameFormat set to 'NAA' and NameNamespace to 'VPD83Type3'. 
	 * 
	 * Format of the Name property. Values for extents representing SCSI volumes are (per SCSI SPC-3): 
	 * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
	 * (DEPRECATED) 
	 * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
	 * (DEPRECATED) 
	 * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
	 * 5 = VPD Page 83, 
	 * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
	 * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
	 * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
	 * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
	 * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
	 * (DEPRECATED) 
	 * 9 = NAA as a generic format. See 
	 * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
	 * 10 = EUI as a generic format (EUI64) See 
	 * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
	 * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
	 * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_NameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"VPD83NAA6\",\"VPD83NAA5\",\"VPD83Type2\",\"VPD83Type1\",\"VPD83Type0\",\"SNVM\",\"NodeWWN\",\"NAA\",\"EUI64\",\"T10VID\",\"OS Device Name\"]' ModelCorrespondence='[\"CIM_StorageExtent.Name\",\"CIM_StorageExtent.NameNamespace\",\"CIM_StorageExtent.OtherNameFormat\"]'"
	 * @generated
	 */
	Integer getNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred source SCSI for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
	 * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
	 * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
	 * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
	 * (NameFormat T10) 
	 * Less preferred volume namespaces from other interfaces: 
	 * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
	 * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
	 * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) 
	 * The preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
	 * 8 = OS Device Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Namespace</em>' attribute.
	 * @see #setNameNamespace(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_NameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"VPD83Type3\",\"VPD83Type2\",\"VPD83Type1\",\"VPD80\",\"NodeWWN\",\"SNVM\",\"OS Device Namespace\"]' MappingStrings='[\"SPC.INCITS-T10| VPD 83, Association 0 | Identifier\"]' ModelCorrespondence='[\"CIM_StorageExtent.Name\",\"CIM_StorageExtent.OtherNameNamespace\",\"CIM_StorageExtent.NameFormat\"]'"
	 * @generated
	 */
	Integer getNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getNameNamespace <em>Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Namespace</em>' attribute.
	 * @see #getNameNamespace()
	 * @generated
	 */
	void setNameNamespace(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Name Namespace</em>' attribute.
	 * @see #setOtherNameNamespace(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_OtherNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.NameNamespace\"]'"
	 * @generated
	 */
	String getOtherNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getOtherNameNamespace <em>Other Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Name Namespace</em>' attribute.
	 * @see #getOtherNameNamespace()
	 * @generated
	 */
	void setOtherNameNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Other Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Name Format</em>' attribute.
	 * @see #setOtherNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_OtherNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.NameFormat\"]'"
	 * @generated
	 */
	String getOtherNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getOtherNameFormat <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Name Format</em>' attribute.
	 * @see #getOtherNameFormat()
	 * @generated
	 */
	void setOtherNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageExtent.Usage\"]'"
	 * @generated
	 */
	EList<Integer> getClientSettableUsage();

	/**
	 * Returns the value of the '<em><b>Compression Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompressionRate identifies whether or not compression is being applied to the volume and at what rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Rate</em>' attribute.
	 * @see #setCompressionRate(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_CompressionRate()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"None\",\"High\",\"Medium\",\"Low\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSetting.CompressionRate\",\"CIM_StorageExtent.IsCompressed\"]'"
	 * @generated
	 */
	Integer getCompressionRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getCompressionRate <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Rate</em>' attribute.
	 * @see #getCompressionRate()
	 * @generated
	 */
	void setCompressionRate(Integer value);

	/**
	 * Returns the value of the '<em><b>Compression State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CompressionState indicates whether the compression is pending, initializing, in progress or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression State</em>' attribute.
	 * @see #setCompressionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_CompressionState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Not applicable\",\"Initializing\",\"InProgress\",\"Pending\",\"Completed\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageExtent.CompressionRate\",\"CIM_StorageExtent.IsCompressed\"]'"
	 * @generated
	 */
	Integer getCompressionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getCompressionState <em>Compression State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression State</em>' attribute.
	 * @see #getCompressionState()
	 * @generated
	 */
	void setCompressionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Extent Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings used to discriminate the association context in which this StorageExtent is instantiated. Each element of the array should be prefixed by a well known organization name followed by a colon and followed by a string defined by that organization. For example, SNIA SMI-S compliant instances might contain one or more of the following values: 
	 * 'SNIA:Pool Component' - A StorageExtent (or CompositeExtent) that represents storage of a StoragePool and has an AssociatedComponentExtent to its StoragePool, but is not a remaining extent. 
	 * 'SNIA:Remaining' - A StorageExtent that has an AssociatedRemainingExtent to a StoragePool (representing free storage in the StoragePool). 
	 * 'SNIA:Intermediate' - A StorageExtent (or CompositeExtent) that is neither a Pool Component nor a Remaining Extent (it does not represent storage in the pool, remaining or otherwise). 
	 * 'SNIA:Composite' - A StorageExtent that is a CompositeExtent. 
	 * 'SNIA:DiskDrive' - A StorageExtent that is the media on a Disk Drive. 
	 * 'SNIA:Imported' - A StorageExtent that is imported from an external source. 
	 * 'SNIA:Allocated' - A StorageExtent that is subclassed to StorageVolume or LogicalDisk, and has an AllocatedFromStoragePool association from a Concrete StoragePool. 
	 * 'SNIA:Shadow' - A StorageExtent (or subclass) that represents a StorageExtent in another autonomous profile (e.g., the StorageVirtualizer has StorageVolumes (Shadow) that represent StorageVolumes exported by Arrays). 
	 * 'SNIA:Spare' - A StorageExtent that acts as a spare for other StorageExtents (and has the IsSpare association). 
	 * 'SNIA:Reserved' - A StorageExtent that is reserved for some system use within the autonomous profile (e.g., in NAS profiles, an Allocated LogicalDisk is reserved for holding Filesystems).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ExtentDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getExtentDiscriminator();

	/**
	 * Returns the value of the '<em><b>Extent Interleave Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, then IsComposite shall be true. Number of StorageExtents to stripe as a collective set. In SCSI SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Interleave Depth</em>' attribute.
	 * @see #setExtentInterleaveDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ExtentInterleaveDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Volume Set|001.5\"]'"
	 * @generated
	 */
	Long getExtentInterleaveDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getExtentInterleaveDepth <em>Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Interleave Depth</em>' attribute.
	 * @see #getExtentInterleaveDepth()
	 * @generated
	 */
	void setExtentInterleaveDepth(Long value);

	/**
	 * Returns the value of the '<em><b>Extent Stripe Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, then IsComposite shall be true. Number of contiguous underlying StorageExtents counted before looping back to the first underlying StorageExtent of the current stripe. It is the number of StorageExtents forming the user data stripe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Stripe Length</em>' attribute.
	 * @see #setExtentStripeLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_ExtentStripeLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Volume Set|001.4\"]'"
	 * @generated
	 */
	Long getExtentStripeLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getExtentStripeLength <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Stripe Length</em>' attribute.
	 * @see #getExtentStripeLength()
	 * @generated
	 */
	void setExtentStripeLength(Long value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the data is a composition of various StorageExtents that are associated to this StorageExtent via a CIM_BasedOn. Composition models the distribution of user data across one or more underlying StorageExtents, which may or not be protected by some redundancy mechanism. Composite extents represent a contiguous range of logical blocks. Composite extents may overlap, however, the underlying StorageExtents within the overlap shall not contain any check data. Distribution of check data may be specified using the CompositeExtentBasedOn association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_IsComposite()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IsCompressed property indicates whether or not the data in the storage extent is compressed. When set to "true" the data is compressed. When set to "false" the data is not compressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Compressed</em>' attribute.
	 * @see #setIsCompressed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_IsCompressed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageExtent.CompressionRate\"]'"
	 * @generated
	 */
	Boolean getIsCompressed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getIsCompressed <em>Is Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Compressed</em>' attribute.
	 * @see #getIsCompressed()
	 * @generated
	 */
	void setIsCompressed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Concatenated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, then IsComposite shall be true. True indicates that the data is concatenated across the various StorageExtents in the Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Concatenated</em>' attribute.
	 * @see #setIsConcatenated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_IsConcatenated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsConcatenated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getIsConcatenated <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Concatenated</em>' attribute.
	 * @see #getIsConcatenated()
	 * @generated
	 */
	void setIsConcatenated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populated when "Usage" has the value of "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Usage Description</em>' attribute.
	 * @see #setOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_OtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageExtent.Usage\"]'"
	 * @generated
	 */
	String getOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getOtherUsageDescription <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Usage Description</em>' attribute.
	 * @see #getOtherUsageDescription()
	 * @generated
	 */
	void setOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. In the value map, the "Element Component" indicates a StorageVolume or LogicalDisk that is only available as an EmbeddedInstance. The storage that it represents may also be represented as another StorageExent that is a component of another LogicalElement. 
	 * "Reserved to be Unrestricted Pool Contributor": Indicates the element is currently available and it is intended to be used as an Unrestricted Pool Contributor. Once such element is in use, the elements Usage value will change to "In use as Unrestricted Pool Contributor". 
	 * Use the method GetElementsBasedOnUsage to locate such volumes or logical disks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageExtent_Usage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved to be Unrestricted Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"In use as Unrestricted Pool Contributor\",\"Reserved to be Delta Replica Pool Contributor\",\"Reserved to be Local Replication Pool Contributor\",\"Reserved to be Remote Replication Pool Contributor\",\"In use as Delta Replica Pool Contributor\",\"In use as Local Replication Pool Contributor\",\"In use as Remote Replication Pool Contributor\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StorageExtent.OtherUsageDescription\"]'"
	 * @generated
	 */
	Integer getUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageExtent#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Integer value);

} // CIM_StorageExtent
