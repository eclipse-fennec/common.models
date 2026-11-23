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
 * A representation of the model object '<em><b>CIM Policy Repository In Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The term 'PolicyRepository' has been confusing to both developers and users of the model. The replacement class name describes model element properly and is less likely to be confused with a data repository. ContainedDomain is a general purpose mechanism for expressing domain hierarchy. 
 * 
 * A relationship that aggregates one or more lower-level PolicyRepositories into a higher-level Repository.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRepositoryInPolicyRepository()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicyContainerInPolicyContainer\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_PolicyRepository REF' override.GroupComponent.Deprecated='[\"CIM_PolicyContainerInPolicyContainer.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='A PolicyRepository that aggregates other Repositories.' override.PartComponent='CIM_PolicyRepository REF' override.PartComponent.Deprecated='[\"CIM_PolicyContainerInPolicyContainer.PartComponent\"]' override.PartComponent.Description='A PolicyRepository aggregated by another Repository.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRepositoryInPolicyRepository extends CIM_SystemComponent {
} // CIM_PolicyRepositoryInPolicyRepository
