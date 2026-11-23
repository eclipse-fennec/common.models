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

import org.dmtf.cim.CIM_Collection;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_SoftwareIdentity;
import org.dmtf.cim.CIM_SoftwareInstallationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Software Installation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_SoftwareInstallationServiceImpl extends CIM_ServiceImpl implements CIM_SoftwareInstallationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SoftwareInstallationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SoftwareInstallationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CheckSoftwareIdentity(CIM_SoftwareIdentity Source, CIM_ManagedElement Target, CIM_Collection Collection, EList<Integer> InstallCharacteristics) {
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
	public Long InstallFromSoftwareIdentity(CIM_ConcreteJob Job, EList<Integer> InstallOptions, EList<String> InstallOptionsValues, CIM_SoftwareIdentity Source, CIM_ManagedElement Target, CIM_Collection Collection) {
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
	public Long InstallFromURI(CIM_ConcreteJob Job, String URI, CIM_ManagedElement Target, EList<Integer> InstallOptions, EList<String> InstallOptionsValues) {
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
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE___CHECK_SOFTWARE_IDENTITY__CIM_SOFTWAREIDENTITY_CIM_MANAGEDELEMENT_CIM_COLLECTION_ELIST:
				return CheckSoftwareIdentity((CIM_SoftwareIdentity)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_Collection)arguments.get(2), (EList<Integer>)arguments.get(3));
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE___INSTALL_FROM_SOFTWARE_IDENTITY__CIM_CONCRETEJOB_ELIST_ELIST_CIM_SOFTWAREIDENTITY_CIM_MANAGEDELEMENT_CIM_COLLECTION:
				return InstallFromSoftwareIdentity((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (EList<String>)arguments.get(2), (CIM_SoftwareIdentity)arguments.get(3), (CIM_ManagedElement)arguments.get(4), (CIM_Collection)arguments.get(5));
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE___INSTALL_FROM_URI__CIM_CONCRETEJOB_STRING_CIM_MANAGEDELEMENT_ELIST_ELIST:
				return InstallFromURI((CIM_ConcreteJob)arguments.get(0), (String)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (EList<Integer>)arguments.get(3), (EList<String>)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_SoftwareInstallationServiceImpl
