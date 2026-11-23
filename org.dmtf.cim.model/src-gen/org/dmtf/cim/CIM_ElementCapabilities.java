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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementCapabilities represents the association between ManagedElements and their Capabilities. Note that the cardinality of the ManagedElement reference is Min(1). This cardinality mandates the instantiation of the ElementCapabilities association for the referenced instance of Capabilities. ElementCapabilities describes the existence requirements and context for the referenced instance of ManagedElement. Specifically, the ManagedElement MUST exist and provides the context for the Capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementCapabilities#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementCapabilities#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementCapabilities#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.24.0' UMLPackagePath='CIM::Core::Capabilities' keys='ManagedElement,Capabilities'"
 * @generated
 */
@ProviderType
public interface CIM_ElementCapabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The managed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapabilities_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true' Min='1'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementCapabilities#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Capabilities object associated with the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference.
	 * @see #setCapabilities(CIM_Capabilities)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapabilities_Capabilities()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Capabilities REF' Key='true'"
	 * @generated
	 */
	CIM_Capabilities getCapabilities();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementCapabilities#getCapabilities <em>Capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CIM_Capabilities value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics provides descriptive information about the Capabilities. when the value 2 "Default" is specified, the associated Capabilities shall represent the default capabilities of the associated Managed Element 
	 * when the value 2 "Default" is not specified, the Capabilities instance may represent the default capabilities of the Managed Element
	 * When the value 3 "Current" is specified, the associated Capabilities shall represent the current capabilities of the associated Managed Element
	 * When the value 3 "Current" is not specified, the Capabilities instance may represent the current capabilities of the Managed Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapabilities_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Default\",\"Current\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

} // CIM_ElementCapabilities
