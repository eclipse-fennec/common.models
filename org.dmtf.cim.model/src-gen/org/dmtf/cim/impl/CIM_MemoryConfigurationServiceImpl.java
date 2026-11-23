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

import org.dmtf.cim.CIM_MemoryConfigurationService;
import org.dmtf.cim.CIM_ResourcePool;
import org.dmtf.cim.CIM_VisibleMemory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_MemoryConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_MemoryConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AllocateFromPool(CIM_ResourcePool Pool, EList<String> Goal, EList<CIM_VisibleMemory> MemoryExtents) {
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
	public Long ReturnToPool(EList<CIM_VisibleMemory> MemoryExtent) {
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
			case CimPackage.CIM_MEMORY_CONFIGURATION_SERVICE___ALLOCATE_FROM_POOL__CIM_RESOURCEPOOL_ELIST_ELIST:
				return AllocateFromPool((CIM_ResourcePool)arguments.get(0), (EList<String>)arguments.get(1), (EList<CIM_VisibleMemory>)arguments.get(2));
			case CimPackage.CIM_MEMORY_CONFIGURATION_SERVICE___RETURN_TO_POOL__ELIST:
				return ReturnToPool((EList<CIM_VisibleMemory>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_MemoryConfigurationServiceImpl
