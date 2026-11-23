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
 * A representation of the model object '<em><b>CIM Cooling Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of CoolingDevices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CoolingDevice#getActiveCooling <em>Active Cooling</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CoolingDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_CoolingDevice extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Active Cooling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActiveCooling is a Boolean that indicates that the Cooling Device provides active (as opposed to passive) cooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Cooling</em>' attribute.
	 * @see #setActiveCooling(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CoolingDevice_ActiveCooling()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getActiveCooling();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CoolingDevice#getActiveCooling <em>Active Cooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Cooling</em>' attribute.
	 * @see #getActiveCooling()
	 * @generated
	 */
	void setActiveCooling(Boolean value);

} // CIM_CoolingDevice
