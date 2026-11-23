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
 * A representation of the model object '<em><b>CIM Class Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ClassModification notifies when a class definition in the schema is modified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ClassModification#getPreviousClassDefinition <em>Previous Class Definition</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassModification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.6.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_ClassModification extends CIM_ClassIndication {
	/**
	 * Returns the value of the '<em><b>Previous Class Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copy of the 'previous' class definition whose change generated the Indication. PreviousClassDefinition contains an 'older' copy of the class' information, as compared to what is found in the ClassDefinition property (inherited from ClassIndication).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Class Definition</em>' attribute.
	 * @see #setPreviousClassDefinition(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ClassModification_PreviousClassDefinition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedObject='true'"
	 * @generated
	 */
	String getPreviousClassDefinition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ClassModification#getPreviousClassDefinition <em>Previous Class Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Class Definition</em>' attribute.
	 * @see #getPreviousClassDefinition()
	 * @generated
	 */
	void setPreviousClassDefinition(String value);

} // CIM_ClassModification
