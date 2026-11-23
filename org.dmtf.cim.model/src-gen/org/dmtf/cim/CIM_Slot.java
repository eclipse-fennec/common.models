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
 * A representation of the model object '<em><b>CIM Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Slot class represents Connectors into which Packages are inserted. For example, a PhysicalPackage that is a DiskDrive may be inserted into an SCA 'Slot'. As another example, a Card (subclass of PhysicalPackage) may be inserted into a 16-, 32-, or 64-bit expansion 'Slot' on a HostingBoard. PCI or PCMCIA Type III Slots are examples of the latter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getSupportsHotPlug <em>Supports Hot Plug</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getHeightAllowed <em>Height Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getLengthAllowed <em>Length Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getMaxDataWidth <em>Max Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getVccMixedVoltageSupport <em>Vcc Mixed Voltage Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getVppMixedVoltageSupport <em>Vpp Mixed Voltage Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getThermalRating <em>Thermal Rating</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getSpecialPurpose <em>Special Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getNumber <em>Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getPowered <em>Powered</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getOpenSwitch <em>Open Switch</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getMaxLinkWidth <em>Max Link Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Slot#getBifurcationCapability <em>Bifurcation Capability</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Slot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Physical::Connector' override.ConnectorType='uint16[]' override.ConnectorType.Description='An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of \'combinations\' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as \"Male\" (value=2). \nThis single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.' override.ConnectorType.ValueMap='[\"123\"]' override.ConnectorType.Values='[\"CXL Flexbus 1.0\"]' override.ConnectorType.ArrayType='Indexed' override.ConnectorType.MappingStrings='[\"MIF.DMTF|System Slot|006.2\"]' override.ConnectorType.ModelCorrespondence='[\"CIM_PhysicalConnector.OtherTypeDescription\"]' override.PoweredOn='boolean' override.PoweredOn.MappingStrings='[\"MIF.DMTF|System Slot|005.13\"]' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_Slot extends CIM_PhysicalConnector {
	/**
	 * Returns the value of the '<em><b>Supports Hot Plug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Slot supports hot-plug of adapter Cards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Hot Plug</em>' attribute.
	 * @see #setSupportsHotPlug(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_SupportsHotPlug()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsHotPlug();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getSupportsHotPlug <em>Supports Hot Plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Hot Plug</em>' attribute.
	 * @see #getSupportsHotPlug()
	 * @generated
	 */
	void setSupportsHotPlug(Boolean value);

	/**
	 * Returns the value of the '<em><b>Height Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum height of an adapter Card that can be inserted into the Slot, in inches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height Allowed</em>' attribute.
	 * @see #setHeightAllowed(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_HeightAllowed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getHeightAllowed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getHeightAllowed <em>Height Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Allowed</em>' attribute.
	 * @see #getHeightAllowed()
	 * @generated
	 */
	void setHeightAllowed(Float value);

	/**
	 * Returns the value of the '<em><b>Length Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum length of an adapter Card that can be inserted into the Slot, in inches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length Allowed</em>' attribute.
	 * @see #setLengthAllowed(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_LengthAllowed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getLengthAllowed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getLengthAllowed <em>Length Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Allowed</em>' attribute.
	 * @see #getLengthAllowed()
	 * @generated
	 */
	void setLengthAllowed(Float value);

	/**
	 * Returns the value of the '<em><b>Max Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum bus width of adapter Cards that can be inserted into this Slot, in bits. If the value is 'unknown', enter 0. If the value is other than 8, 16, 32, 64 or 128, enter 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Width</em>' attribute.
	 * @see #setMaxDataWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_MaxDataWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' ValueMap='[\"0\",\"1\",\"8\",\"16\",\"32\",\"64\",\"128\"]' MappingStrings='[\"MIF.DMTF|System Slot|005.3\"]' PUnit='bit'"
	 * @generated
	 */
	Integer getMaxDataWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getMaxDataWidth <em>Max Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Width</em>' attribute.
	 * @see #getMaxDataWidth()
	 * @generated
	 */
	void setMaxDataWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Vcc Mixed Voltage Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers indicating the Vcc voltage supported by this Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vcc Mixed Voltage Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_VccMixedVoltageSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"3.3V\",\"5V\"]' MappingStrings='[\"MIF.DMTF|System Slot|005.9\"]'"
	 * @generated
	 */
	EList<Integer> getVccMixedVoltageSupport();

	/**
	 * Returns the value of the '<em><b>Vpp Mixed Voltage Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers indicating the Vpp voltage supported by this Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vpp Mixed Voltage Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_VppMixedVoltageSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"3.3V\",\"5V\",\"12V\"]' MappingStrings='[\"MIF.DMTF|System Slot|005.10\"]'"
	 * @generated
	 */
	EList<Integer> getVppMixedVoltageSupport();

	/**
	 * Returns the value of the '<em><b>Thermal Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum thermal dissipation of the Slot in milliwatts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Rating</em>' attribute.
	 * @see #setThermalRating(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_ThermalRating()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliWatts' MappingStrings='[\"MIF.DMTF|System Slot|005.11\"]' PUnit='watt * 10^-3'"
	 * @generated
	 */
	Long getThermalRating();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getThermalRating <em>Thermal Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Rating</em>' attribute.
	 * @see #getThermalRating()
	 * @generated
	 */
	void setThermalRating(Long value);

	/**
	 * Returns the value of the '<em><b>Special Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that this Slot is physically unique and may hold special types of hardware, e.g. a graphics processor slot. If set to TRUE, then the property, Special PurposeDescription (a string), should specify the nature of the uniqueness or purpose of the Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Purpose</em>' attribute.
	 * @see #setSpecialPurpose(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_SpecialPurpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_Slot.PurposeDescription\"]'"
	 * @generated
	 */
	Boolean getSpecialPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getSpecialPurpose <em>Special Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Purpose</em>' attribute.
	 * @see #getSpecialPurpose()
	 * @generated
	 */
	void setSpecialPurpose(Boolean value);

	/**
	 * Returns the value of the '<em><b>Purpose Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing that this Slot is physically unique and may hold special types of hardware. This property only has meaning when the corresponding boolean property, SpecialPurpose, is set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Description</em>' attribute.
	 * @see #setPurposeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_PurposeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Slot.SpecialPurpose\"]'"
	 * @generated
	 */
	String getPurposeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getPurposeDescription <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Description</em>' attribute.
	 * @see #getPurposeDescription()
	 * @generated
	 */
	void setPurposeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Number property indicates the physical slot number, which can be used as an index into a system slot table, whether or not that slot is physically occupied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_Number()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIF.DMTF|System Slot|005.1\"]'"
	 * @generated
	 */
	Integer getNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Powered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the Slot is currently powered (TRUE) or not (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powered</em>' attribute.
	 * @see #setPowered(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_Powered()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PhysicalElement.PoweredOn\"]' MappingStrings='[\"MIF.DMTF|System Slot|005.13\"]'"
	 * @generated
	 */
	Boolean getPowered();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getPowered <em>Powered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered</em>' attribute.
	 * @see #getPowered()
	 * @generated
	 */
	void setPowered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Open Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the switch state of the Slot is currently open (TRUE) or closed (FALSE). This switch state determines whether the contents of the Slot can be hot-plugged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Switch</em>' attribute.
	 * @see #setOpenSwitch(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_OpenSwitch()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|System Slot|005.15\"]'"
	 * @generated
	 */
	Boolean getOpenSwitch();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getOpenSwitch <em>Open Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Switch</em>' attribute.
	 * @see #getOpenSwitch()
	 * @generated
	 */
	void setOpenSwitch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Link Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum link width of a switching bus type, such as Infiniband and PCI Express. The width is expressed in number of communication lines, or lanes, between port and devices. This property dictates the maximum link width, in lanes, of adapter Cards that can be inserted into this Slot. If the value is 'unknown', enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Link Width</em>' attribute.
	 * @see #setMaxLinkWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_MaxLinkWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9..\"]' Values='[\"Unknown\",\"x1\",\"x2\",\"x4\",\"x8\",\"x12\",\"x16\",\"x32\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getMaxLinkWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getMaxLinkWidth <em>Max Link Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Link Width</em>' attribute.
	 * @see #getMaxLinkWidth()
	 * @generated
	 */
	void setMaxLinkWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor Compatibility Strings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that identify the components that are compatible and can be inserted in a slot. This allows vendors to provide clues to the system administrators by providing sufficient information to request the appropriate hardware that can populate the slot. In order to ensure uniqueness within the NameSpace, each value defined by the vendor for use in the VendorCompatibilityStrings property SHOULD be constructed using the following 'preferred' algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Compatibility Strings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_VendorCompatibilityStrings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_PhysicalPackage.VendorCompatibilityStrings\"]'"
	 * @generated
	 */
	EList<String> getVendorCompatibilityStrings();

	/**
	 * Returns the value of the '<em><b>Bifurcation Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value indicates if the slot is capable of being bifurcated. True meaning the slot is capable, False meaning it is not capable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bifurcation Capability</em>' attribute.
	 * @see #setBifurcationCapability(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Slot_BifurcationCapability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getBifurcationCapability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Slot#getBifurcationCapability <em>Bifurcation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bifurcation Capability</em>' attribute.
	 * @see #getBifurcationCapability()
	 * @generated
	 */
	void setBifurcationCapability(Boolean value);

} // CIM_Slot
