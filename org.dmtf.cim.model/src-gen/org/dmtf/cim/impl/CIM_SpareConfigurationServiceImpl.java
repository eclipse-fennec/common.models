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
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_SpareConfigurationService;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_StorageRedundancySet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Spare Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_SpareConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_SpareConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SpareConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SpareConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AssignSpares(CIM_ConcreteJob Job, CIM_StoragePool InPool, EList<CIM_StorageExtent> InExtents, CIM_StorageRedundancySet RedundancySet) {
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
	public Long UnassignSpares(CIM_ConcreteJob Job, CIM_StoragePool InPool, EList<CIM_StorageExtent> InExtents) {
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
	public Long RebuildStorageExtent(CIM_ConcreteJob Job, CIM_StorageExtent Target) {
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
	public Long CheckParityConsistency(CIM_ConcreteJob Job, CIM_StorageExtent Target) {
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
	public Long RepairParity(CIM_ConcreteJob Job, CIM_StorageExtent Target) {
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
	public Long GetAvailableSpareExtents(CIM_StoragePool InPool, CIM_StorageRedundancySet RedundancySet, EList<CIM_StorageExtent> AvailableExtents) {
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
	public Long CheckStorageElement(Integer CheckType, Integer CheckMode, CIM_LogicalElement TargetElement, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___ASSIGN_SPARES__CIM_CONCRETEJOB_CIM_STORAGEPOOL_ELIST_CIM_STORAGEREDUNDANCYSET:
				return AssignSpares((CIM_ConcreteJob)arguments.get(0), (CIM_StoragePool)arguments.get(1), (EList<CIM_StorageExtent>)arguments.get(2), (CIM_StorageRedundancySet)arguments.get(3));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___UNASSIGN_SPARES__CIM_CONCRETEJOB_CIM_STORAGEPOOL_ELIST:
				return UnassignSpares((CIM_ConcreteJob)arguments.get(0), (CIM_StoragePool)arguments.get(1), (EList<CIM_StorageExtent>)arguments.get(2));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___REBUILD_STORAGE_EXTENT__CIM_CONCRETEJOB_CIM_STORAGEEXTENT:
				return RebuildStorageExtent((CIM_ConcreteJob)arguments.get(0), (CIM_StorageExtent)arguments.get(1));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___CHECK_PARITY_CONSISTENCY__CIM_CONCRETEJOB_CIM_STORAGEEXTENT:
				return CheckParityConsistency((CIM_ConcreteJob)arguments.get(0), (CIM_StorageExtent)arguments.get(1));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___REPAIR_PARITY__CIM_CONCRETEJOB_CIM_STORAGEEXTENT:
				return RepairParity((CIM_ConcreteJob)arguments.get(0), (CIM_StorageExtent)arguments.get(1));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___GET_AVAILABLE_SPARE_EXTENTS__CIM_STORAGEPOOL_CIM_STORAGEREDUNDANCYSET_ELIST:
				return GetAvailableSpareExtents((CIM_StoragePool)arguments.get(0), (CIM_StorageRedundancySet)arguments.get(1), (EList<CIM_StorageExtent>)arguments.get(2));
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE___CHECK_STORAGE_ELEMENT__INTEGER_INTEGER_CIM_LOGICALELEMENT_CIM_CONCRETEJOB:
				return CheckStorageElement((Integer)arguments.get(0), (Integer)arguments.get(1), (CIM_LogicalElement)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_SpareConfigurationServiceImpl
