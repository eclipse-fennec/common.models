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
 * A representation of the model object '<em><b>CIM Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DiagnosticTest class represents the framework for running diagnostic tests. Specific diagnostic tests may be defined by subclassing and/or instantiating this object. To provide more detail for a type of test(s) (i.e, additional properties and methods), subclassing is appropriate. 
 * When a DiagnosticTest can be simultaneously executed against several elements, then DiagnosticTest may launch a ConcreteJob to represent each execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getOtherCharacteristicDescription <em>Other Characteristic Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getOtherCharacteristicsDescriptions <em>Other Characteristics Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getIsInUse <em>Is In Use</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getResourcesUsed <em>Resources Used</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getTestTypes <em>Test Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticTest#getOtherTestTypesDescriptions <em>Other Test Types Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::System::Diagnostics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticTest extends CIM_DiagnosticService {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptions for each Characteristic are below: 
	 * 
	 * * "Is Exclusive" (value=2) is specified for the test module only if the diagnostic cannot run more than one test at a time, regardless of how many SystemElements are supported. Typically, this occurs when hardware or software constraints prevent the test from running as multiple, concurrent instances. If the diagnostic can be run against multiple SystemElements, but only once per Element, then set the IsExclusiveForMSE boolean property on the appropriate instances of DiagnosticTestForMSE. 
	 * 
	 * * If "Is Interactive" (value=3) is set, then the diagnostic displays a message either before, during or after testing. 
	 * 
	 * * Set "Is Destructive" (value=4) if the diagnostic will destroy data, or reconfigure the Element that is being tested. 
	 * 
	 * * "Is Risky" (value=5) indicates that data loss may occur if the test is interrupted. Some tests make copies of data, perform the test, and restore the data returning the tested entity to its previous configuration. If the test is interrupted, then loss of data or reconfiguration of the tested ManagedSystemElement may occur. 
	 * 
	 * * If "Is Package" (value=6) is set, this test is actually a set of lower level diagnostics, that are packaged together by the test. This packaging is implemented by the diagnostic test, not aggregated by CIM. Information and results associated with the individual tests in the package may be requested by using the "Subtests" value in the DiagnosticSetting.LogOptions array. 
	 * 
	 * (value=7) was "Supports PercentOfTestCoverage" in Version 2.6. Value = 7 is being deprecated. Instead, it should be described in DiagnosticServiceCapabilities. 
	 * 
	 * "Is Synchronous" (value=8) indicates that this diagnostic service will complete before the RunDiagnostic method returns to the caller. A Job is still created that can be accessed by the client for accounting purposes, but the ability to track progress and status of the Job are lost. Additionally, in certain environments, the client may be "blocked" from further action until the service completes. 
	 * "Media Required" (value=9) indicates that this diagnostic service requires that media be inserted into the device in order to perform the service. "Additional Hardware Required" (value=10) indicates that this diagnostic service requires that some additional hardware is installed (e.g., wrap plug) in order to perform the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Unknown\",\"Other\",\"Is Exclusive\",\"Is Interactive\",\"Is Destructive\",\"Is Risky\",\"Is Package\",\"Reserved\",\"Is Synchronous\",\"Media Required\",\"Additional Hardware Required\"]' ModelCorrespondence='[\"CIM_DiagnosticTest.OtherCharacteristicsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Other Characteristic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for the Characteristic when its value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristic Description</em>' attribute.
	 * @see #setOtherCharacteristicDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_OtherCharacteristicDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_DiagnosticTest.OtherCharacteristicsDescriptions\"]' ModelCorrespondence='[\"CIM_DiagnosticTest.Characteristics\"]'"
	 * @generated
	 */
	String getOtherCharacteristicDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticTest#getOtherCharacteristicDescription <em>Other Characteristic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Characteristic Description</em>' attribute.
	 * @see #getOtherCharacteristicDescription()
	 * @generated
	 */
	void setOtherCharacteristicDescription(String value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherCharacteristicsDescriptions is a Bag array that contains an element with additional information for each Characteristics element with a value of 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristics Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_OtherCharacteristicsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_DiagnosticTest.Characteristics\"]'"
	 * @generated
	 */
	EList<String> getOtherCharacteristicsDescriptions();

	/**
	 * Returns the value of the '<em><b>Is In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated. The boolean Started property inherited from CIM_Service should be used instead. 
	 * If this test is currently being performed, the InUse property is set to TRUE. To determine which ManagedSystem Element is being tested, query the DiagnosticResult objects associated with this test (query DiagnosticResultForTest), and for which the TestState equals 4 ("In Progress"). The DiagnosticResult object is associated with the System Element under test, using DiagnosticResultForMSE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is In Use</em>' attribute.
	 * @see #setIsInUse(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_IsInUse()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_Service.Started\"]'"
	 * @generated
	 */
	Boolean getIsInUse();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticTest#getIsInUse <em>Is In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Use</em>' attribute.
	 * @see #getIsInUse()
	 * @generated
	 */
	void setIsInUse(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resources Used</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated and replaced with a more general method for indicating Managed Elements that are affected by this Test. The DiagnosticService parent has a ServiceAffectsElement association to a Managed Element for this purpose. 
	 * The "Expensive" qualifier can be applied to this class and its RunTest method. If so, the ResourcesUsed property describes the resources that are capitalized, based on a default setup for the test. Multiple resources can be specified since the property is an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources Used</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_ResourcesUsed()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_ServiceAffectsElement\"]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\"]' Values='[\"CPU\",\"Memory\",\"Hard Disk\",\"CDROM\",\"Floppy\",\"PCI Bus\",\"USB Bus\",\"1394 Bus\",\"SCSI Bus\",\"IDE Bus\",\"Network\",\"ISA Bus\",\"EISA Bus\",\"VESA Bus\",\"PCMCIA Bus\",\"CardBus\",\"Access.bus\",\"NuBus\",\"AGP\",\"VME Bus\",\"Sbus IEEE 1396-1993\",\"MCA Bus\",\"GIO Bus\",\"XIO Bus\",\"HIO Bus\",\"PMC Bus\",\"SIO Bus\"]'"
	 * @generated
	 */
	EList<Integer> getResourcesUsed();

	/**
	 * Returns the value of the '<em><b>Test Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptions for each test type are below: 
	 * 
	 * * If "Functional" (value=2) is set, this tests one, more or all the functionality of the element. 
	 * 
	 * * If "Stress" (value=3) is set, this test is a stress test or exerciser for the element. 
	 * 
	 * * If "Health Check" (value=4) is set, this test validates the current health of the element. 
	 * 
	 * * If "Access Test" (value=5) is set, this test verifies the element is accessible to the system and user. This would include access through the OS as a user would access the element. 
	 * 
	 * * If "Media Verify" (value=6) is set, this test verifies the media for the element. This does not validate that specific data is correctly written on the media or even if data can be written to the media, but verifies that the media itself has no faults.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_TestTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Functional\",\"Stress\",\"Health Check\",\"Access Test\",\"Media Verify\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticTest.OtherTestTypesDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getTestTypes();

	/**
	 * Returns the value of the '<em><b>Other Test Types Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherTestTypesDescriptions is an array that contains an element with additional information for each TestTypes element with a value of 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Test Types Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTest_OtherTestTypesDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticTest.TestTypes\"]'"
	 * @generated
	 */
	EList<String> getOtherTestTypesDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is being deprecated and replaced by the RunDiagnostic method in the DiagnosticService class. 
	 * The RunTest method executes this test for the specified ManagedSystemElement. The use of this method has been deprecated. Instead, the RunDiagnostic method (inherited from DiagnosticService) should be used. 
	 * The RunTest method executes this test for the specified ManagedSystemElement (defined using the SystemElement input parameter). Results of the test are stored in a Diagnostic Result object, a reference to which is returned as the Result output parameter. How the test should execute, i.e. its settings, is defined in a DiagnosticSetting object (or by a subclass of DiagnosticSetting). A reference to a Setting object is specified using the Setting input parameter. If a reference is not passed into the method, then a default DiagnosticSetting may be used. This default Setting is associated with the DiagnoticTest using the DefaultSetting relationship of the Core Model. 
	 * When RunTest starts execution, the settings, which are time sensitive, should be evaluated and captured. This is suggested since the DiagnosticSetting object can be modified at any time, and therefore the current test settings could be lost. 
	 * The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
	 * 0 = OK (function succeeded, but the test itself may have failed 
	 * 1 = Unspecified Error (function failed for unspecified reasons) 
	 * 2 = Not Implemented (function is not implemented for this instance) 
	 * 3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param SystemElement The ManagedSystemElement on which the test will run.
	 * @param Setting How the test should execute, i.e. its settings, is defined in a DiagnosticSetting object (or by a subclass of DiagnosticSetting). A reference to a Setting object is specified using the Setting input parameter. If a reference is not passed into the method, then a default DiagnosticSetting may be used. This default Setting is associated with the DiagnoticTest using the DefaultSetting relationship of the Core Model.
	 * @param Result Results of the test are stored in a DiagnosticResult object, a reference to which is returned as the Result output parameter.
	 * <!-- end-model-doc -->
	 * @model SystemElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" SettingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticSetting REF' In='true'" ResultAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticService.RunDiagnostic\"]'"
	 * @generated
	 */
	Long RunTest(CIM_ManagedSystemElement SystemElement, CIM_DiagnosticSetting Setting, CIM_DiagnosticResult Result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is deprecated in favor of using the corresponding functionality contained in the Log class, this is consistant with the deprecation of the Result class in favor of Log. 
	 * Execution of this method will delete all instances of the DiagnosticResultForMSE object, for this DiagnosticTest and the specified ManagedSystemElement (defined using the SystemElement input parameter). The DiagnosticResults referenced in the DiagnosticResultForMSE instances will be deleted. Also the association DiagnosticResultForTest that refers to the DiagnosticResult object, and this test will be deleted. 
	 * One output parameter is defined - ResultsNotCleared - which is a string array that lists the keys of the DiagnosticResults which could not be deleted. This information enables those Results to be revisited and either manually removed, or other corrective action taken. 
	 * The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
	 * 0 = OK (function succeeded, but the test itself may have failed) 
	 * 1 = Unspecified Error (function failed for unspecified reasons) 
	 * 2 = Not Implemented (function is not implemented for this instance) 
	 * 3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param SystemElement The Managed System Element for which results will be cleared.
	 * @param ResultsNotCleared A string array that lists the keys of the DiagnosticResults which could not be deleted.
	 * <!-- end-model-doc -->
	 * @model SystemElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" ResultsNotClearedUnique="false" ResultsNotClearedMany="true"
	 *        ResultsNotClearedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_Log.ClearLog\"]'"
	 * @generated
	 */
	Long ClearResults(CIM_ManagedSystemElement SystemElement, EList<String> ResultsNotCleared);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After invocation of this method and its completion, the specified test(s) will be discontinued for the indicated ManagedSystemElement (defined by the SystemElement input parameter). The test to discontinue is specified using the Result input parameter. If all instances of this test should be stopped for the SystemElement, then the Result reference should be NULL. Upon completion of the method, test status and other information (such as PercentComplete) will be stored in the DiagnosticResult instance defined by the Result input parameter. The output parameter, TestingStopped, is used as follows: 
	 * Set to TRUE if testing was successfully stopped. 
	 * Set to FALSE if the current test(s) can not be stopped. 
	 * If set to FALSE, testing will stop when the diagnostic is able to do so safely. To determine if/when the testing is stopped, check the TestState property in the DiagnosticResult instance defined by the Result parameter. TestState will change from "In Progress" to "Stopped" (from 4 to 5). 
	 * The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
	 * 0 = OK (function succeeded, but the test itself may have failed 
	 * 1 = Unspecified Error (function failed for unspecified reasons) 
	 * 2 = Not Implemented (function is not implemented for this instance) 
	 * 3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param SystemElement Testing will be discontinued for the indicated ManagedSystemElement defined by the SystemElement input parameter.
	 * @param Result The test to discontinue is specified using the Result input parameter.
	 * @param TestingStopped TestingStopped, is set to TRUE if testing was successfully stopped. It is set to FALSE if the current test(s) can not be stopped. If set to FALSE, testing will stop when the diagnostic is able to do so safely. To determine if/when the testing is stopped, check the TestState property in the DiagnosticResult instance defined by the Result parameter. TestState will change from "In Progress" to "Stopped" (from 4 to 5).
	 * <!-- end-model-doc -->
	 * @model SystemElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" ResultAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' In='true'" TestingStoppedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ConcreteJob.RequestStateChange\"]'"
	 * @generated
	 */
	Long DiscontinueTest(CIM_ManagedSystemElement SystemElement, CIM_DiagnosticResult Result, Boolean TestingStopped);

} // CIM_DiagnosticTest
