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
 * A representation of the model object '<em><b>CIM Power Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the PowerSupply.The PowerSupply may have two input voltage ranges. The attributes of each input voltage (high and low voltage bounds, high and low frequency bounds, maximum input power, and maximum output power) are modeled separately. Additional attributes of the power supply including the active input voltage range and type of range switching may also be modeled.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getIsSwitchingSupply <em>Is Switching Supply</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputVoltageLow <em>Range1 Input Voltage Low</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputVoltageHigh <em>Range1 Input Voltage High</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputFrequencyLow <em>Range1 Input Frequency Low</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputFrequencyHigh <em>Range1 Input Frequency High</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputVoltageLow <em>Range2 Input Voltage Low</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputVoltageHigh <em>Range2 Input Voltage High</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputFrequencyLow <em>Range2 Input Frequency Low</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputFrequencyHigh <em>Range2 Input Frequency High</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getActiveInputVoltage <em>Active Input Voltage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getTypeOfRangeSwitching <em>Type Of Range Switching</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getTotalOutputPower <em>Total Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getInputPowerUnits <em>Input Power Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getIsACInput <em>Is AC Input</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getNominalPhaseWiring <em>Nominal Phase Wiring</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getNumberOfPhasesUtilized <em>Number Of Phases Utilized</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1MaxInputPower <em>Range1 Max Input Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange1MaxOutputPower <em>Range1 Max Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2MaxInputPower <em>Range2 Max Input Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerSupply#getRange2MaxOutputPower <em>Range2 Max Output Power</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::CoolingAndPower' override.OutputPowerUnits='string' override.OutputPowerUnits.Description='Indicates the programmatic units for the Range1MaxOutputPower, Range2MaxOutputPower, and MaxOutputPower properties.' override.OutputPowerUnits.ModelCorrespondence='[\"CIM_PowerSupply.Range1MaxOutputPower\",\"CIM_PowerSupply.Range2MaxOutputPower\"]' override.OutputPowerUnits.IsPUnit='true' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PowerSupply extends CIM_PowerSource {
	/**
	 * Returns the value of the '<em><b>Is Switching Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the PowerSupply is a switching (instead of linear) supply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Switching Supply</em>' attribute.
	 * @see #setIsSwitchingSupply(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_IsSwitchingSupply()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsSwitchingSupply();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getIsSwitchingSupply <em>Is Switching Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Switching Supply</em>' attribute.
	 * @see #getIsSwitchingSupply()
	 * @generated
	 */
	void setIsSwitchingSupply(Boolean value);

	/**
	 * Returns the value of the '<em><b>Range1 Input Voltage Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The low voltage of Input Voltage Range 1 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Input Voltage Low</em>' attribute.
	 * @see #setRange1InputVoltageLow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1InputVoltageLow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliVolts' MappingStrings='[\"MIF.DMTF|Power Supply|004.7\"]' PUnit='volt * 10^-3'"
	 * @generated
	 */
	Long getRange1InputVoltageLow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputVoltageLow <em>Range1 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Input Voltage Low</em>' attribute.
	 * @see #getRange1InputVoltageLow()
	 * @generated
	 */
	void setRange1InputVoltageLow(Long value);

	/**
	 * Returns the value of the '<em><b>Range1 Input Voltage High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high voltage of Input Voltage Range 1 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Input Voltage High</em>' attribute.
	 * @see #setRange1InputVoltageHigh(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1InputVoltageHigh()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliVolts' MappingStrings='[\"MIF.DMTF|Power Supply|004.8\"]' PUnit='volt * 10^-3'"
	 * @generated
	 */
	Long getRange1InputVoltageHigh();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputVoltageHigh <em>Range1 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Input Voltage High</em>' attribute.
	 * @see #getRange1InputVoltageHigh()
	 * @generated
	 */
	void setRange1InputVoltageHigh(Long value);

	/**
	 * Returns the value of the '<em><b>Range1 Input Frequency Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency (in hertz) at the low end of the Input Frequency Range 1 of this Power Supply. A value of 0 implies DC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Input Frequency Low</em>' attribute.
	 * @see #setRange1InputFrequencyLow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1InputFrequencyLow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Power Supply|004.17\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRange1InputFrequencyLow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputFrequencyLow <em>Range1 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Input Frequency Low</em>' attribute.
	 * @see #getRange1InputFrequencyLow()
	 * @generated
	 */
	void setRange1InputFrequencyLow(Long value);

	/**
	 * Returns the value of the '<em><b>Range1 Input Frequency High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency (in hertz) at the high end of the Input Frequency Range 1 of this Power Supply. A value of 0 implies DC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Input Frequency High</em>' attribute.
	 * @see #setRange1InputFrequencyHigh(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1InputFrequencyHigh()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Power Supply|004.18\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRange1InputFrequencyHigh();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1InputFrequencyHigh <em>Range1 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Input Frequency High</em>' attribute.
	 * @see #getRange1InputFrequencyHigh()
	 * @generated
	 */
	void setRange1InputFrequencyHigh(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Input Voltage Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The low voltage of Input Voltage Range 2 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Input Voltage Low</em>' attribute.
	 * @see #setRange2InputVoltageLow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2InputVoltageLow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliVolts' MappingStrings='[\"MIF.DMTF|Power Supply|004.11\"]' PUnit='volt * 10^-3'"
	 * @generated
	 */
	Long getRange2InputVoltageLow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputVoltageLow <em>Range2 Input Voltage Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Input Voltage Low</em>' attribute.
	 * @see #getRange2InputVoltageLow()
	 * @generated
	 */
	void setRange2InputVoltageLow(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Input Voltage High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high voltage of Input Voltage Range 2 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Input Voltage High</em>' attribute.
	 * @see #setRange2InputVoltageHigh(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2InputVoltageHigh()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliVolts' MappingStrings='[\"MIF.DMTF|Power Supply|004.12\"]' PUnit='volt * 10^-3'"
	 * @generated
	 */
	Long getRange2InputVoltageHigh();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputVoltageHigh <em>Range2 Input Voltage High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Input Voltage High</em>' attribute.
	 * @see #getRange2InputVoltageHigh()
	 * @generated
	 */
	void setRange2InputVoltageHigh(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Input Frequency Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency (in hertz) at the low end of the Input Frequency Range 2 of this Power Supply. A value of 0 implies DC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Input Frequency Low</em>' attribute.
	 * @see #setRange2InputFrequencyLow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2InputFrequencyLow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Power Supply|004.19\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRange2InputFrequencyLow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputFrequencyLow <em>Range2 Input Frequency Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Input Frequency Low</em>' attribute.
	 * @see #getRange2InputFrequencyLow()
	 * @generated
	 */
	void setRange2InputFrequencyLow(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Input Frequency High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency (in hertz) at the high end of the Input Frequency Range 2 of this Power Supply. A value of 0 implies DC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Input Frequency High</em>' attribute.
	 * @see #setRange2InputFrequencyHigh(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2InputFrequencyHigh()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hertz' MappingStrings='[\"MIF.DMTF|Power Supply|004.20\"]' PUnit='hertz'"
	 * @generated
	 */
	Long getRange2InputFrequencyHigh();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2InputFrequencyHigh <em>Range2 Input Frequency High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Input Frequency High</em>' attribute.
	 * @see #getRange2InputFrequencyHigh()
	 * @generated
	 */
	void setRange2InputFrequencyHigh(Long value);

	/**
	 * Returns the value of the '<em><b>Active Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActiveInputVoltage indicates which input voltage range is currently in use. Range 1, 2, or both can be specified using the values 3, 4, or 5, respectively. If the Supply is not currently drawing power, the value 6 ("Neither") can be specified. This information is necessary in the case of a UPS, a subclass of PowerSupply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Input Voltage</em>' attribute.
	 * @see #setActiveInputVoltage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_ActiveInputVoltage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Range 1\",\"Range 2\",\"Both\",\"Neither\"]' MappingStrings='[\"MIF.DMTF|Power Supply|004.15\"]'"
	 * @generated
	 */
	Integer getActiveInputVoltage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getActiveInputVoltage <em>Active Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Input Voltage</em>' attribute.
	 * @see #getActiveInputVoltage()
	 * @generated
	 */
	void setActiveInputVoltage(Integer value);

	/**
	 * Returns the value of the '<em><b>Type Of Range Switching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TypeOfRangeSwitching describes the kind of input voltage range switching that is implemented in this PowerSupply. For example, autoswitching can be specified (value=4).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Range Switching</em>' attribute.
	 * @see #setTypeOfRangeSwitching(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_TypeOfRangeSwitching()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Manual\",\"Autoswitch\",\"Wide Range\",\"Not Applicable\"]' MappingStrings='[\"MIF.DMTF|Power Supply|004.16\"]'"
	 * @generated
	 */
	Integer getTypeOfRangeSwitching();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getTypeOfRangeSwitching <em>Type Of Range Switching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Range Switching</em>' attribute.
	 * @see #getTypeOfRangeSwitching()
	 * @generated
	 */
	void setTypeOfRangeSwitching(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the total output power of the PowerSupply in milliWatts. 0 denotes 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Output Power</em>' attribute.
	 * @see #setTotalOutputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_TotalOutputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliWatts' MappingStrings='[\"MIF.DMTF|Power Supply|004.21\"]' PUnit='watt * 10^-3'"
	 * @generated
	 */
	Long getTotalOutputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getTotalOutputPower <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Output Power</em>' attribute.
	 * @see #getTotalOutputPower()
	 * @generated
	 */
	void setTotalOutputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Input Power Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the programmatic units for the Range1MaxInputPower and MaxInputPowerRange2 properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Power Units</em>' attribute.
	 * @see #setInputPowerUnits(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_InputPowerUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PowerSupply.Range1MaxInputPower\",\"CIM_PowerSupply.Range2MaxInputPower\"]' IsPUnit='true'"
	 * @generated
	 */
	String getInputPowerUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getInputPowerUnits <em>Input Power Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Power Units</em>' attribute.
	 * @see #getInputPowerUnits()
	 * @generated
	 */
	void setInputPowerUnits(String value);

	/**
	 * Returns the value of the '<em><b>Is AC Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value of true shall indicate the required input of the PowerSupply is alternating current (AC). A value of false shall indicate the required input for the PowerSource is direct current (DC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is AC Input</em>' attribute.
	 * @see #setIsACInput(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_IsACInput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsACInput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getIsACInput <em>Is AC Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is AC Input</em>' attribute.
	 * @see #getIsACInput()
	 * @generated
	 */
	void setIsACInput(Boolean value);

	/**
	 * Returns the value of the '<em><b>Nominal Phase Wiring</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NominalPhaseWiring shall indicate the phases this power supply is configured to utilize. The actual phases from which the supply is drawing may vary. For example, a power supply that utilizes two phases and is wired to three phases may cycle through any combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Phase Wiring</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_NominalPhaseWiring()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"A\",\"B\",\"C\"]'"
	 * @generated
	 */
	EList<Long> getNominalPhaseWiring();

	/**
	 * Returns the value of the '<em><b>Number Of Phases Utilized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NumberOfPhasesUtilized shall indicate the number of phases this power supply is configured to utilize. A value of zero shall indicate zero phases are utilized or this information is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Phases Utilized</em>' attribute.
	 * @see #setNumberOfPhasesUtilized(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_NumberOfPhasesUtilized()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getNumberOfPhasesUtilized();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getNumberOfPhasesUtilized <em>Number Of Phases Utilized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Phases Utilized</em>' attribute.
	 * @see #getNumberOfPhasesUtilized()
	 * @generated
	 */
	void setNumberOfPhasesUtilized(Long value);

	/**
	 * Returns the value of the '<em><b>Range1 Max Input Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of power that this PowerSupply may draw if the CIM_PowerSupply.ActiveInputVoltage has the value 2 or 3. The units of the value shall be described by the InputPowerUnits property. A value of zero shall indicate 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Max Input Power</em>' attribute.
	 * @see #setRange1MaxInputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1MaxInputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PowerSupply.InputPowerUnits\"]'"
	 * @generated
	 */
	Long getRange1MaxInputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1MaxInputPower <em>Range1 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Max Input Power</em>' attribute.
	 * @see #getRange1MaxInputPower()
	 * @generated
	 */
	void setRange1MaxInputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Range1 Max Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of power that may be drawn from this PowerSupply without causing a failure condition if the CIM_PowerSupply.ActiveInputVoltage has the value 2 or 3. The units of the value shall be described by the OutputPowerUnits property. A value of zero shall indicate 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range1 Max Output Power</em>' attribute.
	 * @see #setRange1MaxOutputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range1MaxOutputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PowerSupply.OutputPowerUnits\"]'"
	 * @generated
	 */
	Long getRange1MaxOutputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange1MaxOutputPower <em>Range1 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range1 Max Output Power</em>' attribute.
	 * @see #getRange1MaxOutputPower()
	 * @generated
	 */
	void setRange1MaxOutputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Max Input Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of power that this PowerSupply may draw without causing a failure condition. The units of the value shall be described by the InputPowerUnits property. A value of zero shall indicate 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Max Input Power</em>' attribute.
	 * @see #setRange2MaxInputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2MaxInputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PowerSupply.InputPowerUnits\"]'"
	 * @generated
	 */
	Long getRange2MaxInputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2MaxInputPower <em>Range2 Max Input Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Max Input Power</em>' attribute.
	 * @see #getRange2MaxInputPower()
	 * @generated
	 */
	void setRange2MaxInputPower(Long value);

	/**
	 * Returns the value of the '<em><b>Range2 Max Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of power that may be drawn from this PowerSupply without causing a failure condition if the CIM_PowerSupply.ActiveInputVoltage has the value 4. The units of the value shall be described by the OutputPowerUnits property. A value of zero shall indicate 'unknown'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range2 Max Output Power</em>' attribute.
	 * @see #setRange2MaxOutputPower(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerSupply_Range2MaxOutputPower()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_PowerSupply.OutputPowerUnits\"]'"
	 * @generated
	 */
	Long getRange2MaxOutputPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerSupply#getRange2MaxOutputPower <em>Range2 Max Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range2 Max Output Power</em>' attribute.
	 * @see #getRange2MaxOutputPower()
	 * @generated
	 */
	void setRange2MaxOutputPower(Long value);

} // CIM_PowerSupply
