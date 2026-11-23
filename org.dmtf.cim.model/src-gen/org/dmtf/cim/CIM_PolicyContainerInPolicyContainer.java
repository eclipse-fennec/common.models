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
 * A representation of the model object '<em><b>CIM Policy Container In Policy Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship that aggregates one or more lower-level ReusablePolicyContainer instances into a higher-level ReusablePolicyContainer.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyContainerInPolicyContainer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_ReusablePolicyContainer REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='A ReusablePolicyContainer that aggregates other ReusablePolicyContainers.' override.PartComponent='CIM_ReusablePolicyContainer REF' override.PartComponent.Description='A ReusablePolicyContainer aggregated by another ReusablePolicyContainer.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyContainerInPolicyContainer extends CIM_SystemComponent {
} // CIM_PolicyContainerInPolicyContainer
