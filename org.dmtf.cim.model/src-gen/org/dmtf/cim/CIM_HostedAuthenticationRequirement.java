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
 * A representation of the model object '<em><b>CIM Hosted Authentication Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_HostedAuthenticationRequirement is an association used to provide the namespace scoping of AuthenticationRequirement. The hosted requirements may or may not apply to resources on the hosting system. Since the AuthenticationRequirement class is deprecated in lieu of explicit policy rules, this class is similarly deprecated to its 'policy' equivalent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedAuthenticationRequirement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicyRuleInSystem\"]' Version='2.8.0' UMLPackagePath='CIM::User::AuthenticationReqmt' override.Antecedent='CIM_System REF' override.Antecedent.Deprecated='[\"CIM_PolicyRuleInSystem.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting system.' override.Dependent='CIM_AuthenticationRequirement REF' override.Dependent.Deprecated='[\"CIM_PolicyRuleInSystem.Dependent\"]' override.Dependent.Weak='true' override.Dependent.Description='The hosted AuthenticationRequirement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedAuthenticationRequirement extends CIM_HostedDependency {
} // CIM_HostedAuthenticationRequirement
