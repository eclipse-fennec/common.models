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
 * A representation of the model object '<em><b>CIM Hosted Cluster Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedClusterService defines the hosting Cluster for a ClusteringService. Since this relationship is subclassed from HostedService, it inherits the scoping/naming scheme defined for Service - where a Service is weak to its hosting System. In this case, a ClusteringService must be weak to its hosting Cluster System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedClusterService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The Cluster.' override.Dependent='CIM_ClusteringService REF' override.Dependent.Description='The ClusteringService that is hosted on the Cluster.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedClusterService extends CIM_HostedService {
} // CIM_HostedClusterService
