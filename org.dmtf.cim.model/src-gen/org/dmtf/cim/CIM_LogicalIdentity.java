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
 * A representation of the model object '<em><b>CIM Logical Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_LogicalIdentity is an abstract and generic association, indicating that two ManagedElements represent different aspects of the same underlying entity. This relationship conveys what could be defined with multiple inheritance. In most scenarios, the Identity relationship is determined by the equivalence of Keys or some other identifying properties of the related Elements. 
 * 
 * This relationship is reasonable in several scenarios. For example, it could be used to represent that a LogicalDevice is both a 'bus' entity and a 'functional' entity. A Device could be both a USB (bus) and a Keyboard (functional) entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalIdentity#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalIdentity#getSameElement <em>Same Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalIdentity()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalIdentity extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SystemElement represents one aspect of the Managed Element. The use of 'System' in the role name does not limit the scope of the association. The role name was defined in the original association, where the referenced elements were limited to LogicalElements. Since that time, it has been found valuable to instantiate these types of relationships for ManagedElements, such as Collections. So, the referenced elements of the association were redefined to be ManagedElements. Unfortunately, the role name could not be changed without deprecating the entire association. This was not deemed necessary just to correct the role name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalIdentity_SystemElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getSystemElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalIdentity#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Same Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SameElement represents an alternate aspect of the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Same Element</em>' reference.
	 * @see #setSameElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalIdentity_SameElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getSameElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalIdentity#getSameElement <em>Same Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Element</em>' reference.
	 * @see #getSameElement()
	 * @generated
	 */
	void setSameElement(CIM_ManagedElement value);

} // CIM_LogicalIdentity
