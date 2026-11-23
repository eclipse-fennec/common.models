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
 * A representation of the model object '<em><b>CIM BGP Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the Dependency association, and defines the relationship between a BGPService and the RoutingPolicy that control it.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPRoutingPolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_RoutingPolicy REF' override.Antecedent.Description='The BGP routing policy object.' override.Dependent='CIM_BGPService REF' override.Dependent.Description='The BGPService that operates according to the routing policy.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BGPRoutingPolicy extends CIM_Dependency {
} // CIM_BGPRoutingPolicy
