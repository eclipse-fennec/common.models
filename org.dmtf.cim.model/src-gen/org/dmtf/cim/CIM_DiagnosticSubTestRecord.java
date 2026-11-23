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
 * A representation of the model object '<em><b>CIM Diagnostic Sub Test Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a subclass of CIM_DiagnosticRecord that identfies another log for a subtest of the diagnostic test.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSubTestRecord#getTestCompletionStatus <em>Test Completion Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSubTestRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSubTestRecord extends CIM_DiagnosticRecord {
	/**
	 * Returns the value of the '<em><b>Test Completion Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the message id of the completion status message. The possible values include:
	 * * "DIAG0" - The test passed.
	 * * "DIAG3" - The device test failed.
	 * * "DIAG4" - The test was completed with warnings.
	 * * "DIAG44" - The test did not start.
	 * * "DIAG45" - The test aborted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Completion Status</em>' attribute.
	 * @see #setTestCompletionStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSubTestRecord_TestCompletionStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTestCompletionStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSubTestRecord#getTestCompletionStatus <em>Test Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Completion Status</em>' attribute.
	 * @see #getTestCompletionStatus()
	 * @generated
	 */
	void setTestCompletionStatus(String value);

} // CIM_DiagnosticSubTestRecord
