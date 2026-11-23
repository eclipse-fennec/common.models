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
 * A representation of the model object '<em><b>CIM IP Network Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPNetworkIdentity is used to represent the various network identities that may be used for an IPProtocolEndpoint. The relationship between the NetworkIdentity and the IPProtocolEndpoint is modeled by the AssignedIdentity association, inherited from CIM_Identity. This association could also be used to relate an address range or other endpoint collection with the Identity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPNetworkIdentity#getIdentityType <em>Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPNetworkIdentity#getIdentityValue <em>Identity Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPNetworkIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::Identity' MappingStrings='[\"IPSP Policy Model.IETF|IKEIdentity\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPNetworkIdentity extends CIM_Identity {
	/**
	 * Returns the value of the '<em><b>Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IdentityType specifies the type of IP network Identity. The list of identities was generated from Section 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Type</em>' attribute.
	 * @see #setIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPNetworkIdentity_IdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"IPV4 Address\",\"FQDN\",\"User FQDN\",\"IPV4 Subnet Address\",\"IPV6 Address\",\"IPV6 Subnet Address\",\"IPV4 Address Range\",\"IPV6 Address Range\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"KEY ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IKEIdentity.IdentityType\",\"RFC2407.IETF|Section 4.6.2.1\"]' ModelCorrespondence='[\"CIM_IPNetworkIdentity.IdentityValue\"]'"
	 * @generated
	 */
	Integer getIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPNetworkIdentity#getIdentityType <em>Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Type</em>' attribute.
	 * @see #getIdentityType()
	 * @generated
	 */
	void setIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Identity Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdentityValue contains a string encoding of the Identity. For Identity instances that are address types, the IdentityValue string value may be omitted and the associated IPProtocolEndpoint, RangeOfIPAddresses or similar class is used to define this information. The class is associated using the AssignedIdentity relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Value</em>' attribute.
	 * @see #setIdentityValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPNetworkIdentity_IdentityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MappingStrings='[\"IPSP Policy Model.IETF|IKEIdentity.IdentityValue\"]' ModelCorrespondence='[\"CIM_IPNetworkIdentity.IdentityType\"]'"
	 * @generated
	 */
	String getIdentityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPNetworkIdentity#getIdentityValue <em>Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Value</em>' attribute.
	 * @see #getIdentityValue()
	 * @generated
	 */
	void setIdentityValue(String value);

} // CIM_IPNetworkIdentity
