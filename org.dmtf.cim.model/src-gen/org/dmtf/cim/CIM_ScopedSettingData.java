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
 * A representation of the model object '<em><b>CIM Scoped Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ScopedSettingData class represents the general concept of SettingData, which is scoped or contained by a ManagedElement (that is, settings that are specifically defined for a system, device, and so on). ScopedSettingData is tied to a ManagedElement using the ScopedSetting association. Note that the cardinality of the ManagedElement reference is Min(1), Max(1). This cardinality mandates the instantiation of the ScopedSetting association for the referenced instance of ScopedSettingData. ScopedSetting describes the existence requirements and context for the referenced instance of ManagedElement. Specifically, the ManagedElement must exist and it provides the context for the ScopedSettingData.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ScopedSettingData()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ScopedSettingData extends CIM_SettingData {
} // CIM_ScopedSettingData
