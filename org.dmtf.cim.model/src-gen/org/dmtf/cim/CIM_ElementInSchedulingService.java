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
 * A representation of the model object '<em><b>CIM Element In Scheduling Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents the relationship between a PacketSchedulingService and the set of SchedulingElements that tie it to its inputs (either QueuingServices or other PacketSchedulingServices).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementInSchedulingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.GroupComponent='CIM_PacketSchedulingService REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The scheduler aggregating the SchedulingElement. A SchedulingElement can be associated with at most one SchedulingService.' override.PartComponent='CIM_SchedulingElement REF' override.PartComponent.Min='1' override.PartComponent.Description='A SchedulingElement that ties either a queue or another scheduler to the referenced PacketSchedulingService. Every PacketSchedulingService MUST have at least one Scheduling Element/input.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementInSchedulingService extends CIM_Component {
} // CIM_ElementInSchedulingService
