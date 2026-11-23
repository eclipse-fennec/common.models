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
 * A representation of the model object '<em><b>CIM Storage Setting With Hints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This subclass of AdvancedStorageSetting allows a client to specify 'hint's for optimization of the volume performance. The effect of these hints is implementation dependent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getDataAvailabilityHint <em>Data Availability Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessRandomnessHint <em>Access Randomness Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessDirectionHint <em>Access Direction Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessSizeHint <em>Access Size Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessLatencyHint <em>Access Latency Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessBandwidthWeight <em>Access Bandwidth Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getStorageCostHint <em>Storage Cost Hint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageSettingWithHints#getStorageEfficiencyHint <em>Storage Efficiency Hint</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageSettingWithHints extends CIM_AdvancedStorageSetting {
	/**
	 * Returns the value of the '<em><b>Data Availability Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client of the importance placed on data availability. Values are 0=Don't Care to 10=Very Important.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Availability Hint</em>' attribute.
	 * @see #setDataAvailabilityHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_DataAvailabilityHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getDataAvailabilityHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getDataAvailabilityHint <em>Data Availability Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Availability Hint</em>' attribute.
	 * @see #getDataAvailabilityHint()
	 * @generated
	 */
	void setDataAvailabilityHint(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Randomness Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client of the randomness of accesses. Values are 0=Entirely Sequential to 10=Entirely Random.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Randomness Hint</em>' attribute.
	 * @see #setAccessRandomnessHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_AccessRandomnessHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getAccessRandomnessHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessRandomnessHint <em>Access Randomness Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Randomness Hint</em>' attribute.
	 * @see #getAccessRandomnessHint()
	 * @generated
	 */
	void setAccessRandomnessHint(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Direction Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client of the direction of accesses. Values are 0=Entirely Read to 10=Entirely Write.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Direction Hint</em>' attribute.
	 * @see #setAccessDirectionHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_AccessDirectionHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getAccessDirectionHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessDirectionHint <em>Access Direction Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Direction Hint</em>' attribute.
	 * @see #getAccessDirectionHint()
	 * @generated
	 */
	void setAccessDirectionHint(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Size Hint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client of the optimal access sizes (in bytes). Since this property is an array, several sizes can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Size Hint</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_AccessSizeHint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	EList<Integer> getAccessSizeHint();

	/**
	 * Returns the value of the '<em><b>Access Latency Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client how important access latency is. Values are 0=Don't Care to 10=Very Important.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Latency Hint</em>' attribute.
	 * @see #setAccessLatencyHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_AccessLatencyHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getAccessLatencyHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessLatencyHint <em>Access Latency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Latency Hint</em>' attribute.
	 * @see #getAccessLatencyHint()
	 * @generated
	 */
	void setAccessLatencyHint(Integer value);

	/**
	 * Returns the value of the '<em><b>Access Bandwidth Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication from a client of bandwidth prioritization. Values are 0=Don't Care to 10=Very Important.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Bandwidth Weight</em>' attribute.
	 * @see #setAccessBandwidthWeight(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_AccessBandwidthWeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getAccessBandwidthWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getAccessBandwidthWeight <em>Access Bandwidth Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Bandwidth Weight</em>' attribute.
	 * @see #getAccessBandwidthWeight()
	 * @generated
	 */
	void setAccessBandwidthWeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Cost Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication of the importance the client places on the cost of storage. Values are 0=Don't Care to 10=Very Important. A StorageVolume provider might choose to place data on low cost or high cost drives based on this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Cost Hint</em>' attribute.
	 * @see #setStorageCostHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_StorageCostHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getStorageCostHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getStorageCostHint <em>Storage Cost Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Cost Hint</em>' attribute.
	 * @see #getStorageCostHint()
	 * @generated
	 */
	void setStorageCostHint(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Efficiency Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This hint is an indication of the importance placed on storage space efficiency by the client. Values are 0=Don't Care to 10=Very Important. A StorageVolume provider might choose different RAID levels based on this hint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Efficiency Hint</em>' attribute.
	 * @see #setStorageEfficiencyHint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingWithHints_StorageEfficiencyHint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' MinValue='0' MaxValue='10'"
	 * @generated
	 */
	Integer getStorageEfficiencyHint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageSettingWithHints#getStorageEfficiencyHint <em>Storage Efficiency Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Efficiency Hint</em>' attribute.
	 * @see #getStorageEfficiencyHint()
	 * @generated
	 */
	void setStorageEfficiencyHint(Integer value);

} // CIM_StorageSettingWithHints
