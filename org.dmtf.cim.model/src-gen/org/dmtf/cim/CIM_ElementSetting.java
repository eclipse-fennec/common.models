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
 * A representation of the model object '<em><b>CIM Element Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementSetting represents the association between ManagedSystemElements and the Setting classes defined for them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementSetting#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSetting#getSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Element,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_ElementSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedSystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_ManagedSystemElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSetting_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedSystemElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSetting#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_ManagedSystemElement value);

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Setting object that is associated with the ManagedSystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' reference.
	 * @see #setSetting(CIM_Setting)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSetting_Setting()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Setting REF' Key='true'"
	 * @generated
	 */
	CIM_Setting getSetting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSetting#getSetting <em>Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' reference.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(CIM_Setting value);

} // CIM_ElementSetting
