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
 * A representation of the model object '<em><b>CIM Extent Component View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregates StorageExtent instances to the StoragePoolView that has the extents as pool components.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExtentComponentView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::Device::ComponentElement' override.GroupComponent='CIM_StoragePoolView REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The StoragePoolView instance that contains the StorageExtent instances as pool components.' override.PartComponent='CIM_StorageExtent REF' override.PartComponent.Key='true' override.PartComponent.Description='The CIM_StorageExtent instance that is a pool component of the StoragePoolView instance.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ExtentComponentView extends CIM_AbstractComponent {
} // CIM_ExtentComponentView
