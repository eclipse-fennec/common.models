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
 * A representation of the model object '<em><b>CIM Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the Battery. This class applies to both batteries in Laptop Systems and other internal or external batteries, such as an uninterruptible power supply (UPS).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getBatteryStatus <em>Battery Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getTimeOnBattery <em>Time On Battery</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getEstimatedRunTime <em>Estimated Run Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getChemistry <em>Chemistry</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getDesignCapacity <em>Design Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getFullChargeCapacity <em>Full Charge Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getDesignVoltage <em>Design Voltage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getSmartBatteryVersion <em>Smart Battery Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getTimeToFullCharge <em>Time To Full Charge</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getExpectedLife <em>Expected Life</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getMaxRechargeTime <em>Max Recharge Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getRechargeCount <em>Recharge Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getMaxRechargeCount <em>Max Recharge Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getRemainingCapacity <em>Remaining Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getRemainingCapacityMaxError <em>Remaining Capacity Max Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getOtherChemistryDescription <em>Other Chemistry Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getChargingStatus <em>Charging Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Battery#getHealthPercent <em>Health Percent</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Battery()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.26.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Battery extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Battery Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the charge status of the Battery. Values such as "Fully Charged" (value=3) or "Partially Charged" (value=11) can be specified. The value, 10, is not valid in the CIM Schema because in DMI it represents that no battery is installed. In this case, this object should not be instantiated. The valuemaps: 6(Charging), 7(Charging and High), 8(Charging and Low), and 9(Charing and Critical) has been deprecated in lieu of the ChargingStatus property. 10(Undefined) has been deprecated in lieu of 2(Unknown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Status</em>' attribute.
	 * @see #setBatteryStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_BatteryStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unknown\",\"Fully Charged\",\"Low\",\"Critical\",\"Charging\",\"Charging and High\",\"Charging and Low\",\"Charging and Critical\",\"Undefined\",\"Partially Charged\",\"Learning\",\"Overcharged\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"MIF.DMTF|Portable Battery|003.14\"]'"
	 * @generated
	 */
	Integer getBatteryStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getBatteryStatus <em>Battery Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Status</em>' attribute.
	 * @see #getBatteryStatus()
	 * @generated
	 */
	void setBatteryStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Time On Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TimeOnBattery indicates the elapsed time in seconds since the ComputerSystem, UPS, or so on, last switched to battery power, or the time since the System or UPS was last restarted, whichever is less. Zero is returned if the Battery is 'on line'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time On Battery</em>' attribute.
	 * @see #setTimeOnBattery(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_TimeOnBattery()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getTimeOnBattery();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getTimeOnBattery <em>Time On Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time On Battery</em>' attribute.
	 * @see #getTimeOnBattery()
	 * @generated
	 */
	void setTimeOnBattery(Long value);

	/**
	 * Returns the value of the '<em><b>Estimated Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EstimatedRunTime is an estimate in minutes of the time that battery charge depletion will occur under the present load conditions if the utility power is off, or is lost and remains off, or a Laptop is disconnected from a power source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Run Time</em>' attribute.
	 * @see #setEstimatedRunTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_EstimatedRunTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Minutes' MappingStrings='[\"MIF.DMTF|Portable Battery|003.15\"]' PUnit='minute'"
	 * @generated
	 */
	Long getEstimatedRunTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getEstimatedRunTime <em>Estimated Run Time</em>}' attribute.
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
	 * An estimate of the percentage of full charge remaining.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Charge Remaining</em>' attribute.
	 * @see #setEstimatedChargeRemaining(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_EstimatedChargeRemaining()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percent' Gauge='true' PUnit='percent'"
	 * @generated
	 */
	Integer getEstimatedChargeRemaining();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Charge Remaining</em>' attribute.
	 * @see #getEstimatedChargeRemaining()
	 * @generated
	 */
	void setEstimatedChargeRemaining(Integer value);

	/**
	 * Returns the value of the '<em><b>Chemistry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the chemistry of the Battery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chemistry</em>' attribute.
	 * @see #setChemistry(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_Chemistry()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unknown\",\"Lead Acid\",\"Nickel Cadmium\",\"Nickel Metal Hydride\",\"Lithium-ion\",\"Zinc air\",\"Lithium Polymer\",\"DMTF Reserved\",\"Vendor Specified\"]' MappingStrings='[\"MIF.DMTF|Portable Battery|003.7\"]'"
	 * @generated
	 */
	Integer getChemistry();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getChemistry <em>Chemistry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemistry</em>' attribute.
	 * @see #getChemistry()
	 * @generated
	 */
	void setChemistry(Integer value);

	/**
	 * Returns the value of the '<em><b>Design Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The design capacity of the battery in mWatt-hours. If this property is not supported, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Capacity</em>' attribute.
	 * @see #setDesignCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_DesignCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliWattHours' MappingStrings='[\"MIF.DMTF|Portable Battery|003.8\"]' PUnit='watt * hour * 10^-3'"
	 * @generated
	 */
	Long getDesignCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getDesignCapacity <em>Design Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Capacity</em>' attribute.
	 * @see #getDesignCapacity()
	 * @generated
	 */
	void setDesignCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Full Charge Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full charge capacity of the battery in mWatt-hours. Comparison of this value to the Battery DesignCapacity determines when the Battery requires replacement. The end of life of a Battery is typically when the FullCharge Capacity falls below 80% of the DesignCapacity. If this property is not supported, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Charge Capacity</em>' attribute.
	 * @see #setFullChargeCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_FullChargeCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliWattHours' MappingStrings='[\"MIF.DMTF|Portable Battery|003.11\"]' PUnit='watt * hour * 10^-3'"
	 * @generated
	 */
	Long getFullChargeCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getFullChargeCapacity <em>Full Charge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Charge Capacity</em>' attribute.
	 * @see #getFullChargeCapacity()
	 * @generated
	 */
	void setFullChargeCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Design Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The design voltage of the battery in mVolts. If this attribute is not supported, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Voltage</em>' attribute.
	 * @see #setDesignVoltage(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_DesignVoltage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliVolts' MappingStrings='[\"MIF.DMTF|Portable Battery|003.9\"]' PUnit='volt * 10^-3'"
	 * @generated
	 */
	Long getDesignVoltage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getDesignVoltage <em>Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Voltage</em>' attribute.
	 * @see #getDesignVoltage()
	 * @generated
	 */
	void setDesignVoltage(Long value);

	/**
	 * Returns the value of the '<em><b>Smart Battery Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Smart Battery Data Specification version number that is supported by this Battery. If the Battery does not support this function, the value should be left blank.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Smart Battery Version</em>' attribute.
	 * @see #setSmartBatteryVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_SmartBatteryVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|Portable Battery|003.10\"]'"
	 * @generated
	 */
	String getSmartBatteryVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getSmartBatteryVersion <em>Smart Battery Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smart Battery Version</em>' attribute.
	 * @see #getSmartBatteryVersion()
	 * @generated
	 */
	void setSmartBatteryVersion(String value);

	/**
	 * Returns the value of the '<em><b>Time To Full Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining time in minutes to charge the battery fully at the current charging rate and usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time To Full Charge</em>' attribute.
	 * @see #setTimeToFullCharge(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_TimeToFullCharge()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Minutes' MappingStrings='[\"MIF.DMTF|Portable Battery|003.16\"]' PUnit='minute'"
	 * @generated
	 */
	Long getTimeToFullCharge();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getTimeToFullCharge <em>Time To Full Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Full Charge</em>' attribute.
	 * @see #getTimeToFullCharge()
	 * @generated
	 */
	void setTimeToFullCharge(Long value);

	/**
	 * Returns the value of the '<em><b>Expected Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the expected lifetime of the Battery in minutes, assuming that the Battery is fully charged. This property represents the total expected life of the Battery, not its current remaining life, which is indicated by the EstimatedRunTime property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Life</em>' attribute.
	 * @see #setExpectedLife(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_ExpectedLife()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Minutes' PUnit='minute'"
	 * @generated
	 */
	Long getExpectedLife();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getExpectedLife <em>Expected Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Life</em>' attribute.
	 * @see #getExpectedLife()
	 * @generated
	 */
	void setExpectedLife(Long value);

	/**
	 * Returns the value of the '<em><b>Max Recharge Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxRechargeTime indicates the maximum time, in minutes, to fully charge the Battery. This property represents the time to recharge a fully depleted Battery, not the current remaining charging time, which is indicated in the TimeToFullCharge property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Recharge Time</em>' attribute.
	 * @see #setMaxRechargeTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_MaxRechargeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Minutes' PUnit='minute'"
	 * @generated
	 */
	Long getMaxRechargeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getMaxRechargeTime <em>Max Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Recharge Time</em>' attribute.
	 * @see #getMaxRechargeTime()
	 * @generated
	 */
	void setMaxRechargeTime(Long value);

	/**
	 * Returns the value of the '<em><b>Recharge Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times the Battery has been recharged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recharge Count</em>' attribute.
	 * @see #setRechargeCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_RechargeCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getRechargeCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getRechargeCount <em>Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recharge Count</em>' attribute.
	 * @see #getRechargeCount()
	 * @generated
	 */
	void setRechargeCount(Long value);

	/**
	 * Returns the value of the '<em><b>Max Recharge Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times the Battery can be recharged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Recharge Count</em>' attribute.
	 * @see #setMaxRechargeCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_MaxRechargeCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxRechargeCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getMaxRechargeCount <em>Max Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Recharge Count</em>' attribute.
	 * @see #getMaxRechargeCount()
	 * @generated
	 */
	void setMaxRechargeCount(Long value);

	/**
	 * Returns the value of the '<em><b>Remaining Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Battery's remaining charge capacity in mWatt-hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Capacity</em>' attribute.
	 * @see #setRemainingCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_RemainingCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MilliWattHours' PUnit='watt * hour * 10^-3'"
	 * @generated
	 */
	Long getRemainingCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getRemainingCapacity <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Capacity</em>' attribute.
	 * @see #getRemainingCapacity()
	 * @generated
	 */
	void setRemainingCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Remaining Capacity Max Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum error (as a percentage) in the mWatt-hour data reported by RemainingCapacity property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Capacity Max Error</em>' attribute.
	 * @see #setRemainingCapacityMaxError(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_RemainingCapacityMaxError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percentage' PUnit='percent'"
	 * @generated
	 */
	Integer getRemainingCapacityMaxError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getRemainingCapacityMaxError <em>Remaining Capacity Max Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Capacity Max Error</em>' attribute.
	 * @see #getRemainingCapacityMaxError()
	 * @generated
	 */
	void setRemainingCapacityMaxError(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Chemistry Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the battery chemistry when the Chemistry property has value 1 (Other). The property shall be implemented if the Chemistry property has value 1(Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Chemistry Description</em>' attribute.
	 * @see #setOtherChemistryDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_OtherChemistryDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherChemistryDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getOtherChemistryDescription <em>Other Chemistry Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Chemistry Description</em>' attribute.
	 * @see #getOtherChemistryDescription()
	 * @generated
	 */
	void setOtherChemistryDescription(String value);

	/**
	 * Returns the value of the '<em><b>Charging Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargingStatus indicates whether the battery is charging. Charging - the battery is charging. Discharging - the battery is discharging. Idle - the batter is neither charging nor discharging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charging Status</em>' attribute.
	 * @see #setChargingStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_ChargingStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Charging\",\"Discharging\",\"Idle\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Integer getChargingStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getChargingStatus <em>Charging Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Status</em>' attribute.
	 * @see #getChargingStatus()
	 * @generated
	 */
	void setChargingStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Health Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimate of the percentage of the overall battery health. It indicates how much the battery has deteriorated over time. It can take values 0 to 100; 255 if it is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Health Percent</em>' attribute.
	 * @see #setHealthPercent(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Battery_HealthPercent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percentage' PUnit='percent'"
	 * @generated
	 */
	Integer getHealthPercent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Battery#getHealthPercent <em>Health Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Percent</em>' attribute.
	 * @see #getHealthPercent()
	 * @generated
	 */
	void setHealthPercent(Integer value);

} // CIM_Battery
