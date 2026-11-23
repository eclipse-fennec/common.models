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
 * A representation of the model object '<em><b>CIM More Role Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MoreRoleInfo is an association used to extend the information in a CIM_Role class instance.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MoreRoleInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::User::Role' override.Antecedent='CIM_Role REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The Role which has more information.' override.Dependent='CIM_OtherRoleInformation REF' override.Dependent.Max='1' override.Dependent.Description='Additional data concerning the Role.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MoreRoleInfo extends CIM_Dependency {
} // CIM_MoreRoleInfo
