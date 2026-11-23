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
 * A representation of the model object '<em><b>CIM SNMP Community String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SNMPCommunityString is an access point for an SNMPService. Each instance stores a community string that can be used for making SNMP requests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SNMPCommunityString#getCommunityString <em>Community String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPCommunityString#getTypeOfAccess <em>Type Of Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPCommunityString#getLogicalEntitiesAccessed <em>Logical Entities Accessed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPCommunityString#getLogicalEntitiesDescriptions <em>Logical Entities Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SNMPCommunityString()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SNMP' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SNMPCommunityString extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Community String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SNMP community string/password used for read or read/write access to the agent's data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Community String</em>' attribute.
	 * @see #setCommunityString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPCommunityString_CommunityString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|ENTITY-MIB.entLogicalCommunity\"]'"
	 * @generated
	 */
	String getCommunityString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPCommunityString#getCommunityString <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Community String</em>' attribute.
	 * @see #getCommunityString()
	 * @generated
	 */
	void setCommunityString(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer describing whether read or read/ write access is granted, or whether this information is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Access</em>' attribute.
	 * @see #setTypeOfAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPCommunityString_TypeOfAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Read Only\",\"Read/Write\"]'"
	 * @generated
	 */
	Integer getTypeOfAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPCommunityString#getTypeOfAccess <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Access</em>' attribute.
	 * @see #getTypeOfAccess()
	 * @generated
	 */
	void setTypeOfAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Entities Accessed</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array contains one or more object identifiers indicating the MIB modules/object subtrees that are accessed using the CommunityString. Either text strings of numbers (such as 1.2.3.4.5), or words (such as 'system') are specified. When using text strings of numbers, an asterisk (*) can replace any subidentifier to specify a subtree family - for example, 1.2.*.5. Descriptions related to each entry in the array are found at the corresponding index of the LogicalEntitiesDescriptions property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Entities Accessed</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPCommunityString_LogicalEntitiesAccessed()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|ENTITY-MIB.entLogicalType\"]' ModelCorrespondence='[\"CIM_SNMPCommunityString.LogicalEntitiesDescriptions\"]'"
	 * @generated
	 */
	EList<String> getLogicalEntitiesAccessed();

	/**
	 * Returns the value of the '<em><b>Logical Entities Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form textual descriptions of the logical entities indicated in the LogicalEntitiesAccessed array. There is a correspondence between the entity identifier in the LogicalEntitiesAccessed array, and the description in this array at the corresponding index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Entities Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPCommunityString_LogicalEntitiesDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|ENTITY-MIB.entLogicalDescr\"]' ModelCorrespondence='[\"CIM_SNMPCommunityString.LogicalEntitiesAccessed\"]'"
	 * @generated
	 */
	EList<String> getLogicalEntitiesDescriptions();

} // CIM_SNMPCommunityString
