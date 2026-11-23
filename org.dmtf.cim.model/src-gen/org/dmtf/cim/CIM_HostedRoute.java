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
 * A representation of the model object '<em><b>CIM Hosted Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedRoute describes the relationship between the route and the system in whose context it is defined.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_System REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The network element that scopes/provides context for the route.' override.Dependent='CIM_NextHopRoute REF' override.Dependent.Description='The next hop route defined on the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedRoute extends CIM_HostedDependency {
} // CIM_HostedRoute
