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
 * A representation of the model object '<em><b>CIM Qo SSub Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The associations - QoSSubService and QoSConditioningSub Service - operate in conjunction. High level QoS definitions, such as 'John gets Gold Service', map to lower level, more concrete QoSServices (the subclasses of QoSService). This is described by the QoSSubService association. In turn, each of the SubServices may require their own conditioning. This is modeled using the QoSConditioningSubService aggregation. 
 * 
 * Note that a more concrete QoSService may only be aggregated into one higher level Service, using this association. The cardinality on the GroupComponent reference is Max (1).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QoSSubService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.GroupComponent='CIM_QoSService REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The higher level QoSService that is constructed by aggregating one or more lower-level QoSServices.' override.PartComponent='CIM_QoSService REF' override.PartComponent.Description='The more concrete QoSService that is used to provide the higher level Service.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_QoSSubService extends CIM_ServiceComponent {
} // CIM_QoSSubService
