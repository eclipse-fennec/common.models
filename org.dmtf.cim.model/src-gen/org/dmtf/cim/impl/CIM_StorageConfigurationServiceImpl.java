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
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CIM_Memory;
import org.dmtf.cim.CIM_NetworkPipe;
import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CIM_SCSIProtocolEndpoint;
import org.dmtf.cim.CIM_SettingData;
import org.dmtf.cim.CIM_StorageConfigurationService;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CIM_StorageSynchronized;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_StorageConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_StorageConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateOrModifyStoragePool(String ElementName, CIM_ConcreteJob Job, CIM_StorageSetting Goal, Long Size, EList<String> InPools, EList<String> InExtents, CIM_StoragePool Pool) {
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
	public Long CreateOrModifyElementFromStoragePool(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, Long Size, CIM_StoragePool InPool, CIM_LogicalElement TheElement) {
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
	public Long DeleteStoragePool(CIM_ConcreteJob Job, CIM_StoragePool Pool) {
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
	public Long ReturnToStoragePool(CIM_ConcreteJob Job, CIM_LogicalElement TheElement) {
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
	public Long CreateReplica(String ElementName, CIM_ConcreteJob Job, CIM_LogicalElement SourceElement, CIM_LogicalElement TargetElement, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool, Integer CopyType) {
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
	public Long ModifySynchronization(Integer Operation, CIM_ConcreteJob Job, CIM_StorageSynchronized Synchronization) {
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
	public Long AttachReplica(CIM_ConcreteJob Job, CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, Integer CopyType) {
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
	public Long CreateOrModifyElementFromElements(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, Long Size, EList<CIM_StorageExtent> InElements, CIM_LogicalElement TheElement) {
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
	public Long AssignStorageResourceAffinity(Integer ResourceType, CIM_ConcreteJob Job, CIM_ComputerSystem StorageProcessor, EList<CIM_LogicalElement> StorageResources) {
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
	public Long AttachOrModifyReplica(CIM_ConcreteJob Job, CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, Integer CopyType, String Goal, CIM_NetworkPipe ReplicationPipe) {
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
	public Long CreateElementsFromStoragePools(EList<String> ElementNames, Integer ElementType, Long ElementCount, CIM_ConcreteJob Job, CIM_SettingData Goal, Long Size, EList<CIM_StoragePool> InPools, EList<CIM_LogicalElement> TheElements) {
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
	public Long CreateOrModifyReplicationPipe(String PipeElementName, CIM_ComputerSystem SourceSystem, CIM_ComputerSystem TargetSystem, EList<CIM_ProtocolEndpoint> SourceEndpoint, EList<CIM_ProtocolEndpoint> TargetEndpoint, String Goal, CIM_NetworkPipe ReplicationPipe) {
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
	public Long CreateReplicationBuffer(CIM_ConcreteJob Job, CIM_ManagedElement Host, CIM_StorageExtent TargetElement, CIM_StoragePool TargetPool, CIM_Memory ReplicaBuffer) {
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
	public Long GetAvailableTargetElements(CIM_LogicalElement SourceElement, EList<CIM_StoragePool> TargetPool, Integer CopyType, EList<CIM_LogicalElement> Candidates) {
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
	public Long GetElementsBasedOnUsage(Integer ElementType, Integer Usage, Integer Criteria, CIM_StoragePool ThePool, EList<CIM_ManagedSystemElement> TheElements) {
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
	public Long RequestUsageChange(Integer Operation, Integer UsageValue, String OtherUsageDescription, CIM_ConcreteJob Job, CIM_LogicalElement TheElement) {
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
	public Long ReturnElementsToStoragePool(Integer Options, CIM_ConcreteJob Job, EList<CIM_LogicalElement> TheElements) {
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
	public Long ScsiScan(CIM_ConcreteJob Job, Integer ConnectionType, String OtherConnectionType, EList<CIM_SCSIProtocolEndpoint> Initiators, EList<String> Targets, EList<String> LogicalUnits) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_OR_MODIFY_STORAGE_POOL__STRING_CIM_CONCRETEJOB_CIM_STORAGESETTING_LONG_ELIST_ELIST_CIM_STORAGEPOOL:
				return CreateOrModifyStoragePool((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (Long)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5), (CIM_StoragePool)arguments.get(6));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_OR_MODIFY_ELEMENT_FROM_STORAGE_POOL__STRING_INTEGER_CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_LONG_CIM_STORAGEPOOL_CIM_LOGICALELEMENT:
				return CreateOrModifyElementFromStoragePool((String)arguments.get(0), (Integer)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (Long)arguments.get(4), (CIM_StoragePool)arguments.get(5), (CIM_LogicalElement)arguments.get(6));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___DELETE_STORAGE_POOL__CIM_CONCRETEJOB_CIM_STORAGEPOOL:
				return DeleteStoragePool((CIM_ConcreteJob)arguments.get(0), (CIM_StoragePool)arguments.get(1));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___RETURN_TO_STORAGE_POOL__CIM_CONCRETEJOB_CIM_LOGICALELEMENT:
				return ReturnToStoragePool((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_REPLICA__STRING_CIM_CONCRETEJOB_CIM_LOGICALELEMENT_CIM_LOGICALELEMENT_CIM_STORAGESETTING_CIM_STORAGEPOOL_INTEGER:
				return CreateReplica((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_LogicalElement)arguments.get(2), (CIM_LogicalElement)arguments.get(3), (CIM_StorageSetting)arguments.get(4), (CIM_StoragePool)arguments.get(5), (Integer)arguments.get(6));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___MODIFY_SYNCHRONIZATION__INTEGER_CIM_CONCRETEJOB_CIM_STORAGESYNCHRONIZED:
				return ModifySynchronization((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSynchronized)arguments.get(2));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___ATTACH_REPLICA__CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_CIM_MANAGEDELEMENT_INTEGER:
				return AttachReplica((CIM_ConcreteJob)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (Integer)arguments.get(3));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_OR_MODIFY_ELEMENT_FROM_ELEMENTS__STRING_INTEGER_CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_LONG_ELIST_CIM_LOGICALELEMENT:
				return CreateOrModifyElementFromElements((String)arguments.get(0), (Integer)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (Long)arguments.get(4), (EList<CIM_StorageExtent>)arguments.get(5), (CIM_LogicalElement)arguments.get(6));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___ASSIGN_STORAGE_RESOURCE_AFFINITY__INTEGER_CIM_CONCRETEJOB_CIM_COMPUTERSYSTEM_ELIST:
				return AssignStorageResourceAffinity((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_ComputerSystem)arguments.get(2), (EList<CIM_LogicalElement>)arguments.get(3));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___ATTACH_OR_MODIFY_REPLICA__CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_CIM_MANAGEDELEMENT_INTEGER_STRING_CIM_NETWORKPIPE:
				return AttachOrModifyReplica((CIM_ConcreteJob)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (CIM_NetworkPipe)arguments.get(5));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_ELEMENTS_FROM_STORAGE_POOLS__ELIST_INTEGER_LONG_CIM_CONCRETEJOB_CIM_SETTINGDATA_LONG_ELIST_ELIST:
				return CreateElementsFromStoragePools((EList<String>)arguments.get(0), (Integer)arguments.get(1), (Long)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_SettingData)arguments.get(4), (Long)arguments.get(5), (EList<CIM_StoragePool>)arguments.get(6), (EList<CIM_LogicalElement>)arguments.get(7));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_OR_MODIFY_REPLICATION_PIPE__STRING_CIM_COMPUTERSYSTEM_CIM_COMPUTERSYSTEM_ELIST_ELIST_STRING_CIM_NETWORKPIPE:
				return CreateOrModifyReplicationPipe((String)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (CIM_ComputerSystem)arguments.get(2), (EList<CIM_ProtocolEndpoint>)arguments.get(3), (EList<CIM_ProtocolEndpoint>)arguments.get(4), (String)arguments.get(5), (CIM_NetworkPipe)arguments.get(6));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___CREATE_REPLICATION_BUFFER__CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_CIM_STORAGEEXTENT_CIM_STORAGEPOOL_CIM_MEMORY:
				return CreateReplicationBuffer((CIM_ConcreteJob)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_StorageExtent)arguments.get(2), (CIM_StoragePool)arguments.get(3), (CIM_Memory)arguments.get(4));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___GET_AVAILABLE_TARGET_ELEMENTS__CIM_LOGICALELEMENT_ELIST_INTEGER_ELIST:
				return GetAvailableTargetElements((CIM_LogicalElement)arguments.get(0), (EList<CIM_StoragePool>)arguments.get(1), (Integer)arguments.get(2), (EList<CIM_LogicalElement>)arguments.get(3));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___GET_ELEMENTS_BASED_ON_USAGE__INTEGER_INTEGER_INTEGER_CIM_STORAGEPOOL_ELIST:
				return GetElementsBasedOnUsage((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_StoragePool)arguments.get(3), (EList<CIM_ManagedSystemElement>)arguments.get(4));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___REQUEST_USAGE_CHANGE__INTEGER_INTEGER_STRING_CIM_CONCRETEJOB_CIM_LOGICALELEMENT:
				return RequestUsageChange((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_LogicalElement)arguments.get(4));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___RETURN_ELEMENTS_TO_STORAGE_POOL__INTEGER_CIM_CONCRETEJOB_ELIST:
				return ReturnElementsToStoragePool((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (EList<CIM_LogicalElement>)arguments.get(2));
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE___SCSI_SCAN__CIM_CONCRETEJOB_INTEGER_STRING_ELIST_ELIST_ELIST:
				return ScsiScan((CIM_ConcreteJob)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<CIM_SCSIProtocolEndpoint>)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_StorageConfigurationServiceImpl
