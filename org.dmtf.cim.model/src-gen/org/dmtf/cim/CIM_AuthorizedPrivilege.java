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
 * A representation of the model object '<em><b>CIM Authorized Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Privilege is the base class for all types of activities which are granted or denied to a Role or an Identity. AuthorizedPrivilege is a subclass defining static renderings of authorization policy rules. The association of Roles and Identities to AuthorizedPrivilege is accomplished using the AuthorizedSubject relationship. The entities that are protected are defined using the AuthorizedTarget relationship. 
 * 
 * Note that this class and its AuthorizedSubject/Target associations provide a short-hand, static mechanism to represent authorization policies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedPrivilege()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::Privilege' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizedPrivilege extends CIM_Privilege {
} // CIM_AuthorizedPrivilege
