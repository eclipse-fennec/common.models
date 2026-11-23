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
 * A representation of the model object '<em><b>CIM IKE Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IKERule contains the Conditions and Actions for IKE phase 1 negotiations or to specify static actions such as Discard.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IKERule#getIdentityContexts <em>Identity Contexts</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IKERule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IKERule\"]' keys='SystemCreationClassName,SystemName,CreationClassName,PolicyRuleName'"
 * @generated
 */
@ProviderType
public interface CIM_IKERule extends CIM_SARule {
	/**
	 * Returns the value of the '<em><b>Identity Contexts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IP endpoint may have multiple identities for use in different situations. The IdentityContext property specifies the specific context/identities which pertain to this Rule. The property's function is similar to that of PolicyRoles. A context may be a VPN name or other identifier that selects the appropriate identity. 
	 * 
	 * IdentityContext is an array of strings. The multiple values in the array are logically ORed together in matching an IPNetworkIdentity's IdentityContext. Each value in the array may be a composition of multiple context names. When an array value is a composition, the individual values are logically ANDed together for evaluation purposes. The syntax is: 
	 * <ContextName>[&&<ContextName>]* 
	 * where the individual context names appear in alphabetical order (according to the collating sequence for UCS-2). So, for example, the values 'CompanyXVPN', 'CompanyYVPN&&TopSecret', 'CompanyZVPN&&Confidential' are possible contexts for a Rule. They are matched against an IPNetworkIdentity's IdentityContext. Any of the values may indicate a match and select an Identity, since the values in the array are logically ORed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Contexts</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IKERule_IdentityContexts()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"IPSP Policy Model.IETF|IKERule.IdentityContexts\"]' ModelCorrespondence='[\"CIM_IdentityContext\"]'"
	 * @generated
	 */
	EList<String> getIdentityContexts();

} // CIM_IKERule
