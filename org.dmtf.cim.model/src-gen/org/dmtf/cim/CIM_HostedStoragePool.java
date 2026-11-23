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
 * A representation of the model object '<em><b>CIM Hosted Storage Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedStoragePool is a specialization of HostedResourcePool association that establishes that the StoragePool is defined in the context of the System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedStoragePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.GroupComponent='CIM_System REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The parent system in the Association.' override.PartComponent='CIM_StoragePool REF' override.PartComponent.Description='The StoragePool that is a component of a System.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedStoragePool extends CIM_HostedResourcePool {
} // CIM_HostedStoragePool
