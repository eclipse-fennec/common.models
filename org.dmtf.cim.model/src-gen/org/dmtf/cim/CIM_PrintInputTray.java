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
 * A representation of the model object '<em><b>CIM Print Input Tray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the PrintInputTray component of a Printer (print device). It contains properties that describe a device capable of providing media for input to the printing process. Note: A PrintInputTray shall be associated with exactly one Printer via an instance of the PrinterComponent class. See: Model in section 2 of Printer MIB (RFC 3805).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getCapacityUnit <em>Capacity Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getOtherCapacityUnit <em>Other Capacity Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMaxCapacityBasis <em>Max Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getCurrentLevelBasis <em>Current Level Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getCurrentLevel <em>Current Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaSizeName <em>Media Size Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaName <em>Media Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaWeightBasis <em>Media Weight Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaWeight <em>Media Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInputTray#getMediaColor <em>Media Color</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Printing' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputEntry\"]' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The user-friendly name for this instance of PrintInputTray. In addition, the user-friendly name can be used as an index property for a search or query. (Note: The name does not have to be unique within a namespace.) This name shall be generated as a factory default by the manufacturer and may be changed out-of-band to a site-specific name by the system administrator.' override.ElementName.MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputName\"]' override.ElementName.ModelCorrespondence='[\"CIM_ManagedElement.ElementName\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrintInputTray extends CIM_PrinterElement {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes whether or not this PrintInputTray is the default PrintInputTray for this Printer. If the default PrintInputTray feature is not supported for this Printer, then this property shall be null. If the default PrintInputTray feature is supported for this Printer, then this property shall be true for at most one instance of CIM_PrintInputTray on this Printer, i.e., the default may not be currently configured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_IsDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputDefaultIndex\"]'"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Localized Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form text description of this input tray in the localization specified by CIM_Printer.CurrentNaturalLanguage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Localized Description</em>' attribute.
	 * @see #setLocalizedDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_LocalizedDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputDescription\",\"MIB.IETF|Printer-MIB.PrtLocalizedDescriptionStringTC\"]' ModelCorrespondence='[\"CIM_Printer.CurrentNaturalLanguage\"]'"
	 * @generated
	 */
	String getLocalizedDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getLocalizedDescription <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Description</em>' attribute.
	 * @see #getLocalizedDescription()
	 * @generated
	 */
	void setLocalizedDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of technology (discriminated primarily according to feeder mechanism type) employed by the input tray.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_Type()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Other\",\"Unknown\",\"SheetFeedAutoRemovableTray\",\"SheetFeedAutoNonRemovableTray\",\"SheetFeedManual\",\"ContinuousRoll\",\"ContinuousFanFold\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputType\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInputTypeTC\"]' ModelCorrespondence='[\"CIM_PrintInputTray.OtherTypeDescription\"]'"
	 * @generated
	 */
	Long getType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getType <em>Type</em>}' attribute.
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
	 * A free-form string that describes the type of technology when the value of the Type property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintInputTray.Type\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Capacity Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of measurement for use in calculating and relaying capacity values for this input tray.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity Unit</em>' attribute.
	 * @see #setCapacityUnit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_CapacityUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"8\",\"16\",\"17\",\"18\",\"19\",\"..\"]' Values='[\"Other\",\"Unknown\",\"TenThousandthsOfInches\",\"Micrometers\",\"Sheets\",\"Feet\",\"Meters\",\"Items\",\"Percent\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputCapacityUnit\",\"MIB.IETF|Printer-MIB.PrtCapacityUnitTC\"]' ModelCorrespondence='[\"CIM_PrintInputTray.OtherCapacityUnit\"]'"
	 * @generated
	 */
	Long getCapacityUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getCapacityUnit <em>Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Unit</em>' attribute.
	 * @see #getCapacityUnit()
	 * @generated
	 */
	void setCapacityUnit(Long value);

	/**
	 * Returns the value of the '<em><b>Other Capacity Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the capacity unit when the value of the CapacityUnit property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Capacity Unit</em>' attribute.
	 * @see #setOtherCapacityUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_OtherCapacityUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintInputTray.CapacityUnit\"]'"
	 * @generated
	 */
	String getOtherCapacityUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getOtherCapacityUnit <em>Other Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Capacity Unit</em>' attribute.
	 * @see #getOtherCapacityUnit()
	 * @generated
	 */
	void setOtherCapacityUnit(String value);

	/**
	 * Returns the value of the '<em><b>Max Capacity Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the limit property MaxCapacity, that specifies whether a meaningful value is available. 1 (Other) means the input tray places no restrictions on capacity and MaxCapacity shall be null. 2 (Unknown) means the input tray cannot sense a meaningful value and MaxCapacity shall be null. 3 (Actual) means the input tray can sense a meaningful value and MaxCapacity shall be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Capacity Basis</em>' attribute.
	 * @see #setMaxCapacityBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MaxCapacityBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputMaxCapacity\"]' ModelCorrespondence='[\"CIM_PrintInputTray.MaxCapacity\"]'"
	 * @generated
	 */
	Integer getMaxCapacityBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMaxCapacityBasis <em>Max Capacity Basis</em>}' attribute.
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
	 * The maximum capacity of the input tray in units specified by CIM_PrintInputTray.CapacityUnit. There is no convention associated with the media itself so this value reflects claimed capacity. If this input tray can reliably sense this value, the value is sensed by the input tray and cannot be changed by the system administrator; otherwise, the value may be changed out-of-band by the system administrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Capacity</em>' attribute.
	 * @see #setMaxCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MaxCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputMaxCapacity\",\"MIB.IETF|Printer-MIB.prtInputCapacityUnit\",\"MIB.IETF|Printer-MIB.PrtCapacityUnitTC\"]' ModelCorrespondence='[\"CIM_PrintInputTray.MaxCapacityBasis\"]'"
	 * @generated
	 */
	Long getMaxCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMaxCapacity <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity</em>' attribute.
	 * @see #getMaxCapacity()
	 * @generated
	 */
	void setMaxCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Current Level Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the gauge property CurrentLevel, that specifies whether a meaningful value is available. 1 (Other) means the input tray places no restrictions on capacity and CurrentLevel shall be null. 2 (Unknown) means the input tray cannot sense a meaningful value and CurrentLevel shall be null. 3 (Actual) means the input tray can sense a meaningful value and CurrentLevel shall be present. 4 (AtLeastOne) means that the input tray can only sense that at least one capacity unit remains (i.e., not empty) and CurrentLevel shall be present and shall contain the value zero or one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Level Basis</em>' attribute.
	 * @see #setCurrentLevelBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_CurrentLevelBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"AtLeastOne\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputCurrentLevel\"]' ModelCorrespondence='[\"CIM_PrintInputTray.CurrentLevel\"]'"
	 * @generated
	 */
	Integer getCurrentLevelBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getCurrentLevelBasis <em>Current Level Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Level Basis</em>' attribute.
	 * @see #getCurrentLevelBasis()
	 * @generated
	 */
	void setCurrentLevelBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current level of the input tray in units specified by CIM_PrintInputTray.CapacityUnit. If this input tray can reliably sense this value, the value is sensed by the input tray and cannot be changed by the system administrator; otherwise, the value may be changed out-of-band by the system administrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Level</em>' attribute.
	 * @see #setCurrentLevel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_CurrentLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputCurrentLevel\",\"MIB.IETF|Printer-MIB.prtInputCapacityUnit\",\"MIB.IETF|Printer-MIB.PrtCapacityUnitTC\"]' ModelCorrespondence='[\"CIM_PrintInputTray.CurrentLevelBasis\"]'"
	 * @generated
	 */
	Long getCurrentLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getCurrentLevel <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Level</em>' attribute.
	 * @see #getCurrentLevel()
	 * @generated
	 */
	void setCurrentLevel(Long value);

	/**
	 * Returns the value of the '<em><b>Availability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains detailed availability information for this PrintInputTray, as follows: 1 (Other) means other detailed availability information is present in the OtherAvailabilityStatus property. 2 (Unknown) means detailed availability information for this PrintInputTray is unknown. 3 (AvailableIdle) means this PrintInputTray is available and idle, i.e., not currently in use. 4 (AvailableStandy) means this PrintInputTray is available but on standby, e.g., in a power saving mode. 5 (AvailableActive) means this PrintInputTray is available and active, i.e., currently in use. 6 (AvailableBusy) means this PrintInputTray is available but busy, i.e., not immediately available for its primary function. 7 (UnavailableOnRequest) means this PrintInputTray is not available and is on request, i.e., needs human intervention. 8 (UnavailableBroken) means this PrintInputTray is not available and is broken, e.g., needs repair/replacement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Status</em>' attribute.
	 * @see #setAvailabilityStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_AvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\"]' Values='[\"Other\",\"Unknown\",\"AvailableIdle\",\"AvailableStandby\",\"AvailableActive\",\"AvailableBusy\",\"UnavailableOnRequest\",\"UnavailableBroken\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperatingStatus\",\"CIM_PrintInputTray.OtherAvailabilityStatus\"]'"
	 * @generated
	 */
	Long getAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getAvailabilityStatus <em>Availability Status</em>}' attribute.
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
	 * A free-form string that describes the detailed availability of this PrintInputTray when the value of the AvailabilityStatus property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Availability Status</em>' attribute.
	 * @see #setOtherAvailabilityStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_OtherAvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintInputTray.AvailabilityStatus\"]'"
	 * @generated
	 */
	String getOtherAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getOtherAvailabilityStatus <em>Other Availability Status</em>}' attribute.
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
	 * If true, there are currently non-critical alerts on this input tray.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Critical Alerts Present</em>' attribute.
	 * @see #setNonCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_NonCriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getNonCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}' attribute.
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
	 * If true, there are currently critical alerts on this input tray.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #setCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_CriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getCriticalAlertsPresent <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 */
	void setCriticalAlertsPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Media Size Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides the value of the PWG standard or custom media size name of the media that is (or, if empty, was or will be) in this input tray. The values of this property shall conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. If this input tray can reliably sense this value, the value is sensed by the input tray and cannot be changed by the system administrator; otherwise, the value may be changed out-of-band by the system administrator. The empty value means unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Size Name</em>' attribute.
	 * @see #setMediaSizeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaSizeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='63' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaDimFeedDirDeclared\",\"MIB.IETF|Printer-MIB.prtInputMediaDimXFeedDirDeclared\"]'"
	 * @generated
	 */
	String getMediaSizeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaSizeName <em>Media Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Size Name</em>' attribute.
	 * @see #getMediaSizeName()
	 * @generated
	 */
	void setMediaSizeName(String value);

	/**
	 * Returns the value of the '<em><b>Media Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name of the media contained in this input tray. This media name is to be used by a client to format and localize a string for display to a human operator. This media name is not processed by the printer. It is used to provide information not expressible in terms of the other media attributes (e.g., CIM_PrintInputTray.MediaWeight and CIM_PrintInputTray.MediaType).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Name</em>' attribute.
	 * @see #setMediaName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='63' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputMediaName\"]'"
	 * @generated
	 */
	String getMediaName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaName <em>Media Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Name</em>' attribute.
	 * @see #getMediaName()
	 * @generated
	 */
	void setMediaName(String value);

	/**
	 * Returns the value of the '<em><b>Media Weight Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the media property MediaWeight, that specifies whether a meaningful value is available. 2 (Unknown) means the input tray cannot sense a meaningful value and MediaWeight shall be null. 3 (Actual) means the input tray can sense a meaningful value and MediaWeight shall be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Weight Basis</em>' attribute.
	 * @see #setMediaWeightBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaWeightBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Actual\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputMediaWeight\"]' ModelCorrespondence='[\"CIM_PrintInputTray.MediaWeight\"]'"
	 * @generated
	 */
	Integer getMediaWeightBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaWeightBasis <em>Media Weight Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Weight Basis</em>' attribute.
	 * @see #getMediaWeightBasis()
	 * @generated
	 */
	void setMediaWeightBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Media Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The weight of the media associated with this input tray in grams per square meter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Weight</em>' attribute.
	 * @see #setMediaWeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaWeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInputMediaWeight\"]' ModelCorrespondence='[\"CIM_PrintInputTray.MediaWeightBasis\"]' PUnit='gram / (meter * meter)'"
	 * @generated
	 */
	Long getMediaWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaWeight <em>Media Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Weight</em>' attribute.
	 * @see #getMediaWeight()
	 * @generated
	 */
	void setMediaWeight(Long value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the type of media associated with this input tray. The values of this property should conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. This media type name need not be processed by the printer; it might simply be displayed to an operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='63' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaType\"]'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Media Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the color of the media associated with this input tray. The values of this property should conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Color</em>' attribute.
	 * @see #setMediaColor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInputTray_MediaColor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='63' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaColor\"]'"
	 * @generated
	 */
	String getMediaColor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInputTray#getMediaColor <em>Media Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Color</em>' attribute.
	 * @see #getMediaColor()
	 * @generated
	 */
	void setMediaColor(String value);

} // CIM_PrintInputTray
