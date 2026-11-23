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
 * A representation of the model object '<em><b>CIM Application System Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Application systems may have arbitrarily complex structures. It may be necessary to build application system hierarchies including the two-step hierarchy of distributed and local systems. ApplicationSystemHierarchy allows building containment trees (only one parent at a time). It should not be used to express use-relationships; use CIM_ApplicationSystemDependency instead.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemHierarchy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Application::AppRuntime' override.GroupComponent='CIM_ApplicationSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The parent ApplicationSystem in the association.' override.PartComponent='CIM_ApplicationSystem REF' override.PartComponent.Description='The child ApplicationSystem in the association.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ApplicationSystemHierarchy extends CIM_Component {
} // CIM_ApplicationSystemHierarchy
