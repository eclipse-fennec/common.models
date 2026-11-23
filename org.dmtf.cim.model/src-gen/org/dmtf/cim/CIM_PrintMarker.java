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
 * A representation of the model object '<em><b>CIM Print Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the PrintMarker component of a Printer (print device). It contains properties that describe the PrintMarker technology, capabilities, counters, and status. Note: A PrintMarker shall be associated with exactly one Printer via an instance of the PrinterComponent class. See: Model in section 2 of Printer MIB (RFC 3805).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getMarkTech <em>Mark Tech</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getOtherMarkTechDescription <em>Other Mark Tech Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getCounterUnit <em>Counter Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getOtherCounterUnit <em>Other Counter Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getLifeCount <em>Life Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getPowerOnCount <em>Power On Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getProcessColorants <em>Process Colorants</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getSpotColorants <em>Spot Colorants</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getAddressabilityBasis <em>Addressability Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getFeedAddressability <em>Feed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintMarker#getXFeedAddressability <em>XFeed Addressability</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Printing' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerEntry\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrintMarker extends CIM_PrinterElement {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes whether or not this PrintMarker is the default PrintMarker for this Printer. If the default PrintMarker feature is not supported for this Printer, then this property shall be null. If the default PrintMarker feature is supported for this Printer, then this property shall be true for at most one instance of CIM_PrintMarker on this Printer, i.e., the default may not be currently configured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_IsDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerDefaultIndex\"]'"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mark Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of marking technology used for this PrintMarker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mark Tech</em>' attribute.
	 * @see #setMarkTech(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_MarkTech()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\"]' Values='[\"Other\",\"Unknown\",\"ElectrophotographicLED\",\"ElectrophotographicLaser\",\"ElectrophotographicOther\",\"ImpactMovingHeadDotMatrix9pin\",\"ImpactMovingHeadDotMatrix24pin\",\"ImpactMovingHeadDotMatrixOther\",\"ImpactMovingHeadFullyFormed\",\"ImpactBand\",\"ImpactOther\",\"InkjetAqueous\",\"InkjetSolid\",\"InkjetOther\",\"Pen\",\"ThermalTransfer\",\"ThermalSensitive\",\"ThermalDiffusion\",\"ThermalOther\",\"Electroerosion\",\"Electrostatic\",\"PhotographicMicrofiche\",\"PhotographicImagesetter\",\"PhotographicOther\",\"IonDeposition\",\"EBeam\",\"Typesetter\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerMarkTech\",\"MIB.IETF|IANA-PRINTER-MIB.PrtMarkerMarkTechTC\"]' ModelCorrespondence='[\"CIM_PrintMarker.OtherMarkTechDescription\"]'"
	 * @generated
	 */
	Long getMarkTech();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getMarkTech <em>Mark Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Tech</em>' attribute.
	 * @see #getMarkTech()
	 * @generated
	 */
	void setMarkTech(Long value);

	/**
	 * Returns the value of the '<em><b>Other Mark Tech Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the type of technology when the value of the MarkTech property is equal to 1, 5, 11, 14, 19, or 24 (Other, ElectrophotographicOther, ImpactMovingHeadDotMatrixOther, ImpactOther, InkjetOther, ThermalOther, or PhotographicOther).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Mark Tech Description</em>' attribute.
	 * @see #setOtherMarkTechDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_OtherMarkTechDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintMarker.MarkTech\"]'"
	 * @generated
	 */
	String getOtherMarkTechDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getOtherMarkTechDescription <em>Other Mark Tech Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Mark Tech Description</em>' attribute.
	 * @see #getOtherMarkTechDescription()
	 * @generated
	 */
	void setOtherMarkTechDescription(String value);

	/**
	 * Returns the value of the '<em><b>Counter Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit that will be used by the Printer when reporting counter values for this PrintMarker. The time units of measure are provided for a PrintMarker like a strip recorder that does not or cannot track the physical dimensions of the media and does not use characters, lines or sheets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counter Unit</em>' attribute.
	 * @see #setCounterUnit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_CounterUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"11\",\"16\",\"17\",\"..\"]' Values='[\"Other\",\"Unknown\",\"TenThousandthsOfInches\",\"Micrometers\",\"Characters\",\"Lines\",\"Impressions\",\"Sheets\",\"DotRow\",\"Hours\",\"Feet\",\"Meters\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerCounterUnit\",\"MIB.IETF|Printer-MIB.PrtMarkerCounterUnitTC\"]' ModelCorrespondence='[\"CIM_PrintMarker.OtherCounterUnit\",\"CIM_PrintMarker.LifeCount\",\"CIM_PrintMarker.PowerOnCount\"]'"
	 * @generated
	 */
	Long getCounterUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getCounterUnit <em>Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Unit</em>' attribute.
	 * @see #getCounterUnit()
	 * @generated
	 */
	void setCounterUnit(Long value);

	/**
	 * Returns the value of the '<em><b>Other Counter Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the counter unit when the value of the CounterUnit property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Counter Unit</em>' attribute.
	 * @see #setOtherCounterUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_OtherCounterUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintMarker.CounterUnit\",\"CIM_PrintMarker.LifeCount\",\"CIM_PrintMarker.PowerOnCount\"]'"
	 * @generated
	 */
	String getOtherCounterUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getOtherCounterUnit <em>Other Counter Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Counter Unit</em>' attribute.
	 * @see #getOtherCounterUnit()
	 * @generated
	 */
	void setOtherCounterUnit(String value);

	/**
	 * Returns the value of the '<em><b>Life Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of PrintMarker usage during the life of the Printer using units of measure as specified by CIM_PrintMarker.CounterUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Count</em>' attribute.
	 * @see #setLifeCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_LifeCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerLifeCount\",\"MIB.IETF|Printer-MIB.PrtMarkerCounterUnitTC\"]' ModelCorrespondence='[\"CIM_PrintMarker.CounterUnit\",\"CIM_PrintMarker.OtherCounterUnit\"]'"
	 * @generated
	 */
	Long getLifeCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getLifeCount <em>Life Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Count</em>' attribute.
	 * @see #getLifeCount()
	 * @generated
	 */
	void setLifeCount(Long value);

	/**
	 * Returns the value of the '<em><b>Power On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of PrintMarker usage since the equipment was most recently powered on using units of measure as specified by CIM_PrintMarker.CounterUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power On Count</em>' attribute.
	 * @see #setPowerOnCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_PowerOnCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerPowerOnCount\",\"MIB.IETF|Printer-MIB.PrtMarkerCounterUnitTC\"]' ModelCorrespondence='[\"CIM_PrintMarker.CounterUnit\",\"CIM_PrintMarker.OtherCounterUnit\"]'"
	 * @generated
	 */
	Long getPowerOnCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getPowerOnCount <em>Power On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power On Count</em>' attribute.
	 * @see #getPowerOnCount()
	 * @generated
	 */
	void setPowerOnCount(Long value);

	/**
	 * Returns the value of the '<em><b>Process Colorants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of process colors supported by this PrintMarker. A process color of 1 implies monochrome. The value of this property and CIM_PrintMarker.SpotColorants cannot both be 0. The value of this property shall be 0 or greater.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Colorants</em>' attribute.
	 * @see #setProcessColorants(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_ProcessColorants()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='65535' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerProcessColorants\"]' ModelCorrespondence='[\"CIM_PrintSupply.ColorantRole\"]'"
	 * @generated
	 */
	Long getProcessColorants();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getProcessColorants <em>Process Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Colorants</em>' attribute.
	 * @see #getProcessColorants()
	 * @generated
	 */
	void setProcessColorants(Long value);

	/**
	 * Returns the value of the '<em><b>Spot Colorants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of spot colors supported by this PrintMarker. The value of this property and CIMPrintMarker.ProcessColorants cannot both be 0. The value of this property shall be 0 or greater.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spot Colorants</em>' attribute.
	 * @see #setSpotColorants(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_SpotColorants()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='65535' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerSpotColorants\"]' ModelCorrespondence='[\"CIM_PrintSupply.ColorantRole\"]'"
	 * @generated
	 */
	Long getSpotColorants();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getSpotColorants <em>Spot Colorants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spot Colorants</em>' attribute.
	 * @see #getSpotColorants()
	 * @generated
	 */
	void setSpotColorants(Long value);

	/**
	 * Returns the value of the '<em><b>Availability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains detailed availability information for this PrintMarker, as follows: 1 (Other) means other detailed availability information is present in the OtherAvailabilityStatus property. 2 (Unknown) means detailed availability information for this PrintMarker is unknown. 3 (AvailableIdle) means this PrintMarker is available and idle, i.e., not currently in use. 4 (AvailableStandy) means this PrintMarker is available but on standby, e.g., in a power saving mode. 5 (AvailableActive) means this PrintMarker is available and active, i.e., currently in use. 6 (AvailableBusy) means this PrintMarker is available but busy, i.e., not immediately available for its primary function. 7 (UnavailableOnRequest) means this PrintMarker is not available and is on request, i.e., needs human intervention. 8 (UnavailableBroken) means this PrintMarker is not available and is broken, e.g., needs repair/replacement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Status</em>' attribute.
	 * @see #setAvailabilityStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_AvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\"]' Values='[\"Other\",\"Unknown\",\"AvailableIdle\",\"AvailableStandby\",\"AvailableActive\",\"AvailableBusy\",\"UnavailableOnRequest\",\"UnavailableBroken\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperatingStatus\",\"CIM_PrintMarker.OtherAvailabilityStatus\"]'"
	 * @generated
	 */
	Long getAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getAvailabilityStatus <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Status</em>' attribute.
	 * @see #getAvailabilityStatus()
	 * @generated
	 */
	void setAvailabilityStatus(Long value);

	/**
	 * Returns the value of the '<em><b>Other Availability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the detailed availability of this PrintMarker when the value of the AvailabilityStatus property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Availability Status</em>' attribute.
	 * @see #setOtherAvailabilityStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_OtherAvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintMarker.AvailabilityStatus\"]'"
	 * @generated
	 */
	String getOtherAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getOtherAvailabilityStatus <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Availability Status</em>' attribute.
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 */
	void setOtherAvailabilityStatus(String value);

	/**
	 * Returns the value of the '<em><b>Non Critical Alerts Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, there are currently non-critical alerts on this PrintMarker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Critical Alerts Present</em>' attribute.
	 * @see #setNonCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_NonCriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getNonCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Critical Alerts Present</em>' attribute.
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 */
	void setNonCriticalAlertsPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Critical Alerts Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, there are currently critical alerts on this PrintMarker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #setCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_CriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getCriticalAlertsPresent <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 */
	void setCriticalAlertsPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Addressability Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the limit properties FeedAddressability and XFeedAddressability, that specifies whether meaningful values are available. 1 (Other) means the PrintMarker places no restrictions on addressability and FeedAddressability and XFeedAddressability shall be null. 2 (Unknown) means the PrintMarker does not have meaningful values and FeedAddressability and XFeedAddressability shall be null. 3 (Actual) means the PrintMarker does have meaningful values and FeedAddressability and XFeedAddressability shall be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressability Basis</em>' attribute.
	 * @see #setAddressabilityBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_AddressabilityBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerFeedAddressability\",\"MIB.IETF|Printer-MIB.prtMarkerXFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintMarker.FeedAddressability\",\"CIM_PrintMarker.XFeedAddressability\"]'"
	 * @generated
	 */
	Integer getAddressabilityBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getAddressabilityBasis <em>Addressability Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressability Basis</em>' attribute.
	 * @see #getAddressabilityBasis()
	 * @generated
	 */
	void setAddressabilityBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Feed Addressability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum addressability (often called resolution) of this PrintMarker in dots per inch in the feed direction, i.e., long-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feed Addressability</em>' attribute.
	 * @see #setFeedAddressability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_FeedAddressability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintMarker.AddressabilityBasis\",\"CIM_PrintMarker.XFeedAddressability\"]' PUnit='dot / inch'"
	 * @generated
	 */
	Long getFeedAddressability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getFeedAddressability <em>Feed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Addressability</em>' attribute.
	 * @see #getFeedAddressability()
	 * @generated
	 */
	void setFeedAddressability(Long value);

	/**
	 * Returns the value of the '<em><b>XFeed Addressability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum addressability (often called resolution) of this PrintMarker in dots per inch in the cross-feed direction, i.e., short-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XFeed Addressability</em>' attribute.
	 * @see #setXFeedAddressability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintMarker_XFeedAddressability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerXFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintMarker.AddressabilityBasis\",\"CIM_PrintMarker.FeedAddressability\"]' PUnit='dot / inch'"
	 * @generated
	 */
	Long getXFeedAddressability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintMarker#getXFeedAddressability <em>XFeed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XFeed Addressability</em>' attribute.
	 * @see #getXFeedAddressability()
	 * @generated
	 */
	void setXFeedAddressability(Long value);

} // CIM_PrintMarker
