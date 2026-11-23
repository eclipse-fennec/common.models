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
import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_ResourcePool;
import org.dmtf.cim.CIM_ResourcePoolConfigurationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Resource Pool Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_ResourcePoolConfigurationServiceImpl extends CIM_ServiceImpl implements CIM_ResourcePoolConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ResourcePoolConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ResourcePoolConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateResourcePool(String ElementName, EList<CIM_LogicalDevice> HostResources, String ResourceType, CIM_ResourcePool Pool, CIM_ConcreteJob Job) {
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
	public Long CreateChildResourcePool(String ElementName, EList<String> Settings, EList<CIM_ResourcePool> ParentPool, CIM_ResourcePool Pool, CIM_ConcreteJob Job) {
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
	public Long DeleteResourcePool(CIM_ResourcePool Pool, CIM_ConcreteJob Job) {
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
	public Long AddResourcesToResourcePool(EList<CIM_LogicalDevice> HostResources, CIM_ResourcePool Pool, CIM_ConcreteJob Job) {
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
	public Long RemoveResourcesFromResourcePool(EList<CIM_LogicalDevice> HostResources, CIM_ResourcePool Pool, CIM_ConcreteJob Job) {
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
	public Long ChangeParentResourcePool(CIM_ResourcePool ChildPool, EList<CIM_ResourcePool> ParentPool, EList<String> Settings, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___CREATE_RESOURCE_POOL__STRING_ELIST_STRING_CIM_RESOURCEPOOL_CIM_CONCRETEJOB:
				return CreateResourcePool((String)arguments.get(0), (EList<CIM_LogicalDevice>)arguments.get(1), (String)arguments.get(2), (CIM_ResourcePool)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___CREATE_CHILD_RESOURCE_POOL__STRING_ELIST_ELIST_CIM_RESOURCEPOOL_CIM_CONCRETEJOB:
				return CreateChildResourcePool((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<CIM_ResourcePool>)arguments.get(2), (CIM_ResourcePool)arguments.get(3), (CIM_ConcreteJob)arguments.get(4));
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___DELETE_RESOURCE_POOL__CIM_RESOURCEPOOL_CIM_CONCRETEJOB:
				return DeleteResourcePool((CIM_ResourcePool)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___ADD_RESOURCES_TO_RESOURCE_POOL__ELIST_CIM_RESOURCEPOOL_CIM_CONCRETEJOB:
				return AddResourcesToResourcePool((EList<CIM_LogicalDevice>)arguments.get(0), (CIM_ResourcePool)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___REMOVE_RESOURCES_FROM_RESOURCE_POOL__ELIST_CIM_RESOURCEPOOL_CIM_CONCRETEJOB:
				return RemoveResourcesFromResourcePool((EList<CIM_LogicalDevice>)arguments.get(0), (CIM_ResourcePool)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE___CHANGE_PARENT_RESOURCE_POOL__CIM_RESOURCEPOOL_ELIST_ELIST_CIM_CONCRETEJOB:
				return ChangeParentResourcePool((CIM_ResourcePool)arguments.get(0), (EList<CIM_ResourcePool>)arguments.get(1), (EList<String>)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_ResourcePoolConfigurationServiceImpl
