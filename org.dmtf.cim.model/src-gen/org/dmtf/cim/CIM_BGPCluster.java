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
 * A representation of the model object '<em><b>CIM BGP Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BGP speakers in an AS are required to be fully meshed. This can lead to a huge number of TCP connections per router. One way to reduce the peering requirements is to use a route reflector. This is based on specifying one or more routers to act as focal points for IBGP sessions. 
 * 
 * The route reflector as a whole is called a cluster. It is logically divided into three types of routers: reflectors, clients of the route reflector(s), and non-clients of the route reflector. There can be more than one route reflector in a cluster, and there can be more than one cluster in an AS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPCluster#getClusterID <em>Cluster ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPCluster()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Network::BGP' keys='ClusterID'"
 * @generated
 */
@ProviderType
public interface CIM_BGPCluster extends CIM_CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Cluster ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a cluster has more than one route reflector, all of the route reflectors in the cluster need to be configured with a 4-byte cluster ID. This allows route reflectors to recognize updates from other route reflectors in the same cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cluster ID</em>' attribute.
	 * @see #setClusterID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPCluster_ClusterID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Key='true'"
	 * @generated
	 */
	Long getClusterID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPCluster#getClusterID <em>Cluster ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster ID</em>' attribute.
	 * @see #getClusterID()
	 * @generated
	 */
	void setClusterID(Long value);

} // CIM_BGPCluster
