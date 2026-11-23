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
 * A representation of the model object '<em><b>CIM USB Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a USB Host Controller.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBController#getUSBVersion <em>USB Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBController#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBController#getControllerVersion <em>Controller Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_USBController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>USB Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the latest USB Version that is supported by the Controller. The property is expressed as a Binary-Coded Decimal (BCD) where a decimal point is implied between the second and third digits. For example, a value of 0x201 indicates that version 2.01 is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USB Version</em>' attribute.
	 * @see #setUSBVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBController_USBVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getUSBVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBController#getUSBVersion <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USB Version</em>' attribute.
	 * @see #getUSBVersion()
	 * @generated
	 */
	void setUSBVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of interface used between the host-system software and the USBController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBController_InterfaceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"UHCI\",\"OHCI\"]' ModelCorrespondence='[\"CIM_USBController.ControllerVersion\"]'"
	 * @generated
	 */
	Integer getInterfaceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBController#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Controller Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the version of the USB Host Controller register set, specific to the InterfaceType. The property is expressed as a Binary-Coded Decimal (BCD) value where a decimal point is implied between the second and third digits. For example, a value of 0x103 indicates that version 1.03 is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Version</em>' attribute.
	 * @see #setControllerVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBController_ControllerVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_USBController.InterfaceType\"]'"
	 * @generated
	 */
	Integer getControllerVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBController#getControllerVersion <em>Controller Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Version</em>' attribute.
	 * @see #getControllerVersion()
	 * @generated
	 */
	void setControllerVersion(Integer value);

} // CIM_USBController
