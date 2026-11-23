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
 * A representation of the model object '<em><b>CIM Unitary Computer System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC, Server or other type of a single node Computer System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getInitialLoadInfo <em>Initial Load Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getLastLoadInfo <em>Last Load Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getPowerManagementSupported <em>Power Management Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getPowerState <em>Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getWakeUpType <em>Wake Up Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ComputerSystem\"]' Version='2.15.0' UMLPackagePath='CIM::System::SystemElements' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UnitaryComputerSystem extends CIM_ComputerSystem {
	/**
	 * Returns the value of the '<em><b>Initial Load Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Load Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem_InitialLoadInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_BootSourceSetting\"]'"
	 * @generated
	 */
	EList<String> getInitialLoadInfo();

	/**
	 * Returns the value of the '<em><b>Last Load Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Load Info</em>' attribute.
	 * @see #setLastLoadInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem_LastLoadInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_BootSourceSetting\"]' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemInitialLoadDevice\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemInitialLoadParameters\",\"MIF.DMTF|Host System|001.3\"]'"
	 * @generated
	 */
	String getLastLoadInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getLastLoadInfo <em>Last Load Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Load Info</em>' attribute.
	 * @see #getLastLoadInfo()
	 * @generated
	 */
	void setLastLoadInfo(String value);

	/**
	 * Returns the value of the '<em><b>Power Management Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Management Supported</em>' attribute.
	 * @see #setPowerManagementSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem_PowerManagementSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PowerManagementCapabilities\"]'"
	 * @generated
	 */
	Boolean getPowerManagementSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getPowerManagementSupported <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Management Supported</em>' attribute.
	 * @see #getPowerManagementSupported()
	 * @generated
	 */
	void setPowerManagementSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current power state of the ComputerSystem and its associated OperatingSystem. This property is being deprecated. Instead, the PowerState property in the AssociatedPowerManagementService class SHOULD be used. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
	 * Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
	 * Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
	 * Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power State</em>' attribute.
	 * @see #setPowerState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem_PowerState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedPowerManagementService.PowerState\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Unknown\",\"Full Power\",\"Power Save - Low Power Mode\",\"Power Save - Standby\",\"Power Save - Unknown\",\"Power Cycle\",\"Power Off\",\"Power Save - Warning\",\"Power Save - Hibernate\",\"Power Save - Soft Off\"]'"
	 * @generated
	 */
	Integer getPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getPowerState <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power State</em>' attribute.
	 * @see #getPowerState()
	 * @generated
	 */
	void setPowerState(Integer value);

	/**
	 * Returns the value of the '<em><b>Wake Up Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wake Up Type</em>' attribute.
	 * @see #setWakeUpType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitaryComputerSystem_WakeUpType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Reserved\",\"Other\",\"Unknown\",\"APM Timer\",\"Modem Ring\",\"LAN Remote\",\"Power Switch\",\"PCI PME#\",\"A/C Power Restored\"]'"
	 * @generated
	 */
	Integer getWakeUpType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitaryComputerSystem#getWakeUpType <em>Wake Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wake Up Type</em>' attribute.
	 * @see #getWakeUpType()
	 * @generated
	 */
	void setWakeUpType(Integer value);

} // CIM_UnitaryComputerSystem
