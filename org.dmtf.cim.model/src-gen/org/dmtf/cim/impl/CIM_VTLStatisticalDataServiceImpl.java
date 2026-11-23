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
package org.dmtf.cim.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_LogicalPort;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_TapeDrive;
import org.dmtf.cim.CIM_VTLStatisticalData;
import org.dmtf.cim.CIM_VTLStatisticalDataService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VTL Statistical Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_VTLStatisticalDataServiceImpl extends CIM_ServiceImpl implements CIM_VTLStatisticalDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VTLStatisticalDataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VTLStatisticalDataService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetPhysicalCapacityUsage(Integer DataFormat, CIM_StoragePool Pool, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ComputerSystem Library, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetLogicalCapacityUsage(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ComputerSystem Library, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetSystemRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetDeduplicationRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetReplicationThroughput(Integer DataFormat, Integer DataDirection, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetReplicationRatio(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetPerformanceStatisticsReadWriteIO(Integer DataFormat, CIM_ComputerSystem Library, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_TapeDrive tapeDrive, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetFCPortStatisticsSRR(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_LogicalPort port, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer GetFCPortStatisticsAborts(Integer DataFormat, String StartTime, Long Duration, String EndTime, CIM_VTLStatisticalData Data, CIM_LogicalPort port, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_PHYSICAL_CAPACITY_USAGE__INTEGER_CIM_STORAGEPOOL_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB:
				return GetPhysicalCapacityUsage((Integer)arguments.get(0), (CIM_StoragePool)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (String)arguments.get(4), (CIM_VTLStatisticalData)arguments.get(5), (CIM_ComputerSystem)arguments.get(6), (CIM_ConcreteJob)arguments.get(7));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_LOGICAL_CAPACITY_USAGE__INTEGER_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB:
				return GetLogicalCapacityUsage((Integer)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (String)arguments.get(3), (CIM_VTLStatisticalData)arguments.get(4), (CIM_ComputerSystem)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_SYSTEM_RATIO__INTEGER_CIM_COMPUTERSYSTEM_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_CONCRETEJOB:
				return GetSystemRatio((Integer)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (String)arguments.get(4), (CIM_VTLStatisticalData)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_DEDUPLICATION_RATIO__INTEGER_CIM_COMPUTERSYSTEM_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_CONCRETEJOB:
				return GetDeduplicationRatio((Integer)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (String)arguments.get(4), (CIM_VTLStatisticalData)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_REPLICATION_THROUGHPUT__INTEGER_INTEGER_CIM_COMPUTERSYSTEM_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_CONCRETEJOB:
				return GetReplicationThroughput((Integer)arguments.get(0), (Integer)arguments.get(1), (CIM_ComputerSystem)arguments.get(2), (String)arguments.get(3), (Long)arguments.get(4), (String)arguments.get(5), (CIM_VTLStatisticalData)arguments.get(6), (CIM_ConcreteJob)arguments.get(7));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_REPLICATION_RATIO__INTEGER_CIM_COMPUTERSYSTEM_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_CONCRETEJOB:
				return GetReplicationRatio((Integer)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (String)arguments.get(4), (CIM_VTLStatisticalData)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_PERFORMANCE_STATISTICS_READ_WRITE_IO__INTEGER_CIM_COMPUTERSYSTEM_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_TAPEDRIVE_CIM_CONCRETEJOB:
				return GetPerformanceStatisticsReadWriteIO((Integer)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (String)arguments.get(2), (Long)arguments.get(3), (String)arguments.get(4), (CIM_VTLStatisticalData)arguments.get(5), (CIM_TapeDrive)arguments.get(6), (CIM_ConcreteJob)arguments.get(7));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_FC_PORT_STATISTICS_SRR__INTEGER_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_LOGICALPORT_CIM_CONCRETEJOB:
				return GetFCPortStatisticsSRR((Integer)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (String)arguments.get(3), (CIM_VTLStatisticalData)arguments.get(4), (CIM_LogicalPort)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE___GET_FC_PORT_STATISTICS_ABORTS__INTEGER_STRING_LONG_STRING_CIM_VTLSTATISTICALDATA_CIM_LOGICALPORT_CIM_CONCRETEJOB:
				return GetFCPortStatisticsAborts((Integer)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (String)arguments.get(3), (CIM_VTLStatisticalData)arguments.get(4), (CIM_LogicalPort)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_VTLStatisticalDataServiceImpl
