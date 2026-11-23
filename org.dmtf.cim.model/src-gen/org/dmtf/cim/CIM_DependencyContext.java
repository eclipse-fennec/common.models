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
 * A representation of the model object '<em><b>CIM Dependency Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of Setting or SettingData instances. Therefore, this association is also deprecated but it is deprecated to "No value" because there are no equivalent relationships currently defined for the Setting or SettingData classes. This association is an anomaly because it defines what cannot be expressed for the components of the Configuration. Also, it singles out the Dependency association as opposed to allowing any relationships to be defined as "settings". Its use in the industry is discouraged. 
 * Deprecated description: This relationship associates a Dependency with one or more Configuration objects. For example, dependencies for a ComputerSystem could change based on the site or network to which the System is attached.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DependencyContext#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DependencyContext#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DependencyContext()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Context,Dependency'"
 * @generated
 */
@ProviderType
public interface CIM_DependencyContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration object that aggregates the Dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_DependencyContext_Context()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"No value\"]' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_Configuration getContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DependencyContext#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CIM_Configuration value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: An aggregated Dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' reference.
	 * @see #setDependency(CIM_Dependency)
	 * @see org.dmtf.cim.CimPackage#getCIM_DependencyContext_Dependency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Dependency REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_Dependency getDependency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DependencyContext#getDependency <em>Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(CIM_Dependency value);

} // CIM_DependencyContext
