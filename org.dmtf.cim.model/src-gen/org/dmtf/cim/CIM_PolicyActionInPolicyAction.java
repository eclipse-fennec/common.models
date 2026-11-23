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
 * A representation of the model object '<em><b>CIM Policy Action In Policy Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicyActionInPolicyAction is used to represent the compounding of policy actions into a higher-level policy action.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyActionInPolicyAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_CompoundPolicyAction REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This property represents the CompoundPolicyAction that contains one or more PolicyActions.' override.PartComponent='CIM_PolicyAction REF' override.PartComponent.Description='This property holds the name of a PolicyAction contained by one or more CompoundPolicyActions.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyActionInPolicyAction extends CIM_PolicyActionStructure {
} // CIM_PolicyActionInPolicyAction
