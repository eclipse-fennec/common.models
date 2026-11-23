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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Diagnostic Result For Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated as part of the deprecation of the DiagnosticResult class. 
 * This is an association class to relate the results of a test to the test itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultForTest#getDiagnosticResult <em>Diagnostic Result</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultForTest#getDiagnosticTest <em>Diagnostic Test</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.9.0' UMLPackagePath='CIM::System::Diagnostics' keys='DiagnosticResult,DiagnosticTest'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticResultForTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagnostic Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Result</em>' reference.
	 * @see #setDiagnosticResult(CIM_DiagnosticResult)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForTest_DiagnosticResult()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' Deprecated='[\"No value\"]' Key='true' Weak='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_DiagnosticResult getDiagnosticResult();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultForTest#getDiagnosticResult <em>Diagnostic Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Result</em>' reference.
	 * @see #getDiagnosticResult()
	 * @generated
	 */
	void setDiagnosticResult(CIM_DiagnosticResult value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test that generated the result object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Test</em>' reference.
	 * @see #setDiagnosticTest(CIM_DiagnosticTest)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForTest_DiagnosticTest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticTest REF' Deprecated='[\"No value\"]' Key='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_DiagnosticTest getDiagnosticTest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultForTest#getDiagnosticTest <em>Diagnostic Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Test</em>' reference.
	 * @see #getDiagnosticTest()
	 * @generated
	 */
	void setDiagnosticTest(CIM_DiagnosticTest value);

} // CIM_DiagnosticResultForTest
