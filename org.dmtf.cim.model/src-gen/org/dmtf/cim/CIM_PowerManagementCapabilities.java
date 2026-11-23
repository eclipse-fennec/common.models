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
 * A representation of the model object '<em><b>CIM Power Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Capabilities that describes the power management aspects of an element (typically a system or device). The element's power management capabilities are decoupled from a PowerManagementService, since a single service could apply to multiple elements, each with specific capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getPowerCapabilities <em>Power Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getOtherPowerCapabilitiesDescriptions <em>Other Power Capabilities Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getPowerStatesSupported <em>Power States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getPowerChangeCapabilities <em>Power Change Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getOtherPowerChangeCapabilities <em>Other Power Change Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getRequestedPowerStatesSupported <em>Requested Power States Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Core::PowerMgmt' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PowerManagementCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Power Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
	 * 0 = Unknown 
	 * 1 = Other 
	 * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
	 * 3 = Power State Settable, indicating that the SetPowerState method is supported 
	 * 4 = Power Cycling Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' 
	 * 5 = Timed Power On Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' and the Time parameter set to a specific date and time, or interval, for power-on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_PowerCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Power Saving Modes Entered Automatically\",\"Power State Settable\",\"Power Cycling Supported\",\"Timed Power On Supported\"]' MappingStrings='[\"MIF.DMTF|System Power Controls|001.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.OtherPowerCapabilitiesDescriptions\",\"CIM_PowerManagementService.SetPowerState\"]'"
	 * @generated
	 */
	EList<Integer> getPowerCapabilities();

	/**
	 * Returns the value of the '<em><b>Other Power Capabilities Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings describing an element's additional power management capabilities, used when the PowerCapabilities array includes the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Power Capabilities Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_OtherPowerCapabilitiesDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerCapabilities\"]'"
	 * @generated
	 */
	EList<String> getOtherPowerCapabilitiesDescriptions();

	/**
	 * Returns the value of the '<em><b>Power States Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that indicates the power states supported by a managed element. Because this is an array, multiple values can be specified. The current values in the enumeration are: 
	 * 2=On, corresponding to ACPI state G0 or S0 or D0. 
	 * 3=Sleep - Light, corresponding to ACPI state G1, S1/S2, or D1. 
	 * 4=Sleep - Deep, corresponding to ACPI state G1, S3, or D2.
	 * 5=Power Cycle (Off - Soft), corresponding to ACPI state G2, S5, or D3, but where the managed element is set to return to power state "On" at a pre-determined time. 
	 * 6=Off - Hard, corresponding to ACPI state G3, S5, or D3. 
	 * 7=Hibernate (Off - Soft), corresponding to ACPI state S4, where the state of the managed element is preserved and will be recovered upon powering on. 
	 * 8=Off - Soft, corresponding to ACPI state G2, S5, or D3. 9= Power Cycle (Off-Hard), corresponds to the managed element reaching the ACPI state G3 followed by ACPI state S0. 
	 * 10=Master Bus Reset, corresponds to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system master bus reset. 11=Diagnostic Interrupt (NMI), corresponding to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system non-maskable interrupt. 12=Off - Soft Graceful, equivalent to Off Soft but preceded by a request to the managed element to perform an orderlyshutdown. 
	 * 13=Off - Hard Graceful, equivalent to Off Hard but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 14=Master Bus Rest Graceful, equivalent to Master Bus Reset but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 15=Power Cycle (Off - Soft Graceful), equivalent to Power Cycle (Off - Soft) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 16=Power Cycle (Off - Hard Graceful), equivalent to Power Cycle (Off - Hard) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * ..=DMTF Reserved. 
	 * 0x7FFF..0xFFFF = Vendor Specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power States Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_PowerStatesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Other\",\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"IEEE P1621 | 3.2\"]' ModelCorrespondence='[\"CIM_PowerManagementService.RequestPowerStateChange\",\"CIM_AssociatedPowerManagementService.PowerState\"]'"
	 * @generated
	 */
	EList<Integer> getPowerStatesSupported();

	/**
	 * Returns the value of the '<em><b>Power Change Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
	 * 0 = Unknown 
	 * 1 = Other 
	 * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
	 * 3 = Power State Settable, indicating that the RequestPowerStateChange method is supported 
	 * 4 = Power Cycling Supported, indicating that the RequestPowerStateChange method can be invoked with the PowerState input variable set to 'Power Cycle (Off Soft)' 
	 * 5 = Timed Power On Supported, indicating that the RequestPowerStateChange method can be invoked with the PowerState input variable set to 'Power On' and the Time parameter set to a specific date and time, or interval, for power-on.8 = Graceful Shutdown Supported, indicating that the managed element can be sent a hardware signal requesting an orderly shutdown prior to the requested power state change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Change Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_PowerChangeCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Power Saving Modes Entered Automatically\",\"Power State Settable\",\"Power Cycling Supported\",\"Timed Power On Supported\",\"Off Hard Power Cycling Supported\",\"HW Reset Supported\",\"Graceful Shutdown Supported\"]' ModelCorrespondence='[\"CIM_PowerManagementService.RequestPowerStateChange\",\"CIM_PowerManagementCapabilities.OtherPowerChangeCapabilities\"]'"
	 * @generated
	 */
	EList<Integer> getPowerChangeCapabilities();

	/**
	 * Returns the value of the '<em><b>Other Power Change Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional power management capabilities of the element, used when the PowerChangeCapabilities is set to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Power Change Capabilities</em>' attribute.
	 * @see #setOtherPowerChangeCapabilities(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_OtherPowerChangeCapabilities()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerChangeCapabilities\"]'"
	 * @generated
	 */
	String getOtherPowerChangeCapabilities();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerManagementCapabilities#getOtherPowerChangeCapabilities <em>Other Power Change Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Power Change Capabilities</em>' attribute.
	 * @see #getOtherPowerChangeCapabilities()
	 * @generated
	 */
	void setOtherPowerChangeCapabilities(String value);

	/**
	 * Returns the value of the '<em><b>Requested Power States Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that indicates the requested power states supported by the power management service. Because this is an array, multiple values can be specified. The current values in the enumeration are: 
	 * 2=On, corresponding to ACPI state G0 or S0 or D0. 
	 * 3=Sleep - Light, corresponding to ACPI state G1, S1/S2, or D1. 
	 * 4=Sleep - Deep, corresponding to ACPI state G1, S3, or D2.
	 * 5=Power Cycle (Off - Soft), corresponding to ACPI state G2, S5, or D3, but where the managed element is set to return to power state "On" at a pre-determined time. 
	 * 6=Off - Hard, corresponding to ACPI state G3, S5, or D3. 
	 * 7=Hibernate (Off - Soft), corresponding to ACPI state S4, where the state of the managed element is preserved and will be recovered upon powering on. 
	 * 8=Off - Soft, corresponding to ACPI state G2, S5, or D3. 9= Power Cycle (Off-Hard), corresponds to the managed element reaching the ACPI state G3 followed by ACPI state S0. 
	 * 10=Master Bus Reset, corresponds to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system master bus reset. 11=Diagnostic Interrupt (NMI), corresponding to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system non-maskable interrupt. 12=Off - Soft Graceful, equivalent to Off Soft but preceded by a request to the managed element to perform an orderlyshutdown. 
	 * 13=Off - Hard Graceful, equivalent to Off Hard but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 14=Master Bus Rest Graceful, equivalent to Master Bus Reset but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 15=Power Cycle (Off - Soft Graceful), equivalent to Power Cycle (Off - Soft) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 16=Power Cycle (Off - Hard Graceful), equivalent to Power Cycle (Off - Hard) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 17=Diagnostic Interrupt (INIT), equivalent to Diagnostic Interrupt (NMI) but performed by an INIT switch instead because the NMI signal is masked. 
	 * ..=DMTF Reserved. 
	 * 0x7FFF..0xFFFF = Vendor Specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Power States Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementCapabilities_RequestedPowerStatesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Other\",\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"Diagnostic Interrupt (INIT)\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"IEEE P1621 | 3.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerStatesSupported\",\"CIM_PowerManagementService.RequestPowerStateChange\",\"CIM_AssociatedPowerManagementService.PowerState\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedPowerStatesSupported();

} // CIM_PowerManagementCapabilities
