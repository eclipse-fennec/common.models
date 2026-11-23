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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from ComputerSystem that 'is made up of' two or more ComputerSystems which operate together as an atomic, functional whole to increase the performance, resources and/or RAS (Reliability, Availability and Serviceability) of the component ComputerSystems, related to some aspects of these ComputerSystems. 
 * The use of this class has been deprecated in lieu of using ComputerSystem and RedundancySet to represent the cluster. Members of the cluster are identified using MemberOfCollection to the RedundancySet. The RedundancySet is tied to its virtual system via LogicalIdentity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Cluster#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Cluster#getInterconnectAddress <em>Interconnect Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Cluster#getTypes <em>Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Cluster#getMaxNumberOfNodes <em>Max Number Of Nodes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Cluster#getClusterState <em>Cluster State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Cluster()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RedundancySet\",\"CIM_ComputerSystem\"]' Version='2.54.1' UMLPackagePath='CIM::System::SystemElements' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Cluster extends CIM_ComputerSystem {
	/**
	 * Returns the value of the '<em><b>Interconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interconnect is a free form string that describes the interconnection mechanism for the Cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect</em>' attribute.
	 * @see #setInterconnect(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Cluster_Interconnect()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getInterconnect();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Cluster#getInterconnect <em>Interconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect</em>' attribute.
	 * @see #getInterconnect()
	 * @generated
	 */
	void setInterconnect(String value);

	/**
	 * Returns the value of the '<em><b>Interconnect Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InterconnectAddress indicates the address of the Cluster System, which is dependent on the interconnection scheme. If no address is available or applicable, a null string should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect Address</em>' attribute.
	 * @see #setInterconnectAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Cluster_InterconnectAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_ServiceAccessPoint\"]'"
	 * @generated
	 */
	String getInterconnectAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Cluster#getInterconnectAddress <em>Interconnect Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Address</em>' attribute.
	 * @see #getInterconnectAddress()
	 * @generated
	 */
	void setInterconnectAddress(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cluster types. This specifies whether the cluster is for failover (value=2), performance (3), etc. The values which can be specified are not mutually exclusive. Thus, Types is an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Cluster_Types()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_RedundancySet.TypeOfSet\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Failover\",\"Performance\",\"Distributed OS\",\"Node Grouping\",\"SysPlex\"]'"
	 * @generated
	 */
	EList<Integer> getTypes();

	/**
	 * Returns the value of the '<em><b>Max Number Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum number of nodes that may participate in the Cluster. If unlimited, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Nodes</em>' attribute.
	 * @see #setMaxNumberOfNodes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Cluster_MaxNumberOfNodes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_RedundancySet.MaxNumberSupported\"]'"
	 * @generated
	 */
	Long getMaxNumberOfNodes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Cluster#getMaxNumberOfNodes <em>Max Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Nodes</em>' attribute.
	 * @see #getMaxNumberOfNodes()
	 * @generated
	 */
	void setMaxNumberOfNodes(Long value);

	/**
	 * Returns the value of the '<em><b>Cluster State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the state of the Cluster. The cluster can be defined to be on-line (value=2), off-line (3), in a degraded mode of operation (4) or unavailable (5).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cluster State</em>' attribute.
	 * @see #setClusterState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Cluster_ClusterState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ComputerSystem.EnabledState\",\"CIM_ComputerSystem.OperationalStatus\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"On-line\",\"Off-line\",\"Degraded\",\"Unavailable\"]'"
	 * @generated
	 */
	Integer getClusterState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Cluster#getClusterState <em>Cluster State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster State</em>' attribute.
	 * @see #getClusterState()
	 * @generated
	 */
	void setClusterState(Integer value);

} // CIM_Cluster
