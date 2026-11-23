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
 * A representation of the model object '<em><b>CIM Users Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_UsersCredential is an association used to establish the credentials that may be used for a UsersAccess to a system or set of systems. 
 * 
 * Since the UsersAccess class is deprecated in lieu of CIM_Identity, this association is also deprecated and replaced by policy - where the AuthenticationCondition class describes the credentials that SHOULD be authenticated in order to establish the Identity.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UsersCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AuthenticationCondition\"]' Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' override.Antecedent='CIM_Credential REF' override.Antecedent.Deprecated='[\"CIM_AuthenticationCondition\"]' override.Antecedent.Description='The issued credential that may be used.' override.Dependent='CIM_UsersAccess REF' override.Dependent.Deprecated='[\"CIM_Identity\"]' override.Dependent.Description='The UsersAccess that has use of a credential.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UsersCredential extends CIM_Dependency {
} // CIM_UsersCredential
