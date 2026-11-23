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
 * A representation of the model object '<em><b>CIM Running OS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RunningOS indicates the currently executing OperatingSystem. At most one OperatingSystem can execute at any time on a ComputerSystem. 'At most one' is specified, since the Computer System may not be currently booted, or its OperatingSystem may be unknown.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RunningOS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::OperatingSystem' override.Antecedent='CIM_OperatingSystem REF' override.Antecedent.Max='1' override.Antecedent.Description='The OperatingSystem currently running on the ComputerSystem.' override.Dependent='CIM_ComputerSystem REF' override.Dependent.Max='1' override.Dependent.Description='The ComputerSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RunningOS extends CIM_Dependency {
} // CIM_RunningOS
