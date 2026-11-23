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
 * A representation of the model object '<em><b>CIM Class Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ClassIndication is an abstract superclass describing changes in the definition of the schema. Subclasses represent specific types of change notifications, such as class creation, deletion and modification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ClassIndication#getClassDefinition <em>Class Definition</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassIndication()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_ClassIndication extends CIM_Indication {
	/**
	 * Returns the value of the '<em><b>Class Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current definition of the class that is created, changed or deleted in the schema. In the case of a CIM_ClassDeletion Indication, the definition for the class just prior to deletion should be placed in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Definition</em>' attribute.
	 * @see #setClassDefinition(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ClassIndication_ClassDefinition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedObject='true'"
	 * @generated
	 */
	String getClassDefinition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ClassIndication#getClassDefinition <em>Class Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Definition</em>' attribute.
	 * @see #getClassDefinition()
	 * @generated
	 */
	void setClassDefinition(String value);

} // CIM_ClassIndication
