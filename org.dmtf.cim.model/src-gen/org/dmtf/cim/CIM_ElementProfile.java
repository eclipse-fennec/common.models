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
 * A representation of the model object '<em><b>CIM Element Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Profile class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of Setting or SettingData instances. This relationship allows the reuse of the element to Setting or SettingData associations instead of defining a peer association specifically for Profiles. 
 * Deprecated description: ElementProfile represents the association between ManagedElements and the Profiles (collection of settings) that are defined for them. This association indicates that the settings that are collected by the Profile apply to the associated ManagedElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementProfile#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementProfile#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSettingData\",\"CIM_ElementSetting\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='ManagedElement,Profile'"
 * @generated
 */
@ProviderType
public interface CIM_ElementProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The managed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementProfile_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Deprecated='[\"CIM_ElementSettingData.ManagedElement\",\"CIM_ElementSetting.Element\"]' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementProfile#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this object is deprecated. Deprecated description: The Profile object that is associated with the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(CIM_Profile)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementProfile_Profile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Profile REF' Deprecated='[\"CIM_ElementSettingData.SettingData\",\"CIM_ElementSetting.Setting\"]' Key='true'"
	 * @generated
	 */
	CIM_Profile getProfile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementProfile#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(CIM_Profile value);

} // CIM_ElementProfile
