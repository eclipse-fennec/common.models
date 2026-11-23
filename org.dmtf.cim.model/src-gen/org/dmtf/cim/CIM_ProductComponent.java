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
 * A representation of the model object '<em><b>CIM Product Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ProductComponent association defines a containment and component relationship among Products. For example, a Product may come bundled with other Products. 
 * Note that this association duplicates ProductParentChild. The latter association is maintained for legacy reasons. This association, ProductComponent, is added for ease of query and modeling consistency. Using ProductComponent, an application can query for all Component relationships for a Product, versus querying the various Component relationships AND ProductParentChild.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteComponent\"]' Aggregation='true' Composition='true' Version='2.15.0' UMLPackagePath='CIM::Core::ProductFRU' override.GroupComponent='CIM_Product REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The Product which contains another Product as a component. The cardinality of this reference takes the default values (no minimum or maximum) since an instance of Product can describe either a general product type, or a specific item that is acquired. In the case of a specific item, a cardinality of Max(1) is indicated. However, when dealing with the general description/templating of a Product, then it may be a component of several others and a cardinality of Max(1) would be invalid.' override.GroupComponent.ModelCorrespondence='[\"PRS_ProductComponent.Antecedent\"]' override.PartComponent='CIM_Product REF' override.PartComponent.Description='The contained Product.' override.PartComponent.ModelCorrespondence='[\"PRS_ProductComponent.Dependent\"]' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ProductComponent extends CIM_Component {
} // CIM_ProductComponent
