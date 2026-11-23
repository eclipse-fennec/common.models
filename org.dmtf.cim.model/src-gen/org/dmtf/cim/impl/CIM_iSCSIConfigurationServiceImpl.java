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

import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CIM_SCSIProtocolController;
import org.dmtf.cim.CIM_iSCSIConfigurationService;
import org.dmtf.cim.CIM_iSCSIProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_iSCSIConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_iSCSIConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSIConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSIConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateiSCSIProtocolEndpoint(CIM_SCSIProtocolController iSCSINode, Integer Role, String Identifier, EList<CIM_ProtocolEndpoint> NetworkPortals, CIM_iSCSIProtocolEndpoint iSCSIPort) {
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
	public Long DeleteiSCSIProtocolEndpoint(CIM_iSCSIProtocolEndpoint iSCSIPort) {
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
	public Long BindiSCSIProtocolEndPoint(CIM_iSCSIProtocolEndpoint iSCSIPort, CIM_ProtocolEndpoint NetworkPortal) {
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
	public Long CreateiSCSINode(String Alias, CIM_SCSIProtocolController iSCSINode) {
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
	public Long DeleteiSCSINode(CIM_SCSIProtocolController iSCSINode) {
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
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE___CREATEI_SCSI_PROTOCOL_ENDPOINT__CIM_SCSIPROTOCOLCONTROLLER_INTEGER_STRING_ELIST_CIM_ISCSIPROTOCOLENDPOINT:
				return CreateiSCSIProtocolEndpoint((CIM_SCSIProtocolController)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<CIM_ProtocolEndpoint>)arguments.get(3), (CIM_iSCSIProtocolEndpoint)arguments.get(4));
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE___DELETEI_SCSI_PROTOCOL_ENDPOINT__CIM_ISCSIPROTOCOLENDPOINT:
				return DeleteiSCSIProtocolEndpoint((CIM_iSCSIProtocolEndpoint)arguments.get(0));
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE___BINDI_SCSI_PROTOCOL_END_POINT__CIM_ISCSIPROTOCOLENDPOINT_CIM_PROTOCOLENDPOINT:
				return BindiSCSIProtocolEndPoint((CIM_iSCSIProtocolEndpoint)arguments.get(0), (CIM_ProtocolEndpoint)arguments.get(1));
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE___CREATEI_SCSI_NODE__STRING_CIM_SCSIPROTOCOLCONTROLLER:
				return CreateiSCSINode((String)arguments.get(0), (CIM_SCSIProtocolController)arguments.get(1));
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE___DELETEI_SCSI_NODE__CIM_SCSIPROTOCOLCONTROLLER:
				return DeleteiSCSINode((CIM_SCSIProtocolController)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_iSCSIConfigurationServiceImpl
