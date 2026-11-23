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
 * A representation of the model object '<em><b>CIM Hosted Network Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedNetworkPipe is an association between a pipe and the network in whose context the pipe is defined. The cardinality of this association is 1-to-many. A network may host many pipes, and pipes are scoped/contained by only one network.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedNetworkPipe()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Pipes' override.Antecedent='CIM_Network REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting network.' override.Dependent='CIM_NetworkPipe REF' override.Dependent.Description='The pipe in the network.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedNetworkPipe extends CIM_HostedDependency {
} // CIM_HostedNetworkPipe
