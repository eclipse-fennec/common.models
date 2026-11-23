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
 * A representation of the model object '<em><b>CIM Diagnostic Test Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated to promote its usage to the DiagnosticService level. 
 * This is an association class relating DiagnosticTest to the SoftwareElements that provide this test. SoftwareElement describes vendor/version information and other deployment data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticTestSoftware()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSoftwareIdentity\"]' Version='2.8.0' UMLPackagePath='CIM::Application::SystemSoftware' override.Antecedent='CIM_SoftwareElement REF' override.Antecedent.Deprecated='[\"CIM_ElementSoftwareIdentity.Antecedent\"]' override.Antecedent.Description='This reference is deprecated and replaced (in ServiceSoftwareIdentity) with a reference to the SoftwareIdentity class, which has been determined to be a better choice for diagnostics services. It defines vendor/version and other information about the software that runs as the DiagnosticTest.' override.Dependent='CIM_DiagnosticTest REF' override.Dependent.Deprecated='[\"CIM_ElementSoftwareIdentity.Dependent\"]' override.Dependent.Description='The DiagnosticTest whose software is described.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticTestSoftware extends CIM_Dependency {
} // CIM_DiagnosticTestSoftware
