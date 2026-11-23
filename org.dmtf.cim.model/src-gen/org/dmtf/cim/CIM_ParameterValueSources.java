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
 * A representation of the model object '<em><b>CIM Parameter Value Sources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ParameterValueSources represents the association between a MethodParameters instance and the ManagedElement instances, which contain properties to be used to create values for the MethodParameters properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ParameterValueSources#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParameterValueSources#getValueSource <em>Value Source</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ParameterValueSources()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::MethodParms' keys='Parameters,ValueSource'"
 * @generated
 */
@ProviderType
public interface CIM_ParameterValueSources extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MethodParameters instance whose property values are to be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' reference.
	 * @see #setParameters(CIM_MethodParameters)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParameterValueSources_Parameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MethodParameters REF' Key='true'"
	 * @generated
	 */
	CIM_MethodParameters getParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParameterValueSources#getParameters <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(CIM_MethodParameters value);

	/**
	 * Returns the value of the '<em><b>Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that contains properties to be used to populate the values of the properties of the MethodParameters instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Source</em>' reference.
	 * @see #setValueSource(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParameterValueSources_ValueSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getValueSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParameterValueSources#getValueSource <em>Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Source</em>' reference.
	 * @see #getValueSource()
	 * @generated
	 */
	void setValueSource(CIM_ManagedElement value);

} // CIM_ParameterValueSources
