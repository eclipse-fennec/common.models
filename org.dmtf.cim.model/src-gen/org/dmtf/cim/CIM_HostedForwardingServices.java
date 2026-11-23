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
 * A representation of the model object '<em><b>CIM Hosted Forwarding Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of CIM_HostedService, which is an association between a Service and the System on which the functionality resides. The class, HostedForwardingServices, is deprecated since it provides no additional semantics over HostedService, and unecessarily restricts the Service to a single ComputerSystem, when the Service could reside in a Network or other higher level System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedForwardingServices()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedService\"]' Version='2.7.1' UMLPackagePath='CIM::Network::RoutingForwarding' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Deprecated='[\"CIM_HostedService.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting router.' override.Dependent='CIM_ForwardingService REF' override.Dependent.Deprecated='[\"CIM_HostedService.Dependent\"]' override.Dependent.Description='The Service hosted on the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedForwardingServices extends CIM_HostedService {
} // CIM_HostedForwardingServices
