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
 * A representation of the model object '<em><b>CIM Fail Next Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is a subclass of NextScheduler, and defines a predecessor-successor relationship between a NonWork ConservingSchedulingService and another PacketScheduling Service. It indicates that the NonWorkConserving scheduler may pass up a scheduling opportunity (thereby behaving in a non-work conserving manner), and make the resulting bandwidth available to the FollowingService scheduler.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FailNextScheduler()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.PrecedingService='CIM_NonWorkConservingSchedulingService REF' override.PrecedingService.Description='The NonWorkConservingSchedulingService whose excess bandwidth is made available to the scheduler identified by the FollowingService reference. The [0..n] cardinality indicates that a single FollowingService scheduler may have the opportunity to use the unused bandwidth of multiple prior non-work-conserving schedulers.' override.FollowingService='CIM_PacketSchedulingService REF' override.FollowingService.Max='1' override.FollowingService.Description='A scheduler that may use the bandwidth available from the non-work conserving scheduler.' keys='PrecedingService,FollowingService'"
 * @generated
 */
@ProviderType
public interface CIM_FailNextScheduler extends CIM_NextScheduler {
} // CIM_FailNextScheduler
