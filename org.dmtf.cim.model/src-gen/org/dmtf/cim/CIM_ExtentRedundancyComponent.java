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
 * A representation of the model object '<em><b>CIM Extent Redundancy Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the StorageExtents participating in a Storage RedundancyGroup. 
 * The use of this class is being deprecated in lieu of using MemberOfCollection in conjunction with StorageRedundancySet.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExtentRedundancyComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Aggregation='true' Version='2.13.0' UMLPackagePath='CIM::Core::Redundancy' override.GroupComponent='CIM_StorageRedundancyGroup REF' override.GroupComponent.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The StorageRedundancyGroup.' override.PartComponent='CIM_StorageExtent REF' override.PartComponent.Deprecated='[\"CIM_MemberOfCollection.Member\"]' override.PartComponent.Description='The StorageExtent participating in the RedundancyGroup.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ExtentRedundancyComponent extends CIM_RedundancyComponent {
} // CIM_ExtentRedundancyComponent
