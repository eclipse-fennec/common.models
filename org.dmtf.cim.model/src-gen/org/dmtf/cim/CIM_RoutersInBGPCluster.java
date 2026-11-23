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
 * A representation of the model object '<em><b>CIM Routers In BGP Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation establishes the routers (ComputerSystems) in a BGPCluster. At least three routers are required to form a cluster - a reflector and two clients. The routers that form a cluster share common configuration information.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInBGPCluster()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Collection='CIM_BGPCluster REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The Cluster that aggregates the routers participating in it.' override.Member='CIM_ComputerSystem REF' override.Member.Min='3' override.Member.Description='The routers that form the Cluster.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_RoutersInBGPCluster extends CIM_CollectedMSEs {
} // CIM_RoutersInBGPCluster
