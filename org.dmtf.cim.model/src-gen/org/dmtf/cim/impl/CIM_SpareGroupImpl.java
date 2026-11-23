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

import org.dmtf.cim.CIM_ManagedSystemElement;
import org.dmtf.cim.CIM_SpareGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Spare Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_SpareGroupImpl extends CIM_RedundancyGroupImpl implements CIM_SpareGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SpareGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SpareGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Failover(CIM_ManagedSystemElement FailoverFrom, CIM_ManagedSystemElement FailoverTo) {
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
			case CimPackage.CIM_SPARE_GROUP___FAILOVER__CIM_MANAGEDSYSTEMELEMENT_CIM_MANAGEDSYSTEMELEMENT:
				return Failover((CIM_ManagedSystemElement)arguments.get(0), (CIM_ManagedSystemElement)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_SpareGroupImpl
