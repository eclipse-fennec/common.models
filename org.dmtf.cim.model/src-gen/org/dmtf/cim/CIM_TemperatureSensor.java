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
 * A representation of the model object '<em><b>CIM Temperature Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The use of this class is being deprecated in lieu of the additions to Sensor and Numeric Sensor. A TemperatureSensor can be defined by setting the SensorType property, inherited from Sensor, to 2 ("Temperature").
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TemperatureSensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NumericSensor\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' override.SensorType='uint16' override.SensorType.Deprecated='[\"No value\"]' override.BaseUnits='uint16' override.BaseUnits.Deprecated='[\"No value\"]' override.UnitModifier='sint32' override.UnitModifier.Deprecated='[\"No value\"]' override.RateUnits='uint16' override.RateUnits.Deprecated='[\"No value\"]' override.CurrentReading='sint32' override.CurrentReading.Deprecated='[\"No value\"]' override.CurrentReading.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.5\"]' override.NominalReading='sint32' override.NominalReading.Deprecated='[\"No value\"]' override.NominalReading.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.6\"]' override.NormalMax='sint32' override.NormalMax.Deprecated='[\"No value\"]' override.NormalMax.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.7\"]' override.NormalMin='sint32' override.NormalMin.Deprecated='[\"No value\"]' override.NormalMin.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.8\"]' override.MaxReadable='sint32' override.MaxReadable.Deprecated='[\"No value\"]' override.MaxReadable.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.9\"]' override.MinReadable='sint32' override.MinReadable.Deprecated='[\"No value\"]' override.MinReadable.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.10\"]' override.Resolution='uint32' override.Resolution.Deprecated='[\"No value\"]' override.Resolution.Units='Hundredths of Degrees C' override.Resolution.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.17\"]' override.Resolution.PUnit='degree celsius * 10^-2' override.Tolerance='sint32' override.Tolerance.Deprecated='[\"No value\"]' override.Tolerance.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.18\"]' override.Accuracy='sint32' override.Accuracy.Deprecated='[\"No value\"]' override.Accuracy.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.19\"]' override.LowerThresholdNonCritical='sint32' override.LowerThresholdNonCritical.Deprecated='[\"No value\"]' override.LowerThresholdNonCritical.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.11\"]' override.UpperThresholdNonCritical='sint32' override.UpperThresholdNonCritical.Deprecated='[\"No value\"]' override.UpperThresholdNonCritical.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.12\"]' override.LowerThresholdCritical='sint32' override.LowerThresholdCritical.Deprecated='[\"No value\"]' override.LowerThresholdCritical.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.13\"]' override.UpperThresholdCritical='sint32' override.UpperThresholdCritical.Deprecated='[\"No value\"]' override.UpperThresholdCritical.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.14\"]' override.LowerThresholdFatal='sint32' override.LowerThresholdFatal.Deprecated='[\"No value\"]' override.LowerThresholdFatal.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.15\"]' override.UpperThresholdFatal='sint32' override.UpperThresholdFatal.Deprecated='[\"No value\"]' override.UpperThresholdFatal.MappingStrings='[\"MIF.DMTF|Temperature Probe|002.16\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_TemperatureSensor extends CIM_NumericSensor {
} // CIM_TemperatureSensor
