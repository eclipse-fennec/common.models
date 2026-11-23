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
import org.dmtf.cim.CIM_FileSystem;
import org.dmtf.cim.CIM_FileSystemConfigurationService;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_FileSystemConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_FileSystemConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateFileSystem(String ElementName, CIM_ConcreteJob Job, String Goal, CIM_LogicalElement TheElement, EList<CIM_StorageExtent> InExtents, EList<CIM_StoragePool> Pools, EList<Long> Sizes, EList<String> ExtentSettings, CIM_ComputerSystem FileServer, String LocalAccessPoint, String LocalAccessSetting, CIM_ComputerSystem DirectoryServer) {
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
	public Long ModifyFileSystem(String ElementName, CIM_ConcreteJob Job, String Goal, CIM_LogicalElement TheElement, EList<CIM_StorageExtent> InExtents, EList<CIM_StoragePool> Pools, EList<Long> Sizes, EList<String> ExtentSettings, CIM_ComputerSystem FileServer, String LocalAccessPoint, String LocalAccessSetting, Integer InUseOptions, Long WaitTime) {
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
	public Long DeleteFileSystem(CIM_ConcreteJob Job, CIM_ManagedElement TheElement, Integer InUseOptions, Long WaitTime) {
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
	public Long QuiesceFileSystem(CIM_FileSystem TheElement, String Timeout, CIM_ConcreteJob Job) {
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
	public Long UnquiesceFileSystem(CIM_FileSystem TheElement) {
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
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE___CREATE_FILE_SYSTEM__STRING_CIM_CONCRETEJOB_STRING_CIM_LOGICALELEMENT_ELIST_ELIST_ELIST_ELIST_CIM_COMPUTERSYSTEM_STRING_STRING_CIM_COMPUTERSYSTEM:
				return CreateFileSystem((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2), (CIM_LogicalElement)arguments.get(3), (EList<CIM_StorageExtent>)arguments.get(4), (EList<CIM_StoragePool>)arguments.get(5), (EList<Long>)arguments.get(6), (EList<String>)arguments.get(7), (CIM_ComputerSystem)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10), (CIM_ComputerSystem)arguments.get(11));
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE___MODIFY_FILE_SYSTEM__STRING_CIM_CONCRETEJOB_STRING_CIM_LOGICALELEMENT_ELIST_ELIST_ELIST_ELIST_CIM_COMPUTERSYSTEM_STRING_STRING_INTEGER_LONG:
				return ModifyFileSystem((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2), (CIM_LogicalElement)arguments.get(3), (EList<CIM_StorageExtent>)arguments.get(4), (EList<CIM_StoragePool>)arguments.get(5), (EList<Long>)arguments.get(6), (EList<String>)arguments.get(7), (CIM_ComputerSystem)arguments.get(8), (String)arguments.get(9), (String)arguments.get(10), (Integer)arguments.get(11), (Long)arguments.get(12));
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE___DELETE_FILE_SYSTEM__CIM_CONCRETEJOB_CIM_MANAGEDELEMENT_INTEGER_LONG:
				return DeleteFileSystem((CIM_ConcreteJob)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (Integer)arguments.get(2), (Long)arguments.get(3));
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE___QUIESCE_FILE_SYSTEM__CIM_FILESYSTEM_STRING_CIM_CONCRETEJOB:
				return QuiesceFileSystem((CIM_FileSystem)arguments.get(0), (String)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE___UNQUIESCE_FILE_SYSTEM__CIM_FILESYSTEM:
				return UnquiesceFileSystem((CIM_FileSystem)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_FileSystemConfigurationServiceImpl
