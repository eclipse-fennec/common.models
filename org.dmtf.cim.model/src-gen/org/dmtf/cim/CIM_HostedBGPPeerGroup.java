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
 * A representation of the model object '<em><b>CIM Hosted BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BGPPeerGroup is weak to the AutonomousSystem that contains it. This association formalizes that relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedBGPPeerGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_AutonomousSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The AutonomousSystem that scopes the BGP peer group.' override.Dependent='CIM_BGPPeerGroup REF' override.Dependent.Weak='true' override.Dependent.Description='The BGP peer group defined in the context of the AutonomousSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedBGPPeerGroup extends CIM_HostedDependency {
} // CIM_HostedBGPPeerGroup
