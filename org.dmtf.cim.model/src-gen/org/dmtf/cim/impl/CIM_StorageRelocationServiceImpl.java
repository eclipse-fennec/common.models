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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_LogicalDisk;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_StorageRelocationService;
import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CIM_StorageVolume;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Relocation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_StorageRelocationServiceImpl extends CIM_ServiceImpl implements CIM_StorageRelocationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageRelocationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageRelocationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RelocateStorageVolumesToStoragePool(EList<CIM_StorageVolume> TheElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool) {
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
	public Long RelocateStoragePoolsToStoragePool(EList<CIM_StoragePool> TheElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool) {
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
	public Long RelocateStorageVolumeToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StorageVolume TheElement) {
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
	public Long RelocateStoragePoolToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TheElement) {
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
	public Long RelocateLogicalDiskToStorageExtents(EList<CIM_StorageExtent> InElements, CIM_ConcreteJob Job, CIM_StorageSetting TargetSettingGoal, CIM_LogicalDisk TheElement) {
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
	public Long GetAvailableTargetRelocationExtents(CIM_LogicalElement TheElement, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool InPool, EList<CIM_StorageExtent> AvailableExtents) {
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
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___RELOCATE_STORAGE_VOLUMES_TO_STORAGE_POOL__ELIST_CIM_CONCRETEJOB_CIM_STORAGESETTING_CIM_STORAGEPOOL:
				return RelocateStorageVolumesToStoragePool((EList<CIM_StorageVolume>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (CIM_StoragePool)arguments.get(3));
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___RELOCATE_STORAGE_POOLS_TO_STORAGE_POOL__ELIST_CIM_CONCRETEJOB_CIM_STORAGESETTING_CIM_STORAGEPOOL:
				return RelocateStoragePoolsToStoragePool((EList<CIM_StoragePool>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (CIM_StoragePool)arguments.get(3));
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___RELOCATE_STORAGE_VOLUME_TO_STORAGE_EXTENTS__ELIST_CIM_CONCRETEJOB_CIM_STORAGESETTING_CIM_STORAGEVOLUME:
				return RelocateStorageVolumeToStorageExtents((EList<CIM_StorageExtent>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (CIM_StorageVolume)arguments.get(3));
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___RELOCATE_STORAGE_POOL_TO_STORAGE_EXTENTS__ELIST_CIM_CONCRETEJOB_CIM_STORAGESETTING_CIM_STORAGEPOOL:
				return RelocateStoragePoolToStorageExtents((EList<CIM_StorageExtent>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (CIM_StoragePool)arguments.get(3));
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___RELOCATE_LOGICAL_DISK_TO_STORAGE_EXTENTS__ELIST_CIM_CONCRETEJOB_CIM_STORAGESETTING_CIM_LOGICALDISK:
				return RelocateLogicalDiskToStorageExtents((EList<CIM_StorageExtent>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_StorageSetting)arguments.get(2), (CIM_LogicalDisk)arguments.get(3));
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE___GET_AVAILABLE_TARGET_RELOCATION_EXTENTS__CIM_LOGICALELEMENT_CIM_STORAGESETTING_CIM_STORAGEPOOL_ELIST:
				return GetAvailableTargetRelocationExtents((CIM_LogicalElement)arguments.get(0), (CIM_StorageSetting)arguments.get(1), (CIM_StoragePool)arguments.get(2), (EList<CIM_StorageExtent>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_StorageRelocationServiceImpl
