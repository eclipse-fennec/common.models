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
 * A representation of the model object '<em><b>CIM Require Credentials From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_RequireCredentialsFrom is an association used to require that credentials are issued by particular CredentialManagement Services in order to authenticate a user. This association is deprecated in lieu of explicit declaration of the AuthenticationConditions in an AuthenticationRule. Instances of AuthenticationCondition describe the specific combinations of credentials (or alternative credentials) that are required to authenticate an Identity. This allows a more explicit and flexible description of authentication requirements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RequireCredentialsFrom()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AuthenticationCondition\",\"CIM_AuthenticationRule\"]' Version='2.8.0' UMLPackagePath='CIM::User::AuthenticationReqmt' override.Antecedent='CIM_CredentialManagementService REF' override.Antecedent.Deprecated='[\"CIM_AuthenticationCondition\"]' override.Antecedent.Description='CredentialManagementService from which credentials are accepted for the associated AuthenticationRequirement.' override.Dependent='CIM_AuthenticationRequirement REF' override.Dependent.Deprecated='[\"CIM_AuthenticationRule\"]' override.Dependent.Description='AuthenticationRequirement that limits acceptable credentials.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RequireCredentialsFrom extends CIM_Dependency {
} // CIM_RequireCredentialsFrom
