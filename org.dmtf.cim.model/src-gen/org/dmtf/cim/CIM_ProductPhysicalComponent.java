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
 * A representation of the model object '<em><b>CIM Product Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that the referenced PhysicalElement is acquired as part of a Product. This class is maintained for compatibility with existing implementations, but may be deprecated in favor of ProductElementComponent in the future.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductPhysicalComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.45.0' UMLPackagePath='CIM::Core::ProductFRU' override.PartComponent='CIM_PhysicalElement REF' override.PartComponent.Description='The PhysicalElement which is a part of the Product.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProductPhysicalComponent extends CIM_ProductElementComponent {
} // CIM_ProductPhysicalComponent
