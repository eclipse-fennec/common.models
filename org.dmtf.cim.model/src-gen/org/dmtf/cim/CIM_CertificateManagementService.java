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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Certificate Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CertificateManagementService is used for managing X509 based certificates.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' ClassConstraint='[\"/* The constraints below aim to efficiently \052/  /* represent a singular OctetString. Each of the properties\052/  /* is a single encoded string, thus only the first element \052/  /* needs to be populated. \052/ inv:self.CreateCertificateSigningRequest.Subject-&gt;size()&lt;=1 and self.CreateCertificateSigningRequest.AltSubject-&gt;size()&lt;=1 and self.CreateCertificateSigningRequest.CSR-&gt;size()=1 and self.CreateSelfSignedCertificate.Subject-&gt;size()&lt;=1 and self.CreateSelfSignedCertificate.AltSubject-&gt;size()&lt;=1 and self.ImportEncodedCertificates.EncodedCertificates-&gt;size()=1 and self.ApplyCRL.EncodedCRL-&gt;size()=1 and self.ExportEncodedCertificates.EncodedCertificates-&gt;size()=1\"]' UMLPackagePath='CIM::User::SecurityServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_CertificateManagementService extends CIM_KeyBasedCredentialManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to request a Certificate Signing Request (CSR) based on the Distinguished Name provided through Subject parameter. The CSR utilizes PKCS#10 structure as defined in RFC2986. If either Subject parameter or AltSubject parameter are NULL, the method shall return 2 (Error Occured). If the PublicPrivateKeyPair parameter is NULL, then 1) PublicKeyAlgorithm shall specify the algorithm to be used for the public key, 2) the PublicKeySize shall specify the length for the public key in bits. If the PublicPrivateKeyPair parameter is NOT NULL then the following requirements shall apply: 1) the PublicKeyAlgorithm shall be NULL, 2) the PublicKeySize shall be NULL, 3) the PublicPrivateKeyPair shall reference an instance of CIM_UnsignedCredential representing the public/ private key pair to be used for the CSR. The OutputFormat parameter shall specify the output format of the CSR. If the OutputFormat parameter has a value that is not equal to any values in the OutputFormatsSupported property on the associated CIM_CertificateManagementCapabilities instance, then the method shall return 2 (Error Occured). Upon the successful execution, the CSR output parameter shall contain the CSR in PKCS#10 structure.
	 * @param Subject Subject shall contain information as required by section 4.1.2.6 of RFC 3280 and shall be formatted based on RFC 4514. An example of the value of the Subject parameter could be "CN=Marshall T. Rose, O=Dover Beach Consulting, L=Santa Clara, ST=California, C=US".
	 * @param AltSubject Alternate subject identifier for the Certificate as specified by section 4.2.1.8 of RFC 3280.
	 * @param PublicKeyAlgorithm The PublicKeyAlgorithm specifies the algorithm to be used for the public key.
	 * @param PublicKeySize The PublicKeySize shall specify the length for the public key in bits.
	 * @param PublicPrivateKeyPair The PublicPrivateKeyPair parameter specifies a reference to an instance of CIM_UnsignedCredential which represents a public private key pair to be utilized by the CSR.The CIM_UnsignedCredential instance PublicKey and PublicKeyEncoding properties shall not be NULL.
	 * @param ExtendedKeyUsageValue The ExtendedKeyUsageValue indicates one or more purposes for which the certified public key may be used in the type specified by the ExtendedKeyUsageType parameter.
	 * @param ExtendedKeyUsageType Describes the type for ExtendedKeyUsageValue based on the ASN.1 GeneralName types.
	 * @param SignatureAlgorithm The SignatureAlgorithm parameter defines the signature algorithm used to sign the CertificateRequestInfo as part of the CSR as defined in RFC 2986. This parameter covers the algorithms specified in the RFC3279.
	 * @param OutputFormat The OutputFormat property represents the requested format of the Certificate Signing Request.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param CSR The CSR parameter is an output parameter that upon successful exection of this method will contain the formated Certificate Signing Request.Only the first element of the array property shall be populated.
	 * <!-- end-model-doc -->
	 * @model SubjectAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' DN='true'" AltSubjectAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" PublicKeyAlgorithmAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"RSA\",\"DSA\",\"ECDSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'" PublicKeySizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' PUnit='bit'" PublicPrivateKeyPairAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UnsignedCredential REF' In='true'" ExtendedKeyUsageValueUnique="false" ExtendedKeyUsageValueMany="true"
	 *        ExtendedKeyUsageValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CertificateManagementService.CreateCertificateSigningRequest.ExtendedKeyUsageType\"]'" ExtendedKeyUsageTypeUnique="false" ExtendedKeyUsageTypeMany="true"
	 *        ExtendedKeyUsageTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"32768..65535\"]' Values='[\"other\",\"rfc822Name\",\"dNSName\",\"x400Address\",\"directoryName\",\"ediPartyName\",\"uniformResourceIdentifier\",\"iPAddress\",\"registeredID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CertificateManagementService.CreateCertificateSigningRequest.ExtendedKeyUsageValue\"]'" SignatureAlgorithmAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20..32767\",\"32768..65535\"]' Values='[\"Other\",\"SHA1withDSA\",\"SHA1withECDSA\",\"SHA224withECDSA\",\"SHA256withECDSA\",\"SHA384withECDSA\",\"SHA512withECDSA\",\"GOST3411withGOST3410\",\"GOST3411withECGOST3410\",\"MD2withRSA\",\"MD5withRSA\",\"SHA1withRSA\",\"SHA224withRSA\",\"SHA256withRSA\",\"SHA384withRSA\",\"SHA512withRSA\",\"RIPEMD160withRSA\",\"RIPEMD128withRSA\",\"RIPEMD256withRSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'" OutputFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"PEM\",\"DER\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" CSRUnique="false" CSRMany="true"
	 *        CSRAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='false' Out='true' Octetstring='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateCertificateSigningRequest(String Subject, String AltSubject, Integer PublicKeyAlgorithm, Integer PublicKeySize, CIM_UnsignedCredential PublicPrivateKeyPair, EList<String> ExtendedKeyUsageValue, EList<Integer> ExtendedKeyUsageType, Integer SignatureAlgorithm, Integer OutputFormat, CIM_ConcreteJob Job, EList<String> CSR);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to generate to generate a self-signed certificate. If either Subject parameter or AltSubject parameter are NULL, the method shall return 2 (Error Occured). If the PublicPrivateKeyPair parameter is NULL, the following numbered requirements shall apply: 1) the PublicKeyAlgorithm shall be non-NULL and specify the algorithm to be used for the public key, 3) the PublicKeySize shall be non-NULL and specify the length for the public key in bits. If the PublicPrivateKeyPair parameter is not NULL, the following numbered requirements shall apply: 1) the PublicKeyAlgorithm shall be NULL, 2) the PublicKeySize shall be NULL, 3) the PublicPrivateKeyPair shall reference an instance of CIM_UnsignedCredential representing the public/ private key pair to be used for the self signed certificate. Upon successful execution the reference to the newly created instance of CIM_X509Certificate shall be returned in the NewCertificate parameter which represents the self-signed certificate with the public/private key pair of the size specified by the KeySize parameter. If the Keystore parameter is not NULL, this instance shall be associated to the instance of CIM_Keystore referenced by the Keystore parameter through CIM_MemberOfCollection association. If the CredentialContext parameter is not NULL, the newly created instance shall be associated with the instance of CIM_ManagedElement referenced by the CredentialContext parameter through CIM_CredentialContext association. If the CredentialContext parameter is NULL, the newly created instance shall not be associated with the instance of CIM_ManagedElement through CIM_CredentialContext association.
	 * @param Subject Subject shall contain the information as required by section 4.1.2.6 of RFC 3280 and shall be formatted based on RFC 4514. An example of the value of the Subject parameter could be "CN=Marshall T. Rose, O=Dover Beach Consulting, OU=Sales, L=Santa Clara, ST=California, C=US".
	 * @param AltSubject Alternate subject identifier for the Certificate as specified by section 4.2.1.8 of RFC 3280.
	 * @param PublicKeyAlgorithm The PublicKeyAlgorithm specifies the algorithm to be used for the public key.
	 * @param PublicKeySize The PublicKeySize shall specify the length for the public key in bits. The value shall be of power of 2.
	 * @param PublicPrivateKeyPair The PublicPrivateKeyPair parameter specifies a reference to an instance of CIM_UnsignedCredential which represents a public private key pair to be utilized by the newly created selef signed certificate. The PublicKey and PublicKeyEncodingproperties of the instance of CIM_UnsignedCredentialshall be Non-NULL.
	 * @param Keystore The Keystore parameter denotes the reference to the instance of CIM_Keystore that represents the key store where the new certificate will be added.
	 * @param CredentialContext The managed element that represents the user or owner or the scoping element of the certificate. Such managed element could be the web service that owns the certificate or uses it for verification or account that the certificate is scoped to.
	 * @param Usage The usage of the certificate by the managed element that the certificate is for or is scoped to.
	 * @param SignatureAlgorithm The SignatureAlgorithm parameter defines the signature algorithm used to sign the TBSCertificate as defined in RFC 3280. This parameter covers the algorithms specified in the RFC3279.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param SelfSignedCertificate Reference to the newly created instance of CIM_X509Certificate representing the self signed certificate.
	 * <!-- end-model-doc -->
	 * @model SubjectAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' DN='true'" AltSubjectAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" PublicKeyAlgorithmAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"RSA\",\"DSA\",\"ECDSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'" PublicKeySizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' PUnit='bit'" PublicPrivateKeyPairAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UnsignedCredential REF' In='true'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" UsageAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Trusted for Authentication\",\"Trusted for Authorization\",\"Trusted for Authentication/Authorization\",\"Trusted for Third-Party Authentication/Authorization\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CredentialContext.Usage\"]'" SignatureAlgorithmAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20..32767\",\"32768..65535\"]' Values='[\"Other\",\"SHA1withDSA\",\"SHA1withECDSA\",\"SHA224withECDSA\",\"SHA256withECDSA\",\"SHA384withECDSA\",\"SHA512withECDSA\",\"GOST3411withGOST3410\",\"GOST3411withECGOST3410\",\"MD2withRSA\",\"MD5withRSA\",\"SHA1withRSA\",\"SHA224withRSA\",\"SHA256withRSA\",\"SHA384withRSA\",\"SHA512withRSA\",\"RIPEMD160withRSA\",\"RIPEMD128withRSA\",\"RIPEMD256withRSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SelfSignedCertificateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509Certificate REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateSelfSignedCertificate(String Subject, String AltSubject, Integer PublicKeyAlgorithm, Integer PublicKeySize, CIM_UnsignedCredential PublicPrivateKeyPair, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, Integer Usage, Integer SignatureAlgorithm, CIM_ConcreteJob Job, CIM_X509Certificate SelfSignedCertificate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to import a certificate or a certificate chain using the certificate's encoded representation. Upon successful execution the array of references to the instance(s) of CIM_X509Certificate representing the imported certificate or certificate chain shall be returned inside the NewCertificates output parameter. If the Keystore parameter is not NULL, the newly created instance(s) of CIM_X509Certificate shall be associated to the instance of the CIM_Keystore referenced in the Keystore parameter. If the CredentialContext parameter is not NULL, the newly created instance(s) of the CIM_X509Certificate shall be associated to the insatnces of CIM_ManagedElement referenced in the CredentialContext property through the CIM_CredentialContext association. If the CredentialContext parameter is NULL, the newly created instance(s) of the CIM_X509Certificate shall not be associated to the insatnces of CIM_ManagedElement through the CIM_CredentialContext association.
	 * @param EncodedCertificates An array of strings representing octet string of an encoded certificate or certificate chain to be imported. Only the first element of the array property shall be populated, even if a certificate chain is imported.
	 * @param Format The Format shall specify the format for the encoding that is used by octet string EncodedCertificates parameter.
	 * @param Keystore The Keystore parameter denotes the reference to the instance of CIM_Keystore that represents the key store where the new certificate or certificate chain will be added.
	 * @param CredentialContext The managed element that represents the user or owner or the scoping element of the certificate(s). Such managed element could be the web service that owns the certificate(s) or uses it for verification or account that the certificate is scoped to.
	 * @param Usage The usage of the certificate by the managed element that the certificate is for or is scoped to. If a certificate chain is imported, the sequence of elements in the Usage array shall correspond to the sequence of the certificates in the EncodedCertificates octet string parameter.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param NewCertificates Reference to the newly created instance of CIM_X509Certificate representing the imported certificate or certificate chain.
	 * <!-- end-model-doc -->
	 * @model EncodedCertificatesUnique="false" EncodedCertificatesMany="true"
	 *        EncodedCertificatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' Octetstring='true'" FormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"DER\",\"PEM\",\"PKCS7\",\"PKCS12\",\"DMTF Reserved\",\"Vendor Reserved\"]'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" UsageUnique="false" UsageMany="true"
	 *        UsageAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Trusted for Authentication\",\"Trusted for Authorization\",\"Trusted for Authentication/Authorization\",\"Trusted for Third-Party Authentication/Authorization\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CredentialContext.Usage\",\"CIM_CertificateManagementService.ImportEncodedCertificates.NewCertificates\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" NewCertificatesUnique="false" NewCertificatesMany="true"
	 *        NewCertificatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509Certificate REF[]' Required='true' In='false' Out='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CertificateManagementService.ImportEncodedCertificates.Usage\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ImportEncodedCertificates(EList<String> EncodedCertificates, Integer Format, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, EList<Integer> Usage, CIM_ConcreteJob Job, EList<CIM_X509Certificate> NewCertificates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to import a certificate or a certificate chain using an array of embedded instance of CIM_X509Certificate. Upon successful execution the array of references to the instance(s) of CIM_X509Certificate representing the imported certificate or certificate chain shall be returned by the NewCertificates output parameter. If the Keystore parameter is not NULL, the newly created instance(s) of CIM_X509Certificate shall be associated to the instance of the CIM_Keystore referenced in the Keystore parameter. If the CredentialContext parameter is not NULL, the newly created instance(s) of the CIM_X509Certificate shall be associated to the insatnces of CIM_ManagedElement referenced in the CredentialContext property through the CIM_CredentialContext association.If the CredentialContext parameter is NULL, the newly created instance(s) of the CIM_X509Certificate shall not be associated to the insatnces of CIM_ManagedElement through the CIM_CredentialContext association.
	 * @param InputCertificates An array of embedded instance(s) of CIM_X509Certificate that contains the necessary information to import a certificate or a certificate chain.
	 * @param Keystore The Keystore parameter denotes the reference to the instance of CIM_Keystore that represents the key store where the new certificate or certificate chain will be added.
	 * @param CredentialContext The managed element that represents the user or owner or the scoping element of the certificate(s). Such managed element could be the web service that owns the certificate(s) or uses it for verification or account that the certificate is scoped to.
	 * @param Usage The usage of the certificate by the managed element that the certificate is for or is scoped to. If a certificate chain is imported, the sequence of elements in the Usage array shall correspond to the sequence of the certificates in the InputCertificates array parameter.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param NewCertificates Reference to the newly created instance of CIM_X509Certificate representing the imported certificate or certificate chain.
	 * <!-- end-model-doc -->
	 * @model InputCertificatesUnique="false" InputCertificatesMany="true"
	 *        InputCertificatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' EmbeddedInstance='CIM_X509Certificate'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" UsageUnique="false" UsageMany="true"
	 *        UsageAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Trusted for Authentication\",\"Trusted for Authorization\",\"Trusted for Authentication/Authorization\",\"Trusted for Third-Party Authentication/Authorization\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CredentialContext.Usage\",\"CIM_CertificateManagementService.ImportCertificates.InputCertificates\",\"CIM_CertificateManagementService.ImportCertificates.Usage\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" NewCertificatesUnique="false" NewCertificatesMany="true"
	 *        NewCertificatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509Certificate REF[]' Required='true' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ImportCertificates(EList<String> InputCertificates, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, EList<Integer> Usage, CIM_ConcreteJob Job, EList<CIM_X509Certificate> NewCertificates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to export a certificate or a certificate chain using the certificate's encoded representation. Upon successful execution the array of unsigned integers representing octet string of the exported certificate or certificate chain shall be returned inside the EncodedCertificates output parameter based on the encoding specified in the EncodingFormat parameter.
	 * @param CertificatesToExport Reference to the instance(s) of CIM_SignedCredential representing the certificate or certificate chain to be exported.
	 * @param Format The Format parameter specifies the format of the octet string EncodedCertificates parameter.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param EncodedCertificates An array of strings representing octet string of an exported encoded certificate or certificate chain. Only the first element of the array property shall be populated, even if a certificate chain is exported.
	 * <!-- end-model-doc -->
	 * @model CertificatesToExportUnique="false" CertificatesToExportMany="true"
	 *        CertificatesToExportAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509Certificate REF[]' Required='true' In='true'" FormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"DER\",\"Base64\",\"PKCS7\",\"PKCS12\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" EncodedCertificatesUnique="false" EncodedCertificatesMany="true"
	 *        EncodedCertificatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='false' Out='true' Octetstring='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ExportEncodedCertificates(EList<CIM_X509Certificate> CertificatesToExport, Integer Format, CIM_ConcreteJob Job, EList<String> EncodedCertificates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to apply Certificate Revocation List (CRL) using an encoded format. Upon successful execution the references to the instance(s) of CIM_X509CRL representing the applied CRL shall be returned inside the AppliedCRL output parameter. If the Keystore parameter is not NULL, the newly created instance(s) of CIM_X509CRL shall be associated to the instance of the CIM_Keystore referenced in the Keystore parameter. The newly created instance(s) of the CIM_X509CRL shall be associated to the insatnces of CIM_ManagedElement referenced in the CredentialContext property through the CIM_CredentialContext association.
	 * @param EncodedCRL An array of unsigned integers representing octet string of an encoded CRL to be applied. Only the first element of the array property shall be populated.
	 * @param Format The Format shall specify the format for the encoding that is used by octet string EncodedCRL parameter.
	 * @param Keystore The Keystore parameter denotes the reference to the instance of CIM_Keystore that represents the key store where the CRL will be applied.
	 * @param CredentialContext The managed element that represents the service or the managed element for which the certificates were revoked by the application of the CRL.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param AppliedCRL Reference to the newly created instance of CIM_X509CRL representing the applied CRL.
	 * <!-- end-model-doc -->
	 * @model EncodedCRLUnique="false" EncodedCRLMany="true"
	 *        EncodedCRLAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' Octetstring='true'" FormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"DER\",\"PEM\",\"PKCS7\",\"PKCS12\",\"DMTF Reserved\",\"Vendor Reserved\"]'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" AppliedCRLAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509CRL REF' Required='true' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ApplyCRL(EList<String> EncodedCRL, Integer Format, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, CIM_ConcreteJob Job, CIM_X509CRL AppliedCRL);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to apply Certificate Revocation List (CRL) using the decoded format. Upon successful execution the references to the instance(s) of CIM_X509CRL representing the applied CRL shall be returned inside the AppliedCRL output parameter. If the Keystore parameter is not NULL, the newly created instance(s) of CIM_X509CRL shall be associated to the instance of the CIM_Keystore referenced in the Keystore parameter. The newly created instance(s) of the CIM_X509CRL shall be associated to the insatnces of CIM_ManagedElement referenced in the CredentialContext property through the CIM_CredentialContext association.
	 * @param Issuer Issuer represents the information about the issuer of the CRL. The Issuer property shall contain information as required by section 4.1.2.4 of RFC 3280 and shall be formatted based on RFC 4514. An example of the value of the Subject parameter could be "CN=Marshall T. Rose, O=Dover Beach Consulting, OU=Sales, L=Santa Clara, ST=California, C=US".
	 * @param SerialNumbers An array of serial numbers of X.509 certificates that are part of CRL.
	 * @param Keystore The Keystore parameter denotes the reference to the instance of CIM_Keystore that represents the key store where the CRL will be applied.
	 * @param CredentialContext The managed element that represents the service or the managed element for which the certificates were revoked by the application of the CRL.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If the method returns 4096 - job started, then the parameter shall not have NULL value.
	 * @param AppliedCRL Reference to the newly created instance of CIM_X509CRL representing the applied CRL.
	 * <!-- end-model-doc -->
	 * @model IssuerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' DN='true'" SerialNumbersUnique="false" SerialNumbersMany="true"
	 *        SerialNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' Octetstring='true'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" AppliedCRLAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_X509CRL REF' Required='true' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ApplyDecodedCRL(String Issuer, EList<String> SerialNumbers, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, CIM_ConcreteJob Job, CIM_X509CRL AppliedCRL);

} // CIM_CertificateManagementService
