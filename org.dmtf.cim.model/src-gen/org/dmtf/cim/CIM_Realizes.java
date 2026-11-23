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
 * A representation of the model object '<em><b>CIM Realizes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Realizes is the association that defines the mapping between LogicalDevices and the PhysicalElements that implement them.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Realizes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::Device' override.Antecedent='CIM_PhysicalElement REF' override.Antecedent.Description='The physical component that implements the Device.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Realizes extends CIM_Dependency {
} // CIM_Realizes
