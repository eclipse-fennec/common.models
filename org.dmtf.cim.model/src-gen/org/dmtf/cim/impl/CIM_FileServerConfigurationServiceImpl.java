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
import org.dmtf.cim.CIM_EthernetPort;
import org.dmtf.cim.CIM_FSIPInterfaceSettingData;
import org.dmtf.cim.CIM_FileServerConfigurationService;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Server Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_FileServerConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_FileServerConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileServerConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileServerConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateFileServer(String ElementName, CIM_ConcreteJob Job, CIM_LogicalElement TheElement, String FileServerSettings, String IPInterfaceSettingData, String CIFSSettingData, String NFSSettingData, String DNSSettingData, String NISSettingData, CIM_ComputerSystem NASComputerSystem, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort) {
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
	public Long ModifyFileServer(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job, String ElementName, String FileServerSettings, String CIFSSettingData, String NFSSettingData, String DNSSettingData, String NISSettingData) {
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
	public Long DeleteFileServer(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job) {
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
	public Long AddIPInterface(CIM_ComputerSystem FileServer, CIM_ConcreteJob Job, String IPInterfaceSettingData, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort) {
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
	public Long ModifyIPInterface(CIM_ComputerSystem FileServer, CIM_FSIPInterfaceSettingData IPInterfaceSettingData, CIM_ConcreteJob Job, String NewIPInterfaceSettingData, CIM_ComputerSystem HostingComputerSystem, CIM_EthernetPort EthernetPort) {
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
	public Long DeleteIPInterface(CIM_ComputerSystem FileServer, CIM_FSIPInterfaceSettingData IPInterfaceSettingData, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___CREATE_FILE_SERVER__STRING_CIM_CONCRETEJOB_CIM_LOGICALELEMENT_STRING_STRING_STRING_STRING_STRING_STRING_CIM_COMPUTERSYSTEM_CIM_COMPUTERSYSTEM_CIM_ETHERNETPORT:
				return CreateFileServer((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (CIM_LogicalElement)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (String)arguments.get(8), (CIM_ComputerSystem)arguments.get(9), (CIM_ComputerSystem)arguments.get(10), (CIM_EthernetPort)arguments.get(11));
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___MODIFY_FILE_SERVER__CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB_STRING_STRING_STRING_STRING_STRING_STRING:
				return ModifyFileServer((CIM_ComputerSystem)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7));
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___DELETE_FILE_SERVER__CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB:
				return DeleteFileServer((CIM_ComputerSystem)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___ADD_IP_INTERFACE__CIM_COMPUTERSYSTEM_CIM_CONCRETEJOB_STRING_CIM_COMPUTERSYSTEM_CIM_ETHERNETPORT:
				return AddIPInterface((CIM_ComputerSystem)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2), (CIM_ComputerSystem)arguments.get(3), (CIM_EthernetPort)arguments.get(4));
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___MODIFY_IP_INTERFACE__CIM_COMPUTERSYSTEM_CIM_FSIPINTERFACESETTINGDATA_CIM_CONCRETEJOB_STRING_CIM_COMPUTERSYSTEM_CIM_ETHERNETPORT:
				return ModifyIPInterface((CIM_ComputerSystem)arguments.get(0), (CIM_FSIPInterfaceSettingData)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (String)arguments.get(3), (CIM_ComputerSystem)arguments.get(4), (CIM_EthernetPort)arguments.get(5));
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE___DELETE_IP_INTERFACE__CIM_COMPUTERSYSTEM_CIM_FSIPINTERFACESETTINGDATA_CIM_CONCRETEJOB:
				return DeleteIPInterface((CIM_ComputerSystem)arguments.get(0), (CIM_FSIPInterfaceSettingData)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_FileServerConfigurationServiceImpl
