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
 * A representation of the model object '<em><b>CIM Account Maps To Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship may be used to associate an Account used by an AuthenticationService to an Account used for Authorization. For instance, this mapping occurs naturally in the UNIX /etc/passwd file, where the AuthenticationService Account ('root') is mapped to the AuthorizationService Account ('0'). The two are separate accounts, as evidenced by the ability to have another AuthenticationService Account which ALSO maps to the AuthorizationService Account ('0') without ambiguity. This association may be used for other account mappings as well such as for coordinating single signon for multiple accounts for the same user.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountMapsToAccount()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::User::Account' override.Antecedent='CIM_Account REF' override.Antecedent.Description='An Account.' override.Dependent='CIM_Account REF' override.Dependent.Description='A related Account.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AccountMapsToAccount extends CIM_Dependency {
} // CIM_AccountMapsToAccount
