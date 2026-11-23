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
 * A representation of the model object '<em><b>CIM Concrete Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ConcreteIdentity associates two elements that represent different aspects of the same underlying entity. It is defined as a concrete subclass of the abstract CIM_LogicalIdentity class, to be used in place of many specific subclasses of LogicalIdentity that add no semantics, that is, subclasses that do not clarify the type of identity, update cardinalities, or add or remove qualifiers. Note that when you define additional semantics for LogicalIdentity, this class should not be subclassed. Specific semantics continue to be defined as subclasses of the abstract CIM_LogicalIdentity. ConcreteIdentity is limited in its use as a concrete form of a general identity relationship. 
 * 
 * It was deemed more prudent to create this concrete subclass than to change LogicalIdentity from an abstract to a concrete class. LogicalIdentity already had multiple abstract subclasses in the CIM Schema, and wider industry usage and impact could not be anticipated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::CoreElements' override.SystemElement='CIM_ManagedElement REF' override.SystemElement.Description='One aspect of the ManagedElement. The use of \'System\' in the name does not limit the scope of the association. This name is an artifact of the original definition of the association.' override.SameElement='CIM_ManagedElement REF' override.SameElement.Description='Another aspect of the ManagedElement.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteIdentity extends CIM_LogicalIdentity {
} // CIM_ConcreteIdentity
