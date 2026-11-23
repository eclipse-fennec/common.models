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
 * A representation of the model object '<em><b>CIM Key Based Credential Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_KeyBasedCredentialManagementService manages key based credentials such as symmetric and assymetric key pairs and certificates. It also manages the infrustracture necessary for the key based credentials such as key repositories.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KeyBasedCredentialManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' ClassConstraint='[\"/* The constraints below aim to efficiently \052/  /* represent a singular OctetString. Each of the properties\052/  /* is a single encoded string, thus only the first element \052/  /* needs to be populated. \052/ inv:self.ImportPublicPrivateKeyPair.PublicKey-&gt;size()=1 and self.ImportPublicPrivateKeyPair.PrivateKey-&gt;size()=1\"]' UMLPackagePath='CIM::User::SecurityServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_KeyBasedCredentialManagementService extends CIM_CredentialManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to request an import of public/private key pair. The method is used when assymetric private/public keys are generated elsewhere but are required by the managed system for creation of Certificate Signing Requests (CSRs) or self-signed certificates or any other key based credentials. Upon the successful execution, the PPKPCredential shall be the reference to the CIM_UnsignedCredential instance representing the private/public key pair. The CIM_UnsignedCredential instance shall be associated through CIM_MemberOfCollection association with the instance of CIM_Keystore referenced by the Keystore parameter, and shall be associated through the CIM_AffectsElement association with the method invocation instance of CIM_KeyBasedCredentialManagementService.
	 * @param PublicKey The DER-encoded raw public key.Only the first element of the array property shall be populated.
	 * @param PrivateKey The DER-encoded raw private key.Only the first element of the array property shall be populated.
	 * @param Keystore The reference to the CIM_Keystore instance representing the key store, which the public/private key pair is imported in to.
	 * @param CredentialContext The managed element that represents the user or owner or the scoping element of the certificate. Such managed element could be the web service that owns the certificate or uses it for verification or account that the certificate is scoped to.
	 * @param Usage The usage of the certificate by the managed element that the certificate is for or is scoped to.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If method returns 4096 - Job Started, then this parameter shall not be NULL.
	 * @param PPKPCredential The PPKPCredential output parameter references the instance of CIM_UnsignedCredential that represents the public/private key pair.
	 * <!-- end-model-doc -->
	 * @model PublicKeyUnique="false" PublicKeyMany="true"
	 *        PublicKeyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' Octetstring='true'" PrivateKeyUnique="false" PrivateKeyMany="true"
	 *        PrivateKeyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' Octetstring='true'" KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' Required='true' In='true'" CredentialContextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" UsageAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Trusted for Authentication\",\"Trusted for Authorization\",\"Trusted for Authentication/Authorization\",\"Trusted for Third-Party Authentication/Authorization\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CredentialContext.Usage\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" PPKPCredentialAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UnsignedCredential REF' Required='true' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ImportPublicPrivateKeyPair(EList<String> PublicKey, EList<String> PrivateKey, CIM_Keystore Keystore, CIM_ManagedElement CredentialContext, Integer Usage, CIM_ConcreteJob Job, CIM_UnsignedCredential PPKPCredential);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to request a creation of a keystore repository to be used for storage of the key based credentials. Upon the successful execution, the NewKeystore parameter shall reference to the newly created instance of CIM_Keystore. The property values of the newly created instance of the CIM_Keystore shall match all the non-null, non-key properties of the Keystore parameter embedded instance. The newly created CIM_Keystore instance shall be associated to the instance CIM_System referenced by the OwningSystem parameter using CIM_OwningCollectionElement association, shall be associated with the CIM_KeyBasedCredentialManagementService instance using the CIM_ServiceAffectsElement association, and shall be associated to the instances of CIM_Service referenced in the KeystoreUtilizers using CIM_Dependency association.
	 * @param Keystore The Keystore parameter contains the desired CIM_Keystore instance. The embedded instance shall contain the ElementName and Usage properties.
	 * @param OwningSystem The OwningSystem parameter references to the desired CIM_System instance that represents the owning managed system for the keystore.
	 * @param KeystoreUtilizers The KeystoreUtilizers parameter contains an array of references to the instances of ManagedElement that represent the managed element that would utilize the keystore. Such services could be web services or protocol services that utilize the credentials stored in the keystore for the identity verification purposes.
	 * @param Job Contains a reference to the ConcreteJob created to track the execution initiated by the method invocation. If method returns 4096 - Job Started, then this parameter shall not be NULL.
	 * @param NewKeystore The NewKeystore output parameter references the instance of CIM_Keystore that represents the newly created keystore repository.
	 * <!-- end-model-doc -->
	 * @model KeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' EmbeddedInstance='CIM_Keystore'" OwningSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' Required='true' In='true'" KeystoreUtilizersUnique="false" KeystoreUtilizersMany="true"
	 *        KeystoreUtilizersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' In='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" NewKeystoreAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Keystore REF' Required='true' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error Occured\",\"Busy\",\"Invalid Reference\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long CreateKeystore(String Keystore, CIM_System OwningSystem, EList<CIM_ManagedElement> KeystoreUtilizers, CIM_ConcreteJob Job, CIM_Keystore NewKeystore);

} // CIM_KeyBasedCredentialManagementService
