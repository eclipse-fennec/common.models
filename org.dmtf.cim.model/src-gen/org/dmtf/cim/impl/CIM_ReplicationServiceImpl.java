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

import org.dmtf.cim.CIM_Collection;
import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_ConnectivityCollection;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_ReplicationEntity;
import org.dmtf.cim.CIM_ReplicationGroup;
import org.dmtf.cim.CIM_ReplicationService;
import org.dmtf.cim.CIM_ResourcePool;
import org.dmtf.cim.CIM_ServiceAccessPoint;
import org.dmtf.cim.CIM_SettingData;
import org.dmtf.cim.CIM_SettingsDefineState;
import org.dmtf.cim.CIM_SharedSecret;
import org.dmtf.cim.CIM_SynchronizationAspect;
import org.dmtf.cim.CIM_Synchronized;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replication Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_ReplicationServiceImpl extends CIM_ServiceImpl implements CIM_ReplicationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplicationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplicationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateGroup(String GroupName, EList<CIM_LogicalElement> Members, Boolean Persistent, Boolean DeleteOnEmptyElement, Boolean DeleteOnUnassociated, CIM_ServiceAccessPoint ServiceAccessPoint, CIM_ReplicationGroup ReplicationGroup, String ReplicationSettingData, Integer ReservedAs) {
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
	public Long DeleteGroup(CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, Boolean RemoveElements, String ReplicationSettingData) {
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
	public Long AddMembers(EList<CIM_LogicalElement> Members, CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, String ReplicationSettingData) {
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
	public Long RemoveMembers(EList<CIM_LogicalElement> Members, Boolean DeleteOnEmptyElement, CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, String ReplicationSettingData) {
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
	public Long CreateElementReplica(String ElementName, Integer SyncType, Integer Mode, CIM_LogicalElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, CIM_LogicalElement TargetElement, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections) {
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
	public Long CreateGroupReplica(String RelationshipName, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, CIM_LogicalElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ReplicationGroup TargetGroup, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections) {
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
	public Long CreateSynchronizationAspect(String Name, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, CIM_ManagedElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_SettingsDefineState SettingsState) {
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
	public Long ModifyReplicaSynchronization(Integer Operation, CIM_Synchronized Synchronization, String ReplicationSettingData, EList<CIM_Synchronized> SyncPair, CIM_ConcreteJob Job, CIM_SettingsDefineState SettingsState, Boolean Force, Integer WaitForCopyState, CIM_Synchronized UpdatedSynchronization) {
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
	public Long ModifyListSynchronization(Integer Operation, EList<CIM_Synchronized> Synchronization, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingsDefineState> SettingsState, Boolean Force, Integer WaitForCopyState, EList<CIM_Synchronized> UpdatedSynchronizations) {
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
	public Long ModifySettingsDefineState(Integer Operation, CIM_SettingsDefineState SettingsState, CIM_LogicalElement TargetElement, CIM_ReplicationGroup TargetGroup, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, CIM_Synchronized Synchronization, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, String ElementName, EList<CIM_Collection> Collections) {
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
	public Long GetAvailableTargetElements(CIM_LogicalElement SourceElement, Integer SyncType, Integer Mode, String ReplicationSettingData, CIM_ServiceAccessPoint TargetAccessPoint, CIM_SettingData TargetSettingGoal, EList<CIM_ResourcePool> TargetPools, CIM_ConcreteJob Job, EList<CIM_LogicalElement> Candidates, Integer MaxElementCount) {
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
	public Long GetPeerSystems(Integer Options, CIM_ConcreteJob Job, EList<CIM_ComputerSystem> Systems, EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints) {
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
	public Long GetReplicationRelationships(Integer Type, Integer SyncType, Integer Mode, Integer Locality, Integer CopyState, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, String ReplicationSettingData) {
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
	public Long GetServiceAccessPoints(CIM_ComputerSystem System, CIM_ConcreteJob Job, EList<CIM_ServiceAccessPoint> ServiceAccessPoints) {
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
	public Long AddReplicationEntity(String ReplicationEntity, Boolean Persistent, String InstanceNamespace, CIM_ReplicationEntity ReplicationEntityPath) {
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
	public Long AddServiceAccessPoint(String ServiceAccessPoint, String InstanceNamespace, CIM_ServiceAccessPoint ServiceAccessPointPath) {
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
	public Long AddSharedSecret(String SharedSecret, CIM_ServiceAccessPoint ServiceAccessPoint, String InstanceNamespace, CIM_SharedSecret SharedSecretPath) {
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
	public Long CreateListReplica(EList<String> ElementNames, Integer SyncType, Integer Mode, EList<CIM_LogicalElement> SourceElements, CIM_ServiceAccessPoint SourceAccessPoint, EList<CIM_LogicalElement> TargetElements, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, Integer Consistency, EList<CIM_Collection> Collections) {
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
	public Long CreateGroupReplicaFromElements(String RelationshipName, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, EList<CIM_LogicalElement> SourceElements, String SourceGroupName, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ReplicationGroup TargetGroup, String TargetGroupName, EList<CIM_LogicalElement> TargetElements, EList<String> TargetElementNames, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, EList<CIM_ResourcePool> TargetPools, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections) {
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
	public Long GetReplicationRelationshipInstances(Integer Type, Integer SyncType, Integer Mode, Integer Locality, Integer CopyState, CIM_ConcreteJob Job, EList<String> Synchronizations, String ReplicationSettingData) {
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
	public Long ModifyListSettingsDefineState(Integer Operation, EList<CIM_SettingsDefineState> SettingsStates, EList<CIM_LogicalElement> TargetElements, EList<CIM_ReplicationGroup> TargetGroups, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, EList<CIM_Synchronized> Synchronizations, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingData> TargetSettingGoals, EList<CIM_ResourcePool> TargetPools, Integer WaitForCopyState, EList<String> ElementNames, EList<CIM_Collection> Collections) {
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
	public Long AddToRemoteReplicationCollection(EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection) {
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
	public Long CreateRemoteReplicationCollection(String ElementName, EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, Boolean Active, Boolean DeleteOnUnassociated, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection, String ReplicationSettingData) {
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
	public Long RemoveFromRemoteReplicationCollection(EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection) {
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
	public Long AddElementsToGroupSynchronized(CIM_Synchronized Synchronized, EList<CIM_LogicalElement> SourceElements, EList<CIM_LogicalElement> TargetElements, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, Integer WaitForCopyState) {
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
	public Long ConfirmTargetData(CIM_Synchronized Synchronized, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection, String WaitTime) {
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
	public Long CreateGroupReplicaFromElementSynchronizations(String RelationshipName, EList<CIM_Synchronized> ElementSynchronizations, String SourceGroupName, CIM_ReplicationGroup SourceGroup, CIM_ServiceAccessPoint SourceAccessPoint, String TargetGroupName, CIM_ReplicationGroup TargetGroup, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized GroupSynchronization, Integer WaitForCopyState) {
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
	public Long GetSynchronizationAspectInstances(Integer SyncType, Integer Mode, Integer Locality, Integer SyncState, CIM_ConcreteJob Job, Boolean CachedData, String ReplicationSettingData, EList<String> SynchronizationAspects) {
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
	public Long GetSynchronizationAspects(Integer SyncType, Integer Mode, Integer Locality, Integer SyncState, CIM_ConcreteJob Job, Boolean CachedData, String ReplicationSettingData, EList<CIM_SynchronizationAspect> SynchronizationAspects) {
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
	public Long CreateListSynchronizationAspect(EList<String> Names, Integer SyncType, Integer Mode, EList<CIM_ManagedElement> SourceElements, CIM_ServiceAccessPoint SourceAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingsDefineState> SettingsStates) {
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
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_GROUP__STRING_ELIST_BOOLEAN_BOOLEAN_BOOLEAN_CIM_SERVICEACCESSPOINT_CIM_REPLICATIONGROUP_STRING_INTEGER:
				return CreateGroup((String)arguments.get(0), (EList<CIM_LogicalElement>)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3), (Boolean)arguments.get(4), (CIM_ServiceAccessPoint)arguments.get(5), (CIM_ReplicationGroup)arguments.get(6), (String)arguments.get(7), (Integer)arguments.get(8));
			case CimPackage.CIM_REPLICATION_SERVICE___DELETE_GROUP__CIM_REPLICATIONGROUP_CIM_SERVICEACCESSPOINT_BOOLEAN_STRING:
				return DeleteGroup((CIM_ReplicationGroup)arguments.get(0), (CIM_ServiceAccessPoint)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_MEMBERS__ELIST_CIM_REPLICATIONGROUP_CIM_SERVICEACCESSPOINT_STRING:
				return AddMembers((EList<CIM_LogicalElement>)arguments.get(0), (CIM_ReplicationGroup)arguments.get(1), (CIM_ServiceAccessPoint)arguments.get(2), (String)arguments.get(3));
			case CimPackage.CIM_REPLICATION_SERVICE___REMOVE_MEMBERS__ELIST_BOOLEAN_CIM_REPLICATIONGROUP_CIM_SERVICEACCESSPOINT_STRING:
				return RemoveMembers((EList<CIM_LogicalElement>)arguments.get(0), (Boolean)arguments.get(1), (CIM_ReplicationGroup)arguments.get(2), (CIM_ServiceAccessPoint)arguments.get(3), (String)arguments.get(4));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_ELEMENT_REPLICA__STRING_INTEGER_INTEGER_CIM_LOGICALELEMENT_CIM_SERVICEACCESSPOINT_CIM_LOGICALELEMENT_CIM_SERVICEACCESSPOINT_STRING_CIM_CONCRETEJOB_CIM_SYNCHRONIZED_CIM_SETTINGDATA_CIM_RESOURCEPOOL_INTEGER_CIM_CONNECTIVITYCOLLECTION_ELIST:
				return CreateElementReplica((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_LogicalElement)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (CIM_LogicalElement)arguments.get(5), (CIM_ServiceAccessPoint)arguments.get(6), (String)arguments.get(7), (CIM_ConcreteJob)arguments.get(8), (CIM_Synchronized)arguments.get(9), (CIM_SettingData)arguments.get(10), (CIM_ResourcePool)arguments.get(11), (Integer)arguments.get(12), (CIM_ConnectivityCollection)arguments.get(13), (EList<CIM_Collection>)arguments.get(14));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_GROUP_REPLICA__STRING_INTEGER_INTEGER_CIM_REPLICATIONGROUP_CIM_LOGICALELEMENT_CIM_SERVICEACCESSPOINT_CIM_REPLICATIONGROUP_LONG_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_CIM_SYNCHRONIZED_CIM_SETTINGDATA_CIM_RESOURCEPOOL_INTEGER_CIM_CONNECTIVITYCOLLECTION_ELIST:
				return CreateGroupReplica((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_ReplicationGroup)arguments.get(3), (CIM_LogicalElement)arguments.get(4), (CIM_ServiceAccessPoint)arguments.get(5), (CIM_ReplicationGroup)arguments.get(6), (Long)arguments.get(7), (CIM_ServiceAccessPoint)arguments.get(8), (Integer)arguments.get(9), (String)arguments.get(10), (CIM_ConcreteJob)arguments.get(11), (CIM_Synchronized)arguments.get(12), (CIM_SettingData)arguments.get(13), (CIM_ResourcePool)arguments.get(14), (Integer)arguments.get(15), (CIM_ConnectivityCollection)arguments.get(16), (EList<CIM_Collection>)arguments.get(17));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_SYNCHRONIZATION_ASPECT__STRING_INTEGER_INTEGER_CIM_REPLICATIONGROUP_CIM_MANAGEDELEMENT_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_CIM_SETTINGSDEFINESTATE:
				return CreateSynchronizationAspect((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_ReplicationGroup)arguments.get(3), (CIM_ManagedElement)arguments.get(4), (CIM_ServiceAccessPoint)arguments.get(5), (Integer)arguments.get(6), (String)arguments.get(7), (CIM_ConcreteJob)arguments.get(8), (CIM_SettingsDefineState)arguments.get(9));
			case CimPackage.CIM_REPLICATION_SERVICE___MODIFY_REPLICA_SYNCHRONIZATION__INTEGER_CIM_SYNCHRONIZED_STRING_ELIST_CIM_CONCRETEJOB_CIM_SETTINGSDEFINESTATE_BOOLEAN_INTEGER_CIM_SYNCHRONIZED:
				return ModifyReplicaSynchronization((Integer)arguments.get(0), (CIM_Synchronized)arguments.get(1), (String)arguments.get(2), (EList<CIM_Synchronized>)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (CIM_SettingsDefineState)arguments.get(5), (Boolean)arguments.get(6), (Integer)arguments.get(7), (CIM_Synchronized)arguments.get(8));
			case CimPackage.CIM_REPLICATION_SERVICE___MODIFY_LIST_SYNCHRONIZATION__INTEGER_ELIST_STRING_CIM_CONCRETEJOB_ELIST_BOOLEAN_INTEGER_ELIST:
				return ModifyListSynchronization((Integer)arguments.get(0), (EList<CIM_Synchronized>)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (EList<CIM_SettingsDefineState>)arguments.get(4), (Boolean)arguments.get(5), (Integer)arguments.get(6), (EList<CIM_Synchronized>)arguments.get(7));
			case CimPackage.CIM_REPLICATION_SERVICE___MODIFY_SETTINGS_DEFINE_STATE__INTEGER_CIM_SETTINGSDEFINESTATE_CIM_LOGICALELEMENT_CIM_REPLICATIONGROUP_LONG_CIM_SERVICEACCESSPOINT_CIM_SYNCHRONIZED_STRING_CIM_CONCRETEJOB_CIM_SETTINGDATA_CIM_RESOURCEPOOL_INTEGER_STRING_ELIST:
				return ModifySettingsDefineState((Integer)arguments.get(0), (CIM_SettingsDefineState)arguments.get(1), (CIM_LogicalElement)arguments.get(2), (CIM_ReplicationGroup)arguments.get(3), (Long)arguments.get(4), (CIM_ServiceAccessPoint)arguments.get(5), (CIM_Synchronized)arguments.get(6), (String)arguments.get(7), (CIM_ConcreteJob)arguments.get(8), (CIM_SettingData)arguments.get(9), (CIM_ResourcePool)arguments.get(10), (Integer)arguments.get(11), (String)arguments.get(12), (EList<CIM_Collection>)arguments.get(13));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_AVAILABLE_TARGET_ELEMENTS__CIM_LOGICALELEMENT_INTEGER_INTEGER_STRING_CIM_SERVICEACCESSPOINT_CIM_SETTINGDATA_ELIST_CIM_CONCRETEJOB_ELIST_INTEGER:
				return GetAvailableTargetElements((CIM_LogicalElement)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (CIM_SettingData)arguments.get(5), (EList<CIM_ResourcePool>)arguments.get(6), (CIM_ConcreteJob)arguments.get(7), (EList<CIM_LogicalElement>)arguments.get(8), (Integer)arguments.get(9));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_PEER_SYSTEMS__INTEGER_CIM_CONCRETEJOB_ELIST_ELIST_ELIST:
				return GetPeerSystems((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (EList<CIM_ComputerSystem>)arguments.get(2), (EList<CIM_ServiceAccessPoint>)arguments.get(3), (EList<CIM_ServiceAccessPoint>)arguments.get(4));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_REPLICATION_RELATIONSHIPS__INTEGER_INTEGER_INTEGER_INTEGER_INTEGER_CIM_CONCRETEJOB_ELIST_STRING:
				return GetReplicationRelationships((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (EList<CIM_Synchronized>)arguments.get(6), (String)arguments.get(7));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_SERVICE_ACCESS_POINTS__CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB_ELIST:
				return GetServiceAccessPoints((CIM_ComputerSystem)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (EList<CIM_ServiceAccessPoint>)arguments.get(2));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_REPLICATION_ENTITY__STRING_BOOLEAN_STRING_CIM_REPLICATIONENTITY:
				return AddReplicationEntity((String)arguments.get(0), (Boolean)arguments.get(1), (String)arguments.get(2), (CIM_ReplicationEntity)arguments.get(3));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_SERVICE_ACCESS_POINT__STRING_STRING_CIM_SERVICEACCESSPOINT:
				return AddServiceAccessPoint((String)arguments.get(0), (String)arguments.get(1), (CIM_ServiceAccessPoint)arguments.get(2));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_SHARED_SECRET__STRING_CIM_SERVICEACCESSPOINT_STRING_CIM_SHAREDSECRET:
				return AddSharedSecret((String)arguments.get(0), (CIM_ServiceAccessPoint)arguments.get(1), (String)arguments.get(2), (CIM_SharedSecret)arguments.get(3));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_LIST_REPLICA__ELIST_INTEGER_INTEGER_ELIST_CIM_SERVICEACCESSPOINT_ELIST_CIM_SERVICEACCESSPOINT_STRING_CIM_CONCRETEJOB_ELIST_CIM_SETTINGDATA_CIM_RESOURCEPOOL_INTEGER_CIM_CONNECTIVITYCOLLECTION_INTEGER_ELIST:
				return CreateListReplica((EList<String>)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (EList<CIM_LogicalElement>)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (EList<CIM_LogicalElement>)arguments.get(5), (CIM_ServiceAccessPoint)arguments.get(6), (String)arguments.get(7), (CIM_ConcreteJob)arguments.get(8), (EList<CIM_Synchronized>)arguments.get(9), (CIM_SettingData)arguments.get(10), (CIM_ResourcePool)arguments.get(11), (Integer)arguments.get(12), (CIM_ConnectivityCollection)arguments.get(13), (Integer)arguments.get(14), (EList<CIM_Collection>)arguments.get(15));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_GROUP_REPLICA_FROM_ELEMENTS__STRING_INTEGER_INTEGER_CIM_REPLICATIONGROUP_ELIST_STRING_CIM_SERVICEACCESSPOINT_CIM_REPLICATIONGROUP_STRING_ELIST_ELIST_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_CIM_SYNCHRONIZED_CIM_SETTINGDATA_CIM_RESOURCEPOOL_ELIST_INTEGER_CIM_CONNECTIVITYCOLLECTION_ELIST:
				return CreateGroupReplicaFromElements((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_ReplicationGroup)arguments.get(3), (EList<CIM_LogicalElement>)arguments.get(4), (String)arguments.get(5), (CIM_ServiceAccessPoint)arguments.get(6), (CIM_ReplicationGroup)arguments.get(7), (String)arguments.get(8), (EList<CIM_LogicalElement>)arguments.get(9), (EList<String>)arguments.get(10), (CIM_ServiceAccessPoint)arguments.get(11), (Integer)arguments.get(12), (String)arguments.get(13), (CIM_ConcreteJob)arguments.get(14), (CIM_Synchronized)arguments.get(15), (CIM_SettingData)arguments.get(16), (CIM_ResourcePool)arguments.get(17), (EList<CIM_ResourcePool>)arguments.get(18), (Integer)arguments.get(19), (CIM_ConnectivityCollection)arguments.get(20), (EList<CIM_Collection>)arguments.get(21));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_REPLICATION_RELATIONSHIP_INSTANCES__INTEGER_INTEGER_INTEGER_INTEGER_INTEGER_CIM_CONCRETEJOB_ELIST_STRING:
				return GetReplicationRelationshipInstances((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (EList<String>)arguments.get(6), (String)arguments.get(7));
			case CimPackage.CIM_REPLICATION_SERVICE___MODIFY_LIST_SETTINGS_DEFINE_STATE__INTEGER_ELIST_ELIST_ELIST_LONG_CIM_SERVICEACCESSPOINT_ELIST_STRING_CIM_CONCRETEJOB_ELIST_ELIST_INTEGER_ELIST_ELIST:
				return ModifyListSettingsDefineState((Integer)arguments.get(0), (EList<CIM_SettingsDefineState>)arguments.get(1), (EList<CIM_LogicalElement>)arguments.get(2), (EList<CIM_ReplicationGroup>)arguments.get(3), (Long)arguments.get(4), (CIM_ServiceAccessPoint)arguments.get(5), (EList<CIM_Synchronized>)arguments.get(6), (String)arguments.get(7), (CIM_ConcreteJob)arguments.get(8), (EList<CIM_SettingData>)arguments.get(9), (EList<CIM_ResourcePool>)arguments.get(10), (Integer)arguments.get(11), (EList<String>)arguments.get(12), (EList<CIM_Collection>)arguments.get(13));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_TO_REMOTE_REPLICATION_COLLECTION__ELIST_ELIST_CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB_CIM_CONNECTIVITYCOLLECTION:
				return AddToRemoteReplicationCollection((EList<CIM_ServiceAccessPoint>)arguments.get(0), (EList<CIM_ServiceAccessPoint>)arguments.get(1), (CIM_ComputerSystem)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_ConnectivityCollection)arguments.get(4));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_REMOTE_REPLICATION_COLLECTION__STRING_ELIST_ELIST_CIM_COMPUTERSYSTEM_BOOLEAN_BOOLEAN_CIM_CONCRETEJOB_CIM_CONNECTIVITYCOLLECTION_STRING:
				return CreateRemoteReplicationCollection((String)arguments.get(0), (EList<CIM_ServiceAccessPoint>)arguments.get(1), (EList<CIM_ServiceAccessPoint>)arguments.get(2), (CIM_ComputerSystem)arguments.get(3), (Boolean)arguments.get(4), (Boolean)arguments.get(5), (CIM_ConcreteJob)arguments.get(6), (CIM_ConnectivityCollection)arguments.get(7), (String)arguments.get(8));
			case CimPackage.CIM_REPLICATION_SERVICE___REMOVE_FROM_REMOTE_REPLICATION_COLLECTION__ELIST_ELIST_CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB_CIM_CONNECTIVITYCOLLECTION:
				return RemoveFromRemoteReplicationCollection((EList<CIM_ServiceAccessPoint>)arguments.get(0), (EList<CIM_ServiceAccessPoint>)arguments.get(1), (CIM_ComputerSystem)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_ConnectivityCollection)arguments.get(4));
			case CimPackage.CIM_REPLICATION_SERVICE___ADD_ELEMENTS_TO_GROUP_SYNCHRONIZED__CIM_SYNCHRONIZED_ELIST_ELIST_CIM_SERVICEACCESSPOINT_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_ELIST_INTEGER:
				return AddElementsToGroupSynchronized((CIM_Synchronized)arguments.get(0), (EList<CIM_LogicalElement>)arguments.get(1), (EList<CIM_LogicalElement>)arguments.get(2), (CIM_ServiceAccessPoint)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (CIM_ConcreteJob)arguments.get(7), (EList<CIM_Synchronized>)arguments.get(8), (Integer)arguments.get(9));
			case CimPackage.CIM_REPLICATION_SERVICE___CONFIRM_TARGET_DATA__CIM_SYNCHRONIZED_CIM_SERVICEACCESSPOINT_CIM_SERVICEACCESSPOINT_STRING_CIM_CONCRETEJOB_CIM_CONNECTIVITYCOLLECTION_STRING:
				return ConfirmTargetData((CIM_Synchronized)arguments.get(0), (CIM_ServiceAccessPoint)arguments.get(1), (CIM_ServiceAccessPoint)arguments.get(2), (String)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (CIM_ConnectivityCollection)arguments.get(5), (String)arguments.get(6));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_GROUP_REPLICA_FROM_ELEMENT_SYNCHRONIZATIONS__STRING_ELIST_STRING_CIM_REPLICATIONGROUP_CIM_SERVICEACCESSPOINT_STRING_CIM_REPLICATIONGROUP_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_CIM_SYNCHRONIZED_INTEGER:
				return CreateGroupReplicaFromElementSynchronizations((String)arguments.get(0), (EList<CIM_Synchronized>)arguments.get(1), (String)arguments.get(2), (CIM_ReplicationGroup)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (String)arguments.get(5), (CIM_ReplicationGroup)arguments.get(6), (CIM_ServiceAccessPoint)arguments.get(7), (Integer)arguments.get(8), (String)arguments.get(9), (CIM_ConcreteJob)arguments.get(10), (CIM_Synchronized)arguments.get(11), (Integer)arguments.get(12));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_SYNCHRONIZATION_ASPECT_INSTANCES__INTEGER_INTEGER_INTEGER_INTEGER_CIM_CONCRETEJOB_BOOLEAN_STRING_ELIST:
				return GetSynchronizationAspectInstances((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (Boolean)arguments.get(5), (String)arguments.get(6), (EList<String>)arguments.get(7));
			case CimPackage.CIM_REPLICATION_SERVICE___GET_SYNCHRONIZATION_ASPECTS__INTEGER_INTEGER_INTEGER_INTEGER_CIM_CONCRETEJOB_BOOLEAN_STRING_ELIST:
				return GetSynchronizationAspects((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (Boolean)arguments.get(5), (String)arguments.get(6), (EList<CIM_SynchronizationAspect>)arguments.get(7));
			case CimPackage.CIM_REPLICATION_SERVICE___CREATE_LIST_SYNCHRONIZATION_ASPECT__ELIST_INTEGER_INTEGER_ELIST_CIM_SERVICEACCESSPOINT_INTEGER_STRING_CIM_CONCRETEJOB_ELIST:
				return CreateListSynchronizationAspect((EList<String>)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (EList<CIM_ManagedElement>)arguments.get(3), (CIM_ServiceAccessPoint)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (CIM_ConcreteJob)arguments.get(7), (EList<CIM_SettingsDefineState>)arguments.get(8));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_ReplicationServiceImpl
