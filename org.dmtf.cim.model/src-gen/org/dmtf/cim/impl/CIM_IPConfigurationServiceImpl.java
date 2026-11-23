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
import org.dmtf.cim.CIM_IPAssignmentSettingData;
import org.dmtf.cim.CIM_IPConfigurationService;
import org.dmtf.cim.CIM_IPNetworkConnection;
import org.dmtf.cim.CIM_IPProtocolEndpoint;
import org.dmtf.cim.CIM_IPVersionSettingData;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_IPConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_IPConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ApplySettingToIPProtocolEndpoint(CIM_IPAssignmentSettingData Configuration, CIM_IPProtocolEndpoint Endpoint, CIM_ConcreteJob Job) {
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
	public Long ApplySettingToComputerSystem(CIM_IPVersionSettingData IPVersionSettingData, CIM_ComputerSystem ComputerSystem, Integer Mode, CIM_ConcreteJob Job) {
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
	public Long ApplySettingToIPNetworkConnection(CIM_IPAssignmentSettingData SettingData, CIM_IPVersionSettingData IPVersionSettingData, CIM_IPNetworkConnection IPNetworkConnection, Integer Mode, CIM_ConcreteJob Job) {
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
	public Long AddIPProtocolEndpoint(CIM_ManagedElement TargetInterface, EList<String> IPProtocolEndpoint, EList<String> EndpointSettings, EList<CIM_IPProtocolEndpoint> ResultingEndpoint, CIM_ConcreteJob Job) {
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
	public Long RemoveIPProtocolEndpoint(EList<CIM_IPProtocolEndpoint> Endpoint, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE___APPLY_SETTING_TO_IP_PROTOCOL_ENDPOINT__CIM_IPASSIGNMENTSETTINGDATA_CIM_IPPROTOCOLENDPOINT_CIM_CONCRETEJOB:
				return ApplySettingToIPProtocolEndpoint((CIM_IPAssignmentSettingData)arguments.get(0), (CIM_IPProtocolEndpoint)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE___APPLY_SETTING_TO_COMPUTER_SYSTEM__CIM_IPVERSIONSETTINGDATA_CIM_COMPUTERSYSTEM_INTEGER_CIM_CONCRETEJOB:
				return ApplySettingToComputerSystem((CIM_IPVersionSettingData)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (Integer)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE___APPLY_SETTING_TO_IP_NETWORK_CONNECTION__CIM_IPASSIGNMENTSETTINGDATA_CIM_IPVERSIONSETTINGDATA_CIM_IPNETWORKCONNECTION_INTEGER_CIM_CONCRETEJOB:
				return ApplySettingToIPNetworkConnection((CIM_IPAssignmentSettingData)arguments.get(0), (CIM_IPVersionSettingData)arguments.get(1), (CIM_IPNetworkConnection)arguments.get(2), (Integer)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE___ADD_IP_PROTOCOL_ENDPOINT__CIM_MANAGEDELEMENT_ELIST_ELIST_ELIST_CIM_CONCRETEJOB:
				return AddIPProtocolEndpoint((CIM_ManagedElement)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<CIM_IPProtocolEndpoint>)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE___REMOVE_IP_PROTOCOL_ENDPOINT__ELIST_CIM_CONCRETEJOB:
				return RemoveIPProtocolEndpoint((EList<CIM_IPProtocolEndpoint>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_IPConfigurationServiceImpl
