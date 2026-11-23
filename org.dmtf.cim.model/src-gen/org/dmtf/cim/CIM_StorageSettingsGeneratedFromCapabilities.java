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
 * A representation of the model object '<em><b>CIM Storage Settings Generated From Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association define StorageSettings that reflect the capabilities of the associated StorageCapabilities. The associated StorageSetting may not define the operational characteristics (through settings properties) of any storage element. StorageSettingsGeneratedFromCapabilities is the association between instances of StorageCapabilities and those instances of StorageSetting that have been created from the StorageCapabilities instance using the StorageCapabilities "CreateSetting" method. These settings have a StorageSetting.ChangeableType of "Changeable - Transient" or "Changeable - Persistent" The settings associated by this class reflect the capabilities from which they are generated. These setting SHALL be associated with one StorageCapabilities. 
 * A generated setting can be deleted by the implementation at any time if it is a a StorageSetting of "Changed - Transient" ChangeableType. 
 * A client should not use this association to find transient Settings to subsequently modify and/or use because that would increase the likelihood of setting contention across clients. Instead the implementation uses this association to define transient settings, which can be located through any means, that have special temporal based life cycle. 
 * DefaultSetting is meaningless in this class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingsGeneratedFromCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_StorageCapabilities REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageCapabilities.' override.Dependent='CIM_StorageSetting REF' override.Dependent.Description='The temporary and client generated StorageSetting.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_StorageSettingsGeneratedFromCapabilities extends CIM_SettingAssociatedToCapabilities {
} // CIM_StorageSettingsGeneratedFromCapabilities
