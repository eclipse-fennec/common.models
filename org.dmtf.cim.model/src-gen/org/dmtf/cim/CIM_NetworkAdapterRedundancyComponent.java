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
 * A representation of the model object '<em><b>CIM Network Adapter Redundancy Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_NetworkAdapterRedundancyComponent class has been deprecated because a specific association is not needed. Instead use the CIM_ OrderedMemberOf Collection class. 
 * Deprecated description: CIM_NetworkAdapterRedundancyComponent indicates the role that a NetworkAdapter plays in an ExtraCapacityGroup, providing load balancing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapterRedundancyComponent#getScopeOfBalancing <em>Scope Of Balancing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkAdapterRedundancyComponent#getPrimaryAdapter <em>Primary Adapter</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapterRedundancyComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_OrderedMemberOfCollection\"]' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.GroupComponent='CIM_ExtraCapacityGroup REF' override.GroupComponent.Deprecated='[\"CIM_OrderedMemberOfCollection.Collection\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The RedundancyGroup that represents a set of load-balanced NetworkAdapters.' override.PartComponent='CIM_NetworkAdapter REF' override.PartComponent.Deprecated='[\"CIM_OrderedMemberOfCollection.Member\"]' override.PartComponent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The Network Adapters that belong to the RedundancyGroup.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkAdapterRedundancyComponent extends CIM_RedundancyComponent {
	/**
	 * Returns the value of the '<em><b>Scope Of Balancing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Indicates the scope of load balancing for the NetworkAdapters that is involved in the RedundancyGroup. Load balancing can be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope Of Balancing</em>' attribute.
	 * @see #setScopeOfBalancing(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapterRedundancyComponent_ScopeOfBalancing()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Load Balancing - Transmit Only\",\"Load Balancing - Receive Only\",\"Full Load Balancing\"]'"
	 * @generated
	 */
	Integer getScopeOfBalancing();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapterRedundancyComponent#getScopeOfBalancing <em>Scope Of Balancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Of Balancing</em>' attribute.
	 * @see #getScopeOfBalancing()
	 * @generated
	 */
	void setScopeOfBalancing(Integer value);

	/**
	 * Returns the value of the '<em><b>Primary Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A Boolean that indicates whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (value=2), or both (value=3). Values of "Unknown" and "Not Applicable" can also be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Adapter</em>' attribute.
	 * @see #setPrimaryAdapter(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkAdapterRedundancyComponent_PrimaryAdapter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_OrderedMemberOfCollection.AssignedSequence\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Original Primary\",\"Preferred Primary\",\"Both\",\"Not Applicable\"]'"
	 * @generated
	 */
	Integer getPrimaryAdapter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkAdapterRedundancyComponent#getPrimaryAdapter <em>Primary Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Adapter</em>' attribute.
	 * @see #getPrimaryAdapter()
	 * @generated
	 */
	void setPrimaryAdapter(Integer value);

} // CIM_NetworkAdapterRedundancyComponent
