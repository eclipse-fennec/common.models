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
import org.dmtf.cim.CIM_EthernetPort;
import org.dmtf.cim.CIM_NextHopIPRoute;
import org.dmtf.cim.CIM_ServiceAccessPoint;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CIM_VRFConfigurationService;
import org.dmtf.cim.CIM_VirtualRoutingAndForwardingTable;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VRF Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_VRFConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_VRFConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VRFConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VRFConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateVRF(CIM_System TargetRouter, String VRF, CIM_VirtualRoutingAndForwardingTable ResultingVRF, CIM_ConcreteJob Job) {
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
	public Long RemoveVRF(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ConcreteJob Job) {
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
	public Long AddRoute(CIM_VirtualRoutingAndForwardingTable VRF, String Route, CIM_NextHopIPRoute ResultingRoute, CIM_ConcreteJob Job) {
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
	public Long RemoveRoute(CIM_VirtualRoutingAndForwardingTable VRF, CIM_NextHopIPRoute Route, CIM_ConcreteJob Job) {
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
	public Long AddPortMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_EthernetPort Port, CIM_ConcreteJob Job) {
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
	public Long RemovePortMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_EthernetPort Port, CIM_ConcreteJob Job) {
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
	public Long AddSAPMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ServiceAccessPoint SAP, CIM_ConcreteJob Job) {
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
	public Long RemoveSAPMember(CIM_VirtualRoutingAndForwardingTable VRF, CIM_ServiceAccessPoint SAPMember, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___CREATE_VRF__CIM_SYSTEM_STRING_CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_CONCRETEJOB:
				return CreateVRF((CIM_System)arguments.get(0), (String)arguments.get(1), (CIM_VirtualRoutingAndForwardingTable)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___REMOVE_VRF__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_CONCRETEJOB:
				return RemoveVRF((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___ADD_ROUTE__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_STRING_CIM_NEXTHOPIPROUTE_CIM_CONCRETEJOB:
				return AddRoute((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (String)arguments.get(1), (CIM_NextHopIPRoute)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___REMOVE_ROUTE__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_NEXTHOPIPROUTE_CIM_CONCRETEJOB:
				return RemoveRoute((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_NextHopIPRoute)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___ADD_PORT_MEMBER__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_ETHERNETPORT_CIM_CONCRETEJOB:
				return AddPortMember((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_EthernetPort)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___REMOVE_PORT_MEMBER__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_ETHERNETPORT_CIM_CONCRETEJOB:
				return RemovePortMember((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_EthernetPort)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___ADD_SAP_MEMBER__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_SERVICEACCESSPOINT_CIM_CONCRETEJOB:
				return AddSAPMember((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_ServiceAccessPoint)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE___REMOVE_SAP_MEMBER__CIM_VIRTUALROUTINGANDFORWARDINGTABLE_CIM_SERVICEACCESSPOINT_CIM_CONCRETEJOB:
				return RemoveSAPMember((CIM_VirtualRoutingAndForwardingTable)arguments.get(0), (CIM_ServiceAccessPoint)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_VRFConfigurationServiceImpl
