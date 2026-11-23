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
 * A representation of the model object '<em><b>CIM Memory With Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MemoryWithMedia indicates that Memory is associated with a PhysicalMedia and its cartridge. The Memory provides media identification and also stores user-specific data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryWithMedia()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::PhysicalMedia' override.Antecedent='CIM_PhysicalMemory REF' override.Antecedent.Description='The Memory associated with PhysicalMedia.' override.Dependent='CIM_PhysicalMedia REF' override.Dependent.Description='The PhysicalMedia.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryWithMedia extends CIM_Dependency {
} // CIM_MemoryWithMedia
