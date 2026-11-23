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

import org.dmtf.cim.CIM_BootConfigSetting;
import org.dmtf.cim.CIM_BootService;
import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Boot Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_BootServiceImpl extends CIM_ServiceImpl implements CIM_BootService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BootServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BootService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateBootConfigSetting(CIM_BootConfigSetting StartingBootConfig, CIM_ComputerSystem ScopingComputerSystem, CIM_BootConfigSetting NewBootConfig, CIM_ConcreteJob Job) {
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
	public Long SetBootConfigRole(CIM_BootConfigSetting BootConfigSetting, Integer Role, CIM_ConcreteJob Job) {
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
	public Long SetBootConfigUsage(CIM_BootConfigSetting BootConfigSetting, CIM_ComputerSystem ScopingComputerSystem, Integer Role, CIM_ConcreteJob Job) {
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
	public Long ApplyBootConfigSetting(CIM_ComputerSystem ScopingComputerSystem, CIM_BootConfigSetting ApplyBootConfig, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_BOOT_SERVICE___CREATE_BOOT_CONFIG_SETTING__CIM_BOOTCONFIGSETTING_CIM_COMPUTERSYSTEM_CIM_BOOTCONFIGSETTING_CIM_CONCRETEJOB:
				return CreateBootConfigSetting((CIM_BootConfigSetting)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (CIM_BootConfigSetting)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_BOOT_SERVICE___SET_BOOT_CONFIG_ROLE__CIM_BOOTCONFIGSETTING_INTEGER_CIM_CONCRETEJOB:
				return SetBootConfigRole((CIM_BootConfigSetting)arguments.get(0), (Integer)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_BOOT_SERVICE___SET_BOOT_CONFIG_USAGE__CIM_BOOTCONFIGSETTING_CIM_COMPUTERSYSTEM_INTEGER_CIM_CONCRETEJOB:
				return SetBootConfigUsage((CIM_BootConfigSetting)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (Integer)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_BOOT_SERVICE___APPLY_BOOT_CONFIG_SETTING__CIM_COMPUTERSYSTEM_CIM_BOOTCONFIGSETTING_CIM_CONCRETEJOB:
				return ApplyBootConfigSetting((CIM_ComputerSystem)arguments.get(0), (CIM_BootConfigSetting)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_BootServiceImpl
