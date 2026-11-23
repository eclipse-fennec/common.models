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
 * A representation of the model object '<em><b>CIM Ingress Conditioning Service On Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents the binding, in the ingress direction, between a ProtocolEndpoint and the first ConditioningService that processes packets received via that Endpoint. Since there can only be one 'first' ConditioningService for a ProtocolEndpoint, the cardinality for the Dependent object reference is narrowed from 0..n to 0..1. On the other hand, a single ConditioningService can be the first to process packets received via multiple ProtocolEndpoints. So, the cardinality of the Antecedent object reference remains 0..n.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IngressConditioningServiceOnEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Description='The ProtocolEndpoint through which traffic arrives at a network device.' override.Dependent='CIM_ConditioningService REF' override.Dependent.Max='1' override.Dependent.Description='The ConditioningService which begins the traffic conditioning processing within a network device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IngressConditioningServiceOnEndpoint extends CIM_ServiceSAPDependency {
} // CIM_IngressConditioningServiceOnEndpoint
