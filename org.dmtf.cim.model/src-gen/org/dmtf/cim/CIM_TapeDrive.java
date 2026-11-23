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
 * A representation of the model object '<em><b>CIM Tape Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and managment of a TapeDrive, a subtype of MediaAccessDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TapeDrive#getEOTWarningZoneSize <em>EOT Warning Zone Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TapeDrive#getMaxPartitionCount <em>Max Partition Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TapeDrive#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TapeDrive#getMaxRewindTime <em>Max Rewind Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TapeDrive()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_TapeDrive extends CIM_MediaAccessDevice {
	/**
	 * Returns the value of the '<em><b>EOT Warning Zone Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EOT Warning Zone Size</em>' attribute.
	 * @see #setEOTWarningZoneSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDrive_EOTWarningZoneSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getEOTWarningZoneSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDrive#getEOTWarningZoneSize <em>EOT Warning Zone Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOT Warning Zone Size</em>' attribute.
	 * @see #getEOTWarningZoneSize()
	 * @generated
	 */
	void setEOTWarningZoneSize(Long value);

	/**
	 * Returns the value of the '<em><b>Max Partition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum partition count for the TapeDrive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Partition Count</em>' attribute.
	 * @see #setMaxPartitionCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDrive_MaxPartitionCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxPartitionCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDrive#getMaxPartitionCount <em>Max Partition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Partition Count</em>' attribute.
	 * @see #getMaxPartitionCount()
	 * @generated
	 */
	void setMaxPartitionCount(Long value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Padding indicates the number of bytes inserted between blocks on a tape Media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDrive_Padding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getPadding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDrive#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(Long value);

	/**
	 * Returns the value of the '<em><b>Max Rewind Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in milliseconds to move from the most physically distant point on the tape to the beginning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Rewind Time</em>' attribute.
	 * @see #setMaxRewindTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDrive_MaxRewindTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getMaxRewindTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDrive#getMaxRewindTime <em>Max Rewind Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rewind Time</em>' attribute.
	 * @see #getMaxRewindTime()
	 * @generated
	 */
	void setMaxRewindTime(Long value);

} // CIM_TapeDrive
