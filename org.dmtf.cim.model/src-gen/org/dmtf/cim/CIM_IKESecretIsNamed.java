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
 * A representation of the model object '<em><b>CIM IKE Secret Is Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IKESecretIsNamed association provides the relationship between a SharedSecretService and a NamedSharedIKESecret.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IKESecretIsNamed()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.6.0' UMLPackagePath='CIM::User::SharedSecret' override.Antecedent='CIM_SharedSecretService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The SharedSecretService that manages a NamedSharedIKESecret.' override.Dependent='CIM_NamedSharedIKESecret REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Weak='true' override.Dependent.Description='The managed NamedSharedIKESecret.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IKESecretIsNamed extends CIM_ManagedCredential {
} // CIM_IKESecretIsNamed
