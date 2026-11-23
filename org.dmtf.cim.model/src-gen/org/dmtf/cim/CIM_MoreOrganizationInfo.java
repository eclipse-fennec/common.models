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
 * A representation of the model object '<em><b>CIM More Organization Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MoreOrganizationInfo is an association used to extend the information in a CIM_Organization class instance.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MoreOrganizationInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::User::Org' override.Antecedent='CIM_Organization REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The Organization which has more information.' override.Dependent='CIM_OtherOrganizationInformation REF' override.Dependent.Max='1' override.Dependent.Description='Additional data concerning the Organization.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MoreOrganizationInfo extends CIM_Dependency {
} // CIM_MoreOrganizationInfo
