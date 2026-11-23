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
 * A representation of the model object '<em><b>CIM Power Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service that describes power management functionality, hosted on a System. Whether this service might be used to affect the power state of a particular element is defined by the CIM_ServiceAvailable ToElement association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::PowerMgmt' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PowerManagementService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_PowerManagementService.RequestPowerStateChange method should be used instead of SetPowerState method, which is deprecated. SetPowerState defines the desired power state of the managed element and when the element should be put into that state. The SetPowerState method has three input parameters, no output parameters, and a result. 
	 * - PowerState indicates the desired power state. 
	 * - ManagedElement indicates the element whose state is set. This element should be associated with the service using the ServiceAvailableToElement relationship. 
	 * - Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received). 
	 * Note that when the PowerState parameter is equal to 5, "Power Cycle (Off -Soft)", the Time parameter indicates when the managed element should be powered on again. Power-off is immediate. 
	 * SetPowerState should return 0 if successful, 1 if the specified State and Time request is not supported for the element, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param PowerState The power state for ManagedElement.
	 * @param ManagedElement ManagedElement indicates the element whose state is set.
	 * @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
	 * <!-- end-model-doc -->
	 * @model PowerStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"On\",\"Sleep - Light\",\"Sleep -Deep\",\"Vendor Specific\",\"Power Cycle (Off - Soft)\",\"Off - Hard\",\"Hibernate (Off - Soft)\",\"Off - Soft\"]' MappingStrings='[\"IEEE P1621 | 3.2\"]'" ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" TimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_PowerManagementService.RequestPowerStateChange\"]'"
	 * @generated
	 */
	Long SetPowerState(Integer PowerState, CIM_ManagedElement ManagedElement, String Time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestPowerStateChange defines the desired power state of the managed element, and when the element should be put into that state. The RequestPowerStateChange method has five input parameters and a result code. 
	 * - PowerState indicates the desired power state. 
	 * - ManagedElement indicates the element whose state is set. This element SHOULD be associated to the service using the AssociatedPowerManagementService relationship. 
	 * - Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received). 
	 * - Job is a reference to the job if started. 
	 * - TimeOutPeriod indicates the maximum amount of time a client is expects the transition to take. 
	 * See CIM_PowerStateCapabilities for descriptions of PowerState parameter enumerations.
	 * @param PowerState The power state for ManagedElement.
	 * @param ManagedElement ManagedElement indicates the element whose state is set.
	 * @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
	 * @param Job Reference to the job (can be null if the task is completed).
	 * @param TimeoutPeriod
	 *   A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
	 *   If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' must be returned.
	 * <!-- end-model-doc -->
	 * @model PowerStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\"]' Values='[\"Power On\",\"Sleep - Light\",\"Sleep - Deep\",\"Power Cycle (Off Soft)\",\"Power Off - Hard\",\"Hibernate\",\"Power Off - Soft\",\"Power Cycle (Off Hard)\",\"Master Bus Reset\",\"Diagnostic Interrupt (NMI)\",\"Power Off - Soft Graceful\",\"Power Off - Hard Graceful\",\"Master Bus Reset Graceful\",\"Power Cycle (Off - Soft Graceful)\",\"Power Cycle (Off - Hard Graceful)\"]'" ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" TimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Cannot complete within Timeout Period\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid State Transition\",\"Use of Timeout Parameter Not Supported\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RequestPowerStateChange(Integer PowerState, CIM_ManagedElement ManagedElement, String Time, CIM_ConcreteJob Job, String TimeoutPeriod);

} // CIM_PowerManagementService
