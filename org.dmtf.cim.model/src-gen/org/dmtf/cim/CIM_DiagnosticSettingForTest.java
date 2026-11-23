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
 * A representation of the model object '<em><b>CIM Diagnostic Setting For Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is no longer required and is being deprecated. Use ElementSetting (its parent) instead if the association is needed. 
 * This is an association class to relate test settings with diagnostic tests.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingForTest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSetting\"]' Version='2.9.0' UMLPackagePath='CIM::System::Diagnostics' override.Element='CIM_DiagnosticTest REF' override.Element.Deprecated='[\"CIM_ElementSetting.Element\"]' override.Element.Description='The Test that can use the Setting object.' override.Setting='CIM_DiagnosticSetting REF' override.Setting.Deprecated='[\"CIM_ElementSetting.Setting\"]' override.Setting.Description='The Setting that can be applied to the execution of the DiagnosticTest.' keys='Element,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSettingForTest extends CIM_ElementSetting {
} // CIM_DiagnosticSettingForTest
