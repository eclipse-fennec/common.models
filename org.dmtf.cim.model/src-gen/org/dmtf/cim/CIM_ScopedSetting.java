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
 * A representation of the model object '<em><b>CIM Scoped Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ScopedSetting defines a setting in the context of the ManagedElement in which it is located.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ScopedSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The scoping ManagedElement.' override.Dependent='CIM_ScopedSettingData REF' override.Dependent.Description='The setting that is defined for the ManagedElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ScopedSetting extends CIM_HostedDependency {
} // CIM_ScopedSetting
