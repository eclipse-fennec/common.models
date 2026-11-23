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

import org.dmtf.cim.CIM_PersistentMemoryNamespace;
import org.dmtf.cim.CIM_PersistentMemoryService;
import org.dmtf.cim.CIM_ResourcePool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Persistent Memory Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_PersistentMemoryServiceImpl extends CIM_ServiceImpl implements CIM_PersistentMemoryService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PersistentMemoryServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PersistentMemoryService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AllocateFromPool(CIM_ResourcePool Pool, String Goal, CIM_PersistentMemoryNamespace Namespace) {
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
	public Long ReturnToPool(CIM_PersistentMemoryNamespace Namespace) {
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
	public Long ModifyNamespace(CIM_PersistentMemoryNamespace Namespace, String Goal) {
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
			case CimPackage.CIM_PERSISTENT_MEMORY_SERVICE___ALLOCATE_FROM_POOL__CIM_RESOURCEPOOL_STRING_CIM_PERSISTENTMEMORYNAMESPACE:
				return AllocateFromPool((CIM_ResourcePool)arguments.get(0), (String)arguments.get(1), (CIM_PersistentMemoryNamespace)arguments.get(2));
			case CimPackage.CIM_PERSISTENT_MEMORY_SERVICE___RETURN_TO_POOL__CIM_PERSISTENTMEMORYNAMESPACE:
				return ReturnToPool((CIM_PersistentMemoryNamespace)arguments.get(0));
			case CimPackage.CIM_PERSISTENT_MEMORY_SERVICE___MODIFY_NAMESPACE__CIM_PERSISTENTMEMORYNAMESPACE_STRING:
				return ModifyNamespace((CIM_PersistentMemoryNamespace)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_PersistentMemoryServiceImpl
