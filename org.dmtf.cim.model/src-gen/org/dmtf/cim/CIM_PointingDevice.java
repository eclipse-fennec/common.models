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
 * A representation of the model object '<em><b>CIM Pointing Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PointingDevice represents those Devices used to 'point' to regions of a Display.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PointingDevice#getPointingType <em>Pointing Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PointingDevice#getNumberOfButtons <em>Number Of Buttons</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PointingDevice#getHandedness <em>Handedness</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PointingDevice#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PointingDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PointingDevice extends CIM_UserDevice {
	/**
	 * Returns the value of the '<em><b>Pointing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the pointing device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointing Type</em>' attribute.
	 * @see #setPointingType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PointingDevice_PointingType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Other\",\"Unknown\",\"Mouse\",\"Track Ball\",\"Track Point\",\"Glide Point\",\"Touch Pad\",\"Touch Screen\",\"Mouse - Optical Sensor\"]' MappingStrings='[\"MIF.DMTF|Pointing Device|003.1\"]'"
	 * @generated
	 */
	Integer getPointingType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PointingDevice#getPointingType <em>Pointing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointing Type</em>' attribute.
	 * @see #getPointingType()
	 * @generated
	 */
	void setPointingType(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of buttons. If the PointingDevice has no buttons, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Buttons</em>' attribute.
	 * @see #setNumberOfButtons(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PointingDevice_NumberOfButtons()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIF.DMTF|Pointing Device|003.4\"]'"
	 * @generated
	 */
	Integer getNumberOfButtons();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PointingDevice#getNumberOfButtons <em>Number Of Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Buttons</em>' attribute.
	 * @see #getNumberOfButtons()
	 * @generated
	 */
	void setNumberOfButtons(Integer value);

	/**
	 * Returns the value of the '<em><b>Handedness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer indicating whether the PointingDevice is configured for right (value=2) or left handed operation (value=3). Also, the values, "Unknown" (0) and "Not Applicable" (1), can be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handedness</em>' attribute.
	 * @see #setHandedness(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PointingDevice_Handedness()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Not Applicable\",\"Right Handed Operation\",\"Left Handed Operation\"]'"
	 * @generated
	 */
	Integer getHandedness();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PointingDevice#getHandedness <em>Handedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handedness</em>' attribute.
	 * @see #getHandedness()
	 * @generated
	 */
	void setHandedness(Integer value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tracking resolution of the PointingDevice in Counts per Inch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PointingDevice_Resolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Counts per Inch' PUnit='count / inch'"
	 * @generated
	 */
	Long getResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PointingDevice#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Long value);

} // CIM_PointingDevice
