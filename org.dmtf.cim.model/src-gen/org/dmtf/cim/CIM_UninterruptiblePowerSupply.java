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
 * A representation of the model object '<em><b>CIM Uninterruptible Power Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of an UninterruptiblePowerSupply. The properties of the UPS Device indicate when incoming power is trimmed or boosted, and the aggregated information of the batteries, generators, and so on that comprise the Device. These individual components (for example, multiple batteries) can also be independently modeled and associated with the UPS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getRemainingCapacityStatus <em>Remaining Capacity Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getTimeOnBackup <em>Time On Backup</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getEstimatedRunTime <em>Estimated Run Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UninterruptiblePowerSupply()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::CoolingAndPower' override.Range1InputVoltageLow='uint32' override.Range1InputVoltageLow.Description='If the voltage (in millivolts) drops below the value specified by Range1InputVoltageLow, the UPS will compensate by boosting the voltage using its power sources. A value of 0 indicates that the voltage at which boosting occurs is \'unknown\'.' override.Range1InputVoltageLow.Units='MilliVolts' override.Range1InputVoltageLow.PUnit='volt * 10^-3' override.Range1InputVoltageHigh='uint32' override.Range1InputVoltageHigh.Description='If the voltage (in millivolts) rises above the value specified by Range1InputVoltageHigh, the UPS will compensate by trimming the voltage. A value of 0 indicates that the voltage at which trimming occurs is \'unknown\'.' override.Range1InputVoltageHigh.Units='MilliVolts' override.Range1InputVoltageHigh.PUnit='volt * 10^-3' override.Range2InputVoltageLow='uint32' override.Range2InputVoltageLow.Description='If the voltage (in millivolts) drops below the value specified by Range2InputVoltageLow, the UPS will compensate by boosting the voltage using its power sources. A value of 0 indicates that the voltage at which boosting occurs is \'unknown\'.' override.Range2InputVoltageLow.Units='MilliVolts' override.Range2InputVoltageLow.PUnit='volt * 10^-3' override.Range2InputVoltageHigh='uint32' override.Range2InputVoltageHigh.Description='If the voltage (in millivolts) rises above the value specified by Range2InputVoltageHigh, the UPS will compensate by trimming the voltage. A value of 0 indicates that the voltage at which trimming occurs is \'unknown\'.' override.Range2InputVoltageHigh.Units='MilliVolts' override.Range2InputVoltageHigh.PUnit='volt * 10^-3' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_UninterruptiblePowerSupply extends CIM_PowerSupply {
	/**
	 * Returns the value of the '<em><b>Remaining Capacity Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The indication of the capacity that remains in the UPS batteries, generator, and so on. A value of "Normal" (2) indicates that the remaining estimated minutes of run-time are greater than the 'low power' state defined for the UPS (typically two minutes). A value of "Low" (3) indicates that the remaining estimated minutes of run-time are less than or equal to the defined 'low power' state of the device. A value of "Depleted" (4) indicates that the UPS will be unable to sustain the present load when and if the utility power is lost (including the possibility that the utility power is currently absent).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Capacity Status</em>' attribute.
	 * @see #setRemainingCapacityStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UninterruptiblePowerSupply_RemainingCapacityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Normal\",\"Low\",\"Depleted\"]' MappingStrings='[\"MIF.DMTF|UPS Battery|001.1\"]'"
	 * @generated
	 */
	Integer getRemainingCapacityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getRemainingCapacityStatus <em>Remaining Capacity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Capacity Status</em>' attribute.
	 * @see #getRemainingCapacityStatus()
	 * @generated
	 */
	void setRemainingCapacityStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Time On Backup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TimeOnBackup indicates the elapsed time in seconds since the UPS last switched to battery power, generator, or so on or the time since the UPS was last restarted, whichever is less. 0 is returned if the UPS is 'on line'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time On Backup</em>' attribute.
	 * @see #setTimeOnBackup(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UninterruptiblePowerSupply_TimeOnBackup()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIF.DMTF|UPS Battery|001.2\"]' PUnit='second'"
	 * @generated
	 */
	Long getTimeOnBackup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getTimeOnBackup <em>Time On Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time On Backup</em>' attribute.
	 * @see #getTimeOnBackup()
	 * @generated
	 */
	void setTimeOnBackup(Long value);

	/**
	 * Returns the value of the '<em><b>Estimated Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EstimatedRunTime is an estimate in minutes of the time that depletion of the battery, generator, or other device, will occur under the present load conditions if the utility power is off or is lost and remains off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Run Time</em>' attribute.
	 * @see #setEstimatedRunTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UninterruptiblePowerSupply_EstimatedRunTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Minutes' MappingStrings='[\"MIF.DMTF|UPS Battery|001.3\"]' PUnit='minute'"
	 * @generated
	 */
	Long getEstimatedRunTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getEstimatedRunTime <em>Estimated Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Run Time</em>' attribute.
	 * @see #getEstimatedRunTime()
	 * @generated
	 */
	void setEstimatedRunTime(Long value);

	/**
	 * Returns the value of the '<em><b>Estimated Charge Remaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimate of the percentage of full charge remaining for a UPS (that uses battery technology).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Charge Remaining</em>' attribute.
	 * @see #setEstimatedChargeRemaining(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UninterruptiblePowerSupply_EstimatedChargeRemaining()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percent' Gauge='true' MappingStrings='[\"MIF.DMTF|UPS Battery|001.4\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getEstimatedChargeRemaining();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UninterruptiblePowerSupply#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Charge Remaining</em>' attribute.
	 * @see #getEstimatedChargeRemaining()
	 * @generated
	 */
	void setEstimatedChargeRemaining(Integer value);

} // CIM_UninterruptiblePowerSupply
