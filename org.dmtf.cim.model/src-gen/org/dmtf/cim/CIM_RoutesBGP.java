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
 * A representation of the model object '<em><b>CIM Routes BGP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines a BGP route, and makes explicit the dependency between a BGPIPRoute and a BGPProtocolEndpoint.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutesBGP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_BGPProtocolEndpoint REF' override.Antecedent.Max='2' override.Antecedent.Description='The BGPProtocolEndpoints that represent the source and destination (or at least the next hop) of the BGP route.' override.Dependent='CIM_BGPIPRoute REF' override.Dependent.Min='1' override.Dependent.Description='The routing table entry that represents a BGP route.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RoutesBGP extends CIM_Dependency {
} // CIM_RoutesBGP
