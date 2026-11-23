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
 * A representation of the model object '<em><b>CIM Endpoint In Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relation connects an OSPF endpoint to an area.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EndpointInArea()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' override.GroupComponent='CIM_OSPFArea REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The OSPF area.' override.PartComponent='CIM_OSPFProtocolEndpointBase REF' override.PartComponent.Description='The OSPF endpoint in the area.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_EndpointInArea extends CIM_Component {
} // CIM_EndpointInArea
