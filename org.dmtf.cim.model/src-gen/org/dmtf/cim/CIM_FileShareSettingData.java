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
 * A representation of the model object '<em><b>CIM File Share Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileShareSettingData associates a FileShare to itsExportedFileShareSetting.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileShareSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::System::FileServices' override.ManagedElement='CIM_FileShare REF' override.ManagedElement.Key='true' override.ManagedElement.Description='ManagedElement represents the file share in this association.' override.SettingData='CIM_ExportedFileShareSetting REF' override.SettingData.Key='true' override.SettingData.Description='The SettingData object that is associated with the element.' keys='ManagedElement,SettingData'"
 * @generated
 */
@ProviderType
public interface CIM_FileShareSettingData extends CIM_ElementSettingData {
} // CIM_FileShareSettingData
