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
 * A representation of the model object '<em><b>CIM In Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a LANEndpoint as a member of a specific LANSegment. Note that one of this association's references (LANSegment) is deprecated, as well as its superclass (InLogicalNetwork). Following the same logic as its parent, this association is deprecated to the MemberOfCollection association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InSegment()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.Collection='CIM_LANSegment REF' override.Collection.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The LANSegment that groups the LANEndpoint instances.' override.Member='CIM_LANEndpoint REF' override.Member.Deprecated='[\"CIM_MemberOfCollection.Member\"]' override.Member.Description='A child LANEndpoint that is a component of the LANSegment.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_InSegment extends CIM_InLogicalNetwork {
} // CIM_InSegment
