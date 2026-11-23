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
 * A representation of the model object '<em><b>CIM Forwards Among</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents the dependency that exists between the ProtocolEndpoints that are used to forward data and the ForwardingService that is performing the forwarding of data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ForwardsAmong()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Description='The ProtocolEndpoints that are used to forward the data.' override.Dependent='CIM_ForwardingService REF' override.Dependent.Description='The service that is forwarding the data.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ForwardsAmong extends CIM_ServiceSAPDependency {
} // CIM_ForwardsAmong
