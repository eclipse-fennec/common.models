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
 * A representation of the model object '<em><b>CIM Memory Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Since the MemoryMappedIO class applies to memory AND port resources, there is the potential for key conflict. For example, both a memory resource and a port resource may be located at address 0. Since StartingAddress is the distinguishing key of MemoryMappedIO, two instances would be created with the same key. This is prevented by defining memory and port resource subclasses of MemoryMappedIO, and allowing the CreationClassName key property to distinguish between them and force uniqueness in their keys.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryResource()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' keys='CSCreationClassName,CSName,CreationClassName,StartingAddress'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryResource extends CIM_MemoryMappedIO {
} // CIM_MemoryResource
