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
 * A representation of the model object '<em><b>CIM Memory Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MemoryAllocationSettingData class represents settings used when allocating a memory extent. Instances can represent a default or staged setting in which case they are not associated with an existing extent. Instances can also represent the specific settings used when allocating an existing extent in which case they are assocated to that memory extent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getChannelInterleaveSize <em>Channel Interleave Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getChannelCount <em>Channel Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getControllerInterleaveSize <em>Controller Interleave Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getReplication <em>Replication</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' override.ResourceType='uint16' override.ResourceType.Description='The type of resource this allocation setting represents. \n\"Memory\" volatile memory. \n\"Non-Volatile Memory\" memory that is energy backed or otherwise persistent media.' override.ResourceType.ValueMap='[\"0\",\"1\",\"4\",\"35\",\"..\",\"0x8000..0xFFFF\"]' override.ResourceType.Values='[\"Unknown\",\"Other\",\"Memory\",\"Non-Volatile Memory\",\"DMTF reserved\",\"Vendor Reserved\"]' override.ResourceType.ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.OtherResourceType\",\"CIM_ResourceAllocationSettingData.ResourceSubType\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryAllocationSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Channel Interleave Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the amount of data written to a given channel before switching to the next channel when a channel interleave scheme is in use. This value is given as the exponent in an exponential expression with 2 as the base. Example: 64B would be given as 6, 2**6=64B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Interleave Size</em>' attribute.
	 * @see #setChannelInterleaveSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryAllocationSettingData_ChannelInterleaveSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getChannelInterleaveSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getChannelInterleaveSize <em>Channel Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Interleave Size</em>' attribute.
	 * @see #getChannelInterleaveSize()
	 * @generated
	 */
	void setChannelInterleaveSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Channel Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the number of channels involved in the channel interleave scheme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Count</em>' attribute.
	 * @see #setChannelCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryAllocationSettingData_ChannelCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getChannelCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getChannelCount <em>Channel Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Count</em>' attribute.
	 * @see #getChannelCount()
	 * @generated
	 */
	void setChannelCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Controller Interleave Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the amount of data written by a given memory controller before switching to the next controller when a memory controller interleave scheme is in use. This value is given as the exponent in an exponential expression with 2 as the base. Example: 64B would be given as 6, 2**6=64B
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Interleave Size</em>' attribute.
	 * @see #setControllerInterleaveSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryAllocationSettingData_ControllerInterleaveSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getControllerInterleaveSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getControllerInterleaveSize <em>Controller Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Interleave Size</em>' attribute.
	 * @see #getControllerInterleaveSize()
	 * @generated
	 */
	void setControllerInterleaveSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether replication is requested/in-use. 
	 * "Not Replicated" No replication taking place. 
	 * "Local Replication" Replication to resources within the same system. 
	 * "Remote Replication" Replication to resources external to the system containing the primary copy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see #setReplication(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryAllocationSettingData_Replication()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Not Replicated\",\"Local Replication\",\"Remote Replication\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getReplication();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryAllocationSettingData#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(Integer value);

} // CIM_MemoryAllocationSettingData
