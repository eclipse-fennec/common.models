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
 * A representation of the model object '<em><b>CIM Storage Settings Associated To Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association define StorageSettings that reflect the capabilities of the associated StorageCapabilities. The associated StorageSetting may not define the operational characteristics (through settings properties) of any storage element. Certain StorageSetting instances can be defined as "Fixed = Not Changeable" by using the "ChangeableType" attribute. "Fixed" settings have this special association. This association should be defined between "Fixed - Not Changeable" instances of StorageSetting with the StorageCapabilities instances that are associated with the StoragePools which support the storage characteristics described by the StorageSetting instance. 
 * Fixed settings may be associated to many StorageCapabilities.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageSettingsAssociatedToCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.11.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_StorageCapabilities REF' override.Antecedent.Description='The StorageCapabilities.' override.Dependent='CIM_StorageSetting REF' override.Dependent.Description='The fixed and predefined StorageSetting.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_StorageSettingsAssociatedToCapabilities extends CIM_SettingAssociatedToCapabilities {
} // CIM_StorageSettingsAssociatedToCapabilities
