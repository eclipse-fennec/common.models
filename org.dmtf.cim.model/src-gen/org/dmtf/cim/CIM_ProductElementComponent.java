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
 * A representation of the model object '<em><b>CIM Product Element Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that the referenced ManagedElement is part of a Product.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductElementComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.29.0' UMLPackagePath='CIM::Core::ProductFRU' override.GroupComponent='CIM_Product REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The Product.' override.PartComponent='CIM_ManagedElement REF' override.PartComponent.Key='true' override.PartComponent.Description='The ManagedElement which is a part of the Product.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProductElementComponent extends CIM_Component {
} // CIM_ProductElementComponent
