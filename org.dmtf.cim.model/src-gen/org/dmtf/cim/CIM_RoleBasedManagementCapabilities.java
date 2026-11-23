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
 * A representation of the model object '<em><b>CIM Role Based Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass that extends the capabilities of the CIM_RoleBasedAuthorizationService.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoleBasedManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::User::Privilege' override.SupportedMethods='uint16[]' override.SupportedMethods.Description='The enumeration values \"ChangeAccess\", \"ShowAccess\", \"AssignAccess\", \"RevokeAccess\", \"CreateRole\", \"ModifyRole\", \"AssignRoles\", \"ShowRoles\", and \"DeleteRole\" corresponds to support for the like-named method of the RoleBasedAuthorizationService. \nThe value \"ModifyPrivilege\" corresponds to support for directly modifying an instance of CIM_Privilege using an intrinsic operation.' override.SupportedMethods.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"32768..65535\"]' override.SupportedMethods.Values='[\"ChangeAccess\",\"ShowAccess\",\"AssignAccess\",\"RevokeAccess\",\"CreateRole\",\"ModifyRole\",\"AssignRoles\",\"ShowRoles\",\"ModifyPrivilege\",\"DeleteRole\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RoleBasedManagementCapabilities extends CIM_PrivilegeManagementCapabilities {
} // CIM_RoleBasedManagementCapabilities
