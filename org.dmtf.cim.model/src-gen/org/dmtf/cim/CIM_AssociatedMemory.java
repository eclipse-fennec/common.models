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
 * A representation of the model object '<em><b>CIM Associated Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalElements may have Memory installed on them or otherwise associated with them - such as CacheMemory. This is made explicit in this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' override.Antecedent='CIM_Memory REF' override.Antecedent.Description='Memory installed on or associated with a Device.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Description='The LogicalElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedMemory extends CIM_Dependency {
} // CIM_AssociatedMemory
