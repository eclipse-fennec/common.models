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
 * A representation of the model object '<em><b>CIM Tachometer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The use of this class is deprecated in lieu of the additions to Sensor and NumericSensor. A Tachometer can be defined by setting the SensorType property. inherited from Sensor, to 5 ("Tachometer").
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Tachometer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NumericSensor\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' override.SensorType='uint16' override.SensorType.Deprecated='[\"No value\"]' override.BaseUnits='uint16' override.BaseUnits.Deprecated='[\"No value\"]' override.UnitModifier='sint32' override.UnitModifier.Deprecated='[\"No value\"]' override.RateUnits='uint16' override.RateUnits.Deprecated='[\"No value\"]' override.Resolution='uint32' override.Resolution.Deprecated='[\"No value\"]' override.Resolution.Units='Tenths of Revolutions per Minute' override.Resolution.PUnit='revolution / minute * 10^-1' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Tachometer extends CIM_NumericSensor {
} // CIM_Tachometer
