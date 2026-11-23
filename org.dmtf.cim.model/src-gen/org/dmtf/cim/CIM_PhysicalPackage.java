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
 * A representation of the model object '<em><b>CIM Physical Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalPackage class represents PhysicalElements that contain or host other components. Examples are a Rack enclosure or an adapter Card.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getRemovalConditions <em>Removal Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getRemovable <em>Removable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getHotSwappable <em>Hot Swappable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getHeight <em>Height</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getWidth <em>Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getOtherPackageType <em>Other Package Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalPackage#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalPackage extends CIM_PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Removal Conditions</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removal Conditions</em>' attribute.
	 * @see #setRemovalConditions(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_RemovalConditions()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Not Applicable\",\"Removable when off\",\"Removable when on or off\"]'"
	 * @generated
	 */
	Integer getRemovalConditions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getRemovalConditions <em>Removal Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Conditions</em>' attribute.
	 * @see #getRemovalConditions()
	 * @generated
	 */
	void setRemovalConditions(Integer value);

	/**
	 * Returns the value of the '<em><b>Removable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
	 * A PhysicalPackage is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Package can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Package removed, then the Element is both Removable and HotSwappable. For example, an extra battery in a laptop is Removable, as is a disk drive Package inserted using SCA connectors. However, the latter is also HotSwappable. A laptop's display is not Removable, nor is a non-redundant power supply. Removing these components would impact the function of the overall packaging or is impossible due to the tight integration of the Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removable</em>' attribute.
	 * @see #setRemovable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Removable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PhysicalPackage.RemovalConditions\"]'"
	 * @generated
	 */
	Boolean getRemovable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getRemovable <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removable</em>' attribute.
	 * @see #getRemovable()
	 * @generated
	 */
	void setRemovable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalPackage is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. Another example is a power supply Package mounted on sliding rails. All Removable packages are inherently Replaceable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaceable</em>' attribute.
	 * @see #setReplaceable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Replaceable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getReplaceable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getReplaceable <em>Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaceable</em>' attribute.
	 * @see #getReplaceable()
	 * @generated
	 */
	void setReplaceable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hot Swappable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
	 * 
	 * A PhysicalPackage is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a disk drive Package inserted using SCA connectors is both Removable and HotSwappable. All HotSwappable packages are inherently Removable and Replaceable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hot Swappable</em>' attribute.
	 * @see #setHotSwappable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_HotSwappable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PhysicalPackage.RemovalConditions\"]'"
	 * @generated
	 */
	Boolean getHotSwappable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getHotSwappable <em>Hot Swappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Swappable</em>' attribute.
	 * @see #getHotSwappable()
	 * @generated
	 */
	void setHotSwappable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The height of the PhysicalPackage in inches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Height()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getHeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Float value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The depth of the PhysicalPackage in inches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Depth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the PhysicalPackage in inches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Width()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Float value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The weight of the PhysicalPackage in pounds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_Weight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Pounds' PUnit='pound'"
	 * @generated
	 */
	Float getWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Float value);

	/**
	 * Returns the value of the '<em><b>Package Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration defining the type of the PhysicalPackage. Note that this enumeration expands on the list in the Entity MIB (the attribute, entPhysicalClass). The numeric values are consistent with CIM's enum numbering guidelines, but are slightly different than the MIB's values.
	 * Unknown - indicates that the package type is not known.
	 * Other - The package type does not correspond to an existing enumerated value. The value is specified using the OtherPackageType property.
	 * The values "Rack" through "Port/Connector" are defined per the Entity-MIB (where the semantics of rack are equivalent to the MIB's 'stack' value). The other values (for battery, processor, memory, power source/generator and storage media package) are self-explanatory.
	 * A value of "Blade" should be used when the PhysicalPackage contains the operational hardware aspects of a ComputerSystem, without the supporting mechanicals such as power and cooling. For example, a Blade Server includes processor(s) and memory, and relies on the containing chassis to supply power and cooling. In many respects, a Blade can be considered a "Module/Card". However, it is tracked differently by inventory systems and differs in terms of service philosophy. For example, a Blade is intended to be hot-plugged into a hosting enclosure without requiring additional cabling, and does not require a cover to be removed from the enclosure for installation. Similarly, a "Blade Expansion" has characteristics of a "Blade" and a "Module/Card". However, it is distinct from both due to inventory tracking and service philosophy, and because of its hardware dependence on a Blade. A Blade Expansion must be attached to a Blade prior to inserting the resultant assembly into an enclosure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Type</em>' attribute.
	 * @see #setPackageType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_PackageType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\"]' Values='[\"Unknown\",\"Other\",\"Rack\",\"Chassis/Frame\",\"Cross Connect/Backplane\",\"Container/Frame Slot\",\"Power Supply\",\"Fan\",\"Sensor\",\"Module/Card\",\"Port/Connector\",\"Battery\",\"Processor\",\"Memory\",\"Power Source/Generator\",\"Storage Media Package (e.g., Disk or Tape Drive)\",\"Blade\",\"Blade Expansion\"]' MappingStrings='[\"MIB.IETF|ENTITY-MIB.entPhysicalClass\"]' ModelCorrespondence='[\"CIM_PhysicalPackage.OtherPackageType\"]'"
	 * @generated
	 */
	Integer getPackageType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getPackageType <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Type</em>' attribute.
	 * @see #getPackageType()
	 * @generated
	 */
	void setPackageType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Package Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the package when the instance's PackageType property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Package Type</em>' attribute.
	 * @see #setOtherPackageType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_OtherPackageType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalPackage.PackageType\"]'"
	 * @generated
	 */
	String getOtherPackageType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalPackage#getOtherPackageType <em>Other Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Package Type</em>' attribute.
	 * @see #getOtherPackageType()
	 * @generated
	 */
	void setOtherPackageType(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Compatibility Strings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that identify the component that is compatible with, and can be inserted in a slot that reports this string as one of the array element in the VendorCompatibilityStrings This allows system administrators to determine whether it is appropriateto insert a package into a slot 
	 * In order to ensure uniqueness within the NameSpace, each value defined by the vendor for use in the VendorCompatibilityStrings property SHOULD be constructed using the following 'preferred' algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Compatibility Strings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalPackage_VendorCompatibilityStrings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_Slot.VendorCompatibilityStrings\"]'"
	 * @generated
	 */
	EList<String> getVendorCompatibilityStrings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is being deprecated. A PhysicalPackage cannot determine if it is compatible with another object. The IsCompatible method verifies whether the referenced PhysicalElement may be contained by or inserted into the PhysicalPackage. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param ElementToCheck The element to check for compatibility with this one.
	 * <!-- end-model-doc -->
	 * @model ElementToCheckAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Long IsCompatible(CIM_PhysicalElement ElementToCheck);

} // CIM_PhysicalPackage
