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
 * A representation of the model object '<em><b>CIM Sub Profile Requires Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subprofile requires another RegisteredProfile for context. This association mandates the scoping relationship between a subprofile and its scoping profile.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SubProfileRequiresProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ReferencedProfile\"]' Version='2.37.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_RegisteredProfile REF' override.Antecedent.Deprecated='[\"CIM_ReferencedProfile.Antecedent\"]' override.Antecedent.Min='1' override.Antecedent.Description='The RegisteredProfile that is referenced/required by the subprofile.' override.Dependent='CIM_RegisteredSubProfile REF' override.Dependent.Deprecated='[\"CIM_ReferencedProfile.Dependent\"]' override.Dependent.Description='A RegisteredSubProfile that requires a scoping profile, for context.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SubProfileRequiresProfile extends CIM_ReferencedProfile {
} // CIM_SubProfileRequiresProfile
