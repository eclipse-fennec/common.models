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
 * A representation of the model object '<em><b>CIM Picker Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PickerElements represent hardware used to pick or place PhysicalMedia from/into StorageMediaLocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PickerElement#getMaxPickTime <em>Max Pick Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerElement#getMaxPutTime <em>Max Put Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PickerElement#getCellLocation <em>Cell Location</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PickerElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PickerElement extends CIM_MediaTransferDevice {
	/**
	 * Returns the value of the '<em><b>Max Pick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum time in seconds for a PickerElement to grab a PhysicalMedia from a StorageMediaLocation, once the Picker has arrived at that Location. The maximum time interval for moving a Media from one point to another is the sum of the PickerElement's MaxPickTime, the Changer Device's MaxTransitTime and the PickerElement's MaxPutTime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pick Time</em>' attribute.
	 * @see #setMaxPickTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerElement_MaxPickTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getMaxPickTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerElement#getMaxPickTime <em>Max Pick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pick Time</em>' attribute.
	 * @see #getMaxPickTime()
	 * @generated
	 */
	void setMaxPickTime(Long value);

	/**
	 * Returns the value of the '<em><b>Max Put Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum time in seconds for a PickerElement to place a PhysicalMedia into a StorageMediaLocation, once the Picker has arrived at that Location. The maximum time interval for moving a Media from one point to another is the sum of the PickerElement's MaxPickTime, the Changer Device's MaxTransitTime and the PickerElement's MaxPutTime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Put Time</em>' attribute.
	 * @see #setMaxPutTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerElement_MaxPutTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getMaxPutTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerElement#getMaxPutTime <em>Max Put Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Put Time</em>' attribute.
	 * @see #getMaxPutTime()
	 * @generated
	 */
	void setMaxPutTime(Long value);

	/**
	 * Returns the value of the '<em><b>Cell Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String describing the location in the StorageLibrary where the Picker is currently positioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Location</em>' attribute.
	 * @see #setCellLocation(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PickerElement_CellLocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCellLocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PickerElement#getCellLocation <em>Cell Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Location</em>' attribute.
	 * @see #getCellLocation()
	 * @generated
	 */
	void setCellLocation(String value);

} // CIM_PickerElement
