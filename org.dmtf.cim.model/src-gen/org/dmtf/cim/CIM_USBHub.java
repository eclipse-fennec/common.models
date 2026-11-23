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
 * A representation of the model object '<em><b>CIM USB Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USB Hub Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBHub#getGangSwitched <em>Gang Switched</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBHub#getNumberOfPorts <em>Number Of Ports</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBHub()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::USB' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_USBHub extends CIM_USBDevice {
	/**
	 * Returns the value of the '<em><b>Gang Switched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether power to the Hub Ports is individually or gang-switched. If this value is FALSE, power is switched individually for each Port. If this value is TRUE, power is switched to all Ports on the Hub at once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gang Switched</em>' attribute.
	 * @see #setGangSwitched(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBHub_GangSwitched()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getGangSwitched();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBHub#getGangSwitched <em>Gang Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gang Switched</em>' attribute.
	 * @see #getGangSwitched()
	 * @generated
	 */
	void setGangSwitched(Boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of downstream Ports on the Hub, including those embedded in the Hub's silicon. Individual USBPorts are associated with the Hub using the USBPortOnHub association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Ports</em>' attribute.
	 * @see #setNumberOfPorts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBHub_NumberOfPorts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getNumberOfPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBHub#getNumberOfPorts <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ports</em>' attribute.
	 * @see #getNumberOfPorts()
	 * @generated
	 */
	void setNumberOfPorts(Integer value);

} // CIM_USBHub
