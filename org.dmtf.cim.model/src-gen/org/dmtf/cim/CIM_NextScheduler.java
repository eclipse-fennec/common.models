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
 * A representation of the model object '<em><b>CIM Next Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is a subclass of NextService, and defines a predecessor-successor relationship between Packet SchedulingServices. In a hierarchical queuing configuration (where a second scheduler treats the output of a first scheduler as a single, aggregated input), the two schedulers are related via the NextScheduler association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextScheduler()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.PrecedingService='CIM_PacketSchedulingService REF' override.PrecedingService.Description='The PacketSchedulingService whose output is treated as a single, aggregated input by the FollowingService scheduler. The [0..n] cardinality indicates that a single FollowingService scheduler may bring together the aggregated outputs of multiple prior schedulers.' override.FollowingService='CIM_PacketSchedulingService REF' override.FollowingService.Max='1' override.FollowingService.Description='A scheduler that includes among its inputs the aggregated outputs of one or more PrecedingService schedulers.' keys='PrecedingService,FollowingService'"
 * @generated
 */
@ProviderType
public interface CIM_NextScheduler extends CIM_NextService {
} // CIM_NextScheduler
