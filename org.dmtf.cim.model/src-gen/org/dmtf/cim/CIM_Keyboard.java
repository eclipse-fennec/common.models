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
 * A representation of the model object '<em><b>CIM Keyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the Keyboard LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Keyboard#getNumberOfFunctionKeys <em>Number Of Function Keys</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Keyboard#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Keyboard#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Keyboard()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Keyboard extends CIM_UserDevice {
	/**
	 * Returns the value of the '<em><b>Number Of Function Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of function keys on the Keyboard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Function Keys</em>' attribute.
	 * @see #setNumberOfFunctionKeys(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Keyboard_NumberOfFunctionKeys()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfFunctionKeys();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Keyboard#getNumberOfFunctionKeys <em>Number Of Function Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Function Keys</em>' attribute.
	 * @see #getNumberOfFunctionKeys()
	 * @generated
	 */
	void setNumberOfFunctionKeys(Integer value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string indicating the format and layout of the Keyboard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see #setLayout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Keyboard_Layout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIF.DMTF|Keyboard|004.1\"]'"
	 * @generated
	 */
	String getLayout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Keyboard#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating whether a hardware-level password is enabled at the keyboard (value=4), preventing local input. Other values are: "Disabled" (3), "Not Implemented" (5), "Other" (1) and "Unknown" (2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Keyboard_Password()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Disabled\",\"Enabled\",\"Not Implemented\"]' MappingStrings='[\"MIF.DMTF|System Hardware Security|001.2\"]'"
	 * @generated
	 */
	Integer getPassword();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Keyboard#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(Integer value);

} // CIM_Keyboard
