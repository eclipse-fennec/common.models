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
 * A representation of the model object '<em><b>CIM Packet Filter Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PacketFilterCondition specifies packet selection criteria (via association to FilterLists) for firewall policies, IPsec policies and similar uses. It is used as an anchor point to associate various types of filters with policy rules via the FilterOfPacketCondition association. By definition, policy rules that aggregate PacketFilterCondition are assumed to operate against every packet received and/or transmitted from an ingress and/or egress point. (Whether policy condition evaluation occurs at ingress or egress is specified by the Direction property in the associated FilterList.) PacketFilterCondition MAY also be used to define the specific CredentialManagementService that validates the credentials carried in a packet. This is accomplished using the association, AcceptCredentialFrom. 
 * 
 * Associated objects (such as FilterListsor Credential ManagementServices) represent components of the condition that MAY or MAY NOT apply at a given rule evaluation. For example, an AcceptCredentialFrom evaluation is only performed when a credential is available to be evaluated and compared against the list of trusted credential management services. Similarly, a PeerIDPayloadFilterEntry MAY only be evaluated when an ID payload is available for checking. Condition components that do not have applicability at rule evaluation time, MUST be evaluated to TRUE.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PacketFilterCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' MappingStrings='[\"IPSP Policy Model.IETF|SACondition\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_PacketFilterCondition extends CIM_PolicyCondition {
} // CIM_PacketFilterCondition
