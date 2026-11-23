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
 * A representation of the model object '<em><b>CIM Element As User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ElementAsUser is an association used to establish the 'ownership' of UsersAccess object instances. That is, the ManagedElement may have UsersAccess to systems and, therefore, be 'users' on those systems. UsersAccess instances must have an 'owning' ManagedElement. Typically, the ManagedElements will be limited to Collection, Person, Service and ServiceAccessPoint. Other non-human ManagedElements that might be thought of as having UsersAccess (e.g., a device or system) have services that have the UsersAccess. 
 * 
 * Since the UsersAccess class is deprecated in lieu of CIM_Identity, this association is also deprecated and replaced by one of similar semantics, AssignedIdentity. It should be noted that the new class is NOT defined as a Dependency relationship, since it was felt that the association was not truly a dependency of the element on its access.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementAsUser()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AssignedIdentity\"]' Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Deprecated='[\"CIM_AssignedIdentity.ManagedElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The ManagedElement that has UsersAccess.' override.Dependent='CIM_UsersAccess REF' override.Dependent.Deprecated='[\"CIM_AssignedIdentity.IdentityInfo\"]' override.Dependent.Description='The \'owned\' UsersAccess.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementAsUser extends CIM_Dependency {
} // CIM_ElementAsUser
