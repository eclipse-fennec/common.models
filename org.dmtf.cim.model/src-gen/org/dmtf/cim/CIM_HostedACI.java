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
 * A representation of the model object '<em><b>CIM Hosted ACI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_HostedACI is an association used to provide the namespace scoping of AccessControlInformation. Since the referenced class, AccessControlInformation, is deprecated, this Weak association is similarly deprecated. Also, although Privileges/access control can be defined in the context of a System, this is not a mandatory association nor does it provide any additional semantics for the Privilege. Therefore, HostedACI is deprecated with no replacement association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedACI()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::User::AccessControl' override.Antecedent='CIM_System REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting system.' override.Dependent='CIM_AccessControlInformation REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Weak='true' override.Dependent.Description='The hosted AccessControlInformation.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedACI extends CIM_HostedDependency {
} // CIM_HostedACI
