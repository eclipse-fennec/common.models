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
 * A representation of the model object '<em><b>CIM Referenced Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A profile that is referenced by another RegisteredProfile.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReferencedProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.37.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_RegisteredProfile REF' override.Antecedent.Description='The RegisteredProfile that is referenced by the Dependent Profile.' override.Dependent='CIM_RegisteredProfile REF' override.Dependent.Description='A RegisteredProfile that references other profiles.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ReferencedProfile extends CIM_ReferencedSpecification {
} // CIM_ReferencedProfile
