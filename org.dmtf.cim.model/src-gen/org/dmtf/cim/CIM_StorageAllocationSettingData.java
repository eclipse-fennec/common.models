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
 * A representation of the model object '<em><b>CIM Storage Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_StorageAllocationSettingData class represents settings specifically related to the allocation of virtual storage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getVirtualResourceBlockSize <em>Virtual Resource Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostResourceBlockSize <em>Host Resource Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentStartingAddress <em>Host Extent Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentName <em>Host Extent Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentNameFormat <em>Host Extent Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getOtherHostExtentNameFormat <em>Other Host Extent Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentNameNamespace <em>Host Extent Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getOtherHostExtentNameNamespace <em>Other Host Extent Name Namespace</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Resource' override.VirtualQuantity='uint64' override.VirtualQuantity.Description='Number of blocks that are presented to the consumer. The blocksize is specified by the value of the VirtualResourceBlockSize property.' override.VirtualQuantity.ModelCorrespondence='[\"CIM_StorageExtent.NumberOfBlocks\",\"CIM_StorageAllocationSettingData.VirtualQuantityUnits\"]' override.VirtualQuantityUnits='string' override.VirtualQuantityUnits.Description='This property specifies the units used by the VirtualQuantity property. The value shall match \"count(fixed size block)\" | \"byte\".\nThe default value \"count(fixed size block)\" assumes that the implementation knows a fixed block size and conveys the block size through the value of the VirtualResourceBlockSize property. However, if the VirtualResourceBlockSize property has a value \"1\", this indicates an unknown or variable block size; in this case the value of the VirtualQuantityUnit property should be set to \"byte\", such that the value of the VirtualQuantity property is measured directly in byte.\nNOTE: The IsPUnit qualifier already formally restricts the value of this property to be a unit as specified in DMTF DSP0004:2.5.0, Annex C; in addition, the normative text in the description of this property above further constrains the value to match \"byte\" | \"count(fixed size block)\".' override.VirtualQuantityUnits.ModelCorrespondence='[\"CIM_StorageAllocationSettingData.VirtualQuantity\"]' override.VirtualQuantityUnits.IsPUnit='true' override.Reservation='uint64' override.Reservation.Description='The amount of blocks that are guaranteed to be available for this storage resource allocation at the host. The blocksize is specified by the value of the HostResourceBlockSize property.' override.Reservation.ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostResourceBlockSize\"]' override.Limit='uint64' override.Limit.Description='The maximum amount of blocks that will be granted for this storage resource allocation at the host. The blocksize is specified by the value of the HostResourceBlockSize property.Usually the value this property would reflect a maximum size for the allocated host extent that matches the size of the virtual storage extent presented to the consumer. A value less than that would indicate a situation where a sparsely populated virtual storage extent is expected, where the fill rate is limited by the value of the Limit property.' override.Limit.ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostResourceBlockSize\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageAllocationSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Virtual Resource Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size in bytes of the blocks that are presented to the consumer as the result of this storage resource allocation or storage resource allocation request. If the block size is variable, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept does not apply, then the value 1 shall be used.
	 * NOTE: The use of 1 (and not 0) to indicate that the blocksize is unknown still allows the use of the VirtualQuantity property to convey the size in blocks of size 1).
	 * NOTE: This property is a copy of the CIM_StorageExtent.BlockSize property. See the description of the CIM_StorageExtent.BlockSize property for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Resource Block Size</em>' attribute.
	 * @see #setVirtualResourceBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_VirtualResourceBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageExtent.BlockSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getVirtualResourceBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getVirtualResourceBlockSize <em>Virtual Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Resource Block Size</em>' attribute.
	 * @see #getVirtualResourceBlockSize()
	 * @generated
	 */
	void setVirtualResourceBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access describes whether the allocated storage extent is 1 (readable), 2 (writeable), or 3 (both).
	 * NOTE: This property is a copy of the CIM_StorageExtent.Access property, except deprecated values. See the description of the CIM_StorageExtent.Access property for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_Access()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Readable\",\"Writeable\",\"Read/Write Supported\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageExtent.Access\"]'"
	 * @generated
	 */
	Integer getAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Resource Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size in bytes of the blocks that are allocated at the host as the result of this storage resource allocation or storage resource allocation request. If the block size is variable, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept does not apply, then the value 1 shall be used.
	 * NOTE: This property is a copy of the CIM_StorageExtent.BlockSize property. See the description of the CIM_StorageExtent.BlockSize property for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Resource Block Size</em>' attribute.
	 * @see #setHostResourceBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_HostResourceBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageExtent.BlockSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getHostResourceBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostResourceBlockSize <em>Host Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Resource Block Size</em>' attribute.
	 * @see #getHostResourceBlockSize()
	 * @generated
	 */
	void setHostResourceBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Host Extent Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HostExtentStartingAddress property identifies the starting address on the host storage extent identified by the value of the HostExtentName property that is used for the allocation of the virtual storage extent.
	 * A value of NULL indicates that there is no direct mapping of the virtual storage extent onto the referenced host storage extent.
	 * NOTE: This property is a copy of the CIM_BasedOn.StartingAddess property. See the description of CIM_BasedOn association for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Extent Starting Address</em>' attribute.
	 * @see #setHostExtentStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_HostExtentStartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostResourceBlockSize\",\"CIM_BasedOn.StartingAddress\"]'"
	 * @generated
	 */
	Long getHostExtentStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentStartingAddress <em>Host Extent Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Extent Starting Address</em>' attribute.
	 * @see #getHostExtentStartingAddress()
	 * @generated
	 */
	void setHostExtentStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Host Extent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the host extent. The identified host extent is used for the storage resource allocation.
	 * NOTE: This property is a copy of the CIM_StorageExtent.Name property. See the description of CIM_StorageExtent.Name property for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Extent Name</em>' attribute.
	 * @see #setHostExtentName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_HostExtentName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostExtentNameFormat\",\"CIM_StorageAllocationSettingData.HostExtentNameNamespace\",\"CIM_StorageExtent.Name\"]'"
	 * @generated
	 */
	String getHostExtentName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentName <em>Host Extent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Extent Name</em>' attribute.
	 * @see #getHostExtentName()
	 * @generated
	 */
	void setHostExtentName(String value);

	/**
	 * Returns the value of the '<em><b>Host Extent Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HostExtentNameFormat property identifies the format that is used for the value of the HostExtentName property.
	 * NOTE: This property is a copy of the CIM_StorageExtent.NameFormat property, excluding deprecated values. See the description of CIM_StorageExtent.NameFormat class for details.
	 * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. This represents the vendor and model ID from SCSI Inquiry data; the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 
	 * 'ACME____+SUPER DISK______+124437458' (_ is a space character) 
	 * 9 = NAA as a generic format. See 
	 * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html. Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
	 * 10 = EUI as a generic format (EUI64) See 
	 * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html. 
	 * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
	 * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 1. See T10 SPC-3 specification. This is the 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice. 12 = OS Device Name (for LogicalDisks). See LogicalDisk Name description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Extent Name Format</em>' attribute.
	 * @see #setHostExtentNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_HostExtentNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"7\",\"9\",\"10\",\"11\",\"12\",\"..\"]' Values='[\"Unknown\",\"Other\",\"SNVM\",\"NAA\",\"EUI64\",\"T10VID\",\"OS Device Name\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostExtentName\",\"CIM_StorageAllocationSettingData.OtherHostExtentNameFormat\",\"CIM_StorageExtent.NameFormat\"]'"
	 * @generated
	 */
	Integer getHostExtentNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentNameFormat <em>Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Extent Name Format</em>' attribute.
	 * @see #getHostExtentNameFormat()
	 * @generated
	 */
	void setHostExtentNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Host Extent Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the format of the HostExtentName property if the value of the HostExtentNameFormat property is 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Host Extent Name Format</em>' attribute.
	 * @see #setOtherHostExtentNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_OtherHostExtentNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostExtentNameFormat\"]'"
	 * @generated
	 */
	String getOtherHostExtentNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getOtherHostExtentNameFormat <em>Other Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Host Extent Name Format</em>' attribute.
	 * @see #getOtherHostExtentNameFormat()
	 * @generated
	 */
	void setOtherHostExtentNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Host Extent Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the host extent is a SCSI volume, then the preferred source for SCSI volume names is SCSI VPD Page 83 responses.
	 * NOTE: This property is a copy of the CIM_StorageExtent.NameNamespace property. See the description of CIM_StorageExtent.NameNamespace class for details.
	 * Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 
	 * 2 = VPD Page 83, Type 3 NAA (NameFormat SHOULD be NAA) 
	 * 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 
	 * 4 = VPD Page 83, Type 1 T10 Vendor Identification 
	 * (NameFormat T10) 
	 * Less preferred volume namespaces from other interfaces: 
	 * 5 = VPD page 80, Serial number (NameFormat SHOULD be Other) 
	 * 6 = FC NodeWWN (NameFormat SHOULD be NAA or EUI) 
	 * 7 = Serial Number/Vendor/Model (NameFormat SHOULD be SNVM) cThe preferred namespace for LogigicalDisk names is platform specific device namespace; see LogigicalDIsk Description. 
	 * 8 = OS Device Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Extent Name Namespace</em>' attribute.
	 * @see #setHostExtentNameNamespace(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_HostExtentNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\"]' Values='[\"Unknown\",\"Other\",\"VPD83Type3\",\"VPD83Type2\",\"VPD83Type1\",\"VPD80\",\"NodeWWN\",\"SNVM\",\"OS Device Namespace\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostExtentName\",\"CIM_StorageAllocationSettingData.OtherHostExtentNameNamespace\",\"CIM_StorageAllocationSettingData.HostExtentNameFormat\",\"CIM_StorageExtent.NameNamespace\"]'"
	 * @generated
	 */
	Integer getHostExtentNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getHostExtentNameNamespace <em>Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Extent Name Namespace</em>' attribute.
	 * @see #getHostExtentNameNamespace()
	 * @generated
	 */
	void setHostExtentNameNamespace(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Host Extent Name Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the namespace of the HostExtentName property if the value of the HostExtentNameNamespace matches 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Host Extent Name Namespace</em>' attribute.
	 * @see #setOtherHostExtentNameNamespace(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageAllocationSettingData_OtherHostExtentNameNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageAllocationSettingData.HostExtentNameNamespace\"]'"
	 * @generated
	 */
	String getOtherHostExtentNameNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageAllocationSettingData#getOtherHostExtentNameNamespace <em>Other Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Host Extent Name Namespace</em>' attribute.
	 * @see #getOtherHostExtentNameNamespace()
	 * @generated
	 */
	void setOtherHostExtentNameNamespace(String value);

} // CIM_StorageAllocationSettingData
