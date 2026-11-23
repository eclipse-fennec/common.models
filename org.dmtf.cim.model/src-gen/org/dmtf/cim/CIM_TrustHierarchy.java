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
 * A representation of the model object '<em><b>CIM Trust Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_TrustHierarchy is an association between two CredentialManagementService instances that establishes the trust hierarchy between them.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TrustHierarchy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::User::SecurityServices' override.Antecedent='CIM_CredentialManagementService REF' override.Antecedent.Max='1' override.Antecedent.Description='The superior CredentialManagementService from which the dependent service gets its authority.' override.Dependent='CIM_CredentialManagementService REF' override.Dependent.Description='The subordinate CredentialManagementService.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_TrustHierarchy extends CIM_Dependency {
} // CIM_TrustHierarchy
