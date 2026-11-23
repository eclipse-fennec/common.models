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
 * A representation of the model object '<em><b>CIM Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ServiceComponent aggregation models a set of subordinate Services that are aggregated together to form a higher-level service.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Core::Service' override.GroupComponent='CIM_Service REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The parent Service.' override.PartComponent='CIM_Service REF' override.PartComponent.Description='The component Service.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceComponent extends CIM_Component {
} // CIM_ServiceComponent
