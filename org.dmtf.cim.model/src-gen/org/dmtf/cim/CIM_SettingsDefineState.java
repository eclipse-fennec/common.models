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
 * A representation of the model object '<em><b>CIM Settings Define State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SettingsDefineState is used to associate an instance of SettingData with an instance of ManagedElement. This association indicates that the SettingData instance provides additional information about the Current State of the associated ManagedElement. State is broadly defined to include the configuration, status, capabilities, and other information of an instance. 
 * Use of the same instance of SettingData to represent more than one of Current State (SettingsDefineState) and Desired State (ElementSettingData) and Possible State (SettingsDefineCapabilities) for a ManagedElement is not recommended.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SettingsDefineState#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingsDefineState#getSettingData <em>Setting Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingsDefineState()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::Core::Settings' keys='ManagedElement,SettingData'"
 * @generated
 */
@ProviderType
public interface CIM_SettingsDefineState extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The managed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingsDefineState_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingsDefineState#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Setting Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SettingData object that provides additional information about the current state and configuration of the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting Data</em>' reference.
	 * @see #setSettingData(CIM_SettingData)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingsDefineState_SettingData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF' Key='true'"
	 * @generated
	 */
	CIM_SettingData getSettingData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingsDefineState#getSettingData <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Data</em>' reference.
	 * @see #getSettingData()
	 * @generated
	 */
	void setSettingData(CIM_SettingData value);

} // CIM_SettingsDefineState
