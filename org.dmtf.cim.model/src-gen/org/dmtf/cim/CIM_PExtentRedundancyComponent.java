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
 * A representation of the model object '<em><b>CIM PExtent Redundancy Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the PhysicalExtents participating in a Storage RedundancyGroup. However, there is no need for the specificity of this association. It is deprecated in lieu of the generic ExtentRedundancyComponent relationship, its superclass.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PExtentRedundancyComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ExtentRedundancyComponent\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.GroupComponent='CIM_StorageRedundancyGroup REF' override.GroupComponent.Deprecated='[\"CIM_ExtentRedundancyComponent.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The StorageRedundancyGroup.' override.PartComponent='CIM_PhysicalExtent REF' override.PartComponent.Deprecated='[\"CIM_ExtentRedundancyComponent.PartComponent\"]' override.PartComponent.Description='The PhysicalExtent participating in the RedundancyGroup.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PExtentRedundancyComponent extends CIM_ExtentRedundancyComponent {
} // CIM_PExtentRedundancyComponent
