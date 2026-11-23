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
 * A representation of the model object '<em><b>CIM VRF Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_VRFRoute associates a next hop route to a Virtual Routing and Forwarding context.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VRFRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.52.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_VirtualRoutingAndForwardingTable REF' override.Antecedent.Key='true' override.Antecedent.Max='1' override.Antecedent.Description='The VRF of  the route.' override.Dependent='CIM_NextHopRoute REF' override.Dependent.Key='true' override.Dependent.Description='The route.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_VRFRoute extends CIM_Dependency {
} // CIM_VRFRoute
