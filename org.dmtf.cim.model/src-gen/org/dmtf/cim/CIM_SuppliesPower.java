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
 * A representation of the model object '<em><b>CIM Supplies Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SuppliesPower relationship indicates that a ManagedSystemElementis in the power domain of the referenced PowerSource. It indicates which ManagedSystemElements are dependent on the PowerSource, and therefore, which ManagedSystemElements are affected if the PowerSource is lost.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SuppliesPower()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.19.1' UMLPackagePath='CIM::Device::CoolingAndPower' override.Antecedent='CIM_PowerSupply REF' override.Antecedent.Description='The Supply that is providing power.' override.Dependent='CIM_ManagedSystemElement REF' override.Dependent.Description='A ManagedSystemElement in the power domain of the Supply.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SuppliesPower extends CIM_Dependency {
} // CIM_SuppliesPower
