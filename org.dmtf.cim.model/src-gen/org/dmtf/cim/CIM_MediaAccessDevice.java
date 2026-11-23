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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Media Access Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MediaAccessDevice represents the ability to access one or more media and use this media to store and retrieve data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getErrorMethodology <em>Error Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getCompressionMethod <em>Compression Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getNumberOfMediaSupported <em>Number Of Media Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxMediaSize <em>Max Media Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getDefaultBlockSize <em>Default Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxBlockSize <em>Max Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMinBlockSize <em>Min Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getNeedsCleaning <em>Needs Cleaning</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMediaIsLocked <em>Media Is Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getLastCleaned <em>Last Cleaned</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxAccessTime <em>Max Access Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getUncompressedDataRate <em>Uncompressed Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getLoadTime <em>Load Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnloadTime <em>Unload Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMountCount <em>Mount Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getTimeOfLastMount <em>Time Of Last Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getTotalMountTime <em>Total Mount Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnitsDescription <em>Units Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxUnitsBeforeCleaning <em>Max Units Before Cleaning</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnitsUsed <em>Units Used</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_MediaAccessDevice extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
	 * Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"Sequential Access\",\"Random Access\",\"Supports Writing\",\"Encryption\",\"Compression\",\"Supports Removeable Media\",\"Manual Cleaning\",\"Automatic Cleaning\",\"SMART Notification\",\"Supports Dual Sided Media\",\"Predismount Eject Not Required\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Storage Devices|001.9\",\"MIF.DMTF|Storage Devices|001.11\",\"MIF.DMTF|Storage Devices|001.12\",\"MIF.DMTF|Disks|003.7\",\"MIF.DMTF|Host Disk|001.2\",\"MIF.DMTF|Host Disk|001.4\"]' ModelCorrespondence='[\"CIM_MediaAccessDevice.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MediaAccessDevice.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Error Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Methodology</em>' attribute.
	 * @see #setErrorMethodology(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_ErrorMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getErrorMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getErrorMethodology <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Methodology</em>' attribute.
	 * @see #getErrorMethodology()
	 * @generated
	 */
	void setErrorMethodology(String value);

	/**
	 * Returns the value of the '<em><b>Compression Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression Method</em>' attribute.
	 * @see #setCompressionMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_CompressionMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCompressionMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getCompressionMethod <em>Compression Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Method</em>' attribute.
	 * @see #getCompressionMethod()
	 * @generated
	 */
	void setCompressionMethod(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Media Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Media Supported</em>' attribute.
	 * @see #setNumberOfMediaSupported(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_NumberOfMediaSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getNumberOfMediaSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getNumberOfMediaSupported <em>Number Of Media Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Media Supported</em>' attribute.
	 * @see #getNumberOfMediaSupported()
	 * @generated
	 */
	void setNumberOfMediaSupported(Long value);

	/**
	 * Returns the value of the '<em><b>Max Media Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Media Size</em>' attribute.
	 * @see #setMaxMediaSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MaxMediaSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Sequential Access Devices|001.2\",\"MIF.DMTF|Host Disk|001.5\"]'"
	 * @generated
	 */
	Long getMaxMediaSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxMediaSize <em>Max Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Media Size</em>' attribute.
	 * @see #getMaxMediaSize()
	 * @generated
	 */
	void setMaxMediaSize(Long value);

	/**
	 * Returns the value of the '<em><b>Default Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default block size, in bytes, for this Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Block Size</em>' attribute.
	 * @see #setDefaultBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_DefaultBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getDefaultBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getDefaultBlockSize <em>Default Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Block Size</em>' attribute.
	 * @see #getDefaultBlockSize()
	 * @generated
	 */
	void setDefaultBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Max Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum block size, in bytes, for media accessed by this Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Block Size</em>' attribute.
	 * @see #setMaxBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MaxBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxBlockSize <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Block Size</em>' attribute.
	 * @see #getMaxBlockSize()
	 * @generated
	 */
	void setMaxBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Min Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum block size, in bytes, for media accessed by this Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Block Size</em>' attribute.
	 * @see #setMinBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MinBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMinBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMinBlockSize <em>Min Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Block Size</em>' attribute.
	 * @see #getMinBlockSize()
	 * @generated
	 */
	void setMinBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Needs Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs Cleaning</em>' attribute.
	 * @see #setNeedsCleaning(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_NeedsCleaning()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNeedsCleaning();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getNeedsCleaning <em>Needs Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Cleaning</em>' attribute.
	 * @see #getNeedsCleaning()
	 * @generated
	 */
	void setNeedsCleaning(Boolean value);

	/**
	 * Returns the value of the '<em><b>Media Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Is Locked</em>' attribute.
	 * @see #setMediaIsLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MediaIsLocked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMediaIsLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMediaIsLocked <em>Media Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Is Locked</em>' attribute.
	 * @see #getMediaIsLocked()
	 * @generated
	 */
	void setMediaIsLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_Security()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Other\",\"Unknown\",\"None\",\"Read Only\",\"Locked Out\",\"Boot Bypass\",\"Boot Bypass and Read Only\"]' MappingStrings='[\"MIF.DMTF|Disks|003.22\"]'"
	 * @generated
	 */
	Integer getSecurity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time on which the Device was last cleaned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Cleaned</em>' attribute.
	 * @see #setLastCleaned(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_LastCleaned()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastCleaned();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getLastCleaned <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Cleaned</em>' attribute.
	 * @see #getLastCleaned()
	 * @generated
	 */
	void setLastCleaned(String value);

	/**
	 * Returns the value of the '<em><b>Max Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Access Time</em>' attribute.
	 * @see #setMaxAccessTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MaxAccessTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getMaxAccessTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxAccessTime <em>Max Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Access Time</em>' attribute.
	 * @see #getMaxAccessTime()
	 * @generated
	 */
	void setMaxAccessTime(Long value);

	/**
	 * Returns the value of the '<em><b>Uncompressed Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uncompressed Data Rate</em>' attribute.
	 * @see #setUncompressedDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_UncompressedDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes per Second' PUnit='byte / second * 10^3'"
	 * @generated
	 */
	Long getUncompressedDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getUncompressedDataRate <em>Uncompressed Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncompressed Data Rate</em>' attribute.
	 * @see #getUncompressedDataRate()
	 * @generated
	 */
	void setUncompressedDataRate(Long value);

	/**
	 * Returns the value of the '<em><b>Load Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Time</em>' attribute.
	 * @see #setLoadTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_LoadTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getLoadTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getLoadTime <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Time</em>' attribute.
	 * @see #getLoadTime()
	 * @generated
	 */
	void setLoadTime(Long value);

	/**
	 * Returns the value of the '<em><b>Unload Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unload Time</em>' attribute.
	 * @see #setUnloadTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_UnloadTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getUnloadTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnloadTime <em>Unload Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unload Time</em>' attribute.
	 * @see #getUnloadTime()
	 * @generated
	 */
	void setUnloadTime(Long value);

	/**
	 * Returns the value of the '<em><b>Mount Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Count</em>' attribute.
	 * @see #setMountCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MountCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMountCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMountCount <em>Mount Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Count</em>' attribute.
	 * @see #getMountCount()
	 * @generated
	 */
	void setMountCount(Long value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Mount</em>' attribute.
	 * @see #setTimeOfLastMount(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_TimeOfLastMount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastMount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getTimeOfLastMount <em>Time Of Last Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Mount</em>' attribute.
	 * @see #getTimeOfLastMount()
	 * @generated
	 */
	void setTimeOfLastMount(String value);

	/**
	 * Returns the value of the '<em><b>Total Mount Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Mount Time</em>' attribute.
	 * @see #setTotalMountTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_TotalMountTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getTotalMountTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getTotalMountTime <em>Total Mount Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Mount Time</em>' attribute.
	 * @see #getTotalMountTime()
	 * @generated
	 */
	void setTotalMountTime(Long value);

	/**
	 * Returns the value of the '<em><b>Units Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Description</em>' attribute.
	 * @see #setUnitsDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_UnitsDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_MediaAccessDevice.MaxUnitsBeforeCleaning\",\"CIM_MediaAccessDevice.UnitsUsed\"]'"
	 * @generated
	 */
	String getUnitsDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnitsDescription <em>Units Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Description</em>' attribute.
	 * @see #getUnitsDescription()
	 * @generated
	 */
	void setUnitsDescription(String value);

	/**
	 * Returns the value of the '<em><b>Max Units Before Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Units Before Cleaning</em>' attribute.
	 * @see #setMaxUnitsBeforeCleaning(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_MaxUnitsBeforeCleaning()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_MediaAccessDevice.UnitsDescription\"]'"
	 * @generated
	 */
	Long getMaxUnitsBeforeCleaning();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getMaxUnitsBeforeCleaning <em>Max Units Before Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Units Before Cleaning</em>' attribute.
	 * @see #getMaxUnitsBeforeCleaning()
	 * @generated
	 */
	void setMaxUnitsBeforeCleaning(Long value);

	/**
	 * Returns the value of the '<em><b>Units Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Used</em>' attribute.
	 * @see #setUnitsUsed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessDevice_UnitsUsed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Gauge='true' ModelCorrespondence='[\"CIM_MediaAccessDevice.UnitsDescription\",\"CIM_MediaAccessDevice.MaxUnitsBeforeCleaning\"]'"
	 * @generated
	 */
	Long getUnitsUsed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessDevice#getUnitsUsed <em>Units Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Used</em>' attribute.
	 * @see #getUnitsUsed()
	 * @generated
	 */
	void setUnitsUsed(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to lock and unlock the media in a removeable Access Device. The method takes one parameter as input - a boolean indicating whether to lock or unlock. TRUE indicates that the media should be locked in the Device, FALSE indicates that the media should be unlocked. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
	 * @param Lock If TRUE, lock the media. If FALSE release the media.
	 * <!-- end-model-doc -->
	 * @model LockAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long LockMedia(Boolean Lock);

} // CIM_MediaAccessDevice
