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
 * A representation of the model object '<em><b>CIM Filtered BGP Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the Component aggregation, which is used to define the set of BGP Attributes that are used by a particular Routing Policy.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilteredBGPAttributes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.GroupComponent='CIM_RoutingPolicy REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The RoutingPolicy, which aggregates a set of BGP attributes.' override.PartComponent='CIM_BGPAttributes REF' override.PartComponent.Description='A BGP attribute, which is part-of the RoutingPolicy.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_FilteredBGPAttributes extends CIM_Component {
} // CIM_FilteredBGPAttributes
