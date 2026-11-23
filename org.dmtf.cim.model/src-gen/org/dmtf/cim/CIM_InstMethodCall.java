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
 * A representation of the model object '<em><b>CIM Inst Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_InstMethodCall notifies when an instance's method is invoked.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstMethodCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstMethodCall#getMethodParameters <em>Method Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstMethodCall#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstMethodCall#getPreCall <em>Pre Call</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstMethodCall()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.38.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_InstMethodCall extends CIM_InstIndication {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the method invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstMethodCall_MethodName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstMethodCall#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Method Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input and output parameters of the method (depending on the PreCall property), represented as an embedded instance with a class name of "__MethodParameters".
	 * That embedded instance contains properties representing the parameters of the method invocation. Each parameter is mapped to a corresponding property of the same name and type. REF-typed parameters are represented as Reference-qualified properties of type string whose value is the instance path in WBEM URI format.
	 * If PreCall is TRUE, the embedded instance contains only properties corresponding to the input parameters of the method, and their values are the parameter values before the method call.
	 * If PreCall is FALSE, the embedded instance contains only properties corresponding to the output parameters of the method, and their values are the parameter values after the method call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Parameters</em>' attribute.
	 * @see #setMethodParameters(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstMethodCall_MethodParameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedObject='true'"
	 * @generated
	 */
	String getMethodParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstMethodCall#getMethodParameters <em>Method Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Parameters</em>' attribute.
	 * @see #getMethodParameters()
	 * @generated
	 */
	void setMethodParameters(String value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return value of the method (depending on the PreCall property). If PreCall is True, this property is NULL describing that there is no method return value (since the method has not yet executed).
	 * If PreCall is False, ReturnValue contains a string representation of the method's return value. REF-typed method return values shall be represented as an instance path in WBEM URI format
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' attribute.
	 * @see #setReturnValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstMethodCall_ReturnValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_InstMethodCall.PreCall\"]'"
	 * @generated
	 */
	String getReturnValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstMethodCall#getReturnValue <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' attribute.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(String value);

	/**
	 * Returns the value of the '<em><b>Pre Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Call</em>' attribute.
	 * @see #setPreCall(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstMethodCall_PreCall()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getPreCall();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstMethodCall#getPreCall <em>Pre Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Call</em>' attribute.
	 * @see #getPreCall()
	 * @generated
	 */
	void setPreCall(Boolean value);

} // CIM_InstMethodCall
