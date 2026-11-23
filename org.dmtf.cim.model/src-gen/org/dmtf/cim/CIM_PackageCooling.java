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
 * A representation of the model object '<em><b>CIM Package Cooling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of this association has been deprecated. Instead, the more generic PackageDependency relationship should be used. 
 * Deprecated description: Often, a CoolingDevice is installed in a Package such as a Chassis or a Rack, not for a specific Device, but to assist in the cooling of the Package in general.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageCooling()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PackageDependency\"]' Version='2.10.0' UMLPackagePath='CIM::Device::CoolingAndPower' override.Antecedent='CIM_CoolingDevice REF' override.Antecedent.Deprecated='[\"CIM_PackageDependency.Antecedent\"]' override.Antecedent.Description='Note: The use of this method is deprecated. \nDeprecated description: The CoolingDevice for the Package.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Deprecated='[\"CIM_PackageDependency.Dependent\"]' override.Dependent.Description='Note: The use of this method is deprecated. \nDeprecated description: The PhysicalPackage whose environment is cooled.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageCooling extends CIM_PackageDependency {
} // CIM_PackageCooling
