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
 * A representation of the model object '<em><b>CIM Redundancy Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RedundancyGroup aggregates Managed System Elements and indicates that these elements, taken together, provide redundancy. All elements aggregated in a RedundancyGroup should be instantiations of the same object class. 
 * The use of this class is being depreacted in lieu of using MemberOfCollection in conjunction with RedundancySet.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RedundancyComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Aggregation='true' Version='2.13.0' UMLPackagePath='CIM::Core::Redundancy' override.GroupComponent='CIM_RedundancyGroup REF' override.GroupComponent.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The RedundancyComponent association indicates that \'this set of fans\' or \'these physical extents\' participate in a single RedundancyGroup.' override.PartComponent='CIM_ManagedSystemElement REF' override.PartComponent.Deprecated='[\"CIM_MemberOfCollection.Member\"]' override.PartComponent.Description='The component of the redundancy group.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_RedundancyComponent extends CIM_Component {
} // CIM_RedundancyComponent
