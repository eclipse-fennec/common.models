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
 * A representation of the model object '<em><b>CIM Concrete Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ConcreteComponent is a generic association used to establish 'part of' relationships between ManagedElements. It is defined as a concrete subclass of the abstract CIM_Component class, to be used in place of many specific subclasses of Component that add no semantics, that is subclasses that do not clarify the type of composition, update cardinalities, or add or remove qualifiers. Note that when you define additional semantics for Component, this class must not be subclassed. Specific semantics continue to be defined as subclasses of the abstract CIM_Component. ConcreteComponent is limited in its use as a concrete form of a general composition. 
 * 
 * It was deemed more prudent to create this concrete subclass than to change Component from an abstract to a concrete class. Industry usage and impact could not be anticipated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' override.GroupComponent='CIM_ManagedElement REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The parent element in the association.' override.PartComponent='CIM_ManagedElement REF' override.PartComponent.Description='The child element in the association.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteComponent extends CIM_Component {
} // CIM_ConcreteComponent
