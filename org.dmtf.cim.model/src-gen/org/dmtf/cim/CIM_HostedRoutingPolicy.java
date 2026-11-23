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
 * A representation of the model object '<em><b>CIM Hosted Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RoutingPolicy is weak to the network device (i.e., the ComputerSystem) that contains it. This association formalizes that relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedRoutingPolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The network device/computer system that scopes the RoutingPolicy.' override.Dependent='CIM_RoutingPolicy REF' override.Dependent.Weak='true' override.Dependent.Description='The routing policy defined in the context of the network device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedRoutingPolicy extends CIM_HostedDependency {
} // CIM_HostedRoutingPolicy
