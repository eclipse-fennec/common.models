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
import org.dmtf.cim.CIM_KeyBasedCredentialManagementService;
import org.dmtf.cim.CIM_Keystore;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CIM_UnsignedCredential;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Key Based Credential Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_KeyBasedCredentialManagementServiceImpl extends CIM_CredentialManagementServiceImpl implements CIM_KeyBasedCredentialManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_KeyBasedCredentialManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_KeyBasedCredentialManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ImportPublicPrivateKeyPair(EList<String> PublicKey, EList<String> PrivateKey, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, Integer Usage, CIM_ConcreteJob Job, CIM_UnsignedCredential PPKPCredential) {
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
	public Long CreateKeystore(String Keystore, CIM_System OwningSystem, EList<CIM_ManagedElement> KeystoreUtilizers, CIM_ConcreteJob Job, CIM_Keystore NewKeystore) {
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
			case CimPackage.CIM_KEY_BASED_CREDENTIAL_MANAGEMENT_SERVICE___IMPORT_PUBLIC_PRIVATE_KEY_PAIR__ELIST_ELIST_CIM_KEYSTORE_CIM_MANAGEDELEMENT_INTEGER_CIM_CONCRETEJOB_CIM_UNSIGNEDCREDENTIAL:
				return ImportPublicPrivateKeyPair((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (CIM_Keystore)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (Integer)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (CIM_UnsignedCredential)arguments.get(6));
			case CimPackage.CIM_KEY_BASED_CREDENTIAL_MANAGEMENT_SERVICE___CREATE_KEYSTORE__STRING_CIM_SYSTEM_ELIST_CIM_CONCRETEJOB_CIM_KEYSTORE:
				return CreateKeystore((String)arguments.get(0), (CIM_System)arguments.get(1), (EList<CIM_ManagedElement>)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (CIM_Keystore)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_KeyBasedCredentialManagementServiceImpl
