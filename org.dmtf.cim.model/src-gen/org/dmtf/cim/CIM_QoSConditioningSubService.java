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
 * A representation of the model object '<em><b>CIM Qo SConditioning Sub Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A QoSService utilizes underlying ConditioningServices as part of its overall functionality. This is modeled using the QoSConditioningSubService association. Note that a ConditioningService may only be part of a single QoSService - the cardinality on the QoSService reference is Max (1).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QoSConditioningSubService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.GroupComponent='CIM_QoSService REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This aggregation identifies the set of ConditioningServices that together condition traffic for a particular QoSService.' override.PartComponent='CIM_ConditioningService REF' override.PartComponent.Description='The ConditioningService.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_QoSConditioningSubService extends CIM_ServiceComponent {
} // CIM_QoSConditioningSubService
