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
 * A representation of the model object '<em><b>CIM Storage Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a StorageService or StoragePool. For example, an instance of StorageCapabilities could be associated with either a StorageConfigurationService or StoragePool by using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getNoSinglePointOfFailureDefault <em>No Single Point Of Failure Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyMax <em>Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyMin <em>Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyDefault <em>Data Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyMax <em>Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyMin <em>Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyDefault <em>Package Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationMax <em>Delta Reservation Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationMin <em>Delta Reservation Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationDefault <em>Delta Reservation Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getExtentStripeLengthDefault <em>Extent Stripe Length Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getParityLayoutDefault <em>Parity Layout Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getUserDataStripeDepthDefault <em>User Data Stripe Depth Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getAvailableDiskType <em>Available Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getAvailableFormFactorType <em>Available Form Factor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getAvailableInterconnectSpeed <em>Available Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getAvailableInterconnectType <em>Available Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getAvailableRPM <em>Available RPM</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getSupportedCompressionRates <em>Supported Compression Rates</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageCapabilities#getSupportedDataOrganizations <em>Supported Data Organizations</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of element to which this StorageCapabilities applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Reserved\",\"Any Type\",\"StorageVolume\",\"StorageExtent\",\"StoragePool\",\"StorageConfigurationService\",\"LogicalDisk\",\"StorageTier\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>No Single Point Of Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the associated element supports no single point of failure. Values are: FALSE = does not support no single point of failure, and TRUE = supports no single point of failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #setNoSinglePointOfFailure(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_NoSinglePointOfFailure()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageCapabilities.NoSinglePointOfFailureDefault\"]'"
	 * @generated
	 */
	Boolean getNoSinglePointOfFailure();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Single Point Of Failure</em>' attribute.
	 * @see #getNoSinglePointOfFailure()
	 * @generated
	 */
	void setNoSinglePointOfFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>No Single Point Of Failure Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the default value for the NoSinglePointOfFailure property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Single Point Of Failure Default</em>' attribute.
	 * @see #setNoSinglePointOfFailureDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_NoSinglePointOfFailureDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageCapabilities.NoSinglePointOfFailure\"]'"
	 * @generated
	 */
	Boolean getNoSinglePointOfFailureDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getNoSinglePointOfFailureDefault <em>No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Single Point Of Failure Default</em>' attribute.
	 * @see #getNoSinglePointOfFailureDefault()
	 * @generated
	 */
	void setNoSinglePointOfFailureDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRedundancyMax describes the maximum number of complete copies of data that can be maintained. Examples would be RAID 5 (where 1 copy is maintained) and RAID 1 (where 2 or more copies are maintained). Possible values are 1 to n. The default redundancy is specified using DataRedundancyDefault, while the minimum is defined by DataRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Max</em>' attribute.
	 * @see #setDataRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DataRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyMin\",\"CIM_StorageCapabilities.DataRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getDataRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyMax <em>Data Redundancy Max</em>}' attribute.
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
	 * DataRedundancyMin describes the minimum number of complete copies of data that can be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained). Possible values are 1 to n. The default redundancy is specified using DataRedundancyDefault, while the maximum is defined by DataRedundancyMax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Min</em>' attribute.
	 * @see #setDataRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DataRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyMax\",\"CIM_StorageCapabilities.DataRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getDataRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyMin <em>Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy Min</em>' attribute.
	 * @see #getDataRedundancyMin()
	 * @generated
	 */
	void setDataRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Redundancy Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRedundancyDefault describes the default number of complete copies of data that can be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The bounds for the redundancy (max and min) are defined by DataRedundancyMax and DataRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Redundancy Default</em>' attribute.
	 * @see #setDataRedundancyDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DataRedundancyDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' ModelCorrespondence='[\"CIM_StorageCapabilities.DataRedundancyMax\",\"CIM_StorageCapabilities.DataRedundancyMin\"]'"
	 * @generated
	 */
	Integer getDataRedundancyDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDataRedundancyDefault <em>Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Redundancy Default</em>' attribute.
	 * @see #getDataRedundancyDefault()
	 * @generated
	 */
	void setDataRedundancyDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackageRedundancyMax describes the maximum number of redundant packages that can be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The default redundancy is specified using PackageRedundancyDefault, while the maximum is defined by PackageRedundancyMax.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Max</em>' attribute.
	 * @see #setPackageRedundancyMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_PackageRedundancyMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyMin\",\"CIM_StorageCapabilities.PackageRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyMax <em>Package Redundancy Max</em>}' attribute.
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
	 * PackageRedundancyMin describes the minimum number of redundant packages that can be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The default redundancy is specified using PackageRedundancyDefault, while the minimum is defined by PackageRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Min</em>' attribute.
	 * @see #setPackageRedundancyMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_PackageRedundancyMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyMax\",\"CIM_StorageCapabilities.PackageRedundancyDefault\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyMin <em>Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy Min</em>' attribute.
	 * @see #getPackageRedundancyMin()
	 * @generated
	 */
	void setPackageRedundancyMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Package Redundancy Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackageRedundancyDefault describes the default number of redundant packages that will be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The bounds for redundancy are specified using the properties, PackageRedundancyMax and PackageRedundancyMin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Redundancy Default</em>' attribute.
	 * @see #setPackageRedundancyDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_PackageRedundancyDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageCapabilities.PackageRedundancyMin\",\"CIM_StorageCapabilities.PackageRedundancyMax\"]'"
	 * @generated
	 */
	Integer getPackageRedundancyDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getPackageRedundancyDefault <em>Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Redundancy Default</em>' attribute.
	 * @see #getPackageRedundancyDefault()
	 * @generated
	 */
	void setPackageRedundancyDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReservatioMax is a number between 1 (1%) and a 100 (100%) that specifies the maximum amount of space reserved in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the upper limit, while DeltaReservationMin sets the lower limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Max</em>' attribute.
	 * @see #setDeltaReservationMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DeltaReservationMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StorageCapabilities.DeltaReservationMin\",\"CIM_StorageCapabilities.DeltaReservationDefault\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationMax <em>Delta Reservation Max</em>}' attribute.
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
	 * DeltaReservationMin is a number between 1 (1%) and a 100 (100%) that specifies the minimum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the lower limit, while DeltaReservationMax sets the upper limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Min</em>' attribute.
	 * @see #setDeltaReservationMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DeltaReservationMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StorageCapabilities.DeltaReservationMax\",\"CIM_StorageCapabilities.DeltaReservationDefault\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationMin <em>Delta Reservation Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation Min</em>' attribute.
	 * @see #getDeltaReservationMin()
	 * @generated
	 */
	void setDeltaReservationMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Reservation Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta reservation is a number between 1 (1%) and a 100 (100%) that specifies how much space should be reserved by default in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the default value, while DeletaReservationMax and DeltReservationMin set the upper and lower bounds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Reservation Default</em>' attribute.
	 * @see #setDeltaReservationDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_DeltaReservationDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StorageCapabilities.DeltaReservationMax\",\"CIM_StorageCapabilities.DeltaReservationMin\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getDeltaReservationDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getDeltaReservationDefault <em>Delta Reservation Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Reservation Default</em>' attribute.
	 * @see #getDeltaReservationDefault()
	 * @generated
	 */
	void setDeltaReservationDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Extent Stripe Length Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extent Stripe Length describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. 
	 * A NULL value for ExtentStripeLengthDefault indicates that the system does not support configuration of storage by specifying Stripe Length. 
	 * If Extent Stripe Length is supported, and this Capabilities instance is associated with a pool that was created with a range of QOS then ExtentStripeLengthDefault represents the default value. Other available values(such as min, max, and discrete values) can be determined by using the 'GetSupportedStripeLengths' and 'GetSupportedStripeLengthRange' methods. 
	 * If Extent Stripe Length is supported and the pool was created with a single specific QOS, representing a Raid group, set, or rank, then this property represents the current/fixed value for the pool, and Extent Stripe Length is not supported in subsequent creation of elements from this pool. Consequently, the 'GetSupportedStripeLength' methods cannot be used, and in a StorageSetting instance used as a goal when creating or modifying a child element of the pool, ExtentStripeLengthGoal, ExtentStripeLengthMin, and ExtentStripeLengthMax MUST be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Stripe Length Default</em>' attribute.
	 * @see #setExtentStripeLengthDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_ExtentStripeLengthDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1'"
	 * @generated
	 */
	Integer getExtentStripeLengthDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getExtentStripeLengthDefault <em>Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Stripe Length Default</em>' attribute.
	 * @see #getExtentStripeLengthDefault()
	 * @generated
	 */
	void setExtentStripeLengthDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Parity Layout Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ParityLayout specifies whether a parity-based storage organization is using rotated or non-rotated parity. If this capabilities instance is associated with a pool that was created with a range of QOS then ParityLayoutDefault represents the default value. Other available values can be determined by using the 'GetSupportedParityLayouts' method. If the pool was created with a single specific QOS, representing a Raid group, set, or rank, then this property represents the current/fixed value for the pool, and ParityLayout is not supported in subsequent creation of elements from this pool. Consequently, the 'GetSupportedParityLayouts' method cannot be used, and the ParityLayoutGoal property in StorageSetting instances used in child element operations on this pool MUST be set to NULL. A NULL value for ParityLayoutDefault indicates that the system does not support configuration of storage by specifying ParityLayout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parity Layout Default</em>' attribute.
	 * @see #setParityLayoutDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_ParityLayoutDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Non-Rotated Parity\",\"Rotated Parity\"]'"
	 * @generated
	 */
	Integer getParityLayoutDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getParityLayoutDefault <em>Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Layout Default</em>' attribute.
	 * @see #getParityLayoutDefault()
	 * @generated
	 */
	void setParityLayoutDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User Data Stripe Depth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. A NULL value for UserDataStripeDepthDefault indicates that the system does not support configuration of storage by specifying Stripe Depth. 
	 * If User Data Stripe Depth is supported, and this Capabilities instance is associated with a pool that was created with a range of QOS then UserDataStripeDepthDefault represents the default value. Other available values(such as min, max, and discrete values) can be determined by using the 'GetSupportedStripeDepths' and 'GetSupportedStripeDepthRange' methods. 
	 * If User Data Stripe Depth is supported and the pool was created with a single specific QOS, representing a Raid group, set, or rank, then this property represents the current/fixed value for the pool, and User Data Stripe Depth is not supported in subsequent creation of elements from this pool. Consequently, the 'GetSupportedStripeDepth' methods cannot be used, and in a StorageSetting instance used as a goal when creating or modifying a child element of the pool, UserDataStripeDepthGoal, UserDataStripeDepthMin, and UserDataStripeDepthMax MUST be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth Default</em>' attribute.
	 * @see #setUserDataStripeDepthDefault(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_UserDataStripeDepthDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MinValue='1' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepthDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getUserDataStripeDepthDefault <em>User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth Default</em>' attribute.
	 * @see #getUserDataStripeDepthDefault()
	 * @generated
	 */
	void setUserDataStripeDepthDefault(Long value);

	/**
	 * Returns the value of the '<em><b>Available Disk Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of DiskDrives which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Disk Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_AvailableDiskType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Hard Disk Drive\",\"Solid State Drive\",\"Hybrid\"]'"
	 * @generated
	 */
	EList<Integer> getAvailableDiskType();

	/**
	 * Returns the value of the '<em><b>Available Form Factor Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the types of disk form factors which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Form Factor Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_AvailableFormFactorType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Not Reported\",\"5.25 inch\",\"3.5 inch\",\"2.5 inch\",\"1.8 inch\"]'"
	 * @generated
	 */
	EList<Integer> getAvailableFormFactorType();

	/**
	 * Returns the value of the '<em><b>Available Interconnect Speed</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed of disk interfaces which are be available. Values are in bits/second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Interconnect Speed</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_AvailableInterconnectSpeed()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' PUnit='bit / second'"
	 * @generated
	 */
	EList<Long> getAvailableInterconnectSpeed();

	/**
	 * Returns the value of the '<em><b>Available Interconnect Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of disk interfaces which may be available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Interconnect Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_AvailableInterconnectType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"other\",\"SAS\",\"SATA\",\"SAS/SATA\",\"FC\",\"SOP\"]'"
	 * @generated
	 */
	EList<Integer> getAvailableInterconnectType();

	/**
	 * Returns the value of the '<em><b>Available RPM</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotational speed of disk media which are be available. Values are in revolutions per minute. SSD devices shall report 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available RPM</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_AvailableRPM()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' PUnit='revolution / minute'"
	 * @generated
	 */
	EList<Long> getAvailableRPM();

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property reflects support of the encryption feature implemented by some disk drives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see #setEncryption(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_Encryption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Not Supported\",\"Supported\"]'"
	 * @generated
	 */
	Integer getEncryption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageCapabilities#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Compression Rates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedCompressionRates identifies the compression rates that are supported by the implementation, including "None". If "None" is specified, then no other rate may be identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Compression Rates</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_SupportedCompressionRates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"None\",\"High\",\"Medium\",\"Low\",\"Implementation Decides\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCompressionRates();

	/**
	 * Returns the value of the '<em><b>Supported Data Organizations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of volume data organizations supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Data Organizations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageCapabilities_SupportedDataOrganizations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Fixed Block\",\"Variable Block\",\"Count Key Data\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedDataOrganizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to create and populate a StorageSetting instance from a StorageCapability instance. This removes the need to populate default settings and other settings in the context of each StorageCapabilities (which could be numerous). If the underlying instrumentation supports the StorageSettingWithHints subclass, then an instance of that class will be created instead.
	 * @param SettingType
	 *   If 'Default' is passed for the CreateDefault parameter, the Max, Goal, and Min setting attributes are set to the Default values of the parent StorageCapabilities when the instance is created. 
	 *   If set to 'Goal' the new StorageSetting attributes are set to the related attributes of the parent StorageCapabilities, e.g. Min to Min, Goal to Default, and Max to Max. 
	 *   
	 *   This method maybe deprecated in lieu of intrinsics once limitations in the CIM Operations are addressed.
	 * @param NewSetting Reference to the created StorageSetting instance.
	 * <!-- end-model-doc -->
	 * @model SettingTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\"]' Values='[\"Default\",\"Goal\"]'" NewSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateSetting(Integer SettingType, CIM_StorageSetting NewSetting);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support Parity-based storage organizations for volume or pool creation, this method can be used to the supported parity layouts.
	 * @param ParityLayout List of supported Parity for a Volume/Pool creation or modification.
	 * <!-- end-model-doc -->
	 * @model ParityLayoutUnique="false" ParityLayoutMany="true"
	 *        ParityLayoutAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ValueMap='[\"2\",\"3\"]' Values='[\"Non-Rotated Parity\",\"Rotated Parity\"]' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Choice not available for this capability\"]'"
	 * @generated
	 */
	Long GetSupportedParityLayouts(EList<Integer> ParityLayout);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support a range of UserDataStripeDepths for volume or pool creation, this method can be used to retrieve the supported range. Note that different implementations may support either the GetSupportedStripeDepths or the GetSupportedStripeDepthRange method. If the system only supports discrete values, then the return value will be set to 2.
	 * @param MinimumStripeDepth The minimum UserDataStripeDepth for a volume/pool in bytes.
	 * @param MaximumStripeDepth The maximum UserDataStripeDepth for a volume/pool in bytes.
	 * @param StripeDepthDivisor A volume/pool UserDataStripeDepth must be a multiple of this value which is specified in bytes.
	 * <!-- end-model-doc -->
	 * @model MinimumStripeDepthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' Units='Bytes' PUnit='byte'" MaximumStripeDepthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' Units='Bytes' PUnit='byte'" StripeDepthDivisorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true' Units='Bytes' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Use GetSupportedStripeDepths instead\",\"Choices not available for this Capability\"]'"
	 * @generated
	 */
	Long GetSupportedStripeDepthRange(Long MinimumStripeDepth, Long MaximumStripeDepth, Long StripeDepthDivisor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support discrete UserDataStripeDepths for volume or pool creation, this method can be used to retrieve a list of supported values. Note that different implementations may support either the GetSupportedStripeDepths or the GetSupportedStripeDepthRange method. If the system only supports a range of sizes, then the return value will be set to 2.
	 * @param StripeDepths List of supported UserDataStripeDepths for a Volume/Pool creation or modification.
	 * <!-- end-model-doc -->
	 * @model StripeDepthsUnique="false" StripeDepthsMany="true"
	 *        StripeDepthsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' In='false' Out='true' Units='Bytes' ArrayType='Indexed' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Use GetSupportedStripeDepthRange instead\",\"Choices not available for this Capability\"]'"
	 * @generated
	 */
	Long GetSupportedStripeDepths(EList<Long> StripeDepths);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support a range of ExtentStripeLengths for volume or pool creation, this method can be used to retrieve the supported range. Note that different implementations may support either the GetSupportedExtentLengths or the GetSupportedExtentLengthRange method. Also note that the advertised sizes may change after the call due to requests from other clients. If the system only supports discrete values, then the return value will be set to 3.
	 * @param MinimumStripeLength The minimum ExtentStripeDepth for a volume/pool in bytes.
	 * @param MaximumStripeLength The maximum ExtentStripeLength for a volume/pool in bytes.
	 * @param StripeLengthDivisor A volume/pool ExtentStripeLength must be a multiple of this value which is specified in bytes.
	 * <!-- end-model-doc -->
	 * @model MinimumStripeLengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='false' Out='true'" MaximumStripeLengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='false' Out='true'" StripeLengthDivisorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Choices not available for this Capability\",\"Use GetSupportedStripeLengths instead\"]'"
	 * @generated
	 */
	Long GetSupportedStripeLengthRange(Integer MinimumStripeLength, Integer MaximumStripeLength, Long StripeLengthDivisor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For systems that support discrete ExtentStripeLengths for volume or pool creation, this method can be used to retrieve a list of supported values. Note that different implementations may support either the GetSupportedStripeLengths or the GetSupportedStripeLengthRange method. Also note that the advertised sizes may change after the call due to requests from other clients. If the system only supports a range of sizes, then the return value will be set to 3.
	 * @param StripeLengths List of supported ExtentStripeLengths for a Volume/Pool creation or modification.
	 * <!-- end-model-doc -->
	 * @model StripeLengthsUnique="false" StripeLengthsMany="true"
	 *        StripeLengthsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='false' Out='true' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Choices not available for this Capability\",\"Use GetSupportedStripeLengthRange instead\"]'"
	 * @generated
	 */
	Long GetSupportedStripeLengths(EList<Integer> StripeLengths);

} // CIM_StorageCapabilities
