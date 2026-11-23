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
 * A representation of the model object '<em><b>CIM Unix Device File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DeviceFile is a special type of LogicalFile that represents a Device. This class is a specialization of DeviceFile for a Unix environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceFileType <em>Device File Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceDescription <em>Device Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceMajor <em>Device Major</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceMinor <em>Device Minor</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UnixDeviceFile extends CIM_DeviceFile {
	/**
	 * Returns the value of the '<em><b>Device File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of device file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device File Type</em>' attribute.
	 * @see #setDeviceFileType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_DeviceFileType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Block\",\"Character\"]' ModelCorrespondence='[\"CIM_UnixDeviceFile.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getDeviceFileType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceFileType <em>Device File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device File Type</em>' attribute.
	 * @see #getDeviceFileType()
	 * @generated
	 */
	void setDeviceFileType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information when the DeviceFileType property is set to "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_UnixDeviceFile.DeviceFileType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device Identifier: this is the st_rdev field in the stat structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_DeviceId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Device Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Description</em>' attribute.
	 * @see #setDeviceDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_DeviceDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDeviceDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceDescription <em>Device Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Description</em>' attribute.
	 * @see #getDeviceDescription()
	 * @generated
	 */
	void setDeviceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Device Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Device's Major Id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Major</em>' attribute.
	 * @see #setDeviceMajor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_DeviceMajor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getDeviceMajor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceMajor <em>Device Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Major</em>' attribute.
	 * @see #getDeviceMajor()
	 * @generated
	 */
	void setDeviceMajor(String value);

	/**
	 * Returns the value of the '<em><b>Device Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Device's Minor Id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Minor</em>' attribute.
	 * @see #setDeviceMinor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixDeviceFile_DeviceMinor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getDeviceMinor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixDeviceFile#getDeviceMinor <em>Device Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Minor</em>' attribute.
	 * @see #getDeviceMinor()
	 * @generated
	 */
	void setDeviceMinor(String value);

} // CIM_UnixDeviceFile
