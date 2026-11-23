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
 * A representation of the model object '<em><b>CIM Element Storage Protection Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ElementStorageProtectionSettingData represents the association between a storage element (CIM_StorageVolume or CIM_LogicalDisk to be protected and the applicable protection setting.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementStorageProtectionSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::Settings' override.SettingData='CIM_StorageProtectionSetting REF' override.SettingData.Key='true' override.SettingData.Description='The protection setting and status of the storage element' keys='ManagedElement,SettingData'"
 * @generated
 */
@ProviderType
public interface CIM_ElementStorageProtectionSettingData extends CIM_ElementSettingData {
} // CIM_ElementStorageProtectionSettingData
