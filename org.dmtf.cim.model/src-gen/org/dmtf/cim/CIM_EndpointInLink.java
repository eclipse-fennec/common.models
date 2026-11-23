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
 * A representation of the model object '<em><b>CIM Endpoint In Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association connects an OSPFLink to the OSPFProtocol Endpoints that this link aggregates.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EndpointInLink()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' override.Collection='CIM_OSPFLink REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The OSPF link.' override.Member='CIM_OSPFProtocolEndpointBase REF' override.Member.Description='The OSPF protocol endpoint.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_EndpointInLink extends CIM_MemberOfCollection {
} // CIM_EndpointInLink
