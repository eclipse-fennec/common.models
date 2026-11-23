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
 * A representation of the model object '<em><b>CIM Hosted Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_HostedService is an association between a Service and the System on which the functionality is located. The cardinality of this association is one-to-many. A System can host many Services. Services are weak with respect to their hosting System. Heuristic: A Service is hosted on the System where the LogicalDevices or SoftwareFeatures that implement the Service are located. The model does not represent Services hosted across multiple systems. The model is as an ApplicationSystem that acts as an aggregation point for Services that are each located on a single host.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_System REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting System.' override.Dependent='CIM_Service REF' override.Dependent.Weak='true' override.Dependent.Description='The Service hosted on the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedService extends CIM_HostedDependency {
} // CIM_HostedService
