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
 * A representation of the model object '<em><b>CIM Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ResourcePool is a logical entity (with associated controls)provided by the host system for the purpose of allocation and assignment of resources. A given ResourcePool may be used to allocate resources of a specific type. Hierarchies of ResourcePools may be created to provide administrative control over allocations. In the cases where resources are subdivided, multiple resource pools may exist (e.g. nodal boundaries in NUMA-like systems). In systems that support over commitment, pools represent the reservable capacity, not an upper bound or limit on the maximum amount that can be allocated. Admission control during power on may detect and prevent systems from powering due to resource exhaustion. For example, over commitment on a ResourcePool with ResourceType=Memory would require that sufficient space be available in some backing-store, that may be managed through a storage ResourcePool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getPoolID <em>Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getPrimordial <em>Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getConsumedResourceUnits <em>Consumed Resource Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getCurrentlyConsumedResource <em>Currently Consumed Resource</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePool#getMaxConsumableResource <em>Max Consumable Resource</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.44.0' UMLPackagePath='CIM::Core::Resource' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must ensure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ResourcePool extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Pool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An opaque identifier for the pool. This property is used to provide correlation across save and restore of configuration data to underlying persistent storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool ID</em>' attribute.
	 * @see #setPoolID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_PoolID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.PoolId\"]'"
	 * @generated
	 */
	String getPoolID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getPoolID <em>Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool ID</em>' attribute.
	 * @see #getPoolID()
	 * @generated
	 */
	void setPoolID(String value);

	/**
	 * Returns the value of the '<em><b>Primordial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, "Primordial" indicates that this ResourcePool is a base from which resources are drawn and returned in the activity of resource management. Being primordial means that this ResourcePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial ResourcePools. If false, "Primordial" indicates that the ResourcePool, a concrete Resource Pool, is subject to resource allocation services functions. This distinction is important because higher-level ResourcePools may be assembled using the Component or ElementAllocatedFromPool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based ResourcePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primordial</em>' attribute.
	 * @see #setPrimordial(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_Primordial()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrimordial();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getPrimordial <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primordial</em>' attribute.
	 * @see #getPrimordial()
	 * @generated
	 */
	void setPrimordial(Boolean value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the maximum amount (in units of AllocationUnits) of reservations that the ResourcePool can support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_Capacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the current reservations (in units of AllocationUnits) spread across all active allocations from this pool. In a hierarchical configuration, this represents the sum of all descendant ResourcePool current reservations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_Reserved()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getReserved();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Long value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource this ResourcePool may allocate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_ResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Other\",\"Computer System\",\"Processor\",\"Memory\",\"IDE Controller\",\"Parallel SCSI HBA\",\"FC HBA\",\"iSCSI HBA\",\"IB HCA\",\"Ethernet Adapter\",\"Other Network Adapter\",\"I/O Slot\",\"I/O Device\",\"Floppy Drive\",\"CD Drive\",\"DVD drive\",\"Disk Drive\",\"Tape Drive\",\"Storage Extent\",\"Other storage device\",\"Serial port\",\"Parallel port\",\"USB Controller\",\"Graphics controller\",\"IEEE 1394 Controller\",\"Partitionable Unit\",\"Base Partitionable Unit\",\"Power\",\"Cooling Capacity\",\"Ethernet Switch Port\",\"Logical Disk\",\"Storage Volume\",\"Ethernet Connection\",\"Multi-Mode Memory\",\"Non-Volatile Memory\",\"DMTF reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ResourcePool.OtherResourceType\",\"CIM_ResourcePool.ResourceSubType\"]'"
	 * @generated
	 */
	Integer getResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getResourceType <em>Resource Type</em>}' attribute.
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
	 * A string that describes the resource type when a well defined value is not available and ResourceType is set to 0 for Other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Resource Type</em>' attribute.
	 * @see #setOtherResourceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_OtherResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourcePool.ResourceType\"]'"
	 * @generated
	 */
	String getOtherResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getOtherResourceType <em>Other Resource Type</em>}' attribute.
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
	 * A string describing an implementation specific sub-type for this pool. For example, this may be used to distinguish different models of the same resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #setResourceSubType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_ResourceSubType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourcePool.ResourceType\"]'"
	 * @generated
	 */
	String getResourceSubType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getResourceSubType <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Sub Type</em>' attribute.
	 * @see #getResourceSubType()
	 * @generated
	 */
	void setResourceSubType(String value);

	/**
	 * Returns the value of the '<em><b>Allocation Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the units of allocation used by the Reservation and Limit properties. For example, when ResourceType=Processor, AllocationUnits may be set to hertz*10^6 or percent. When ResourceType=Memory, AllocationUnits may be set to bytes*10^3. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Units</em>' attribute.
	 * @see #setAllocationUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_AllocationUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' IsPUnit='true'"
	 * @generated
	 */
	String getAllocationUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getAllocationUnits <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Units</em>' attribute.
	 * @see #getAllocationUnits()
	 * @generated
	 */
	void setAllocationUnits(String value);

	/**
	 * Returns the value of the '<em><b>Consumed Resource Units</b></em>' attribute.
	 * The default value is <code>"count"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the units for the MaxConsumable and the Consumed properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumed Resource Units</em>' attribute.
	 * @see #setConsumedResourceUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_ConsumedResourceUnits()
	 * @model default="count"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ResourcePool.MaxConsumableResource\",\"CIM_ResourcePool.CurrentlyConsumedResource\"]' IsPUnit='true'"
	 * @generated
	 */
	String getConsumedResourceUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getConsumedResourceUnits <em>Consumed Resource Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Resource Units</em>' attribute.
	 * @see #getConsumedResourceUnits()
	 * @generated
	 */
	void setConsumedResourceUnits(String value);

	/**
	 * Returns the value of the '<em><b>Currently Consumed Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the amount of resource that the resource pool currently presents to consumers.
	 * This property is different from the Reserved property in that it describes the consumers view of the resource while the Reserved property describes the producers view of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currently Consumed Resource</em>' attribute.
	 * @see #setCurrentlyConsumedResource(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_CurrentlyConsumedResource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourcePool.ConsumedResourceUnits\"]'"
	 * @generated
	 */
	Long getCurrentlyConsumedResource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getCurrentlyConsumedResource <em>Currently Consumed Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently Consumed Resource</em>' attribute.
	 * @see #getCurrentlyConsumedResource()
	 * @generated
	 */
	void setCurrentlyConsumedResource(Long value);

	/**
	 * Returns the value of the '<em><b>Max Consumable Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the maximum of amount of consumable resource that the resource pool can present to consumers.
	 * This property is different from the Capacity property in that it describes the consumers view of the resource while the Capacity property describes the producers view of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Consumable Resource</em>' attribute.
	 * @see #setMaxConsumableResource(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePool_MaxConsumableResource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourcePool.ConsumedResourceUnits\"]'"
	 * @generated
	 */
	Long getMaxConsumableResource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ResourcePool#getMaxConsumableResource <em>Max Consumable Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Consumable Resource</em>' attribute.
	 * @see #getMaxConsumableResource()
	 * @generated
	 */
	void setMaxConsumableResource(Long value);

} // CIM_ResourcePool
