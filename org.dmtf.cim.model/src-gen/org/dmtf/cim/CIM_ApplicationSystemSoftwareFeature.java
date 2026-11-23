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
 * A representation of the model object '<em><b>CIM Application System Software Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ApplicationSystemSoftwareFeature association identifies the Features that make up a particular ApplicationSystem. The SoftwareFeatures can be scoped by different Products.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemSoftwareFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.GroupComponent='CIM_ApplicationSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The ApplicationSystem that aggregates the Features.' override.PartComponent='CIM_SoftwareFeature REF' override.PartComponent.Description='The Features in an ApplicationSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ApplicationSystemSoftwareFeature extends CIM_SystemComponent {
} // CIM_ApplicationSystemSoftwareFeature
