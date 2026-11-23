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
 * A representation of the model object '<em><b>CIM Storage Resource Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageResourceLoadGroup aggregates either the StoragePools or the individual StorageVolumes that have the same affinity for a storage processor. The affinity of this group may change during failover or failback/rebind from one storage processor to another in a storage server. StorageResourceLoadGroup has a instance of the StorageProcessorAffinity association to each instance of CIM_ComputerSystem representing a storage processor that may host the StorageResourceLoadGroup in either a healthy or failover state. Each instance of StorageResourceLoadGroup in a storage server is also associated to each instance of TargetPortGroup in the server by the AsymmetricAccessibility class. There is an instance of CIM_HostedCollection associating the StorageResourceLoadGroup with the top-level CIM_ComputerSystem that aggregrates the storage processor ComputerSystem instances.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageResourceLoadGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Collection' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageResourceLoadGroup extends CIM_SystemSpecificCollection {
} // CIM_StorageResourceLoadGroup
