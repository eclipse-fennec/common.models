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
 * A representation of the model object '<em><b>CIM Storage Tier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a collection of storage objects, such as a collection of StorageExtents identified as a storage tier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getRelativePerformanceOrder <em>Relative Performance Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getStorageObjectType <em>Storage Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTier#getTotalCapacity <em>Total Capacity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageTier extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Relative Performance Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number starting from 0 to indicate the relative performance characteristics of the storage tier. The smaller the number, the higher the performance characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order</em>' attribute.
	 * @see #setRelativePerformanceOrder(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_RelativePerformanceOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRelativePerformanceOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getRelativePerformanceOrder <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order</em>' attribute.
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 */
	void setRelativePerformanceOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the type of storage objects comprising a storage tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Object Type</em>' attribute.
	 * @see #setStorageObjectType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_StorageObjectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"StorageExtent\",\"StoragePool\",\"StorageVolume\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getStorageObjectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getStorageObjectType <em>Storage Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Object Type</em>' attribute.
	 * @see #getStorageObjectType()
	 * @generated
	 */
	void setStorageObjectType(Integer value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_Technology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Solid State Drive\",\"Fibre Channel\",\"SATA\",\"SAS\",\"Mixed\",\"Hard Disk Drive\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Integer value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the storage tier is actively being used or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_State()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Integer value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_Dynamic()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDynamic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getDynamic <em>Dynamic</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_DeleteOnEmptyStorageTier()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnEmptyStorageTier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_Percentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true'"
	 * @generated
	 */
	Integer getPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total capacity of the storage tier in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Capacity</em>' attribute.
	 * @see #setTotalCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTier_TotalCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte'"
	 * @generated
	 */
	Long getTotalCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTier#getTotalCapacity <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Capacity</em>' attribute.
	 * @see #getTotalCapacity()
	 * @generated
	 */
	void setTotalCapacity(Long value);

} // CIM_StorageTier
