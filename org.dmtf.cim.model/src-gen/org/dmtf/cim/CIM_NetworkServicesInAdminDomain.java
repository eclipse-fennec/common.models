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
 * A representation of the model object '<em><b>CIM Network Services In Admin Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association establishes the Dependency relationships that exist between an administrative domain and the Network Services that it hosts. It is deprecated since AdminDomains can contain any ManagedSystemElements. There is no special relationship needed for NetworkServices. In addition, the Min (1) cardinality on AdminDomain is not valid - since it may not be possible to define every NetworkService in the context of one or more Domains.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkServicesInAdminDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedDependency\"]' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.Antecedent='CIM_AdminDomain REF' override.Antecedent.Deprecated='[\"CIM_Dependency.Antecedent\"]' override.Antecedent.Description='The AdminDomain that hosts and administers the various network services.' override.Dependent='CIM_NetworkService REF' override.Dependent.Deprecated='[\"CIM_Dependency.Dependent\"]' override.Dependent.Description='The network service that is hosted in the administrative domain.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkServicesInAdminDomain extends CIM_HostedDependency {
} // CIM_NetworkServicesInAdminDomain
