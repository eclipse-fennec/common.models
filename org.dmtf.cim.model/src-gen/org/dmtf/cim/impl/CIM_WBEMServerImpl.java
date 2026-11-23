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

import org.dmtf.cim.CIM_WBEMServer;
import org.dmtf.cim.CIM_WBEMServerNamespace;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM WBEM Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_WBEMServerImpl extends CIM_ServiceImpl implements CIM_WBEMServer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WBEMServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WBEMServer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateWBEMServerNamespace(String NamespaceTemplate, CIM_WBEMServerNamespace Namespace, EList<String> Errors) {
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
			case CimPackage.CIM_WBEM_SERVER___CREATE_WBEM_SERVER_NAMESPACE__STRING_CIM_WBEMSERVERNAMESPACE_ELIST:
				return CreateWBEMServerNamespace((String)arguments.get(0), (CIM_WBEMServerNamespace)arguments.get(1), (EList<String>)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_WBEMServerImpl
