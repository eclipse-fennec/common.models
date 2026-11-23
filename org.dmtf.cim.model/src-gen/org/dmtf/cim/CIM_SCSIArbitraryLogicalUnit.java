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
 * A representation of the model object '<em><b>CIM SCSI Arbitrary Logical Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SCSIArbitraryLogicalUnit represents an element that is addressed as a device, but is not accurately modeled by some other LogicalDevice subclass (such as TapeDrive or StorageVolume). One common use is 'control devices' that provide management rather than I/O functionality. For example, SCSI defines this behavior for Enclosure Services and SCSI Controller devices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIArbitraryLogicalUnit#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIArbitraryLogicalUnit#getOtherDeviceType <em>Other Device Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIArbitraryLogicalUnit()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::DeviceElements' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIArbitraryLogicalUnit extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the device. For SCSI devices, this property is related to the peripheral device type that is returned in bits 0 to 4 of byte 0 of the inquiry response. Note that 'Direct Access' is included to model the common behavior of using a zero-length volume for in-band management of RAID arrays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see #setDeviceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIArbitraryLogicalUnit_DeviceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Direct Access\",\"SCSI SCC Device\",\"SCSI SES\",\"SCSI ADI\",\"SCSI Well Known Logical Unit\"]' MappingStrings='[\"ANSI|T10|SCSI SPC|Peripheral Device Type\"]' ModelCorrespondence='[\"CIM_SCSIArbitraryLogicalUnit.OtherDeviceType\"]'"
	 * @generated
	 */
	Integer getDeviceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIArbitraryLogicalUnit#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the device type if DeviceType is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Device Type</em>' attribute.
	 * @see #setOtherDeviceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIArbitraryLogicalUnit_OtherDeviceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIArbitraryLogicalUnit.DeviceType\"]'"
	 * @generated
	 */
	String getOtherDeviceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIArbitraryLogicalUnit#getOtherDeviceType <em>Other Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Device Type</em>' attribute.
	 * @see #getOtherDeviceType()
	 * @generated
	 */
	void setOtherDeviceType(String value);

} // CIM_SCSIArbitraryLogicalUnit
