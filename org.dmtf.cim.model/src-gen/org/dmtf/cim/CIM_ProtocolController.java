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
 * A representation of the model object '<em><b>CIM Protocol Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProtocolController is a superclass for grouping controllers that are used to control the operation and function of sophisticated devices that instantiate a protocol such as SCSI. Simpler 'bus' and device controllers are modeled using the CIM_Controller class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolController#getMaxUnitsControlled <em>Max Units Controlled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolController()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Device::ProtocolController' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolController extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Max Units Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of Units that can be controlled by or accessed through this ProtocolController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Units Controlled</em>' attribute.
	 * @see #setMaxUnitsControlled(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolController_MaxUnitsControlled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxUnitsControlled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolController#getMaxUnitsControlled <em>Max Units Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Units Controlled</em>' attribute.
	 * @see #getMaxUnitsControlled()
	 * @generated
	 */
	void setMaxUnitsControlled(Long value);

} // CIM_ProtocolController
