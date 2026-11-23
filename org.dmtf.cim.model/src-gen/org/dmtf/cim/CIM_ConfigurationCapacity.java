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
 * A representation of the model object '<em><b>CIM Configuration Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConfigurationCapacity provides information on the minimum and maximum numbers of power supplies, fans, disk drives, etc. that can be connected to or placed on/into a PhysicalElement (and the number that must be connected/added/removed at a time). The PhysicalElement whose configuration is described is identified using the ElementCapacity association, inherited from PhysicalCapacity. The object whose capacities are indicated (ie, the power supply or fan) is identified in the ObjectType and VendorCompatibilityStrings properties of this class. When ObjectType has a value of 25 (Multi-Purpose) then additional description of the object is provided in the VendorCompatibilityStrings property. Since the same min/max configurations can apply to multiple instances, this class is not defined as 'weak'. 
 * Examples of the use of the ConfigurationCapacity class are to describe that a 'control unit' Chassis may be connected to (at most) 4 other I/O chassis, or to describe what a StorageLibrary's cabinet may contain. Continuing the latter example, a particular StorageLibrary's cabinet might hold a minimum of 3 and a maximum of 9 TapeDrives, and a minimum of 88 and a maximum of 264 StorageMediaLocations ("Slots"). This information would be described in two instances of ConfigurationCapacity, both associated to the StorageLibrary's PhysicalPackage. 
 * This class does NOT represent the tradeoffs that are likely to be required of one resource for another. It simply represents capacities. In the case of the StorageLibrary, there may be only 2 valid configurations - 9 TapeDrives with 88 Slots, or 3 TapeDrives with 264 Slots. This class only conveys that 'up to' 9 Drives and 'up to' 264 slots may be available and are supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getMinimumCapacity <em>Minimum Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getMaximumCapacity <em>Maximum Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationCapacity#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::Physical::Misc' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as a part of the Configuration Capacity object key.' keys='Name,ObjectType'"
 * @generated
 */
@ProviderType
public interface CIM_ConfigurationCapacity extends CIM_PhysicalCapacity {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of object (power supply, fan, disk drive, ...) whose capacities are indicated. This information is part of the class' key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_ObjectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\"]' Values='[\"Other\",\"Processors\",\"Power Supplies\",\"Fans\",\"Batteries\",\"I/O Slots\",\"Memory Slots\",\"MediaAccessDevices (Drives)\",\"StorageMediaLocation Slots\",\"StorageMediaLocation Magazines\",\"StorageMediaLocation Panels\",\"StorageMediaLocation InterLibrary Ports\",\"StorageMediaLocation Limited Access Ports\",\"Doors\",\"MediaTransferDevice Pickers\",\"MediaTransferDevice Changers\",\"LabelReaders\",\"Contained Chassis\",\"Connected Chassis\",\"Connected Frames\",\"Front Side I/O Slots\",\"Back Side I/O Slots\",\"Cache Memory\",\"NVS Memory\",\"Volatile Memory\",\"Multi-Purpose\"]' ModelCorrespondence='[\"CIM_ConfigurationCapacity.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getObjectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationCapacity#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the object type - used when the ObjectType property is set to 0 ("Other"). OtherType Description should be set to NULL when ObjectType is any value other than 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_ConfigurationCapacity.ObjectType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationCapacity#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of Elements of type, ObjectType, that must be installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Capacity</em>' attribute.
	 * @see #setMinimumCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_MinimumCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getMinimumCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationCapacity#getMinimumCapacity <em>Minimum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Capacity</em>' attribute.
	 * @see #getMinimumCapacity()
	 * @generated
	 */
	void setMinimumCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of Elements of type, ObjectType, that may be installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Capacity</em>' attribute.
	 * @see #setMaximumCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_MaximumCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getMaximumCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationCapacity#getMaximumCapacity <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Capacity</em>' attribute.
	 * @see #getMaximumCapacity()
	 * @generated
	 */
	void setMaximumCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment in which Elements must be added or removed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_Increment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getIncrement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationCapacity#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Long value);

	/**
	 * Returns the value of the '<em><b>Vendor Compatibility Strings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that identifies the compatibility of the elements within the configuration capacity. This allows vendors to provide information to the system administrators by providing sufficient information to request the appropriate hardware that can populate the configuration. In order to ensure uniqueness within the NameSpace, each value defined by the vendor for use in the VendorCompatibilityStrings property SHOULD be constructed using the following 'preferred' algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Compatibility Strings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationCapacity_VendorCompatibilityStrings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_PhysicalPackage.VendorCompatibilityStrings\",\"CIM_Slot.VendorCompatibilityStrings\"]'"
	 * @generated
	 */
	EList<String> getVendorCompatibilityStrings();

} // CIM_ConfigurationCapacity
