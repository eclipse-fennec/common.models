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
 * A representation of the model object '<em><b>CIM Resource Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ResourceAllocationSettingData class represents settings specifically related to an allocated resource that are outside the scope of the CIM class typically used to represent the resource itself. These settings include information specific to the allocation that may not be visible to the consumer of the resource itself. For example, a virtual processor may look like a 2 ghz processor to the consumer (virtual computer system), however the virtualization system may use time-slicing to schedule the the virtual processor to only allow it to use 1 ghz.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getPoolID <em>Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getConsumerVisibility <em>Consumer Visibility</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getHostResource <em>Host Resource</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getVirtualQuantity <em>Virtual Quantity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getReservation <em>Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAutomaticAllocation <em>Automatic Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAutomaticDeallocation <em>Automatic Deallocation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getParent <em>Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAddress <em>Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getMappingBehavior <em>Mapping Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAddressOnParent <em>Address On Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getVirtualQuantityUnits <em>Virtual Quantity Units</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.24.0' UMLPackagePath='CIM::Core::Resource' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ResourceAllocationSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource this allocation setting represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_ResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Other\",\"Computer System\",\"Processor\",\"Memory\",\"IDE Controller\",\"Parallel SCSI HBA\",\"FC HBA\",\"iSCSI HBA\",\"IB HCA\",\"Ethernet Adapter\",\"Other Network Adapter\",\"I/O Slot\",\"I/O Device\",\"Floppy Drive\",\"CD Drive\",\"DVD drive\",\"Disk Drive\",\"Tape Drive\",\"Storage Extent\",\"Other storage device\",\"Serial port\",\"Parallel port\",\"USB Controller\",\"Graphics controller\",\"IEEE 1394 Controller\",\"Partitionable Unit\",\"Base Partitionable Unit\",\"Power\",\"Cooling Capacity\",\"Ethernet Switch Port\",\"Logical Disk\",\"Storage Volume\",\"Ethernet Connection\",\"DMTF reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.OtherResourceType\",\"CIM_ResourceAllocationSettingData.ResourceSubType\"]'"
	 * @generated
	 */
	Integer getResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getResourceType <em>Resource Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_OtherResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.ResourceType\"]'"
	 * @generated
	 */
	String getOtherResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getOtherResourceType <em>Other Resource Type</em>}' attribute.
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
	 * A string describing an implementation specific sub-type for this resource. For example, this may be used to distinguish different models of the same resource type.The property value shall conform to this format (in ABNF): vs-type = dmtf-value / other-org-value / legacy-value dmtf-value = "DMTF:" defining-org ":" org-vs-type org-value = defining-org ":" org-vs-type
	 * Where: dmtf-value: is a property value defined by DMTF and is defined in the description of this property. other-org-value: is a property value defined by a business entity other than DMTF and is not defined in the description of this property. legacy-value: is a property value defined by a business entity other than DMTF and is not defined in the description of this property. These values are permitted but recommended to be deprecated over time. defining-org:
	 * is an identifier for the business entity that defines the virtual system type. It shall include a copyrighted, trademarked, or otherwise unique name that is owned by that business entity. It shall not be "DMTF" and shall not contain a colon (:). org-vs-type:
	 * is an identifier for the virtual system type within the defining business entity. It shall be unique within the defining-org. It may use any character allowed for CIM strings, except for the following: U0000-U001F (Unicode C0 controls) U0020 (space), note that the reason is that OVF allows for multiple space-separated vs-type values in this property. U007F (Unicode C0 controls) U0080-U009F (Unicode C1 controls)
	 * If there is a need to structure the value into segments, the segments should be separated with a single colon (:).
	 * The values of this property shall be processed case sensitively. They are intended to be processed programmatically (instead of being a display name) and should be short.
	 * The following DMTF values are defined: DMTF:unknown - the resource sub-type is unknown or cannot be determined
	 * Developers should consult the relevant profile for defined values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #setResourceSubType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_ResourceSubType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.ResourceType\"]'"
	 * @generated
	 */
	String getResourceSubType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getResourceSubType <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #getResourceSubType()
	 * @generated
	 */
	void setResourceSubType(String value);

	/**
	 * Returns the value of the '<em><b>Pool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies which ResourcePool the resource is currently allocated from, or which ResourcePool the resource will be allocated from when the allocation occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool ID</em>' attribute.
	 * @see #setPoolID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_PoolID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourcePool.PoolId\"]'"
	 * @generated
	 */
	String getPoolID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getPoolID <em>Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool ID</em>' attribute.
	 * @see #getPoolID()
	 * @generated
	 */
	void setPoolID(String value);

	/**
	 * Returns the value of the '<em><b>Consumer Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the consumers visibility to the allocated resource.
	 * A value of "Passed-Through" indicates the underlying or host resource is utilized and passed through to the consumer, possibly using partitioning. At least one item shall be present in the HostResource property. 
	 * A value of "Virtualized" indicates the resource is virtualized and may not map directly to an underlying/host resource. Some implementations may support specific assignment for virtualized resources, in which case the host resource(s) are exposed using the HostResource property. 
	 * A value of "Not represented" indicates a representation of the resource does not exist within the context of the resource consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer Visibility</em>' attribute.
	 * @see #setConsumerVisibility(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_ConsumerVisibility()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32767..65535\"]' Values='[\"Unknown\",\"Passed-Through\",\"Virtualized\",\"Not represented\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getConsumerVisibility();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getConsumerVisibility <em>Consumer Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Visibility</em>' attribute.
	 * @see #getConsumerVisibility()
	 * @generated
	 */
	void setConsumerVisibility(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Resource</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property exposes specific assignment of resources. Each non-null value of the HostResource property shall be formated as a URI per RFC3986.
	 * If this resource is modeled then a value should be a WBEM URI (DSP0207). If the resource is not modeled then see the appropriate profile. 
	 * Profiles may further constrain the type of URI. A NULL value or empty array requests the implementation decide the kind of host resource.
	 * If the virtual resource is mapped to more than oneunderlying resource, this property may be left NULL.
	 * If NULL, the DeviceAllocatedFromPool or ResourceAllocationFromPool associations may be used to determine the pool of host resources this virtual resource may use. If specific assignment is utilized, all underlying resources used by this virtual resource should be listed.The kind of dependency is specified by the ConsumerVisibility and the MappingBehavior properties. Typically the array contains one item, however multiple host resources may be specified. 
	 * A client may set the value(s) to indicate that the requested virtual resource allocation be based on host resources that are identified by element values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Resource</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_HostResource()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.ConsumerVisibility\",\"CIM_ResourceAllocationSettingData.MappingBehavior\"]'"
	 * @generated
	 */
	EList<String> getHostResource();

	/**
	 * Returns the value of the '<em><b>Allocation Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. 
	 * It is expected that profiles constrain the units that apply in context of particular resource types.
	 * The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Annex C.1 of DSP0004 V2.5 or later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Units</em>' attribute.
	 * @see #setAllocationUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_AllocationUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.Reservation\",\"CIM_ResourceAllocationSettingData.Limit\"]' IsPUnit='true'"
	 * @generated
	 */
	String getAllocationUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAllocationUnits <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Units</em>' attribute.
	 * @see #getAllocationUnits()
	 * @generated
	 */
	void setAllocationUnits(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the quantity of resources presented to the consumer. For example, when ResourceType=Processor, this property would reflect the number of discrete Processors presented to the virtual computer system. When ResourceType=Memory, this property could reflect the number of MB reported to the virtual computer system.
	 * The value of the VirtualQuantity property should be expressed in units as defined by the value of the VirtualQuantityUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Quantity</em>' attribute.
	 * @see #setVirtualQuantity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_VirtualQuantity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.VirtualQuantityUnits\"]'"
	 * @generated
	 */
	Long getVirtualQuantity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getVirtualQuantity <em>Virtual Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Quantity</em>' attribute.
	 * @see #getVirtualQuantity()
	 * @generated
	 */
	void setVirtualQuantity(Long value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the amount of resource guaranteed to be available for this allocation. On system which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
	 * The value of the Reservation property is expressed in the unit specified by the value of the AllocationUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reservation</em>' attribute.
	 * @see #setReservation(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Reservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.AllocationUnits\"]'"
	 * @generated
	 */
	Long getReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getReservation <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' attribute.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Long value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the upper bound, or maximum amount of resource that will be granted for this allocation. For example, a system which supports memory paging may support setting the Limit of a Memory allocation below that of the VirtualQuantity, thus forcing paging to occur for this allocation.
	 * The value of the Limit property is expressed in the unit specified by the value of the AllocationUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Limit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.AllocationUnits\"]'"
	 * @generated
	 */
	Long getLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies a relative priority for this allocation in relation to other allocations from the same ResourcePool. This property has no unit of measure, and is only relevant when compared to other allocations vying for the same host resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Weight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Long value);

	/**
	 * Returns the value of the '<em><b>Automatic Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies if the resource will be automatically allocated. For example when set to true, when the consuming virtual computer system is powered on, this resource would be allocated. A value of false indicates the resource must be explicitly allocated. For example, the setting may represent removable media (cdrom, floppy, etc.) where at power on time, the media is not present. An explicit operation is required to allocate the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Allocation</em>' attribute.
	 * @see #setAutomaticAllocation(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_AutomaticAllocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAutomaticAllocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAutomaticAllocation <em>Automatic Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Allocation</em>' attribute.
	 * @see #getAutomaticAllocation()
	 * @generated
	 */
	void setAutomaticAllocation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Automatic Deallocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies if the resource will be automatically de-allocated. For example, when set to true, when the consuming virtual computer system is powered off, this resource would be de-allocated. When set to false, the resource will remain allocated and must be explicitly de-allocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Deallocation</em>' attribute.
	 * @see #setAutomaticDeallocation(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_AutomaticDeallocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAutomaticDeallocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAutomaticDeallocation <em>Automatic Deallocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Deallocation</em>' attribute.
	 * @see #getAutomaticDeallocation()
	 * @generated
	 */
	void setAutomaticDeallocation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parent of the resource. For example, a controller for the current allocation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Parent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The thing to which this resource is connected. For example, a named network or switch port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Connection()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getConnection();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address of the resource. For example, the MAC address of a Ethernet port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Mapping Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how this resource maps to underlying resourcesIf the HostResource array contains any entries, this property reflects how the resource maps to those specific resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping Behavior</em>' attribute.
	 * @see #setMappingBehavior(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_MappingBehavior()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32767..65535\"]' Values='[\"Unknown\",\"Not Supported\",\"Dedicated\",\"Soft Affinity\",\"Hard Affinity\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getMappingBehavior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getMappingBehavior <em>Mapping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Behavior</em>' attribute.
	 * @see #getMappingBehavior()
	 * @generated
	 */
	void setMappingBehavior(Integer value);

	/**
	 * Returns the value of the '<em><b>Address On Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the address of this resource in the context of the Parent. The Parent/AddressOnParent properties are used to describe the controller relationship as well the ordering of devices on a controller.For example, if the parent is a PCI Controller, this property would specify the PCI slot of this child device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address On Parent</em>' attribute.
	 * @see #setAddressOnParent(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_AddressOnParent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddressOnParent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getAddressOnParent <em>Address On Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address On Parent</em>' attribute.
	 * @see #getAddressOnParent()
	 * @generated
	 */
	void setAddressOnParent(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Quantity Units</b></em>' attribute.
	 * The default value is <code>"count"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the units used by the VirtualQuantity property. For example
	 * - if ResourceType=Processor, the value of the VirtualQuantityUnits property may be set to "count", indicating that the value of the VirtualQuantity property is expressed as a count.
	 * - if ResourceType=Memory, the value of the VirtualQuantityUnits property may be set to "bytes*10^3", indicating that the value of the VirtualQuantity property is expressed in kilobyte.
	 * It is expected that profiles constrain the units that apply in context of particular resource types.
	 * The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Annex C.1 of DSP0004 V2.5 or later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Quantity Units</em>' attribute.
	 * @see #setVirtualQuantityUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationSettingData_VirtualQuantityUnits()
	 * @model default="count"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.VirtualQuantity\"]' IsPUnit='true'"
	 * @generated
	 */
	String getVirtualQuantityUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourceAllocationSettingData#getVirtualQuantityUnits <em>Virtual Quantity Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Quantity Units</em>' attribute.
	 * @see #getVirtualQuantityUnits()
	 * @generated
	 */
	void setVirtualQuantityUnits(String value);

} // CIM_ResourceAllocationSettingData
