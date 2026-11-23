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
 * A representation of the model object '<em><b>CIM Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Dependency is a generic association used to establish dependency relationships between ManagedElements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Dependency#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Dependency#getDependent <em>Dependent</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Dependency()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antecedent represents the independent object in this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Dependency_Antecedent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getAntecedent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Dependency#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependent represents the object that is dependent on the Antecedent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Dependency_Dependent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getDependent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Dependency#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(CIM_ManagedElement value);

} // CIM_Dependency
