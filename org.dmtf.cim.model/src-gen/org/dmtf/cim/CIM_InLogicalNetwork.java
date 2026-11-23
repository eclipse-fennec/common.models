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
 * A representation of the model object '<em><b>CIM In Logical Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines a ProtocolEndpoint as a member of a specific LogicalNetwork. 
 * 
 * Since the LogicalNetwork class is deprecated in lieu of ConnectivityCollection, this association is no longer necessary. It is deprecated to the MemberOfCollection association, that is inherited by ConnectivityCollection from its superclass, Collection.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InLogicalNetwork()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::Collections' override.Collection='CIM_LogicalNetwork REF' override.Collection.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.Collection.Aggregate='true' override.Collection.Description='The LogicalNetwork that groups the ProtocolEndpoint instances.' override.Member='CIM_ProtocolEndpoint REF' override.Member.Deprecated='[\"CIM_MemberOfCollection.Member\"]' override.Member.Description='The child ProtocolEndpoints that are components of the LogicalNetwork.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_InLogicalNetwork extends CIM_CollectedMSEs {
} // CIM_InLogicalNetwork
