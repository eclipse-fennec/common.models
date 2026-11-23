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
 * A representation of the model object '<em><b>CIM Manages Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates the AccountManagement security service to the Accounts for which it is responsible.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ManagesAccount()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::User::Account' override.Antecedent='CIM_AccountManagementService REF' override.Antecedent.Description='The account management service.' override.Dependent='CIM_Account REF' override.Dependent.Description='An account managed by the service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ManagesAccount extends CIM_Dependency {
} // CIM_ManagesAccount
