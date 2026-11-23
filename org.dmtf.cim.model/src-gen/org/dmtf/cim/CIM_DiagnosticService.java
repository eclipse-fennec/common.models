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
 * A representation of the model object '<em><b>CIM Diagnostic Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DiagnosticService class provides the ability to start a service that functions to participate in a problem determination process. Specific diagnostic services SHOULD be defined by subclassing this class. Examples of a diagnostic service are tests, information retrievers, exercisers, and ports to external executives.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticService()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiagnosticService.RunDiagnosticService\"]' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is being deprecated as part of the change to have Diagnostic Settings derive from CIM_SettingData instead of CIM_Setting. 
	 * The RunDiagnostic method is invoked to commence execution of a diagnostic program on a specific managed element. The input parameters specify this managed element and the settings that SHALL be applied to the diagnostic and the resultant job. The method returns a reference to the ConcreteJob instance created. 
	 * Prior to invoking this method, clients SHALL examine the appropriate capabilities and create valid DiagnosticSetting and JobSettingData instances to apply as input parameters. Since settings may be changed without warning, the RunDiagnostic method SHOULD immediately evaluate and capture the attributes of DiagnsoticSetting in an instance of DiagnosticSettingRecord. This information is useful for post-mortem analysis of diagnostic results. 
	 * A job SHALL be instantiated as a means for monitoring the diagnostic as it runs and to provide useful accounting and status information once the diagnostic has completed. 
	 * The "Busy" return code indicates that the method cannot be invoked "at this time". It is not an error condition, but signals that the provider is doing something else and cannot respond.
	 * @param ManagedElement Specifies the element upon which the DiagnosticService SHOULD be run.
	 * @param DiagSetting Specifies the desired settings that SHOULD be applied to the Diagnostic. If null, the Diagnostic's defaults MAY be used.
	 * @param JobSetting Specifies the desired settings that SHALL be applied to the resulting Job. If null, the job's defaults MAY be used.
	 * @param Job Returns a reference to the resulting Job.
	 * <!-- end-model-doc -->
	 * @model ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" DiagSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticSetting REF'" JobSettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_JobSettingData REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticService.RunDiagnosticService\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Busy\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RunDiagnostic(CIM_ManagedElement ManagedElement, CIM_DiagnosticSetting DiagSetting, CIM_JobSettingData JobSetting, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RunDiagnosticService method is invoked to commence execution of a diagnostic program on a specific managed element. The input parameters specify this managed element and the settings to be applied to the diagnostic and the resultant job. The method returns a reference to the ConcreteJob instance created. 
	 * Prior to invoking this method, clients examine defaults and appropriate capabilities and create valid DiagnosticSettingData and JobSettingData instances to apply as input parameters. The RunDiagnosticService method SHALL evaluate and capture the attributes of DiagnosticSettingData in an instance of DiagnosticSettingDataRecord for use in post-mortem analysis of diagnostic results. 
	 * A job SHALL be instantiated as a means for monitoring the diagnostic as it runs and to provide useful accounting and status information once the diagnostic has completed. 
	 * The "Busy" return code indicates that the method cannot be invoked "at this time". It is not an error condition, but signals that the provider is doing something else and cannot respond.
	 * @param ManagedElement Specifies the element upon which the DiagnosticService SHOULD be run.
	 * @param DiagnosticSettings A string containing an encoding of the DiagnosticSettingData instance to be applied to the diagnostic. If null, the diagnostic's defaults are used.
	 * @param JobSettings A string containing an encoding of the JobSettingData instance to be applied to the resulting job. If null, the job's defaults are used.
	 * @param Job Returns a reference to the resulting Job.
	 * <!-- end-model-doc -->
	 * @model ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" DiagnosticSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_DiagnosticSettingData'" JobSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_JobSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000..0x7FFF\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Busy\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RunDiagnosticService(CIM_ManagedElement ManagedElement, String DiagnosticSettings, String JobSettings, CIM_ConcreteJob Job);

} // CIM_DiagnosticService
