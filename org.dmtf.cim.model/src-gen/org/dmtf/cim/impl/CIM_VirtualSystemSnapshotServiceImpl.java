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
import org.dmtf.cim.CIM_VirtualSystemSettingData;
import org.dmtf.cim.CIM_VirtualSystemSnapshotService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Snapshot Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_VirtualSystemSnapshotServiceImpl extends CIM_ServiceImpl implements CIM_VirtualSystemSnapshotService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemSnapshotServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemSnapshotService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateSnapshot(CIM_ComputerSystem AffectedSystem, String SnapshotSettings, Integer SnapshotType, CIM_VirtualSystemSettingData ResultingSnapshot, CIM_ConcreteJob Job) {
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
	public Long DestroySnapshot(CIM_VirtualSystemSettingData AffectedSnapshot, CIM_ConcreteJob Job) {
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
	public Long ApplySnapshot(CIM_VirtualSystemSettingData Snapshot, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE___CREATE_SNAPSHOT__CIM_COMPUTERSYSTEM_STRING_INTEGER_CIM_VIRTUALSYSTEMSETTINGDATA_CIM_CONCRETEJOB:
				return CreateSnapshot((CIM_ComputerSystem)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (CIM_VirtualSystemSettingData)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE___DESTROY_SNAPSHOT__CIM_VIRTUALSYSTEMSETTINGDATA_CIM_CONCRETEJOB:
				return DestroySnapshot((CIM_VirtualSystemSettingData)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE___APPLY_SNAPSHOT__CIM_VIRTUALSYSTEMSETTINGDATA_CIM_CONCRETEJOB:
				return ApplySnapshot((CIM_VirtualSystemSettingData)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_VirtualSystemSnapshotServiceImpl
