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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Storage Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageSetting is roughly equivalent to a Service Level Agreement (SLA) It defines the characteristics, qualities of service and goals when used in a CreateOrModifyElement FromStoragePool or CreateOrModifyStoragePool method in the StorageConfigurationService. It specifies a series of properties with Maximum and Minimum values that define the (inclusive) bounds that the object should maintain. Note that the setting is associated to a StorageVolume or LogicalDisk, using ElementSetting. 
 * The use of these properties differs depending on whether the StorageSetting instance is being used as a goal for a configuration operation or being used as a Service Level Agreement for a created Volume. In addition the properties fall into two categories: The QOS properties(PackageRedundancy, Data Redundancy, & NoSinglePointOfFailure) and the Detailed RAID properties(ExtentStripeLength, ParityLayout, and UserDataStripeDepth). In a Setting used as a goal, the QOS properties are required as a set; The Detailed RAID properties(if supported as indicated by the scoping StorageCapabilities instance) may be used optionally in any combination. The implementation MUST supply it's own best practice in the case where one or more supported RAID properties are not supplied. In this situation the use of StorageSettingWithHints can be useful to provide direction to the implementation. 
 * In a Setting used as a service agreement for a Volume, the QOS properties reflect the Service Level Agreement, with goal, min, & max. The actual current service level is exposed by corresponding values in StorageExtent. 
 * The Detailed RAID properties, by contrast, reflect specific values that reflect the RAID construction of the Volume. Only the primary values are meaningful; Min and Max are set to match. 
 * Certain StorageSetting instances may be classed as "Fixed", by using the "ChangeableType" property, indicating the setting is preset. Such settings are used when the possible setting variations are low enough to be instantiated in their entirety. The StorageCapabilities "CreateSetting" method MAY NOT be used to return settings that are not changeable. 
 * Other StorageSetting instances are created using the "CreateSetting" method. If the capabilities specifies ranges, then the setting can be used by a client to narrow the range to particular values within the range. In other words, the capabilities MAY be broad, but the related setting MUST be as capable or less capable, that is more narrowly defined, before it is used to create or modify resources. 
 * These created StorageSetting instances MUST have their "ChangeableType" property = 1, "Changeable - Transient". 
 * GeneratedSettings MAY not remain after the restart or reset of the implementation. They may be deleted by implementation at any time. A reasonable minimal time to retain the generated transient settings is five minutes, although there is no minimal retention time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyMax <em>Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyMin <em>Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyGoal <em>Data Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyMax <em>Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyMin <em>Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyGoal <em>Package Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationMax <em>Delta Reservation Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationMin <em>Delta Reservation Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationGoal <em>Delta Reservation Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLength <em>Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLengthMin <em>Extent Stripe Length Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLengthMax <em>Extent Stripe Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getParityLayout <em>Parity Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepthMin <em>User Data Stripe Depth Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepthMax <em>User Data Stripe Depth Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getCUImage <em>CU Image</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getCompressedElement <em>Compressed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getCompressionRate <em>Compression Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDataOrganization <em>Data Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getEmulatedDevice <em>Emulated Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getFormFactorType <em>Form Factor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getIncrementalDeltas <em>Incremental Deltas</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getInitialSynchronization <em>Initial Synchronization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getInterconnectSpeed <em>Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getInterconnectType <em>Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getPersistentReplica <em>Persistent Replica</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getRPM <em>RPM</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getReplicationPriority <em>Replication Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getStorageExtentInitialUsage <em>Storage Extent Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getStoragePoolInitialUsage <em>Storage Pool Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getThinProvisionedInitialReserve <em>Thin Provisioned Initial Reserve</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getThinProvisionedPoolType <em>Thin Provisioned Pool Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSetting#getUseReplicationBuffer <em>Use Replication Buffer</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Device::StorageServices' override.ChangeableType='uint16' override.ChangeableType.Description='Enumeration indicating the type of setting. \"Fixed - Not Changeable\" settings are primordial. These setting are defined at the implementor of the class. \"Changeable - Transient\" is the type of setting produced by the \"CreateSetting\" method. A client can subsequently request that the implementation persist the generated and potentially modified setting indefinately. Only a \"Changeable - Transient\" setting SHALL be converted to a \"Changeable = Persistent\" setting; the setting SHALL NOT be changed back.' override.ChangeableType.ValueMap='[\"0\",\"1\",\"2\"]' override.ChangeableType.Values='[\"Fixed - Not Changeable\",\"Changeable - Transient\",\"Changeable - Persistent\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the desired value for No Single Point of Failure. Possible values are false = single point of failure, and true = no single point of failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #setNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_NoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #getNoSinglePointOfFailure()
	 * @generated
	 */
	void setNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRedundancyMax describes the maximum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the minimum is defined by DataRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Max</em>' attribute.
	 * @see #setDataRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DataRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyMin\",\"CIM_StorageSetting.DataRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getDataRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyMax <em>Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy Max</em>' attribute.
	 * @see #getDataRedundancyMax()
	 * @generated
	 */
	void setDataRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRedundancyMin describes the minimum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the maximum is defined by DataRedundancyMax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Min</em>' attribute.
	 * @see #setDataRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DataRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyMax\",\"CIM_StorageSetting.DataRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getDataRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyMin <em>Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy Min</em>' attribute.
	 * @see #getDataRedundancyMin()
	 * @generated
	 */
	void setDataRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRedundancyGoal describes the desired number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The bounds (max and min) for redundancy are defined using the properties, DataRedundancyMax and DataRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Goal</em>' attribute.
	 * @see #setDataRedundancyGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DataRedundancyGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.DataRedundancyMax\",\"CIM_StorageSetting.DataRedundancyMin\"]'"
	 * @generated
	 */
	Integer getDataRedundancyGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDataRedundancyGoal <em>Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy Goal</em>' attribute.
	 * @see #getDataRedundancyGoal()
	 * @generated
	 */
	void setDataRedundancyGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackageRedundancyMax describes the maximum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the minimum is defined by PackageRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Max</em>' attribute.
	 * @see #setPackageRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_PackageRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyMin\",\"CIM_StorageSetting.PackageRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyMax <em>Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy Max</em>' attribute.
	 * @see #getPackageRedundancyMax()
	 * @generated
	 */
	void setPackageRedundancyMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackageRedundancyMin describes the minimum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the maximum is defined by PackageRedundancyMax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Min</em>' attribute.
	 * @see #setPackageRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_PackageRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyMax\",\"CIM_StorageSetting.PackageRedundancyGoal\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyMin <em>Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy Min</em>' attribute.
	 * @see #getPackageRedundancyMin()
	 * @generated
	 */
	void setPackageRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackageRedundancyGoal describes the desired number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The bounds (max and min) for redundancy are defined using the properties, PackageRedundancyMax and PackageRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Goal</em>' attribute.
	 * @see #setPackageRedundancyGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_PackageRedundancyGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_StorageSetting.PackageRedundancyMax\",\"CIM_StorageSetting.PackageRedundancyMin\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getPackageRedundancyGoal <em>Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy Goal</em>' attribute.
	 * @see #getPackageRedundancyGoal()
	 * @generated
	 */
	void setPackageRedundancyGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReservationMax is a number between 1 (1%) and a 100 (100%) which specifies the maximum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the minimum is defined by DeltaReservationMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Max</em>' attribute.
	 * @see #setDeltaReservationMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DeltaReservationMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percentage' MinValue='1' MaxValue='100' ModelCorrespondence='[\"CIM_StorageSetting.DeltaReservationMin\",\"CIM_StorageSetting.DeltaReservationGoal\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationMax <em>Delta Reservation Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation Max</em>' attribute.
	 * @see #getDeltaReservationMax()
	 * @generated
	 */
	void setDeltaReservationMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReservationMin is a number between 1 (1%) and a 100 (100%) which specifies the minimum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the maximum is defined by DeltaReservationMax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Min</em>' attribute.
	 * @see #setDeltaReservationMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DeltaReservationMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percentage' MinValue='1' MaxValue='100' ModelCorrespondence='[\"CIM_StorageSetting.DeltaReservationMax\",\"CIM_StorageSetting.DeltaReservationGoal\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationMin <em>Delta Reservation Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation Min</em>' attribute.
	 * @see #getDeltaReservationMin()
	 * @generated
	 */
	void setDeltaReservationMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReservationGoal is a number between 1 (1%) and a 100 (100%) which specifies the desired amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The bounds (max and min) for the reservation are defined using the properties, DeltaReservationMax and DeltaReservationMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Goal</em>' attribute.
	 * @see #setDeltaReservationGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DeltaReservationGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percentage' MinValue='1' MaxValue='100' ModelCorrespondence='[\"CIM_StorageSetting.DeltaReservationMin\",\"CIM_StorageSetting.DeltaReservationMax\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDeltaReservationGoal <em>Delta Reservation Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation Goal</em>' attribute.
	 * @see #getDeltaReservationGoal()
	 * @generated
	 */
	void setDeltaReservationGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>Extent Stripe Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLength is the optimal desired value. The bounds (max and min) for Stripe Length are defined using the properties ExtentStripeLengthMax and ExtentStripeLengthMin. ExtentStripeLength MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. ExtentStripeLength can be used in conjunction with CreateOrModifyElementFromELements to explicitly configure storage. An example would be RAID 0+1 with mirroring two stripe sets, each set being three wide. In this case CreateOrModifyElementFromElements would be passed a goal setting with DataRedundancy = 2 and ExtentStripeLength = 3. The size of the InElements array would be 6 and would contain the StorageExtents to be used to construct the StorageElement as a RAID 0+1. ExtentStripeLengthMin and ExtentStripeLengthMax are meaningless and wouldbe set to NULL. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with, and ExtentStripeLengthMin and ExtentStripeLengthMax will be set to the same specific value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Stripe Length</em>' attribute.
	 * @see #setExtentStripeLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ExtentStripeLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLengthMax\",\"CIM_StorageSetting.ExtentStripeLengthMin\"]'"
	 * @generated
	 */
	Integer getExtentStripeLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLength <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Stripe Length</em>' attribute.
	 * @see #getExtentStripeLength()
	 * @generated
	 */
	void setExtentStripeLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Extent Stripe Length Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLengthMin is the minimum acceptable value. The desired Stripe Length is specified using ExtentStripeLength, while the maximum is defined by ExtentStripeLengthMax. ExtentStripeLengthMin MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of ExtentStripeLength.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Stripe Length Min</em>' attribute.
	 * @see #setExtentStripeLengthMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ExtentStripeLengthMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLengthMax\",\"CIM_StorageSetting.ExtentStripeLength\"]'"
	 * @generated
	 */
	Integer getExtentStripeLengthMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLengthMin <em>Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Stripe Length Min</em>' attribute.
	 * @see #getExtentStripeLengthMin()
	 * @generated
	 */
	void setExtentStripeLengthMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Extent Stripe Length Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLengthMax is the maximum acceptable value. The desired Stripe Length is specified using ExtentStripeLength, while the minimum is defined by ExtentStripeLengthMin. ExtentStripeLengthMax MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of ExtentStripeLength.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Stripe Length Max</em>' attribute.
	 * @see #setExtentStripeLengthMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ExtentStripeLengthMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.ExtentStripeLengthMin\",\"CIM_StorageSetting.ExtentStripeLength\"]'"
	 * @generated
	 */
	Integer getExtentStripeLengthMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getExtentStripeLengthMax <em>Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Stripe Length Max</em>' attribute.
	 * @see #getExtentStripeLengthMax()
	 * @generated
	 */
	void setExtentStripeLengthMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Parity Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ParityLayout specifies whether a parity-based storage organization is using rotated or non-rotated parity. When used in a goal setting instance, ParityLayout is the desired value. It MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parity Layout</em>' attribute.
	 * @see #setParityLayout(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ParityLayout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\"]' Values='[\"Non-rotated Parity\",\"Rotated Parity\"]'"
	 * @generated
	 */
	Integer getParityLayout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getParityLayout <em>Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Layout</em>' attribute.
	 * @see #getParityLayout()
	 * @generated
	 */
	void setParityLayout(Integer value);

	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepth is the optimal desired value. The bounds (max and min) for Stripe Depth are defined using the properties UserDataStripeDepthMax and UserDataStripeDepthMin. UserDataStripeDepth MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with, and UserDataStripeDepthMin and UserDataStripeDepthMax will be set to the same specific value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #setUserDataStripeDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_UserDataStripeDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bytes' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepthMax\",\"CIM_StorageSetting.UserDataStripeDepthMin\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepth <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #getUserDataStripeDepth()
	 * @generated
	 */
	void setUserDataStripeDepth(Long value);

	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepthMin is the minimum acceptable value. The desired Stripe Depth is specified using UserDataStripeDepth, while the maximum is defined by UserDataStripeDepthMax. UserDataStripeDepthMin MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of UserDataStripeDepth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth Min</em>' attribute.
	 * @see #setUserDataStripeDepthMin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_UserDataStripeDepthMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bytes' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepthMax\",\"CIM_StorageSetting.UserDataStripeDepth\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepthMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepthMin <em>User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth Min</em>' attribute.
	 * @see #getUserDataStripeDepthMin()
	 * @generated
	 */
	void setUserDataStripeDepthMin(Long value);

	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepthMax is the maximum acceptable value. The desired Stripe Depth is specified using UserDataStripeDepthGoal, while the minimum is defined by UserDataStripeDepthMin. UserDataStripeDepthMax MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingwWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of UserDataStripeDepth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth Max</em>' attribute.
	 * @see #setUserDataStripeDepthMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_UserDataStripeDepthMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true' Units='Bytes' MinValue='1' ModelCorrespondence='[\"CIM_StorageSetting.UserDataStripeDepthMin\",\"CIM_StorageSetting.UserDataStripeDepth\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepthMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getUserDataStripeDepthMax <em>User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth Max</em>' attribute.
	 * @see #getUserDataStripeDepthMax()
	 * @generated
	 */
	void setUserDataStripeDepthMax(Long value);

	/**
	 * Returns the value of the '<em><b>CU Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is the Node Element Descriptor of the Control Unit Image (this property is required for CKD StorageVolume). It is not required for LogicalDisks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CU Image</em>' attribute.
	 * @see #setCUImage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_CUImage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCUImage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getCUImage <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Image</em>' attribute.
	 * @see #getCUImage()
	 * @generated
	 */
	void setCUImage(String value);

	/**
	 * Returns the value of the '<em><b>Compressed Element</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CompressedElement property indicates whether or not compression of the element is being requested. When set to true, compression is being requested. When set to false, compression is not being requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compressed Element</em>' attribute.
	 * @see #setCompressedElement(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_CompressedElement()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCompressedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getCompressedElement <em>Compressed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed Element</em>' attribute.
	 * @see #getCompressedElement()
	 * @generated
	 */
	void setCompressedElement(Boolean value);

	/**
	 * Returns the value of the '<em><b>Compression Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the desired compression for a storage element. The possible values are "None", "High", "Medium", "Low" or "Implementation Decides". If CompressedElement is set to "false", then this property should be set to 1 (None).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Rate</em>' attribute.
	 * @see #setCompressionRate(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_CompressionRate()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"None\",\"High\",\"Medium\",\"Low\",\"Implementation Decides\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCompressionRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getCompressionRate <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Rate</em>' attribute.
	 * @see #getCompressionRate()
	 * @generated
	 */
	void setCompressionRate(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of data organization used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Organization</em>' attribute.
	 * @see #setDataOrganization(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DataOrganization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Fixed Block\",\"Variable Block\",\"Count Key Data\"]'"
	 * @generated
	 */
	Integer getDataOrganization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDataOrganization <em>Data Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Organization</em>' attribute.
	 * @see #getDataOrganization()
	 * @generated
	 */
	void setDataOrganization(Integer value);

	/**
	 * Returns the value of the '<em><b>Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of DiskDrives which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Type</em>' attribute.
	 * @see #setDiskType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_DiskType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Do Not Care\",\"Other\",\"Hard Disk Drive\",\"Solid State Drive\",\"Hybrid\"]'"
	 * @generated
	 */
	Integer getDiskType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getDiskType <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Type</em>' attribute.
	 * @see #getDiskType()
	 * @generated
	 */
	void setDiskType(Integer value);

	/**
	 * Returns the value of the '<em><b>Emulated Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the specific device (e.g., 3380 or 3390) that is emulated by the volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emulated Device</em>' attribute.
	 * @see #setEmulatedDevice(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_EmulatedDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEmulatedDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getEmulatedDevice <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emulated Device</em>' attribute.
	 * @see #getEmulatedDevice()
	 * @generated
	 */
	void setEmulatedDevice(String value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property reflects support of the encryption feature implemented by some disk drives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see #setEncryption(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_Encryption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Do Not Care\",\"Not Supported\",\"Supported\"]'"
	 * @generated
	 */
	Integer getEncryption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(Integer value);

	/**
	 * Returns the value of the '<em><b>Form Factor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of form factors which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Factor Type</em>' attribute.
	 * @see #setFormFactorType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_FormFactorType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Do Not Care\",\"Other\",\"Not Reported\",\"5.25 inch\",\"3.5 inch\",\"2.5 inch\",\"1.8 inch\"]'"
	 * @generated
	 */
	Integer getFormFactorType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getFormFactorType <em>Form Factor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Factor Type</em>' attribute.
	 * @see #getFormFactorType()
	 * @generated
	 */
	void setFormFactorType(Integer value);

	/**
	 * Returns the value of the '<em><b>Incremental Deltas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates delta replicas associated with the source element associated with this settingdata are incrementally dependent. Only the oldest replica in the set may be deleted or resynced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incremental Deltas</em>' attribute.
	 * @see #setIncrementalDeltas(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_IncrementalDeltas()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncrementalDeltas();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getIncrementalDeltas <em>Incremental Deltas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Deltas</em>' attribute.
	 * @see #getIncrementalDeltas()
	 * @generated
	 */
	void setIncrementalDeltas(Boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Synchronization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Applicable indicates that this property is not applicable to the associated storage element. Other values indicate whether or not a source element should be fully copied to a target element at the time the replication is initiated. The provider does not have to comply with the client request. These other values are defined as: 
	 * - "Not Managed": to start or not at initiation is up to the implementation. 
	 * - "Start": start replication on initiation. 
	 * - "Do Not Start": do not start replication on initiation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Synchronization</em>' attribute.
	 * @see #setInitialSynchronization(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_InitialSynchronization()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not Applicable\",\"Not Managed\",\"Start\",\"Do Not Start\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getInitialSynchronization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getInitialSynchronization <em>Initial Synchronization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Synchronization</em>' attribute.
	 * @see #getInitialSynchronization()
	 * @generated
	 */
	void setInitialSynchronization(Integer value);

	/**
	 * Returns the value of the '<em><b>Interconnect Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed of disk interconnection wanted. Value of 0 means don't care. Values are in bits/second
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect Speed</em>' attribute.
	 * @see #setInterconnectSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_InterconnectSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='bit / second'"
	 * @generated
	 */
	Long getInterconnectSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getInterconnectSpeed <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Speed</em>' attribute.
	 * @see #getInterconnectSpeed()
	 * @generated
	 */
	void setInterconnectSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Interconnect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of disk interconnection wanted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect Type</em>' attribute.
	 * @see #setInterconnectType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_InterconnectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"don\'t care\",\"other\",\"SAS\",\"SATA\",\"SAS/SATA\",\"FC\",\"SOP\"]'"
	 * @generated
	 */
	Integer getInterconnectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getInterconnectType <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Type</em>' attribute.
	 * @see #getInterconnectType()
	 * @generated
	 */
	void setInterconnectType(Integer value);

	/**
	 * Returns the value of the '<em><b>Low Space Warning Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LowSpaceWarningThreshold simplifies the creation of a pool specific Indication based on RemainingManagedSpace <= 
	 * (TotalManagedSpace*LowSpaceWarningThreshold)/100. One example client for an Indication based on this property is a delta copy implementation where the pool enables continuous, variable space consumption for the delta storage. Another example client for an Indication based on this property is a provisioning manager implementing a policy for adding storage to a pool when it becomes low.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Space Warning Threshold</em>' attribute.
	 * @see #setLowSpaceWarningThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_LowSpaceWarningThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StoragePool.RemainingManagedSpace\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getLowSpaceWarningThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Space Warning Threshold</em>' attribute.
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 */
	void setLowSpaceWarningThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Persistent Replica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates the associated replicas persist during power off or system reset. False indicates replicas lost during these events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Replica</em>' attribute.
	 * @see #setPersistentReplica(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_PersistentReplica()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPersistentReplica();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getPersistentReplica <em>Persistent Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Replica</em>' attribute.
	 * @see #getPersistentReplica()
	 * @generated
	 */
	void setPersistentReplica(Boolean value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of disk interfaces which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_PortType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Do Not Care\",\"other\",\"SAS\",\"SATA\",\"SAS/SATA\",\"FC\"]'"
	 * @generated
	 */
	Integer getPortType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Integer value);

	/**
	 * Returns the value of the '<em><b>RPM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotational speed of disk media wanted. a value of 0xffffffff means don't care. Values are in revolutions per minute. SSD devices shall report 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPM</em>' attribute.
	 * @see #setRPM(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_RPM()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='revolution / minute'"
	 * @generated
	 */
	Long getRPM();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getRPM <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPM</em>' attribute.
	 * @see #getRPM()
	 * @generated
	 */
	void setRPM(Long value);

	/**
	 * Returns the value of the '<em><b>Replication Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Applicable indicates that this property is not applicable to the associated storage element. Other values indicate the relative priority of background Replication I/O operations relative to host I/O operations. These other values are: 
	 * - "Low": Replication engine I/O lower priority than host I/O. 
	 * - "Same": Replication engine I/O has the same priority as host I/O. 
	 * - "High": Replication engine I/O has higher priority than host I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Priority</em>' attribute.
	 * @see #setReplicationPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ReplicationPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Not Applicable\",\"Not Managed\",\"Low\",\"Same\",\"High\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageReplicationCapabilities.ReplicationPriorityDefault\"]'"
	 * @generated
	 */
	Integer getReplicationPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getReplicationPriority <em>Replication Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Priority</em>' attribute.
	 * @see #getReplicationPriority()
	 * @generated
	 */
	void setReplicationPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Space Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpaceLimit is the consumption limit for the allocated storage element from all associated StoragePools. If asserted, then the assumption is that the storage element can grow, (for instance an element representing the storage for a delta replica). 
	 * If SpaceLimit is greater than zero, the space consumed by the storage element shall not exceed the value of SpaceLimit. 
	 * If SpaceLimit = 0 (the default) then no limits are asserted on the amount of space consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit</em>' attribute.
	 * @see #setSpaceLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_SpaceLimit()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSpaceLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getSpaceLimit <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit</em>' attribute.
	 * @see #getSpaceLimit()
	 * @generated
	 */
	void setSpaceLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Space Limit Warning Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the associated storage element may dynamically consume an increasing amount of space and a space limit is enforced on the element, then a non-zero warning threshold percentage indicates when a warning indication should be generated based on the total amount of space consumed being >= (SpaceLimit*SpaceLimitWarningThreshold)/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit Warning Threshold</em>' attribute.
	 * @see #setSpaceLimitWarningThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_SpaceLimitWarningThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getSpaceLimitWarningThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Warning Threshold</em>' attribute.
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 */
	void setSpaceLimitWarningThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Extent Initial Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage value to be used when creating a new element that is derived from a StorageExtent.
	 * 
	 * "Reserved to be Unrestricted Pool Contributor": Indicates the element is available and it is intended to be used as an Unrestricted Pool Contributor. Once such element is in use, the elements Usage value will change to "In use as Unrestricted Pool Contributor".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Extent Initial Usage</em>' attribute.
	 * @see #setStorageExtentInitialUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_StorageExtentInitialUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved to be Unrestricted Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"In use as Unrestricted Pool Contributor\",\"Reserved to be Delta Replica Pool Contributor\",\"Reserved to be Local Replication Pool Contributor\",\"Reserved to be Remote Replication Pool Contributor\",\"In use as Delta Replica Pool Contributor\",\"In use as Local Replication Pool Contributor\",\"In use as Remote Replication Pool Contributor\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getStorageExtentInitialUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getStorageExtentInitialUsage <em>Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Extent Initial Usage</em>' attribute.
	 * @see #getStorageExtentInitialUsage()
	 * @generated
	 */
	void setStorageExtentInitialUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Pool Initial Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Usage value to be used when creating a new StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Pool Initial Usage</em>' attribute.
	 * @see #setStoragePoolInitialUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_StoragePoolInitialUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved as a Delta Replica Container\",\"Reserved for Migration Services\",\"Reserved for Local Replication Services\",\"Reserved for Remote Replication Services\",\"Reserved for Sparing\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StoragePool.Usage\"]'"
	 * @generated
	 */
	Integer getStoragePoolInitialUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getStoragePoolInitialUsage <em>Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Pool Initial Usage</em>' attribute.
	 * @see #getStoragePoolInitialUsage()
	 * @generated
	 */
	void setStoragePoolInitialUsage(Integer value);

	/**
	 * Returns the value of the '<em><b>Subsystem ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is the Subsystem ID if the array or virtualizer supports Subsystem IDs. If they are supported they would be required on volume creation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystem ID</em>' attribute.
	 * @see #setSubsystemID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_SubsystemID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSubsystemID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getSubsystemID <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem ID</em>' attribute.
	 * @see #getSubsystemID()
	 * @generated
	 */
	void setSubsystemID(String value);

	/**
	 * Returns the value of the '<em><b>Thin Provisioned Initial Reserve</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial reserve being requested by the client when StorageConfigurationCapabilities is used as a parameter for creating volumes or logical disks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provisioned Initial Reserve</em>' attribute.
	 * @see #setThinProvisionedInitialReserve(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ThinProvisionedInitialReserve()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getThinProvisionedInitialReserve();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getThinProvisionedInitialReserve <em>Thin Provisioned Initial Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provisioned Initial Reserve</em>' attribute.
	 * @see #getThinProvisionedInitialReserve()
	 * @generated
	 */
	void setThinProvisionedInitialReserve(Long value);

	/**
	 * Returns the value of the '<em><b>Thin Provisioned Pool Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of thin provisioned pool used when StorageSetting is used as a goal for creating a thin provisioned pool. In other contexts, this property is undefined. The possibles values match the appropriate values in StorageConfigrationCapabilities.SupportedStorageElementTypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provisioned Pool Type</em>' attribute.
	 * @see #setThinProvisionedPoolType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_ThinProvisionedPoolType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"7\",\"8\",\"9\",\"..\",\"0x800..0xFFFF\"]' Values='[\"ThinlyProvisionedAllocatedStoragePool\",\"ThinlyProvisionedQuotaStoragePool\",\"ThinlyProvisionedLimitlessStoragePool\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getThinProvisionedPoolType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getThinProvisionedPoolType <em>Thin Provisioned Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provisioned Pool Type</em>' attribute.
	 * @see #getThinProvisionedPoolType()
	 * @generated
	 */
	void setThinProvisionedPoolType(Integer value);

	/**
	 * Returns the value of the '<em><b>Use Replication Buffer</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "Not Applicable" indicates that this property is not applicable to the associated storage element. Other values indicate whether or not remote mirror pair created with SynchronizationType "Async" is allowed to use a write buffer for asynchronous buffering. These other values are defined as: 
	 * - "Not Managed": use or not of the buffer is up to the implementation. 
	 * - "Use Buffer": use of a buffer for logging is required. 
	 * - "Do Not Use Buffer": a buffer for logging shall not be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Replication Buffer</em>' attribute.
	 * @see #setUseReplicationBuffer(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSetting_UseReplicationBuffer()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not Applicable\",\"Not Managed\",\"Use Buffer\",\"Do Not Use Buffer\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getUseReplicationBuffer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSetting#getUseReplicationBuffer <em>Use Replication Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Replication Buffer</em>' attribute.
	 * @see #getUseReplicationBuffer()
	 * @generated
	 */
	void setUseReplicationBuffer(Integer value);

} // CIM_StorageSetting
