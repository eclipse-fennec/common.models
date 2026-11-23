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
 * A representation of the model object '<em><b>CIM Abstract Element Allocated From Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractElementAllocatedFromPool associates an instance of CIM_ManagedElement representing an allocated Resource with the CIM_ManagedElement from which it was allocated
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AbstractElementAllocatedFromPool()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::Resource' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='A reference to the ManagedElement that represents a pool from which an element is allocated.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='A reference to the element that is alloocated from the antecedent pool.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AbstractElementAllocatedFromPool extends CIM_Dependency {
} // CIM_AbstractElementAllocatedFromPool
