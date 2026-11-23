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
 * A representation of the model object '<em><b>CIM Routing Protocol Domain In AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This assocation connects an AutonomousSystem to the routing domains that it contains.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutingProtocolDomainInAS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.GroupComponent='CIM_AutonomousSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The autonomous system.' override.PartComponent='CIM_RoutingProtocolDomain REF' override.PartComponent.Description='The routing domain.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_RoutingProtocolDomainInAS extends CIM_ContainedDomain {
} // CIM_RoutingProtocolDomainInAS
