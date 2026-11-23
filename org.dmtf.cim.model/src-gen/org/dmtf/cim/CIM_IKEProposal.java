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
 * A representation of the model object '<em><b>CIM IKE Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IKEProposal contains the parameters necessary to drive the phase 1 IKE negotiation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getMaxLifetimeSeconds <em>Max Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getMaxLifetimeKilobytes <em>Max Lifetime Kilobytes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getCipherAlgorithm <em>Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getOtherCipherAlgorithm <em>Other Cipher Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getOtherHashAlgorithm <em>Other Hash Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getOtherAuthenticationMethod <em>Other Authentication Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IKEProposal#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IKEProposal extends CIM_SAProposal {
	/**
	 * Returns the value of the '<em><b>Max Lifetime Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxLifetimeSeconds specifies the maximum time the IKE message sender proposes for an SA to be considered valid after it has been created. A value of zero indicates that the default of 8 hours be used. A non-zero value indicates the maximum seconds lifetime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Lifetime Seconds</em>' attribute.
	 * @see #setMaxLifetimeSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_MaxLifetimeSeconds()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.MaxLifetimeSeconds\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeSeconds\"]' PUnit='second'"
	 * @generated
	 */
	Long getMaxLifetimeSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getMaxLifetimeSeconds <em>Max Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lifetime Seconds</em>' attribute.
	 * @see #getMaxLifetimeSeconds()
	 * @generated
	 */
	void setMaxLifetimeSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Max Lifetime Kilobytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxLifetimeKilobytes specifies the maximum kilobyte lifetime the IKE message sender proposes for an SA to be considered valid after it has been created. A value of zero (the default) indicates that there should be no maximum kilobyte lifetime. A non-zero value specifies the desired kilobyte lifetime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Lifetime Kilobytes</em>' attribute.
	 * @see #setMaxLifetimeKilobytes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_MaxLifetimeKilobytes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.MaxLifetimeKilobytes\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeKilobytes\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getMaxLifetimeKilobytes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getMaxLifetimeKilobytes <em>Max Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lifetime Kilobytes</em>' attribute.
	 * @see #getMaxLifetimeKilobytes()
	 * @generated
	 */
	void setMaxLifetimeKilobytes(Long value);

	/**
	 * Returns the value of the '<em><b>Cipher Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CipherAlgorithm is an enumeration that specifies the proposed encryption algorithm. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list and aligns with the values in IKESAEndpoint.CipherAlgorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Algorithm</em>' attribute.
	 * @see #setCipherAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_CipherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8..65000\",\"65001..65535\"]' Values='[\"Other\",\"DES\",\"IDEA\",\"Blowfish\",\"RC5\",\"3DES\",\"CAST\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.CipherAlgorithm\",\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.CipherAlgorithm\",\"CIM_IKEProposal.OtherCipherAlgorithm\"]'"
	 * @generated
	 */
	Integer getCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getCipherAlgorithm <em>Cipher Algorithm</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_OtherCipherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherCipherAlgorithm\",\"CIM_IKEProposal.CipherAlgorithm\"]'"
	 * @generated
	 */
	String getOtherCipherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getOtherCipherAlgorithm <em>Other Cipher Algorithm</em>}' attribute.
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
	 * HashAlgorithm is an enumeration that specifies the proposed hash function. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list and aligns with the values in IKESAEndpoint.HashAlgorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #setHashAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_HashAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5..65000\",\"65001..65535\"]' Values='[\"Other\",\"MD5\",\"SHA-1\",\"Tiger\",\"DMTF/IANA Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.HashAlgorithm\",\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.HashAlgorithm\",\"CIM_IKEProposal.OtherHashAlgorithm\"]'"
	 * @generated
	 */
	Integer getHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getHashAlgorithm <em>Hash Algorithm</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_OtherHashAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherHashAlgorithm\",\"CIM_IKEProposal.HashAlgorithm\"]'"
	 * @generated
	 */
	String getOtherHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getOtherHashAlgorithm <em>Other Hash Algorithm</em>}' attribute.
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
	 * AuthenticationMethod is an enumeration that specifies the proposed authentication. The list of methods was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list and aligns with the values in IKESAEndpoint.AuthenticationMethod. There is one change to the list - the value 65000 has special meaning. It is a special value that indicates that this particular proposal should be repeated once for each authentication method corresponding to credentials installed on the machine. For example, if the system has a pre-shared key and an public-key certificate, a proposal list would be constructed which includes a proposal that specifies a pre-shared key and a proposal for any of the public-key certificates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see #setAuthenticationMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_AuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7..64999\",\"65000\",\"65001..65535\"]' Values='[\"Other\",\"Pre-shared Key\",\"DSS Signatures\",\"RSA Signatures\",\"Encryption with RSA\",\"Revised Encryption with RSA\",\"DMTF/IANA Reserved\",\"Any\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.AuthenticationMethod\",\"RFC2409.IETF|Appendix A\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.AuthenticationMethod\",\"CIM_IKEProposal.OtherAuthenticationMethod\"]'"
	 * @generated
	 */
	Integer getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_OtherAuthenticationMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.OtherAuthenticationMethod\",\"CIM_IKEProposal.AuthenticationMethod\"]'"
	 * @generated
	 */
	String getOtherAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getOtherAuthenticationMethod <em>Other Authentication Method</em>}' attribute.
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
	 * The property GroupId specifies the proposed phase 1 security association key exchange group. This property is ignored for all aggressive mode exchanges (IKEAction.ExchangeMode = 4). If the GroupID number is from the vendor-specific range (32768-65535), the property VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3 ='Elliptic Curve Group with 155 bit field element', Group 4= 'Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_GroupId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"No Group/Non-Diffie-Hellman Exchange\",\"DH-768 bit prime\",\"DH-1024 bit prime\",\"EC2N-155 bit field element\",\"EC2N-185 bit field element\",\"DH-1536 bit prime\",\"Standard Group - Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEProposal.GroupID\",\"RFC2412.IETF|Appendix E\"]' ModelCorrespondence='[\"CIM_IKESAEndpoint.GroupID\",\"CIM_IKEProposal.VendorID\"]'"
	 * @generated
	 */
	Integer getGroupId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getGroupId <em>Group Id</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IKEProposal_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IKESAEndpoint.VendorID\",\"CIM_IKEProposal.GroupId\"]'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IKEProposal#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

} // CIM_IKEProposal
