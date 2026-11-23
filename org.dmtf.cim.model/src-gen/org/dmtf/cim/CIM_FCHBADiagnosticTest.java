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
 * A representation of the model object '<em><b>CIM FCHBA Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_FCHBADiagnosticTest class represents the framework for running diagnostic tests. Specific diagnostic tests may be defined by subclassing and/or instantiating this object. To provide more detail for a type of test(s) (i.e, additional properties and methods), subclassing is appropriate. When a DiagnosticTest can be simultaneously executed against several elements, then DiagnosticTest may launch a ConcreteJob to represent each execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticTest#getFCHBATestType <em>FCHBA Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticTest#getOtherFCHBATestTypeDescription <em>Other FCHBA Test Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FCHBADiagnosticTest extends CIM_DiagnosticTest {
	/**
	 * Returns the value of the '<em><b>FCHBA Test Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptions for each FC HBA test type is: * "Beacon" (value=2) is specified for the tests that cause at least one of the LEDs of a FC HBA to flash on and off. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "Echo" (value=3) is specified for the tests that stress the pathways between the FC HBA and devices connected to the FC SAN. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "External Loopback" (value=4) is specified for the tests that are used to verify that the entire data path through an FC HBA is working properly. CIM_DiagnosticTest.TestTypes shall be set to "Access Test" (value=5). * "Host Bus Loopback" (value=5) is specified for the tests that verify the functionality of a FC HBA's host bus interface. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "Internal Loopback" (value=6) is specified for the tests that verify the data path from the host through most of the FC HBA. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "Ping" (value=7) is specified for the tests that verify the existence and accessibility of devices on the SAN. CIM_DiagnosticTest.TestTypes shall be set to "Access Test" (value=5). * "Reset" (value=8) is specified for the tests that cause the FC HBA to reinitialize itself. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "Self" (value=9) is specified for the tests that verify the functionality of all possible components of the FC HBA. CIM_DiagnosticTest.TestTypes shall be set to "Functional" (value=2). * "Status" (value=10) is specified for the tests that checks the health of the FC HBA. CIM_DiagnosticTest.TestTypes shall be set to "Health Check" (value=4).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FCHBA Test Type</em>' attribute.
	 * @see #setFCHBATestType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticTest_FCHBATestType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Beacon\",\"Echo\",\"External Loopback\",\"Host Bus Loopback\",\"Internal Loopback\",\"Ping\",\"Reset\",\"Self\",\"Status\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_FCHBADiagnosticTest.OtherFCHBATestTypeDescription\"]'"
	 * @generated
	 */
	Integer getFCHBATestType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticTest#getFCHBATestType <em>FCHBA Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCHBA Test Type</em>' attribute.
	 * @see #getFCHBATestType()
	 * @generated
	 */
	void setFCHBATestType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other FCHBA Test Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the test when the FCHBATestType property is set to 1 (Other). This property must be set to null when FCHBATestType is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other FCHBA Test Type Description</em>' attribute.
	 * @see #setOtherFCHBATestTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticTest_OtherFCHBATestTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FCHBADiagnosticTest.FCHBATestType\"]'"
	 * @generated
	 */
	String getOtherFCHBATestTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticTest#getOtherFCHBATestTypeDescription <em>Other FCHBA Test Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other FCHBA Test Type Description</em>' attribute.
	 * @see #getOtherFCHBATestTypeDescription()
	 * @generated
	 */
	void setOtherFCHBATestTypeDescription(String value);

} // CIM_FCHBADiagnosticTest
