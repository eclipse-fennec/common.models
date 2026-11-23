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
 * A representation of the model object '<em><b>CIM Route Uses Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RouteUsesEndpoint depicts the relationship between a next hop route and the local Endpoint that is used to transmit the traffic to the 'next hop'.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RouteUsesEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Max='1' override.Antecedent.Description='The endpoint used to reach the route\'s destination.' override.Dependent='CIM_NextHopRoute REF' override.Dependent.Description='The route using the endpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RouteUsesEndpoint extends CIM_Dependency {
} // CIM_RouteUsesEndpoint
