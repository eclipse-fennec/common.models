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
 * A representation of the model object '<em><b>CIM Head Tail Drop Queue Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association describes the relationship between a head or tail dropper and the queue that it monitors to determine when to drop traffic. The referenced queue's depth is compared against the Dropper's threshold property. Although the dropper drops from only one queue, the drop decision may be influenced by the state of several queues. The rule for combining the multiple inputs is simple addition: if the sum of the lengths of the monitored queues exceeds the dropper's QueueThreshold value, then packets are dropped. Note that this rule for combining inputs may be overridden.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HeadTailDropQueueBinding()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_QueuingService REF' override.Antecedent.Min='1' override.Antecedent.Description='A QueuingService examined by the CalculationService.' override.Dependent='CIM_HeadTailDropper REF' override.Dependent.Description='The CalculationService that provides an average queue depth.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HeadTailDropQueueBinding extends CIM_Dependency {
} // CIM_HeadTailDropQueueBinding
