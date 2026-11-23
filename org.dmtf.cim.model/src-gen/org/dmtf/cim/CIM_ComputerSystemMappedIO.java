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
 * A representation of the model object '<em><b>CIM Computer System Mapped IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a ComputerSystem and the Memory Mapped I/O ports available on it.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemMappedIO()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::SystemResources' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem.' override.PartComponent='CIM_MemoryMappedIO REF' override.PartComponent.Weak='true' override.PartComponent.Description='A memory mapped I/O port of the ComputerSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystemMappedIO extends CIM_ComputerSystemResource {
} // CIM_ComputerSystemMappedIO
