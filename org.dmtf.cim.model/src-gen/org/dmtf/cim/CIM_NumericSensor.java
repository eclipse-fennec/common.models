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
 * A representation of the model object '<em><b>CIM Numeric Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Numeric Sensor is capable of returning numeric readings and optionally supports thresholds settings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getBaseUnits <em>Base Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getUnitModifier <em>Unit Modifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getRateUnits <em>Rate Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getNominalReading <em>Nominal Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getNormalMax <em>Normal Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getNormalMin <em>Normal Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getMaxReadable <em>Max Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getMinReadable <em>Min Readable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getHysteresis <em>Hysteresis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdNonCritical <em>Lower Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdNonCritical <em>Upper Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdCritical <em>Lower Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdCritical <em>Upper Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdFatal <em>Lower Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdFatal <em>Upper Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getSupportedThresholds <em>Supported Thresholds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getEnabledThresholds <em>Enabled Thresholds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NumericSensor#getSettableThresholds <em>Settable Thresholds</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_NumericSensor extends CIM_Sensor {
	/**
	 * Returns the value of the '<em><b>Base Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base unit of the values returned by this Sensor. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). For example, if BaseUnits is Volts and the UnitModifier is -6, then the units of the values returned are MicroVolts. However, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Units</em>' attribute.
	 * @see #setBaseUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_BaseUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\"]' Values='[\"Unknown\",\"Other\",\"Degrees C\",\"Degrees F\",\"Degrees K\",\"Volts\",\"Amps\",\"Watts\",\"Joules\",\"Coulombs\",\"VA\",\"Nits\",\"Lumens\",\"Lux\",\"Candelas\",\"kPa\",\"PSI\",\"Newtons\",\"CFM\",\"RPM\",\"Hertz\",\"Seconds\",\"Minutes\",\"Hours\",\"Days\",\"Weeks\",\"Mils\",\"Inches\",\"Feet\",\"Cubic Inches\",\"Cubic Feet\",\"Meters\",\"Cubic Centimeters\",\"Cubic Meters\",\"Liters\",\"Fluid Ounces\",\"Radians\",\"Steradians\",\"Revolutions\",\"Cycles\",\"Gravities\",\"Ounces\",\"Pounds\",\"Foot-Pounds\",\"Ounce-Inches\",\"Gauss\",\"Gilberts\",\"Henries\",\"Farads\",\"Ohms\",\"Siemens\",\"Moles\",\"Becquerels\",\"PPM (parts/million)\",\"Decibels\",\"DbA\",\"DbC\",\"Grays\",\"Sieverts\",\"Color Temperature Degrees K\",\"Bits\",\"Bytes\",\"Words (data)\",\"DoubleWords\",\"QuadWords\",\"Percentage\",\"Pascals\",\"Decimal Degrees (DD)\"]' ModelCorrespondence='[\"CIM_NumericSensor.UnitModifier\",\"CIM_NumericSensor.RateUnits\"]'"
	 * @generated
	 */
	Integer getBaseUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getBaseUnits <em>Base Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Units</em>' attribute.
	 * @see #getBaseUnits()
	 * @generated
	 */
	void setBaseUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Unit Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit multiplier for the values returned by this Sensor. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). For example, if BaseUnits is Volts and the Unit Modifier is -6, then the units of the values returned are MicroVolts. However, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Modifier</em>' attribute.
	 * @see #setUnitModifier(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_UnitModifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' ModelCorrespondence='[\"CIM_NumericSensor.BaseUnits\",\"CIM_NumericSensor.RateUnits\"]'"
	 * @generated
	 */
	Integer getUnitModifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getUnitModifier <em>Unit Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Modifier</em>' attribute.
	 * @see #getUnitModifier()
	 * @generated
	 */
	void setUnitModifier(Integer value);

	/**
	 * Returns the value of the '<em><b>Rate Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if the units returned by this Sensor are rate units. All the values returned by this Sensor are represented in the units obtained by (BaseUnits * 10 raised to the power of the UnitModifier). This is true unless this property (RateUnits) has a value different than "None". For example, if BaseUnits is Volts and the UnitModifier is -6, then the units of the values returned are MicroVolts. But, if the RateUnits property is set to a value other than "None", then the units are further qualified as rate units. In the above example, if RateUnits is set to "Per Second", then the values returned by the Sensor are in MicroVolts/Second. The units apply to all numeric properties of the Sensor, unless explicitly overridden by the Units qualifier. Any implementation of CurrentReading should be qualified with either a Counter or a Gauge qualifier, depending on the characteristics of the sensor being modeled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Units</em>' attribute.
	 * @see #setRateUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_RateUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"None\",\"Per MicroSecond\",\"Per MilliSecond\",\"Per Second\",\"Per Minute\",\"Per Hour\",\"Per Day\",\"Per Week\",\"Per Month\",\"Per Year\"]' ModelCorrespondence='[\"CIM_NumericSensor.UnitModifier\",\"CIM_NumericSensor.BaseUnits\"]'"
	 * @generated
	 */
	Integer getRateUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getRateUnits <em>Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Units</em>' attribute.
	 * @see #getRateUnits()
	 * @generated
	 */
	void setRateUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value indicated by the Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Reading</em>' attribute.
	 * @see #setCurrentReading(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_CurrentReading()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.5\",\"MIF.DMTF|Electrical Current Probe|001.5\",\"MIF.DMTF|Voltage Probe|001.5\"]'"
	 * @generated
	 */
	Integer getCurrentReading();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getCurrentReading <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Reading</em>' attribute.
	 * @see #getCurrentReading()
	 * @generated
	 */
	void setCurrentReading(Integer value);

	/**
	 * Returns the value of the '<em><b>Nominal Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NominalReading indicates the 'normal' or expected value for the NumericSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Reading</em>' attribute.
	 * @see #setNominalReading(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_NominalReading()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.6\",\"MIF.DMTF|Electrical Current Probe|001.6\",\"MIF.DMTF|Voltage Probe|001.6\"]'"
	 * @generated
	 */
	Integer getNominalReading();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getNominalReading <em>Nominal Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Reading</em>' attribute.
	 * @see #getNominalReading()
	 * @generated
	 */
	void setNominalReading(Integer value);

	/**
	 * Returns the value of the '<em><b>Normal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NormalMax provides guidance for the user as to the normal maximum range for the NumericSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Max</em>' attribute.
	 * @see #setNormalMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_NormalMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.7\",\"MIF.DMTF|Electrical Current Probe|001.7\",\"MIF.DMTF|Voltage Probe|001.7\"]'"
	 * @generated
	 */
	Integer getNormalMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getNormalMax <em>Normal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Max</em>' attribute.
	 * @see #getNormalMax()
	 * @generated
	 */
	void setNormalMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Normal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NormalMin provides guidance for the user as to the normal minimum range for the NumericSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Min</em>' attribute.
	 * @see #setNormalMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_NormalMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.8\",\"MIF.DMTF|Electrical Current Probe|001.8\",\"MIF.DMTF|Voltage Probe|001.8\"]'"
	 * @generated
	 */
	Integer getNormalMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getNormalMin <em>Normal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Min</em>' attribute.
	 * @see #getNormalMin()
	 * @generated
	 */
	void setNormalMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxReadable indicates the largest value of the measured property that can be read by the NumericSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Readable</em>' attribute.
	 * @see #setMaxReadable(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_MaxReadable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.9\",\"MIF.DMTF|Electrical Current Probe|001.9\",\"MIF.DMTF|Voltage Probe|001.9\"]'"
	 * @generated
	 */
	Integer getMaxReadable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getMaxReadable <em>Max Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Readable</em>' attribute.
	 * @see #getMaxReadable()
	 * @generated
	 */
	void setMaxReadable(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinReadable indicates the smallest value of the measured property that can be read by the NumericSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Readable</em>' attribute.
	 * @see #setMinReadable(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_MinReadable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.10\",\"MIF.DMTF|Electrical Current Probe|001.10\",\"MIF.DMTF|Voltage Probe|001.10\"]'"
	 * @generated
	 */
	Integer getMinReadable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getMinReadable <em>Min Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Readable</em>' attribute.
	 * @see #getMinReadable()
	 * @generated
	 */
	void setMinReadable(Integer value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolution indicates the ability of the Sensor to resolve differences in the measured property. The units for this measurement are determined by BaseUnit*UnitModifier/RateUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_Resolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.17\",\"MIF.DMTF|Electrical Current Probe|001.17\",\"MIF.DMTF|Voltage Probe|001.17\"]'"
	 * @generated
	 */
	Long getResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated in lieu of using the Resolution and Accuracy properties. 
	 * Indicates the tolerance of the Sensor for the measured property. Tolerance, along with Resolution and Accuracy, is used to calculate the actual value of the measured physical property. Tolerance may vary depending on whether the Device is linear over its dynamic range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_Tolerance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Deprecated='[\"CIM_NumericSensor.Resolution\",\"CIM_NumericSensor.Accuracy\"]'"
	 * @generated
	 */
	Integer getTolerance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(Integer value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the accuracy of the Sensor for the measured property. Its value is recorded as plus/minus hundredths of a percent. Accuracy, along with Resolution, is used to calculate the actual value of the measured physical property. Accuracy may vary depending on whether the Device is linear over its dynamic range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_Accuracy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Units='Hundredths of Percent' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.19\",\"MIF.DMTF|Electrical Current Probe|001.19\",\"MIF.DMTF|Voltage Probe|001.19\"]' PUnit='percent * 10^-2'"
	 * @generated
	 */
	Integer getAccuracy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Linear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the Sensor is linear over its dynamic range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Linear</em>' attribute.
	 * @see #setIsLinear(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_IsLinear()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsLinear();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getIsLinear <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Linear</em>' attribute.
	 * @see #getIsLinear()
	 * @generated
	 */
	void setIsLinear(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hysteresis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the margin built around the thresholds. This margin prevents unnecessary state changes when the Sensor reading may fluctuate very close to its thresholds. This could be due to the Sensor's tolerance/accuracy/resolution or due to environmental factors. Once a threshold is crossed, the state of the Sensor should change. However, the state should not fluctuate between the old and new states unless the Sensor's change in the reading exceeds the hysteresis value. The units for this measurement are determined by BaseUnit*UnitModifier/RateUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hysteresis</em>' attribute.
	 * @see #setHysteresis(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_Hysteresis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getHysteresis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getHysteresis <em>Hysteresis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hysteresis</em>' attribute.
	 * @see #getHysteresis()
	 * @generated
	 */
	void setHysteresis(Long value);

	/**
	 * Returns the value of the '<em><b>Lower Threshold Non Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If Current Reading is between LowerThresholdNonCritical and Upper ThresholdNonCritical, then the Sensor is reporting a normal value. If CurrentReading is between LowerThresholdNonCritical and LowerThresholdCritical, then the CurrentState is NonCritical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Threshold Non Critical</em>' attribute.
	 * @see #setLowerThresholdNonCritical(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_LowerThresholdNonCritical()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.11\",\"MIF.DMTF|Electrical Current Probe|001.11\",\"MIF.DMTF|Voltage Probe|001.11\"]'"
	 * @generated
	 */
	Integer getLowerThresholdNonCritical();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdNonCritical <em>Lower Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Threshold Non Critical</em>' attribute.
	 * @see #getLowerThresholdNonCritical()
	 * @generated
	 */
	void setLowerThresholdNonCritical(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Threshold Non Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between LowerThresholdNonCritical and UpperThresholdNonCritical, then the Sensor is reporting a normal value. If the CurrentReading is between UpperThreshold NonCritical and UpperThresholdCritical, then the CurrentState is NonCritical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Threshold Non Critical</em>' attribute.
	 * @see #setUpperThresholdNonCritical(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_UpperThresholdNonCritical()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.12\",\"MIF.DMTF|Electrical Current Probe|001.12\",\"MIF.DMTF|Voltage Probe|001.12\"]'"
	 * @generated
	 */
	Integer getUpperThresholdNonCritical();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdNonCritical <em>Upper Threshold Non Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Threshold Non Critical</em>' attribute.
	 * @see #getUpperThresholdNonCritical()
	 * @generated
	 */
	void setUpperThresholdNonCritical(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Threshold Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between LowerThresholdCritical and Lower ThresholdFatal, then the CurrentState is Critical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Threshold Critical</em>' attribute.
	 * @see #setLowerThresholdCritical(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_LowerThresholdCritical()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.13\",\"MIF.DMTF|Electrical Current Probe|001.13\",\"MIF.DMTF|Voltage Probe|001.13\"]'"
	 * @generated
	 */
	Integer getLowerThresholdCritical();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdCritical <em>Lower Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Threshold Critical</em>' attribute.
	 * @see #getLowerThresholdCritical()
	 * @generated
	 */
	void setLowerThresholdCritical(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Threshold Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is between UpperThresholdCritical and Upper ThresholdFatal, then the CurrentState is Critical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Threshold Critical</em>' attribute.
	 * @see #setUpperThresholdCritical(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_UpperThresholdCritical()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.14\",\"MIF.DMTF|Electrical Current Probe|001.14\",\"MIF.DMTF|Voltage Probe|001.14\"]'"
	 * @generated
	 */
	Integer getUpperThresholdCritical();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdCritical <em>Upper Threshold Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Threshold Critical</em>' attribute.
	 * @see #getUpperThresholdCritical()
	 * @generated
	 */
	void setUpperThresholdCritical(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower Threshold Fatal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is below LowerThresholdFatal, then the Current State is Fatal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Threshold Fatal</em>' attribute.
	 * @see #setLowerThresholdFatal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_LowerThresholdFatal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.15\",\"MIF.DMTF|Electrical Current Probe|001.15\",\"MIF.DMTF|Voltage Probe|001.15\"]'"
	 * @generated
	 */
	Integer getLowerThresholdFatal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getLowerThresholdFatal <em>Lower Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Threshold Fatal</em>' attribute.
	 * @see #getLowerThresholdFatal()
	 * @generated
	 */
	void setLowerThresholdFatal(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Threshold Fatal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sensor's threshold values specify the ranges (min and max values) for determining whether the Sensor is operating under Normal, NonCritical, Critical or Fatal conditions. If the CurrentReading is above UpperThresholdFatal, then the Current State is Fatal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Threshold Fatal</em>' attribute.
	 * @see #setUpperThresholdFatal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_UpperThresholdFatal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Write='true' MappingStrings='[\"MIF.DMTF|Temperature Probe|002.16\",\"MIF.DMTF|Electrical Current Probe|001.16\",\"MIF.DMTF|Voltage Probe|001.16\"]'"
	 * @generated
	 */
	Integer getUpperThresholdFatal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NumericSensor#getUpperThresholdFatal <em>Upper Threshold Fatal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Threshold Fatal</em>' attribute.
	 * @see #getUpperThresholdFatal()
	 * @generated
	 */
	void setUpperThresholdFatal(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Thresholds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array representing the thresholds supported by this Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Thresholds</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_SupportedThresholds()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"LowerThresholdNonCritical\",\"UpperThresholdNonCritical\",\"LowerThresholdCritical\",\"UpperThresholdCritical\",\"LowerThresholdFatal\",\"UpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedThresholds();

	/**
	 * Returns the value of the '<em><b>Enabled Thresholds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array representing the thresholds that are currently enabled for this Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Thresholds</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_EnabledThresholds()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"LowerThresholdNonCritical\",\"UpperThresholdNonCritical\",\"LowerThresholdCritical\",\"UpperThresholdCritical\",\"LowerThresholdFatal\",\"UpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledThresholds();

	/**
	 * Returns the value of the '<em><b>Settable Thresholds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array representing the writable thresholds supported by Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settable Thresholds</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NumericSensor_SettableThresholds()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"LowerThresholdNonCritical\",\"UpperThresholdNonCritical\",\"LowerThresholdCritical\",\"UpperThresholdCritical\",\"LowerThresholdFatal\",\"UpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getSettableThresholds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method resets the values of the thresholds to hardware defaults. This method returns 0 if successful, 1 if unsupported and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long RestoreDefaultThresholds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use of this method is being deprecated, since Current senor reading can be retrieved through the GetInstance operation. 
	 * For a non-linear Sensor, the resolution, accuracy, tolerance and hysteresis vary as the current reading moves. This method can be used to get these factors for a given reading. It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param SensorReading The sensor reading to get information for.
	 * @param Accuracy The accuracy of the reading.
	 * @param Resolution The resolution of the reading.
	 * @param Tolerance The tolerance of the reading.
	 * @param Hysteresis The Hysteresis of the reading.
	 * <!-- end-model-doc -->
	 * @model SensorReadingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' In='true'" AccuracyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' In='false' Out='true'" ResolutionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='false' Out='true'" ToleranceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' In='false' Out='true'" HysteresisAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Long GetNonLinearFactors(Integer SensorReading, Integer Accuracy, Long Resolution, Integer Tolerance, Long Hysteresis);

} // CIM_NumericSensor
