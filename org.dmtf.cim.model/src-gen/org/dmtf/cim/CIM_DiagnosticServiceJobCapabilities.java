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
 * A representation of the model object '<em><b>CIM Diagnostic Service Job Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_DiagnosticServiceJobCapabilities identifies the capabilities of a job created as a result of a DiagnosticService method.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceJobCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Processing' override.DefaultValuesSupported='boolean' override.DefaultValuesSupported.Description='This property indicates whether the implementation will supply default input values for an interactive diagnostic test when a client fails to respond. If the value is TRUE, CIM_JobSettingData.DefaultInputValues and CIM_JobSettingData.DefaultInputNames shall have values.\nThis property should be FALSE if CIM_DiagnosticTest.Characteristics does not contain 3 (Is Interactive).\nIf this property is TRUE, then CIM_JobSettingData.InteractiveTimeout and CIM_JobSettingData.ClientRetries should have values.' override.DefaultValuesSupported.ModelCorrespondence='[\"CIM_JobSettingData.DefaultInputValues\",\"CIM_JobSettingData.DefaultInputNames\",\"CIM_JobSettingData.InteractiveTimeout\",\"CIM_JobSettingData.ClientRetries\",\"CIM_DiagnosticTest.Characteristics\"]' override.SilentModeSupported='boolean' override.SilentModeSupported.Description='If an interactive test will support running in \"silent mode\", then this shall be set to TRUE. If the test\ncannot support \"silent mode\", then this shall be set to FALSE. If the test is not interactive, then this should be NULL or set to TRUE.' override.SilentModeSupported.ModelCorrespondence='[\"CIM_JobSettingData.RunInSilentMode\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticServiceJobCapabilities extends CIM_JobCapabilities {
} // CIM_DiagnosticServiceJobCapabilities
