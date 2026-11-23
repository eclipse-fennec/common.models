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
 * A representation of the model object '<em><b>CIM Scheduler Used</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In order to remove queued packets, a process or Service (identified as a PacketSchedulingService) runs. This association describes the Dependency of the queue and its QueuingService on a SchedulingService, which empties it. 
 * 
 * The association is deprecated in lieu of associating Queuing Services to SchedulingElements, and SchedulingElements into SchedulingServices. The latter approach is very flexible regarding the implementations that can be modeled, and removes the need to track individual traffic streams using an artificial model property, TrafficClass.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SchedulerUsed()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_QueueToSchedule\",\"CIM_SchedulingServiceToSchedule\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_PacketSchedulingService REF' override.Antecedent.Deprecated='[\"CIM_QueueToSchedule.Queue\"]' override.Antecedent.Max='1' override.Antecedent.Description='The PacketSchedulingService which empties the Queuing Service\'s queue.' override.Dependent='CIM_QueuingService REF' override.Dependent.Deprecated='[\"CIM_QueueToSchedule.SchedElement\"]' override.Dependent.Description='The queue and its QueuingService from which packets are emptied.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SchedulerUsed extends CIM_ServiceServiceDependency {
} // CIM_SchedulerUsed
