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
import org.dmtf.cim.CIM_ControllerConfigurationService;
import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Privilege;
import org.dmtf.cim.CIM_ProtocolController;
import org.dmtf.cim.CIM_SCSIProtocolController;
import org.dmtf.cim.CIM_StorageClientSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Controller Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_ControllerConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_ControllerConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ControllerConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ControllerConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateProtocolControllerWithPorts(String ElementName, EList<String> Ports, Integer Protocol, CIM_Privilege Privilege, CIM_ManagedElement Identity, CIM_ProtocolController ProtocolController) {
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
	public Long DeleteProtocolController(CIM_ProtocolController ProtocolController, Boolean DeleteChildrenProtocolControllers, Boolean DeleteUnits) {
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
	public Long AttachDevice(CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device, String DeviceNumber) {
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
	public Long DetachDevice(CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device) {
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
	public Long ExposePaths(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, EList<CIM_SCSIProtocolController> ProtocolControllers) {
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
	public Long HidePaths(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<CIM_SCSIProtocolController> ProtocolControllers) {
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
	public Long ExposeDefaultLUs(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, EList<CIM_SCSIProtocolController> ProtocolControllers) {
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
	public Long ExposePathsWithNameAndHostType(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, String ElementName, CIM_StorageClientSettingData ClientSettingData, EList<CIM_SCSIProtocolController> ProtocolControllers) {
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
	public Long HideDefaultLUs(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> TargetPortIDs, EList<CIM_SCSIProtocolController> ProtocolControllers) {
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
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___CREATE_PROTOCOL_CONTROLLER_WITH_PORTS__STRING_ELIST_INTEGER_CIM_PRIVILEGE_CIM_MANAGEDELEMENT_CIM_PROTOCOLCONTROLLER:
				return CreateProtocolControllerWithPorts((String)arguments.get(0), (EList<String>)arguments.get(1), (Integer)arguments.get(2), (CIM_Privilege)arguments.get(3), (CIM_ManagedElement)arguments.get(4), (CIM_ProtocolController)arguments.get(5));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___DELETE_PROTOCOL_CONTROLLER__CIM_PROTOCOLCONTROLLER_BOOLEAN_BOOLEAN:
				return DeleteProtocolController((CIM_ProtocolController)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___ATTACH_DEVICE__CIM_PROTOCOLCONTROLLER_CIM_LOGICALDEVICE_STRING:
				return AttachDevice((CIM_ProtocolController)arguments.get(0), (CIM_LogicalDevice)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___DETACH_DEVICE__CIM_PROTOCOLCONTROLLER_CIM_LOGICALDEVICE:
				return DetachDevice((CIM_ProtocolController)arguments.get(0), (CIM_LogicalDevice)arguments.get(1));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___EXPOSE_PATHS__CIM_CONCRETEJOB_ELIST_ELIST_ELIST_ELIST_ELIST_ELIST:
				return ExposePaths((CIM_ConcreteJob)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (EList<Integer>)arguments.get(5), (EList<CIM_SCSIProtocolController>)arguments.get(6));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___HIDE_PATHS__CIM_CONCRETEJOB_ELIST_ELIST_ELIST_ELIST:
				return HidePaths((CIM_ConcreteJob)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (EList<CIM_SCSIProtocolController>)arguments.get(4));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___EXPOSE_DEFAULT_LUS__CIM_CONCRETEJOB_ELIST_ELIST_ELIST_ELIST_ELIST:
				return ExposeDefaultLUs((CIM_ConcreteJob)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (EList<Integer>)arguments.get(4), (EList<CIM_SCSIProtocolController>)arguments.get(5));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___EXPOSE_PATHS_WITH_NAME_AND_HOST_TYPE__CIM_CONCRETEJOB_ELIST_ELIST_ELIST_ELIST_ELIST_STRING_CIM_STORAGECLIENTSETTINGDATA_ELIST:
				return ExposePathsWithNameAndHostType((CIM_ConcreteJob)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (EList<Integer>)arguments.get(5), (String)arguments.get(6), (CIM_StorageClientSettingData)arguments.get(7), (EList<CIM_SCSIProtocolController>)arguments.get(8));
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE___HIDE_DEFAULT_LUS__CIM_CONCRETEJOB_ELIST_ELIST_ELIST:
				return HideDefaultLUs((CIM_ConcreteJob)arguments.get(0), (EList<String>)arguments.get(1), (EList<String>)arguments.get(2), (EList<CIM_SCSIProtocolController>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_ControllerConfigurationServiceImpl
