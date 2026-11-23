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
 * A representation of the model object '<em><b>CIM USB Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Port on a USBHub.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBPort#getPower <em>Power</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBPort#getSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBPort#getOvercurrent <em>Overcurrent</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::USB' override.Speed='uint64' override.Speed.Description='USB Port Speed in bits per second. This speed is determined and set by the attached Device. The \'attached Device\' is indicated using the USBConnection association. At this time, only several Port speeds are valid. These are: 1.5Mbps and 12Mbps. The value 0 can also be specified to indicate that the current speed is \'unknown\' or 1 to indicate that the speed is \'other\' than 1.5 or 12Mbps.' override.Speed.ValueMap='[\"0\",\"1\",\"1500000\",\"12000000\"]' override.StatusInfo='uint16' override.StatusInfo.Description='Indicates whether the Port is currently enabled.' override.StatusInfo.ValueMap='[\"2\",\"3\",\"4\"]' override.StatusInfo.Values='[\"Unknown\",\"Enabled\",\"Disabled\"]' override.Availability='uint16' override.Availability.Description='Indicates whether the Port is currently Powered.' override.Availability.ValueMap='[\"2\",\"3\",\"7\"]' override.Availability.Values='[\"Unknown\",\"Running/Full Power\",\"Power Off\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_USBPort extends CIM_LogicalPort {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The USB Port's power capability. The current specification defines that 1 or 5 loads can be supported (values 2 or 3 would be specified, respectively).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBPort_Power()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"1 Unit Load\",\"5 Unit Loads\"]'"
	 * @generated
	 */
	Integer getPower();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBPort#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Integer value);

	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Port is currently Suspended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #setSuspended(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBPort_Suspended()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSuspended();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBPort#getSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #getSuspended()
	 * @generated
	 */
	void setSuspended(Boolean value);

	/**
	 * Returns the value of the '<em><b>Overcurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Port is disabled due to an overcurrent event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overcurrent</em>' attribute.
	 * @see #setOvercurrent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBPort_Overcurrent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getOvercurrent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBPort#getOvercurrent <em>Overcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overcurrent</em>' attribute.
	 * @see #getOvercurrent()
	 * @generated
	 */
	void setOvercurrent(Boolean value);

} // CIM_USBPort
