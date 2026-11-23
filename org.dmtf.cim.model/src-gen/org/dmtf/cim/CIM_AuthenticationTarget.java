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
 * A representation of the model object '<em><b>CIM Authentication Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthenticationTarget is an association used to apply authentication requirements for access to specific resources. For example, a shared secret may be sufficient for access to unclassified resources, but for confidential resources, a stronger authentication may be required. Since the AuthenticationRequirement class is deprecated in lieu of explicit policy rules, this association is similarly deprecated to its 'policy' equivalent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationTarget()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicySetAppliesToElement\"]' Version='2.8.0' UMLPackagePath='CIM::User::AuthenticationReqmt' override.Antecedent='CIM_AuthenticationRequirement REF' override.Antecedent.Deprecated='[\"CIM_PolicySetAppliesToElement.PolicySet\"]' override.Antecedent.Description='AuthenticationRequirement that applies to specific resources.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Deprecated='[\"CIM_PolicySetAppliesToElement.ManagedElement\"]' override.Dependent.Description='Target resources that may be in a Collection or an individual ManagedElement. These resources are protected by the AuthenticationRequirement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AuthenticationTarget extends CIM_Dependency {
} // CIM_AuthenticationTarget
