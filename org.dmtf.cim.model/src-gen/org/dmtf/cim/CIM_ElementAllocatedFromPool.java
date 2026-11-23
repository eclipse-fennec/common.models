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
 * A representation of the model object '<em><b>CIM Element Allocated From Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementAllocatedFromPool associates an instance of CIM_LogicalElement representing an allocated Resource with the CIM_ResourcePool from which it was allocated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementAllocatedFromPool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Core::Resource' override.Antecedent='CIM_ResourcePool REF' override.Antecedent.Description='The resource pool.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Description='The allocated resource.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementAllocatedFromPool extends CIM_AbstractElementAllocatedFromPool {
} // CIM_ElementAllocatedFromPool
