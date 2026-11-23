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
 * A representation of the model object '<em><b>CIM Print Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a PrintSupply for a PrintMarker or PrintFinisher component of a Printer (print device). It contains a property that specifies if this instance represents a PrintSupply represents a container (for a supply that is consumed) or a receptacle (for waste that is produced). It also contains properties that describe the PrintSupply type, capacity, and remaining capacity. For PrintMarker colorants, it also contains properties that describe colorant role (spot or process), name, and tonality. Note: A PrintSupply shall be associated with exactly one Printer via an instance of the ConcreteComponent class. A PrintSupply shall be associated with exactly one PrintMarker or PrintFinisher via an instance of AssociatedPrintSupply class. See: Model in section 2 of Printer MIB (RFC 3805) and section 3 of Finisher MIB (RFC 3806).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getOtherClassification <em>Other Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getSupplyUnit <em>Supply Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getOtherSupplyUnit <em>Other Supply Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getMaxCapacityBasis <em>Max Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getRemainingCapacityBasis <em>Remaining Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getRemainingCapacity <em>Remaining Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getColorantRole <em>Colorant Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getOtherColorantRole <em>Other Colorant Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getColorantName <em>Colorant Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getOtherColorantName <em>Other Colorant Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSupply#getColorantTonality <em>Colorant Tonality</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Printing' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesEntry\",\"MIB.IETF|Printer-MIB.prtMarkerColorantEntry\",\"MIB.IETF|Finisher-MIB.finSupplyEntry\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrintSupply extends CIM_PrinterElement {
	/**
	 * Returns the value of the '<em><b>Localized Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form text description of this PrintSupply in the localization specified by CIM_Printer.CurrentNaturalLanguage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Localized Description</em>' attribute.
	 * @see #setLocalizedDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_LocalizedDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesDescription\",\"MIB.IETF|Finisher-MIB.finSupplyDescription\",\"MIB.IETF|Printer-MIB.PrtLocalizedDescriptionStringTC\"]' ModelCorrespondence='[\"CIM_Printer.CurrentNaturalLanguage\"]'"
	 * @generated
	 */
	String getLocalizedDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getLocalizedDescription <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Description</em>' attribute.
	 * @see #getLocalizedDescription()
	 * @generated
	 */
	void setLocalizedDescription(String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this PrintSupply instance represents a PrintSupply that is consumed or a receptacle that is filled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_Classification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"3\",\"4\",\"..\"]' Values='[\"Other\",\"SupplyThatIsConsumed\",\"ReceptacleThatIsFilled\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesClass\",\"MIB.IETF|Finisher-MIB.finSupplyClass\",\"MIB.IETF|Printer-MIB.PrtMarkerSuppliesClassTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.OtherClassification\"]'"
	 * @generated
	 */
	Long getClassification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Long value);

	/**
	 * Returns the value of the '<em><b>Other Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the PrintSupply classification when the value of the Classification property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Classification</em>' attribute.
	 * @see #setOtherClassification(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_OtherClassification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintSupply.Classification\"]'"
	 * @generated
	 */
	String getOtherClassification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getOtherClassification <em>Other Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Classification</em>' attribute.
	 * @see #getOtherClassification()
	 * @generated
	 */
	void setOtherClassification(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this PrintSupply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_Type()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Toner\",\"WasteToner\",\"Ink\",\"InkCartridge\",\"InkRibbon\",\"WasteInk\",\"Opc\",\"Developer\",\"FuserOil\",\"SolidWax\",\"RibbonWax\",\"WasteWax\",\"Fuser\",\"CoronaWire\",\"FuserOilWick\",\"CleanerUnit\",\"FuserCleaningPad\",\"TransferUnit\",\"TonerCartridge\",\"FuserOiler\",\"Water\",\"WasteWater\",\"GlueWaterAdditive\",\"WastePaper\",\"BindingSupply\",\"BandingSupply\",\"StitchingWire\",\"ShrinkWrap\",\"PaperWrap\",\"Staples\",\"Inserts\",\"Covers\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesType\",\"MIB.IETF|Finisher-MIB.finSupplyType\",\"MIB.IETF|IANA-PRINTER-MIB.PrtMarkerSuppliesTypeTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.OtherTypeDescription\"]'"
	 * @generated
	 */
	Long getType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Long value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the PrintSupply type when the value of the Type property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintSupply.Type\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Supply Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of measure for this PrintSupply container (for a supply that is consumed) or receptacle (for waste that is produced).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply Unit</em>' attribute.
	 * @see #setSupplyUnit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_SupplyUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"7\",\"8\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"..\"]' Values='[\"Other\",\"Unknown\",\"TenThousandthsOfInches\",\"Micrometers\",\"Impressions\",\"Sheets\",\"Hours\",\"ThousandthsOfOunces\",\"TenthsOfGrams\",\"HundrethsOfFluidOunces\",\"TenthsOfMilliliters\",\"Feet\",\"Meters\",\"Items\",\"Percent\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesSupplyUnit\",\"MIB.IETF|Finisher-MIB.finSupplyUnit\",\"MIB.IETF|Printer-MIB.PrtMarkerSuppliesSupplyUnitTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.OtherSupplyUnit\"]'"
	 * @generated
	 */
	Long getSupplyUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getSupplyUnit <em>Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Unit</em>' attribute.
	 * @see #getSupplyUnit()
	 * @generated
	 */
	void setSupplyUnit(Long value);

	/**
	 * Returns the value of the '<em><b>Other Supply Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the PrintSupply unit when the value of the SupplyUnit property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supply Unit</em>' attribute.
	 * @see #setOtherSupplyUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_OtherSupplyUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintSupply.SupplyUnit\"]'"
	 * @generated
	 */
	String getOtherSupplyUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getOtherSupplyUnit <em>Other Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Supply Unit</em>' attribute.
	 * @see #getOtherSupplyUnit()
	 * @generated
	 */
	void setOtherSupplyUnit(String value);

	/**
	 * Returns the value of the '<em><b>Max Capacity Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the limit property MaxCapacity, that specifies whether a meaningful value is available. 1 (Other) means the Printer places no restrictions on capacity and MaxCapacity shall be null. 2 (Unknown) means the Printer cannot sense a meaningful value and MaxCapacity shall be null. 3 (Actual) means the Printer can sense a meaningful value and MaxCapacity shall be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Capacity Basis</em>' attribute.
	 * @see #setMaxCapacityBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_MaxCapacityBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesMaxCapacity\",\"MIB.IETF|Finisher-MIB.finSuppyMaxCapacity\"]' ModelCorrespondence='[\"CIM_PrintSupply.MaxCapacity\"]'"
	 * @generated
	 */
	Integer getMaxCapacityBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getMaxCapacityBasis <em>Max Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity Basis</em>' attribute.
	 * @see #getMaxCapacityBasis()
	 * @generated
	 */
	void setMaxCapacityBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum capacity of this PrintSupply container (for a supply that is consumed) or receptacle (for waste that is produced) in units specified by CIM_PrintSupply.SupplyUnit. If this Printer can reliably sense this value, the value is sensed by the Printer and cannot be changed by the system administrator; otherwise, the value may be changed out-of-band by the system administrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Capacity</em>' attribute.
	 * @see #setMaxCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_MaxCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesMaxCapacity\",\"MIB.IETF|Finisher-MIB.finSuppyMaxCapacity\",\"MIB.IETF|Printer-MIB.prtMarkerSuppliesSupplyUnit\",\"MIB.IETF|Finisher-MIB.finSupplyUnit\",\"MIB.IETF|Printer-MIB.PrtMarkerSuppliesSupplyUnitTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.MaxCapacityBasis\"]'"
	 * @generated
	 */
	Long getMaxCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getMaxCapacity <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity</em>' attribute.
	 * @see #getMaxCapacity()
	 * @generated
	 */
	void setMaxCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Remaining Capacity Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the gauge property RemainingCapacity, that specifies whether a meaningful value is available. 1 (Other) means the Printer places no restrictions on capacity and RemainingCapacity shall be null. 2 (Unknown) means the Printer cannot sense a meaningful value and RemainingCapacity shall be null. 3 (Actual) means the Printer can sense a meaningful value and RemainingCapacity shall be present. 4 (AtLeastOne) means that the Printer can only sense that at least one capacity unit remains and RemainingCapacity shall be present and shall contain the value zero or one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Capacity Basis</em>' attribute.
	 * @see #setRemainingCapacityBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_RemainingCapacityBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"AtLeastOne\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesLevel\",\"MIB.IETF|Finisher-MIB.finSuppyCurrentLevel\"]' ModelCorrespondence='[\"CIM_PrintSupply.RemainingCapacity\"]'"
	 * @generated
	 */
	Integer getRemainingCapacityBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getRemainingCapacityBasis <em>Remaining Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Capacity Basis</em>' attribute.
	 * @see #getRemainingCapacityBasis()
	 * @generated
	 */
	void setRemainingCapacityBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Remaining Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current remaining level of the supply if this PrintSupply is a container (for a supply that is consumed) or the remaining capacity if this PrintSupply is a receptacle (for waste that is produced), in units specified by CIM_PrintSupply.SupplyUnit. If this Printer can reliably sense this value, the value is sensed by the Printer and cannot be changed by the system administrator; otherwise, the value may be changed out-of-band by the system administrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Capacity</em>' attribute.
	 * @see #setRemainingCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_RemainingCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSuppliesLevel\",\"MIB.IETF|Finisher-MIB.finSuppyCurrentLevel\",\"MIB.IETF|Printer-MIB.prtMarkerSuppliesSupplyUnit\",\"MIB.IETF|Finisher-MIB.finSupplyUnit\",\"MIB.IETF|Printer-MIB.PrtMarkerSuppliesSupplyUnitTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.RemainingCapacityBasis\"]'"
	 * @generated
	 */
	Long getRemainingCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getRemainingCapacity <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Capacity</em>' attribute.
	 * @see #getRemainingCapacity()
	 * @generated
	 */
	void setRemainingCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Colorant Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this PrintSupply does not represent a PrintMarker colorant, then this property shall be null. If this PrintSupply does represent a PrintMarker colorant, then this property shall be present and shall denote the role played by this PrintMarker colorant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colorant Role</em>' attribute.
	 * @see #setColorantRole(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_ColorantRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"3\",\"4\",\"..\"]' Values='[\"Other\",\"Process\",\"Spot\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerColorantRole\",\"MIB.IETF|Printer-MIB.PrtMarkerColorantRoleTC\"]' ModelCorrespondence='[\"CIM_PrintSupply.OtherColorantRole\",\"CIM_PrintMarker.ProcessColorants\",\"CIM_PrintMarker.SpotColorants\"]'"
	 * @generated
	 */
	Long getColorantRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getColorantRole <em>Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorant Role</em>' attribute.
	 * @see #getColorantRole()
	 * @generated
	 */
	void setColorantRole(Long value);

	/**
	 * Returns the value of the '<em><b>Other Colorant Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this PrintSupply does not represent a PrintMarker colorant, then this property shall be null. If this PrintSupply does represent a PrintMarker colorant and the value of the ColorantRole property is equal to 1 (Other), then this property shall be present and shall contain a free-form string that describes the role of the colorant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Colorant Role</em>' attribute.
	 * @see #setOtherColorantRole(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_OtherColorantRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintSupply.ColorantRole\"]'"
	 * @generated
	 */
	String getOtherColorantRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getOtherColorantRole <em>Other Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Colorant Role</em>' attribute.
	 * @see #getOtherColorantRole()
	 * @generated
	 */
	void setOtherColorantRole(String value);

	/**
	 * Returns the value of the '<em><b>Colorant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this PrintSupply does not represent a PrintMarker colorant, then this property shall be null. If this PrintSupply does represent a PrintMarker colorant, then this property shall be present and shall denote the colorant name using the standardized names from ISO 10175 (DPA) and ISO 10180 (SPDL). Vendors and administrators may specify other colorant names in the OtherColorantName property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colorant Name</em>' attribute.
	 * @see #setColorantName(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_ColorantName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\"]' Values='[\"Other\",\"Unknown\",\"White\",\"Red\",\"Green\",\"Blue\",\"Cyan\",\"Magenta\",\"Yellow\",\"Black\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerColorantValue\"]' ModelCorrespondence='[\"CIM_PrintSupply.OtherColorantName\"]'"
	 * @generated
	 */
	Integer getColorantName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getColorantName <em>Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorant Name</em>' attribute.
	 * @see #getColorantName()
	 * @generated
	 */
	void setColorantName(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Colorant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this PrintSupply does not represent a PrintMarker colorant, then this property shall be null. If this PrintSupply does represent a PrintMarker colorant and the value of the ColorantName property is equal to 1 (Other), then this property shall be present and shall contain a vendor or administrator defined value. The naming conventions in ISO 9070 are recommended in order to avoid potential name clashes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Colorant Name</em>' attribute.
	 * @see #setOtherColorantName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_OtherColorantName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintSupply.ColorantName\"]'"
	 * @generated
	 */
	String getOtherColorantName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getOtherColorantName <em>Other Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Colorant Name</em>' attribute.
	 * @see #getOtherColorantName()
	 * @generated
	 */
	void setOtherColorantName(String value);

	/**
	 * Returns the value of the '<em><b>Colorant Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this PrintSupply does not represent a PrintMarker colorant, then this property shall be null. If this PrintSupply does represent a PrintMarker colorant, then this property shall be present and shall denote the distinct levels of tonality realizable by a PrintMarker when using this colorant. This value does not include the number of levels of tonal difference that an interpreter can obtain by techniques such as half toning. This value must be at least 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colorant Tonality</em>' attribute.
	 * @see #setColorantTonality(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSupply_ColorantTonality()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='2' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerColorantTonality\"]'"
	 * @generated
	 */
	Long getColorantTonality();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintSupply#getColorantTonality <em>Colorant Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorant Tonality</em>' attribute.
	 * @see #getColorantTonality()
	 * @generated
	 */
	void setColorantTonality(Long value);

} // CIM_PrintSupply
