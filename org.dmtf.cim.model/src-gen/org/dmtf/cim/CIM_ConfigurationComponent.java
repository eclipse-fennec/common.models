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
 * A representation of the model object '<em><b>CIM Configuration Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of instances of Setting or SettingData. Deprecated description: ConfigurationComponent aggregates "lower-level" Configuration objects into a "high-level" Configuration. This association enables the assembly of complex configurations by grouping together simpler ones. For example, a logon policy for the United States could consist of two Configuration groups, one for the East Coast and one for the West Coast. Each of these groups could in turn consist of multiple Configurations to handle different aspects of the logon process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationComponent#getConfigGroup <em>Config Group</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationComponent#getConfigComponent <em>Config Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteComponent\"]' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='ConfigGroup,ConfigComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ConfigurationComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration that aggregates additional Configurations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Group</em>' reference.
	 * @see #setConfigGroup(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationComponent_ConfigGroup()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"CIM_ConcreteComponent.GroupComponent\"]' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_Configuration getConfigGroup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationComponent#getConfigGroup <em>Config Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Group</em>' reference.
	 * @see #getConfigGroup()
	 * @generated
	 */
	void setConfigGroup(CIM_Configuration value);

	/**
	 * Returns the value of the '<em><b>Config Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: A Configuration that is part of a "higher-level" Configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Component</em>' reference.
	 * @see #setConfigComponent(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationComponent_ConfigComponent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"CIM_ConcreteComponent.PartComponent\"]' Key='true'"
	 * @generated
	 */
	CIM_Configuration getConfigComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationComponent#getConfigComponent <em>Config Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Component</em>' reference.
	 * @see #getConfigComponent()
	 * @generated
	 */
	void setConfigComponent(CIM_Configuration value);

} // CIM_ConfigurationComponent
