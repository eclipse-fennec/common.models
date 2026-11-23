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
 * A representation of the model object '<em><b>CIM Users Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates UsersAccess with the Accounts with which they're able to interact. This association is deprecated in lieu of AccountIdentity, which defines similar semantics. This was done since the UsersAccess reference in UsersAccount has been deprecated and replaced by the more specific semantics of CIM_Identity.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccount()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AccountIdentity\"]' Version='2.8.0' UMLPackagePath='CIM::User::Account' override.Antecedent='CIM_Account REF' override.Antecedent.Deprecated='[\"CIM_AccountIdentity.SystemElement\"]' override.Antecedent.Description='The user\'s Account.' override.Dependent='CIM_UsersAccess REF' override.Dependent.Deprecated='[\"CIM_AccountIdentity.SameElement\"]' override.Dependent.Description='The User as identified by their UsersAccess instance.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UsersAccount extends CIM_Dependency {
} // CIM_UsersAccount
