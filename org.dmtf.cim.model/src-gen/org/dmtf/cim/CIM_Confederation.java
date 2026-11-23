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
 * A representation of the model object '<em><b>CIM Confederation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BGP speakers in an AS are required to be fully meshed. This can lead to a huge number of TCP connections per router. One way to reduce the peering requirements is to use a confederation. A confederation effectively partitions one AS into a group of 'sub-ASs'. This enables all of the benefits of IBGP to be applied inside the confederation, while enabling EBGP to be run between each confederation. It also enables certain BGP attribute values to be preserved between confederations. However, to the outside world, the AS with its confederations appear to be a single AS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Confederation#getParentASNumber <em>Parent AS Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Confederation#getChildASNumber <em>Child AS Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Confederation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.GroupComponent='CIM_AutonomousSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The AutonomousSystem that contains the confederations.' override.PartComponent='CIM_AutonomousSystem REF' override.PartComponent.Description='The Confederation within the AutonomousSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_Confederation extends CIM_SystemComponent {
	/**
	 * Returns the value of the '<em><b>Parent AS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier of the AutonomousSystem that contains the confederations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent AS Number</em>' attribute.
	 * @see #setParentASNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Confederation_ParentASNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getParentASNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Confederation#getParentASNumber <em>Parent AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent AS Number</em>' attribute.
	 * @see #getParentASNumber()
	 * @generated
	 */
	void setParentASNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Child AS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier of the Confederation within the AutonomousSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child AS Number</em>' attribute.
	 * @see #setChildASNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Confederation_ChildASNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getChildASNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Confederation#getChildASNumber <em>Child AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child AS Number</em>' attribute.
	 * @see #getChildASNumber()
	 * @generated
	 */
	void setChildASNumber(Long value);

} // CIM_Confederation
