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
 * A representation of the model object '<em><b>CIM In BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation defines the specific routers (i.e., ComputerSystems) that participate in a PeerGroup.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InBGPPeerGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Collection='CIM_BGPPeerGroup REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The PeerGroup that aggregates the routers.' override.Member='CIM_ComputerSystem REF' override.Member.Min='2' override.Member.Description='The routers that comprise the PeerGroup.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_InBGPPeerGroup extends CIM_CollectedMSEs {
} // CIM_InBGPPeerGroup
