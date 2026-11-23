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
 * A representation of the model object '<em><b>CIM Managed Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a CredentialManagementService with the Credential it manages.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ManagedCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.16.0' UMLPackagePath='CIM::User::Credential' override.Antecedent='CIM_CredentialManagementService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Max='1' override.Antecedent.Description='The credential management service.' override.Dependent='CIM_Credential REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Description='The managed credential.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ManagedCredential extends CIM_Dependency {
} // CIM_ManagedCredential
