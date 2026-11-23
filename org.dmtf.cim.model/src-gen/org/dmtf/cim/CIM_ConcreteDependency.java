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
 * A representation of the model object '<em><b>CIM Concrete Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ConcreteDependency is a generic association used to establish dependency relationships between ManagedElements. It is defined as a concrete subclass of the abstract CIM_Dependency class, to be used in place of many specific subclasses of Dependency that add no semantics, that is subclasses that do not clarify the type of dependency, update cardinalities, or add or remove qualifiers. Note that when you define additional semantics for Dependency, this class must not be subclassed. Specific semantics continue to be defined as subclasses of the abstract CIM_Dependency. ConcreteDependency is limited in its use as a concrete form of a general dependency. 
 * 
 * It was deemed more prudent to create this concrete subclass than to change Dependency from an abstract to a concrete class. Dependency already had multiple abstract subclasses in the CIM Schema, and wider industry usage and impact could not be anticipated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Description='Antecedent represents the independent object in this association.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Description='Dependent represents the object that is dependent on the Antecedent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteDependency extends CIM_Dependency {
} // CIM_ConcreteDependency
