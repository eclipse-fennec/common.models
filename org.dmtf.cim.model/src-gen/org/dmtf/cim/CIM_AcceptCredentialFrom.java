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
 * A representation of the model object '<em><b>CIM Accept Credential From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association specifies that a credential management service (e.g., CertificateAuthority or Kerberos key distribution service) is to be trusted to certify credentials, presented at the packet level. The association defines an 'approved' CredentialManagementService that is used for validation. 
 * 
 * The use of this class is best explained via an example: 
 * If a CertificateAuthority is specified using this association, and a corresponding X509CredentialFilterEntry is also associated with a PacketFilterCondition (via the relationship, FilterOfPacketCondition), then the credential MUST match the FilterEntry data AND be certified by that CA (or one of the CredentialManagementServices in its trust hierarchy). Otherwise, the X509CredentialFilterEntry is deemed not to match. If a credential is certified by a CredentialManagementService associated with the PacketFilterCondition through the AcceptCredentialFrom relationship, but there is no corresponding CredentialFilterEntry, then all credentials from the related service are considered to match.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AcceptCredentialFrom()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Policy' MappingStrings='[\"IPSP Policy Model.IETF|AcceptCredentialFrom\"]' override.Antecedent='CIM_CredentialManagementService REF' override.Antecedent.Description='The CredentialManagementService that is issuing the credential to be matched in the PacketFilterCondition.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|AcceptCredentialFrom.Antecedent\"]' override.Dependent='CIM_PacketFilterCondition REF' override.Dependent.Description='The PacketFilterCondition that associates the CredentialManagementService and any FilterLists/FilterEntries.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|AcceptCredentialFrom.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AcceptCredentialFrom extends CIM_Dependency {
} // CIM_AcceptCredentialFrom
