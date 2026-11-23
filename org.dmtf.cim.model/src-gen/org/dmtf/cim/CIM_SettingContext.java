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
 * A representation of the model object '<em><b>CIM Setting Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of instances of Setting or SettingData. Therefore, the aggregation of Settings into Configurations is replaced by the ConcreteComponent relationship between instances of Settings and SettingData. 
 * Deprecated description: This relationship associates Configuration objects with Setting objects. For example, Settings of a NetworkAdapter could change based on the site or network to which its hosting ComputerSystem is attached. In this case, the ComputerSystem would have two different Configuration objects, corresponding to the differences in network configuration for the two network segments. Configuration A would aggregate a Setting object for the NetworkAdapter when operating on segment "ANet", whereas Configuration B would aggregate a different NetworkAdapter Setting object, specific to segment "BNet". Note that many Settings of the computer are independent of the network Configuration. For example, both Configurations A and B would aggregate the same Setting object for the MonitorResolution of the ComputerSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SettingContext#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingContext#getSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingContext()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteComponent\"]' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Context,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_SettingContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration object that aggregates the Setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingContext_Context()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"CIM_ConcreteComponent.GroupComponent\"]' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_Configuration getContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingContext#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CIM_Configuration value);

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: An aggregated Setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' reference.
	 * @see #setSetting(CIM_Setting)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingContext_Setting()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Setting REF' Deprecated='[\"CIM_ConcreteComponent.PartComponent\"]' Key='true'"
	 * @generated
	 */
	CIM_Setting getSetting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingContext#getSetting <em>Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' reference.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(CIM_Setting value);

} // CIM_SettingContext
