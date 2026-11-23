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
 * A representation of the model object '<em><b>CIM Spared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Spared association indicates an element that is acting as a replacement for another element. If the Dependent references a Collection, this indicates that 'spared' element is a member of that collection and the actual mapping between the spare and the spared is un-important.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Spared()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Redundancy' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Description='A ManagedElement that has replaced/spared another the reference Dependent element.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Description='The Element or Elements (in the case of a collection) that have been replaced/spared.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Spared extends CIM_Dependency {
} // CIM_Spared
