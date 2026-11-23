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
 * A representation of the model object '<em><b>CIM Authenticate For Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthenticateForUse is an association used to provide an AuthenticationService with the AuthenticationRequirement it needs to do its job. This association is unnecessary and therefore deprecated, since it is implied that an Identity MUST be authenticated (its CurrentlyAuthenticatedBoolean set to TRUE) in order to have any Privileges.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticateForUse()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::User::AuthenticationReqmt' override.Antecedent='CIM_AuthenticationRequirement REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='AuthenticationRequirementfor use.' override.Dependent='CIM_AuthenticationService REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='AuthenticationServicethat uses the requirements.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AuthenticateForUse extends CIM_Dependency {
} // CIM_AuthenticateForUse
