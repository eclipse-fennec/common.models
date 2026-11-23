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
 * A representation of the model object '<em><b>CIM System In Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SystemInNamespace is an association that allows enumeration of the system(s) represented in a Namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemInNamespace#getManagedNamespace <em>Managed Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemInNamespace#getIdentification <em>Identification</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemInNamespace#getScopeOfContainedData <em>Scope Of Contained Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemInNamespace#getDescriptionOfContainedData <em>Description Of Contained Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemInNamespace()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Interop' keys='ManagedNamespace,Identification'"
 * @generated
 */
@ProviderType
public interface CIM_SystemInNamespace extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Namespace containing management objects from one or more systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Namespace</em>' reference.
	 * @see #setManagedNamespace(CIM_Namespace)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemInNamespace_ManagedNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Namespace REF' Key='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_Namespace getManagedNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemInNamespace#getManagedNamespace <em>Managed Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Namespace</em>' reference.
	 * @see #getManagedNamespace()
	 * @generated
	 */
	void setManagedNamespace(CIM_Namespace value);

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification information for systems in the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification</em>' reference.
	 * @see #setIdentification(CIM_SystemIdentification)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemInNamespace_Identification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemIdentification REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_SystemIdentification getIdentification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemInNamespace#getIdentification <em>Identification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(CIM_SystemIdentification value);

	/**
	 * Returns the value of the '<em><b>Scope Of Contained Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope Of Contained Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemInNamespace_ScopeOfContainedData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Local System Data\",\"Data Aggregated from Multiple Systems\",\"Proxied Data\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SystemInNamespace.DescriptionOfContainedData\"]'"
	 * @generated
	 */
	EList<Integer> getScopeOfContainedData();

	/**
	 * Returns the value of the '<em><b>Description Of Contained Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Of Contained Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemInNamespace_DescriptionOfContainedData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SystemInNamespace.ScopeOfContainedData\"]'"
	 * @generated
	 */
	EList<String> getDescriptionOfContainedData();

} // CIM_SystemInNamespace
