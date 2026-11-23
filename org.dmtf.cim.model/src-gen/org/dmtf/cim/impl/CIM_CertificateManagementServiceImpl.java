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

import org.dmtf.cim.CIM_CertificateManagementService;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_Keystore;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_UnsignedCredential;
import org.dmtf.cim.CIM_X509CRL;
import org.dmtf.cim.CIM_X509Certificate;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Certificate Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_CertificateManagementServiceImpl extends CIM_KeyBasedCredentialManagementServiceImpl implements CIM_CertificateManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CertificateManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CertificateManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateCertificateSigningRequest(String Subject, String AltSubject, Integer PublicKeyAlgorithm, Integer PublicKeySize, CIM_UnsignedCredential PublicPrivateKeyPair, EList<String> ExtendedKeyUsageValue, EList<Integer> ExtendedKeyUsageType, Integer SignatureAlgorithm, Integer OutputFormat, CIM_ConcreteJob Job, EList<String> CSR) {
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
	public Long CreateSelfSignedCertificate(String Subject, String AltSubject, Integer PublicKeyAlgorithm, Integer PublicKeySize, CIM_UnsignedCredential PublicPrivateKeyPair, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, Integer Usage, Integer SignatureAlgorithm, CIM_ConcreteJob Job, CIM_X509Certificate SelfSignedCertificate) {
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
	public Long ImportEncodedCertificates(EList<String> EncodedCertificates, Integer Format, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, EList<Integer> Usage, CIM_ConcreteJob Job, EList<CIM_X509Certificate> NewCertificates) {
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
	public Long ImportCertificates(EList<String> InputCertificates, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, EList<Integer> Usage, CIM_ConcreteJob Job, EList<CIM_X509Certificate> NewCertificates) {
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
	public Long ExportEncodedCertificates(EList<CIM_X509Certificate> CertificatesToExport, Integer Format, CIM_ConcreteJob Job, EList<String> EncodedCertificates) {
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
	public Long ApplyCRL(EList<String> EncodedCRL, Integer Format, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, CIM_ConcreteJob Job, CIM_X509CRL AppliedCRL) {
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
	public Long ApplyDecodedCRL(String Issuer, EList<String> SerialNumbers, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, CIM_ConcreteJob Job, CIM_X509CRL AppliedCRL) {
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
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___CREATE_CERTIFICATE_SIGNING_REQUEST__STRING_STRING_INTEGER_INTEGER_CIM_UNSIGNEDCREDENTIAL_ELIST_ELIST_INTEGER_INTEGER_CIM_CONCRETEJOB_ELIST:
				return CreateCertificateSigningRequest((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (CIM_UnsignedCredential)arguments.get(4), (EList<String>)arguments.get(5), (EList<Integer>)arguments.get(6), (Integer)arguments.get(7), (Integer)arguments.get(8), (CIM_ConcreteJob)arguments.get(9), (EList<String>)arguments.get(10));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___CREATE_SELF_SIGNED_CERTIFICATE__STRING_STRING_INTEGER_INTEGER_CIM_UNSIGNEDCREDENTIAL_CIM_KEYSTORE_CIM_MANAGEDELEMENT_INTEGER_INTEGER_CIM_CONCRETEJOB_CIM_X509CERTIFICATE:
				return CreateSelfSignedCertificate((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (CIM_UnsignedCredential)arguments.get(4), (CIM_Keystore)arguments.get(5), (CIM_ManagedElement)arguments.get(6), (Integer)arguments.get(7), (Integer)arguments.get(8), (CIM_ConcreteJob)arguments.get(9), (CIM_X509Certificate)arguments.get(10));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___IMPORT_ENCODED_CERTIFICATES__ELIST_INTEGER_CIM_KEYSTORE_CIM_MANAGEDELEMENT_ELIST_CIM_CONCRETEJOB_ELIST:
				return ImportEncodedCertificates((EList<String>)arguments.get(0), (Integer)arguments.get(1), (CIM_Keystore)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (EList<Integer>)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (EList<CIM_X509Certificate>)arguments.get(6));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___IMPORT_CERTIFICATES__ELIST_CIM_KEYSTORE_CIM_MANAGEDELEMENT_ELIST_CIM_CONCRETEJOB_ELIST:
				return ImportCertificates((EList<String>)arguments.get(0), (CIM_Keystore)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (EList<Integer>)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (EList<CIM_X509Certificate>)arguments.get(5));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___EXPORT_ENCODED_CERTIFICATES__ELIST_INTEGER_CIM_CONCRETEJOB_ELIST:
				return ExportEncodedCertificates((EList<CIM_X509Certificate>)arguments.get(0), (Integer)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (EList<String>)arguments.get(3));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___APPLY_CRL__ELIST_INTEGER_CIM_KEYSTORE_CIM_MANAGEDELEMENT_CIM_CONCRETEJOB_CIM_X509CRL:
				return ApplyCRL((EList<String>)arguments.get(0), (Integer)arguments.get(1), (CIM_Keystore)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (CIM_X509CRL)arguments.get(5));
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE___APPLY_DECODED_CRL__STRING_ELIST_CIM_KEYSTORE_CIM_MANAGEDELEMENT_CIM_CONCRETEJOB_CIM_X509CRL:
				return ApplyDecodedCRL((String)arguments.get(0), (EList<String>)arguments.get(1), (CIM_Keystore)arguments.get(2), (CIM_ManagedElement)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (CIM_X509CRL)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_CertificateManagementServiceImpl
