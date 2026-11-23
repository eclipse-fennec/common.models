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
 * A representation of the model object '<em><b>CIM Software Feature Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SoftwareFeatureComponent aggregation models a set of subordinate or independent Software Features of a Product. These are aggregated together to form a higher-level or large grain Feature under the same Product.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeatureComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.GroupComponent='CIM_SoftwareFeature REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The parent SoftwareFeature.' override.PartComponent='CIM_SoftwareFeature REF' override.PartComponent.Description='The component SoftwareFeature.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareFeatureComponent extends CIM_Component {
} // CIM_SoftwareFeatureComponent
