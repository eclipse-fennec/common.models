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
 * A representation of the model object '<em><b>CIM Diagnostic Result For MSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated as part of the deprecation of the DiagnosticResult class. 
 * This is an association class relating diagnostic test results to the ManagedSystemElement that is/was tested.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultForMSE#getResult <em>Result</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultForMSE#getSystemElement <em>System Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForMSE()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.9.0' UMLPackagePath='CIM::System::Diagnostics' keys='Result,SystemElement'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticResultForMSE extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnostic result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(CIM_DiagnosticResult)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForMSE_Result()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticResult getResult();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultForMSE#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(CIM_DiagnosticResult value);

	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedSystemElement to which the diagnostic result applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(CIM_ManagedSystemElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultForMSE_SystemElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_ManagedSystemElement getSystemElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultForMSE#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(CIM_ManagedSystemElement value);

} // CIM_DiagnosticResultForMSE
