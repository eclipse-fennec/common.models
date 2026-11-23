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
 * A representation of the model object '<em><b>CIM Package Temp Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Often, a TemperatureSensor is installed in a Package such as a Chassis or a Rack, not to measure any particular Device, but the Package's environment in general. The use of this association has been deprecated. Instead, use PackageDependency to describe this relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageTempSensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PackageDependency\"]' Version='2.7.0' UMLPackagePath='CIM::Device::Sensors' override.Antecedent='CIM_TemperatureSensor REF' override.Antecedent.Deprecated='[\"CIM_PackageDependency.Antecedent\"]' override.Antecedent.Description='The TemperatureSensor for the Package.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Deprecated='[\"CIM_PackageDependency.Dependent\"]' override.Dependent.Description='The PhysicalPackage whose environment is monitored.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageTempSensor extends CIM_PackageDependency {
} // CIM_PackageTempSensor
