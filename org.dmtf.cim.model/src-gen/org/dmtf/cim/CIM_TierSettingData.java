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
 * A representation of the model object '<em><b>CIM Tier Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains various options for use by the TierService methods to offer clients additional controls to manipulate a storage tier. The values of this class's properties are used to set the corresponding values of a storage tier properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderGoal <em>Relative Performance Order Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getStorageObjectType <em>Storage Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getStorageTierCharacteristics <em>Storage Tier Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getCompressionIdleInterval <em>Compression Idle Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TierSettingData#getCompressionRate <em>Compression Rate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TierSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Relative Performance Order Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number starting from 0 to indicate the relative performance characteristics of the storage tier. The smaller the number, the higher the performance characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Goal</em>' attribute.
	 * @see #setRelativePerformanceOrderGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_RelativePerformanceOrderGoal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_TierSettingData.RelativePerformanceOrderMin\",\"CIM_TierSettingData.RelativePerformanceOrderMax\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderGoal <em>Relative Performance Order Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Goal</em>' attribute.
	 * @see #getRelativePerformanceOrderGoal()
	 * @generated
	 */
	void setRelativePerformanceOrderGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the minimum value for RelativePerformanceOrder that this storage tier can have.
	 * The minimum value for RelativePerformanceOrder that this storage tier can have, which represents the highest level of performance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Min</em>' attribute.
	 * @see #setRelativePerformanceOrderMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_RelativePerformanceOrderMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_TierSettingData.RelativePerformanceOrderGoal\",\"CIM_TierSettingData.RelativePerformanceOrderMax\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Min</em>' attribute.
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 */
	void setRelativePerformanceOrderMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maxmimum value for RelativePerformanceOrder that this storage tier can have.
	 * The maximum value for RelativePerformanceOrder that this storage tier can have, which represents the lowest level of performance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Max</em>' attribute.
	 * @see #setRelativePerformanceOrderMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_RelativePerformanceOrderMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_TierSettingData.RelativePerformanceOrderMin\",\"CIM_TierSettingData.RelativePerformanceOrderGoal\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Max</em>' attribute.
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 */
	void setRelativePerformanceOrderMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the type of storage objects comprising a storage tier. ComponentsOfStoragePool: Storage tier is comprised of ConcreteComponents of a StoragePool. ElementsOfStoragePool: Storage tier is comprised of elements, e.g. volumes, allocated from a StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Object Type</em>' attribute.
	 * @see #setStorageObjectType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_StorageObjectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"StorageVolume\",\"LogicalDisk\",\"StorageExtent\",\"StoragePool\",\"ComponentsOfStoragePool\",\"ElementsOfStoragePool\",\"External StoragePool\",\"Primordial StorageExtent\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_TierServiceCapabilities.SupportedStorageObjects\"]'"
	 * @generated
	 */
	Integer getStorageObjectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getStorageObjectType <em>Storage Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Object Type</em>' attribute.
	 * @see #getStorageObjectType()
	 * @generated
	 */
	void setStorageObjectType(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Tier Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the storage tier charateristics. Performance generally relates to the underlying technology, for example, Solid State versus Fibre Channel drives. QoS refers to the Quality of Service, for example, RAID protected versus unprotected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Tier Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_StorageTierCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"BasedOnPerformance Only\",\"BasedOnQOS Only\",\"BasedOnPerformance And BasedOnQOS\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getStorageTierCharacteristics();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technology of the underlying disk drives used. Not Applicable: Storage tier is not based on technology of underlying components. 
	 * Mixed: a storage tier consists of a mix of different disk drive technologies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_Technology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Solid State Drive\",\"Fibre Channel\",\"SATA\",\"SAS\",\"Mixed\",\"Hard Disk Drive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageTier.Technology\"]'"
	 * @generated
	 */
	Integer getTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the storage tier is actively being used or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #setInitialState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_InitialState()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getInitialState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(Integer value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true any new objects added to the system that have a similar performance characteristics (and QoS) to this tier become part of this tier automatically. If false, the new objects needs to be added to this tier manually.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_Dynamic()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDynamic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #getDynamic()
	 * @generated
	 */
	void setDynamic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete On Empty Storage Tier</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true and empty storage tiers are allowed, the storage tier will be deleted when the last component object is removed from the storage tier. If empty storage tiers are not allowed, the storage tier will be deleted automatically when the last component object is removed from the storage tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Empty Storage Tier</em>' attribute.
	 * @see #setDeleteOnEmptyStorageTier(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_DeleteOnEmptyStorageTier()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnEmptyStorageTier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Empty Storage Tier</em>' attribute.
	 * @see #getDeleteOnEmptyStorageTier()
	 * @generated
	 */
	void setDeleteOnEmptyStorageTier(Boolean value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value between 0 to 100 to indicate the maximum percentage of the underlying capacity that can be used for storage tiering activities. For example, a value of 80 indicates no more than 80 percent of the storage tier can be used for automated tiering. The remaining 20 percent of the underlying storage is set aside for elements that do not participate in automated storage tiering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_Percentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true'"
	 * @generated
	 */
	Integer getPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Compression Idle Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of days data on a volume must be idle before the Automated Storage Tiering subsystem starts compressing the data. Valid interval must be in number of days between 1 and 365.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Idle Interval</em>' attribute.
	 * @see #setCompressionIdleInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_CompressionIdleInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' Units='Days' MinValue='1' MaxValue='365' PUnit='day'"
	 * @generated
	 */
	String getCompressionIdleInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getCompressionIdleInterval <em>Compression Idle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Idle Interval</em>' attribute.
	 * @see #getCompressionIdleInterval()
	 * @generated
	 */
	void setCompressionIdleInterval(String value);

	/**
	 * Returns the value of the '<em><b>Compression Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the rate at which the Automated Storage Tiering subsystem compresses the data. The smaller the number, the higher the rate of compression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Rate</em>' attribute.
	 * @see #setCompressionRate(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TierSettingData_CompressionRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='1' MaxValue='10'"
	 * @generated
	 */
	Integer getCompressionRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TierSettingData#getCompressionRate <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Rate</em>' attribute.
	 * @see #getCompressionRate()
	 * @generated
	 */
	void setCompressionRate(Integer value);

} // CIM_TierSettingData
