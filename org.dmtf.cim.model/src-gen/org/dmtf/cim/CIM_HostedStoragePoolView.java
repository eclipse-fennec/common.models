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
 * A representation of the model object '<em><b>CIM Hosted Storage Pool View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregates Pool view class instances to the CIM_System that scopes the underlying Pools of the View Classes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedStoragePoolView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::Device::ComponentElement' override.GroupComponent='CIM_System REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The CIM_System instance that scopes the underlying Pool instance of the view class.' override.PartComponent='CIM_StoragePoolView REF' override.PartComponent.Key='true' override.PartComponent.Description='The view class instance that is a Pool on the CIM_System instance.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedStoragePoolView extends CIM_AbstractComponent {
} // CIM_HostedStoragePoolView
