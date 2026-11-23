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
 * A representation of the model object '<em><b>CIM Package Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Often, an AlarmDevice is installed as part of a Package, not to indicate issues with any particular LogicalDevice or PhysicalComponent, but with the Package's environment in general, its security state or its overall health. The use of this association has been deprecated. Instead, use PackageDependency to describe this relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageAlarm()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PackageDependency\"]' Version='2.7.0' UMLPackagePath='CIM::Device::Sensors' override.Antecedent='CIM_AlarmDevice REF' override.Antecedent.Deprecated='[\"CIM_PackageDependency.Antecedent\"]' override.Antecedent.Description='The AlarmDevice for the Package.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Deprecated='[\"CIM_PackageDependency.Dependent\"]' override.Dependent.Description='The PhysicalPackage whose health, security, environment, etc. is alarmed.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageAlarm extends CIM_PackageDependency {
} // CIM_PackageAlarm
