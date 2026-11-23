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
 * A representation of the model object '<em><b>CIM Configuration For System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of this element is deprecated. Deprecated description: CIM_ConfigurationForSystem defines a Configuration in the context of the System on which it is located. Because the Configuration class is deprecated, this association is similarly deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationForSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ScopedSetting\",\"CIM_SettingForSystem\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' override.Antecedent='CIM_System REF' override.Antecedent.Deprecated='[\"CIM_ScopedSetting.Antecedent\",\"CIM_SettingForSystem.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='Note: The use of this element is deprecated. Deprecated description: The hosting System.' override.Dependent='CIM_SystemConfiguration REF' override.Dependent.Deprecated='[\"CIM_ScopedSetting.Dependent\",\"CIM_SettingForSystem.Dependent\"]' override.Dependent.Weak='true' override.Dependent.Description='Note: The use of this element is deprecated. The Configuration that is defined for the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ConfigurationForSystem extends CIM_HostedDependency {
} // CIM_ConfigurationForSystem
