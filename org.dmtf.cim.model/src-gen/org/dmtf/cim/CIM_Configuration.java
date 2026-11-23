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
 * A representation of the model object '<em><b>CIM Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of CIM_Configuration is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This association simplifies the use of Settings or SettingData. With Configurations serving as aggregations of Settings (as defined by the Configuration Component relationship), separate associations were needed for the aggregation and to tie an element to either its Configurations or Settings or SettingData. These separate associations introduced unnecessary complexity and redundancy into the model. 
 * Deprecated description: The Configuration object allows the grouping of sets of parameters (defined in Setting objects) and dependencies for one or more ManagedSystemElements. It represents a certain behavior or a desired functional state for the ManagedSystemElements. The desired functional state of the Configuration is typically driven by external requirements such as time or location. For example, to connect to a Mail System from home, a dependency on a modem exists, but a dependency on a network adapter exists at work. Settings for the pertinent LogicalDevices (in this example, POTSModem and NetworkAdapter) can be defined and aggregated by the Configuration. Therefore, two "Connect to Mail" Configurations can be defined by grouping the relevant dependencies and Setting objects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Configuration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Configuration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_SettingData\",\"CIM_Setting\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Name'"
 * @generated
 */
@ProviderType
public interface CIM_Configuration extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The label by which the Configuration object is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Configuration_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SettingData.InstanceID\",\"CIM_Setting.SettingID\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CIM_Configuration
