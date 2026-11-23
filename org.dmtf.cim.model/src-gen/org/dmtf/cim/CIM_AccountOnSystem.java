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
 * A representation of the model object '<em><b>CIM Account On System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A system (e.g., ApplicationSystem, ComputerSystem, AdminDomain) aggregates Accounts and scopes the uniqueness of the Account names (i.e., userids).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountOnSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::User::Account' override.GroupComponent='CIM_System REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The aggregating system also provides name scoping for the Account.' override.PartComponent='CIM_Account REF' override.PartComponent.Weak='true' override.PartComponent.Description='The subordinate Account.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_AccountOnSystem extends CIM_SystemComponent {
} // CIM_AccountOnSystem
