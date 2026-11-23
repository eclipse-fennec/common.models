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
 * A representation of the model object '<em><b>CIM VTL Statistical Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VTLStatisticalDataService class provides Historical Resource Usage Service. This class has set of functions to collect historical values for Front-end port performance, Physical disk usage, Logical backup data, Overall system compression ratio, Deduplication efficiency and Replication traffic. All the functions returns graph object Data point history of specified resource.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VTLStatisticalDataService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VTLStatisticalDataService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetPhysicalCapacityUsage Provides capacity on a per storage pool and virtual library basis. If the primordial pool is used, data is returned for all pools. If the VLS Computer System is used, capacity is returned for the entire appliance.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param Pool Reference to the storage pool, concrete or primordial
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Library Reference to a VTL or the VLS
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetPhysicalCapacityUsage(Integer DataFormat, CIM_StoragePool Pool, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ComputerSystem Library, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetLogicalCapacityUsage Provides logical capacity usage for the entire VLS appliance or a specific VTL depending on the ComputerSystem reference passed in.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Library Reference to a VTL or the VLS
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetLogicalCapacityUsage(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ComputerSystem Library, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetSystemRatio Provides an historic of the compression ratio for the entire VLS appliance or a specific VTL depending on on the ComputerSystem reference passed in.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param Library Reference to a VTL or the VLS
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetSystemRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetDeduplicationRatio(CIM_ComputerSystem REF): Provides an historicof the deduplication ratio for the entire VLS appliance or a specificVTL depending on on the ComputerSystem reference passed in.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param Library Reference to a VTL or the VLS
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetDeduplicationRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetReplicationThroughput provides a historic ofthe incoming or outgoing replication throughput in MB/s.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param DataDirection Indicates incoming or outgoing traffic
	 * @param Library Reference to a VTL or the VLS
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" DataDirectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"..\",\"32768..65535\"]' Values='[\"In Traffic\",\"Out Traffic\",\"DMTF Reserved\",\"Vendor Specific\"]'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetReplicationThroughput(Integer DataFormat, Integer DataDirection, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetReplicationRatio provides a historic of the deduplication ratio over the replication link.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param Library Reference to a VTL or the VLS
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetReplicationRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetPerformanceStatisticsReadWriteIO gives the front-end port performance.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param Library Reference to a VTL or the VLS
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param tapeDrive Reference to the Tape Drive for which the performance data is requested,if null performance stastics for the Virtual Library will be returned
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" LibraryAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" tapeDriveAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_TapeDrive REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetPerformanceStatisticsReadWriteIO(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_TapeDrive tapeDrive, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetFCPortStatisticsSRR provides the Sequence RetransmissionRequest performance statistics of a FC Port in a VLS.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param port Port for which the Aborts metric is requested
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" portAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalPort REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetFCPortStatisticsSRR(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_LogicalPort port, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetFCPortStatisticsAborts provides the abort statistics of a FC Port in a VLS.
	 * At least one of StartTime, EndTime, and Duration must be specified.
	 * - If all three are specified, then Duration is ignored.
	 * - StartTime shall not be higher than EndTime.
	 * - No time may be set in the future.
	 * - If two of the three are specified, then the third is calculated.
	 * - If only StartTime or Duration is specified, then EndTime will be set to the current time.
	 * - If only EndTime is specified, then StartTime will be set to the time the earliest data is available.
	 * @param DataFormat Specifies the format of the 'Data' output parameter
	 * @param StartTime Specifies the start time for when the data is required. If only StartTime is specified, then EndTime shall be set to current time.
	 * @param Duration Specifies the duration in seconds to generate statistical data. If only Duration is specified, then EndTime will be set to current time.
	 * @param EndTime
	 *   Specifies the end time up to which the statistical data will be generated. Current time will be assumed whenever EndTime is specified null.
	 *   If only EndTime is specified, then StartTime will be set to the earliest time that data is available.
	 * @param Data Graph Object
	 * @param port Port for which the Aborts metric is requested
	 * @param Job Reference to the job (null if synchronous call)
	 * <!-- end-model-doc -->
	 * @model DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\"]' Values='[\"CSV\"]'" StartTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'" DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VTLStatisticalData REF' In='false' Out='true'" portAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalPort REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Statistics Format Not Supported\",\"Method Reserved\",\"Method Parameters Checked - Job Started\"]'"
	 * @generated
	 */
	Integer GetFCPortStatisticsAborts(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_LogicalPort port, CIM_ConcreteJob Job);

} // CIM_VTLStatisticalDataService
