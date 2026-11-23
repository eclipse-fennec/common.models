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
 * A representation of the model object '<em><b>CIM User Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserDevices are LogicalDevices that allow a ComputerSystem's users to input, view or hear data. It is a superclass from which other classes, such as Keyboard or DesktopMonitor, descend.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UserDevice#getIsLocked <em>Is Locked</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UserDevice()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_UserDevice extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of whether the Device is locked, preventing user input or output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserDevice_IsLocked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserDevice#getIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #getIsLocked()
	 * @generated
	 */
	void setIsLocked(Boolean value);

} // CIM_UserDevice
