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
 * A representation of the model object '<em><b>CIM Block Storage Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StatisticalData which identifies individual statistics for an element of a block storage system. This class defines the metrics that MAY be kept for managed elements of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalIOs <em>Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesTransferred <em>KBytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesWritten <em>KBytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getIOTimeCounter <em>IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOs <em>Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOs <em>Read Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOTimeCounter <em>Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOTimeCounter <em>Read Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesRead <em>KBytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOs <em>Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOs <em>Write Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOTimeCounter <em>Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOTimeCounter <em>Write Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getIdleTimeCounter <em>Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintOp <em>Maint Op</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintTimeCounter <em>Maint Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesReadRate <em>KBytes Read Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesTransferredRate <em>KBytes Transferred Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesWrittenRate <em>KBytes Written Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintOpRate <em>Maint Op Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getRateElementType <em>Rate Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOsRate <em>Read Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOsRate <em>Read IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadSequentialHits <em>Read Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadSequentialIOs <em>Read Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalHitIOs <em>Total Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalIOsRate <em>Total IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOsRate <em>Write Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOsRate <em>Write IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteSequentialHits <em>Write Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteSequentialIOs <em>Write Sequential IOs</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BlockStorageStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the role that the element played for which this statistics record was collected. If the metered element is a system or a component of a system associated to a RegisteredProfile, then that profile may provide a more specialized definition and additional usage information for this property. 
	 * Generally, the ElementTypes defined here have the following meaning in the context of this class: 2, "Computer System": Cumulative statistics for the storage system. In the case of a complex system with multiple component Computer Systems, these are the statistics for the top-level aggregate Computer System. 3, "Front-end Computer System": Statistics for a component computer system that communicate with systems that initiate IO requests. 4, "Peer Computer System": Statistics for a component computer system that communicates with peer storage systems e.g. to provide remote mirroring of a volume. 5, "Back-end Computer System": Statistics for a component computer system that communicates with back-end storage. 6, "Front-end Port": Statistics for a port that communicates with systems that initiate IO requests. 7, "Back-end Port": Statistics for a port that initiates IO requests to storage devices. 8, "Volume": Statistics for an exposable storage extent, such as a StorageVolume or LogicalDisk. 9, "Extent": Statistics for an intermediate storage extent, i.e. an extent that is neither a volume or a disk. 10, "Disk Drive: Statistics for a StorageExtent that is associated to a DiskDrive through the MediaPresent association. 11, "Arbitrary LUs": Statistics that derive from access to Logical Units that are NOT StorageVolumes (e.g., controller commands). 12, "Remote Replica Group": Statistics for control IOs between an array and a remote mirror across a Network. Note that statistics for the actual movement of data to the remote mirror are attributed to the targeted StorageVolume (or LogicalDisk). Note that a particular element could be associated to multiple BlockStorageStatisticalData instances if it had multiple roles. For example, a storage array could contain redundant component computer systems that communicate both with hosts on the front end and disks on the back end. Such a device could have one BlockStorageStatisticalData instance where ElementType=3 and another instance where ElementType=5.If only rated data is included per RateElementType, this property shall be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Computer System\",\"Front-end Computer System\",\"Peer Computer System\",\"Back-end Computer System\",\"Front-end Port\",\"Back-end Port\",\"Volume\",\"Extent\",\"Disk Drive\",\"Arbitrary LUs\",\"Remote Replica Group\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Total IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of I/Os for the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total IOs</em>' attribute.
	 * @see #setTotalIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_TotalIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalIOs <em>Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total IOs</em>' attribute.
	 * @see #getTotalIOs()
	 * @generated
	 */
	void setTotalIOs(Long value);

	/**
	 * Returns the value of the '<em><b>KBytes Transferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of data transferred in Kbytes (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Transferred</em>' attribute.
	 * @see #setKBytesTransferred(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesTransferred()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Counter='true' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getKBytesTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesTransferred <em>KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Transferred</em>' attribute.
	 * @see #getKBytesTransferred()
	 * @generated
	 */
	void setKBytesTransferred(Long value);

	/**
	 * Returns the value of the '<em><b>KBytes Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of data written in Kbytes (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Written</em>' attribute.
	 * @see #setKBytesWritten(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesWritten()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Counter='true' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getKBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesWritten <em>KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Written</em>' attribute.
	 * @see #getKBytesWritten()
	 * @generated
	 */
	void setKBytesWritten(Long value);

	/**
	 * Returns the value of the '<em><b>IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed I/O time (number of Clock Tick Intervals) for all I/Os as defined in 'Total I/Os'. I/O response time is added to this counter at the completion of each measured I/O using ClockTickInterval units. This value can be divided by number of IOs to obtain an average response time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Time Counter</em>' attribute.
	 * @see #setIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_IOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getIOTimeCounter <em>IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Time Counter</em>' attribute.
	 * @see #getIOTimeCounter()
	 * @generated
	 */
	void setIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Read IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all reads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read IOs</em>' attribute.
	 * @see #setReadIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOs <em>Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read IOs</em>' attribute.
	 * @see #getReadIOs()
	 * @generated
	 */
	void setReadIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Read Hit IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all read cache hits (Reads from Cache).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Hit IOs</em>' attribute.
	 * @see #setReadHitIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadHitIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOs <em>Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Hit IOs</em>' attribute.
	 * @see #getReadHitIOs()
	 * @generated
	 */
	void setReadHitIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Read IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed time for all Read I/Os for all cumulative Read I/Os.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read IO Time Counter</em>' attribute.
	 * @see #setReadIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOTimeCounter <em>Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read IO Time Counter</em>' attribute.
	 * @see #getReadIOTimeCounter()
	 * @generated
	 */
	void setReadIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Read Hit IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed time for all Read I/Os read from cache for all cumulative Read I/Os.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Hit IO Time Counter</em>' attribute.
	 * @see #setReadHitIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadHitIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadHitIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOTimeCounter <em>Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Hit IO Time Counter</em>' attribute.
	 * @see #getReadHitIOTimeCounter()
	 * @generated
	 */
	void setReadHitIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>KBytes Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of data read in Kbytes (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Read</em>' attribute.
	 * @see #setKBytesRead(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesRead()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' Counter='true' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getKBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesRead <em>KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Read</em>' attribute.
	 * @see #getKBytesRead()
	 * @generated
	 */
	void setKBytesRead(Long value);

	/**
	 * Returns the value of the '<em><b>Write IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all writes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write IOs</em>' attribute.
	 * @see #setWriteIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOs <em>Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write IOs</em>' attribute.
	 * @see #getWriteIOs()
	 * @generated
	 */
	void setWriteIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Write Hit IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of Write Cache Hits (Writes that went directly to Cache).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Hit IOs</em>' attribute.
	 * @see #setWriteHitIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteHitIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOs <em>Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Hit IOs</em>' attribute.
	 * @see #getWriteHitIOs()
	 * @generated
	 */
	void setWriteHitIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Write IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed time for all Write I/Os for all cumulative Writes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write IO Time Counter</em>' attribute.
	 * @see #setWriteIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOTimeCounter <em>Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write IO Time Counter</em>' attribute.
	 * @see #getWriteIOTimeCounter()
	 * @generated
	 */
	void setWriteIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Write Hit IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed time using ClockTickInterval units for all Write I/Os written to cache for all cumulative Write I/Os.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Hit IO Time Counter</em>' attribute.
	 * @see #setWriteHitIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteHitIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteHitIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOTimeCounter <em>Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Hit IO Time Counter</em>' attribute.
	 * @see #getWriteHitIOTimeCounter()
	 * @generated
	 */
	void setWriteHitIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Idle Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed idle time using ClockTickInterval units (Cumulative Number of Time Units for all idle time in the array).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Time Counter</em>' attribute.
	 * @see #setIdleTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_IdleTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getIdleTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getIdleTimeCounter <em>Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Time Counter</em>' attribute.
	 * @see #getIdleTimeCounter()
	 * @generated
	 */
	void setIdleTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Maint Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all disk maintenance operations (SCSI commands such as: Verify, skip-mask, XOR read, XOR write-read, etc).This is needed to understand the load on the disks that may interfere with normal read and write operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maint Op</em>' attribute.
	 * @see #setMaintOp(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_MaintOp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMaintOp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintOp <em>Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Op</em>' attribute.
	 * @see #getMaintOp()
	 * @generated
	 */
	void setMaintOp(Long value);

	/**
	 * Returns the value of the '<em><b>Maint Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed disk mainenance time. Maintainance response time is added to this counter at the completion of each measured maintenance operation using ClockTickInterval units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maint Time Counter</em>' attribute.
	 * @see #setMaintTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_MaintTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMaintTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintTimeCounter <em>Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Time Counter</em>' attribute.
	 * @see #getMaintTimeCounter()
	 * @generated
	 */
	void setMaintTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>KBytes Read Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of data read in Kbytes per second (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Read Rate</em>' attribute.
	 * @see #setKBytesReadRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesReadRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Float getKBytesReadRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesReadRate <em>KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Read Rate</em>' attribute.
	 * @see #getKBytesReadRate()
	 * @generated
	 */
	void setKBytesReadRate(Float value);

	/**
	 * Returns the value of the '<em><b>KBytes Transferred Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of data transferred in Kbytes per second (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Transferred Rate</em>' attribute.
	 * @see #setKBytesTransferredRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesTransferredRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Float getKBytesTransferredRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesTransferredRate <em>KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Transferred Rate</em>' attribute.
	 * @see #getKBytesTransferredRate()
	 * @generated
	 */
	void setKBytesTransferredRate(Float value);

	/**
	 * Returns the value of the '<em><b>KBytes Written Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of data written in Kbytes per second (1024bytes = 1KByte).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KBytes Written Rate</em>' attribute.
	 * @see #setKBytesWrittenRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_KBytesWrittenRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Float getKBytesWrittenRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getKBytesWrittenRate <em>KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KBytes Written Rate</em>' attribute.
	 * @see #getKBytesWrittenRate()
	 * @generated
	 */
	void setKBytesWrittenRate(Float value);

	/**
	 * Returns the value of the '<em><b>Maint Op Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all disk maintenance operations per second (SCSI commands such as: Verify, skip-mask, XOR read, XOR write-read, etc).This is needed to understand the load on the disks that may interfere with normal read and write operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maint Op Rate</em>' attribute.
	 * @see #setMaintOpRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_MaintOpRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getMaintOpRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getMaintOpRate <em>Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Op Rate</em>' attribute.
	 * @see #getMaintOpRate()
	 * @generated
	 */
	void setMaintOpRate(Float value);

	/**
	 * Returns the value of the '<em><b>Rate Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Similar description as the ElementType, except for rated data. If rated data is not included, this property shall be set to 0 or null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Element Type</em>' attribute.
	 * @see #setRateElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_RateElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Computer System Rate\",\"Front-end Computer System Rate\",\"Peer Computer System Rate\",\"Back-end Computer System Rate\",\"Front-end Port Rate\",\"Back-end Port Rate\",\"Volume Rate\",\"Extent Rate\",\"Disk Drive Rate\",\"Arbitrary LUs Rate\",\"Remote Replica Group Rate\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ElementType\"]'"
	 * @generated
	 */
	Integer getRateElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getRateElementType <em>Rate Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Element Type</em>' attribute.
	 * @see #getRateElementType()
	 * @generated
	 */
	void setRateElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Read Hit IOs Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of all read cache hits (Reads from Cache) per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Hit IOs Rate</em>' attribute.
	 * @see #setReadHitIOsRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadHitIOsRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getReadHitIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadHitIOsRate <em>Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Hit IOs Rate</em>' attribute.
	 * @see #getReadHitIOsRate()
	 * @generated
	 */
	void setReadHitIOsRate(Float value);

	/**
	 * Returns the value of the '<em><b>Read IOs Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of all reads per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read IOs Rate</em>' attribute.
	 * @see #setReadIOsRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadIOsRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getReadIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadIOsRate <em>Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read IOs Rate</em>' attribute.
	 * @see #getReadIOsRate()
	 * @generated
	 */
	void setReadIOsRate(Float value);

	/**
	 * Returns the value of the '<em><b>Read Sequential Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of sequential read cache hits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Sequential Hits</em>' attribute.
	 * @see #setReadSequentialHits(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadSequentialHits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadSequentialHits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadSequentialHits <em>Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Sequential Hits</em>' attribute.
	 * @see #getReadSequentialHits()
	 * @generated
	 */
	void setReadSequentialHits(Long value);

	/**
	 * Returns the value of the '<em><b>Read Sequential IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of sequential reads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Sequential IOs</em>' attribute.
	 * @see #setReadSequentialIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_ReadSequentialIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadSequentialIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getReadSequentialIOs <em>Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Sequential IOs</em>' attribute.
	 * @see #getReadSequentialIOs()
	 * @generated
	 */
	void setReadSequentialIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Total Hit IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of Cache Hits (both read and write).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Hit IOs</em>' attribute.
	 * @see #setTotalHitIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_TotalHitIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalHitIOs <em>Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Hit IOs</em>' attribute.
	 * @see #getTotalHitIOs()
	 * @generated
	 */
	void setTotalHitIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Total IOs Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of I/Os per second for the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total IOs Rate</em>' attribute.
	 * @see #setTotalIOsRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_TotalIOsRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getTotalIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getTotalIOsRate <em>Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total IOs Rate</em>' attribute.
	 * @see #getTotalIOsRate()
	 * @generated
	 */
	void setTotalIOsRate(Float value);

	/**
	 * Returns the value of the '<em><b>Write Hit IOs Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Write Cache Hits per second (Writes that went directly to Cache).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Hit IOs Rate</em>' attribute.
	 * @see #setWriteHitIOsRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteHitIOsRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getWriteHitIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteHitIOsRate <em>Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Hit IOs Rate</em>' attribute.
	 * @see #getWriteHitIOsRate()
	 * @generated
	 */
	void setWriteHitIOsRate(Float value);

	/**
	 * Returns the value of the '<em><b>Write IOs Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all writes per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write IOs Rate</em>' attribute.
	 * @see #setWriteIOsRate(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteIOsRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getWriteIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteIOsRate <em>Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write IOs Rate</em>' attribute.
	 * @see #getWriteIOsRate()
	 * @generated
	 */
	void setWriteIOsRate(Float value);

	/**
	 * Returns the value of the '<em><b>Write Sequential Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of sequential Write Cache Hits (sequential writes that went directly to Cache).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Sequential Hits</em>' attribute.
	 * @see #setWriteSequentialHits(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteSequentialHits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteSequentialHits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteSequentialHits <em>Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Sequential Hits</em>' attribute.
	 * @see #getWriteSequentialHits()
	 * @generated
	 */
	void setWriteSequentialHits(Long value);

	/**
	 * Returns the value of the '<em><b>Write Sequential IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of all sequential writes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Sequential IOs</em>' attribute.
	 * @see #setWriteSequentialIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStorageStatisticalData_WriteSequentialIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteSequentialIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStorageStatisticalData#getWriteSequentialIOs <em>Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Sequential IOs</em>' attribute.
	 * @see #getWriteSequentialIOs()
	 * @generated
	 */
	void setWriteSequentialIOs(Long value);

} // CIM_BlockStorageStatisticalData
