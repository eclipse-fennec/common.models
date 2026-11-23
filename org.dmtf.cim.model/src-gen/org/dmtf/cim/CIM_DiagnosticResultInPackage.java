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
 * A representation of the model object '<em><b>CIM Diagnostic Result In Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated. Tests should be grouped at the test level, not by the model. Therefore, this association is no longer appropriate. /n This is an association class that identifies a Diagnostic Result as made up of lower level Results. In this case, the Result identified as the PackageResult reference (i.e., the higher level result) would have its IsPackage property set to TRUE.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultInPackage#getPackageResult <em>Package Result</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResultInPackage#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultInPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::System::Diagnostics' keys='PackageResult,Result'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticResultInPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DiagnosticResult object that acts as the container for all the results of the package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Result</em>' reference.
	 * @see #setPackageResult(CIM_DiagnosticResult)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultInPackage_PackageResult()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' Deprecated='[\"No value\"]' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_DiagnosticResult getPackageResult();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultInPackage#getPackageResult <em>Package Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Result</em>' reference.
	 * @see #getPackageResult()
	 * @generated
	 */
	void setPackageResult(CIM_DiagnosticResult value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DiagnosticResult object that is one of the elements of the package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(CIM_DiagnosticResult)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResultInPackage_Result()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticResult REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticResult getResult();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResultInPackage#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(CIM_DiagnosticResult value);

} // CIM_DiagnosticResultInPackage
