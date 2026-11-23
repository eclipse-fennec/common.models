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
 * A representation of the model object '<em><b>CIM System Setting Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration and SystemConfiguration classes are deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of Settings or SettingData instances. Therefore, the aggregation of SystemSettings into System Configurations is replaced by the ConcreteComponent relationship between instances of Settings and SettingData. 
 * Deprecated description: This relationship associates System-specific Configuration objects with System-specific Setting objects, similar to the SettingContext association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemSettingContext#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemSettingContext#getSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemSettingContext()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteComponent\"]' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Context,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_SystemSettingContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration object that aggregates the Setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(CIM_SystemConfiguration)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemSettingContext_Context()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemConfiguration REF' Deprecated='[\"CIM_ConcreteComponent.GroupComponent\"]' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_SystemConfiguration getContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemSettingContext#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CIM_SystemConfiguration value);

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: An aggregated Setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' reference.
	 * @see #setSetting(CIM_SystemSetting)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemSettingContext_Setting()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemSetting REF' Deprecated='[\"CIM_ConcreteComponent.PartComponent\"]' Key='true'"
	 * @generated
	 */
	CIM_SystemSetting getSetting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemSettingContext#getSetting <em>Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' reference.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(CIM_SystemSetting value);

} // CIM_SystemSettingContext
