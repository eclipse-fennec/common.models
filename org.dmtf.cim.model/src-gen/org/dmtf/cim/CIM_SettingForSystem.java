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
 * A representation of the model object '<em><b>CIM Setting For System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_SettingForSystem defines a Setting in the context of the System on which it is located.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingForSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' override.Antecedent='CIM_System REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting System.' override.Dependent='CIM_SystemSetting REF' override.Dependent.Weak='true' override.Dependent.Description='The Setting defined for the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SettingForSystem extends CIM_HostedDependency {
} // CIM_SettingForSystem
