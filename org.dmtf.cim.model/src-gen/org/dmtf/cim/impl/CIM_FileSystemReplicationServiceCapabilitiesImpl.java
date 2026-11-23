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

import java.util.Collection;

import org.dmtf.cim.CIM_FileSystemReplicationServiceCapabilities;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_ServiceAccessPoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Replication Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemReplicationServiceCapabilitiesImpl#getSupportedReplicationTypes <em>Supported Replication Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemReplicationServiceCapabilitiesImpl#getSupportedStorageObjects <em>Supported Storage Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemReplicationServiceCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemReplicationServiceCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemReplicationServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileSystemReplicationServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedReplicationTypes() <em>Supported Replication Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedReplicationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedReplicationTypes;

	/**
	 * The cached value of the '{@link #getSupportedStorageObjects() <em>Supported Storage Objects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageObjects;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemReplicationServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemReplicationServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedReplicationTypes() {
		if (supportedReplicationTypes == null) {
			supportedReplicationTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_REPLICATION_TYPES);
		}
		return supportedReplicationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageObjects() {
		if (supportedStorageObjects == null) {
			supportedStorageObjects = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS);
		}
		return supportedStorageObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ConvertSyncTypeToReplicationType(Integer SyncType, Integer Mode, Integer LocalOrRemote, Integer SupportedReplicationTypes) {
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
	public Long ConvertReplicationTypeToSyncType(Integer ReplicationType, Integer SyncType, Integer Mode, Integer LocalOrRemote) {
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
	public Long GetSupportedCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates, EList<Boolean> HostAccessible) {
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
	public Long GetSupportedGroupCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates) {
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
	public Long GetSupportedWaitForCopyStates(Integer ReplicationType, Integer MethodName, EList<Integer> SupportedCopyStates) {
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
	public Long GetSupportedFeatures(Integer ReplicationType, EList<Integer> Features) {
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
	public Long GetSupportedGroupFeatures(Integer ReplicationType, EList<Integer> GroupFeatures) {
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
	public Long GetSupportedConsistency(Integer ReplicationType, EList<Integer> SupportedConsistency) {
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
	public Long GetSupportedOperations(Integer ReplicationType, EList<Integer> SupportedOperations) {
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
	public Long GetSupportedGroupOperations(Integer ReplicationType, EList<Integer> SupportedGroupOperations) {
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
	public Long GetSupportedListOperations(Integer ReplicationType, Integer SynchronizationType, EList<Integer> SupportedListOperations) {
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
	public Long GetSupportedSettingsDefineStateOperations(Integer ReplicationType, EList<Integer> SupportedOperations) {
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
	public Long GetSupportedThinProvisioningFeatures(Integer ReplicationType, EList<Integer> SupportedThinProvisioningFeatures) {
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
	public Long GetSupportedMaximum(Integer ReplicationType, Integer Component, Integer MaxValue) {
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
	public Long GetDefaultConsistency(Integer ReplicationType, Integer DefaultConsistency) {
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
	public Long GetDefaultGroupPersistency(Integer DefaultGroupPersistency) {
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
	public Long GetSupportedReplicationSettingData(Integer ReplicationType, Integer PropertyName, EList<Long> SupportedValues) {
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
	public Long GetDefaultReplicationSettingData(Integer ReplicationType, String DefaultInstance) {
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
	public Long GetSupportedConnectionFeatures(CIM_ServiceAccessPoint connection, EList<Integer> SupportedConnectionFeatures) {
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
	public Long GetSynchronizationSupported(CIM_ManagedElement LocalElement, CIM_ManagedElement OtherElement, CIM_ServiceAccessPoint OtherElementAccessPoint, Integer MethodName, String ReplicationSettingData, EList<Integer> SyncTypes, EList<Integer> Modes, EList<Integer> LocalElementRole) {
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
	public Long GetSupportedStorageCompressionFeatures(Integer ReplicationType, EList<Integer> SupportedStorageCompressionFeatures) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_REPLICATION_TYPES:
				return getSupportedReplicationTypes();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				return getSupportedStorageObjects();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_REPLICATION_TYPES:
				getSupportedReplicationTypes().clear();
				getSupportedReplicationTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				getSupportedStorageObjects().clear();
				getSupportedStorageObjects().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_REPLICATION_TYPES:
				getSupportedReplicationTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				getSupportedStorageObjects().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_REPLICATION_TYPES:
				return supportedReplicationTypes != null && !supportedReplicationTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_STORAGE_OBJECTS:
				return supportedStorageObjects != null && !supportedStorageObjects.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___CONVERT_SYNC_TYPE_TO_REPLICATION_TYPE__INTEGER_INTEGER_INTEGER_INTEGER:
				return ConvertSyncTypeToReplicationType((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___CONVERT_REPLICATION_TYPE_TO_SYNC_TYPE__INTEGER_INTEGER_INTEGER_INTEGER:
				return ConvertReplicationTypeToSyncType((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_COPY_STATES__INTEGER_ELIST_ELIST:
				return GetSupportedCopyStates((Integer)arguments.get(0), (EList<Integer>)arguments.get(1), (EList<Boolean>)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_GROUP_COPY_STATES__INTEGER_ELIST:
				return GetSupportedGroupCopyStates((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_WAIT_FOR_COPY_STATES__INTEGER_INTEGER_ELIST:
				return GetSupportedWaitForCopyStates((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<Integer>)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_FEATURES__INTEGER_ELIST:
				return GetSupportedFeatures((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_GROUP_FEATURES__INTEGER_ELIST:
				return GetSupportedGroupFeatures((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_CONSISTENCY__INTEGER_ELIST:
				return GetSupportedConsistency((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_OPERATIONS__INTEGER_ELIST:
				return GetSupportedOperations((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_GROUP_OPERATIONS__INTEGER_ELIST:
				return GetSupportedGroupOperations((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_LIST_OPERATIONS__INTEGER_INTEGER_ELIST:
				return GetSupportedListOperations((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<Integer>)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_SETTINGS_DEFINE_STATE_OPERATIONS__INTEGER_ELIST:
				return GetSupportedSettingsDefineStateOperations((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_THIN_PROVISIONING_FEATURES__INTEGER_ELIST:
				return GetSupportedThinProvisioningFeatures((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_MAXIMUM__INTEGER_INTEGER_INTEGER:
				return GetSupportedMaximum((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_DEFAULT_CONSISTENCY__INTEGER_INTEGER:
				return GetDefaultConsistency((Integer)arguments.get(0), (Integer)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_DEFAULT_GROUP_PERSISTENCY__INTEGER:
				return GetDefaultGroupPersistency((Integer)arguments.get(0));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_REPLICATION_SETTING_DATA__INTEGER_INTEGER_ELIST:
				return GetSupportedReplicationSettingData((Integer)arguments.get(0), (Integer)arguments.get(1), (EList<Long>)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_DEFAULT_REPLICATION_SETTING_DATA__INTEGER_STRING:
				return GetDefaultReplicationSettingData((Integer)arguments.get(0), (String)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_CONNECTION_FEATURES__CIM_SERVICEACCESSPOINT_ELIST:
				return GetSupportedConnectionFeatures((CIM_ServiceAccessPoint)arguments.get(0), (EList<Integer>)arguments.get(1));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SYNCHRONIZATION_SUPPORTED__CIM_MANAGEDELEMENT_CIM_MANAGEDELEMENT_CIM_SERVICEACCESSPOINT_INTEGER_STRING_ELIST_ELIST_ELIST:
				return GetSynchronizationSupported((CIM_ManagedElement)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_ServiceAccessPoint)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (EList<Integer>)arguments.get(5), (EList<Integer>)arguments.get(6), (EList<Integer>)arguments.get(7));
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES___GET_SUPPORTED_STORAGE_COMPRESSION_FEATURES__INTEGER_ELIST:
				return GetSupportedStorageCompressionFeatures((Integer)arguments.get(0), (EList<Integer>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SupportedReplicationTypes: ");
		result.append(supportedReplicationTypes);
		result.append(", SupportedStorageObjects: ");
		result.append(supportedStorageObjects);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemReplicationServiceCapabilitiesImpl
