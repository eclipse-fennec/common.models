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
 * A representation of the model object '<em><b>CIM Qo SService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a concrete class that represents the ability to conceptualize a QoS service as a set of coordinated sub-services. This enables the network administrator to map business rules to the network, and the network designer to engineer the network such that it can provide different functions for different traffic streams. 
 * 
 * This class has two main purposes. First, it serves as a common base class for defining various sub-services that are needed to build higher-level QoS services. Second, it serves as a way to consolidate relationships between different types of QoS services and different types of ConditioningServices. 
 * 
 * For example, Gold Service may be defined as a QoSService which aggregates two other QoSServices together. Each of these 'other' QoSServices could be DiffServServices - one representing the servicing of very high demand packets (instantiated as a DiffServService directly), and one representing the service given to most of the packets (instantiated as an AFService). The high demand DiffServService instance would use QoSConditioning SubService to aggregate together the necessary classifiers to indicate which traffic it applies to, the appropriate meters for contract limits, the marker to mark the EF PHB in the packets, and the queuing-related services. The AFService instance would similarly use QoSConditioning SubService to aggregate its classifiers, meters, the several markers used to mark the different AF PHBs in the packets, and the queuing-related services needed to deliver the packet treatment.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QoSService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_QoSService extends CIM_Service {
} // CIM_QoSService
