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
 * A representation of the model object '<em><b>CIM Associated Component Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines the capacity, expressed in StorageExtents, that together represents the entire capacity collected in a StoragePool. The capacity represented by StorageExtents may represent capacity that is allocated or unallocated. 
 * StorageExtents associated to a StoragePool using this association shall not be also be associated to that StoragePool using the CIM_AssociatedRemainingExtent association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedComponentExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.18.0' UMLPackagePath='CIM::Device::StorageServices' override.GroupComponent='CIM_StoragePool REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The parent StoragePool in the association.' override.PartComponent='CIM_StorageExtent REF' override.PartComponent.Description='The component StorageExtent in the association.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedComponentExtent extends CIM_Component {
} // CIM_AssociatedComponentExtent
