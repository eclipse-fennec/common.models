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
 * A representation of the model object '<em><b>CIM Associated Power Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The association between a Managed System Element and its power management service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getPowerState <em>Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getOtherPowerState <em>Other Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getRequestedPowerState <em>Requested Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getOtherRequestedPowerState <em>Other Requested Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getPowerOnTime <em>Power On Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getAvailableRequestedPowerStates <em>Available Requested Power States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getTransitioningToPowerState <em>Transitioning To Power State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.24.1' UMLPackagePath='CIM::Core::PowerMgmt' override.ServiceProvided='CIM_PowerManagementService REF' override.ServiceProvided.Max='1' override.ServiceProvided.Description='The Service that is available.' keys='ServiceProvided,UserOfService'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedPowerManagementService extends CIM_ServiceAvailableToElement {
	/**
	 * Returns the value of the '<em><b>Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current power state of the associated Managed System Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power State</em>' attribute.
	 * @see #setPowerState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_PowerState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Other\",\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"Diagnostic Interrupt (INIT)\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"MIF.DMTF|System Power Controls|001.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerCapabilities\"]'"
	 * @generated
	 */
	Integer getPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getPowerState <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power State</em>' attribute.
	 * @see #getPowerState()
	 * @generated
	 */
	void setPowerState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional power management state of the element, used when the PowerState is set to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Power State</em>' attribute.
	 * @see #setOtherPowerState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_OtherPowerState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedPowerManagementService.PowerState\"]'"
	 * @generated
	 */
	String getOtherPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getOtherPowerState <em>Other Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Power State</em>' attribute.
	 * @see #getOtherPowerState()
	 * @generated
	 */
	void setOtherPowerState(String value);

	/**
	 * Returns the value of the '<em><b>Requested Power State</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired or the last requested power state of the associated Managed System Element, irrespective of the mechanism through which the request was made. If the requested power state is unknown, then the property shall have the value of 0 ("Unknown"). If the property has no meaning or is not supported, then the property shall have value 12("Not Applicable").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Power State</em>' attribute.
	 * @see #setRequestedPowerState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_RequestedPowerState()
	 * @model default="12"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"On\",\"Sleep - Light\",\"Sleep -_Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Not Applicable\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"Diagnostic Interrupt (INIT)\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"MIF.DMTF|System Power Controls|001.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerCapabilities\",\"CIM_AssociatedPowerManagementService.OtherRequestedPowerState\"]'"
	 * @generated
	 */
	Integer getRequestedPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getRequestedPowerState <em>Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Power State</em>' attribute.
	 * @see #getRequestedPowerState()
	 * @generated
	 */
	void setRequestedPowerState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Requested Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional power management state of the element, used when the RequestedPowerState is set to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Requested Power State</em>' attribute.
	 * @see #setOtherRequestedPowerState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_OtherRequestedPowerState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedPowerManagementService.RequestedPowerState\"]'"
	 * @generated
	 */
	String getOtherRequestedPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getOtherRequestedPowerState <em>Other Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Requested Power State</em>' attribute.
	 * @see #getOtherRequestedPowerState()
	 * @generated
	 */
	void setOtherRequestedPowerState(String value);

	/**
	 * Returns the value of the '<em><b>Power On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the element will be powered on again, used when the RequestedPowerState has the value 2, "On", 5, "Power Cycle (Off - Soft)" or 6, "Power Cycle (Off - Hard)".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power On Time</em>' attribute.
	 * @see #setPowerOnTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_PowerOnTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_AssociatedPowerManagementService.RequestedPowerState\"]'"
	 * @generated
	 */
	String getPowerOnTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getPowerOnTime <em>Power On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power On Time</em>' attribute.
	 * @see #getPowerOnTime()
	 * @generated
	 */
	void setPowerOnTime(String value);

	/**
	 * Returns the value of the '<em><b>Available Requested Power States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AvailableRequestedPowerStates indicates the possible values for the PowerState parameter of the method RequestPowerStateChange, used to initiate a power state change.The values listed shall be a subset of the values contained in the RequestedPowerStatesSupported property of the CIM_PowerManagementCapabilities where the values selected are a function of the current power state of the system. This property shall be non-null if an implementation supports the advertisement of the set of possible values as a function of the current state. This property shall be null if an implementation does not support the advertisement of the set of possible values as a function of the current state. 
	 * The current values in the enumeration are: 
	 * 2=On, corresponding to ACPI state G0 or S0 or D0. 
	 * 3=Sleep - Light, corresponding to ACPI state G1, S1/S2, or D1. 
	 * 4=Sleep - Deep, corresponding to ACPI state G1, S3, or D2.
	 * 5=Power Cycle (Off - Soft), corresponding to ACPI state G2, S5, or D3, but where the managed element is set to return to power state "On" at a pre-determined time. 
	 * 6=Off - Hard, corresponding to ACPI state G3, S5, or D3. 
	 * 7=Hibernate (Off - Soft), corresponding to ACPI state S4, where the state of the managed element is preserved and will be recovered upon powering on. 
	 * 8=Off - Soft, corresponding to ACPI state G2, S5, or D3. 9= Power Cycle (Off-Hard), corresponds to the managed element reaching the ACPI state G3 followed by ACPI state S0. 
	 * 10=Master Bus Reset, corresponds to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system master bus reset. 11=Diagnostic Interrupt (NMI), corresponding to the system reaching ACPI state S5 followed by ACPI state S0. This is used to represent system non-maskable interrupt. 12=Off - Soft Graceful, equivalent to Off Soft but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 13=Off - Hard Graceful, equivalent to Off Hard but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 14=Master Bus Rest Graceful, equivalent to Master Bus Reset but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 15=Power Cycle (Off - Soft Graceful), equivalent to Power Cycle (Off - Soft) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * 16=Power Cycle (Off - Hard Graceful), equivalent to Power Cycle (Off - Hard) but preceded by a request to the managed element to perform an orderly shutdown. 
	 * ..=DMTF Reserved. 
	 * 0x7FFF..0xFFFF = Vendor Specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Requested Power States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_AvailableRequestedPowerStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Other\",\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"IEEE P1621 | 3.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.RequestedPowerStatesSupported\",\"CIM_PowerManagementService.RequestPowerStateChange\",\"CIM_AssociatedPowerManagementService.PowerState\"]'"
	 * @generated
	 */
	EList<Integer> getAvailableRequestedPowerStates();

	/**
	 * Returns the value of the '<em><b>Transitioning To Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransitioningToPowerState indicates the target power state to which the system is transitioning. 
	 * A value of 19 "No Change" shall indicate that no transition is in progress. A value of 18 "Not Applicable" shall indicate the implementation does not support representing ongoing transitions. 
	 * A value other than 18 or 19 shall identify the power state to which the element is in the process of transitioning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitioning To Power State</em>' attribute.
	 * @see #setTransitioningToPowerState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPowerManagementService_TransitioningToPowerState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"..\",\"0x7FFF..0xFFFF\"]' Values='[\"Other\",\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\",\"Power Cycle (Off-Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Off - Soft Graceful\",\"Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\",\"Diagnostic Interrupt (INIT)\",\"Not Applicable\",\"No Change\",\"DMTF Reserved\",\"Vendor Specific\"]' MappingStrings='[\"MIF.DMTF|System Power Controls|001.2\"]' ModelCorrespondence='[\"CIM_PowerManagementCapabilities.PowerCapabilities\"]'"
	 * @generated
	 */
	Integer getTransitioningToPowerState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPowerManagementService#getTransitioningToPowerState <em>Transitioning To Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitioning To Power State</em>' attribute.
	 * @see #getTransitioningToPowerState()
	 * @generated
	 */
	void setTransitioningToPowerState(Integer value);

} // CIM_AssociatedPowerManagementService
