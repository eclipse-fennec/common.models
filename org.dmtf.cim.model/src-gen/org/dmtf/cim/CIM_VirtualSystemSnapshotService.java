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
 * A representation of the model object '<em><b>CIM Virtual System Snapshot Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Service to create, apply and destroy snapshots of virtual systems.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.40.0' UMLPackagePath='CIM::Core::Virtualization' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemSnapshotService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a snapshot of a virtual system.
	 * @param AffectedSystem Reference to the affected virtual system.
	 * @param SnapshotSettings Parameter settings.
	 * @param SnapshotType
	 *   Requested snapshot type:
	 *   Full Snapshot: Complete snapshot of the virtual system.
	 *   Disk Snapshot: Snapshot of virtual system disks.
	 * @param ResultingSnapshot Resulting virtual system snapshot
	 * @param Job If the operation is long running, then optionally a job may be returned. In this case, the instance of the CIM_VirtualSystemSettingData class representing the new virtual system snapshot is presented via the CIM_AffectedJobElement association with the value of the AffectedElement property referring to the new instance of the CIM_VirtualSystemSettingData class representing the virtual system snapshot and and the value of the ElementEffects set to 5 (Create).
	 * <!-- end-model-doc -->
	 * @model AffectedSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" SnapshotSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_SettingData'" SnapshotTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Full Snapshot\",\"Disk Snapshot\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_VirtualSystemSnapshotCapabilities.SnapshotTypesEnabled\",\"CIM_VirtualSystemSnapshotServiceCapabilities.SnapshotTypesSupported\"]'" ResultingSnapshotAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualSystemSettingData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"Invalid Type\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateSnapshot(CIM_ComputerSystem AffectedSystem, String SnapshotSettings, Integer SnapshotType, CIM_VirtualSystemSettingData ResultingSnapshot, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destroy an existing virtual system snapshot.This method may as a side effect destroy other snapshots that are dependent on the affected snapshot.
	 * @param AffectedSnapshot Reference to the affected virtual system snapshot.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model AffectedSnapshotAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualSystemSettingData REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"Invalid Type\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DestroySnapshot(CIM_VirtualSystemSettingData AffectedSnapshot, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply a virtual system snapshot to the virtual system that it was created from.
	 * @param Snapshot Reference to the virtual system snapshot.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model SnapshotAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_VirtualSystemSettingData REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Timeout\",\"Invalid Parameter\",\"Invalid State\",\"Invalid Type\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ApplySnapshot(CIM_VirtualSystemSettingData Snapshot, CIM_ConcreteJob Job);

} // CIM_VirtualSystemSnapshotService
