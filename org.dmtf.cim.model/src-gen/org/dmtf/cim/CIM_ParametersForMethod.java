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
 * A representation of the model object '<em><b>CIM Parameters For Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ParametersForMethod represents the association between MethodParameters classes and a ManagedElement that has a method that can use the MethodParameters during its invocation. This association is optional. The Method Parameters instance can be passed as a parameter to a method or used to create a method signature before the method is invoked. This association is useful for finding all the valid MethodParameters instances for a particular method. It might be particularly useful for user-oriented interfaces and automated or policy driven method invocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ParametersForMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParametersForMethod#getTheMethod <em>The Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParametersForMethod#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ParametersForMethod()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::MethodParms' keys='Parameters,TheMethod,MethodName'"
 * @generated
 */
@ProviderType
public interface CIM_ParametersForMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MethodParameters instance, which can be used by the ParametersForMethod's method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' reference.
	 * @see #setParameters(CIM_MethodParameters)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParametersForMethod_Parameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MethodParameters REF' Key='true'"
	 * @generated
	 */
	CIM_MethodParameters getParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParametersForMethod#getParameters <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(CIM_MethodParameters value);

	/**
	 * Returns the value of the '<em><b>The Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that has a method that can use this instance of MethodParameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>The Method</em>' reference.
	 * @see #setTheMethod(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParametersForMethod_TheMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getTheMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParametersForMethod#getTheMethod <em>The Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Method</em>' reference.
	 * @see #getTheMethod()
	 * @generated
	 */
	void setTheMethod(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the method that can use the referenced instance of MethodParameters during its invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParametersForMethod_MethodName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64'"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParametersForMethod#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

} // CIM_ParametersForMethod
