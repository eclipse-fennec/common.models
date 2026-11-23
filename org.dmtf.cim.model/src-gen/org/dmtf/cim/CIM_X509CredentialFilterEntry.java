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
 * A representation of the model object '<em><b>CIM X509 Credential Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An X509CredentialFilterEntry allows filtering on the attributes of an X.509 certificate. Each instance includes a value for MatchFieldName that specifies the particular X.509 attribute that is being matched.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_X509CredentialFilterEntry#getMatchFieldName <em>Match Field Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509CredentialFilterEntry#getMatchFieldValue <em>Match Field Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_X509CredentialFilterEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::Filtering' MappingStrings='[\"IPSP Policy Model.IETF|CredentialFilterEntry\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_X509CredentialFilterEntry extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Match Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MatchFieldName specifies the X.509 attribute to match against MatchFieldValue. Note that this enumeration is modified from the IETF's IPSP Policy Model to explicitly list the 'standard' X.509 attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Field Name</em>' attribute.
	 * @see #setMatchFieldName(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509CredentialFilterEntry_MatchFieldName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Version\",\"Serial Number\",\"Signature Algorithm Identifier\",\"Issuer Name\",\"Validity Period\",\"Subject Name\",\"Subject Public Key Info\",\"Key Usage\",\"Alternate Name\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|CredentialFilterEntry.MatchFieldName\"]' ModelCorrespondence='[\"CIM_X509CredentialFilterEntry.MatchFieldValue\"]'"
	 * @generated
	 */
	Long getMatchFieldName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509CredentialFilterEntry#getMatchFieldName <em>Match Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Field Name</em>' attribute.
	 * @see #getMatchFieldName()
	 * @generated
	 */
	void setMatchFieldName(Long value);

	/**
	 * Returns the value of the '<em><b>Match Field Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MatchFieldValue specifies the value to compare with the credential attribute (defined in MatchFieldName), to determine if the credential matches this filter entry. An implementation must convert this string to a DER- encoded string before matching against the values extracted from credentials at runtime. 
	 * 
	 * Note that a wildcard mechanism may be used when MatchFieldName specifies a general character string (for example, if MatchFieldName=7, 'Subject Name'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for 'Subject Name', a MatchFieldValue of 'cn=*,ou=engineering,o=foo,c=be' will successfully match a certificate whose subject attribute is 'cn=JaneDoe,ou=engineering,o=foo,c=be'. A wildcard can be used to represent 0 or more characters as would be displayed to the user (i.e., a wildcard pattern match operates on displayable character boundaries).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Field Value</em>' attribute.
	 * @see #setMatchFieldValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509CredentialFilterEntry_MatchFieldValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MappingStrings='[\"IPSP Policy Model.IETF|CredentialFilterEntry.MatchFieldName\"]' ModelCorrespondence='[\"CIM_X509CredentialFilterEntry.MatchFieldName\"]'"
	 * @generated
	 */
	String getMatchFieldValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509CredentialFilterEntry#getMatchFieldValue <em>Match Field Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Field Value</em>' attribute.
	 * @see #getMatchFieldValue()
	 * @generated
	 */
	void setMatchFieldValue(String value);

} // CIM_X509CredentialFilterEntry
