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
 * A representation of the model object '<em><b>CIM Target Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TargetPortGroup aggregates the ProtocolEndpoints representing a group of target ports in a storage server. The ProtocolEndpoints may be a subclass of CIM_ProtocolEndpoint as appropriate for the type of target port implemented by the storage server. The target ports are aggregated because they have the same affinity for an associated storage processor for failover and the same accessibility state to storage resources in a given StorageResourceLoadGroup. The TargetPortGroup may have either a fixed affinity for a storage processor within the server or an affinity that changes during failover from one storage processors to another. TargetPortGroup has a instance of the StorageProcessorAffinity association to each instance of CIM_ComputerSystem representing a storage processor that may host the TargetPortGroup in either a healthy or failover state. Each instance of TargetPortGroup in a storage server is also associated to each instance of StorageResourceLoadGroup in the server by the AsymmetricAccessibility class. There is an instance of CIM_HostedCollection associating the StorageResourceLoadGroup with the top-level CIM_ComputerSystem that aggregates the storage processor ComputerSystem instances.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TargetPortGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Collection' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TargetPortGroup extends CIM_SystemSpecificCollection {
} // CIM_TargetPortGroup
