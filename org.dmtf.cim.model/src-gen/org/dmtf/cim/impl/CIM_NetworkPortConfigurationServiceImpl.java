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

import org.dmtf.cim.CIM_LANEndpoint;
import org.dmtf.cim.CIM_NetworkPort;
import org.dmtf.cim.CIM_NetworkPortConfigurationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Port Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_NetworkPortConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_NetworkPortConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPortConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPortConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddLANEndpoint(CIM_NetworkPort Port, CIM_LANEndpoint Endpoint, String Address, String LANID, EList<String> AliasAddresses, EList<String> GroupAddresses) {
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
			case CimPackage.CIM_NETWORK_PORT_CONFIGURATION_SERVICE___ADD_LAN_ENDPOINT__CIM_NETWORKPORT_CIM_LANENDPOINT_STRING_STRING_ELIST_ELIST:
				return AddLANEndpoint((CIM_NetworkPort)arguments.get(0), (CIM_LANEndpoint)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_NetworkPortConfigurationServiceImpl
