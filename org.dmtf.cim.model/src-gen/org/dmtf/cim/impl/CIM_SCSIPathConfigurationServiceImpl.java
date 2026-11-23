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

import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath;
import org.dmtf.cim.CIM_SCSIPathConfigurationService;
import org.dmtf.cim.CIM_SCSITargetPortGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Path Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_SCSIPathConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_SCSIPathConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIPathConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIPathConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetTPGAccess(CIM_LogicalDevice LogicalUnit, EList<CIM_SCSITargetPortGroup> TargetPortGroups, EList<Integer> AccessStates) {
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
	public Long SetLoadBalanceAlgorithm(CIM_LogicalDevice LogicalDevice, Integer LoadBalanceAlgorithm, String OtherLoadBalanceAlgorithmDescription) {
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
	public Long AssignLogicalUnitToPortGroup(CIM_LogicalDevice LogicalUnit, CIM_SCSITargetPortGroup TargetPortGroup) {
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
	public Long SetOverridePath(CIM_SCSIInitiatorTargetLogicalUnitPath Path) {
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
	public Long CancelOverridePath(CIM_LogicalDevice LogicalUnit) {
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
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE___SET_TPG_ACCESS__CIM_LOGICALDEVICE_ELIST_ELIST:
				return SetTPGAccess((CIM_LogicalDevice)arguments.get(0), (EList<CIM_SCSITargetPortGroup>)arguments.get(1), (EList<Integer>)arguments.get(2));
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE___SET_LOAD_BALANCE_ALGORITHM__CIM_LOGICALDEVICE_INTEGER_STRING:
				return SetLoadBalanceAlgorithm((CIM_LogicalDevice)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE___ASSIGN_LOGICAL_UNIT_TO_PORT_GROUP__CIM_LOGICALDEVICE_CIM_SCSITARGETPORTGROUP:
				return AssignLogicalUnitToPortGroup((CIM_LogicalDevice)arguments.get(0), (CIM_SCSITargetPortGroup)arguments.get(1));
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE___SET_OVERRIDE_PATH__CIM_SCSIINITIATORTARGETLOGICALUNITPATH:
				return SetOverridePath((CIM_SCSIInitiatorTargetLogicalUnitPath)arguments.get(0));
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE___CANCEL_OVERRIDE_PATH__CIM_LOGICALDEVICE:
				return CancelOverridePath((CIM_LogicalDevice)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_SCSIPathConfigurationServiceImpl
