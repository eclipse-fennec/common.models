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
 * A representation of the model object '<em><b>CIM ASBGP Endpoints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation defines the different router interfaces that are running BGP in the AutonomousSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ASBGPEndpoints()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.GroupComponent='CIM_AutonomousSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The AutonomousSystem that aggregates the router interfaces that are running BGP.' override.PartComponent='CIM_BGPProtocolEndpoint REF' override.PartComponent.Description='The router interfaces that are contained in the AS.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ASBGPEndpoints extends CIM_SystemComponent {
} // CIM_ASBGPEndpoints
