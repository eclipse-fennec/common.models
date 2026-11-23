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
 * A representation of the model object '<em><b>CIM System Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalDevices can be aggregated by a System. This relationship is made explicit by the SystemDevice association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.10.0' UMLPackagePath='CIM::Core::Device' override.GroupComponent='CIM_System REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The parent system in the Association.' override.PartComponent='CIM_LogicalDevice REF' override.PartComponent.Weak='true' override.PartComponent.Description='The LogicalDevice that is a component of a System.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SystemDevice extends CIM_SystemComponent {
} // CIM_SystemDevice
