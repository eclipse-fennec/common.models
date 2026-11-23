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
 * A representation of the model object '<em><b>CIM Logical Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalModule is the logical device that corresponds to a component part (such as a card or blade) in a device. For example, a line card in a switch is an instance of LogicalModule, that is associated with the the switch itself. A logical module is not necessarily independently managed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalModule#getModuleNumber <em>Module Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalModule#getLogicalModuleType <em>Logical Module Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalModule#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalModule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Ports' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalModule extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Module Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical modules are often named by the physical or logical slot that they occupy within the containing device. ModuleNumber is the number assigned to the module by its parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Number</em>' attribute.
	 * @see #setModuleNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalModule_ModuleNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getModuleNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalModule#getModuleNumber <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Number</em>' attribute.
	 * @see #getModuleNumber()
	 * @generated
	 */
	void setModuleNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Module Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type identifies the type of LogicalModule this instance represents. 
	 * A value of "Unknown" indicates that the LogicalModuleType is unknown. 
	 * A value of "Other" indicates that the value is not one of the enumerated values. OtherLogicalModuleTypeDescription should contain additional information. 
	 * A value of "Device Tray" indicates that the device is a device or media tray, for example in a modular system. 
	 * A value of "Line Card" indicates that the module is a line card in a switch. 
	 * A value of "Blade" indicates the module is a blade inserted into a switch. 
	 * The ranges expressed by "DMTF Reserved" and "Vendor Reserved" are reserved for DMTF and Vendor extensibility, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Module Type</em>' attribute.
	 * @see #setLogicalModuleType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalModule_LogicalModuleType()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Device Tray\",\"Line Card\",\"Blade\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_LogicalModule.OtherLogicalModuleTypeDescription\"]'"
	 * @generated
	 */
	Integer getLogicalModuleType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalModule#getLogicalModuleType <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Module Type</em>' attribute.
	 * @see #getLogicalModuleType()
	 * @generated
	 */
	void setLogicalModuleType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Logical Module Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherLogicalModuleTypeDescription provides additional information about the type of LogicalModule represented by this instance when the value of LogicalModuleType is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Logical Module Type Description</em>' attribute.
	 * @see #setOtherLogicalModuleTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalModule_OtherLogicalModuleTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalModule.LogicalModuleType\"]'"
	 * @generated
	 */
	String getOtherLogicalModuleTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalModule#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Logical Module Type Description</em>' attribute.
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 */
	void setOtherLogicalModuleTypeDescription(String value);

} // CIM_LogicalModule
