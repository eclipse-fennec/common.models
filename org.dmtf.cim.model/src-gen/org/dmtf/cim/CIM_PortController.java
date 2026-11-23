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
 * A representation of the model object '<em><b>CIM Port Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PortController is a logical device corresponding to a hardware network port controller. Port controllers provide various features depending on their types and versions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PortController#getControllerType <em>Controller Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PortController#getOtherControllerType <em>Other Controller Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PortController#getControllerVersion <em>Controller Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PortController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PortController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Controller Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type or model of the port controller. Specific values will be enumerated in a later release of this schema. When set to 1 ("Other"), the related property OtherControllerType contains a string description of the type of the controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Type</em>' attribute.
	 * @see #setControllerType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PortController_ControllerType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"IB\",\"FC\",\"FDDI\",\"ATM\",\"Token Ring\",\"Frame Relay\"]' ModelCorrespondence='[\"CIM_PortController.OtherControllerType\"]'"
	 * @generated
	 */
	Integer getControllerType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PortController#getControllerType <em>Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Type</em>' attribute.
	 * @see #getControllerType()
	 * @generated
	 */
	void setControllerType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Controller Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string value for controller types that is not captured by the ControllerType enumeration. This property should be used only when the value of the ControllerType property is set to 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Controller Type</em>' attribute.
	 * @see #setOtherControllerType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PortController_OtherControllerType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PortController.ControllerType\"]'"
	 * @generated
	 */
	String getOtherControllerType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PortController#getOtherControllerType <em>Other Controller Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Controller Type</em>' attribute.
	 * @see #getOtherControllerType()
	 * @generated
	 */
	void setOtherControllerType(String value);

	/**
	 * Returns the value of the '<em><b>Controller Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision number of the controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Version</em>' attribute.
	 * @see #setControllerVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PortController_ControllerVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getControllerVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PortController#getControllerVersion <em>Controller Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Version</em>' attribute.
	 * @see #getControllerVersion()
	 * @generated
	 */
	void setControllerVersion(Integer value);

} // CIM_PortController
