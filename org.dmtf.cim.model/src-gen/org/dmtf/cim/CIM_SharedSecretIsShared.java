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
 * A representation of the model object '<em><b>CIM Shared Secret Is Shared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a SharedSecretService with the SecretKey it verifies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SharedSecretIsShared()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.16.0' UMLPackagePath='CIM::User::SharedSecret' override.Antecedent='CIM_SharedSecretService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The credential management service.' override.Dependent='CIM_SharedSecret REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Weak='true' override.Dependent.Description='The managed credential.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SharedSecretIsShared extends CIM_ManagedCredential {
} // CIM_SharedSecretIsShared
