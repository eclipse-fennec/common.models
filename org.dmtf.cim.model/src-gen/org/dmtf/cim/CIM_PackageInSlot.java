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
 * A representation of the model object '<em><b>CIM Package In Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Complex networking devices often are Chassis-based. These Chassis allow for enhancement and/or augmentation of their base functionality by accepting additional Chassis devices, similar to accepting functionality in the form of adding Cards. This association models this capability.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageInSlot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' override.Antecedent='CIM_Slot REF' override.Antecedent.Description='The Slot into which the PhysicalPackage is inserted.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Max='1' override.Dependent.Description='The Package in the Slot.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageInSlot extends CIM_PackageInConnector {
} // CIM_PackageInSlot
