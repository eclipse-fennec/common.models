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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM IKESA Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IKESAEndpoint is created in the first phase of SA negotiation and protects the key negotiation traffic. This endpoint is only created when IKE is the key exchange protocol. Other protocols and their endpoints will be defined in a future release.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getInitiatorCookie <em>Initiator Cookie</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getResponderCookie <em>Responder Cookie</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getCipherAlgorithm <em>Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherCipherAlgorithm <em>Other Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherHashAlgorithm <em>Other Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKESAEndpoint#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IKESAEndpoint extends CIM_SecurityAssociationEndpoint {
	/**
	 * Returns the value of the '<em><b>Initiator Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the IKE phase 1 negotiation initiator. Combined with the ResponderCookie, this value, in string form, may be used to construct the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Cookie</em>' attribute.
	 * @see #setInitiatorCookie(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_InitiatorCookie()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getInitiatorCookie();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getInitiatorCookie <em>Initiator Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Cookie</em>' attribute.
	 * @see #getInitiatorCookie()
	 * @generated
	 */
	void setInitiatorCookie(Long value);

	/**
	 * Returns the value of the '<em><b>Responder Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the IKE phase 1 negotiation responder. Combined with the InitiatorCookie, this value, in string form, may be used to construct the value of the key field 'Name', inherited from ServiceAccessPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responder Cookie</em>' attribute.
	 * @see #setResponderCookie(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_ResponderCookie()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getResponderCookie();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getResponderCookie <em>Responder Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responder Cookie</em>' attribute.
	 * @see #getResponderCookie()
	 * @generated
	 */
	void setResponderCookie(Long value);

	/**
	 * Returns the value of the '<em><b>Cipher Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CipherAlgorithm is an enumeration that specifies the encryption algorithm used by the IKESAEndpoint. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Algorithm</em>' attribute.
	 * @see #setCipherAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_CipherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8..65000\",\"65001..65535\"]' Values='[\"Unknown\",\"Other\",\"DES\",\"IDEA\",\"Blowfish\",\"RC5\",\"3DES\",\"CAST\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherCipherAlgorithm\"]'"
	 * @generated
	 */
	Integer getCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getCipherAlgorithm <em>Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Algorithm</em>' attribute.
	 * @see #getCipherAlgorithm()
	 * @generated
	 */
	void setCipherAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Cipher Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherAlgorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Cipher Algorithm</em>' attribute.
	 * @see #setOtherCipherAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_OtherCipherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.CipherAlgorithm\"]'"
	 * @generated
	 */
	String getOtherCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherCipherAlgorithm <em>Other Cipher Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Cipher Algorithm</em>' attribute.
	 * @see #getOtherCipherAlgorithm()
	 * @generated
	 */
	void setOtherCipherAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HashAlgorithm is an enumeration that specifies the hash function used by the IKESAEndpoint. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #setHashAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_HashAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..65000\",\"65001..65535\"]' Values='[\"Unknown\",\"Other\",\"MD5\",\"SHA-1\",\"Tiger\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherHashAlgorithm\"]'"
	 * @generated
	 */
	Integer getHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getHashAlgorithm <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #getHashAlgorithm()
	 * @generated
	 */
	void setHashAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the hash function when the value 1 ("Other") is specified for the property, HashAlgorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Hash Algorithm</em>' attribute.
	 * @see #setOtherHashAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_OtherHashAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.HashAlgorithm\"]'"
	 * @generated
	 */
	String getOtherHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherHashAlgorithm <em>Other Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Hash Algorithm</em>' attribute.
	 * @see #getOtherHashAlgorithm()
	 * @generated
	 */
	void setOtherHashAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuthenticationMethod is an enumeration that specifies the operation of the IKESAEndpoint. The list of methods was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see #setAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_AuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..65000\",\"65001..65535\"]' Values='[\"Unknown\",\"Other\",\"Pre-shared Key\",\"DSS Signatures\",\"RSA Signatures\",\"Encryption with RSA\",\"Revised Encryption with RSA\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherAuthenticationMethod\"]'"
	 * @generated
	 */
	Integer getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Method</em>' attribute.
	 * @see #getAuthenticationMethod()
	 * @generated
	 */
	void setAuthenticationMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the method when the value 1 ("Other") is specified for the property, AuthenticationMethod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #setOtherAuthenticationMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_OtherAuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.AuthenticationMethod\"]'"
	 * @generated
	 */
	String getOtherAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getOtherAuthenticationMethod <em>Other Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Authentication Method</em>' attribute.
	 * @see #getOtherAuthenticationMethod()
	 * @generated
	 */
	void setOtherAuthenticationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GroupId specifies the key exchange group ID. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3= 'Elliptic Curve Group with 155 bit field element', Group 4= 'Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_GroupId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"No Group/Non-Diffie-Hellman Exchange\",\"DH-768 bit prime\",\"DH-1024 bit prime\",\"EC2N-155 bit field element\",\"EC2N-185 bit field element\",\"DH-1536 bit prime\",\"Standard Group - Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2412.IETF|Appendix E\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.VendorID\"]'"
	 * @generated
	 */
	Integer getGroupId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VendorID identifies the vendor when the value of GroupID is in the vendor-specific range, 32768 to 65535.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKESAEndpoint_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.GroupId\"]'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKESAEndpoint#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

} // CIM_IKESAEndpoint
