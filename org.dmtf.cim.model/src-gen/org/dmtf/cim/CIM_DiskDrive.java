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
 * A representation of the model object '<em><b>CIM Disk Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and managment of a DiskDrive, a subtype of MediaAccessDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getFormFactor <em>Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getInterconnectSpeed <em>Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getInterconnectType <em>Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getOtherInterconnectType <em>Other Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskDrive#getRPM <em>RPM</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskDrive extends CIM_MediaAccessDevice {
	/**
	 * Returns the value of the '<em><b>Disk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technology used to store data. the hybrid uses a combination of HDD and SSD in the same drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Type</em>' attribute.
	 * @see #setDiskType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_DiskType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Hard Disk Drive\",\"Solid State Drive\",\"Hybrid\"]'"
	 * @generated
	 */
	Integer getDiskType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getDiskType <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Type</em>' attribute.
	 * @see #getDiskType()
	 * @generated
	 */
	void setDiskType(Integer value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property reflects the state of the encryption feature implemented by some disk drives as defined by SCSI. The Unlocked state means the drive is capable of encryption but it is disabled. The Locked state means the drive is currently encrypted
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see #setEncryption(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_Encryption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Not Supported\",\"Unlocked\",\"Locked\"]'"
	 * @generated
	 */
	Integer getEncryption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(Integer value);

	/**
	 * Returns the value of the '<em><b>Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Physical size of the disk drive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Factor</em>' attribute.
	 * @see #setFormFactor(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_FormFactor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Not Reported\",\"5.25 inch\",\"3.5 inch\",\"2.5 inch\",\"1.8 inch\",\"M.2\"]'"
	 * @generated
	 */
	Integer getFormFactor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getFormFactor <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Factor</em>' attribute.
	 * @see #getFormFactor()
	 * @generated
	 */
	void setFormFactor(Integer value);

	/**
	 * Returns the value of the '<em><b>Interconnect Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the port speed in bit/second. If the speed is unknown the property should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect Speed</em>' attribute.
	 * @see #setInterconnectSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_InterconnectSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getInterconnectSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getInterconnectSpeed <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Speed</em>' attribute.
	 * @see #getInterconnectSpeed()
	 * @generated
	 */
	void setInterconnectSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Interconnect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the drive interface type. 
	 * ATA: Advanced Technology Attachment 
	 * SATA: Serial ATA 
	 * SAS: Serial Attached SCSI 
	 * FC: Fibre Channel 
	 * SOP: SCSI Over PCIe -- Peripheral Component Interconnect express.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect Type</em>' attribute.
	 * @see #setInterconnectType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_InterconnectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"ATA\",\"SATA\",\"SAS\",\"FC\",\"SOP\",\"NVMe\"]'"
	 * @generated
	 */
	Integer getInterconnectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getInterconnectType <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Type</em>' attribute.
	 * @see #getInterconnectType()
	 * @generated
	 */
	void setInterconnectType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Interconnect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies other interconnect types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Interconnect Type</em>' attribute.
	 * @see #setOtherInterconnectType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_OtherInterconnectType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherInterconnectType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getOtherInterconnectType <em>Other Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Interconnect Type</em>' attribute.
	 * @see #getOtherInterconnectType()
	 * @generated
	 */
	void setOtherInterconnectType(String value);

	/**
	 * Returns the value of the '<em><b>RPM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies how fast the drive media spins in Rotations Per Minute. Solid State drives should set this property to 0. If the RPM is unknown the property should be set to 0xFFFFFFFF
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPM</em>' attribute.
	 * @see #setRPM(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskDrive_RPM()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Revolutions per Minute' PUnit='revolution / minute'"
	 * @generated
	 */
	Long getRPM();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskDrive#getRPM <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPM</em>' attribute.
	 * @see #getRPM()
	 * @generated
	 */
	void setRPM(Long value);

} // CIM_DiskDrive
