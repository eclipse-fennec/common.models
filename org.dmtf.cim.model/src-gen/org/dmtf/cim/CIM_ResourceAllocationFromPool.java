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
 * A representation of the model object '<em><b>CIM Resource Allocation From Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ResourceAllocationFromPool associates an instance of CIM_ResourceAllocationSettingData representing a resource allocation with the CIM_ResourcePool from which it is allocated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourceAllocationFromPool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::System::Resource' override.Antecedent='CIM_ResourcePool REF' override.Antecedent.Max='1' override.Antecedent.Description='The resource pool.' override.Dependent='CIM_ResourceAllocationSettingData REF' override.Dependent.Description='The resource allocation.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ResourceAllocationFromPool extends CIM_Dependency {
} // CIM_ResourceAllocationFromPool
