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
 * A representation of the model object '<em><b>CIM Egress Conditioning Service On Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents the binding, in the egress direction, between a ProtocolEndpoint and the last ConditioningService that processes packets before they leave a network device (via that ProtocolEndpoint). This 'last' ConditioningService is ordinarily a scheduler, but it does not have to be. There can be multiple 'last' ConditioningServices for an Endpoint (for example, in the case of a fallback scheduler). Therefore, the cardinality for the Dependent object reference remains 0..n. On the other hand, a single ConditioningService cannot be the last one to process packets for multiple Endpoints. So, the cardinality of the Antecedent object reference is narrowed from 0..n to 0..1.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EgressConditioningServiceOnEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Max='1' override.Antecedent.Description='The ProtocolEndpoint through which traffic leaves a network device.' override.Dependent='CIM_ConditioningService REF' override.Dependent.Description='The ConditioningService which ends the traffic conditioning processing within a network device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_EgressConditioningServiceOnEndpoint extends CIM_ServiceSAPDependency {
} // CIM_EgressConditioningServiceOnEndpoint
