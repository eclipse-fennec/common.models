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
 * A representation of the model object '<em><b>CIM Lists In Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the CIM_Component aggregation which is used to define a set of FilterLists that are aggregated by a particular RoutingPolicy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ListsInRoutingPolicy#getListSequence <em>List Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ListsInRoutingPolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.GroupComponent='CIM_RoutingPolicy REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The RoutingPolicy, which aggregates the set of FilterLists.' override.PartComponent='CIM_FilterList REF' override.PartComponent.Description='A FilterList, which is part-of the RoutingPolicy.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ListsInRoutingPolicy extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>List Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the FilterList relative to all other entries in the RoutingPolicy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Sequence</em>' attribute.
	 * @see #setListSequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListsInRoutingPolicy_ListSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getListSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListsInRoutingPolicy#getListSequence <em>List Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Sequence</em>' attribute.
	 * @see #getListSequence()
	 * @generated
	 */
	void setListSequence(Integer value);

} // CIM_ListsInRoutingPolicy
