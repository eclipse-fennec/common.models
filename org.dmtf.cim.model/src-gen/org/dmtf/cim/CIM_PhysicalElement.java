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
 * A representation of the model object '<em><b>CIM Physical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subclasses of CIM_PhysicalElement define any component of a System that has a distinct physical identity. Instances of this class can be defined as an object that can be seen or touched. All Processes, Files, and LogicalDevices are considered not to be Physical Elements. For example, it is not possible to touch the functionality of a 'modem.' You can touch only the card or package that implements the modem. The same card could also implement a LAN adapter. PhysicalElements are tangible ManagedSystemElements that have a physical manifestation of some sort. 
 * 
 * Note that the properties of PhysicalElement describe a hardware entity. Possible replacement (FRU) information is defined by following the ElementFRU association to one or more instances of the ReplacementFRU class. This definition allows a client to determine what hardware can be replaced (FRUed) and what 'spare' parts might be required by a customer or engineer doing the replacement. If it can be instrumented or manually determined that an element actually replaced (FRUed) another, then this can be described in the model using the ElementHasBeenFRUed association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getModel <em>Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getSKU <em>SKU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getPoweredOn <em>Powered On</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getVendorEquipmentType <em>Vendor Equipment Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getUserTracking <em>User Tracking</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalElement#getCanBeFRUed <em>Can Be FR Ued</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::Physical' override.Description='string' override.Description.Description='A textual description of the PhysicalElement.' override.Description.MappingStrings='[\"MIF.DMTF|FRU|003.3\"]' override.ElementName='string' override.ElementName.MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalName\"]' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalElement extends CIM_ManagedSystemElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An arbitrary string that uniquely identifies the Physical Element and serves as the key of the Element. The Tag property can contain information such as asset tag or serial number data. The key for PhysicalElement is placed very high in the object hierarchy in order to independently identify the hardware or entity, regardless of physical placement in or on Cabinets, Adapters, and so on. For example, a hotswappable or removable component can be taken from its containing (scoping) Package and be temporarily unused. The object still continues to exist and can even be inserted into a different scoping container. Therefore, the key for Physical Element is an arbitrary string and is defined independently of any placement or location-oriented hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_Tag()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization responsible for producing the PhysicalElement. This organization might be the entity from whom the Element is purchased, but this is not necessarily true. The latter information is contained in the Vendor property of CIM_Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_Manufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalMfgName\",\"MIF.DMTF|FRU|003.4\"]'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which the PhysicalElement is generally known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_Model()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalDescr\",\"MIF.DMTF|FRU|003.5\"]'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>SKU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stock-keeping unit number for this PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SKU</em>' attribute.
	 * @see #setSKU(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_SKU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getSKU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getSKU <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKU</em>' attribute.
	 * @see #getSKU()
	 * @generated
	 */
	void setSKU(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manufacturer-allocated number used to identify the Physical Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalSerialNum\",\"MIF.DMTF|FRU|003.7\"]'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that indicates the version of the PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalHardwareRev\",\"MIF.DMTF|FRU|003.8\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part number assigned by the organization that is responsible for producing or manufacturing the PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_PartNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalModelName\"]'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Other Identifying Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherIdentifyingInfo captures data in addition to Tag information. This information could be used to identify a Physical Element. One example is bar code data associated with an Element that also has an asset tag. Note that if only bar code data is available and is unique or able to be used as an Element key, this property would be null and the bar code data would be used as the class key, in the Tag property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Identifying Info</em>' attribute.
	 * @see #setOtherIdentifyingInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_OtherIdentifyingInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalAlias\"]'"
	 * @generated
	 */
	String getOtherIdentifyingInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getOtherIdentifyingInfo <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Identifying Info</em>' attribute.
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 */
	void setOtherIdentifyingInfo(String value);

	/**
	 * Returns the value of the '<em><b>Powered On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether the PhysicalElement is powered on (TRUE) or is currently off (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powered On</em>' attribute.
	 * @see #setPoweredOn(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_PoweredOn()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPoweredOn();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getPoweredOn <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered On</em>' attribute.
	 * @see #getPoweredOn()
	 * @generated
	 */
	void setPoweredOn(Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that this PhysicalElement was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' attribute.
	 * @see #setManufactureDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_ManufactureDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getManufactureDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getManufactureDate <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' attribute.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A vendor-specific hardware type for the PhysicalElement. It describes the specific equipment type for the element, as defined by the vendor or manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Equipment Type</em>' attribute.
	 * @see #setVendorEquipmentType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_VendorEquipmentType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalVendorType\"]'"
	 * @generated
	 */
	String getVendorEquipmentType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getVendorEquipmentType <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Equipment Type</em>' attribute.
	 * @see #getVendorEquipmentType()
	 * @generated
	 */
	void setVendorEquipmentType(String value);

	/**
	 * Returns the value of the '<em><b>User Tracking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-assigned and writeable asset-tracking identifier for the PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Tracking</em>' attribute.
	 * @see #setUserTracking(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_UserTracking()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalAssetID\"]'"
	 * @generated
	 */
	String getUserTracking();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getUserTracking <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Tracking</em>' attribute.
	 * @see #getUserTracking()
	 * @generated
	 */
	void setUserTracking(String value);

	/**
	 * Returns the value of the '<em><b>Can Be FR Ued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether this PhysicalElement can be FRUed (TRUE) or not (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Be FR Ued</em>' attribute.
	 * @see #setCanBeFRUed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalElement_CanBeFRUed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalIsFRU\"]'"
	 * @generated
	 */
	Boolean getCanBeFRUed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalElement#getCanBeFRUed <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be FR Ued</em>' attribute.
	 * @see #getCanBeFRUed()
	 * @generated
	 */
	void setCanBeFRUed(Boolean value);

} // CIM_PhysicalElement
