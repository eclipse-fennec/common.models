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
 * A representation of the model object '<em><b>CIM Queue Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the reliance of a QueuingService on other, supporting queues and their QueuingServices. A given Service can only act in support of one QueuingService; but a higher level queue may be supported by many lower level QueuingServices. 
 * 
 * The class is deprecated since a queue only stores network traffic. It does not support other queues, or manipulate their entries. This type of processing is described using NextService associations 'rightwards' from the QueuingService. These associations reference 'other' ConditioningServices that may send traffic to 'other' queues).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueueHierarchy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_QueuingService REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='The supporting queue(s) and its QueuingService. This Service can only support at most one, higher level QueuingService.' override.Dependent='CIM_QueuingService REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Max='1' override.Dependent.Description='The QueuingService dependent on other, supporting Queuing Services.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_QueueHierarchy extends CIM_ServiceServiceDependency {
} // CIM_QueueHierarchy
