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
 * A representation of the model object '<em><b>CIM Hosting CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A VirtualComputerSystem is hosted on another ComputerSystem. This association makes that relationship explicit. 
 * The usage of this class is being deprecated in lieu of using the HostedDependency association between ComputerSystems.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostingCS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedDependency\"]' Version='2.8.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Deprecated='[\"CIM_HostedDependency.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Description='The hosting ComputerSystem.' override.Dependent='CIM_VirtualComputerSystem REF' override.Dependent.Deprecated='[\"CIM_HostedDependency.Dependent\"]' override.Dependent.Description='The VirtualComputerSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostingCS extends CIM_HostedDependency {
} // CIM_HostingCS
