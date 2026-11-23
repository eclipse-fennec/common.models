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
import org.dmtf.cim.CIM_EncapsulationMappingSettingData;
import org.dmtf.cim.CIM_IPEncapsulationInterface;
import org.dmtf.cim.CIM_IPEncapsulationManagementService;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Encapsulation Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_IPEncapsulationManagementServiceImpl extends CIM_ServiceImpl implements CIM_IPEncapsulationManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPEncapsulationManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPEncapsulationManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddIPEncapsulationInterface(CIM_System TargetSystem, String EncapsulationGateway, String PAIPEndpoint, String CAIPEndpoint, EList<String> EncapsulationMapping, CIM_IPEncapsulationInterface ResultingInterface, CIM_ConcreteJob Job) {
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
	public Long AddIPEncapsulationMappings(CIM_IPEncapsulationInterface TargetInterface, EList<String> EncapsulationMappings, CIM_ConcreteJob Job) {
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
	public Long RemoveIPEncapsulationInterface(CIM_IPEncapsulationInterface Gateway, CIM_ConcreteJob Job) {
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
	public Long RemoveIPEncapsulationMappings(EList<CIM_EncapsulationMappingSettingData> EncapsulationMappings, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_IP_ENCAPSULATION_MANAGEMENT_SERVICE___ADD_IP_ENCAPSULATION_INTERFACE__CIM_SYSTEM_STRING_STRING_STRING_ELIST_CIM_IPENCAPSULATIONINTERFACE_CIM_CONCRETEJOB:
				return AddIPEncapsulationInterface((CIM_System)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (CIM_IPEncapsulationInterface)arguments.get(5), (CIM_ConcreteJob)arguments.get(6));
			case CimPackage.CIM_IP_ENCAPSULATION_MANAGEMENT_SERVICE___ADD_IP_ENCAPSULATION_MAPPINGS__CIM_IPENCAPSULATIONINTERFACE_ELIST_CIM_CONCRETEJOB:
				return AddIPEncapsulationMappings((CIM_IPEncapsulationInterface)arguments.get(0), (EList<String>)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_IP_ENCAPSULATION_MANAGEMENT_SERVICE___REMOVE_IP_ENCAPSULATION_INTERFACE__CIM_IPENCAPSULATIONINTERFACE_CIM_CONCRETEJOB:
				return RemoveIPEncapsulationInterface((CIM_IPEncapsulationInterface)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_IP_ENCAPSULATION_MANAGEMENT_SERVICE___REMOVE_IP_ENCAPSULATION_MAPPINGS__ELIST_CIM_CONCRETEJOB:
				return RemoveIPEncapsulationMappings((EList<CIM_EncapsulationMappingSettingData>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_IPEncapsulationManagementServiceImpl
