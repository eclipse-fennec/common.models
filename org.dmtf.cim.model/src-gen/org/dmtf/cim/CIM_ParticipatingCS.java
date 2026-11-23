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
 * A representation of the model object '<em><b>CIM Participating CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Cluster is composed of two or more ComputerSystems, operating together. A ComputerSystem may participate in multiple Clusters. 
 * 
 * When first establishing or bringing up a Cluster, only one ComputerSystem may be defined as participating in it. Therfore, the cardinality of the association for the ComputerSystem reference is Min (1). 
 * The use of this association is deprecated in lieu of using MemberOfCollection to RedundancySet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ParticipatingCS#getStateOfNode <em>State Of Node</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParticipatingCS#getRoleOfNode <em>Role Of Node</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ParticipatingCS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Version='2.54.1' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Deprecated='[\"CIM_MemberOfCollection.Member\"]' override.Antecedent.Min='1' override.Antecedent.Description='The ComputerSystem which participates in the Cluster.' override.Dependent='CIM_Cluster REF' override.Dependent.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.Dependent.Description='The Cluster.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ParticipatingCS extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>State Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Of Node</em>' attribute.
	 * @see #setStateOfNode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParticipatingCS_StateOfNode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ComputerSystem.EnabledState\",\"CIM_ComputerSystem.OperationalStatus\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Joining\",\"Paused\",\"Available\",\"Unavailable\",\"Degraded\"]'"
	 * @generated
	 */
	Integer getStateOfNode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParticipatingCS#getStateOfNode <em>State Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Of Node</em>' attribute.
	 * @see #getStateOfNode()
	 * @generated
	 */
	void setStateOfNode(Integer value);

	/**
	 * Returns the value of the '<em><b>Role Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Of Node</em>' attribute.
	 * @see #setRoleOfNode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParticipatingCS_RoleOfNode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ComputerSystem.Roles\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Peer\",\"Primary\",\"Secondary\",\"Standby\",\"Base Plex\",\"Enhanced Plex\"]'"
	 * @generated
	 */
	Integer getRoleOfNode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParticipatingCS#getRoleOfNode <em>Role Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Of Node</em>' attribute.
	 * @see #getRoleOfNode()
	 * @generated
	 */
	void setRoleOfNode(Integer value);

} // CIM_ParticipatingCS
