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

import org.dmtf.cim.CIM_GatewayPathID;
import org.dmtf.cim.CIM_StorageClientSettingData;
import org.dmtf.cim.CIM_StorageHardwareID;
import org.dmtf.cim.CIM_StorageHardwareIDManagementService;
import org.dmtf.cim.CIM_SystemSpecificCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Hardware ID Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_StorageHardwareIDManagementServiceImpl extends CIM_IdentityManagementServiceImpl implements CIM_StorageHardwareIDManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageHardwareIDManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageHardwareIDManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateStorageHardwareID(String ElementName, String StorageID, Integer IDType, String OtherIDType, CIM_StorageClientSettingData Setting, CIM_StorageHardwareID HardwareID) {
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
	public Long DeleteStorageHardwareID(CIM_StorageHardwareID HardwareID) {
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
	public Long CreateGatewayPathID(String ElementName, String StorageID, Integer IDType, String OtherIDType, String GatewayID, Integer GatewayIDType, String OtherGatewayIDType, CIM_GatewayPathID NewGatewayPathID) {
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
	public Long CreateHardwareIDCollection(String ElementName, EList<String> HardwareIDs, CIM_SystemSpecificCollection Collection) {
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
	public Long AddHardwareIDsToCollection(EList<String> HardwareIDs, CIM_SystemSpecificCollection Collection) {
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
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE___CREATE_STORAGE_HARDWARE_ID__STRING_STRING_INTEGER_STRING_CIM_STORAGECLIENTSETTINGDATA_CIM_STORAGEHARDWAREID:
				return CreateStorageHardwareID((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (CIM_StorageClientSettingData)arguments.get(4), (CIM_StorageHardwareID)arguments.get(5));
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE___DELETE_STORAGE_HARDWARE_ID__CIM_STORAGEHARDWAREID:
				return DeleteStorageHardwareID((CIM_StorageHardwareID)arguments.get(0));
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE___CREATE_GATEWAY_PATH_ID__STRING_STRING_INTEGER_STRING_STRING_INTEGER_STRING_CIM_GATEWAYPATHID:
				return CreateGatewayPathID((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (CIM_GatewayPathID)arguments.get(7));
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE___CREATE_HARDWARE_ID_COLLECTION__STRING_ELIST_CIM_SYSTEMSPECIFICCOLLECTION:
				return CreateHardwareIDCollection((String)arguments.get(0), (EList<String>)arguments.get(1), (CIM_SystemSpecificCollection)arguments.get(2));
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE___ADD_HARDWARE_IDS_TO_COLLECTION__ELIST_CIM_SYSTEMSPECIFICCOLLECTION:
				return AddHardwareIDsToCollection((EList<String>)arguments.get(0), (CIM_SystemSpecificCollection)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_StorageHardwareIDManagementServiceImpl
