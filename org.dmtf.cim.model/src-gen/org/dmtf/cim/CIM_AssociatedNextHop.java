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
 * A representation of the model object '<em><b>CIM Associated Next Hop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AssociatedNextHop depicts the relationship between a route and the specification of its next hop. The next hop is external to a System, and hence is defined as a kind of RemoteServiceAccessPoint. Note that this relationship is independent of RouteUsesEndpoint (the local Endpoint used to transmit the traffic), and both may be defined for a route.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedNextHop()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_RemoteServiceAccessPoint REF' override.Antecedent.Max='1' override.Antecedent.Description='The next hop for the route.' override.Dependent='CIM_NextHopRoute REF' override.Dependent.Description='The route sending traffic to the next hop.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedNextHop extends CIM_Dependency {
} // CIM_AssociatedNextHop
