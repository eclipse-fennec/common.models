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
 * A representation of the model object '<em><b>CIM Peer ID Payload Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PeerIDPayloadFilterEntry defines filters used to match the Identification Type field in the ID Payload of the IKE protocol exchange. It permits the specification of ID values such as "*@example.com" or "192.0.2.0/24".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PeerIDPayloadFilterEntry#getMatchIdentityType <em>Match Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PeerIDPayloadFilterEntry#getMatchIdentityValue <em>Match Identity Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PeerIDPayloadFilterEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::Filtering' MappingStrings='[\"IPSP Policy Model.IETF|PeerIDPayloadFilterEntry\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PeerIDPayloadFilterEntry extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Match Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MatchIdentityType specifies the Identification Type provided by the peer in the payload. The list of identities was generated from Section 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Identity Type</em>' attribute.
	 * @see #setMatchIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PeerIDPayloadFilterEntry_MatchIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"IPV4 Address\",\"FQDN\",\"User FQDN\",\"IPV4 Subnet Address\",\"IPV6 Address\",\"IPV6 Subnet Address\",\"IPV4 Address Range\",\"IPV6 Address Range\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"KEY ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|PeerIDPayloadFilterEntry.MatchIdentityType\",\"RFC2407.IETF|Section 4.6.2.1\"]' ModelCorrespondence='[\"CIM_PeerIDPayloadFilterEntry.MatchIdentityValue\"]'"
	 * @generated
	 */
	Integer getMatchIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PeerIDPayloadFilterEntry#getMatchIdentityType <em>Match Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Identity Type</em>' attribute.
	 * @see #getMatchIdentityType()
	 * @generated
	 */
	void setMatchIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Match Identity Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MatchIdentityValue is the filter value for comparison with the ID payload, e,g, "*@company.com". The syntax may need to be converted for comparison. For example, if the type of identity is a DER-encoded distinguished name, (for example, MatchIdentityType = 10, "DER_ASN1_DN"), the MatchIdentityValue MUST be converted into a DER-encoded string. This allows it to be matched against the values extracted from the ID payload at runtime. 
	 * 
	 * Note that a wildcard mechanism may be used when MatchIdentityType specifies a general character string (for example, if MatchIdentityType=3, 'FQDN'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for 'FQDN', a MatchFieldValue of '*@example.com' will successfully match an ID payload of 'janedoe@example.com'. A wildcard can be used to represent 0 or more characters as is appropriate for the type specified in MatchIdentityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Identity Value</em>' attribute.
	 * @see #setMatchIdentityValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PeerIDPayloadFilterEntry_MatchIdentityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MappingStrings='[\"IPSP Policy Model.IETF|PeerIDPayloadFilterEntry.MatchIdentityValue\"]' ModelCorrespondence='[\"CIM_PeerIDPayloadFilterEntry.MatchIdentityType\"]'"
	 * @generated
	 */
	String getMatchIdentityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PeerIDPayloadFilterEntry#getMatchIdentityValue <em>Match Identity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Identity Value</em>' attribute.
	 * @see #getMatchIdentityValue()
	 * @generated
	 */
	void setMatchIdentityValue(String value);

} // CIM_PeerIDPayloadFilterEntry
