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
 * A representation of the model object '<em><b>CIM Package Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalDevice is installed in a Package such as a Chassis or a Rack, not for a specific Device, but to function with the Package in general. This relationship is described by the PackageDependency association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::DeviceElements' override.Antecedent='CIM_LogicalDevice REF' override.Antecedent.Description='The Logical Device for the Package.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Description='The PhysicalPackage whose environment is affected.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageDependency extends CIM_Dependency {
} // CIM_PackageDependency
