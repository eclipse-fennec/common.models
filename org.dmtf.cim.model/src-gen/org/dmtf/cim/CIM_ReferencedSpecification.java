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
 * A representation of the model object '<em><b>CIM Referenced Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates two instances of RegisteredSpecification where one of the represented specifications references the other.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReferencedSpecification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.37.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_RegisteredSpecification REF' override.Antecedent.Key='true' override.Antecedent.Description='The RegisteredSpecification that is referenced by the Dependent Registeredspecification.' override.Dependent='CIM_RegisteredSpecification REF' override.Dependent.Key='true' override.Dependent.Description='A RegisteredSpecification that references another specification.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ReferencedSpecification extends CIM_Dependency {
} // CIM_ReferencedSpecification
