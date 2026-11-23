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
 * A representation of the model object '<em><b>CIM Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of Setting or SettingData instances. This association allows the reuse of the element to Setting or SettingData associations instead of defining a peer association specifically for Configurations. 
 * Deprecated description: This association relates a Configuration object to one or more ManagedSystemElements. The Configuration object represents a certain behavior or a desired functional state for the associated ManagedSystemElements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementConfiguration#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementConfiguration#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSettingData\",\"CIM_ElementSetting\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Element,Configuration'"
 * @generated
 */
@ProviderType
public interface CIM_ElementConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The ManagedSystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_ManagedSystemElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementConfiguration_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' Deprecated='[\"CIM_ElementSettingData.ManagedElement\",\"CIM_ElementSetting.Element\"]' Key='true'"
	 * @generated
	 */
	CIM_ManagedSystemElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementConfiguration#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_ManagedSystemElement value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration object that groups the Settings and dependencies that are associated with the ManagedSystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementConfiguration_Configuration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"CIM_ElementSettingData.SettingData\",\"CIM_ElementSetting.Setting\"]' Key='true'"
	 * @generated
	 */
	CIM_Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CIM_Configuration value);

} // CIM_ElementConfiguration
