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
 * A representation of the model object '<em><b>CIM Element In Policy Role Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ElementInPolicyRoleCollection aggregates zero or more ManagedElement subclass instances into a PolicyRoleCollection object, representing a role played by these ManagedElements. This Collection indicates that the aggregated PolicySets (aggregated by CIM_PolicySetInRoleCollection) MAY BE applied to the referenced elements. To indicate that the PolicySets ARE being enforced for the element, use the PolicySetAppliesToElement association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementInPolicyRoleCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Policy' override.Collection='CIM_PolicyRoleCollection REF' override.Collection.Aggregate='true' override.Collection.Description='The PolicyRoleCollection.' override.Member='CIM_ManagedElement REF' override.Member.Description='The ManagedElement that plays the role represented by the PolicyRoleCollection.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_ElementInPolicyRoleCollection extends CIM_MemberOfCollection {
} // CIM_ElementInPolicyRoleCollection
