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
 * A representation of the model object '<em><b>CIM Allocation Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AllocationCapabilities extends the CIM_Capabilities class for the purposes of expressing the resource allocation capabilities of the associated managed element for the allocation of a specific Resource Type. This class describes the supported types of allocations allowed, specific or general, the sharing modes supported for the device, dedicated and or shared and the system states where the addition or removal of the Resource Type is allowed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getRequestTypesSupported <em>Request Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getSharingMode <em>Sharing Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getSupportedAddStates <em>Supported Add States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AllocationCapabilities#getSupportedRemoveStates <em>Supported Remove States</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AllocationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource this allocation setting represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_ResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Other\",\"Computer System\",\"Processor\",\"Memory\",\"IDE Controller\",\"Parallel SCSI HBA\",\"FC HBA\",\"iSCSI HBA\",\"IB HCA\",\"Ethernet Adapter\",\"Other Network Adapter\",\"I/O Slot\",\"I/O Device\",\"Floppy Drive\",\"CD Drive\",\"DVD drive\",\"Disk Drive\",\"Tape Drive\",\"Storage Extent\",\"Other Storage Device\",\"Serial port\",\"Parallel port\",\"USB Controller\",\"Graphics controller\",\"IEEE 1394 Controller\",\"Partitionable Unit\",\"Base Partitionable Unit\",\"Power\",\"Cooling Capacity\",\"Ethernet Switch Port\",\"Logical Disk\",\"Storage Volume\",\"Ethernet Connection\",\"DMTF reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_AllocationCapabilities.OtherResourceType\",\"CIM_ResourceAllocationSettingData.ResourceType\"]'"
	 * @generated
	 */
	Integer getResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationCapabilities#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the resource type when a well defined value is not available and ResourceType has the value "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Resource Type</em>' attribute.
	 * @see #setOtherResourceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_OtherResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.ResourceType\"]'"
	 * @generated
	 */
	String getOtherResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationCapabilities#getOtherResourceType <em>Other Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Resource Type</em>' attribute.
	 * @see #getOtherResourceType()
	 * @generated
	 */
	void setOtherResourceType(String value);

	/**
	 * Returns the value of the '<em><b>Resource Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #setResourceSubType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_ResourceSubType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getResourceSubType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationCapabilities#getResourceSubType <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #getResourceSubType()
	 * @generated
	 */
	void setResourceSubType(String value);

	/**
	 * Returns the value of the '<em><b>Request Types Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether requesting a specific resource is supported 
	 * "Specific" -- request can include a request for specific resource 
	 * "General" -- request does not include specific resource 
	 * "Both" -- both specific and general requests are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Types Supported</em>' attribute.
	 * @see #setRequestTypesSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_RequestTypesSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Specific\",\"General\",\"Both\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getRequestTypesSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationCapabilities#getRequestTypesSupported <em>Request Types Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Types Supported</em>' attribute.
	 * @see #getRequestTypesSupported()
	 * @generated
	 */
	void setRequestTypesSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Sharing Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how access to underlying resource is granted: 
	 * "Dedicated" -- exclusive access to underlying resource 
	 * "Shared" -- shared use of underlying resource. 
	 * Actual quantity is controlled by min, max size, weights, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing Mode</em>' attribute.
	 * @see #setSharingMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_SharingMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Dedicated\",\"Shared\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getSharingMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocationCapabilities#getSharingMode <em>Sharing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing Mode</em>' attribute.
	 * @see #getSharingMode()
	 * @generated
	 */
	void setSharingMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Add States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the states that the System, to which the resource will be associated via SystemDevice, may be in when a new resource is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Add States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_SupportedAddStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"Paused\",\"Suspended\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAddStates();

	/**
	 * Returns the value of the '<em><b>Supported Remove States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the states that the System, to which the resource is associated via SystemDevice, may be in when a the resource is removed .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Remove States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocationCapabilities_SupportedRemoveStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"Paused\",\"Suspended\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedRemoveStates();

} // CIM_AllocationCapabilities
