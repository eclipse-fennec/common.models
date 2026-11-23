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
 * A representation of the model object '<em><b>CIM Resource Of System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a System and a SystemResource that exists and is allocated in the context of the System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourceOfSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.2' UMLPackagePath='CIM::System::SystemResources' override.GroupComponent='CIM_System REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The System in whose context the Resource exists and is allocated.' override.PartComponent='CIM_SystemResource REF' override.PartComponent.Description='A Resource of the System.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ResourceOfSystem extends CIM_SystemComponent {
} // CIM_ResourceOfSystem
