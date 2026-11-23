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
 * A representation of the model object '<em><b>CIM Hosted Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedResourcePool is a specialization of the SystemComponent association that establishes that the ResourcePool is defined in the context of the System
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedResourcePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.22.0' UMLPackagePath='CIM::Core::Resource' override.GroupComponent='CIM_System REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The parent system in the association' override.PartComponent='CIM_ResourcePool REF' override.PartComponent.Description='The ResourcePool that is a component of the system' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedResourcePool extends CIM_SystemComponent {
} // CIM_HostedResourcePool
