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
 * A representation of the model object '<em><b>CIM Policy Action In Policy Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PolicyRule aggregates zero or more instances of the PolicyAction class, via the PolicyActionInPolicyRule association. A Rule that aggregates zero Actions is not valid--it may, however, be in the process of being entered into a PolicyRepository or being defined for a System. Alternately, the actions of the policy may be explicit in the definition of the PolicyRule. Note that a PolicyRule should have no effect until it is valid. 
 * 
 * The Actions associated with a PolicyRule may be given a required order, a recommended order, or no order at all. For Actions represented as separate objects, the PolicyActionInPolicyRule aggregation can be used to express an order. 
 * 
 * This aggregation does not indicate whether a specified action order is required, recommended, or of no significance; the property SequencedActions in the aggregating instance of PolicyRule provides this indication.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyActionInPolicyRule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_PolicyRule REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This property represents the PolicyRule that contains one or more PolicyActions.' override.PartComponent='CIM_PolicyAction REF' override.PartComponent.Description='This property holds the name of a PolicyAction contained by one or more PolicyRules.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyActionInPolicyRule extends CIM_PolicyActionStructure {
} // CIM_PolicyActionInPolicyRule
