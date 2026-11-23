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
import org.dmtf.cim.CIM_ResourceAllocationSettingData;
import org.dmtf.cim.CIM_VirtualSystemManagementService;
import org.dmtf.cim.CIM_VirtualSystemSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_VirtualSystemManagementServiceImpl extends CIM_ServiceImpl implements CIM_VirtualSystemManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddResourceSettings(CIM_VirtualSystemSettingData AffectedConfiguration, EList<String> ResourceSettings, EList<CIM_ResourceAllocationSettingData> ResultingResourceSettings, CIM_ConcreteJob Job) {
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
	public Long DefineSystem(String SystemSettings, EList<String> ResourceSettings, CIM_VirtualSystemSettingData ReferenceConfiguration, CIM_ComputerSystem ResultingSystem, CIM_ConcreteJob Job) {
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
	public Long DestroySystem(CIM_ComputerSystem AffectedSystem, CIM_ConcreteJob Job) {
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
	public Long ModifyResourceSettings(EList<String> ResourceSettings, EList<CIM_ResourceAllocationSettingData> ResultingResourceSettings, CIM_ConcreteJob Job) {
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
	public Long ModifySystemSettings(String SystemSettings, CIM_ConcreteJob Job) {
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
	public Long RemoveResourceSettings(EList<CIM_ResourceAllocationSettingData> ResourceSettings, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___ADD_RESOURCE_SETTINGS__CIM_VIRTUALSYSTEMSETTINGDATA_ELIST_ELIST_CIM_CONCRETEJOB:
				return AddResourceSettings((CIM_VirtualSystemSettingData)arguments.get(0), (EList<String>)arguments.get(1), (EList<CIM_ResourceAllocationSettingData>)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___DEFINE_SYSTEM__STRING_ELIST_CIM_VIRTUALSYSTEMSETTINGDATA_CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB:
				return DefineSystem((String)arguments.get(0), (EList<String>)arguments.get(1), (CIM_VirtualSystemSettingData)arguments.get(2), (CIM_ComputerSystem)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___DESTROY_SYSTEM__CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB:
				return DestroySystem((CIM_ComputerSystem)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___MODIFY_RESOURCE_SETTINGS__ELIST_ELIST_CIM_CONCRETEJOB:
				return ModifyResourceSettings((EList<String>)arguments.get(0), (EList<CIM_ResourceAllocationSettingData>)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___MODIFY_SYSTEM_SETTINGS__STRING_CIM_CONCRETEJOB:
				return ModifySystemSettings((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE___REMOVE_RESOURCE_SETTINGS__ELIST_CIM_CONCRETEJOB:
				return RemoveResourceSettings((EList<CIM_ResourceAllocationSettingData>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_VirtualSystemManagementServiceImpl
