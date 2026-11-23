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
 * A representation of the model object '<em><b>CIM Method Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MethodParameters represents a set of values to be used as the parameters of a method. These parameters can be passed to the method, directly used by the method in its invocation, or accessed by the method when it is called. The properties of a concrete subclass of MethodParameters are mapped to the parameters of a method by the method itself or by the method caller. This mapping is an implementation detail that is independent of the definition of the class. For ease of use, property names should match parameter names. 
 * Property values should be set before the method is invoked. The ModelCorrespondence qualifier can be used to indicate if the property value should come from the property of another class. The instances that the property values should be gleaned from should be associated with MethodParameters using the Parameter ValueSources association. 
 * If the property is declared as an array, then the same property value (identified by the Model Correspondence) will be retrieved from all appropriate ParameterValueSources instances and stored in the array. 
 * If the property is declared as an array and the Model Correspondence is to an array property, then only one instance of the array will be copied from one ParameterValueSource. 
 * If the property is not declared as an array and there are multiple instances of the class and property associated with it through ModelCorrespondence where the values are not all the same, then an error will occur and the value of the property will not be set. 
 * Several MethodParameters instances can be associated with any of the ManagedElement methods. This association allows the maintenance of 'canned' method invocation and reduces the overhead of re-creating all method parameters for every method invocation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MethodParameters#getMethodParametersId <em>Method Parameters Id</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MethodParameters()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::MethodParms'"
 * @generated
 */
@ProviderType
public interface CIM_MethodParameters extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Method Parameters Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier by which the MethodParameters object is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Parameters Id</em>' attribute.
	 * @see #setMethodParametersId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodParameters_MethodParametersId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getMethodParametersId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodParameters#getMethodParametersId <em>Method Parameters Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Parameters Id</em>' attribute.
	 * @see #getMethodParametersId()
	 * @generated
	 */
	void setMethodParametersId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resetValues method updates the values of the properties of MethodParameters, which have ModelCorrespondence to the SourceME ManagedElement. This update allows several source candidates to be associated with the MethodParameters and one candidate to be selected as the source for this set of values. If resetValues is invoked and sourceME is null, then all associated ManagedElements in ParameterValueSources will be used to set the values of the MethodParameters properties.
	 * @param SourceME The source ManagedElement.
	 * <!-- end-model-doc -->
	 * @model SourceMEAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetValues(CIM_ManagedElement SourceME);

} // CIM_MethodParameters
