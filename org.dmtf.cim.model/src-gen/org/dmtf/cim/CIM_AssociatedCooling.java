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
 * A representation of the model object '<em><b>CIM Associated Cooling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_AssociatedCooling relationship indicates what ManagedSystemElement(s) the fan or cooling device is providingcooling for.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCooling()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.19.1' UMLPackagePath='CIM::Device::CoolingAndPower' override.Antecedent='CIM_CoolingDevice REF' override.Antecedent.Description='The CoolingDevice.' override.Dependent='CIM_ManagedSystemElement REF' override.Dependent.Description='The ManagedSystemElement being cooled.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedCooling extends CIM_Dependency {
} // CIM_AssociatedCooling
