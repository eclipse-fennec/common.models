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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM BGP Clusters In AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation establishes 'whole-part' relationships between an AutonomousSystem and the BGPClusters that it contains.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPClustersInAS#getGroupAS <em>Group AS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPClustersInAS#getPartAS <em>Part AS</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPClustersInAS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='GroupAS,PartAS'"
 * @generated
 */
@ProviderType
public interface CIM_BGPClustersInAS extends EObject {
	/**
	 * Returns the value of the '<em><b>Group AS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AutonomousSystem that aggregates the Clusters belonging to it and administers them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group AS</em>' reference.
	 * @see #setGroupAS(CIM_AutonomousSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPClustersInAS_GroupAS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AutonomousSystem REF' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_AutonomousSystem getGroupAS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPClustersInAS#getGroupAS <em>Group AS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group AS</em>' reference.
	 * @see #getGroupAS()
	 * @generated
	 */
	void setGroupAS(CIM_AutonomousSystem value);

	/**
	 * Returns the value of the '<em><b>Part AS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Clusters that are contained in the AS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part AS</em>' reference.
	 * @see #setPartAS(CIM_BGPCluster)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPClustersInAS_PartAS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BGPCluster REF' Key='true'"
	 * @generated
	 */
	CIM_BGPCluster getPartAS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPClustersInAS#getPartAS <em>Part AS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part AS</em>' reference.
	 * @see #getPartAS()
	 * @generated
	 */
	void setPartAS(CIM_BGPCluster value);

} // CIM_BGPClustersInAS
