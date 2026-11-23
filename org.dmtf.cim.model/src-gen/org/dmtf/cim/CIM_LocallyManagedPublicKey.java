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
 * A representation of the model object '<em><b>CIM Locally Managed Public Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_LocallyManagedPublicKey association provides the relationship between a PublicKeyManagementService and an UnsignedPublicKey.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocallyManagedPublicKey()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.16.0' UMLPackagePath='CIM::User::PublicKey' override.Antecedent='CIM_PublicKeyManagementService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The PublicKeyManagementService that manages an unsigned public key.' override.Dependent='CIM_UnsignedPublicKey REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Weak='true' override.Dependent.Description='An unsigned public key.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LocallyManagedPublicKey extends CIM_ManagedCredential {
} // CIM_LocallyManagedPublicKey
