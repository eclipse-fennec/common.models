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
 * A representation of the model object '<em><b>CIM System Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_SystemAdministrator is an association used to identify the UserEntity as a system administrator of a CIM_System.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemAdministrator()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::User::Org' override.Antecedent='CIM_System REF' override.Antecedent.Description='The administered system.' override.Dependent='CIM_UserEntity REF' override.Dependent.Description='The UserEntity that provides the admininstrative function for the associated system.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SystemAdministrator extends CIM_Dependency {
} // CIM_SystemAdministrator
